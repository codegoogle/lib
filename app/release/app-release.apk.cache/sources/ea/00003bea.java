package com.p7700g.p99005;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.p7700g.p99005.rr1;
import com.p7700g.p99005.zo1;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: SingleRequest.java */
/* loaded from: classes2.dex */
public final class bz1<R> implements vy1, rz1, az1 {
    private static final String b = "Glide";
    @z1
    @k1("requestLock")
    private Drawable A;
    @z1
    @k1("requestLock")
    private Drawable B;
    @z1
    @k1("requestLock")
    private Drawable C;
    @k1("requestLock")
    private int D;
    @k1("requestLock")
    private int E;
    @k1("requestLock")
    private boolean F;
    @z1
    private RuntimeException G;
    private int d;
    @z1
    private final String e;
    private final d12 f;
    private final Object g;
    @z1
    private final yy1<R> h;
    private final wy1 i;
    private final Context j;
    private final ap1 k;
    @z1
    private final Object l;
    private final Class<R> m;
    private final ry1<?> n;
    private final int o;
    private final int p;
    private final fp1 q;
    private final sz1<R> r;
    @z1
    private final List<yy1<R>> s;
    private final b02<? super R> t;
    private final Executor u;
    @k1("requestLock")
    private cs1<R> v;
    @k1("requestLock")
    private rr1.d w;
    @k1("requestLock")
    private long x;
    private volatile rr1 y;
    @k1("requestLock")
    private a z;
    private static final String a = "GlideRequest";
    private static final boolean c = Log.isLoggable(a, 2);

