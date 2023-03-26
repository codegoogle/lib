package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.anythink.expressad.foundation.c.d;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p7700g.p99005.wo1;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class h implements Runnable {
    private Context W;
    private final String s = h.class.getSimpleName();
    private final String t = "bundleId";
    private final String u = "advertisingId";
    private final String v = "isLimitAdTrackingEnabled";
    private final String w = "appKey";
    private final String x = "deviceOS";
    private final String y = "osVersion";
    private final String z = "connectionType";
    private final String A = "language";
    private final String B = "deviceOEM";
    private final String C = "deviceModel";
    private final String D = "mobileCarrier";
    private final String E = "externalFreeMemory";
    private final String F = "internalFreeMemory";
    private final String G = "battery";
    private final String H = "gmtMinutesOffset";
    private final String I = "appVersion";
    private final String J = "sessionId";
    private final String K = "pluginType";
    private final String L = "pluginVersion";
    private final String M = "plugin_fw_v";
    private final String N = "jb";
    private final String O = "advertisingIdType";
    private final String P = "mt";
    private final String Q = "firstSession";
    private final String R = "mcc";
    private final String S = "mnc";
    private final String T = "icc";
    private final String U = com.anythink.expressad.foundation.g.a.V;
    private final String V = "auid";

    private h() {
    }

    public h(Context context) {
        this.W = context.getApplicationContext();
    }

    private static String a() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e);
            return "";
        }
    }

    private static String b() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e);
            return "";
        }
    }

    private static String c() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e);
            return "";
        }
    }

    private String d() {
        try {
            return this.W.getPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String e() {
        try {
            String str = Build.VERSION.RELEASE;
            int i = Build.VERSION.SDK_INT;
            return i + "(" + str + ")";
        } catch (Exception unused) {
            return "";
        }
    }

    private static String f() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String h() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    private String i() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.W.getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                return !networkOperatorName.equals("") ? networkOperatorName : "";
            }
            return "";
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, wo1.C(new StringBuilder(), this.s, ":getMobileCarrier()"), e);
            return "";
        }
    }

    private static boolean j() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception unused) {
            return false;
        }
    }

    private static long k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / PlaybackStateCompat.M;
        } catch (Exception unused) {
            return -1L;
        }
    }

    private int l() {
        try {
            Intent registerReceiver = this.W.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(d.a.w, -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, wo1.C(new StringBuilder(), this.s, ":getBatteryLevel()"), e);
            return -1;
        }
    }

    private int m() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(GregorianCalendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, wo1.C(new StringBuilder(), this.s, ":getGmtMinutesOffset()"), e);
            return 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z;
        long j;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sessionId", IronSourceUtils.getSessionId());
            String d = d();
            if (!TextUtils.isEmpty(d)) {
                hashMap.put("bundleId", d);
                String c = com.ironsource.environment.c.c(this.W, d);
                if (!TextUtils.isEmpty(c)) {
                    hashMap.put("appVersion", c);
                }
            }
            hashMap.put("appKey", L.a().j);
            String[] C = com.ironsource.environment.h.C(this.W);
            boolean z2 = true;
            String str2 = "";
            if (C == null || C.length != 2) {
                str = "";
                z = false;
            } else {
                str = !TextUtils.isEmpty(C[0]) ? C[0] : "";
                z = Boolean.valueOf(C[1]).booleanValue();
            }
            if (TextUtils.isEmpty(str)) {
                str = com.ironsource.environment.h.x(this.W);
                if (!TextUtils.isEmpty(str)) {
                    str2 = IronSourceConstants.TYPE_UUID;
                }
            } else {
                str2 = IronSourceConstants.TYPE_GAID;
            }
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("advertisingId", str);
                hashMap.put("advertisingIdType", str2);
                hashMap.put("isLimitAdTrackingEnabled", Boolean.valueOf(z));
            }
            hashMap.put("deviceOS", "Android");
            if (!TextUtils.isEmpty(e())) {
                hashMap.put("osVersion", e());
            }
            String connectionType = IronSourceUtils.getConnectionType(this.W);
            if (!TextUtils.isEmpty(connectionType)) {
                hashMap.put("connectionType", connectionType);
            }
            hashMap.put("sdkVersion", IronSourceUtils.getSDKVersion());
            String f = f();
            if (!TextUtils.isEmpty(f)) {
                hashMap.put("language", f);
            }
            String g = g();
            if (!TextUtils.isEmpty(g)) {
                hashMap.put("deviceOEM", g);
            }
            String h = h();
            if (!TextUtils.isEmpty(h)) {
                hashMap.put("deviceModel", h);
            }
            String i = i();
            if (!TextUtils.isEmpty(i)) {
                hashMap.put("mobileCarrier", i);
            }
            hashMap.put("internalFreeMemory", Long.valueOf(k()));
            if (j()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                j = (statFs.getAvailableBlocks() * statFs.getBlockSize()) / PlaybackStateCompat.M;
            } else {
                j = -1;
            }
            hashMap.put("externalFreeMemory", Long.valueOf(j));
            hashMap.put("battery", Integer.valueOf(l()));
            int m = m();
            if (m > 840 || m < -720 || m % 15 != 0) {
                z2 = false;
            }
            if (z2) {
                hashMap.put("gmtMinutesOffset", Integer.valueOf(m));
            }
            String a = a();
            if (!TextUtils.isEmpty(a)) {
                hashMap.put("pluginType", a);
            }
            String b = b();
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("pluginVersion", b);
            }
            String c2 = c();
            if (!TextUtils.isEmpty(c2)) {
                hashMap.put("plugin_fw_v", c2);
            }
            String valueOf = String.valueOf(com.ironsource.environment.h.j());
            if (!TextUtils.isEmpty(valueOf)) {
                hashMap.put("jb", valueOf);
            }
            String str3 = L.a().o;
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put("mt", str3);
            }
            String valueOf2 = String.valueOf(IronSourceUtils.getFirstSession(this.W));
            if (!TextUtils.isEmpty(valueOf2)) {
                hashMap.put("firstSession", valueOf2);
            }
            String y = com.ironsource.environment.h.y(this.W);
            if (!TextUtils.isEmpty(y)) {
                hashMap.put("auid", y);
            }
            hashMap.put("mcc", Integer.valueOf(a.AnonymousClass1.c(this.W)));
            hashMap.put("mnc", Integer.valueOf(a.AnonymousClass1.d(this.W)));
            String j2 = com.ironsource.environment.h.j(this.W);
            if (!TextUtils.isEmpty(j2)) {
                hashMap.put("icc", j2);
            }
            String c3 = com.ironsource.environment.h.c();
            if (!TextUtils.isEmpty(c3)) {
                hashMap.put(com.anythink.expressad.foundation.g.a.V, c3);
            }
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("collecting data for events: " + hashMap);
            com.ironsource.mediationsdk.sdk.e.a().a(hashMap);
            IronSourceUtils.m(this.W, com.ironsource.mediationsdk.sdk.e.a().b());
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "Thread name = " + h.class.getSimpleName(), e);
        }
    }
}