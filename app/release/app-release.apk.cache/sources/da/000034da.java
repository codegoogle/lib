package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.wo1;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.d  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1272d {
    private static final C1272d a = new C1272d();
    private static final Object b = new Object();
    public String e;
    public String f;
    private Boolean g;
    private Boolean h;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final ConcurrentHashMap<String, AbstractAdapter> c = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, AdapterBaseWrapper> d = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, List<String>> i = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<IronSource.AD_UNIT, JSONObject> j = new ConcurrentHashMap<>();

    /* renamed from: com.ironsource.mediationsdk.d$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            IronSource.AD_UNIT.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private C1272d() {
    }

    public static C1272d a() {
        return a;
    }

    private AbstractAdapter b(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.ironsource.adapters." + str2.toLowerCase(Locale.ENGLISH) + CryptoConstants.ALIAS_SEPARATOR + str2 + "Adapter");
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e) {
            String str3 = "Error while loading adapter - exception = " + e.getLocalizedMessage();
            d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            g(str3);
            return null;
        }
    }

    private AdapterBaseInterface c(String str, String str2, NetworkSettings networkSettings) {
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        String u = wo1.u(networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters", CryptoConstants.ALIAS_SEPARATOR, str2);
        try {
            BaseAdapter baseAdapter = (BaseAdapter) Class.forName(u).newInstance();
            IronLog.INTERNAL.info(u + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            Boolean bool = this.h;
            if (bool != null) {
                try {
                    baseAdapter.setAdapterDebug(bool.booleanValue());
                } catch (Exception e) {
                    String str3 = "error while setting adapterDebug of " + baseAdapter.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                    d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
                    j(str3);
                    e.printStackTrace();
                }
            }
            this.d.put(str, new AdapterBaseWrapper(baseAdapter, networkSettings));
            return baseAdapter;
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String s = wo1.s("failed to load ", u);
                IronLog.INTERNAL.error(s);
                d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, s);
            }
            return null;
        }
    }

    private static void d(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i, jSONObject));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void e(AbstractAdapter abstractAdapter) {
        try {
            Boolean bool = this.g;
            if (bool != null) {
                abstractAdapter.setConsent(bool.booleanValue());
            }
        } catch (Throwable th) {
            String str = "error while setting consent of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
            d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            j(str);
            th.printStackTrace();
        }
    }

    private void f(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, "APSData is empty");
            g("APSData is empty");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            if (!this.c.isEmpty()) {
                for (AbstractAdapter abstractAdapter : this.c.values()) {
                    if (abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH).equals("aps") && (abstractAdapter instanceof SetAPSInterface)) {
                        ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                }
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.d.values()) {
                AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterAPSDataInterface)) {
                    ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(ad_unit, jSONObject2);
                    return;
                }
            }
            synchronized (b) {
                this.j.put(ad_unit, jSONObject2);
            }
        } catch (Exception e) {
            String str = "error while setting APSData: " + e.getLocalizedMessage();
            d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str);
            g(str);
            e.printStackTrace();
        }
    }

    private static void g(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 3);
    }

    private static String h(NetworkSettings networkSettings) {
        return networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
    }

    private void i(AbstractAdapter abstractAdapter) {
        Boolean bool = this.h;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                j(str);
                th.printStackTrace();
            }
        }
    }

    private static void j(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 0);
    }

    private BaseAdAdapter<?, ?> k(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("missing package definition for " + networkSettings.getProviderTypeForReflection());
            return null;
        }
        String u = wo1.u(networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters", CryptoConstants.ALIAS_SEPARATOR, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection());
        try {
            return (BaseAdAdapter) Class.forName(u).getConstructor(NetworkSettings.class).newInstance(networkSettings);
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String s = wo1.s("failed to load ", u);
                IronLog.INTERNAL.error(s);
                d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, s);
            }
            return null;
        }
    }

    private void l(AbstractAdapter abstractAdapter) {
        for (String str : this.i.keySet()) {
            try {
                List<String> list = this.i.get(str);
                IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
                if (list != null) {
                    abstractAdapter.setMetaData(str, list);
                }
            } catch (Throwable th) {
                String str2 = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                j(str2);
                th.printStackTrace();
            }
        }
    }

    private void m(AbstractAdapter abstractAdapter) {
        if (!abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH).equals("aps") || this.j.size() == 0) {
            return;
        }
        for (IronSource.AD_UNIT ad_unit : this.j.keySet()) {
            try {
                JSONObject jSONObject = this.j.get(ad_unit);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                    ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject);
                }
            } catch (Exception e) {
                String str = "error while setting aps data: " + e.getLocalizedMessage();
                d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str);
                j(str);
                e.printStackTrace();
            }
        }
        this.j.clear();
    }

    public final AbstractAdapter a(NetworkSettings networkSettings) {
        String h = h(networkSettings);
        return networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) ? this.c.get(h) : b(h, networkSettings.getProviderTypeForReflection());
    }

    public final AbstractAdapter a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z, boolean z2) {
        String str;
        String h = h(networkSettings);
        String providerTypeForReflection = z ? IronSourceConstants.IRONSOURCE_CONFIG_NAME : networkSettings.getProviderTypeForReflection();
        synchronized (b) {
            if (!z2) {
                if (this.c.containsKey(h)) {
                    return this.c.get(h);
                }
            }
            AbstractAdapter b2 = b(h, providerTypeForReflection);
            if (b2 == null) {
                g(h + " adapter was not loaded");
                return null;
            }
            try {
                str = b2.getCoreSDKVersion();
            } catch (Exception e) {
                String str2 = "error while retrieving coreSDKVersion " + b2.getProviderName() + ": " + e.getLocalizedMessage();
                d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
                str = "Unknown";
            }
            j(h + " was allocated (adapter version: " + b2.getVersion() + ", sdk version: " + str + ")");
            b2.setLogListener(IronSourceLoggerManager.getLogger());
            l(b2);
            m(b2);
            e(b2);
            i(b2);
            if ((providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) && this.k.compareAndSet(false, true)) {
                j("SDK5 earlyInit  <" + providerTypeForReflection + ">");
                try {
                    b2.earlyInit(this.e, this.f, jSONObject);
                } catch (Exception e2) {
                    String str3 = "error while calling early init for " + b2.getProviderName() + ": " + e2.getLocalizedMessage();
                    d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
                    IronLog.INTERNAL.error(str3);
                }
            }
            if (!z2) {
                this.c.put(h, b2);
            }
            return b2;
        }
    }

    public final AdapterBaseInterface a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        String h = h(networkSettings);
        if (this.d.containsKey(h)) {
            AdapterBaseInterface adapterBaseInterface = this.d.get(h).getAdapterBaseInterface();
            if (adapterBaseInterface instanceof R) {
                ((R) adapterBaseInterface).d = ad_unit;
            }
            return adapterBaseInterface;
        }
        AdapterBaseInterface c = c(h, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(null) : networkSettings.getProviderTypeForReflection(), networkSettings);
        if (c != null || networkSettings.isCustomNetwork()) {
            this.d.put(h, new AdapterBaseWrapper(c, networkSettings));
            return c;
        }
        int i = a.a[ad_unit.ordinal()];
        AbstractAdapter a2 = a(networkSettings, i != 1 ? i != 2 ? i != 3 ? null : networkSettings.getBannerSettings() : networkSettings.getInterstitialSettings() : networkSettings.getRewardedVideoSettings(), false, true);
        if (a2 != null) {
            R r = new R(a2, networkSettings, ad_unit);
            this.d.put(h, new AdapterBaseWrapper(r, networkSettings));
            return r;
        }
        String str = "error creating network adapter " + networkSettings.getProviderName();
        d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    public final void a(String str, List<String> list) {
        synchronized (b) {
            this.i.put(str, list);
            if (!this.c.isEmpty()) {
                IronSourceUtils.sendAutomationLog("setMetaData key = " + str + ", values = " + list);
                for (AbstractAdapter abstractAdapter : this.c.values()) {
                    abstractAdapter.setMetaData(str, list);
                }
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.d.values()) {
                AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                    try {
                        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
                    } catch (Exception e) {
                        String str2 = "error while setting metadata of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                        d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                        j(str2);
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public final void a(@NotNull String str, @NotNull JSONObject jSONObject) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Calling setNetworkData on an empty network";
        } else if (jSONObject == null || jSONObject.length() == 0) {
            str2 = "Calling setNetworkData with empty networkData";
        } else if (str.toLowerCase(Locale.ENGLISH).equals("aps")) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Locale locale = Locale.ENGLISH;
                String lowerCase = next.toLowerCase(locale);
                IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
                if (lowerCase.equals(ad_unit.toString())) {
                    f(ad_unit, jSONObject.optJSONObject(next));
                } else {
                    String lowerCase2 = next.toLowerCase(locale);
                    IronSource.AD_UNIT ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
                    if (lowerCase2.equals(ad_unit2.toString())) {
                        f(ad_unit2, jSONObject.optJSONObject(next));
                    }
                }
            }
            return;
        } else {
            str2 = wo1.s("Calling setNetworkData on an unsupported network: ", str);
        }
        d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str2);
        g(str2);
    }

    public final void a(boolean z) {
        synchronized (b) {
            this.g = Boolean.valueOf(z);
            for (AbstractAdapter abstractAdapter : this.c.values()) {
                e(abstractAdapter);
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.d.values()) {
                AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterConsentInterface)) {
                    try {
                        ((AdapterConsentInterface) adapterBaseInterface).setConsent(z);
                    } catch (Exception e) {
                        String str = "error while setting consent of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                        d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                        j(str);
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public final BaseAdAdapter<?, ?> b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> k = k(networkSettings, ad_unit);
        if (k != null || networkSettings.isCustomNetwork()) {
            return k;
        }
        AbstractAdapter a2 = a(networkSettings);
        if (a2 == null || (ad_unit != IronSource.AD_UNIT.INTERSTITIAL && ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO)) {
            String str = "error creating ad adapter " + networkSettings.getProviderName();
            d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            IronLog.INTERNAL.error(str);
            return null;
        }
        return new R(a2, networkSettings, ad_unit);
    }

    public final void b(boolean z) {
        synchronized (b) {
            this.h = Boolean.valueOf(z);
            for (AbstractAdapter abstractAdapter : this.c.values()) {
                i(abstractAdapter);
            }
        }
    }
}