package com.p7700g.p99005;

import android.util.Log;
import com.p7700g.p99005.b12;
import com.p7700g.p99005.gt1;
import com.p7700g.p99005.ip;
import com.p7700g.p99005.or1;
import com.p7700g.p99005.wr1;
import com.p7700g.p99005.xs1;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: Engine.java */
/* loaded from: classes2.dex */
public class rr1 implements tr1, gt1.a, wr1.a {
    private static final int b = 150;
    private final zr1 d;
    private final vr1 e;
    private final gt1 f;
    private final b g;
    private final fs1 h;
    private final c i;
    private final a j;
    private final hr1 k;
    private static final String a = "Engine";
    private static final boolean c = Log.isLoggable(a, 2);

    /* compiled from: Engine.java */
    @r2
    /* loaded from: classes2.dex */
    public static class a {
        public final or1.e a;
        public final ip.a<or1<?>> b = b12.e(150, new C0238a());
        private int c;

        /* compiled from: Engine.java */
        /* renamed from: com.p7700g.p99005.rr1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0238a implements b12.d<or1<?>> {
            public C0238a() {
            }

            @Override // com.p7700g.p99005.b12.d
            /* renamed from: a */
            public or1<?> create() {
                a aVar = a.this;
                return new or1<>(aVar.a, aVar.b);
            }
        }

        public a(or1.e eVar) {
            this.a = eVar;
        }

