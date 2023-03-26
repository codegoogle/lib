package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: BitmapPreFillRunner.java */
/* loaded from: classes2.dex */
public final class mt1 implements Runnable {
    @r2
    public static final String s = "PreFillRunner";
    public static final long u = 32;
    public static final long v = 40;
    public static final int w = 4;
    private final ot1 A;
    private final a B;
    private final Set<pt1> C;
    private final Handler D;
    private long E;
    private boolean F;
    private final ls1 y;
    private final gt1 z;
    private static final a t = new a();
    public static final long x = TimeUnit.SECONDS.toMillis(1);

    /* compiled from: BitmapPreFillRunner.java */
    @r2
    /* loaded from: classes2.dex */
    public static class a {
        public long a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* compiled from: BitmapPreFillRunner.java */
    /* loaded from: classes2.dex */
    public static final class b implements gq1 {
        @Override // com.p7700g.p99005.gq1
        public void a(@x1 MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public mt1(ls1 ls1Var, gt1 gt1Var, ot1 ot1Var) {
        this(ls1Var, gt1Var, ot1Var, t, new Handler(Looper.getMainLooper()));
    }

    private long c() {
        return this.z.f() - this.z.a();
    }

    private long d() {
        long j = this.E;
        this.E = Math.min(4 * j, x);
        return j;
    }

    private boolean e(long j) {
        return this.B.a() - j >= 32;
    }

    @r2
    public boolean a() {
        Bitmap createBitmap;
        long a2 = this.B.a();
        while (!this.A.b() && !e(a2)) {
            pt1 c = this.A.c();
            if (!this.C.contains(c)) {
                this.C.add(c);
                createBitmap = this.y.g(c.d(), c.b(), c.a());
            } else {
                createBitmap = Bitmap.createBitmap(c.d(), c.b(), c.a());
            }
            int h = z02.h(createBitmap);
            if (c() >= h) {
                this.z.b(new b(), ev1.e(createBitmap, this.y));
            } else {
                this.y.a(createBitmap);
            }
            if (Log.isLoggable(s, 3)) {
                StringBuilder G = wo1.G("allocated [");
                G.append(c.d());
                G.append("x");
                G.append(c.b());
                G.append("] ");
                G.append(c.a());
                G.append(" size: ");
                G.append(h);
                G.toString();
            }
        }
        return (this.F || this.A.b()) ? false : true;
    }

    public void b() {
        this.F = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            this.D.postDelayed(this, d());
        }
    }

    @r2
    public mt1(ls1 ls1Var, gt1 gt1Var, ot1 ot1Var, a aVar, Handler handler) {
        this.C = new HashSet();
        this.E = 40L;
        this.y = ls1Var;
        this.z = gt1Var;
        this.A = ot1Var;
        this.B = aVar;
        this.D = handler;
    }
}