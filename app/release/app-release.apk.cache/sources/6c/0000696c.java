package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.p7700g.p99005.nm;
import com.p7700g.p99005.sl;
import com.p7700g.p99005.zl;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* compiled from: LocationManagerCompat.java */
/* loaded from: classes.dex */
public final class zl {
    private static final long a = 30000;
    private static final long b = 10000;
    private static final long c = 5;
    private static Field d;
    @k1("sLocationListeners")
    public static final WeakHashMap<k, WeakReference<l>> e = new WeakHashMap<>();

    /* compiled from: LocationManagerCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private static Class<?> a;
        private static Method b;

        private a() {
        }

        @e1
        public static boolean a(LocationManager locationManager, String str, am amVar, yl ylVar, Looper looper) {
            try {
                if (a == null) {
                    a = Class.forName("android.location.LocationRequest");
                }
                if (b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", a, LocationListener.class, Looper.class);
                    b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i = amVar.i(str);
                if (i != null) {
                    b.invoke(locationManager, i, ylVar, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @e1
        @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public static boolean b(LocationManager locationManager, String str, am amVar, l lVar) {
            try {
                if (a == null) {
                    a = Class.forName("android.location.LocationRequest");
                }
                if (b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", a, LocationListener.class, Looper.class);
                    b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i = amVar.i(str);
                if (i != null) {
                    synchronized (zl.e) {
                        b.invoke(locationManager, i, lVar, Looper.getMainLooper());
                        zl.k(locationManager, lVar);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public static boolean a(LocationManager locationManager, Handler handler, Executor executor, sl.a aVar) {
            jp.a(handler != null);
            y7<Object, Object> y7Var = g.a;
            synchronized (y7Var) {
                m mVar = (m) y7Var.get(aVar);
                if (mVar == null) {
                    mVar = new m(aVar);
                } else {
                    mVar.j();
                }
                mVar.i(executor);
                if (locationManager.registerGnssStatusCallback(mVar, handler)) {
                    y7Var.put(aVar, mVar);
                    return true;
                }
                return false;
            }
        }

        @e1
        public static void b(LocationManager locationManager, Object obj) {
            if (obj instanceof m) {
                ((m) obj).j();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static String a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @e1
        public static int b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @e1
        public static boolean c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class d {
        private static Class<?> a;
        private static Method b;

        private d() {
        }

        @e1
        @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public static void a(LocationManager locationManager, @x1 String str, @z1 nm nmVar, @x1 Executor executor, @x1 final vo<Location> voVar) {
            CancellationSignal cancellationSignal = nmVar != null ? (CancellationSignal) nmVar.b() : null;
            Objects.requireNonNull(voVar);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new Consumer() { // from class: com.p7700g.p99005.ql
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    vo.this.accept((Location) obj);
                }
            });
        }

        @e1
        @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public static boolean b(LocationManager locationManager, Handler handler, Executor executor, sl.a aVar) {
            y7<Object, Object> y7Var = g.a;
            synchronized (y7Var) {
                h hVar = (h) y7Var.get(aVar);
                if (hVar == null) {
                    hVar = new h(aVar);
                }
                if (locationManager.registerGnssStatusCallback(executor, hVar)) {
                    y7Var.put(aVar, hVar);
                    return true;
                }
                return false;
            }
        }

        @e1
        public static boolean c(LocationManager locationManager, String str, am amVar, Executor executor, yl ylVar) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (a == null) {
                        a = Class.forName("android.location.LocationRequest");
                    }
                    if (b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", a, Executor.class, LocationListener.class);
                        b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest i = amVar.i(str);
                    if (i != null) {
                        b.invoke(locationManager, i, executor, ylVar);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @e2(31)
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        @e1
        public static boolean a(LocationManager locationManager, @x1 String str) {
            return locationManager.hasProvider(str);
        }

        @e1
        @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public static void b(LocationManager locationManager, @x1 String str, @x1 LocationRequest locationRequest, @x1 Executor executor, @x1 LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* compiled from: LocationManagerCompat.java */
    /* loaded from: classes.dex */
    public static final class f implements LocationListener {
        private final LocationManager a;
        private final Executor b;
        private final Handler c = new Handler(Looper.getMainLooper());
        private vo<Location> d;
        @k1("this")
        private boolean e;
        @z1
        public Runnable f;

