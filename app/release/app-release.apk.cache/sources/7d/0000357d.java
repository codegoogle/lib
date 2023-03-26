package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C1272d;
import com.ironsource.mediationsdk.C1276h;
import com.ironsource.mediationsdk.C1287v;
import com.ironsource.mediationsdk.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.p7700g.p99005.md2;
import com.p7700g.p99005.wo1;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class k {
    private ConcurrentHashMap<String, C1287v> a = new ConcurrentHashMap<>();
    private final Map<String, Object> b;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] s = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) s.clone();
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            com.ironsource.mediationsdk.model.m.values();
            int[] iArr = new int[2];
            a = iArr;
            try {
                iArr[com.ironsource.mediationsdk.model.m.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.ironsource.mediationsdk.model.m.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public k(List<NetworkSettings> list, com.ironsource.mediationsdk.model.f fVar, String str, String str2) {
        HashMap R = wo1.R(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        R.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (fVar.h) {
            R.put("isOneFlow", 1);
        }
        this.b = R;
        String sessionId = IronSourceUtils.getSessionId();
        boolean z = fVar.h;
        C1276h c1276h = new C1276h(new com.ironsource.mediationsdk.i(fVar.g, z, sessionId));
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a2 = C1272d.a().a(networkSettings, networkSettings.getBannerSettings(), true, false);
                if (a2 != null) {
                    C1287v c1287v = new C1287v(str, str2, networkSettings, fVar.b, a2);
                    c1287v.b = c1276h;
                    c1287v.a(z);
                    this.a.put(c1287v.g(), c1287v);
                }
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    private static int a(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (IronSourceUtils.a(context, d(str, "CappingManager.IS_DELIVERY_ENABLED", str2), true)) {
            if (IronSourceUtils.a(context, d(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
                if (currentTimeMillis - IronSourceUtils.j(context, d(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), 0L) < IronSourceUtils.i(context, d(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), 0) * 1000) {
                    return a.c;
                }
            }
            if (IronSourceUtils.a(context, d(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
                int i = IronSourceUtils.i(context, d(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
                String d = d(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
                int i2 = IronSourceUtils.i(context, d, 0);
                String d2 = d(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2);
                if (currentTimeMillis >= IronSourceUtils.j(context, d2, 0L)) {
                    IronSourceUtils.n(context, d, 0);
                    IronSourceUtils.o(context, d2, 0L);
                } else if (i2 >= i) {
                    return a.b;
                }
            }
            return a.d;
        }
        return a.a;
    }

    public static synchronized void a(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (k.class) {
            if (context == null) {
                return;
            }
            com.ironsource.mediationsdk.model.l placementAvailabilitySettings = interstitialPlacement.getPlacementAvailabilitySettings();
            if (placementAvailabilitySettings == null) {
                return;
            }
            g(context, "Interstitial", interstitialPlacement.getPlacementName(), placementAvailabilitySettings);
        }
    }

    public static synchronized void a(Context context, Placement placement) {
        synchronized (k.class) {
            if (context == null) {
                return;
            }
            com.ironsource.mediationsdk.model.l placementAvailabilitySettings = placement.getPlacementAvailabilitySettings();
            if (placementAvailabilitySettings == null) {
                return;
            }
            g(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName(), placementAvailabilitySettings);
        }
    }

    public static synchronized void a(Context context, com.ironsource.mediationsdk.model.g gVar) {
        synchronized (k.class) {
            if (context == null) {
                return;
            }
            com.ironsource.mediationsdk.model.l placementAvailabilitySettings = gVar.getPlacementAvailabilitySettings();
            if (placementAvailabilitySettings == null) {
                return;
            }
            g(context, "Banner", gVar.getPlacementName(), placementAvailabilitySettings);
        }
    }

    public static synchronized boolean a(Context context, String str) {
        boolean z;
        synchronized (k.class) {
            z = a(context, "Interstitial", str) != a.d;
        }
        return z;
    }

    public static synchronized boolean a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        boolean z;
        synchronized (k.class) {
            z = a(context, c(ad_unit), str) != a.d;
        }
        return z;
    }

    public static synchronized int b(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (k.class) {
            if (context != null && interstitialPlacement != null) {
                if (interstitialPlacement.getPlacementAvailabilitySettings() != null) {
                    return a(context, "Interstitial", interstitialPlacement.getPlacementName());
                }
            }
            return a.d;
        }
    }

    public static synchronized int b(Context context, Placement placement) {
        synchronized (k.class) {
            if (context != null && placement != null) {
                if (placement.getPlacementAvailabilitySettings() != null) {
                    return a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
                }
            }
            return a.d;
        }
    }

    private static long b(com.ironsource.mediationsdk.model.m mVar) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(md2.a));
        int i = b.a[mVar.ordinal()];
        if (i == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    public static synchronized void b(Context context, String str, IronSource.AD_UNIT ad_unit) {
        synchronized (k.class) {
            h(context, c(ad_unit), str);
        }
    }

    public static synchronized boolean b(Context context, String str) {
        boolean z;
        synchronized (k.class) {
            z = a(context, "Banner", str) != a.d;
        }
        return z;
    }

    private static String c(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? "Interstitial" : ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.BANNER ? "Banner" : ad_unit.toString();
    }

    public static synchronized void c(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (k.class) {
            if (interstitialPlacement != null) {
                h(context, "Interstitial", interstitialPlacement.getPlacementName());
            }
        }
    }

    public static synchronized void c(Context context, Placement placement) {
        synchronized (k.class) {
            if (placement != null) {
                h(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
            }
        }
    }

    public static synchronized boolean c(Context context, String str) {
        boolean z;
        synchronized (k.class) {
            z = a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str) != a.d;
        }
        return z;
    }

    private static String d(String str, String str2, String str3) {
        return wo1.w(str, "_", str2, "_", str3);
    }

    public static synchronized void d(Context context, String str) {
        synchronized (k.class) {
            h(context, "Interstitial", str);
        }
    }

    private HashMap<String, Object> e() {
        return new HashMap<>(this.b);
    }

    public static synchronized void e(Context context, String str) {
        synchronized (k.class) {
            h(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str);
        }
    }

    private void f(int i, String str) {
        HashMap<String, Object> e = e();
        if (str == null) {
            str = "";
        }
        e.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, str);
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i, new JSONObject(e)));
    }

    public static synchronized void f(Context context, String str) {
        synchronized (k.class) {
            if (!TextUtils.isEmpty(str)) {
                h(context, "Banner", str);
            }
        }
    }

    private static void g(Context context, String str, String str2, com.ironsource.mediationsdk.model.l lVar) {
        boolean z = lVar.a;
        IronSourceUtils.l(context, d(str, "CappingManager.IS_DELIVERY_ENABLED", str2), z);
        if (z) {
            boolean z2 = lVar.b;
            IronSourceUtils.l(context, d(str, "CappingManager.IS_CAPPING_ENABLED", str2), z2);
            if (z2) {
                IronSourceUtils.n(context, d(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), lVar.e);
                IronSourceUtils.p(context, d(str, "CappingManager.CAPPING_TYPE", str2), lVar.d.toString());
            }
            boolean z3 = lVar.c;
            IronSourceUtils.l(context, d(str, "CappingManager.IS_PACING_ENABLED", str2), z3);
            if (z3) {
                IronSourceUtils.n(context, d(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), lVar.f);
            }
        }
    }

    private static void h(Context context, String str, String str2) {
        int i = 0;
        if (IronSourceUtils.a(context, d(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            IronSourceUtils.o(context, d(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.a(context, d(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            IronSourceUtils.i(context, d(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String d = d(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int i2 = IronSourceUtils.i(context, d, 0);
            if (i2 == 0) {
                String k = IronSourceUtils.k(context, d(str, "CappingManager.CAPPING_TYPE", str2), com.ironsource.mediationsdk.model.m.PER_DAY.toString());
                com.ironsource.mediationsdk.model.m mVar = null;
                com.ironsource.mediationsdk.model.m[] values = com.ironsource.mediationsdk.model.m.values();
                while (true) {
                    if (i >= 2) {
                        break;
                    }
                    com.ironsource.mediationsdk.model.m mVar2 = values[i];
                    if (mVar2.c.equals(k)) {
                        mVar = mVar2;
                        break;
                    }
                    i++;
                }
                IronSourceUtils.o(context, d(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2), b(mVar));
            }
            IronSourceUtils.n(context, d, i2 + 1);
        }
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        C1287v c1287v = this.a.get(str);
        if (c1287v != null) {
            c1287v.a(iSDemandOnlyBannerLayout);
            return;
        }
        f(IronSourceConstants.BN_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.sendBannerAdLoadFailed(str, buildNonExistentInstanceError);
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        C1287v c1287v = this.a.get(str);
        if (c1287v != null) {
            c1287v.a(iSDemandOnlyBannerLayout, str2);
            return;
        }
        f(IronSourceConstants.BN_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.sendBannerAdLoadFailed(str, buildNonExistentInstanceError);
    }

    public synchronized void a(String str) {
        C1287v c1287v = this.a.get(str);
        if (c1287v != null) {
            c1287v.b();
            return;
        }
        f(IronSourceConstants.BN_INSTANCE_NOT_FOUND_IN_DESTROY, str);
        IronLog.API.error(ErrorBuilder.buildNonExistentInstanceError("Banner").getErrorMessage());
    }
}