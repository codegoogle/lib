package com.ironsource.environment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.widget.ActivityChooserModel;
import com.anythink.expressad.foundation.c.d;
import com.p7700g.p99005.pt0;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class h {
    private static String a = null;
    private static String b = null;
    private static String c = "";
    private static String d = "";
    private static volatile String[] e;

    /* loaded from: classes3.dex */
    public static class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length <= 0 || objArr[0] == null) {
                        return null;
                    }
                    String obj2 = objArr[0].getClass().getMethod("getId", new Class[0]).invoke(objArr[0], new Object[0]).toString();
                    if (TextUtils.isEmpty(obj2)) {
                        return null;
                    }
                    String unused = h.d = obj2;
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements Runnable {
        private /* synthetic */ Context s;

        public b(Context context) {
            this.s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                WebView webView = new WebView(this.s);
                webView.setLayerType(1, null);
                String unused = h.c = webView.getSettings().getUserAgentString();
                webView.destroy();
                h.a(this.s, h.c);
            } catch (Exception unused2) {
            }
        }
    }

    public static String A(Context context) {
        return c(context) ? "Tablet" : "Phone";
    }

    public static String B(Context context) {
        g gVar = g.a;
        if (g.a()) {
            try {
                Class<?> cls = Class.forName("com.google.android.gms.appset.AppSet");
                Object invoke = cls.getMethod("getClient", Context.class).invoke(cls, context);
                Object invoke2 = invoke.getClass().getMethod("getAppSetIdInfo", new Class[0]).invoke(invoke, new Object[0]);
                Class<?> cls2 = Class.forName("com.google.android.gms.tasks.OnSuccessListener");
                invoke2.getClass().getMethod("addOnSuccessListener", cls2).invoke(invoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls2}, new a()));
                return !TextUtils.isEmpty(d) ? d : "";
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static String[] C(Context context) {
        String[] strArr = new String[0];
        g gVar = g.a;
        if (g.b()) {
            try {
                if (!g.c()) {
                    strArr = F(context);
                } else if (e == null) {
                    strArr = F(context);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        e = strArr;
                    }
                } else {
                    strArr = e;
                }
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    public static int D(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getIntFromDefaultSharedPrefs(context, "IABTCF_gdprApplies", -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String E(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, "IABTCF_TCString", null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String[] F(Context context) {
        Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
        Object invoke = cls.getMethod("getAdvertisingIdInfo", Context.class).invoke(cls, context);
        Method method = invoke.getClass().getMethod("getId", new Class[0]);
        Method method2 = invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]);
        String obj = method.invoke(invoke, new Object[0]).toString();
        boolean booleanValue = ((Boolean) method2.invoke(invoke, new Object[0])).booleanValue();
        StringBuilder sb = new StringBuilder();
        sb.append(booleanValue);
        return new String[]{obj, sb.toString()};
    }

    private static long G(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / PlaybackStateCompat.M;
    }

    private static boolean J(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i = 0; i < 8; i++) {
                String str2 = strArr[i];
                if (new File(str2 + str).exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static long a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    public static long a(String str) {
        return G(new File(str));
    }

    public static String a(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    public static synchronized void a(Context context, String str) {
        synchronized (h.class) {
            try {
                IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "Mediation_Shared_Preferences", "browser_user_agent", str);
            } catch (Exception unused) {
            }
        }
    }

    @TargetApi(19)
    public static boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    public static int b() {
        return -(TimeZone.getDefault().getOffset(a()) / 60000);
    }

    public static String b(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    public static String c() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    public static boolean c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.widthPixels / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    public static long d(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        return -1L;
    }

    public static boolean d() {
        return "mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable();
    }

    public static String e() {
        return Build.VERSION.RELEASE;
    }

    public static boolean e(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    public static int f() {
        return Build.VERSION.SDK_INT;
    }

    public static int f(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    public static String g() {
        return Build.MODEL;
    }

    public static boolean g(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static String h() {
        return Build.MANUFACTURER;
    }

    public static boolean h(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static String i() {
        return pt0.a;
    }

    public static String i(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    public static String j(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    public static boolean j() {
        return J("su");
    }

    public static int k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int k(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static float l(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1.0f;
        }
    }

    public static int l() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int m() {
        return k();
    }

    public static int m(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    public static int n() {
        return l();
    }

    public static String n(Context context) {
        if (context == null) {
            return "";
        }
        int m = m(context);
        if (m != 0) {
            if (m != 1) {
                if (m != 11) {
                    if (m != 12) {
                        switch (m) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    public static float o() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static int o(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public static long p() {
        return G(Environment.getDataDirectory());
    }

    public static List<ApplicationInfo> p(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    public static void q() {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
                c = defaultUserAgent;
                a(applicationContext, defaultUserAgent);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean q(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    public static File r(Context context) {
        return context.getExternalCacheDir();
    }

    public static String r() {
        Context applicationContext;
        if (!c.isEmpty() || (applicationContext = ContextProvider.getInstance().getApplicationContext()) == null) {
            return c;
        }
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(applicationContext, "Mediation_Shared_Preferences", "browser_user_agent", "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static File s(Context context) {
        return context.getExternalFilesDir(null);
    }

    public static File t(Context context) {
        return context.getCacheDir();
    }

    public static File u(Context context) {
        return context.getFilesDir();
    }

    public static int v(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(d.a.w, -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static boolean w(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static synchronized String x(Context context) {
        synchronized (h.class) {
            if (!TextUtils.isEmpty(a)) {
                return a;
            }
            if (IronSourceSharedPreferencesUtilities.a(context, "Mediation_Shared_Preferences", "uuidEnabled", true)) {
                String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "Mediation_Shared_Preferences", "cachedUUID", "");
                if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                    String uuid = UUID.randomUUID().toString();
                    a = uuid;
                    IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "Mediation_Shared_Preferences", "cachedUUID", uuid);
                } else {
                    a = stringFromSharedPrefs;
                }
            }
            return a;
        }
    }

    public static synchronized String y(Context context) {
        synchronized (h.class) {
            if (!TextUtils.isEmpty(b)) {
                return b;
            } else if (context == null) {
                return "";
            } else {
                String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "supersonic_shared_preferen", "auid", "");
                b = stringFromSharedPrefs;
                if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                    String uuid = UUID.randomUUID().toString();
                    b = uuid;
                    IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "supersonic_shared_preferen", "auid", uuid);
                }
                return b;
            }
        }
    }

    public static int z(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }
}