        public f(LocationManager locationManager, Executor executor, vo<Location> voVar) {
            this.a = locationManager;
            this.b = executor;
            this.d = voVar;
        }

        @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        private void b() {
            this.d = null;
            this.a.removeUpdates(this);
            Runnable runnable = this.f;
            if (runnable != null) {
                this.c.removeCallbacks(runnable);
                this.f = null;
            }
        }

        /* renamed from: d */
        public /* synthetic */ void e() {
            this.f = null;
            onLocationChanged((Location) null);
        }

        @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void a() {
            synchronized (this) {
                if (this.e) {
                    return;
                }
                this.e = true;
                b();
            }
        }

        @SuppressLint({"MissingPermission"})
        public void f(long j) {
            synchronized (this) {
                if (this.e) {
                    return;
                }
                Runnable runnable = new Runnable() { // from class: com.p7700g.p99005.al
                    @Override // java.lang.Runnable
                    public final void run() {
                        zl.f.this.e();
                    }
                };
                this.f = runnable;
                this.c.postDelayed(runnable, j);
            }
        }

        @Override // android.location.LocationListener
        @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@z1 final Location location) {
            synchronized (this) {
                if (this.e) {
                    return;
                }
                this.e = true;
                final vo<Location> voVar = this.d;
                this.b.execute(new Runnable() { // from class: com.p7700g.p99005.zk
                    @Override // java.lang.Runnable
                    public final void run() {
                        vo.this.accept(location);
                    }
                });
                b();
            }
        }

