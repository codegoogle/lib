package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import com.p7700g.p99005.jm3;
import java.util.HashMap;
import java.util.Set;

/* compiled from: OneSignalPrefs.java */
/* loaded from: classes3.dex */
public class vm3 {
    public static final String A = "GT_FIREBASE_TRACKING_ENABLED";
    public static final String B = "OS_RESTORE_TTL_FILTER";
    public static final String C = "OS_CLEAR_GROUP_SUMMARY_CLICK";
    public static final String D = "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED";
    public static final String E = "PREFS_OS_DISABLE_GMS_MISSING_PROMPT";
    public static final String F = "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT";
    public static final String G = "PREFS_OS_LOCATION_SHARED";
    public static final String H = "PREFS_OS_RECEIVE_RECEIPTS_ENABLED";
    public static final String I = "PREFS_OS_OUTCOMES_V2";
    public static final String J = "PREFS_OS_ATTRIBUTED_INFLUENCES";
    public static final String K = "OS_EMAIL_ID";
    public static final String L = "PREFS_ONESIGNAL_EMAIL_ID_LAST";
    public static final String M = "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST";
    public static final String N = "PREFS_OS_SMS_ID";
    public static final String O = "PREFS_OS_SMS_ID_LAST";
    public static final String P = "PREFS_OS_SMS_NUMBER_LAST";
    public static final String Q = "PREFS_OS_CACHED_IAMS";
    public static final String R = "PREFS_OS_DISPLAYED_IAMS";
    public static final String S = "PREFS_OS_IMPRESSIONED_IAMS";
    public static final String T = "PREFS_OS_CLICKED_CLICK_IDS_IAMS";
    public static final String U = "PREFS_OS_PAGE_IMPRESSIONED_IAMS";
    public static final String V = "PREFS_OS_LAST_TIME_IAM_DISMISSED";
    public static final String W = "purchaseTokens";
    public static final String X = "ExistingPurchases";
    public static HashMap<String, HashMap<String, Object>> Y = null;
    public static a Z = null;
    public static final String a = jm3.class.getSimpleName();
    public static final String b = "GTPlayerPurchases";
    public static final String c = "OneSignalTriggers";
    public static final String d = "OS_LAST_LOCATION_TIME";
    public static final String e = "GT_SOUND_ENABLED";
    public static final String f = "OS_LAST_SESSION_TIME";
    public static final String g = "GT_VIBRATE_ENABLED";
    public static final String h = "OS_FILTER_OTHER_GCM_RECEIVERS";
    public static final String i = "GT_APP_ID";
    public static final String j = "GT_PLAYER_ID";
    public static final String k = "GT_UNSENT_ACTIVE_TIME";
    public static final String l = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
    public static final String m = "ONESIGNAL_USERSTATE_DEPENDVALYES_";
    public static final String n = "ONESIGNAL_USERSTATE_SYNCVALYES_";
    public static final String o = "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST";
    public static final String p = "ONESIGNAL_SUBSCRIPTION_LAST";
    public static final String q = "ONESIGNAL_PLAYER_ID_LAST";
    public static final String r = "ONESIGNAL_PUSH_TOKEN_LAST";
    public static final String s = "ONESIGNAL_PERMISSION_ACCEPTED_LAST";
    public static final String t = "GT_DO_NOT_SHOW_MISSING_GPS";
    public static final String u = "ONESIGNAL_SUBSCRIPTION";
    public static final String v = "ONESIGNAL_SYNCED_SUBSCRIPTION";
    public static final String w = "GT_REGISTRATION_ID";
    public static final String x = "ONESIGNAL_USER_PROVIDED_CONSENT";
    public static final String y = "PREFS_OS_ETAG_PREFIX_";
    public static final String z = "PREFS_OS_HTTP_CACHE_PREFIX_";

    /* compiled from: OneSignalPrefs.java */
    /* loaded from: classes3.dex */
    public static class a extends HandlerThread {
        private static final int s = 200;
        @z1
        private Handler t;
        private long u;
        private boolean v;