    /* compiled from: SingleRequest.java */
    /* loaded from: classes2.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private bz1(Context context, ap1 ap1Var, @x1 Object obj, @z1 Object obj2, Class<R> cls, ry1<?> ry1Var, int i, int i2, fp1 fp1Var, sz1<R> sz1Var, @z1 yy1<R> yy1Var, @z1 List<yy1<R>> list, wy1 wy1Var, rr1 rr1Var, b02<? super R> b02Var, Executor executor) {
        this.e = c ? String.valueOf(hashCode()) : null;
        this.f = d12.a();
        this.g = obj;
        this.j = context;
        this.k = ap1Var;
        this.l = obj2;
        this.m = cls;
        this.n = ry1Var;
        this.o = i;
        this.p = i2;
        this.q = fp1Var;
        this.r = sz1Var;
        this.h = yy1Var;
        this.s = list;
        this.i = wy1Var;
        this.y = rr1Var;
        this.t = b02Var;
        this.u = executor;
        this.z = a.PENDING;
        if (this.G == null && ap1Var.g().b(zo1.e.class)) {
            this.G = new RuntimeException("Glide request origin trace");
        }
    }

    @k1("requestLock")
    private void A(cs1<R> cs1Var, R r, aq1 aq1Var, boolean z) {
        boolean z2;
        boolean s = s();
        this.z = a.COMPLETE;
        this.v = cs1Var;
        if (this.k.h() <= 3) {
            StringBuilder G = wo1.G("Finished loading ");
            G.append(r.getClass().getSimpleName());
            G.append(" from ");
            G.append(aq1Var);
            G.append(" for ");
            G.append(this.l);
            G.append(" with size [");
            G.append(this.D);
            G.append("x");
            G.append(this.E);
            G.append("] in ");
            G.append(t02.a(this.x));
            G.append(" ms");
            G.toString();
        }
        boolean z3 = true;
        this.F = true;
        try {
            List<yy1<R>> list = this.s;
            if (list != null) {
                z2 = false;
                for (yy1<R> yy1Var : list) {
                    z2 |= yy1Var.e(r, this.l, this.r, aq1Var, s);
                }
            } else {
                z2 = false;
            }
            yy1<R> yy1Var2 = this.h;
            if (yy1Var2 == null || !yy1Var2.e(r, this.l, this.r, aq1Var, s)) {
                z3 = false;
            }
            if (!(z3 | z2)) {
                this.r.c(r, this.t.a(aq1Var, s));
            }
            this.F = false;
            x();
            c12.g(a, this.d);
        } catch (Throwable th) {
            this.F = false;
            throw th;
        }
    }

    @k1("requestLock")
    private void B() {
        if (l()) {
            Drawable q = this.l == null ? q() : null;
            if (q == null) {
                q = p();
            }
            if (q == null) {
                q = r();
            }
            this.r.k(q);
        }
    }

    @k1("requestLock")
    private void i() {
        if (this.F) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @k1("requestLock")
    private boolean k() {
        wy1 wy1Var = this.i;
        return wy1Var == null || wy1Var.k(this);
    }

    @k1("requestLock")
    private boolean l() {
        wy1 wy1Var = this.i;
        return wy1Var == null || wy1Var.e(this);
    }

    @k1("requestLock")
    private boolean m() {
        wy1 wy1Var = this.i;
        return wy1Var == null || wy1Var.g(this);
    }

    @k1("requestLock")
    private void n() {
        i();
        this.f.c();
        this.r.b(this);
        rr1.d dVar = this.w;
        if (dVar != null) {
            dVar.a();
            this.w = null;
        }
    }

    private void o(Object obj) {
        List<yy1<R>> list = this.s;
        if (list == null) {
            return;
        }
        for (yy1<R> yy1Var : list) {
            if (yy1Var instanceof ty1) {
                ((ty1) yy1Var).a(obj);
            }
        }
    }

    @k1("requestLock")
    private Drawable p() {
        if (this.A == null) {
            Drawable S = this.n.S();
            this.A = S;
            if (S == null && this.n.R() > 0) {
                this.A = t(this.n.R());
            }
        }
        return this.A;
    }

    @k1("requestLock")
    private Drawable q() {
        if (this.C == null) {
            Drawable T = this.n.T();
            this.C = T;
            if (T == null && this.n.U() > 0) {
                this.C = t(this.n.U());
            }
        }
        return this.C;
    }

    @k1("requestLock")
    private Drawable r() {
        if (this.B == null) {
            Drawable b0 = this.n.b0();
            this.B = b0;
            if (b0 == null && this.n.c0() > 0) {
                this.B = t(this.n.c0());
            }
        }
        return this.B;
    }

    @k1("requestLock")
    private boolean s() {
        wy1 wy1Var = this.i;
        return wy1Var == null || !wy1Var.c().b();
    }

    @k1("requestLock")
    private Drawable t(@f1 int i) {
        return lw1.a(this.k, i, this.n.h0() != null ? this.n.h0() : this.j.getTheme());
    }

    private void u(String str) {
    }

    private static int v(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    @k1("requestLock")
    private void w() {
        wy1 wy1Var = this.i;
        if (wy1Var != null) {
            wy1Var.a(this);
        }
    }

    @k1("requestLock")
    private void x() {
        wy1 wy1Var = this.i;
        if (wy1Var != null) {
            wy1Var.i(this);
        }
    }

    public static <R> bz1<R> y(Context context, ap1 ap1Var, Object obj, Object obj2, Class<R> cls, ry1<?> ry1Var, int i, int i2, fp1 fp1Var, sz1<R> sz1Var, yy1<R> yy1Var, @z1 List<yy1<R>> list, wy1 wy1Var, rr1 rr1Var, b02<? super R> b02Var, Executor executor) {
        return new bz1<>(context, ap1Var, obj, obj2, cls, ry1Var, i, i2, fp1Var, sz1Var, yy1Var, list, wy1Var, rr1Var, b02Var, executor);
    }

    private void z(xr1 xr1Var, int i) {
        boolean z;
        this.f.c();
        synchronized (this.g) {
            xr1Var.p(this.G);
            int h = this.k.h();
            if (h <= i) {
                String str = "Load failed for " + this.l + " with size [" + this.D + "x" + this.E + "]";
                if (h <= 4) {
                    xr1Var.i(b);
                }
            }
            this.w = null;
            this.z = a.FAILED;
            boolean z2 = true;
            this.F = true;
            List<yy1<R>> list = this.s;
            if (list != null) {
                z = false;
                for (yy1<R> yy1Var : list) {
                    z |= yy1Var.d(xr1Var, this.l, this.r, s());
                }
            } else {
                z = false;
            }
            yy1<R> yy1Var2 = this.h;
            if (yy1Var2 == null || !yy1Var2.d(xr1Var, this.l, this.r, s())) {
                z2 = false;
            }
            if (!(z | z2)) {
                B();
            }
            this.F = false;
            w();
            c12.g(a, this.d);
        }
    }

    @Override // com.p7700g.p99005.az1
    public void a(xr1 xr1Var) {
        z(xr1Var, 5);
    }

    @Override // com.p7700g.p99005.vy1
    public boolean b() {
        boolean z;
        synchronized (this.g) {
            z = this.z == a.COMPLETE;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.az1
    public void c(cs1<?> cs1Var, aq1 aq1Var, boolean z) {
        this.f.c();
        cs1<?> cs1Var2 = null;
        try {
            synchronized (this.g) {
                try {
                    this.w = null;
                    if (cs1Var == null) {
                        a(new xr1("Expected to receive a Resource<R> with an object of " + this.m + " inside, but instead got null."));
                        return;
                    }
                    Object obj = cs1Var.get();
                    try {
                        if (obj != null && this.m.isAssignableFrom(obj.getClass())) {
                            if (!m()) {
                                this.v = null;
                                this.z = a.COMPLETE;
                                c12.g(a, this.d);
                                this.y.l(cs1Var);
                                return;
                            }
                            A(cs1Var, obj, aq1Var, z);
                            return;
                        }
                        this.v = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.m);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(cs1Var);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        a(new xr1(sb.toString()));
                        this.y.l(cs1Var);
                    } catch (Throwable th) {
                        cs1Var2 = cs1Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (cs1Var2 != null) {
                this.y.l(cs1Var2);
            }
            throw th3;
        }
    }

    @Override // com.p7700g.p99005.vy1
    public void clear() {
        synchronized (this.g) {
            i();
            this.f.c();
            a aVar = this.z;
            a aVar2 = a.CLEARED;
            if (aVar == aVar2) {
                return;
            }
            n();
            cs1<R> cs1Var = this.v;
            if (cs1Var != null) {
                this.v = null;
            } else {
                cs1Var = null;
            }
            if (k()) {
                this.r.p(r());
            }
            c12.g(a, this.d);
            this.z = aVar2;
            if (cs1Var != null) {
                this.y.l(cs1Var);
            }
        }
    }

    @Override // com.p7700g.p99005.vy1
    public boolean d(vy1 vy1Var) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        ry1<?> ry1Var;
        fp1 fp1Var;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        ry1<?> ry1Var2;
        fp1 fp1Var2;
        int size2;
        if (vy1Var instanceof bz1) {
            synchronized (this.g) {
                i = this.o;
                i2 = this.p;
                obj = this.l;
                cls = this.m;
                ry1Var = this.n;
                fp1Var = this.q;
                List<yy1<R>> list = this.s;
                size = list != null ? list.size() : 0;
            }
            bz1 bz1Var = (bz1) vy1Var;
            synchronized (bz1Var.g) {
                i3 = bz1Var.o;
                i4 = bz1Var.p;
                obj2 = bz1Var.l;
                cls2 = bz1Var.m;
                ry1Var2 = bz1Var.n;
                fp1Var2 = bz1Var.q;
                List<yy1<R>> list2 = bz1Var.s;
                size2 = list2 != null ? list2.size() : 0;
            }
            return i == i3 && i2 == i4 && z02.c(obj, obj2) && cls.equals(cls2) && ry1Var.equals(ry1Var2) && fp1Var == fp1Var2 && size == size2;
        }
        return false;
    }

    @Override // com.p7700g.p99005.rz1
    public void e(int i, int i2) {
        Object obj;
        this.f.c();
        Object obj2 = this.g;
        synchronized (obj2) {
            try {
                try {
                    boolean z = c;
                    if (z) {
                        u("Got onSizeReady in " + t02.a(this.x));
                    }
                    if (this.z == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.z = aVar;
                        float g0 = this.n.g0();
                        this.D = v(i, g0);
                        this.E = v(i2, g0);
                        if (z) {
                            u("finished setup for calling load in " + t02.a(this.x));
                        }
                        obj = obj2;
                        try {
                            this.w = this.y.g(this.k, this.l, this.n.f0(), this.D, this.E, this.n.e0(), this.m, this.q, this.n.Q(), this.n.i0(), this.n.v0(), this.n.q0(), this.n.X(), this.n.o0(), this.n.k0(), this.n.j0(), this.n.V(), this, this.u);
                            if (this.z != aVar) {
                                this.w = null;
                            }
                            if (z) {
                                u("finished onSizeReady in " + t02.a(this.x));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // com.p7700g.p99005.vy1
    public boolean f() {
        boolean z;
        synchronized (this.g) {
            z = this.z == a.CLEARED;
        }
        return z;
    }

    @Override // com.p7700g.p99005.az1
    public Object g() {
        this.f.c();
        return this.g;
    }

    @Override // com.p7700g.p99005.vy1
    public void h() {
        synchronized (this.g) {
            i();
            this.f.c();
            this.x = t02.b();
            Object obj = this.l;
            if (obj == null) {
                if (z02.w(this.o, this.p)) {
                    this.D = this.o;
                    this.E = this.p;
                }
                z(new xr1("Received null model"), q() == null ? 5 : 3);
                return;
            }
            a aVar = this.z;
            a aVar2 = a.RUNNING;
            if (aVar != aVar2) {
                if (aVar == a.COMPLETE) {
                    c(this.v, aq1.MEMORY_CACHE, false);
                    return;
                }
                o(obj);
                this.d = c12.b(a);
                a aVar3 = a.WAITING_FOR_SIZE;
                this.z = aVar3;
                if (z02.w(this.o, this.p)) {
                    e(this.o, this.p);
                } else {
                    this.r.q(this);
                }
                a aVar4 = this.z;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && l()) {
                    this.r.l(r());
                }
                if (c) {
                    u("finished run method in " + t02.a(this.x));
                }
                return;
            }
            throw new IllegalArgumentException("Cannot restart a running request");
        }
    }

    @Override // com.p7700g.p99005.vy1
    public boolean isRunning() {
        boolean z;
        synchronized (this.g) {
            a aVar = this.z;
            z = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
        }
        return z;
    }

    @Override // com.p7700g.p99005.vy1
    public boolean j() {
        boolean z;
        synchronized (this.g) {
            z = this.z == a.COMPLETE;
        }
        return z;
    }

    @Override // com.p7700g.p99005.vy1
    public void pause() {
        synchronized (this.g) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.g) {
            obj = this.l;
            cls = this.m;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}