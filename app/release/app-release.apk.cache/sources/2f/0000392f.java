package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xbill.DNS.TTL;

/* compiled from: LocationRequestCompat.java */
/* loaded from: classes.dex */
public final class am {
    public static final long a = Long.MAX_VALUE;
    public static final int b = 100;
    public static final int c = 102;
    public static final int d = 104;
    private static final long e = -1;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final int j;
    public final float k;
    public final long l;

    /* compiled from: LocationRequestCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private static Class<?> a;
        private static Method b;
        private static Method c;
        private static Method d;
        private static Method e;
        private static Method f;

        private a() {
        }

        public static Object a(am amVar, String str) {
            try {
                if (a == null) {
                    a = Class.forName("android.location.LocationRequest");
                }
                if (b == null) {
                    Method declaredMethod = a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = b.invoke(null, str, Long.valueOf(amVar.b()), Float.valueOf(amVar.e()), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                if (c == null) {
                    Method declaredMethod2 = a.getDeclaredMethod("setQuality", Integer.TYPE);
                    c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                c.invoke(invoke, Integer.valueOf(amVar.g()));
                if (d == null) {
                    Method declaredMethod3 = a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                d.invoke(invoke, Long.valueOf(amVar.f()));
                if (amVar.d() < Integer.MAX_VALUE) {
                    if (e == null) {
                        Method declaredMethod4 = a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    e.invoke(invoke, Integer.valueOf(amVar.d()));
                }
                if (amVar.a() < Long.MAX_VALUE) {
                    if (f == null) {
                        Method declaredMethod5 = a.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f.invoke(invoke, Long.valueOf(amVar.a()));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* compiled from: LocationRequestCompat.java */
    @e2(31)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static LocationRequest a(am amVar) {
            return new LocationRequest.Builder(amVar.b()).setQuality(amVar.g()).setMinUpdateIntervalMillis(amVar.f()).setDurationMillis(amVar.a()).setMaxUpdates(amVar.d()).setMinUpdateDistanceMeters(amVar.e()).setMaxUpdateDelayMillis(amVar.c()).build();
        }
    }

    /* compiled from: LocationRequestCompat.java */
    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface d {
    }

    public am(long j, int i, long j2, int i2, long j3, float f, long j4) {
        this.g = j;
        this.f = i;
        this.h = j3;
        this.i = j2;
        this.j = i2;
        this.k = f;
        this.l = j4;
    }

    @p1(from = 1)
    public long a() {
        return this.i;
    }

    @p1(from = 0)
    public long b() {
        return this.g;
    }

    @p1(from = 0)
    public long c() {
        return this.l;
    }

    @p1(from = 1, to = TTL.MAX_VALUE)
    public int d() {
        return this.j;
    }

    @g1(from = zg2.s, to = 3.4028234663852886E38d)
    public float e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof am) {
            am amVar = (am) obj;
            return this.f == amVar.f && this.g == amVar.g && this.h == amVar.h && this.i == amVar.i && this.j == amVar.j && Float.compare(amVar.k, this.k) == 0 && this.l == amVar.l;
        }
        return false;
    }

    @p1(from = 0)
    public long f() {
        long j = this.h;
        return j == -1 ? this.g : j;
    }

    public int g() {
        return this.f;
    }

    @e2(31)
    @x1
    public LocationRequest h() {
        return b.a(this);
    }

    public int hashCode() {
        long j = this.g;
        long j2 = this.h;
        return (((this.f * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @e2(19)
    @z1
    @SuppressLint({"NewApi"})
    public LocationRequest i(@x1 String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return h();
        }
        return (LocationRequest) a.a(this, str);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("Request[");
        if (this.g != Long.MAX_VALUE) {
            G.append("@");
            up.e(this.g, G);
            int i = this.f;
            if (i == 100) {
                G.append(" HIGH_ACCURACY");
            } else if (i == 102) {
                G.append(" BALANCED");
            } else if (i == 104) {
                G.append(" LOW_POWER");
            }
        } else {
            G.append("PASSIVE");
        }
        if (this.i != Long.MAX_VALUE) {
            G.append(", duration=");
            up.e(this.i, G);
        }
        if (this.j != Integer.MAX_VALUE) {
            G.append(", maxUpdates=");
            G.append(this.j);
        }
        long j = this.h;
        if (j != -1 && j < this.g) {
            G.append(", minUpdateInterval=");
            up.e(this.h, G);
        }
        if (this.k > zg2.s) {
            G.append(", minUpdateDistance=");
            G.append(this.k);
        }
        if (this.l / 2 > this.g) {
            G.append(", maxUpdateDelay=");
            up.e(this.l, G);
        }
        G.append(f14.v);
        return G.toString();
    }

    /* compiled from: LocationRequestCompat.java */
    /* loaded from: classes.dex */
    public static final class c {
        private long a;
        private int b;
        private long c;
        private int d;
        private long e;
        private float f;
        private long g;

        public c(long j) {
            d(j);
            this.b = 102;
            this.c = Long.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
            this.e = -1L;
            this.f = 0.0f;
            this.g = 0L;
        }

        @x1
        public am a() {
            jp.o((this.a == Long.MAX_VALUE && this.e == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j = this.a;
            return new am(j, this.b, this.c, this.d, Math.min(this.e, j), this.f, this.g);
        }

        @x1
        public c b() {
            this.e = -1L;
            return this;
        }

        @x1
        public c c(@p1(from = 1) long j) {
            this.c = jp.h(j, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @x1
        public c d(@p1(from = 0) long j) {
            this.a = jp.h(j, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @x1
        public c e(@p1(from = 0) long j) {
            this.g = j;
            this.g = jp.h(j, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @x1
        public c f(@p1(from = 1, to = 2147483647L) int i) {
            this.d = jp.g(i, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @x1
        public c g(@g1(from = 0.0d, to = 3.4028234663852886E38d) float f) {
            this.f = f;
            this.f = jp.f(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @x1
        public c h(@p1(from = 0) long j) {
            this.e = jp.h(j, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @x1
        public c i(int i) {
            jp.c(i == 104 || i == 102 || i == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i));
            this.b = i;
            return this;
        }

        public c(@x1 am amVar) {
            this.a = amVar.g;
            this.b = amVar.f;
            this.c = amVar.i;
            this.d = amVar.j;
            this.e = amVar.h;
            this.f = amVar.k;
            this.g = amVar.l;
        }
    }
}