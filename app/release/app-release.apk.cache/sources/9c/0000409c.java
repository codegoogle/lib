package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.OSUtils;
import com.p7700g.p99005.ii3;
import com.p7700g.p99005.jm3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LocationController.java */
/* loaded from: classes3.dex */
public class ej3 {
    private static final long a = 300;
    private static final long b = 600;
    public static final long c = 270000;
    public static final long d = 570000;
    private static boolean g;
    private static c i;
    public static Thread j;
    public static Context k;
    public static Location l;
    public static String m;
    private static final List<e> e = new ArrayList();
    private static ConcurrentHashMap<f, b> f = new ConcurrentHashMap<>();
    public static final Object h = new a();

    /* compiled from: LocationController.java */
    /* loaded from: classes3.dex */
    public class a {
    }

    /* compiled from: LocationController.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(d dVar);

        f getType();
    }

    /* compiled from: LocationController.java */
    /* loaded from: classes3.dex */
    public static class c extends HandlerThread {
        public Handler s;

        public c() {
            super("OSH_LocationHandlerThread");
            start();
            this.s = new Handler(getLooper());
        }
    }

    /* compiled from: LocationController.java */
    /* loaded from: classes3.dex */
    public static class d {
        public Double a;
        public Double b;
        public Float c;
        public Integer d;
        public Boolean e;
        public Long f;

        public String toString() {
            StringBuilder G = wo1.G("LocationPoint{lat=");
            G.append(this.a);
            G.append(", log=");
            G.append(this.b);
            G.append(", accuracy=");
            G.append(this.c);
            G.append(", type=");
            G.append(this.d);
            G.append(", bg=");
            G.append(this.e);
            G.append(", timeStamp=");
            G.append(this.f);
            G.append('}');
            return G.toString();
        }
    }

    /* compiled from: LocationController.java */
    /* loaded from: classes3.dex */
    public static abstract class e implements b {
        public void b(jm3.j1 j1Var) {
        }
    }

    /* compiled from: LocationController.java */
    /* loaded from: classes3.dex */
    public enum f {
        STARTUP,
        PROMPT_LOCATION,
        SYNC_SERVICE
    }

    private static void a(b bVar) {
        if (bVar instanceof e) {
            List<e> list = e;
            synchronized (list) {
                list.add((e) bVar);
            }
        }
    }

