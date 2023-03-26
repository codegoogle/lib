package com.anythink.core.common.j;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.g;
import com.p7700g.p99005.tm4;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {
    public static String a = null;
    public static String b = null;
    public static String c = null;
    public static String d = "";
    public static String e = null;
    private static String f = null;
    private static String g = null;
    private static String h = null;
    private static String i = "";
    private static String j = "";
    private static String k = "";
    private static String l = "";
    private static String m = "";
    private static int n = 0;
    private static String o = "";
    private static String p = "";
    private static String q = null;
    private static String r = "";
    private static String s = "";

    private d() {
    }

    private static int a(int i2) {
        if (i2 != 20) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 1;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return 3;
                case 13:
                    return 13;
                default:
                    return -1;
            }
        }
        return 16;
    }

    public static void a(Context context) {
        try {
            d();
            k(context);
            i(context);
            h(context);
            g(context);
            a();
            b();
            d(context);
            f();
            f(context);
            c();
            n(context);
            a = n.b(context, com.anythink.core.common.b.g.o, g.o.e, "");
            if (h.a("android.permission.READ_PHONE_STATE", context)) {
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (!h.b(simOperator) || simOperator.length() <= 3) {
                    return;
                }
                r = simOperator.substring(0, 3);
                s = simOperator.substring(3, simOperator.length());
            }
        } catch (Exception unused) {
        }
    }

    public static String b(Context context) {
        if (com.anythink.core.common.b.m.a().a("mcc")) {
            return "";
        }
        if (context == null) {
            com.anythink.core.common.b.m.a();
        }
        try {
            return !com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b() ? "" : r;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(Context context) {
        if (com.anythink.core.common.b.m.a().a("mnc")) {
            return "";
        }
        if (context == null) {
            com.anythink.core.common.b.m.a();
        }
        try {
            return !com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b() ? "" : s;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(Context context) {
        if (com.anythink.core.common.b.m.a().a("android_id")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.m.a().e();
        }
        try {
            if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b()) {
                try {
                    if (h == null) {
                        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        h = string;
                        if (string == null) {
                            h = "";
                        }
                    }
                } catch (Exception unused) {
                    h = "";
                }
                return h;
            }
            return "";
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String e(Context context) {
        if (context == null) {
            return "";
        }
        e = null;
        try {
            if (TextUtils.isEmpty(null)) {
                String d2 = d(context);
                e = d2;
                e = f.b(d2);
            }
        } catch (Throwable unused) {
        }
        return e;
    }

    public static String f(Context context) {
        if (com.anythink.core.common.b.m.a().a("language")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.m.a().e();
        }
        try {
            if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b()) {
                if (TextUtils.isEmpty(o)) {
                    String language = context.getResources().getConfiguration().locale.getLanguage();
                    o = language;
                    return language;
                }
                return o;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static int g(Context context) {
        if (com.anythink.core.common.b.m.a().a("orient")) {
            return 0;
        }
        if (context == null) {
            context = com.anythink.core.common.b.m.a().e();
        }
        int i2 = context.getResources().getConfiguration().orientation;
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 1) {
        }
        return 1;
    }

    public static String h(Context context) {
        if (com.anythink.core.common.b.m.a().a("app_vc")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.m.a().e();
        }
        if (n == 0) {
            try {
                n = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                StringBuilder sb = new StringBuilder();
                sb.append(n);
                return sb.toString();
            } catch (Exception e2) {
                e2.printStackTrace();
                return "";
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(n);
        return sb2.toString();
    }

    public static String i(Context context) {
        if (com.anythink.core.common.b.m.a().a("app_vn")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.m.a().e();
        }
        try {
            if (TextUtils.isEmpty(m)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                m = str;
                return str;
            }
            return m;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String j(Context context) {
        if (com.anythink.core.common.b.m.a().a("screen")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.m.a().e();
        }
        try {
            if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b()) {
                StringBuilder sb = new StringBuilder();
                sb.append((context == null ? com.anythink.core.common.b.m.a().e() : context).getResources().getDisplayMetrics().widthPixels);
                sb.append(tm4.g);
                if (context == null) {
                    context = com.anythink.core.common.b.m.a().e();
                }
                sb.append(context.getResources().getDisplayMetrics().heightPixels);
                return sb.toString();
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String k(Context context) {
        if (com.anythink.core.common.b.m.a().a("package_name")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.m.a().e();
        }
        try {
            if (TextUtils.isEmpty(l)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                l = str;
                return str;
            }
            return l;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String l(Context context) {
        if (com.anythink.core.common.b.m.a().a("it_src")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.m.a().e();
        }
        try {
            if (TextUtils.isEmpty(b)) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(k(context));
                b = installerPackageName;
                return installerPackageName;
            }
            return b;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String m(Context context) {
        NetworkInfo activeNetworkInfo;
        if (com.anythink.core.common.b.m.a().a("network_type")) {
            return "";
        }
        try {
            if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b()) {
                if (context == null) {
                    return "-1";
                }
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    if (connectivityManager == null || !h.a("android.permission.ACCESS_NETWORK_STATE", context) || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                        return "-1";
                    }
                    int i2 = 1;
                    if (activeNetworkInfo.getType() == 1) {
                        return "-2";
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        return "-1";
                    }
                    int networkType = telephonyManager.getNetworkType();
                    StringBuilder sb = new StringBuilder();
                    if (networkType != 20) {
                        switch (networkType) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                                i2 = 3;
                                break;
                            case 13:
                                i2 = 13;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 16;
                    }
                    sb.append(i2);
                    return sb.toString();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return "-1";
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String n(Context context) {
        String str = q;
        if (str == null) {
            try {
                String str2 = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionName;
                q = str2;
                if (str2 == null) {
                    q = "";
                }
                return q;
            } catch (Exception unused) {
                q = "";
                return "";
            }
        }
        if (str == null) {
            q = "";
        }
        return q;
    }

    public static String o(Context context) {
        if (com.anythink.core.common.b.m.a().b() == null) {
            return "";
        }
        if (TextUtils.isEmpty(c)) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            c = String.valueOf(displayMetrics.density);
        }
        return c;
    }

    public static void p(Context context) {
        if (com.anythink.core.common.b.m.a().a("ua")) {
            return;
        }
        try {
            if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b()) {
                i = n.b(context, com.anythink.core.common.b.g.o, com.anythink.core.common.b.g.e, "");
                String b2 = n.b(context, com.anythink.core.common.b.g.o, com.anythink.core.common.b.g.f, "");
                if (TextUtils.isEmpty(i) || !Build.VERSION.RELEASE.equals(b2)) {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        if (TextUtils.isEmpty(i)) {
                        }
                        return;
                    }
                    try {
                        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                        i = defaultUserAgent;
                        n.a(context, com.anythink.core.common.b.g.o, com.anythink.core.common.b.g.e, defaultUserAgent);
                        n.a(context, com.anythink.core.common.b.g.o, com.anythink.core.common.b.g.f, Build.VERSION.RELEASE);
                    } catch (Throwable unused) {
                    }
                    if (TextUtils.isEmpty(i)) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    public static synchronized void q(Context context) {
        synchronized (d.class) {
            if (TextUtils.isEmpty(com.anythink.core.common.b.m.a().v())) {
                IExHandler b2 = com.anythink.core.common.b.m.a().b();
                String uniqueId = b2 != null ? b2.getUniqueId(context) : "";
                if (TextUtils.isEmpty(uniqueId)) {
                    uniqueId = r(context);
                }
                if (TextUtils.isEmpty(uniqueId) || Pattern.matches("^[0-]+$", uniqueId)) {
                    uniqueId = d(context);
                }
                if (TextUtils.isEmpty(uniqueId)) {
                    uniqueId = UUID.randomUUID().toString();
                }
                com.anythink.core.common.b.m.a().i(f.a(uniqueId));
                com.anythink.core.common.i.c.a("", "3", "", String.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public static synchronized String r(final Context context) {
        synchronized (d.class) {
            if (com.anythink.core.common.b.m.a().a("gaid")) {
                return "";
            }
            final ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
            final String[] strArr = new String[1];
            newFixedThreadPool.submit(new Runnable() { // from class: com.anythink.core.common.j.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        try {
                            Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                            Class<?> cls2 = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
                            strArr[0] = (String) cls2.getMethod("getId", new Class[0]).invoke(cls.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context), new Object[0]);
                        } catch (Throwable unused) {
                            strArr[0] = new com.anythink.core.common.b.c().a(context).a();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(strArr[0]) && !Pattern.matches("^[0-]+$", strArr[0])) {
                        d.a(strArr[0]);
                    }
                    try {
                        synchronized (newFixedThreadPool) {
                            newFixedThreadPool.notifyAll();
                        }
                    } catch (Throwable unused3) {
                    }
                }
            });
            try {
                synchronized (newFixedThreadPool) {
                    newFixedThreadPool.wait(2000L);
                }
                newFixedThreadPool.shutdown();
                if (strArr[0] != null) {
                    return strArr[0];
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        }
    }

    private static int s(Context context) {
        if (context == null) {
            context = com.anythink.core.common.b.m.a().e();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static int t(Context context) {
        if (context == null) {
            context = com.anythink.core.common.b.m.a().e();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    private static int u(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return -1;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || !h.a("android.permission.ACCESS_NETWORK_STATE", context) || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return -1;
            }
            if (activeNetworkInfo.getType() == 1) {
                return -2;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return -1;
            }
            return telephonyManager.getNetworkType();
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    private static void v(Context context) {
        a = n.b(context, com.anythink.core.common.b.g.o, g.o.e, "");
    }

    public static String b() {
        if (com.anythink.core.common.b.m.a().a("brand")) {
            return "";
        }
        try {
            return !com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b() ? "" : Build.BRAND;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c() {
        if (com.anythink.core.common.b.m.a().a("timezone")) {
            return "";
        }
        try {
            if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b()) {
                try {
                    if (TextUtils.isEmpty(p)) {
                        String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                        p = displayName;
                        return displayName;
                    }
                } catch (Throwable unused) {
                }
                return p;
            }
            return "";
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String g() {
        if (com.anythink.core.common.b.m.a().b() == null) {
            return "";
        }
        try {
            return new BigDecimal((System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000.0d).setScale(6, 4).toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String e() {
        if (com.anythink.core.common.b.m.a().a("os_vn")) {
            return "";
        }
        if (TextUtils.isEmpty(j)) {
            j = Build.VERSION.RELEASE;
        }
        return j;
    }

    public static String f() {
        try {
            if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b()) {
                if (TextUtils.isEmpty(g)) {
                    g = n.b(com.anythink.core.common.b.m.a().e(), com.anythink.core.common.b.g.o, com.anythink.core.common.b.g.r, "");
                }
                return g;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static JSONObject h() {
        if (!TextUtils.isEmpty(a)) {
            try {
                return new JSONObject(a);
            } catch (Exception unused) {
            }
        }
        return new JSONObject();
    }

    public static synchronized String i() {
        synchronized (d.class) {
            if (com.anythink.core.common.b.m.a().a("ua")) {
                return "";
            }
            try {
                if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b()) {
                    if (!TextUtils.isEmpty(i)) {
                        return i;
                    }
                    String str = Build.VERSION.RELEASE;
                    String a2 = a();
                    String str2 = Build.ID;
                    if (TextUtils.isEmpty(str) || TextUtils.isEmpty(a2) || TextUtils.isEmpty(str2)) {
                        return "";
                    }
                    return "Mozilla/5.0 (Linux; Android " + str + "; " + a2 + " Build/" + str2 + ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        }
    }

    private static int k() {
        return Build.VERSION.SDK_INT;
    }

    public static String d() {
        if (com.anythink.core.common.b.m.a().a("os_vc")) {
            return "";
        }
        try {
            if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b()) {
                if (TextUtils.isEmpty(k)) {
                    k = String.valueOf(Build.VERSION.SDK_INT);
                }
                return k;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    private static boolean c(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    public static String j() {
        if (!TextUtils.isEmpty(d)) {
            return d;
        }
        String F = com.anythink.core.common.b.m.a().F();
        if (!TextUtils.isEmpty(F)) {
            d = F;
            return F;
        }
        String F2 = com.anythink.core.common.b.m.a().F();
        if (TextUtils.isEmpty(F2)) {
            try {
                Class.forName("com.unity3d.player.UnityPlayer");
                F2 = "2";
            } catch (Throwable unused) {
                F2 = "1";
            }
            try {
                Class.forName("org.cocos2dx.lib.Cocos2dxActivity");
                Class.forName("org.cocos2dx.lib.Cocos2dxJavascriptJavaBridge");
                F2 = "4";
            } catch (Throwable unused2) {
            }
        }
        d = F2;
        return F2;
    }

    public static String a() {
        if (com.anythink.core.common.b.m.a().a("model")) {
            return "";
        }
        try {
            return !com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b() ? "" : Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    public static void a(String str) {
        g = str;
        n.a(com.anythink.core.common.b.m.a().e(), com.anythink.core.common.b.g.o, com.anythink.core.common.b.g.r, g);
    }

    public static synchronized void a(int i2, String str) {
        synchronized (d.class) {
            if (!TextUtils.isEmpty(a)) {
                try {
                    JSONObject jSONObject = new JSONObject(a);
                    if (jSONObject.has(String.valueOf(i2))) {
                        return;
                    }
                    jSONObject.put(String.valueOf(i2), str);
                    a = jSONObject.toString();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(String.valueOf(i2), str);
                a = jSONObject2.toString();
            } catch (Exception unused2) {
            }
        }
    }
}