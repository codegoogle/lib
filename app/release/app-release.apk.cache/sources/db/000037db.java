package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.android.gms.location.LocationListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.pg;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class OSUtils {
    public static final int a = -999;
    public static int b = 3;
    public static final int[] c = {401, aa.c.c, aa.c.d, com.anythink.expressad.video.dynview.a.a.t, 410};
    private static final int d = 0;
    private static final String e = "com.huawei.hwid";

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            b.values();
            int[] iArr = new int[3];
            a = iArr;
            try {
                iArr[b.DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.HTTPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.HTTP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        DATA("data"),
        HTTPS("https"),
        HTTP("http");
        
        private final String w;

        b(String str) {
            this.w = str;
        }

        public static b a(String str) {
            b[] values = values();
            for (int i = 0; i < 3; i++) {
                b bVar = values[i];
                if (bVar.w.equalsIgnoreCase(str)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    private static boolean A() {
        return true;
    }

    public static boolean C() {
        return new OSUtils().f() == 1;
    }

    public static boolean D() {
        return new OSUtils().f() == 2;
    }

    public static boolean E() {
        return S("com.google.android.gms");
    }

    private static boolean F() {
        return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(jm3.g) == 0;
    }

    private static boolean G() {
        return S(e);
    }

    public static boolean H() {
        return new OSUtils().f() == 13;
    }

    public static boolean I() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

    public static boolean J(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean K(String str) {
        if (str == null) {
            return false;
        }
        return Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(str).matches();
    }

    public static boolean L(String str) {
        return (str == null || str.matches("^[0-9]")) ? false : true;
    }

    @z1
    public static Bundle M(@x1 String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
            return bundle;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static <T> Set<T> N() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Set<String> O(JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    private static void P(@x1 Uri uri) {
        jm3.g.startActivity(R(uri));
    }

    public static void Q(@x1 String str) {
        P(Uri.parse(str.trim()));
    }

    @x1
    public static Intent R(@x1 Uri uri) {
        Intent makeMainSelectorActivity;
        b a2 = uri.getScheme() != null ? b.a(uri.getScheme()) : null;
        if (a2 == null) {
            a2 = b.HTTP;
            if (!uri.toString().contains("://")) {
                StringBuilder G = wo1.G("http://");
                G.append(uri.toString());
                uri = Uri.parse(G.toString());
            }
        }
        if (a2.ordinal() != 0) {
            makeMainSelectorActivity = new Intent("android.intent.action.VIEW", uri);
        } else {
            makeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            makeMainSelectorActivity.setData(uri);
        }
        makeMainSelectorActivity.addFlags(268435456);
        return makeMainSelectorActivity;
    }

    private static boolean S(@x1 String str) {
        try {
            return jm3.g.getPackageManager().getPackageInfo(str, 128).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static long[] T(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            Object opt = jSONObject.opt("vib_pt");
            if (opt instanceof String) {
                jSONArray = new JSONArray((String) opt);
            } else {
                jSONArray = (JSONArray) opt;
            }
            long[] jArr = new long[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                jArr[i] = jSONArray.optLong(i);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void U(Runnable runnable, int i) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, i);
    }

    public static void V(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static boolean W(@z1 String str) {
        if (str != null) {
            return false;
        }
        jm3.a(jm3.u0.INFO, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.");
        return true;
    }

    public static boolean X(int i) {
        for (int i2 : c) {
            if (i == i2) {
                return false;
            }
        }
        return true;
    }

    public static void Y(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    private boolean Z() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean a(Context context) {
        try {
            return pg.p(jm3.g).a();
        } catch (Throwable unused) {
            return true;
        }
    }

    private boolean a0() {
        if (s()) {
            return E();
        }
        return false;
    }

    private Integer b(Context context) {
        boolean A = A();
        boolean z = z();
        if (!A && !z) {
            jm3.a(jm3.u0.FATAL, "Could not find the Android Support Library. Please make sure it has been correctly added to your project.");
            return -3;
        } else if (A && z) {
            if (Build.VERSION.SDK_INT < 26 || p(context) < 26 || y()) {
                return null;
            }
            jm3.a(jm3.u0.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        } else {
            jm3.a(jm3.u0.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        }
    }

    private boolean b0() {
        if (v() && q()) {
            return F();
        }
        return false;
    }

    @x1
    public static Collection<String> d(@z1 Collection<Object> collection) {
        ArrayList arrayList = new ArrayList();
        if (collection == null) {
            return arrayList;
        }
        for (Object obj : collection) {
            if (obj instanceof String) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    public static String g(Context context, String str) {
        Bundle i = i(context);
        if (i != null) {
            return i.getString(str);
        }
        return null;
    }

    public static boolean h(Context context, String str) {
        Bundle i = i(context);
        if (i != null) {
            return i.getBoolean(str);
        }
        return false;
    }

    public static Bundle i(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e2) {
            jm3.b(jm3.u0.ERROR, "Manifest application info not found", e2);
            return null;
        }
    }

    public static int k(int i, int i2) {
        return new Random().nextInt((i2 + 1) - i) + i;
    }

    public static String l(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    public static String m(@x1 Throwable th) {
        return n(th).getMessage();
    }

    @x1
    public static Throwable n(@x1 Throwable th) {
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }

    public static Uri o(Context context, String str) {
        int identifier;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (L(str) && (identifier = resources.getIdentifier(str, "raw", packageName)) != 0) {
            return Uri.parse("android.resource://" + packageName + "/" + identifier);
        }
        int identifier2 = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
        if (identifier2 != 0) {
            return Uri.parse("android.resource://" + packageName + "/" + identifier2);
        }
        return null;
    }

    @Keep
    private static boolean opaqueHasClass(Class<?> cls) {
        return true;
    }

    public static int p(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 15;
        }
    }

    public static boolean q() {
        return u() && x();
    }

    public static boolean r(Activity activity, int i) {
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i) != 0;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean s() {
        try {
            return opaqueHasClass(FirebaseMessaging.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean t() {
        try {
            return opaqueHasClass(LocationListener.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean u() {
        try {
            return opaqueHasClass(AGConnectServicesConfig.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean v() {
        try {
            return opaqueHasClass(HuaweiApiAvailability.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean w() {
        try {
            return opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean x() {
        try {
            return opaqueHasClass(HmsInstanceId.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean y() {
        return true;
    }

    private static boolean z() {
        return true;
    }

    public int B(Context context, String str) {
        Integer c2;
        int f = f();
        try {
            UUID.fromString(str);
            if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(str) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(str)) {
                jm3.a(jm3.u0.ERROR, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com");
            }
            int i = 1;
            if (f == 1 && (c2 = c()) != null) {
                i = c2.intValue();
            }
            Integer b2 = b(context);
            return b2 != null ? b2.intValue() : i;
        } catch (Throwable th) {
            jm3.b(jm3.u0.FATAL, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", th);
            return -999;
        }
    }

    public Integer c() {
        if (s()) {
            return null;
        }
        jm3.a(jm3.u0.FATAL, "The Firebase FCM library is missing! Please make sure to include it in your project.");
        return -4;
    }

    public String e() {
        try {
            String networkOperatorName = ((TelephonyManager) jm3.g.getSystemService("phone")).getNetworkOperatorName();
            if ("".equals(networkOperatorName)) {
                return null;
            }
            return networkOperatorName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public int f() {
        if (Z()) {
            return 2;
        }
        if (a0()) {
            return 1;
        }
        if (b0()) {
            return 13;
        }
        return (!E() && G()) ? 13 : 1;
    }

    public Integer j() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) jm3.g.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            if (type != 1 && type != 9) {
                return 1;
            }
            return 0;
        }
        return null;
    }
}