        /* compiled from: OneSignalPrefs.java */
        /* renamed from: com.p7700g.p99005.vm3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0262a implements Runnable {
            public RunnableC0262a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c();
            }
        }

        public a(String str) {
            super(str);
            this.u = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            for (String str : vm3.Y.keySet()) {
                SharedPreferences.Editor edit = vm3.f(str).edit();
                HashMap<String, Object> hashMap = vm3.Y.get(str);
                synchronized (hashMap) {
                    for (String str2 : hashMap.keySet()) {
                        Object obj = hashMap.get(str2);
                        if (obj instanceof String) {
                            edit.putString(str2, (String) obj);
                        } else if (obj instanceof Boolean) {
                            edit.putBoolean(str2, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof Integer) {
                            edit.putInt(str2, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            edit.putLong(str2, ((Long) obj).longValue());
                        } else if (obj instanceof Set) {
                            edit.putStringSet(str2, (Set) obj);
                        } else if (obj == null) {
                            edit.remove(str2);
                        }
                    }
                    hashMap.clear();
                }
                edit.apply();
            }
            this.u = jm3.X0().b();
        }

        private synchronized void d() {
            Handler handler = this.t;
            if (handler == null) {
                return;
            }
            handler.removeCallbacksAndMessages(null);
            if (this.u == 0) {
                this.u = jm3.X0().b();
            }
            RunnableC0262a runnableC0262a = new RunnableC0262a();
            this.t.postDelayed(runnableC0262a, (this.u - jm3.X0().b()) + 200);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void e() {
            if (jm3.g == null) {
                return;
            }
            f();
            d();
        }

        private void f() {
            if (this.v) {
                return;
            }
            start();
            this.v = true;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
            this.t = new Handler(getLooper());
            d();
        }
    }

    static {
        i();
    }

    @z1
    private static Object a(String str, String str2, Class cls, Object obj) {
        HashMap<String, Object> hashMap = Y.get(str);
        synchronized (hashMap) {
            if (cls.equals(Object.class) && hashMap.containsKey(str2)) {
                return Boolean.TRUE;
            }
            Object obj2 = hashMap.get(str2);
            if (obj2 == null && !hashMap.containsKey(str2)) {
                SharedPreferences f2 = f(str);
                if (f2 != null) {
                    if (cls.equals(String.class)) {
                        return f2.getString(str2, (String) obj);
                    }
                    if (cls.equals(Boolean.class)) {
                        return Boolean.valueOf(f2.getBoolean(str2, ((Boolean) obj).booleanValue()));
                    }
                    if (cls.equals(Integer.class)) {
                        return Integer.valueOf(f2.getInt(str2, ((Integer) obj).intValue()));
                    }
                    if (cls.equals(Long.class)) {
                        return Long.valueOf(f2.getLong(str2, ((Long) obj).longValue()));
                    }
                    if (cls.equals(Set.class)) {
                        return f2.getStringSet(str2, (Set) obj);
                    }
                    if (cls.equals(Object.class)) {
                        return Boolean.valueOf(f2.contains(str2));
                    }
                    return null;
                }
                return obj;
            }
            return obj2;
        }
    }

    public static boolean b(String str, String str2, boolean z2) {
        return ((Boolean) a(str, str2, Boolean.class, Boolean.valueOf(z2))).booleanValue();
    }

    public static int c(String str, String str2, int i2) {
        return ((Integer) a(str, str2, Integer.class, Integer.valueOf(i2))).intValue();
    }

    public static long d(String str, String str2, long j2) {
        return ((Long) a(str, str2, Long.class, Long.valueOf(j2))).longValue();
    }

    public static Object e(String str, String str2, Object obj) {
        return a(str, str2, Object.class, obj);
    }

    public static synchronized SharedPreferences f(String str) {
        synchronized (vm3.class) {
            Context context = jm3.g;
            if (context == null) {
                jm3.b(jm3.u0.WARN, "OneSignal.appContext null, could not read " + str + " from getSharedPreferences.", new Throwable());
                return null;
            }
            return context.getSharedPreferences(str, 0);
        }
    }

    public static String g(String str, String str2, String str3) {
        return (String) a(str, str2, String.class, str3);
    }

    @z1
    public static Set<String> h(@x1 String str, @x1 String str2, @z1 Set<String> set) {
        return (Set) a(str, str2, Set.class, set);
    }

    public static void i() {
        HashMap<String, HashMap<String, Object>> hashMap = new HashMap<>();
        Y = hashMap;
        hashMap.put(a, new HashMap<>());
        Y.put(b, new HashMap<>());
        Y.put(c, new HashMap<>());
        Z = new a("OSH_WritePrefs");
    }

    private static void j(String str, String str2, Object obj) {
        HashMap<String, Object> hashMap = Y.get(str);
        synchronized (hashMap) {
            hashMap.put(str2, obj);
        }
        q();
    }

    public static void k(String str, String str2, boolean z2) {
        j(str, str2, Boolean.valueOf(z2));
    }

    public static void l(String str, String str2, int i2) {
        j(str, str2, Integer.valueOf(i2));
    }

    public static void m(String str, String str2, long j2) {
        j(str, str2, Long.valueOf(j2));
    }

    public static void n(String str, String str2, Object obj) {
        j(str, str2, obj);
    }

    public static void o(String str, String str2, String str3) {
        j(str, str2, str3);
    }

    public static void p(@x1 String str, @x1 String str2, @x1 Set<String> set) {
        j(str, str2, set);
    }

    public static void q() {
        Z.e();
    }
}