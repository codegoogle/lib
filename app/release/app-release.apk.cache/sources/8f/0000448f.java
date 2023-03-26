package com.p7700g.p99005;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.appcompat.widget.ActivityChooserModel;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.rs2;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: ContextCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class gh {
    private static final String a = "ContextCompat";
    private static final Object b = new Object();
    private static final Object c = new Object();
    private static TypedValue d;

    /* compiled from: ContextCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @e1
        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        @e1
        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @e1
        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        @e1
        public static Drawable b(Context context, int i) {
            return context.getDrawable(i);
        }

        @e1
        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @e1
        public static int a(Context context, int i) {
            return context.getColor(i);
        }

        @e1
        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @e1
        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        @e1
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @e1
        public static File b(Context context) {
            return context.getDataDir();
        }

        @e1
        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: ContextCompat.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class f {
        private f() {
        }

        @e1
        public static ComponentName a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* compiled from: ContextCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class g {
        private g() {
        }

        @e1
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* compiled from: ContextCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class h {
        private h() {
        }

        @e1
        public static String a(Context context) {
            return context.getAttributionTag();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static final class i {
        public static final HashMap<Class<?>, String> a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            a = hashMap;
            if (Build.VERSION.SDK_INT >= 22) {
                hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, rs2.f.a.v0);
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            hashMap.put(AlarmManager.class, kg.v0);
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, ik3.b);
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, qm3.b.a);
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, k21.b);
            hashMap.put(WindowManager.class, "window");
        }

        private i() {
        }
    }

    public static int a(@x1 Context context, @x1 String str) {
        ep.e(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    @z1
    public static Context b(@x1 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(context);
        }
        return null;
    }

    private static File c(File file) {
        synchronized (c) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                file.getPath();
            }
            return file;
        }
    }

    @z1
    public static String d(@x1 Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return h.a(context);
        }
        return null;
    }

    @x1
    public static File e(@x1 Context context) {
        return c.a(context);
    }

    @w0
    public static int f(@x1 Context context, @y0 int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.a(context, i2);
        }
        return context.getResources().getColor(i2);
    }

    @z1
    public static ColorStateList g(@x1 Context context, @y0 int i2) {
        return oi.f(context.getResources(), i2, context.getTheme());
    }

    @z1
    public static File h(@x1 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    @z1
    public static Drawable i(@x1 Context context, @f1 int i2) {
        return c.b(context, i2);
    }

    @x1
    public static File[] j(@x1 Context context) {
        return b.a(context);
    }

    @x1
    public static File[] k(@x1 Context context, @z1 String str) {
        return b.b(context, str);
    }

    @x1
    public static Executor l(@x1 Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return g.a(context);
        }
        return rm.a(new Handler(context.getMainLooper()));
    }

    @z1
    public static File m(@x1 Context context) {
        return c.c(context);
    }

    @x1
    public static File[] n(@x1 Context context) {
        return b.c(context);
    }

    @z1
    public static <T> T o(@x1 Context context, @x1 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) d.b(context, cls);
        }
        String p = p(context, cls);
        if (p != null) {
            return (T) context.getSystemService(p);
        }
        return null;
    }

    @z1
    public static String p(@x1 Context context, @x1 Class<?> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.c(context, cls);
        }
        return i.a.get(cls);
    }

    public static boolean q(@x1 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.c(context);
        }
        return false;
    }

    public static boolean r(@x1 Context context, @x1 Intent[] intentArr) {
        return s(context, intentArr, null);
    }

    public static boolean s(@x1 Context context, @x1 Intent[] intentArr, @z1 Bundle bundle) {
        a.a(context, intentArr, bundle);
        return true;
    }

    public static void t(@x1 Context context, @x1 Intent intent, @z1 Bundle bundle) {
        a.b(context, intent, bundle);
    }

    public static void u(@x1 Context context, @x1 Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}