        @Override // android.location.LocationListener
        @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@x1 String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@x1 String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* compiled from: LocationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class g {
        @k1("sGnssStatusListeners")
        public static final y7<Object, Object> a = new y7<>();

        private g() {
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class h extends GnssStatus.Callback {
        public final sl.a a;

        public h(sl.a aVar) {
            jp.b(aVar != null, "invalid null callback");
            this.a = aVar;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
            this.a.a(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.a.b(sl.n(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.a.c();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.a.d();
        }
    }

    /* compiled from: LocationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class i implements GpsStatus.Listener {
        private final LocationManager a;
        public final sl.a b;
        @z1
        public volatile Executor c;

        public i(LocationManager locationManager, sl.a aVar) {
            jp.b(aVar != null, "invalid null callback");
            this.a = locationManager;
            this.b = aVar;
        }

        private /* synthetic */ void a(Executor executor) {
            if (this.c != executor) {
                return;
            }
            this.b.c();
        }

        private /* synthetic */ void c(Executor executor) {
            if (this.c != executor) {
                return;
            }
            this.b.d();
        }

        private /* synthetic */ void e(Executor executor, int i) {
            if (this.c != executor) {
                return;
            }
            this.b.a(i);
        }

        private /* synthetic */ void g(Executor executor, sl slVar) {
            if (this.c != executor) {
                return;
            }
            this.b.b(slVar);
        }

        public /* synthetic */ void b(Executor executor) {
            if (this.c != executor) {
                return;
            }
            this.b.c();
        }

        public /* synthetic */ void d(Executor executor) {
            if (this.c != executor) {
                return;
            }
            this.b.d();
        }

        public /* synthetic */ void f(Executor executor, int i) {
            if (this.c != executor) {
                return;
            }
            this.b.a(i);
        }

        public /* synthetic */ void h(Executor executor, sl slVar) {
            if (this.c != executor) {
                return;
            }
            this.b.b(slVar);
        }

        public void i(Executor executor) {
            jp.n(this.c == null);
            this.c = executor;
        }

        public void j() {
            this.c = null;
        }

        @Override // android.location.GpsStatus.Listener
        @h2("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i) {
            GpsStatus gpsStatus;
            final Executor executor = this.c;
            if (executor == null) {
                return;
            }
            if (i == 1) {
                executor.execute(new Runnable() { // from class: com.p7700g.p99005.dl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zl.i.this.b(executor);
                    }
                });
            } else if (i == 2) {
                executor.execute(new Runnable() { // from class: com.p7700g.p99005.el
                    @Override // java.lang.Runnable
                    public final void run() {
                        zl.i.this.d(executor);
                    }
                });
            } else if (i != 3) {
                if (i == 4 && (gpsStatus = this.a.getGpsStatus(null)) != null) {
                    final sl o = sl.o(gpsStatus);
                    executor.execute(new Runnable() { // from class: com.p7700g.p99005.cl
                        @Override // java.lang.Runnable
                        public final void run() {
                            zl.i.this.h(executor, o);
                        }
                    });
                }
            } else {
                GpsStatus gpsStatus2 = this.a.getGpsStatus(null);
                if (gpsStatus2 != null) {
                    final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                    executor.execute(new Runnable() { // from class: com.p7700g.p99005.bl
                        @Override // java.lang.Runnable
                        public final void run() {
                            zl.i.this.f(executor, timeToFirstFix);
                        }
                    });
                }
            }
        }
    }

    /* compiled from: LocationManagerCompat.java */
    /* loaded from: classes.dex */
    public static final class j implements Executor {
        private final Handler s;

        public j(@x1 Handler handler) {
            this.s = (Handler) jp.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@x1 Runnable runnable) {
            if (Looper.myLooper() == this.s.getLooper()) {
                runnable.run();
            } else if (this.s.post((Runnable) jp.l(runnable))) {
            } else {
                throw new RejectedExecutionException(this.s + " is shutting down");
            }
        }
    }

    /* compiled from: LocationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class k {
        public final String a;
        public final yl b;

        public k(String str, yl ylVar) {
            this.a = (String) ep.e(str, "invalid null provider");
            this.b = (yl) ep.e(ylVar, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                return this.a.equals(kVar.a) && this.b.equals(kVar.b);
            }
            return false;
        }

        public int hashCode() {
            return ep.b(this.a, this.b);
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class m extends GnssStatus.Callback {
        public final sl.a a;
        @z1
        public volatile Executor b;

        public m(sl.a aVar) {
            jp.b(aVar != null, "invalid null callback");
            this.a = aVar;
        }

        private /* synthetic */ void a(Executor executor, int i) {
            if (this.b != executor) {
                return;
            }
            this.a.a(i);
        }

        /* renamed from: c */
        public /* synthetic */ void d(Executor executor, GnssStatus gnssStatus) {
            if (this.b != executor) {
                return;
            }
            this.a.b(sl.n(gnssStatus));
        }

        private /* synthetic */ void e(Executor executor) {
            if (this.b != executor) {
                return;
            }
            this.a.c();
        }

        private /* synthetic */ void g(Executor executor) {
            if (this.b != executor) {
                return;
            }
            this.a.d();
        }

        public /* synthetic */ void b(Executor executor, int i) {
            if (this.b != executor) {
                return;
            }
            this.a.a(i);
        }

        public /* synthetic */ void f(Executor executor) {
            if (this.b != executor) {
                return;
            }
            this.a.c();
        }

        public /* synthetic */ void h(Executor executor) {
            if (this.b != executor) {
                return;
            }
            this.a.d();
        }

        public void i(Executor executor) {
            jp.b(executor != null, "invalid null executor");
            jp.n(this.b == null);
            this.b = executor;
        }

        public void j() {
            this.b = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i) {
            final Executor executor = this.b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: com.p7700g.p99005.ol
                @Override // java.lang.Runnable
                public final void run() {
                    zl.m.this.b(executor, i);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: com.p7700g.p99005.nl
                @Override // java.lang.Runnable
                public final void run() {
                    zl.m.this.d(executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: com.p7700g.p99005.pl
                @Override // java.lang.Runnable
                public final void run() {
                    zl.m.this.f(executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: com.p7700g.p99005.ml
                @Override // java.lang.Runnable
                public final void run() {
                    zl.m.this.h(executor);
                }
            });
        }
    }

    private zl() {
    }

    @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void a(@x1 LocationManager locationManager, @x1 String str, @z1 nm nmVar, @x1 Executor executor, @x1 final vo<Location> voVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.a(locationManager, str, nmVar, executor, voVar);
            return;
        }
        if (nmVar != null) {
            nmVar.e();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - vl.b(lastKnownLocation) < 10000) {
            executor.execute(new Runnable() { // from class: com.p7700g.p99005.yk
                @Override // java.lang.Runnable
                public final void run() {
                    zl.f(vo.this, lastKnownLocation);
                }
            });
            return;
        }
        final f fVar = new f(locationManager, executor, voVar);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, fVar, Looper.getMainLooper());
        if (nmVar != null) {
            nmVar.d(new nm.b() { // from class: com.p7700g.p99005.rl
                @Override // com.p7700g.p99005.nm.b
                public final void onCancel() {
                    zl.f.this.a();
                }
            });
        }
        fVar.f(30000L);
    }

    @z1
    public static String b(@x1 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(locationManager);
        }
        return null;
    }

    public static int c(@x1 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.b(locationManager);
        }
        return 0;
    }

    public static boolean d(@x1 LocationManager locationManager, @x1 String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.a(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            return locationManager.getProvider(str) != null;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean e(@x1 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.c(locationManager);
        }
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    public static /* synthetic */ void f(vo voVar, Location location) {
        voVar.accept(location);
    }

    public static /* synthetic */ Boolean g(LocationManager locationManager, i iVar) throws Exception {
        return Boolean.valueOf(locationManager.addGpsStatusListener(iVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x00c5 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:139:0x00a4, B:140:0x00ba, B:143:0x00bd, B:145:0x00c5, B:147:0x00cd, B:148:0x00d3, B:149:0x00d4, B:150:0x00d9, B:151:0x00da, B:152:0x00e0, B:129:0x0093), top: B:162:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00da A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:139:0x00a4, B:140:0x00ba, B:143:0x00bd, B:145:0x00c5, B:147:0x00cd, B:148:0x00d3, B:149:0x00d4, B:150:0x00d9, B:151:0x00da, B:152:0x00e0, B:129:0x0093), top: B:162:0x0053 }] */
    @h2("android.permission.ACCESS_FINE_LOCATION")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean h(final LocationManager locationManager, Handler handler, Executor executor, sl.a aVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            return d.b(locationManager, handler, executor, aVar);
        }
        if (i2 >= 24) {
            return b.a(locationManager, handler, executor, aVar);
        }
        boolean z = true;
        jp.a(handler != null);
        y7<Object, Object> y7Var = g.a;
        synchronized (y7Var) {
            final i iVar = (i) y7Var.get(aVar);
            if (iVar == null) {
                iVar = new i(locationManager, aVar);
            } else {
                iVar.j();
            }
            iVar.i(executor);
            FutureTask futureTask = new FutureTask(new Callable() { // from class: com.p7700g.p99005.fl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zl.g(locationManager, iVar);
                }
            });
            if (Looper.myLooper() == handler.getLooper()) {
                futureTask.run();
            } else if (!handler.post(futureTask)) {
                throw new IllegalStateException(handler + " is shutting down");
            }
            try {
                try {
                    long nanos = TimeUnit.SECONDS.toNanos(5L);
                    long nanoTime = System.nanoTime() + nanos;
                    boolean z2 = false;
                    while (((Boolean) futureTask.get(nanos, TimeUnit.NANOSECONDS)).booleanValue()) {
                        try {
                            try {
                                g.a.put(aVar, iVar);
                                if (z2) {
                                    Thread.currentThread().interrupt();
                                }
                                return true;
                            } catch (InterruptedException unused) {
                                nanos = nanoTime - System.nanoTime();
                                z2 = true;
                            } catch (ExecutionException e2) {
                                e = e2;
                                if (e.getCause() instanceof RuntimeException) {
                                }
                            } catch (TimeoutException e3) {
                                e = e3;
                                throw new IllegalStateException(handler + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", e);
                            } catch (Throwable th) {
                                th = th;
                                z = z2;
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        } catch (ExecutionException e4) {
                            e = e4;
                            if (e.getCause() instanceof RuntimeException) {
                                if (e.getCause() instanceof Error) {
                                    throw ((Error) e.getCause());
                                }
                                throw new IllegalStateException(e);
                            }
                            throw ((RuntimeException) e.getCause());
                        } catch (TimeoutException e5) {
                            e = e5;
                            throw new IllegalStateException(handler + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", e);
                        }
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    return false;
                } catch (ExecutionException e6) {
                    e = e6;
                } catch (TimeoutException e7) {
                    e = e7;
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @h2("android.permission.ACCESS_FINE_LOCATION")
    public static boolean i(@x1 LocationManager locationManager, @x1 sl.a aVar, @x1 Handler handler) {
        if (Build.VERSION.SDK_INT >= 30) {
            return j(locationManager, rm.a(handler), aVar);
        }
        return j(locationManager, new j(handler), aVar);
    }

    @h2("android.permission.ACCESS_FINE_LOCATION")
    public static boolean j(@x1 LocationManager locationManager, @x1 Executor executor, @x1 sl.a aVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            return h(locationManager, null, executor, aVar);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return h(locationManager, new Handler(myLooper), executor, aVar);
    }

    @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @k1("sLocationListeners")
    public static void k(LocationManager locationManager, l lVar) {
        WeakReference<l> put = e.put(lVar.a(), new WeakReference<>(lVar));
        l lVar2 = put != null ? put.get() : null;
        if (lVar2 != null) {
            lVar2.n();
            locationManager.removeUpdates(lVar2);
        }
    }

    @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void l(@x1 LocationManager locationManager, @x1 yl ylVar) {
        WeakHashMap<k, WeakReference<l>> weakHashMap = e;
        synchronized (weakHashMap) {
            ArrayList arrayList = null;
            for (WeakReference<l> weakReference : weakHashMap.values()) {
                l lVar = weakReference.get();
                if (lVar != null) {
                    k a2 = lVar.a();
                    if (a2.b == ylVar) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(a2);
                        lVar.n();
                        locationManager.removeUpdates(lVar);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e.remove((k) it.next());
                }
            }
        }
        locationManager.removeUpdates(ylVar);
    }

    @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void m(@x1 LocationManager locationManager, @x1 String str, @x1 am amVar, @x1 yl ylVar, @x1 Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            e.b(locationManager, str, amVar.h(), rm.a(new Handler(looper)), ylVar);
        } else if (a.a(locationManager, str, amVar, ylVar, looper)) {
        } else {
            locationManager.requestLocationUpdates(str, amVar.b(), amVar.e(), ylVar, looper);
        }
    }

    @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void n(@x1 LocationManager locationManager, @x1 String str, @x1 am amVar, @x1 Executor executor, @x1 yl ylVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            e.b(locationManager, str, amVar.h(), executor, ylVar);
        } else if (i2 < 30 || !d.c(locationManager, str, amVar, executor, ylVar)) {
            l lVar = new l(new k(str, ylVar), executor);
            if (a.b(locationManager, str, amVar, lVar)) {
                return;
            }
            synchronized (e) {
                locationManager.requestLocationUpdates(str, amVar.b(), amVar.e(), lVar, Looper.getMainLooper());
                k(locationManager, lVar);
            }
        }
    }

    public static void o(@x1 LocationManager locationManager, @x1 sl.a aVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            y7<Object, Object> y7Var = g.a;
            synchronized (y7Var) {
                Object remove = y7Var.remove(aVar);
                if (remove != null) {
                    b.b(locationManager, remove);
                }
            }
            return;
        }
        y7<Object, Object> y7Var2 = g.a;
        synchronized (y7Var2) {
            i iVar = (i) y7Var2.remove(aVar);
            if (iVar != null) {
                iVar.j();
                locationManager.removeGpsStatusListener(iVar);
            }
        }
    }

    /* compiled from: LocationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class l implements LocationListener {
        @z1
        public volatile k a;
        public final Executor b;

        public l(@z1 k kVar, Executor executor) {
            this.a = kVar;
            this.b = executor;
        }

        private /* synthetic */ void b(int i) {
            k kVar = this.a;
            if (kVar == null) {
                return;
            }
            kVar.b.onFlushComplete(i);
        }

        private /* synthetic */ void d(Location location) {
            k kVar = this.a;
            if (kVar == null) {
                return;
            }
            kVar.b.onLocationChanged(location);
        }

        private /* synthetic */ void f(List list) {
            k kVar = this.a;
            if (kVar == null) {
                return;
            }
            kVar.b.onLocationChanged(list);
        }

        private /* synthetic */ void h(String str) {
            k kVar = this.a;
            if (kVar == null) {
                return;
            }
            kVar.b.onProviderDisabled(str);
        }

        private /* synthetic */ void j(String str) {
            k kVar = this.a;
            if (kVar == null) {
                return;
            }
            kVar.b.onProviderEnabled(str);
        }

        private /* synthetic */ void l(String str, int i, Bundle bundle) {
            k kVar = this.a;
            if (kVar == null) {
                return;
            }
            kVar.b.onStatusChanged(str, i, bundle);
        }

        public k a() {
            return (k) ep.d(this.a);
        }

        public /* synthetic */ void c(int i) {
            k kVar = this.a;
            if (kVar == null) {
                return;
            }
            kVar.b.onFlushComplete(i);
        }

        public /* synthetic */ void e(Location location) {
            k kVar = this.a;
            if (kVar == null) {
                return;
            }
            kVar.b.onLocationChanged(location);
        }

        public /* synthetic */ void g(List list) {
            k kVar = this.a;
            if (kVar == null) {
                return;
            }
            kVar.b.onLocationChanged(list);
        }

        public /* synthetic */ void i(String str) {
            k kVar = this.a;
            if (kVar == null) {
                return;
            }
            kVar.b.onProviderDisabled(str);
        }

        public /* synthetic */ void k(String str) {
            k kVar = this.a;
            if (kVar == null) {
                return;
            }
            kVar.b.onProviderEnabled(str);
        }

        public /* synthetic */ void m(String str, int i, Bundle bundle) {
            k kVar = this.a;
            if (kVar == null) {
                return;
            }
            kVar.b.onStatusChanged(str, i, bundle);
        }

        public void n() {
            this.a = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i) {
            if (this.a == null) {
                return;
            }
            this.b.execute(new Runnable() { // from class: com.p7700g.p99005.jl
                @Override // java.lang.Runnable
                public final void run() {
                    zl.l.this.c(i);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@x1 final Location location) {
            if (this.a == null) {
                return;
            }
            this.b.execute(new Runnable() { // from class: com.p7700g.p99005.ll
                @Override // java.lang.Runnable
                public final void run() {
                    zl.l.this.e(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@x1 final String str) {
            if (this.a == null) {
                return;
            }
            this.b.execute(new Runnable() { // from class: com.p7700g.p99005.kl
                @Override // java.lang.Runnable
                public final void run() {
                    zl.l.this.i(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@x1 final String str) {
            if (this.a == null) {
                return;
            }
            this.b.execute(new Runnable() { // from class: com.p7700g.p99005.gl
                @Override // java.lang.Runnable
                public final void run() {
                    zl.l.this.k(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i, final Bundle bundle) {
            if (this.a == null) {
                return;
            }
            this.b.execute(new Runnable() { // from class: com.p7700g.p99005.hl
                @Override // java.lang.Runnable
                public final void run() {
                    zl.l.this.m(str, i, bundle);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@x1 final List<Location> list) {
            if (this.a == null) {
                return;
            }
            this.b.execute(new Runnable() { // from class: com.p7700g.p99005.il
                @Override // java.lang.Runnable
                public final void run() {
                    zl.l.this.g(list);
                }
            });
        }
    }
}