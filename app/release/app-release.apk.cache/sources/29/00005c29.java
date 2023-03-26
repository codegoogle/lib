package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: GnssStatusCompat.java */
/* loaded from: classes.dex */
public abstract class sl {
    @SuppressLint({"InlinedApi"})
    public static final int a = 0;
    @SuppressLint({"InlinedApi"})
    public static final int b = 1;
    @SuppressLint({"InlinedApi"})
    public static final int c = 2;
    @SuppressLint({"InlinedApi"})
    public static final int d = 3;
    @SuppressLint({"InlinedApi"})
    public static final int e = 4;
    @SuppressLint({"InlinedApi"})
    public static final int f = 5;
    @SuppressLint({"InlinedApi"})
    public static final int g = 6;
    @SuppressLint({"InlinedApi"})
    public static final int h = 7;

    /* compiled from: GnssStatusCompat.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        public void a(@p1(from = 0) int i) {
        }

        public void b(@x1 sl slVar) {
        }

        public void c() {
        }

        public void d() {
        }
    }

    /* compiled from: GnssStatusCompat.java */
    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    @e2(24)
    @x1
    public static sl n(@x1 GnssStatus gnssStatus) {
        return new tl(gnssStatus);
    }

    @x1
    @SuppressLint({"ReferencesDeprecated"})
    public static sl o(@x1 GpsStatus gpsStatus) {
        return new ul(gpsStatus);
    }

    @g1(from = zg2.s, to = 360.0d)
    public abstract float a(@p1(from = 0) int i);

    @g1(from = zg2.s, to = 63.0d)
    public abstract float b(@p1(from = 0) int i);

    @g1(from = zg2.s)
    public abstract float c(@p1(from = 0) int i);

    @g1(from = zg2.s, to = 63.0d)
    public abstract float d(@p1(from = 0) int i);

    public abstract int e(@p1(from = 0) int i);

    @g1(from = -90.0d, to = 90.0d)
    public abstract float f(@p1(from = 0) int i);

    @p1(from = 0)
    public abstract int g();

    @p1(from = 1, to = 200)
    public abstract int h(@p1(from = 0) int i);

    public abstract boolean i(@p1(from = 0) int i);

    public abstract boolean j(@p1(from = 0) int i);

    public abstract boolean k(@p1(from = 0) int i);

    public abstract boolean l(@p1(from = 0) int i);

    public abstract boolean m(@p1(from = 0) int i);
}