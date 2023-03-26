package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;

/* compiled from: TwilightManager.java */
/* loaded from: classes.dex */
public class p3 {
    private static final String a = "TwilightManager";
    private static final int b = 6;
    private static final int c = 22;
    private static p3 d;
    private final Context e;
    private final LocationManager f;
    private final a g = new a();

    /* compiled from: TwilightManager.java */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
    }

    @r2
    public p3(@x1 Context context, @x1 LocationManager locationManager) {
        this.e = context;
        this.f = locationManager;
    }

    public static p3 a(@x1 Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new p3(applicationContext, (LocationManager) applicationContext.getSystemService(ik3.b));
        }
        return d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location c2 = ph.d(this.e, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c3 = ph.d(this.e, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c3 == null || c2 == null) ? c3 != null ? c3 : c2 : c3.getTime() > c2.getTime() ? c3 : c2;
    }

    @h2(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private Location c(String str) {
        try {
            if (this.f.isProviderEnabled(str)) {
                return this.f.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean e() {
        return this.g.f > System.currentTimeMillis();
    }

    @r2
    public static void f(p3 p3Var) {
        d = p3Var;
    }

    private void g(@x1 Location location) {
        long j;
        a aVar = this.g;
        long currentTimeMillis = System.currentTimeMillis();
        o3 b2 = o3.b();
        b2.a(currentTimeMillis - com.anythink.expressad.foundation.g.a.bV, location.getLatitude(), location.getLongitude());
        long j2 = b2.l;
        b2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b2.n == 1;
        long j3 = b2.m;
        long j4 = b2.l;
        boolean z2 = z;
        b2.a(com.anythink.expressad.foundation.g.a.bV + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = b2.m;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.a = z2;
        aVar.b = j2;
        aVar.c = j3;
        aVar.d = j4;
        aVar.e = j5;
        aVar.f = j;
    }

    public boolean d() {
        a aVar = this.g;
        if (e()) {
            return aVar.a;
        }
        Location b2 = b();
        if (b2 != null) {
            g(b2);
            return aVar.a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}