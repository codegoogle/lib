package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.Q;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.l;
import com.p7700g.p99005.he3;
import com.p7700g.p99005.ie3;
import com.p7700g.p99005.je3;
import com.p7700g.p99005.ke3;
import com.p7700g.p99005.le3;
import com.p7700g.p99005.se3;
import com.p7700g.p99005.ue3;
import com.p7700g.p99005.ve3;
import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class L implements com.ironsource.mediationsdk.utils.i {
    private static boolean a = false;
    public Boolean A;
    private Set<IronSource.AD_UNIT> B;
    private Set<IronSource.AD_UNIT> C;
    private boolean D;
    public IronSourceSegment E;
    private final String F;
    public int G;
    public boolean H;
    public boolean I;
    private boolean J;
    public boolean K;
    public boolean L;
    private boolean M;
    private ConcurrentHashMap<String, ISDemandOnlyBannerLayout> N;
    private Boolean O;
    private IronSourceBannerLayout P;
    private String Q;
    public Boolean R;
    public D S;
    public ke3 T;
    public T U;
    public com.ironsource.mediationsdk.adunit.c.g V;
    public com.ironsource.mediationsdk.adunit.c.h W;
    private InitializationListener X;
    private AtomicBoolean Y;
    public boolean Z;
    public boolean a0;
    public final String b;
    public boolean b0;
    private final String c;
    private boolean c0;
    private final String d;
    public boolean d0;
    private AbstractAdapter e;
    public boolean e0;
    public se3 f;
    public boolean f0;
    public he3 g;
    public boolean g0;
    public je3 h;
    public int h0;
    public C1282p i;
    private CopyOnWriteArraySet<String> i0;
    public String j;
    private CopyOnWriteArraySet<String> j0;
    public String k;
    private CopyOnWriteArraySet<String> k0;
    public IronSourceLoggerManager l;
    public ue3 l0;
    public String m;
    private ve3 m0;
    public Map<String, String> n;
    public com.ironsource.mediationsdk.utils.k n0;
    public String o;
    public com.ironsource.mediationsdk.impressionData.a o0;
    public String p;
    private com.ironsource.sdk.a.e p0;
    public com.ironsource.mediationsdk.sdk.i q;
    private am q0;
    public com.ironsource.mediationsdk.logger.b r;
    private AtomicBoolean s;
    private final Object t;
    public com.ironsource.mediationsdk.utils.l u;
    public String v;
    private AtomicBoolean w;
    private boolean x;
    private List<IronSource.AD_UNIT> y;
    public Context z;

    /* loaded from: classes3.dex */
    public interface a {
        void a(String str);
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[k.a.a().length];
            b = iArr;
            try {
                int i = k.a.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = b;
                int i2 = k.a.b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = b;
                int i3 = k.a.c;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = b;
                int i4 = k.a.d;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            IronSource.AD_UNIT.values();
            int[] iArr5 = new int[4];
            a = iArr5;
            try {
                iArr5[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IronSource.AD_UNIT.OFFERWALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c {
        public static volatile L a = new L((byte) 0);
    }

    private L() {
        this.b = L.class.getName();
        this.c = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b7.2.4.1";
        this.d = "Activity=";
        this.t = new Object();
        this.u = null;
        this.j = null;
        this.k = null;
        this.v = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.x = false;
        this.p = null;
        this.A = null;
        this.D = true;
        this.F = IronSourceConstants.KEY_SESSION_DEPTH;
        this.R = null;
        this.l = IronSourceLoggerManager.getLogger(0);
        com.ironsource.mediationsdk.logger.b bVar = new com.ironsource.mediationsdk.logger.b(null, 1);
        this.r = bVar;
        this.l.addLogger(bVar);
        this.q = new com.ironsource.mediationsdk.sdk.i();
        se3 se3Var = new se3();
        this.f = se3Var;
        se3Var.t = this.q;
        he3 he3Var = new he3();
        this.g = he3Var;
        he3Var.t = this.q;
        je3 je3Var = new je3();
        this.h = je3Var;
        je3Var.c = this.q;
        this.s = new AtomicBoolean();
        this.B = new HashSet();
        this.C = new HashSet();
        this.I = false;
        this.H = false;
        this.J = false;
        this.w = new AtomicBoolean(true);
        this.Y = new AtomicBoolean(false);
        this.G = 0;
        this.K = false;
        this.L = false;
        this.M = false;
        this.p = UUID.randomUUID().toString();
        this.O = Boolean.FALSE;
        this.f0 = false;
        this.Q = null;
        this.S = null;
        this.T = null;
        this.X = null;
        this.U = null;
        this.Z = false;
        this.a0 = false;
        this.d0 = false;
        this.g0 = false;
        this.i0 = new CopyOnWriteArraySet<>();
        this.j0 = new CopyOnWriteArraySet<>();
        this.k0 = new CopyOnWriteArraySet<>();
        this.N = new ConcurrentHashMap<>();
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.i = null;
        this.h0 = 1;
        this.o0 = new com.ironsource.mediationsdk.impressionData.a();
        this.p0 = new com.ironsource.sdk.a.e();
        this.q0 = new am();
    }

    public /* synthetic */ L(byte b2) {
        this();
    }

    private void B(ArrayList<NetworkSettings> arrayList) {
        this.l.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
        this.U = new T(arrayList, new com.ironsource.mediationsdk.c.b(this.j, IronSourceUtils.getUserIdForNetworks(), this.u.c.d), com.ironsource.d.a.a().b(), this.E);
        e();
    }

    public static void C(JSONObject jSONObject, Object[][] objArr) {
        for (int i = 0; i <= 0; i++) {
            try {
                Object[] objArr2 = objArr[0];
                jSONObject.put(objArr2[0].toString(), objArr2[1]);
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e), 3);
                return;
            }
        }
    }

    private synchronized void D(boolean z, IronSource.AD_UNIT... ad_unitArr) {
        String str;
        String str2;
        int i = 0;
        for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
            if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                this.L = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                this.M = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                this.K = true;
            }
        }
        if (Q.a().b() == Q.f.INIT_FAILED) {
            try {
                if (this.q != null) {
                    int length = ad_unitArr.length;
                    while (i < length) {
                        IronSource.AD_UNIT ad_unit2 = ad_unitArr[i];
                        if (!this.B.contains(ad_unit2)) {
                            x(ad_unit2, true);
                        }
                        i++;
                    }
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else if (!this.x) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z);
            int length2 = ad_unitArr.length;
            boolean z2 = false;
            while (i < length2) {
                IronSource.AD_UNIT ad_unit3 = ad_unitArr[i];
                if (this.B.contains(ad_unit3)) {
                    this.l.log(IronSourceLogger.IronSourceTag.API, ad_unit3 + " ad unit has started initializing.", 3);
                } else {
                    this.B.add(ad_unit3);
                    this.C.add(ad_unit3);
                    try {
                        mediationAdditionalData.put(ad_unit3.toString(), true);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    z2 = true;
                }
                i++;
            }
            if (z2) {
                try {
                    StringBuilder sb = new StringBuilder();
                    String str3 = ",androidx=" + IronSourceUtils.isAndroidXAvailable();
                    String str4 = ",Activity=" + n();
                    if (a.AnonymousClass1.d()) {
                        sb.append(IronSourceConstants.IS_APP_LANGUAGE_KOTLIN);
                        str2 = a.AnonymousClass1.c();
                    } else {
                        str2 = IronSourceConstants.IS_APP_LANGUAGE_JAVA;
                    }
                    sb.append(str2);
                    sb.append(str3);
                    if (V()) {
                        sb.append(str4);
                    }
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
                    int i2 = this.G + 1;
                    this.G = i2;
                    mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(14, mediationAdditionalData));
            }
            return;
        } else {
            Q.a().b(z);
            if (this.y == null) {
                return;
            }
            JSONObject mediationAdditionalData2 = IronSourceUtils.getMediationAdditionalData(z);
            boolean z3 = false;
            for (IronSource.AD_UNIT ad_unit4 : ad_unitArr) {
                if (this.B.contains(ad_unit4)) {
                    w(ad_unit4);
                } else {
                    this.B.add(ad_unit4);
                    this.C.add(ad_unit4);
                    try {
                        mediationAdditionalData2.put(ad_unit4.toString(), true);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    List<IronSource.AD_UNIT> list = this.y;
                    if (list == null || !list.contains(ad_unit4)) {
                        x(ad_unit4, false);
                    } else {
                        M(ad_unit4);
                    }
                    z3 = true;
                }
            }
            if (z3) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    String str5 = ",androidx=" + IronSourceUtils.isAndroidXAvailable();
                    String str6 = ",Activity=" + n();
                    if (a.AnonymousClass1.d()) {
                        sb2.append(IronSourceConstants.IS_APP_LANGUAGE_KOTLIN);
                        str = a.AnonymousClass1.c();
                    } else {
                        str = IronSourceConstants.IS_APP_LANGUAGE_JAVA;
                    }
                    sb2.append(str);
                    sb2.append(str5);
                    if (V()) {
                        sb2.append(str6);
                    }
                    mediationAdditionalData2.put(IronSourceConstants.EVENTS_EXT1, sb2.toString());
                    int i3 = this.G + 1;
                    this.G = i3;
                    mediationAdditionalData2.put(IronSourceConstants.KEY_SESSION_DEPTH, i3);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(14, mediationAdditionalData2));
            }
            return;
        }
    }

    private boolean E(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        synchronized (this.k0) {
            if (this.n0 == null) {
                if (!this.k0.contains(str)) {
                    this.k0.add(str);
                }
                this.N.put(str, iSDemandOnlyBannerLayout);
                return true;
            }
            return false;
        }
    }

    private static boolean F(AbstractC1270b abstractC1270b) {
        return abstractC1270b.o > 0 && abstractC1270b.p > 0;
    }

    private static boolean G(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    @Nullable
    private static IronSourceError I(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        if (activity == null && ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            return new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_MISSING_ACTIVITY, "Banner was initialized and loaded without Activity");
        }
        if (iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed()) {
            return new IronSourceError(510, iSDemandOnlyBannerLayout == null ? "Missing banner layout" : "Banner layout is destroyed");
        } else if (TextUtils.isEmpty(str)) {
            return new IronSourceError(510, "Missing instance Id");
        } else {
            return null;
        }
    }

    private com.ironsource.mediationsdk.utils.l K(Context context, String str, a aVar) {
        com.ironsource.mediationsdk.utils.l lVar = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String a2 = a(context);
            if (TextUtils.isEmpty(a2)) {
                a2 = com.ironsource.environment.h.x(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = a2;
            IronSourceSegment ironSourceSegment = this.E;
            String stringFromURL = HttpFunctions.getStringFromURL(ServerURL.getCPVProvidersURL(context, this.j, str, str2, this.o, this.a0, ironSourceSegment != null ? ironSourceSegment.a() : null, V()), aVar);
            if (stringFromURL == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.getSerr() == 1) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                String optString = new JSONObject(stringFromURL).optString("response", null);
                if (TextUtils.isEmpty(optString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                stringFromURL = IronSourceAES.decode(com.ironsource.mediationsdk.utils.g.a().b(), optString);
                if (TextUtils.isEmpty(stringFromURL)) {
                    ironLog.warning("encoded response invalid - return null");
                    if (!a) {
                        a = true;
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                        try {
                            mediationAdditionalData.put("status", "false");
                            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(114, mediationAdditionalData));
                    }
                    return null;
                }
            }
            com.ironsource.mediationsdk.utils.l lVar2 = new com.ironsource.mediationsdk.utils.l(context, this.j, str, stringFromURL);
            try {
                lVar2.e = l.a.c;
                if (lVar2.b()) {
                    return lVar2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e2) {
                e = e2;
                lVar = lVar2;
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.warning("exception = " + e);
                e.printStackTrace();
                return lVar;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private static void L(int i, JSONObject jSONObject) {
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i, jSONObject));
    }

    private void M(IronSource.AD_UNIT ad_unit) {
        int i = b.a[ad_unit.ordinal()];
        if (i == 1) {
            e0();
        } else if (i == 2) {
            s0();
        } else if (i == 3) {
            this.h.a(this.j, this.k);
        } else if (i != 4) {
        } else {
            b();
        }
    }

    private boolean N(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        if (Q.a().b() == Q.f.INIT_IN_PROGRESS) {
            synchronized (this.k0) {
                if (!this.k0.contains(str)) {
                    this.k0.add(str);
                }
                this.N.put(str, iSDemandOnlyBannerLayout);
            }
            return true;
        }
        return false;
    }

    private void Y() {
        this.l.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
        List<NetworkSettings> h0 = h0();
        if (h0.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.h0);
            C(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            u(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            x(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        com.ironsource.mediationsdk.model.p pVar = this.u.c.a;
        this.S = pVar.l.o ? new ie3(h0, pVar, this.j, IronSourceUtils.getUserIdForNetworks(), com.ironsource.d.a.a().b(), this.E) : new le3(h0, pVar, this.j, IronSourceUtils.getUserIdForNetworks(), com.ironsource.d.a.a().b(), this.E);
        Boolean bool = this.A;
        if (bool != null) {
            this.S.a(this.z, bool.booleanValue());
            if (this.A.booleanValue()) {
                this.f.a(this.z, false);
            }
        }
    }

    private Placement Z(String str) {
        com.ironsource.mediationsdk.model.p pVar = this.u.c.a;
        if (pVar != null) {
            Iterator<Placement> it = pVar.a.iterator();
            while (it.hasNext()) {
                Placement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public static L a() {
        return c.a;
    }

    public static String a(Context context) {
        String[] C = com.ironsource.environment.h.C(context);
        return (C == null || C.length != 2) ? "" : C[0];
    }

    public static void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        E.a().b = iSDemandOnlyInterstitialListener;
    }

    public static void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayInterstitialListener == null) {
            ironLog.info("ISListener is null");
        } else {
            ironLog.info();
        }
        F.a().a(levelPlayInterstitialListener);
    }

    public static void a(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayRewardedVideoListener == null) {
            ironLog.info("RVListener is null");
        } else {
            ironLog.info();
        }
        ae.a().b = levelPlayRewardedVideoListener;
    }

    public static void a(@NotNull String str, @NotNull JSONObject jSONObject) {
        String s = wo1.s("networkKey = ", str);
        if (jSONObject != null) {
            s = s + " networkData = " + jSONObject;
        }
        IronLog.API.verbose(s);
        C1272d.a().a(str, jSONObject);
    }

    public static void a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setAdaptersDebug : " + z, 1);
        C1272d.a().b(z);
    }

    private void a0() {
        this.l.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.u.a.a.size(); i++) {
            String str = this.u.a.a.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.u.b.a(str));
            }
        }
        if (arrayList.size() <= 0) {
            x(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.j0) {
            this.m0 = new ve3(arrayList, this.u.c.a, this.j, this.k);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            x(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        Iterator<String> it = this.j0.iterator();
        while (it.hasNext()) {
            this.m0.a(it.next(), (String) null, false);
        }
        this.j0.clear();
    }

    private void b() {
        NetworkSettings a2;
        if (this.J) {
            d();
            return;
        }
        synchronized (this.O) {
            this.g0 = this.u.c.d.g.a;
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("mIsBnProgrammatic = " + this.g0);
            ironLog.verbose("mIsBnLoadBeforeInitCompleted = " + this.O);
            L(IronSourceConstants.TROUBLESHOOTING_BN_FORK, IronSourceUtils.getMediationAdditionalData(false, this.g0, 1));
            ArrayList<NetworkSettings> arrayList = new ArrayList<>();
            for (int i = 0; i < this.u.a.e.size(); i++) {
                String str = this.u.a.e.get(i);
                if (!TextUtils.isEmpty(str) && (a2 = this.u.b.a(str)) != null) {
                    arrayList.add(a2);
                }
            }
            if (arrayList.size() <= 0) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, this.g0, 1);
                C(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                L(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
                x(IronSource.AD_UNIT.BANNER, false);
            } else if (this.g0) {
                B(arrayList);
            } else {
                com.ironsource.mediationsdk.model.f fVar = this.u.c.d;
                this.i = new C1282p(arrayList, this.j, IronSourceUtils.getUserIdForNetworks(), fVar.b, fVar.e, fVar.f);
                e();
            }
        }
    }

    private void b0() {
        NetworkSettings a2;
        NetworkSettings a3;
        NetworkSettings a4;
        com.ironsource.mediationsdk.model.p pVar = this.u.c.a;
        int i = pVar.e;
        for (int i2 = 0; i2 < this.u.a.a.size(); i2++) {
            String str = this.u.a.a.get(i2);
            if (!TextUtils.isEmpty(str) && (a4 = this.u.b.a(str)) != null) {
                ag agVar = new ag(a4, i);
                if (F(agVar)) {
                    se3 se3Var = this.f;
                    agVar.y = se3Var;
                    agVar.n = i2 + 1;
                    se3Var.b((AbstractC1270b) agVar);
                }
            }
        }
        if (this.f.i.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, this.h0);
            C(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            u(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            x(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        boolean z = pVar.b.a;
        se3 se3Var2 = this.f;
        se3Var2.v = z;
        se3Var2.h = pVar.c;
        se3Var2.z = pVar.h;
        String c2 = this.u.c();
        if (!TextUtils.isEmpty(c2) && (a3 = this.u.b.a(c2)) != null) {
            ag agVar2 = new ag(a3, i);
            if (F(agVar2)) {
                se3 se3Var3 = this.f;
                agVar2.y = se3Var3;
                se3Var3.n.log(IronSourceLogger.IronSourceTag.INTERNAL, wo1.C(new StringBuilder(), agVar2.e, " is set as backfill"), 0);
                se3Var3.j = agVar2;
            }
        }
        String d = this.u.d();
        if (!TextUtils.isEmpty(d) && (a2 = this.u.b.a(d)) != null) {
            ag agVar3 = new ag(a2, i);
            if (F(agVar3)) {
                se3 se3Var4 = this.f;
                agVar3.y = se3Var4;
                se3Var4.n.log(IronSourceLogger.IronSourceTag.INTERNAL, wo1.C(new StringBuilder(), agVar3.e, " is set as premium"), 0);
                se3Var4.k = agVar3;
            }
        }
        se3 se3Var5 = this.f;
        se3Var5.E = new B(pVar.i, se3Var5);
        this.f.a(this.j, IronSourceUtils.getUserIdForNetworks());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c0(String str) {
        Placement placement;
        com.ironsource.mediationsdk.adunit.c.h hVar;
        D d;
        try {
            placement = Z(str);
            if (placement == null) {
                try {
                    placement = J();
                } catch (Exception e) {
                    e = e;
                    this.l.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo()", e);
                    hVar = this.W;
                    if (hVar == null) {
                    }
                    d = this.S;
                    if (d == null) {
                    }
                }
            }
            if (placement == null) {
                this.l.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticRewardedVideo error: empty default placement in response", 3);
                ae.a().a(new IronSourceError(1021, "showProgrammaticRewardedVideo error: empty default placement in response"), (AdInfo) null);
                return;
            }
        } catch (Exception e2) {
            e = e2;
            placement = null;
        }
        hVar = this.W;
        if (hVar == null && (this.a0 || this.c0)) {
            hVar.a(placement);
            return;
        }
        d = this.S;
        if (d == null) {
            d.a(placement);
            return;
        }
        this.l.log(IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet", 3);
        ae.a().a(new IronSourceError(1023, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"), (AdInfo) null);
    }

    private void d() {
        this.l.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.u.a.e.size(); i++) {
            String str = this.u.a.e.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.u.b.a(str));
            }
        }
        if (arrayList.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            C(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            L(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            x(IronSource.AD_UNIT.BANNER, false);
            return;
        }
        synchronized (this.k0) {
            this.n0 = new com.ironsource.mediationsdk.utils.k(arrayList, this.u.c.d, this.j, this.k);
        }
        Iterator<String> it = this.k0.iterator();
        while (it.hasNext()) {
            String next = it.next();
            this.n0.a(this.N.get(next), next);
        }
        this.N.clear();
        this.k0.clear();
    }

    private Placement d0(String str) {
        Placement Z = Z(str);
        if (Z == null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.l;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            Z = J();
            if (Z == null) {
                this.l.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String t = t(Z.getPlacementName(), com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getApplicationContext(), Z));
        if (TextUtils.isEmpty(t)) {
            return Z;
        }
        this.l.log(IronSourceLogger.IronSourceTag.API, t, 1);
        ae.a().a(ErrorBuilder.buildCappedPerPlacementError(t), (AdInfo) null);
        return null;
    }

    private void e() {
        if (this.O.booleanValue()) {
            this.O = Boolean.FALSE;
            a(this.P, this.Q);
            this.P = null;
            this.Q = null;
        }
    }

    private void e0() {
        if (this.H) {
            a0();
            return;
        }
        com.ironsource.mediationsdk.model.p pVar = this.u.c.a;
        com.ironsource.mediationsdk.utils.c cVar = pVar.l;
        this.Z = cVar.a || this.a0;
        this.c0 = cVar.b;
        int p = p(pVar);
        this.h0 = p;
        u(IronSourceConstants.TROUBLESHOOTING_RV_FORK, IronSourceUtils.getMediationAdditionalData(false, this.Z, p));
        if (this.a0 || this.c0) {
            g0();
        } else if (this.Z) {
            Y();
        } else {
            b0();
        }
    }

    private InterstitialPlacement f0(String str) {
        com.ironsource.mediationsdk.model.i iVar = this.u.c.b;
        if (iVar != null) {
            Iterator<InterstitialPlacement> it = iVar.a.iterator();
            while (it.hasNext()) {
                InterstitialPlacement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    private boolean g() {
        com.ironsource.mediationsdk.model.n nVar;
        ArrayList<String> arrayList;
        com.ironsource.mediationsdk.utils.l lVar = this.u;
        return (lVar == null || (nVar = lVar.a) == null || (arrayList = nVar.a) == null || arrayList.size() <= 0) ? false : true;
    }

    private void g0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> h0 = h0();
        if (h0.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.h0);
            C(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            u(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            x(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        com.ironsource.mediationsdk.adunit.c.h hVar = new com.ironsource.mediationsdk.adunit.c.h(h0, this.u.c.a, IronSourceUtils.getUserIdForNetworks(), this.a0, com.ironsource.d.a.a().b(), this.E);
        this.W = hVar;
        Boolean bool = this.A;
        if (bool != null) {
            hVar.b(bool.booleanValue());
        }
        if (this.b0 && this.a0) {
            this.b0 = false;
            this.W.d();
        }
    }

    private List<NetworkSettings> h0() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.u.a.a.size(); i++) {
            String str = this.u.a.a.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.u.b.a(str));
            }
        }
        return arrayList;
    }

    private boolean i() {
        com.ironsource.mediationsdk.model.n nVar;
        ArrayList<String> arrayList;
        com.ironsource.mediationsdk.utils.l lVar = this.u;
        return (lVar == null || (nVar = lVar.a) == null || (arrayList = nVar.d) == null || arrayList.size() <= 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i0(String str) {
        Exception e;
        InterstitialPlacement interstitialPlacement;
        try {
            interstitialPlacement = f0(str);
            if (interstitialPlacement == null) {
                try {
                    interstitialPlacement = Q();
                } catch (Exception e2) {
                    e = e2;
                    this.l.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticInterstitial()", e);
                    if (this.e0) {
                    }
                }
            }
            if (interstitialPlacement == null) {
                this.l.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticInterstitial error: empty default placement in response", 3);
                F.a().a(new IronSourceError(1020, "showProgrammaticInterstitial error: empty default placement in response"), null);
                return;
            }
        } catch (Exception e3) {
            e = e3;
            interstitialPlacement = null;
        }
        if (this.e0) {
            this.T.a(interstitialPlacement.getPlacementName());
        } else {
            this.V.a(new Placement(interstitialPlacement));
        }
    }

    private boolean j() {
        com.ironsource.mediationsdk.model.h hVar;
        com.ironsource.mediationsdk.utils.l lVar = this.u;
        return (lVar == null || (hVar = lVar.c) == null || hVar.d == null) ? false : true;
    }

    private InterstitialPlacement j0(String str) {
        InterstitialPlacement f0 = f0(str);
        if (f0 == null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.l;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            f0 = Q();
            if (f0 == null) {
                this.l.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String t = t(f0.getPlacementName(), n0(f0.getPlacementName()));
        if (TextUtils.isEmpty(t)) {
            return f0;
        }
        this.l.log(IronSourceLogger.IronSourceTag.API, t, 1);
        this.q.e = f0;
        F.a().a(ErrorBuilder.buildCappedPerPlacementError(t), null);
        return null;
    }

    private boolean k() {
        com.ironsource.mediationsdk.model.n nVar;
        ArrayList<String> arrayList;
        if (j()) {
            com.ironsource.mediationsdk.utils.l lVar = this.u;
            if ((lVar == null || (nVar = lVar.a) == null || (arrayList = nVar.e) == null || arrayList.size() <= 0) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private List<NetworkSettings> k0() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.u.a.d.size(); i++) {
            String str = this.u.a.d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.u.b.a(str));
            }
        }
        return arrayList;
    }

    private void l0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> k0 = k0();
        if (k0.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            C(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            L(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            x(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        com.ironsource.mediationsdk.adunit.c.g gVar = new com.ironsource.mediationsdk.adunit.c.g(k0, this.u.c.b, IronSourceUtils.getUserIdForNetworks(), com.ironsource.d.a.a().b(), this.E);
        this.V = gVar;
        Boolean bool = this.A;
        if (bool != null) {
            gVar.b(bool.booleanValue());
        }
        if (this.f0) {
            this.f0 = false;
            this.V.d();
        }
    }

    private static boolean m0(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private static boolean n() {
        return ContextProvider.getInstance().getCurrentActiveActivity() != null;
    }

    private int n0(String str) {
        com.ironsource.mediationsdk.model.h hVar;
        com.ironsource.mediationsdk.utils.l lVar = this.u;
        if (lVar == null || (hVar = lVar.c) == null || hVar.b == null) {
            return k.a.d;
        }
        InterstitialPlacement interstitialPlacement = null;
        try {
            interstitialPlacement = f0(str);
            if (interstitialPlacement == null && (interstitialPlacement = Q()) == null) {
                this.l.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return interstitialPlacement == null ? k.a.d : com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement);
    }

    private void o() {
        if (this.X == null || !this.Y.compareAndSet(false, true)) {
            return;
        }
        IronLog.CALLBACK.verbose("onInitializationCompleted()");
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
        this.X.onInitializationComplete();
    }

    private void o0() {
        this.l.log(IronSourceLogger.IronSourceTag.INTERNAL, "Adunit: Interstitial is now initiated - programmatic mode", 0);
        List<NetworkSettings> k0 = k0();
        if (k0.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            C(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            L(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            x(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        ke3 ke3Var = new ke3(k0, this.u.c.b, this.j, IronSourceUtils.getUserIdForNetworks(), this.u.c.b.f, com.ironsource.d.a.a().b(), this.E);
        this.T = ke3Var;
        Boolean bool = this.A;
        if (bool != null) {
            ke3Var.a(bool.booleanValue());
            if (this.A.booleanValue()) {
                this.g.a(this.z, false);
            }
        }
        if (this.f0) {
            this.f0 = false;
            this.T.e();
        }
    }

    private int p(com.ironsource.mediationsdk.model.p pVar) {
        return !this.c0 && !this.a0 && pVar.l.o ? 2 : 1;
    }

    private com.ironsource.mediationsdk.model.g p0(String str) {
        com.ironsource.mediationsdk.model.g a2;
        com.ironsource.mediationsdk.model.f fVar = this.u.c.d;
        if (fVar == null) {
            return null;
        }
        return (TextUtils.isEmpty(str) || (a2 = fVar.a(str)) == null) ? fVar.a() : a2;
    }

    @Nullable
    private IronSourceError q(Q.f fVar) {
        if (this.M) {
            if (this.J) {
                if (fVar == Q.f.INIT_FAILED) {
                    return new IronSourceError(510, "ironSource initialization failed");
                }
                if (fVar == Q.f.INIT_IN_PROGRESS && Q.a().c()) {
                    return new IronSourceError(510, "ironSource initialization in progress");
                }
                return null;
            }
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        return new IronSourceError(510, "ironSource SDK was not initialized");
    }

    private void q0() {
        NetworkSettings a2;
        com.ironsource.mediationsdk.model.i iVar = this.u.c.b;
        int i = iVar.e;
        this.g.y.a(IronSource.AD_UNIT.INTERSTITIAL, iVar.f);
        for (int i2 = 0; i2 < this.u.a.d.size(); i2++) {
            String str = this.u.a.d.get(i2);
            if (!TextUtils.isEmpty(str) && (a2 = this.u.b.a(str)) != null) {
                J j = new J(a2, i);
                if (F(j)) {
                    he3 he3Var = this.g;
                    j.y = he3Var;
                    j.n = i2 + 1;
                    he3Var.b((AbstractC1270b) j);
                }
            }
        }
        if (this.g.i.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            C(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            L(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            x(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        int i3 = iVar.c;
        he3 he3Var2 = this.g;
        he3Var2.h = i3;
        he3Var2.a(this.j, IronSourceUtils.getUserIdForNetworks());
        if (this.f0) {
            this.f0 = false;
            this.g.c();
        }
    }

    private com.ironsource.mediationsdk.utils.l r(Context context, String str) {
        if (IronSourceUtils.isInitResponseCached(context)) {
            String cachedValueByKeyOfCachedInitResponse = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "appKey");
            String cachedValueByKeyOfCachedInitResponse2 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, DataKeys.USER_ID);
            String cachedValueByKeyOfCachedInitResponse3 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "response");
            String str2 = this.j;
            if (str2 != null && cachedValueByKeyOfCachedInitResponse.equals(str2) && cachedValueByKeyOfCachedInitResponse2.equals(str)) {
                com.ironsource.mediationsdk.utils.l lVar = new com.ironsource.mediationsdk.utils.l(context, cachedValueByKeyOfCachedInitResponse, cachedValueByKeyOfCachedInitResponse2, cachedValueByKeyOfCachedInitResponse3);
                lVar.e = l.a.b;
                return lVar;
            }
        }
        return null;
    }

    private void r0() {
        this.l.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.u.a.d.size(); i++) {
            String str = this.u.a.d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.u.b.a(str));
            }
        }
        if (arrayList.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            C(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            L(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            x(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        synchronized (this.i0) {
            this.l0 = new ue3(arrayList, this.u.c.b, this.j, this.k);
        }
        Iterator<String> it = this.i0.iterator();
        while (it.hasNext()) {
            this.l0.a(it.next(), (String) null, false);
        }
        this.i0.clear();
    }

    private void s0() {
        if (this.I) {
            r0();
            return;
        }
        com.ironsource.mediationsdk.utils.c cVar = this.u.c.b.i;
        boolean z = cVar.a;
        this.d0 = z;
        this.e0 = cVar.b;
        L(IronSourceConstants.TROUBLESHOOTING_IS_FORK, IronSourceUtils.getMediationAdditionalData(false, z, 1));
        if (!this.d0) {
            q0();
        } else if (this.e0) {
            l0();
        } else {
            o0();
        }
    }

    private static String t(String str, int i) {
        if (i == 0) {
            return null;
        }
        int i2 = b.b[i - 1];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return "placement " + str + " is capped";
        }
        return null;
    }

    public static void u(int i, JSONObject jSONObject) {
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i, jSONObject));
    }

    private void w(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.l.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    private void x(IronSource.AD_UNIT ad_unit, boolean z) {
        int i = b.a[ad_unit.ordinal()];
        if (i == 1) {
            if (this.H) {
                Iterator<String> it = this.j0.iterator();
                while (it.hasNext()) {
                    ad.a().a(it.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.j0.clear();
            } else if (this.a0) {
                if (this.b0) {
                    this.b0 = false;
                    C1286u.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
            } else if (z || O() || this.C.contains(ad_unit)) {
                ae.a().a(false, (AdInfo) null);
            }
        } else if (i == 2) {
            if (!this.I) {
                if (this.f0) {
                    this.f0 = false;
                    C1286u.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
                return;
            }
            Iterator<String> it2 = this.i0.iterator();
            while (it2.hasNext()) {
                E.a().a(it2.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
            }
            this.i0.clear();
        } else if (i == 3) {
            if (z || T() || this.C.contains(ad_unit)) {
                this.q.onOfferwallAvailable(false);
            }
        } else if (i != 4) {
        } else {
            if (this.J) {
                Iterator<String> it3 = this.k0.iterator();
                while (it3.hasNext()) {
                    m.a().a(it3.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
                }
                this.k0.clear();
                return;
            }
            synchronized (this.O) {
                if (this.O.booleanValue()) {
                    this.O = Boolean.FALSE;
                    C1281o.a().a(this.P, new IronSourceError(602, "Init had failed"), false);
                    this.P = null;
                    this.Q = null;
                }
            }
        }
    }

    public static void y(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        ad.a().b = iSDemandOnlyRewardedVideoListener;
    }

    public static void z(String str, com.ironsource.d.b bVar) {
        if (str != null) {
            try {
                if (str.length() > 64) {
                    bVar.a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
                }
            } catch (Exception unused) {
                bVar.a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
            }
        }
    }

    public final void A(String str, boolean z) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("userId = " + str + ", isFromPublisher = " + z);
        this.k = str;
        if (z) {
            com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(52, IronSourceUtils.getJsonForUserId(false)));
        }
    }

    public final synchronized AbstractAdapter H(String str) {
        try {
            AbstractAdapter abstractAdapter = this.e;
            if (abstractAdapter != null && abstractAdapter.getProviderName().equals(str)) {
                return this.e;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.l;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "getOfferwallAdapter exception: " + e, 1);
        }
        return null;
    }

    public Placement J() {
        com.ironsource.mediationsdk.model.p pVar = this.u.c.a;
        if (pVar != null) {
            return pVar.a();
        }
        return null;
    }

    public boolean O() {
        com.ironsource.mediationsdk.model.h hVar;
        com.ironsource.mediationsdk.utils.l lVar = this.u;
        return (lVar == null || (hVar = lVar.c) == null || hVar.a == null) ? false : true;
    }

    public boolean P() {
        return O() && g();
    }

    public InterstitialPlacement Q() {
        com.ironsource.mediationsdk.model.i iVar = this.u.c.b;
        if (iVar != null) {
            return iVar.a();
        }
        return null;
    }

    public boolean R() {
        com.ironsource.mediationsdk.model.h hVar;
        com.ironsource.mediationsdk.utils.l lVar = this.u;
        return (lVar == null || (hVar = lVar.c) == null || hVar.b == null) ? false : true;
    }

    public boolean S() {
        return R() && i();
    }

    public boolean T() {
        com.ironsource.mediationsdk.model.h hVar;
        com.ironsource.mediationsdk.utils.l lVar = this.u;
        return (lVar == null || (hVar = lVar.c) == null || hVar.c == null) ? false : true;
    }

    public final boolean U(String str) {
        if (this.I) {
            return false;
        }
        boolean z = n0(str) != k.a.d;
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.I, this.d0, 1);
            try {
                mediationAdditionalData.put("placement", str);
                if (this.d0) {
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                }
            } catch (Exception unused) {
            }
            com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z;
    }

    public final boolean V() {
        return this.H || this.I || this.J;
    }

    public final boolean W(String str) {
        if (j()) {
            com.ironsource.mediationsdk.model.g gVar = null;
            try {
                gVar = this.u.c.d.a(str);
                if (gVar == null && (gVar = this.u.c.d.a()) == null) {
                    this.l.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (gVar == null) {
                return false;
            }
            return com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getApplicationContext(), gVar.getPlacementName());
        }
        return false;
    }

    public int X(String str) {
        com.ironsource.mediationsdk.model.h hVar;
        com.ironsource.mediationsdk.utils.l lVar = this.u;
        if (lVar == null || (hVar = lVar.c) == null || hVar.a == null) {
            return k.a.d;
        }
        Placement placement = null;
        try {
            placement = Z(str);
            if (placement == null && (placement = J()) == null) {
                this.l.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return placement == null ? k.a.d : com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getApplicationContext(), placement);
    }

    public final synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        IronSourceError I = I(activity, iSDemandOnlyBannerLayout, str);
        if (I != null) {
            this.l.log(IronSourceLogger.IronSourceTag.API, I.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.sendBannerAdLoadFailed(str, I);
            }
            return;
        }
        IronSourceError q = q(Q.a().b());
        if (q != null) {
            this.l.log(IronSourceLogger.IronSourceTag.API, q.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.sendBannerAdLoadFailed(str, q);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (N(iSDemandOnlyBannerLayout, str)) {
            return;
        }
        if (E(iSDemandOnlyBannerLayout, str)) {
            return;
        }
        if (k()) {
            this.n0.a(iSDemandOnlyBannerLayout, str);
            return;
        }
        this.l.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
        iSDemandOnlyBannerLayout.sendBannerAdLoadFailed(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
    }

    public final synchronized void a(@NotNull Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        IronSourceError I = I(activity, iSDemandOnlyBannerLayout, str);
        if (I == null && str2 == null) {
            I = new IronSourceError(510, "Missing adm");
        }
        if (I != null) {
            this.l.log(IronSourceLogger.IronSourceTag.API, I.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.sendBannerAdLoadFailed(str, I);
            }
            return;
        }
        IronSourceError q = q(Q.a().b());
        if (q != null) {
            this.l.log(IronSourceLogger.IronSourceTag.API, q.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.sendBannerAdLoadFailed(str, q);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (N(iSDemandOnlyBannerLayout, str)) {
            return;
        }
        if (E(iSDemandOnlyBannerLayout, str)) {
            return;
        }
        if (k()) {
            this.n0.a(iSDemandOnlyBannerLayout, str, str2);
            return;
        }
        this.l.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
        iSDemandOnlyBannerLayout.sendBannerAdLoadFailed(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
    }

    public final synchronized void a(Activity activity, String str, String str2) {
        if (str2 != null) {
            b(activity, str, str2);
            return;
        }
        this.l.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
        ad.a().a(str, new IronSourceError(510, "adm cannot be null"));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x000e, B:10:0x0012, B:12:0x001c, B:37:0x0087, B:13:0x0036, B:15:0x003e, B:17:0x0042, B:18:0x0046, B:20:0x004e, B:21:0x0051, B:23:0x0059, B:25:0x005d, B:26:0x0061, B:28:0x0069, B:29:0x006c, B:31:0x0074, B:33:0x0078, B:34:0x007c, B:36:0x0084, B:51:0x00bf, B:53:0x00c3, B:54:0x00cd, B:55:0x00d8, B:57:0x00de, B:38:0x008a, B:40:0x008e, B:42:0x009b, B:44:0x009f, B:46:0x00ac, B:48:0x00b0, B:49:0x00b6, B:45:0x00a5, B:41:0x0094), top: B:63:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x000e, B:10:0x0012, B:12:0x001c, B:37:0x0087, B:13:0x0036, B:15:0x003e, B:17:0x0042, B:18:0x0046, B:20:0x004e, B:21:0x0051, B:23:0x0059, B:25:0x005d, B:26:0x0061, B:28:0x0069, B:29:0x006c, B:31:0x0074, B:33:0x0078, B:34:0x007c, B:36:0x0084, B:51:0x00bf, B:53:0x00c3, B:54:0x00cd, B:55:0x00d8, B:57:0x00de, B:38:0x008a, B:40:0x008e, B:42:0x009b, B:44:0x009f, B:46:0x00ac, B:48:0x00b0, B:49:0x00b6, B:45:0x00a5, B:41:0x0094), top: B:63:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(Context context, String str, InitializationListener initializationListener, IronSource.AD_UNIT... ad_unitArr) {
        ArrayList arrayList = new ArrayList();
        if (ad_unitArr != null && ad_unitArr.length != 0) {
            for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
                if (ad_unit.equals(IronSource.AD_UNIT.OFFERWALL)) {
                    this.l.log(IronSourceLogger.IronSourceTag.API, ad_unit + " ad unit cannot be initialized in demand only mode", 3);
                } else {
                    if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                        if (this.L) {
                            w(ad_unit);
                        } else {
                            this.I = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                    if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                        if (this.K) {
                            w(ad_unit);
                        } else {
                            this.H = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                    if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                        if (this.M) {
                            w(ad_unit);
                        } else {
                            this.J = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                }
            }
            if (context != null) {
                if (context instanceof Activity) {
                    ContextProvider.getInstance().updateActivity((Activity) context);
                }
                ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
            }
            if (arrayList.size() > 0) {
                a(context, str, true, null, (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[arrayList.size()]));
            }
        }
        if (this.K) {
            w(IronSource.AD_UNIT.REWARDED_VIDEO);
        } else {
            this.H = true;
            arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        if (this.L) {
            w(IronSource.AD_UNIT.INTERSTITIAL);
        } else {
            this.I = true;
            arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
        }
        if (this.M) {
            w(IronSource.AD_UNIT.BANNER);
        } else {
            this.J = true;
            arrayList.add(IronSource.AD_UNIT.BANNER);
        }
        if (context != null) {
        }
        if (arrayList.size() > 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: all -> 0x02f8, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x0153, B:56:0x0163, B:58:0x0177, B:62:0x0180, B:63:0x0185, B:65:0x0189, B:67:0x018f, B:68:0x01b4, B:70:0x01b8, B:72:0x01cb, B:73:0x01d3, B:75:0x01dd, B:76:0x01e6, B:79:0x01f9, B:81:0x021d, B:82:0x0226, B:84:0x0250, B:85:0x0259, B:87:0x0260, B:89:0x0269, B:90:0x026c, B:92:0x0277, B:94:0x027b, B:95:0x0287, B:99:0x0296, B:98:0x0293, B:100:0x02a6, B:102:0x02b0, B:103:0x02b9, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d6, B:110:0x02e7, B:113:0x02ec), top: B:119:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: all -> 0x02f8, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x0153, B:56:0x0163, B:58:0x0177, B:62:0x0180, B:63:0x0185, B:65:0x0189, B:67:0x018f, B:68:0x01b4, B:70:0x01b8, B:72:0x01cb, B:73:0x01d3, B:75:0x01dd, B:76:0x01e6, B:79:0x01f9, B:81:0x021d, B:82:0x0226, B:84:0x0250, B:85:0x0259, B:87:0x0260, B:89:0x0269, B:90:0x026c, B:92:0x0277, B:94:0x027b, B:95:0x0287, B:99:0x0296, B:98:0x0293, B:100:0x02a6, B:102:0x02b0, B:103:0x02b9, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d6, B:110:0x02e7, B:113:0x02ec), top: B:119:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df A[Catch: all -> 0x02f8, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x0153, B:56:0x0163, B:58:0x0177, B:62:0x0180, B:63:0x0185, B:65:0x0189, B:67:0x018f, B:68:0x01b4, B:70:0x01b8, B:72:0x01cb, B:73:0x01d3, B:75:0x01dd, B:76:0x01e6, B:79:0x01f9, B:81:0x021d, B:82:0x0226, B:84:0x0250, B:85:0x0259, B:87:0x0260, B:89:0x0269, B:90:0x026c, B:92:0x0277, B:94:0x027b, B:95:0x0287, B:99:0x0296, B:98:0x0293, B:100:0x02a6, B:102:0x02b0, B:103:0x02b9, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d6, B:110:0x02e7, B:113:0x02ec), top: B:119:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef A[Catch: all -> 0x02f8, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x0153, B:56:0x0163, B:58:0x0177, B:62:0x0180, B:63:0x0185, B:65:0x0189, B:67:0x018f, B:68:0x01b4, B:70:0x01b8, B:72:0x01cb, B:73:0x01d3, B:75:0x01dd, B:76:0x01e6, B:79:0x01f9, B:81:0x021d, B:82:0x0226, B:84:0x0250, B:85:0x0259, B:87:0x0260, B:89:0x0269, B:90:0x026c, B:92:0x0277, B:94:0x027b, B:95:0x0287, B:99:0x0296, B:98:0x0293, B:100:0x02a6, B:102:0x02b0, B:103:0x02b9, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d6, B:110:0x02e7, B:113:0x02ec), top: B:119:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133 A[Catch: all -> 0x02f8, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x0153, B:56:0x0163, B:58:0x0177, B:62:0x0180, B:63:0x0185, B:65:0x0189, B:67:0x018f, B:68:0x01b4, B:70:0x01b8, B:72:0x01cb, B:73:0x01d3, B:75:0x01dd, B:76:0x01e6, B:79:0x01f9, B:81:0x021d, B:82:0x0226, B:84:0x0250, B:85:0x0259, B:87:0x0260, B:89:0x0269, B:90:0x026c, B:92:0x0277, B:94:0x027b, B:95:0x0287, B:99:0x0296, B:98:0x0293, B:100:0x02a6, B:102:0x02b0, B:103:0x02b9, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d6, B:110:0x02e7, B:113:0x02ec), top: B:119:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0163 A[Catch: all -> 0x02f8, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x0153, B:56:0x0163, B:58:0x0177, B:62:0x0180, B:63:0x0185, B:65:0x0189, B:67:0x018f, B:68:0x01b4, B:70:0x01b8, B:72:0x01cb, B:73:0x01d3, B:75:0x01dd, B:76:0x01e6, B:79:0x01f9, B:81:0x021d, B:82:0x0226, B:84:0x0250, B:85:0x0259, B:87:0x0260, B:89:0x0269, B:90:0x026c, B:92:0x0277, B:94:0x027b, B:95:0x0287, B:99:0x0296, B:98:0x0293, B:100:0x02a6, B:102:0x02b0, B:103:0x02b9, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d6, B:110:0x02e7, B:113:0x02ec), top: B:119:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189 A[Catch: all -> 0x02f8, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x0153, B:56:0x0163, B:58:0x0177, B:62:0x0180, B:63:0x0185, B:65:0x0189, B:67:0x018f, B:68:0x01b4, B:70:0x01b8, B:72:0x01cb, B:73:0x01d3, B:75:0x01dd, B:76:0x01e6, B:79:0x01f9, B:81:0x021d, B:82:0x0226, B:84:0x0250, B:85:0x0259, B:87:0x0260, B:89:0x0269, B:90:0x026c, B:92:0x0277, B:94:0x027b, B:95:0x0287, B:99:0x0296, B:98:0x0293, B:100:0x02a6, B:102:0x02b0, B:103:0x02b9, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d6, B:110:0x02e7, B:113:0x02ec), top: B:119:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b8 A[Catch: all -> 0x02f8, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x0153, B:56:0x0163, B:58:0x0177, B:62:0x0180, B:63:0x0185, B:65:0x0189, B:67:0x018f, B:68:0x01b4, B:70:0x01b8, B:72:0x01cb, B:73:0x01d3, B:75:0x01dd, B:76:0x01e6, B:79:0x01f9, B:81:0x021d, B:82:0x0226, B:84:0x0250, B:85:0x0259, B:87:0x0260, B:89:0x0269, B:90:0x026c, B:92:0x0277, B:94:0x027b, B:95:0x0287, B:99:0x0296, B:98:0x0293, B:100:0x02a6, B:102:0x02b0, B:103:0x02b9, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d6, B:110:0x02e7, B:113:0x02ec), top: B:119:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f9 A[Catch: all -> 0x02f8, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x0153, B:56:0x0163, B:58:0x0177, B:62:0x0180, B:63:0x0185, B:65:0x0189, B:67:0x018f, B:68:0x01b4, B:70:0x01b8, B:72:0x01cb, B:73:0x01d3, B:75:0x01dd, B:76:0x01e6, B:79:0x01f9, B:81:0x021d, B:82:0x0226, B:84:0x0250, B:85:0x0259, B:87:0x0260, B:89:0x0269, B:90:0x026c, B:92:0x0277, B:94:0x027b, B:95:0x0287, B:99:0x0296, B:98:0x0293, B:100:0x02a6, B:102:0x02b0, B:103:0x02b9, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d6, B:110:0x02e7, B:113:0x02ec), top: B:119:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(Context context, String str, boolean z, InitializationListener initializationListener, IronSource.AD_UNIT... ad_unitArr) {
        com.ironsource.d.b bVar;
        IronSourceError ironSourceError;
        Context applicationContext;
        boolean isInitResponseCached;
        com.ironsource.mediationsdk.utils.l r;
        ConcurrentHashMap<String, List<String>> d;
        AtomicBoolean atomicBoolean;
        String str2;
        IronLog.INTERNAL.verbose();
        if (initializationListener != null) {
            this.X = initializationListener;
        }
        AtomicBoolean atomicBoolean2 = this.w;
        if (atomicBoolean2 == null || !atomicBoolean2.compareAndSet(true, false)) {
            if (ad_unitArr != null) {
                D(z, ad_unitArr);
                if (Q.a().b() == Q.f.INITIATED && !z) {
                    o();
                    return;
                }
            } else {
                this.l.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
            }
            return;
        }
        if (ad_unitArr != null && ad_unitArr.length != 0) {
            for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
                this.B.add(ad_unit);
                this.C.add(ad_unit);
                if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                    this.L = true;
                }
                if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                    this.M = true;
                }
                if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                    this.K = true;
                }
            }
            IronLog.API.info("init(appKey:" + str + ")");
            if (context instanceof Activity) {
                ContextProvider.getInstance().updateActivity((Activity) context);
            }
            ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
            com.ironsource.environment.h.q();
            this.p0.b(IronSourceUtils.getSDKVersion());
            this.p0.a(com.ironsource.c.a.a());
            this.p0.b(IronSourceUtils.isGooglePlayInstalled(context));
            bVar = new com.ironsource.d.b();
            if (str != null) {
                ironSourceError = new IronSourceError(506, "Init Fail - appKey is missing");
            } else if (G(str, 5, 10)) {
                if (!m0(str)) {
                    ironSourceError = ErrorBuilder.buildInvalidCredentialsError("appKey", str, "should contain only english characters and numbers");
                }
                if (bVar.a()) {
                    this.j = str;
                }
                applicationContext = ContextProvider.getInstance().getApplicationContext();
                isInitResponseCached = IronSourceUtils.isInitResponseCached(applicationContext);
                long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(applicationContext);
                if (!isInitResponseCached && firstSessionTimestamp == -1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    IronLog.INTERNAL.verbose("get first session timestamp = " + currentTimeMillis);
                    IronSourceUtils.saveFirstSessionTimestamp(applicationContext, currentTimeMillis);
                }
                r = r(ContextProvider.getInstance().getApplicationContext(), this.k);
                if (r != null) {
                    com.ironsource.environment.g gVar = com.ironsource.environment.g.a;
                    com.ironsource.environment.g.a(r.c.e.f().a());
                    com.ironsource.environment.g.c(r.c.e.f().b());
                }
                d = com.ironsource.d.a.a().d();
                if (d.containsKey("is_deviceid_optout")) {
                    String str3 = d.get("is_deviceid_optout").get(0);
                    if (!TextUtils.isEmpty(str3)) {
                        boolean z2 = !MetaDataUtils.getMetaDataBooleanValue(str3);
                        com.ironsource.environment.g gVar2 = com.ironsource.environment.g.a;
                        com.ironsource.environment.g.b(z2);
                    }
                }
                atomicBoolean = this.s;
                if (atomicBoolean != null && atomicBoolean.compareAndSet(false, true)) {
                    com.ironsource.mediationsdk.a.i.a().a(new com.ironsource.mediationsdk.utils.h(context));
                    com.ironsource.mediationsdk.a.d.d().a(context, this.E);
                    com.ironsource.mediationsdk.a.h.d().a(context, this.E);
                    com.ironsource.mediationsdk.a.g.w.a(context, this.E);
                }
                if (this.j == null) {
                    Q.a().b(Q.f.INIT_FAILED);
                    if (this.B.contains(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                        ae.a().a(false, (AdInfo) null);
                    }
                    if (this.B.contains(IronSource.AD_UNIT.OFFERWALL)) {
                        this.q.a(false, bVar.b());
                    }
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, bVar.b().toString(), 1);
                    return;
                }
                this.p0.a(context);
                this.p0.a(this.j);
                this.p0.c(this.p);
                this.p0.d(ConfigFile.getConfigFile().getPluginType());
                if (this.D) {
                    StringBuilder sb = new StringBuilder();
                    JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z);
                    try {
                        String str4 = ",androidx=" + IronSourceUtils.isAndroidXAvailable();
                        String str5 = ",Activity=" + n();
                        if (a.AnonymousClass1.d()) {
                            sb.append(IronSourceConstants.IS_APP_LANGUAGE_KOTLIN);
                            str2 = a.AnonymousClass1.c();
                        } else {
                            str2 = IronSourceConstants.IS_APP_LANGUAGE_JAVA;
                        }
                        sb.append(str2);
                        sb.append(str4);
                        if (V()) {
                            sb.append(str5);
                        }
                        mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
                        if (ad_unitArr != null) {
                            for (IronSource.AD_UNIT ad_unit2 : ad_unitArr) {
                                mediationAdditionalData.put(ad_unit2.toString(), true);
                            }
                        }
                        int i = this.G + 1;
                        this.G = i;
                        mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(14, mediationAdditionalData));
                    this.D = false;
                }
                if (this.B.contains(IronSource.AD_UNIT.INTERSTITIAL)) {
                    Q.a().a(this.g);
                }
                Q.a().a(this);
                Q.a().a(this.o0);
                Q.a().a(context, str, this.k);
                return;
            } else {
                ironSourceError = ErrorBuilder.buildInvalidCredentialsError("appKey", str, "length should be between 5-10 characters");
            }
            bVar.a(ironSourceError);
            if (bVar.a()) {
            }
            applicationContext = ContextProvider.getInstance().getApplicationContext();
            isInitResponseCached = IronSourceUtils.isInitResponseCached(applicationContext);
            long firstSessionTimestamp2 = IronSourceUtils.getFirstSessionTimestamp(applicationContext);
            if (!isInitResponseCached) {
                long currentTimeMillis2 = System.currentTimeMillis();
                IronLog.INTERNAL.verbose("get first session timestamp = " + currentTimeMillis2);
                IronSourceUtils.saveFirstSessionTimestamp(applicationContext, currentTimeMillis2);
            }
            r = r(ContextProvider.getInstance().getApplicationContext(), this.k);
            if (r != null) {
            }
            d = com.ironsource.d.a.a().d();
            if (d.containsKey("is_deviceid_optout")) {
            }
            atomicBoolean = this.s;
            if (atomicBoolean != null) {
                com.ironsource.mediationsdk.a.i.a().a(new com.ironsource.mediationsdk.utils.h(context));
                com.ironsource.mediationsdk.a.d.d().a(context, this.E);
                com.ironsource.mediationsdk.a.h.d().a(context, this.E);
                com.ironsource.mediationsdk.a.g.w.a(context, this.E);
            }
            if (this.j == null) {
            }
        }
        IronSource.AD_UNIT[] values = IronSource.AD_UNIT.values();
        for (int i2 = 0; i2 < 4; i2++) {
            this.B.add(values[i2]);
        }
        this.K = true;
        this.L = true;
        this.M = true;
        IronLog.API.info("init(appKey:" + str + ")");
        if (context instanceof Activity) {
        }
        ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
        com.ironsource.environment.h.q();
        this.p0.b(IronSourceUtils.getSDKVersion());
        this.p0.a(com.ironsource.c.a.a());
        this.p0.b(IronSourceUtils.isGooglePlayInstalled(context));
        bVar = new com.ironsource.d.b();
        if (str != null) {
        }
        bVar.a(ironSourceError);
        if (bVar.a()) {
        }
        applicationContext = ContextProvider.getInstance().getApplicationContext();
        isInitResponseCached = IronSourceUtils.isInitResponseCached(applicationContext);
        long firstSessionTimestamp22 = IronSourceUtils.getFirstSessionTimestamp(applicationContext);
        if (!isInitResponseCached) {
        }
        r = r(ContextProvider.getInstance().getApplicationContext(), this.k);
        if (r != null) {
        }
        d = com.ironsource.d.a.a().d();
        if (d.containsKey("is_deviceid_optout")) {
        }
        atomicBoolean = this.s;
        if (atomicBoolean != null) {
        }
        if (this.j == null) {
        }
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placementName = " + str);
        if (this.J) {
            this.l.log(IronSourceLogger.IronSourceTag.API, "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", 3);
            C1281o.a().a(ironSourceBannerLayout, ErrorBuilder.buildInitFailedError("Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", "Banner"), false);
        } else if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            StringBuilder sb = new StringBuilder("loadBanner can't be called - ");
            sb.append(ironSourceBannerLayout == null ? "banner layout is null " : "banner layout is destroyed");
            String sb2 = sb.toString();
            this.l.log(IronSourceLogger.IronSourceTag.API, sb2, 3);
            C1281o.a().a(ironSourceBannerLayout, ErrorBuilder.buildLoadFailedError(sb2), false);
        } else if (!this.M) {
            this.l.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
            C1281o.a().a(ironSourceBannerLayout, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"), false);
        } else if (ironSourceBannerLayout.getSize().getDescription().equals("CUSTOM") && (ironSourceBannerLayout.getSize().getWidth() <= 0 || ironSourceBannerLayout.getSize().getHeight() <= 0)) {
            this.l.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
            C1281o.a().a(ironSourceBannerLayout, ErrorBuilder.unsupportedBannerSize(""), false);
        } else {
            Q.f b2 = Q.a().b();
            if (b2 == Q.f.INIT_FAILED) {
                this.l.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                C1281o.a().a(ironSourceBannerLayout, new IronSourceError(600, "Init() had failed"), false);
            } else if (b2 == Q.f.INIT_IN_PROGRESS) {
                if (Q.a().c()) {
                    this.l.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C1281o.a().a(ironSourceBannerLayout, new IronSourceError(601, "Init had failed"), false);
                    return;
                }
                this.P = ironSourceBannerLayout;
                this.O = Boolean.TRUE;
                this.Q = str;
            } else if (!k()) {
                this.l.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
                C1281o.a().a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "the server response does not contain banner data"), false);
            } else {
                synchronized (this.O) {
                    C1282p c1282p = this.i;
                    if (c1282p == null && this.U == null) {
                        this.P = ironSourceBannerLayout;
                        this.O = Boolean.TRUE;
                        this.Q = str;
                    } else if (this.g0) {
                        this.U.a(ironSourceBannerLayout, p0(str));
                    } else {
                        c1282p.a(ironSourceBannerLayout, p0(str));
                    }
                }
            }
        }
    }

    public final synchronized void a(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (levelPlayRewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.K) {
            if (levelPlayRewardedVideoManualListener == null) {
                this.a0 = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.a0 = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        ae.a().b = levelPlayRewardedVideoManualListener;
    }

    public final synchronized void a(RewardedVideoManualListener rewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (rewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.K) {
            if (rewardedVideoManualListener == null) {
                this.a0 = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.a0 = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        this.q.a = rewardedVideoManualListener;
        ae.a().a = rewardedVideoManualListener;
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.l;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.q != null) {
                for (IronSource.AD_UNIT ad_unit : this.B) {
                    x(ad_unit, true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            ironLog.verbose(checkMetaDataKeyValidity);
        } else if (checkMetaDataValueValidity.length() > 0) {
            ironLog.verbose(checkMetaDataValueValidity);
        } else {
            MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
            String metaDataKey = formatMetaData.getMetaDataKey();
            List<String> metaDataValue = formatMetaData.getMetaDataValue();
            if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
                C1272d.a().a(metaDataKey, metaDataValue);
            } else if (Q.a().b() == Q.f.INITIATED && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                ironLog.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            } else {
                com.ironsource.d.a.a().a(metaDataKey, metaDataValue);
            }
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C1272d.a().i;
                concurrentHashMap.putAll(com.ironsource.d.a.a().d());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                this.p0.a(jSONObject);
            } catch (JSONException e) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
            com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(Q.a().b() == Q.f.INITIATED ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
        }
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(List<IronSource.AD_UNIT> list, boolean z, com.ironsource.mediationsdk.model.h hVar) {
        IronLog.INTERNAL.verbose();
        try {
            this.y = list;
            this.x = true;
            this.l.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(114, mediationAdditionalData));
            }
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            if (currentActiveActivity != null) {
                String screenSizeParams = AdapterUtils.getScreenSizeParams(currentActiveActivity);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_EXT1, screenSizeParams);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.TROUBLESHOOTING_SCREEN_SIZE, jSONObject));
            }
            com.ironsource.mediationsdk.a.d.d().c();
            com.ironsource.mediationsdk.a.h.d().c();
            C1272d a2 = C1272d.a();
            String str = this.j;
            String str2 = this.k;
            a2.e = str;
            a2.f = str2;
            IronSource.AD_UNIT[] values = IronSource.AD_UNIT.values();
            for (int i = 0; i < 4; i++) {
                IronSource.AD_UNIT ad_unit = values[i];
                if (this.B.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        M(ad_unit);
                    } else {
                        x(ad_unit, false);
                    }
                }
            }
            o();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    @Nullable
    public final String b(@NotNull Context context) {
        String str;
        com.ironsource.mediationsdk.utils.p pVar;
        u(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED, null);
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            return null;
        }
        Q.f b2 = Q.a().b();
        Q.f fVar = Q.f.NOT_INIT;
        if (b2 == fVar) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            u(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, null);
            return null;
        } else if (b2 == Q.f.INIT_FAILED) {
            IronLog.API.error("bidding data cannot be retrieved, SDK failed to initialize");
            u(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, null);
            return null;
        } else {
            try {
                com.ironsource.mediationsdk.utils.l lVar = this.u;
                if (lVar == null) {
                    lVar = H.a(context);
                }
                if (b2 == fVar) {
                    this.p0.a(context);
                    this.p0.b(IronSourceUtils.getSDKVersion());
                    this.p0.c(this.p);
                    this.p0.d(ConfigFile.getConfigFile().getPluginType());
                    this.p0.a(com.ironsource.c.a.a());
                    this.p0.b(IronSourceUtils.isGooglePlayInstalled(context));
                }
                if (b2 != Q.f.INITIATED) {
                    Q.a().a(lVar);
                    if (lVar != null) {
                        Q.a().a(context, lVar);
                    }
                }
                if (lVar == null || !lVar.b()) {
                    pVar = new com.ironsource.mediationsdk.utils.p();
                } else {
                    pVar = lVar.c.e.c();
                    if (!pVar.d) {
                        pVar.b = lVar.b.a(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
                    }
                }
                JSONObject a2 = am.a(context, pVar);
                C1274f.a().a(a2, true);
                str = pVar.e ? IronSourceAES.compressAndEncrypt(a2.toString()) : IronSourceAES.encrypt(a2.toString());
            } catch (Throwable th) {
                u(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, null);
                IronLog ironLog = IronLog.API;
                ironLog.error("got error during token creation: " + th.getMessage());
                str = null;
            }
            if (str == null) {
                u(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, null);
            }
            return str;
        }
    }

    public final synchronized void b(Activity activity, String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.l;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        if (!this.K) {
            this.l.log(ironSourceTag, "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()", 3);
            ad.a().a(str, new IronSourceError(508, "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()"));
        } else if (!this.H) {
            this.l.log(ironSourceTag, "Rewarded video was initialized in mediation mode", 3);
            ad.a().a(str, new IronSourceError(508, "Rewarded video was initialized in mediation mode"));
        } else {
            boolean z = false;
            if (activity != null) {
                ContextProvider.getInstance().updateActivity(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                if (str2 != null) {
                    z = true;
                }
                u(IronSourceConstants.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, z, 1));
                this.l.log(ironSourceTag, "Rewarded video was initialized and loaded without Activity", 3);
                ad.a().a(str, new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, "Rewarded video was initialized and loaded without Activity"));
                return;
            }
            Q.f b2 = Q.a().b();
            if (b2 == Q.f.INIT_FAILED) {
                this.l.log(ironSourceTag, "init() had failed", 3);
                ad.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (b2 == Q.f.INIT_IN_PROGRESS) {
                if (Q.a().c()) {
                    this.l.log(ironSourceTag, "init() had failed", 3);
                    ad.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                synchronized (this.j0) {
                    this.j0.add(str);
                }
                if (str2 != null) {
                    u(IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, this.h0));
                }
            } else if (!P()) {
                this.l.log(ironSourceTag, "No rewarded video configurations found", 3);
                ad.a().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                synchronized (this.j0) {
                    ve3 ve3Var = this.m0;
                    if (ve3Var == null) {
                        this.j0.add(str);
                        if (str2 != null) {
                            u(IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, this.h0));
                        }
                    } else if (str2 == null) {
                        ve3Var.a(str, (String) null, false);
                    } else {
                        ve3Var.a(str, str2, true);
                    }
                }
            }
        }
    }

    public final void b(boolean z) {
        this.R = Boolean.valueOf(z);
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setConsent : " + z, 1);
        C1272d.a().a(z);
        if (this.e != null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.l;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag2, "Offerwall | setConsent(consent:" + z + ")", 1);
            this.e.setConsent(z);
        }
        int i = z ? 40 : 41;
        this.p0.a(z);
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i, IronSourceUtils.getMediationAdditionalData(false)));
    }

    public final synchronized void c(Activity activity, String str, String str2) {
        if (str2 != null) {
            d(activity, str, str2);
            return;
        }
        this.l.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
        E.a().a(str, new IronSourceError(510, "adm cannot be null"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
        if (r3.c() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        if (r3.b() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:26:0x0040, B:28:0x0048, B:29:0x005e, B:33:0x0067), top: B:41:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        boolean z;
        boolean z2;
        try {
            if (this.H) {
                this.l.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead", 3);
                return false;
            }
            try {
                if (!this.a0 && !this.c0) {
                    if (!this.Z) {
                        z2 = this.f.c();
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                        if (this.Z) {
                        }
                        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(z2 ? IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE : IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, mediationAdditionalData));
                        IronSourceLoggerManager ironSourceLoggerManager = this.l;
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                        ironSourceLoggerManager.log(ironSourceTag, "isRewardedVideoAvailable():" + z2, 1);
                        return z2;
                    }
                    D d = this.S;
                    if (d != null) {
                    }
                    z2 = false;
                    JSONObject mediationAdditionalData2 = IronSourceUtils.getMediationAdditionalData(false);
                    if (this.Z) {
                        C(mediationAdditionalData2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.h0)}});
                    }
                    com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(z2 ? IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE : IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, mediationAdditionalData2));
                    IronSourceLoggerManager ironSourceLoggerManager2 = this.l;
                    IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.API;
                    ironSourceLoggerManager2.log(ironSourceTag2, "isRewardedVideoAvailable():" + z2, 1);
                    return z2;
                }
                JSONObject mediationAdditionalData22 = IronSourceUtils.getMediationAdditionalData(false);
                if (this.Z) {
                }
                com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(z2 ? IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE : IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, mediationAdditionalData22));
                IronSourceLoggerManager ironSourceLoggerManager22 = this.l;
                IronSourceLogger.IronSourceTag ironSourceTag22 = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager22.log(ironSourceTag22, "isRewardedVideoAvailable():" + z2, 1);
                return z2;
            } catch (Throwable th) {
                z = z2;
                th = th;
                IronSourceLoggerManager ironSourceLoggerManager3 = this.l;
                IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager3.log(ironSourceTag3, "isRewardedVideoAvailable():" + z, 1);
                this.l.logException(ironSourceTag3, "isRewardedVideoAvailable()", th);
                return false;
            }
            com.ironsource.mediationsdk.adunit.c.h hVar = this.W;
            if (hVar != null) {
            }
            z2 = false;
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    public final boolean c(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.l;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, this.b + ":setDynamicUserId(dynamicUserId:" + str + ")", 1);
            com.ironsource.d.b bVar = new com.ironsource.d.b();
            if (!G(str, 1, 128)) {
                bVar.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, IronSourceConstants.SUPERSONIC_CONFIG_NAME, "dynamicUserId is invalid, should be between 1-128 chars in length."));
            }
            if (!bVar.a()) {
                IronSourceLoggerManager.getLogger().log(ironSourceTag, bVar.b().toString(), 2);
                return false;
            }
            this.m = str;
            com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(52, IronSourceUtils.getJsonForUserId(true)));
            return true;
        } catch (Exception e) {
            this.l.logException(IronSourceLogger.IronSourceTag.API, this.b + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    public final synchronized void d(Activity activity, String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.l;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadISDemandOnlyInterstitial() instanceId=" + str, 1);
        if (!this.L) {
            this.l.log(ironSourceTag, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()", 3);
            E.a().a(str, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
        } else if (!this.I) {
            this.l.log(ironSourceTag, "Interstitial was initialized in mediation mode. Use loadInterstitial instead", 3);
            E.a().a(str, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
        } else {
            boolean z = false;
            if (activity != null) {
                ContextProvider.getInstance().updateActivity(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                if (str2 != null) {
                    z = true;
                }
                L(IronSourceConstants.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, z, 1));
                this.l.log(ironSourceTag, "Interstitial was initialized and loaded without Activity", 3);
                E.a().a(str, new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_MISSING_ACTIVITY, "Interstitial was initialized and loaded without Activity"));
                return;
            }
            Q.f b2 = Q.a().b();
            if (b2 == Q.f.INIT_FAILED) {
                this.l.log(ironSourceTag, "init() had failed", 3);
                E.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            } else if (b2 == Q.f.INIT_IN_PROGRESS) {
                if (Q.a().c()) {
                    this.l.log(ironSourceTag, "init() had failed", 3);
                    E.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
                synchronized (this.i0) {
                    this.i0.add(str);
                }
                if (str2 != null) {
                    L(IronSourceConstants.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, 1));
                }
            } else if (!S()) {
                this.l.log(ironSourceTag, "No interstitial configurations found", 3);
                E.a().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
            } else {
                synchronized (this.i0) {
                    ue3 ue3Var = this.l0;
                    if (ue3Var == null) {
                        this.i0.add(str);
                        if (str2 != null) {
                            L(IronSourceConstants.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, 1));
                        }
                    } else if (str2 == null) {
                        ue3Var.a(str, (String) null, false);
                    } else {
                        ue3Var.a(str, str2, true);
                    }
                }
            }
        }
    }

    public final void d(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.l;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, this.b + ":setMediationType(mediationType:" + str + ")", 1);
            if (G(str, 1, 64) && m0(str)) {
                this.o = str;
            } else {
                this.l.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            }
        } catch (Exception e) {
            this.l.logException(IronSourceLogger.IronSourceTag.API, this.b + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    public final void e(String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.l;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.H) {
                this.l.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                ae.a().a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (!O()) {
                ae.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (this.Z) {
                c0(str);
            } else {
                Placement d0 = d0(str);
                if (d0 != null) {
                    this.f.o(d0);
                    this.f.a(d0.getPlacementName());
                }
            }
        } catch (Exception e) {
            this.l.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            ae.a().a(new IronSourceError(510, e.getMessage()), (AdInfo) null);
        }
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void f() {
        synchronized (this.O) {
            if (this.O.booleanValue()) {
                this.O = Boolean.FALSE;
                C1281o.a().a(this.P, new IronSourceError(603, "init had failed"), false);
                this.P = null;
                this.Q = null;
            }
        }
        if (this.f0) {
            this.f0 = false;
            C1286u.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.b0) {
            this.b0 = false;
            C1286u.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.i0) {
            Iterator<String> it = this.i0.iterator();
            while (it.hasNext()) {
                E.a().a(it.next(), ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            }
            this.i0.clear();
        }
        synchronized (this.j0) {
            Iterator<String> it2 = this.j0.iterator();
            while (it2.hasNext()) {
                ad.a().a(it2.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.j0.clear();
        }
        synchronized (this.k0) {
            Iterator<String> it3 = this.k0.iterator();
            while (it3.hasNext()) {
                m.a().a(it3.next(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
            }
            this.k0.clear();
            this.N.clear();
        }
    }

    public final synchronized void f(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.l;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        try {
        } catch (Exception e) {
            this.l.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyRewardedVideo", e);
            ad.a().b(str, new IronSourceError(510, e.getMessage()));
        }
        if (!this.H) {
            this.l.log(ironSourceTag, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead", 3);
            ad.a().b(str, new IronSourceError(508, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
            return;
        }
        ve3 ve3Var = this.m0;
        if (ve3Var == null) {
            this.l.log(ironSourceTag, "Rewarded video was not initiated", 3);
            ad.a().b(str, new IronSourceError(508, "Rewarded video was not initiated"));
        } else if (ve3Var.a.containsKey(str)) {
            z zVar = ve3Var.a.get(str);
            ve3Var.a(IronSourceConstants.RV_INSTANCE_SHOW, zVar);
            zVar.a();
        } else {
            ve3.c(1500, str);
            ad.a().b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean g(String str) {
        boolean z;
        ve3 ve3Var = this.m0;
        if (ve3Var != null) {
            if (ve3Var.a.containsKey(str)) {
                z zVar = ve3Var.a.get(str);
                if (zVar.b()) {
                    ve3.b(IronSourceConstants.RV_INSTANCE_READY_TRUE, zVar, null);
                    z = true;
                    if (z) {
                        return true;
                    }
                } else {
                    ve3.b(IronSourceConstants.RV_INSTANCE_READY_FALSE, zVar, null);
                }
            } else {
                ve3.c(1500, str);
            }
            z = false;
            if (z) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(String str) {
        String str2 = "showInterstitial(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.l;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.I) {
                this.l.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                F.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), null);
            } else if (!R()) {
                F.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), null);
            } else if (this.d0) {
                i0(str);
            } else {
                InterstitialPlacement j0 = j0(str);
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    if (j0 != null) {
                        str = j0.getPlacementName();
                    }
                    mediationAdditionalData.put("placement", str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(2100, mediationAdditionalData));
                if (j0 != null) {
                    this.g.p(j0);
                    he3 he3Var = this.g;
                    j0.getPlacementName();
                    he3Var.d();
                }
            }
        } catch (Exception e2) {
            this.l.logException(IronSourceLogger.IronSourceTag.API, str2, e2);
            F.a().a(new IronSourceError(510, e2.getMessage()), null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r3.b() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
        if (r3.e() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        boolean z;
        boolean z2;
        try {
            if (this.I) {
                this.l.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead", 3);
                return false;
            }
            if (!this.d0) {
                he3 he3Var = this.g;
                if (he3Var != null) {
                }
            } else if (this.e0) {
                com.ironsource.mediationsdk.adunit.c.g gVar = this.V;
                if (gVar != null) {
                }
            } else {
                ke3 ke3Var = this.T;
                z2 = ke3Var != null && ke3Var.f();
            }
            try {
                com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(z2 ? IronSourceConstants.IS_CHECK_READY_TRUE : IronSourceConstants.IS_CHECK_READY_FALSE, IronSourceUtils.getMediationAdditionalData(false, this.d0, 1)));
                IronSourceLoggerManager ironSourceLoggerManager = this.l;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isInterstitialReady():" + z2, 1);
                return z2;
            } catch (Throwable th) {
                z = z2;
                th = th;
                IronSourceLoggerManager ironSourceLoggerManager2 = this.l;
                IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager2.log(ironSourceTag2, "isInterstitialReady():" + z, 1);
                this.l.logException(ironSourceTag2, "isInterstitialReady()", th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean i(String str) {
        boolean z;
        ue3 ue3Var = this.l0;
        if (ue3Var != null) {
            if (ue3Var.a.containsKey(str)) {
                C1288x c1288x = ue3Var.a.get(str);
                if (c1288x.b()) {
                    ue3.b(IronSourceConstants.IS_INSTANCE_READY_TRUE, c1288x, null);
                    z = true;
                    if (z) {
                        return true;
                    }
                } else {
                    ue3.b(IronSourceConstants.IS_INSTANCE_READY_FALSE, c1288x, null);
                }
            } else {
                ue3.c(2500, str);
            }
            z = false;
            if (z) {
            }
        }
        return false;
    }

    public final void j(String str) {
        String str2 = "showOfferwall(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.l;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (!T()) {
                this.q.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            com.ironsource.mediationsdk.model.k a2 = this.u.c.c.a(str);
            if (a2 == null) {
                this.l.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a2 = this.u.c.c.a();
                if (a2 == null) {
                    this.l.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.h.a(a2.b);
        } catch (Exception e) {
            this.l.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            this.q.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public final InterstitialPlacement k(String str) {
        try {
            InterstitialPlacement f0 = f0(str);
            if (f0 == null) {
                try {
                    this.l.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    f0 = Q();
                } catch (Exception unused) {
                    return f0;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.l;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + f0, 1);
            return f0;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Placement l(String str) {
        try {
            Placement Z = Z(str);
            if (Z == null) {
                try {
                    this.l.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    Z = J();
                } catch (Exception unused) {
                    return Z;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.l;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + Z, 1);
            return Z;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final boolean l() {
        try {
            je3 je3Var = this.h;
            if (je3Var != null) {
                return je3Var.a();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m() {
        String str;
        String str2;
        JSONObject a2;
        u(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED, null);
        IronLog ironLog = IronLog.API;
        ironLog.info();
        com.ironsource.mediationsdk.utils.l lVar = this.u;
        if (lVar == null) {
            ironLog.error("bidding data cannot be retrieved, SDK not initialized");
        } else {
            NetworkSettings a3 = lVar.b.a(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
            if (a3 != null) {
                JSONObject jSONObject = new JSONObject();
                AbstractAdapter a4 = C1272d.a().a(a3, a3.getApplicationSettings(), true, false);
                if (a4 != null) {
                    try {
                        jSONObject = a4.getPlayerBiddingData();
                    } catch (Exception e) {
                        e = e;
                        str = null;
                        u(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, null);
                        IronLog.API.error("got error during creating the token: " + e.getMessage());
                        str2 = str;
                        if (str2 == null) {
                        }
                        return str2;
                    }
                }
                com.ironsource.mediationsdk.utils.p c2 = this.u.c.e.c();
                if (c2.d) {
                    a2 = new com.ironsource.environment.f.b().a();
                    C1274f.a().a(a2, true);
                } else {
                    a2 = C1274f.a().a(jSONObject, c2.c, c2.a);
                }
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("bidding data: " + a2);
                if (a2 != null) {
                    ironLog2.verbose("raw biddingData length: " + a2.toString().length());
                    str2 = c2.e ? IronSourceAES.compressAndEncrypt(a2.toString()) : IronSourceAES.encrypt(a2.toString());
                    if (str2 != null) {
                        try {
                            ironLog2.verbose("biddingData length: " + str2.length());
                        } catch (Exception e2) {
                            str = str2;
                            e = e2;
                            u(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, null);
                            IronLog.API.error("got error during creating the token: " + e.getMessage());
                            str2 = str;
                            if (str2 == null) {
                            }
                            return str2;
                        }
                    }
                    if (str2 == null) {
                        u(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, null);
                    }
                    return str2;
                }
            }
        }
        str2 = null;
        if (str2 == null) {
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01c7 A[Catch: all -> 0x02dc, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x000e, B:11:0x0016, B:17:0x0068, B:19:0x0099, B:21:0x00a3, B:23:0x00a9, B:25:0x00b3, B:27:0x00b9, B:29:0x00c3, B:31:0x00c9, B:33:0x00d3, B:35:0x00e1, B:36:0x014d, B:41:0x01c7, B:42:0x0233, B:46:0x02ab, B:48:0x02b1, B:49:0x02cc, B:44:0x0238, B:45:0x02a5, B:38:0x0152, B:39:0x01bf, B:50:0x02da, B:13:0x001c, B:15:0x002d), top: B:55:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b1 A[Catch: all -> 0x02dc, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x000e, B:11:0x0016, B:17:0x0068, B:19:0x0099, B:21:0x00a3, B:23:0x00a9, B:25:0x00b3, B:27:0x00b9, B:29:0x00c3, B:31:0x00c9, B:33:0x00d3, B:35:0x00e1, B:36:0x014d, B:41:0x01c7, B:42:0x0233, B:46:0x02ab, B:48:0x02b1, B:49:0x02cc, B:44:0x0238, B:45:0x02a5, B:38:0x0152, B:39:0x01bf, B:50:0x02da, B:13:0x001c, B:15:0x002d), top: B:55:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.ironsource.mediationsdk.utils.l s(Context context, String str, a aVar) {
        com.ironsource.mediationsdk.a.h d;
        boolean z;
        com.ironsource.mediationsdk.a.d d2;
        boolean z2;
        synchronized (this.t) {
            com.ironsource.mediationsdk.utils.l lVar = this.u;
            if (lVar != null) {
                return new com.ironsource.mediationsdk.utils.l(lVar);
            }
            com.ironsource.mediationsdk.utils.l K = K(context, str, aVar);
            if (K == null || !K.b()) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                K = r(context, str);
                if (K != null) {
                    IronSourceError buildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(this.j, str);
                    IronSourceLoggerManager ironSourceLoggerManager = this.l;
                    ironSourceLoggerManager.log(ironSourceTag, buildUsingCachedConfigurationError.toString() + ": " + K.toString(), 1);
                    com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(140, IronSourceUtils.getMediationAdditionalData(false)));
                }
            }
            if (K != null) {
                this.u = K;
                IronSourceUtils.saveLastResponse(context, K.toString());
                com.ironsource.mediationsdk.utils.l lVar2 = this.u;
                this.r.setDebugLevel(lVar2.c.e.a().a);
                this.l.setLoggerDebugLevel("console", lVar2.c.e.a().b);
                boolean z3 = O() ? lVar2.c.a.b.b : false;
                boolean z4 = R() ? lVar2.c.b.b.b : false;
                boolean z5 = j() ? lVar2.c.d.a.b : false;
                boolean z6 = T() ? lVar2.c.c.c.b : false;
                com.ironsource.mediationsdk.utils.j h = lVar2.c.e.h();
                boolean a2 = h.a();
                if (z3) {
                    com.ironsource.mediationsdk.model.c cVar = lVar2.c.a.b;
                    com.ironsource.mediationsdk.a.h.d().b(cVar.e, context);
                    com.ironsource.mediationsdk.a.h.d().a(cVar.d, context);
                    com.ironsource.mediationsdk.a.h.d().b(cVar.g);
                    com.ironsource.mediationsdk.a.h.d().c(cVar.h);
                    com.ironsource.mediationsdk.a.h.d().a(cVar.f);
                    com.ironsource.mediationsdk.a.h.d().a(cVar.i, context);
                    com.ironsource.mediationsdk.a.h.d().b(cVar.j, context);
                    com.ironsource.mediationsdk.a.h.d().c(cVar.k, context);
                    com.ironsource.mediationsdk.a.h.d().d(cVar.l, context);
                    com.ironsource.mediationsdk.a.h.d().a(lVar2.c.e.b());
                    d = com.ironsource.mediationsdk.a.h.d();
                    z = cVar.c;
                } else if (z6) {
                    com.ironsource.mediationsdk.model.c cVar2 = lVar2.c.c.c;
                    com.ironsource.mediationsdk.a.h.d().b(cVar2.e, context);
                    com.ironsource.mediationsdk.a.h.d().a(cVar2.d, context);
                    com.ironsource.mediationsdk.a.h.d().b(cVar2.g);
                    com.ironsource.mediationsdk.a.h.d().c(cVar2.h);
                    com.ironsource.mediationsdk.a.h.d().a(cVar2.f);
                    com.ironsource.mediationsdk.a.h.d().a(cVar2.i, context);
                    com.ironsource.mediationsdk.a.h.d().b(cVar2.j, context);
                    com.ironsource.mediationsdk.a.h.d().c(cVar2.k, context);
                    com.ironsource.mediationsdk.a.h.d().d(cVar2.l, context);
                    com.ironsource.mediationsdk.a.h.d().a(lVar2.c.e.b());
                    d = com.ironsource.mediationsdk.a.h.d();
                    z = cVar2.c;
                } else {
                    com.ironsource.mediationsdk.a.h.d().f = false;
                    if (!z4) {
                        com.ironsource.mediationsdk.model.c cVar3 = lVar2.c.b.b;
                        com.ironsource.mediationsdk.a.d.d().b(cVar3.e, context);
                        com.ironsource.mediationsdk.a.d.d().a(cVar3.d, context);
                        com.ironsource.mediationsdk.a.d.d().b(cVar3.g);
                        com.ironsource.mediationsdk.a.d.d().c(cVar3.h);
                        com.ironsource.mediationsdk.a.d.d().a(cVar3.f);
                        com.ironsource.mediationsdk.a.d.d().a(cVar3.i, context);
                        com.ironsource.mediationsdk.a.d.d().b(cVar3.j, context);
                        com.ironsource.mediationsdk.a.d.d().c(cVar3.k, context);
                        com.ironsource.mediationsdk.a.d.d().d(cVar3.l, context);
                        com.ironsource.mediationsdk.a.d.d().a(lVar2.c.e.b());
                        d2 = com.ironsource.mediationsdk.a.d.d();
                        z2 = cVar3.c;
                    } else if (z5) {
                        com.ironsource.mediationsdk.model.c cVar4 = lVar2.c.d.a;
                        com.ironsource.mediationsdk.a.d.d().b(cVar4.e, context);
                        com.ironsource.mediationsdk.a.d.d().a(cVar4.d, context);
                        com.ironsource.mediationsdk.a.d.d().b(cVar4.g);
                        com.ironsource.mediationsdk.a.d.d().c(cVar4.h);
                        com.ironsource.mediationsdk.a.d.d().a(cVar4.f);
                        com.ironsource.mediationsdk.a.d.d().a(cVar4.i, context);
                        com.ironsource.mediationsdk.a.d.d().b(cVar4.j, context);
                        com.ironsource.mediationsdk.a.d.d().c(cVar4.k, context);
                        com.ironsource.mediationsdk.a.d.d().d(cVar4.l, context);
                        com.ironsource.mediationsdk.a.d.d().a(lVar2.c.e.b());
                        d2 = com.ironsource.mediationsdk.a.d.d();
                        z2 = cVar4.c;
                    } else {
                        com.ironsource.mediationsdk.a.d.d().f = false;
                        com.ironsource.mediationsdk.a.g gVar = com.ironsource.mediationsdk.a.g.w;
                        gVar.f = a2;
                        if (a2) {
                            gVar.a(h.b(), context);
                            gVar.a(h.d(), context);
                            gVar.b(h.e(), context);
                            gVar.c = h.c();
                        }
                        com.ironsource.mediationsdk.a.d.d().a = true;
                        com.ironsource.mediationsdk.a.h.d().a = true;
                        gVar.a = true;
                    }
                    d2.c = z2;
                    com.ironsource.mediationsdk.a.g gVar2 = com.ironsource.mediationsdk.a.g.w;
                    gVar2.f = a2;
                    if (a2) {
                    }
                    com.ironsource.mediationsdk.a.d.d().a = true;
                    com.ironsource.mediationsdk.a.h.d().a = true;
                    gVar2.a = true;
                }
                d.c = z;
                if (!z4) {
                }
                d2.c = z2;
                com.ironsource.mediationsdk.a.g gVar22 = com.ironsource.mediationsdk.a.g.w;
                gVar22.f = a2;
                if (a2) {
                }
                com.ironsource.mediationsdk.a.d.d().a = true;
                com.ironsource.mediationsdk.a.h.d().a = true;
                gVar22.a = true;
            }
            return K;
        }
    }

    public final synchronized void v(AbstractAdapter abstractAdapter) {
        this.e = abstractAdapter;
    }
}