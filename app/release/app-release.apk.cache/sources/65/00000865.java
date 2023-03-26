package com.anythink.expressad.foundation.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.UUID;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public final class j extends c {
    private static final String a = "SameDiTool";
    private static String b = null;
    private static String c = null;
    private static int d = -1;
    private static int e = -1;
    private static int f = -1;
    private static String g = "";
    private static String h = "";
    private static String i = "";
    private static String j = "";
    private static int k = 0;
    private static String l = "";
    private static String m = "";
    private static int n = -1;
    private static String o = "";
    private static int p;

    /* renamed from: com.anythink.expressad.foundation.h.j$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ Context a;

        public AnonymousClass2(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public final void run() {
            Context context;
            ConnectivityManager connectivityManager;
            try {
                if (com.anythink.core.common.b.m.a().a("network_type")) {
                    return;
                }
                try {
                    if (!com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b() || (context = this.a) == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                        return;
                    }
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        int unused = j.f = 0;
                    } else if (activeNetworkInfo.getType() == 1) {
                        int unused2 = j.f = 9;
                    } else {
                        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
                        if (telephonyManager == null) {
                            int unused3 = j.f = 0;
                        } else {
                            int unused4 = j.f = j.a(telephonyManager.getNetworkType());
                        }
                    }
                } catch (Exception unused5) {
                }
            } catch (Throwable th) {
                n.b(j.a, th.getMessage(), th);
                int unused6 = j.f = 0;
            }
        }
    }

    private j() {
    }

    @SuppressLint({"MissingPermission"})
    public static int a() {
        try {
            Context e2 = com.anythink.core.common.b.m.a().e();
            if (com.anythink.core.common.b.m.a().a("network_type")) {
                return f;
            }
            try {
                if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b()) {
                    if (e2 == null) {
                        return f;
                    }
                    if (f != -1) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(e2);
                        if (com.anythink.expressad.foundation.g.h.a.b().getActiveCount() <= 0) {
                            com.anythink.expressad.foundation.g.h.a.b().execute(anonymousClass2);
                        }
                        return f;
                    }
                    f = 0;
                    return 0;
                }
                return f;
            } catch (Exception unused) {
                return f;
            }
        } catch (Throwable th) {
            n.b(a, th.getMessage(), th);
            f = 0;
            return 0;
        }
    }

    public static int a(int i2) {
        if (i2 != 20) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 2;
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
                    return 4;
                default:
                    return 0;
            }
        }
        return 5;
    }

    public static int c(Context context) {
        if (context == null) {
            return k;
        }
        int i2 = k;
        if (i2 == 0) {
            try {
                int i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                k = i3;
                return i3;
            } catch (Exception e2) {
                e2.printStackTrace();
                return -1;
            }
        }
        return i2;
    }

    public static String d(Context context) {
        if (context == null) {
            return j;
        }
        try {
            if (TextUtils.isEmpty(j)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                j = str;
                return str;
            }
            return j;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int e(Context context) {
        if (com.anythink.core.common.b.m.a().a("screen")) {
            return 0;
        }
        try {
            if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b() && context != null) {
                try {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    HashMap g2 = g(context);
                    return g2.get("width") == null ? displayMetrics.widthPixels : ((Integer) g2.get("width")).intValue();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return 0;
                }
            }
            return 0;
        } catch (Exception unused) {
        }
    }

    public static int f(Context context) {
        if (com.anythink.core.common.b.m.a().a("screen")) {
            return 0;
        }
        try {
            if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b() && context != null) {
                try {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    HashMap g2 = g(context);
                    return g2.get("height") == null ? displayMetrics.heightPixels : ((Integer) g2.get("height")).intValue();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return 0;
                }
            }
            return 0;
        } catch (Exception unused) {
        }
    }

    public static HashMap g(Context context) {
        HashMap hashMap = new HashMap();
        if (context == null) {
            return hashMap;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            hashMap.put("height", Integer.valueOf(displayMetrics.heightPixels));
            hashMap.put("width", Integer.valueOf(displayMetrics.widthPixels));
        } catch (Exception e2) {
            n.b(a, e2.getMessage(), e2);
        }
        return hashMap;
    }

    public static String h(Context context) {
        if (context == null) {
            return i;
        }
        try {
            if (TextUtils.isEmpty(i)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                i = str;
                return str;
            }
            return i;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static void i(final Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c.a(context);
            } else {
                new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.anythink.expressad.foundation.h.j.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.a(context);
                    }
                });
            }
        } catch (Exception e2) {
            n.b(a, "", e2);
        }
    }

    private static void j(Context context) {
        try {
            h(context);
            d(context);
            c(context);
            b(context);
            com.anythink.expressad.foundation.g.a.bX = s.a("android.permission.WRITE_EXTERNAL_STORAGE", context);
            com.anythink.expressad.foundation.g.a.bW = s.a("android.permission.ACCESS_NETWORK_STATE", context);
            k(context);
        } catch (Throwable unused) {
        }
    }

    private static int k(Context context) {
        if (context == null) {
            return p;
        }
        if (p == 0) {
            try {
                p = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e2) {
                n.d(a, e2.getMessage());
            }
        }
        return p;
    }

    private static void l(Context context) {
        try {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
            if (com.anythink.expressad.foundation.g.h.a.b().getActiveCount() <= 0) {
                com.anythink.expressad.foundation.g.h.a.b().execute(anonymousClass2);
            }
        } catch (Throwable th) {
            n.d(a, th.getMessage());
        }
    }

    private static boolean m(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null) {
            return false;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
        } catch (Exception e2) {
            n.b(a, e2.getMessage(), e2);
        }
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 6.0d;
    }

    public static int b(Context context) {
        Configuration configuration;
        if (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null) {
            return 1;
        }
        int i2 = configuration.orientation;
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 1) {
        }
        return 1;
    }

    public static String b() {
        if (com.anythink.core.common.b.m.a().a("model")) {
            return "";
        }
        try {
            if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b()) {
                return Build.MANUFACTURER + " " + Build.MODEL;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c() {
        if (com.anythink.core.common.b.m.a().a("os_vc")) {
            return "";
        }
        try {
            if (com.anythink.core.common.b.o.a(com.anythink.core.common.b.m.a().e()).b()) {
                if (TextUtils.isEmpty(h)) {
                    h = String.valueOf(d());
                }
                return h;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    private static UUID e() {
        try {
            return UUID.randomUUID();
        } catch (Throwable th) {
            n.b(a, th.getMessage(), th);
            return null;
        }
    }

    private static int f() {
        return n;
    }

    public static int d() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static String a(Context context, int i2) {
        TelephonyManager telephonyManager;
        if (i2 == 0 || i2 == 9) {
            return "";
        }
        try {
            return (!com.anythink.expressad.foundation.g.a.bW || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
        } catch (Throwable th) {
            n.b(a, th.getMessage(), th);
            return "";
        }
    }

    private static void a(String str) {
        c = i.a(str);
        b = str;
    }

    private static String a(String str, Context context) {
        try {
        } catch (Exception e2) {
            n.b(a, e2.getMessage(), e2);
        }
        if (!TextUtils.isEmpty(o)) {
            return o;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            o = context.getPackageManager().getInstallerPackageName(str);
            n.a(a, "PKGSource:" + o);
        }
        return o;
    }
}