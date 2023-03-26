package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.p7700g.p99005.wo1;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.e  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1273e {
    private static final C1273e a = new C1273e();
    public final ConcurrentHashMap<String, String> b;
    public final ConcurrentHashMap<String, String> c;

    private C1273e() {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        this.b = concurrentHashMap;
        concurrentHashMap.put("adcolony", "4.1.6");
        concurrentHashMap.put("vungle", "4.1.5");
        concurrentHashMap.put("applovin", "4.3.3");
        concurrentHashMap.put("admob", "4.3.2");
        ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
        this.c = concurrentHashMap2;
        concurrentHashMap2.put("adcolony", "4.1.6");
        concurrentHashMap2.put("admob", "4.3.2");
        concurrentHashMap2.put("applovin", "4.3.3");
        concurrentHashMap2.put("chartboost", "4.1.9");
        concurrentHashMap2.put("fyber", "4.1.0");
        concurrentHashMap2.put("hyprmx", "4.1.2");
        concurrentHashMap2.put("inmobi", "4.3.1");
        concurrentHashMap2.put("maio", "4.1.3");
        concurrentHashMap2.put("tapjoy", "4.0.0");
        concurrentHashMap2.put("unityads", "4.1.4");
        concurrentHashMap2.put("vungle", "4.1.5");
    }

    public static C1273e a() {
        return a;
    }

    private static boolean c(String str, String str2) {
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i = 0; i < 3; i++) {
            int parseInt = Integer.parseInt(split[i]);
            int parseInt2 = Integer.parseInt(split2[i]);
            if (parseInt2 < parseInt) {
                return false;
            }
            if (parseInt2 > parseInt) {
                return true;
            }
        }
        return true;
    }

    public final boolean a(AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return false;
        }
        String version = abstractAdapter.getVersion();
        boolean c = c("4.3.0", version);
        if (!c) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, abstractAdapter.getProviderName() + " adapter " + version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + ", please update your adapter to the latest version", 3);
        }
        return c;
    }

    public boolean b(AbstractAdapter abstractAdapter, Map<String, String> map, String str) {
        if (abstractAdapter == null) {
            return false;
        }
        String lowerCase = abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH);
        if (map.containsKey(lowerCase)) {
            String version = abstractAdapter.getVersion();
            boolean c = c(map.get(lowerCase), version);
            if (!c) {
                StringBuilder sb = new StringBuilder();
                sb.append(abstractAdapter.getProviderName());
                sb.append(" adapter ");
                sb.append(version);
                sb.append(" is incompatible with SDK version ");
                sb.append(IronSourceUtils.getSDKVersion());
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, wo1.D(sb, " for ", str, " ad unit, please update your adapter to the latest version"), 3);
            }
            return c;
        }
        return true;
    }
}