    private static void b(Context context, boolean z, boolean z2) {
        try {
            if (Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions).contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                m = "android.permission.ACCESS_BACKGROUND_LOCATION";
            }
            if (m != null && z) {
                fj3.b.d(z2, m);
                return;
            }
            n(z, jm3.j1.PERMISSION_GRANTED);
            p();
        } catch (PackageManager.NameNotFoundException e2) {
            n(z, jm3.j1.ERROR);
            e2.printStackTrace();
        }
    }

    private static void c(d dVar) {
        Thread thread;
        HashMap hashMap = new HashMap();
        synchronized (ej3.class) {
            hashMap.putAll(f);
            f.clear();
            thread = j;
        }
        for (f fVar : hashMap.keySet()) {
            ((b) hashMap.get(fVar)).a(dVar);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == j) {
            synchronized (ej3.class) {
                if (thread == j) {
                    j = null;
                }
            }
        }
        o(jm3.X0().b());
    }

    public static void d(Location location) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.a(u0Var, "LocationController fireCompleteForLocation with location: " + location);
        d dVar = new d();
        dVar.c = Float.valueOf(location.getAccuracy());
        dVar.e = Boolean.valueOf(jm3.u1() ^ true);
        dVar.d = Integer.valueOf(!g ? 1 : 0);
        dVar.f = Long.valueOf(location.getTime());
        if (g) {
            dVar.a = Double.valueOf(new BigDecimal(location.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
            dVar.b = Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
        } else {
            dVar.a = Double.valueOf(location.getLatitude());
            dVar.b = Double.valueOf(location.getLongitude());
        }
        c(dVar);
        m(k);
    }

    public static void e() {
        synchronized (h) {
            if (j()) {
                ti3.e();
            } else if (k()) {
                zi3.e();
            }
        }
        c(null);
    }

    private static long f() {
        return vm3.d(vm3.a, vm3.d, -600000L);
    }

    public static void g(Context context, boolean z, boolean z2, b bVar) {
        int i2;
        a(bVar);
        k = context;
        f.put(bVar.getType(), bVar);
        if (!jm3.w1()) {
            n(z, jm3.j1.ERROR);
            e();
            return;
        }
        int a2 = ii3.c.a(context, "android.permission.ACCESS_FINE_LOCATION");
        if (a2 == -1) {
            i2 = ii3.c.a(context, "android.permission.ACCESS_COARSE_LOCATION");
            g = true;
        } else {
            i2 = -1;
        }
        int i3 = Build.VERSION.SDK_INT;
        int a3 = i3 >= 29 ? ii3.c.a(context, "android.permission.ACCESS_BACKGROUND_LOCATION") : -1;
        if (i3 < 23) {
            if (a2 != 0 && i2 != 0) {
                n(z, jm3.j1.LOCATION_PERMISSIONS_MISSING_MANIFEST);
                bVar.a(null);
                return;
            }
            n(z, jm3.j1.PERMISSION_GRANTED);
            p();
        } else if (a2 == 0) {
            if (i3 >= 29 && a3 != 0) {
                b(context, z, z2);
                return;
            }
            n(z, jm3.j1.PERMISSION_GRANTED);
            p();
        } else {
            try {
                List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                jm3.j1 j1Var = jm3.j1.PERMISSION_DENIED;
                if (asList.contains("android.permission.ACCESS_FINE_LOCATION")) {
                    m = "android.permission.ACCESS_FINE_LOCATION";
                } else if (!asList.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                    jm3.P1(jm3.u0.INFO, "Location permissions not added on AndroidManifest file");
                    j1Var = jm3.j1.LOCATION_PERMISSIONS_MISSING_MANIFEST;
                } else if (i2 != 0) {
                    m = "android.permission.ACCESS_COARSE_LOCATION";
                } else if (i3 >= 29 && asList.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    m = "android.permission.ACCESS_BACKGROUND_LOCATION";
                }
                if (m != null && z) {
                    fj3.b.d(z2, m);
                } else if (i2 == 0) {
                    n(z, jm3.j1.PERMISSION_GRANTED);
                    p();
                } else {
                    n(z, j1Var);
                    e();
                }
            } catch (PackageManager.NameNotFoundException e2) {
                n(z, jm3.j1.ERROR);
                e2.printStackTrace();
            }
        }
    }

    public static c h() {
        if (i == null) {
            synchronized (h) {
                if (i == null) {
                    i = new c();
                }
            }
        }
        return i;
    }

    private static boolean i(Context context) {
        return ii3.c.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || ii3.c.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public static boolean j() {
        return OSUtils.C() && OSUtils.t();
    }

    public static boolean k() {
        return OSUtils.H() && OSUtils.w();
    }

    public static void l() {
        synchronized (h) {
            if (j()) {
                ti3.l();
                return;
            }
            if (k()) {
                zi3.l();
            }
        }
    }

    public static boolean m(Context context) {
        if (!i(context)) {
            jm3.P1(jm3.u0.DEBUG, "LocationController scheduleUpdate not possible, location permission not enabled");
            return false;
        } else if (!jm3.w1()) {
            jm3.P1(jm3.u0.DEBUG, "LocationController scheduleUpdate not possible, location shared not enabled");
            return false;
        } else {
            long b2 = jm3.X0().b() - f();
            long j2 = (jm3.u1() ? 300L : b) * 1000;
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.P1(u0Var, "LocationController scheduleUpdate lastTime: " + b2 + " minTime: " + j2);
            wl3.r().s(context, j2 - b2);
            return true;
        }
    }

    public static void n(boolean z, jm3.j1 j1Var) {
        if (!z) {
            jm3.P1(jm3.u0.DEBUG, "LocationController sendAndClearPromptHandlers from non prompt flow");
            return;
        }
        List<e> list = e;
        synchronized (list) {
            jm3.P1(jm3.u0.DEBUG, "LocationController calling prompt handlers");
            for (e eVar : list) {
                eVar.b(j1Var);
            }
            e.clear();
        }
    }

    private static void o(long j2) {
        vm3.m(vm3.a, vm3.d, j2);
    }

    public static void p() {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        StringBuilder G = wo1.G("LocationController startGetLocation with lastLocation: ");
        G.append(l);
        jm3.a(u0Var, G.toString());
        try {
            if (j()) {
                ti3.p();
            } else if (k()) {
                zi3.p();
            } else {
                jm3.a(jm3.u0.WARN, "LocationController startGetLocation not possible, no location dependency found");
                e();
            }
        } catch (Throwable th) {
            jm3.b(jm3.u0.WARN, "Location permission exists but there was an error initializing: ", th);
            e();
        }
    }
}