        public <R> or1<R> a(ap1 ap1Var, Object obj, ur1 ur1Var, gq1 gq1Var, int i, int i2, Class<?> cls, Class<R> cls2, fp1 fp1Var, qr1 qr1Var, Map<Class<?>, nq1<?>> map, boolean z, boolean z2, boolean z3, jq1 jq1Var, or1.b<R> bVar) {
            or1 or1Var = (or1) x02.d(this.b.b());
            int i3 = this.c;
            this.c = i3 + 1;
            return or1Var.n(ap1Var, obj, ur1Var, gq1Var, i, i2, cls, cls2, fp1Var, qr1Var, map, z, z2, z3, jq1Var, bVar, i3);
        }
    }

    /* compiled from: Engine.java */
    @r2
    /* loaded from: classes2.dex */
    public static class b {
        public final kt1 a;
        public final kt1 b;
        public final kt1 c;
        public final kt1 d;
        public final tr1 e;
        public final wr1.a f;
        public final ip.a<sr1<?>> g = b12.e(150, new a());

        /* compiled from: Engine.java */
        /* loaded from: classes2.dex */
        public class a implements b12.d<sr1<?>> {
            public a() {
            }

            @Override // com.p7700g.p99005.b12.d
            /* renamed from: a */
            public sr1<?> create() {
                b bVar = b.this;
                return new sr1<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        public b(kt1 kt1Var, kt1 kt1Var2, kt1 kt1Var3, kt1 kt1Var4, tr1 tr1Var, wr1.a aVar) {
            this.a = kt1Var;
            this.b = kt1Var2;
            this.c = kt1Var3;
            this.d = kt1Var4;
            this.e = tr1Var;
            this.f = aVar;
        }

        public <R> sr1<R> a(gq1 gq1Var, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((sr1) x02.d(this.g.b())).l(gq1Var, z, z2, z3, z4);
        }

        @r2
        public void b() {
            q02.c(this.a);
            q02.c(this.b);
            q02.c(this.c);
            q02.c(this.d);
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes2.dex */
    public static class c implements or1.e {
        private final xs1.a a;
        private volatile xs1 b;

        public c(xs1.a aVar) {
            this.a = aVar;
        }

        @Override // com.p7700g.p99005.or1.e
        public xs1 a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = this.a.build();
                    }
                    if (this.b == null) {
                        this.b = new ys1();
                    }
                }
            }
            return this.b;
        }

        @r2
        public synchronized void b() {
            if (this.b == null) {
                return;
            }
            this.b.clear();
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes2.dex */
    public class d {
        private final sr1<?> a;
        private final az1 b;

        public d(az1 az1Var, sr1<?> sr1Var) {
            this.b = az1Var;
            this.a = sr1Var;
        }

        public void a() {
            synchronized (rr1.this) {
                this.a.s(this.b);
            }
        }
    }

    public rr1(gt1 gt1Var, xs1.a aVar, kt1 kt1Var, kt1 kt1Var2, kt1 kt1Var3, kt1 kt1Var4, boolean z) {
        this(gt1Var, aVar, kt1Var, kt1Var2, kt1Var3, kt1Var4, null, null, null, null, null, null, z);
    }

    private wr1<?> f(gq1 gq1Var) {
        cs1<?> g = this.f.g(gq1Var);
        if (g == null) {
            return null;
        }
        if (g instanceof wr1) {
            return (wr1) g;
        }
        return new wr1<>(g, true, true, gq1Var, this);
    }

    @z1
    private wr1<?> h(gq1 gq1Var) {
        wr1<?> e = this.k.e(gq1Var);
        if (e != null) {
            e.b();
        }
        return e;
    }

    private wr1<?> i(gq1 gq1Var) {
        wr1<?> f = f(gq1Var);
        if (f != null) {
            f.b();
            this.k.a(gq1Var, f);
        }
        return f;
    }

    @z1
    private wr1<?> j(ur1 ur1Var, boolean z, long j) {
        if (z) {
            wr1<?> h = h(ur1Var);
            if (h != null) {
                if (c) {
                    k("Loaded resource from active resources", j, ur1Var);
                }
                return h;
            }
            wr1<?> i = i(ur1Var);
            if (i != null) {
                if (c) {
                    k("Loaded resource from cache", j, ur1Var);
                }
                return i;
            }
            return null;
        }
        return null;
    }

    private static void k(String str, long j, gq1 gq1Var) {
        StringBuilder L = wo1.L(str, " in ");
        L.append(t02.a(j));
        L.append("ms, key: ");
        L.append(gq1Var);
        L.toString();
    }

    private <R> d n(ap1 ap1Var, Object obj, gq1 gq1Var, int i, int i2, Class<?> cls, Class<R> cls2, fp1 fp1Var, qr1 qr1Var, Map<Class<?>, nq1<?>> map, boolean z, boolean z2, jq1 jq1Var, boolean z3, boolean z4, boolean z5, boolean z6, az1 az1Var, Executor executor, ur1 ur1Var, long j) {
        sr1<?> a2 = this.d.a(ur1Var, z6);
        if (a2 != null) {
            a2.e(az1Var, executor);
            if (c) {
                k("Added to existing load", j, ur1Var);
            }
            return new d(az1Var, a2);
        }
        sr1<R> a3 = this.g.a(ur1Var, z3, z4, z5, z6);
        or1<R> a4 = this.j.a(ap1Var, obj, ur1Var, gq1Var, i, i2, cls, cls2, fp1Var, qr1Var, map, z, z2, z6, jq1Var, a3);
        this.d.d(ur1Var, a3);
        a3.e(az1Var, executor);
        a3.t(a4);
        if (c) {
            k("Started new load", j, ur1Var);
        }
        return new d(az1Var, a3);
    }

    @Override // com.p7700g.p99005.gt1.a
    public void a(@x1 cs1<?> cs1Var) {
        this.h.a(cs1Var, true);
    }

    @Override // com.p7700g.p99005.tr1
    public synchronized void b(sr1<?> sr1Var, gq1 gq1Var, wr1<?> wr1Var) {
        if (wr1Var != null) {
            if (wr1Var.f()) {
                this.k.a(gq1Var, wr1Var);
            }
        }
        this.d.e(gq1Var, sr1Var);
    }

    @Override // com.p7700g.p99005.tr1
    public synchronized void c(sr1<?> sr1Var, gq1 gq1Var) {
        this.d.e(gq1Var, sr1Var);
    }

    @Override // com.p7700g.p99005.wr1.a
    public void d(gq1 gq1Var, wr1<?> wr1Var) {
        this.k.d(gq1Var);
        if (wr1Var.f()) {
            this.f.b(gq1Var, wr1Var);
        } else {
            this.h.a(wr1Var, false);
        }
    }

    public void e() {
        this.i.a().clear();
    }

    public <R> d g(ap1 ap1Var, Object obj, gq1 gq1Var, int i, int i2, Class<?> cls, Class<R> cls2, fp1 fp1Var, qr1 qr1Var, Map<Class<?>, nq1<?>> map, boolean z, boolean z2, jq1 jq1Var, boolean z3, boolean z4, boolean z5, boolean z6, az1 az1Var, Executor executor) {
        long b2 = c ? t02.b() : 0L;
        ur1 a2 = this.e.a(obj, gq1Var, i, i2, map, cls, cls2, jq1Var);
        synchronized (this) {
            wr1<?> j = j(a2, z3, b2);
            if (j == null) {
                return n(ap1Var, obj, gq1Var, i, i2, cls, cls2, fp1Var, qr1Var, map, z, z2, jq1Var, z3, z4, z5, z6, az1Var, executor, a2, b2);
            }
            az1Var.c(j, aq1.MEMORY_CACHE, false);
            return null;
        }
    }

    public void l(cs1<?> cs1Var) {
        if (cs1Var instanceof wr1) {
            ((wr1) cs1Var).g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @r2
    public void m() {
        this.g.b();
        this.i.b();
        this.k.h();
    }

    @r2
    public rr1(gt1 gt1Var, xs1.a aVar, kt1 kt1Var, kt1 kt1Var2, kt1 kt1Var3, kt1 kt1Var4, zr1 zr1Var, vr1 vr1Var, hr1 hr1Var, b bVar, a aVar2, fs1 fs1Var, boolean z) {
        this.f = gt1Var;
        c cVar = new c(aVar);
        this.i = cVar;
        hr1 hr1Var2 = hr1Var == null ? new hr1(z) : hr1Var;
        this.k = hr1Var2;
        hr1Var2.g(this);
        this.e = vr1Var == null ? new vr1() : vr1Var;
        this.d = zr1Var == null ? new zr1() : zr1Var;
        this.g = bVar == null ? new b(kt1Var, kt1Var2, kt1Var3, kt1Var4, this, this) : bVar;
        this.j = aVar2 == null ? new a(cVar) : aVar2;
        this.h = fs1Var == null ? new fs1() : fs1Var;
        gt1Var.h(this);
    }
}