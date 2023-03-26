package com.p7700g.p99005;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* compiled from: LocationCompat.java */
/* loaded from: classes.dex */
public final class vl {
    public static final String a = "mockLocation";
    public static final String b = "verticalAccuracy";
    public static final String c = "speedAccuracy";
    public static final String d = "bearingAccuracy";
    @z1
    private static Method e;

    /* compiled from: LocationCompat.java */
    @e2(17)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static long a(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    /* compiled from: LocationCompat.java */
    @e2(18)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static boolean a(Location location) {
            return location.isFromMockProvider();
        }
    }

    /* compiled from: LocationCompat.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static float a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @e1
        public static float b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @e1
        public static float c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @e1
        public static boolean d(Location location) {
            return location.hasBearingAccuracy();
        }

        @e1
        public static boolean e(Location location) {
            return location.hasSpeedAccuracy();
        }

        @e1
        public static boolean f(Location location) {
            return location.hasVerticalAccuracy();
        }

        @e1
        public static void g(Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }

        @e1
        public static void h(Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        @e1
        public static void i(Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }
    }

    private vl() {
    }

    public static float a(@x1 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(d, 0.0f);
    }

    public static long b(@x1 Location location) {
        return TimeUnit.NANOSECONDS.toMillis(a.a(location));
    }

    public static long c(@x1 Location location) {
        return a.a(location);
    }

    private static Method d() throws NoSuchMethodException {
        if (e == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            e = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return e;
    }

    public static float e(@x1 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(c, 0.0f);
    }

    public static float f(@x1 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(b, 0.0f);
    }

    public static boolean g(@x1 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.d(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey(d);
    }

    public static boolean h(@x1 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.e(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey(c);
    }

    public static boolean i(@x1 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.f(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey(b);
    }

    public static boolean j(@x1 Location location) {
        return b.a(location);
    }

    public static void k(@x1 Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.g(location, f);
            return;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            extras = location.getExtras();
        }
        extras.putFloat(d, f);
    }

    public static void l(@x1 Location location, boolean z) {
        try {
            d().invoke(location, Boolean.valueOf(z));
        } catch (IllegalAccessException e2) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e2);
            throw illegalAccessError;
        } catch (NoSuchMethodException e3) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e3);
            throw noSuchMethodError;
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void m(@x1 Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.h(location, f);
            return;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            extras = location.getExtras();
        }
        extras.putFloat(c, f);
    }

    public static void n(@x1 Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.i(location, f);
            return;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            extras = location.getExtras();
        }
        extras.putFloat(b, f);
    }
}