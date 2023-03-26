package com.p7700g.p99005;

import android.os.Build;
import android.util.Log;
import com.p7700g.p99005.b12;
import com.p7700g.p99005.hp1;
import com.p7700g.p99005.ip;
import com.p7700g.p99005.mr1;
import com.p7700g.p99005.pr1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: DecodeJob.java */
/* loaded from: classes2.dex */
public class or1<R> implements mr1.a, Runnable, Comparable<or1<?>>, b12.f {
    private static final String s = "DecodeJob";
    private ap1 A;
    private gq1 B;
    private fp1 C;
    private ur1 D;
    private int E;
    private int F;
    private qr1 G;
    private jq1 H;
    private b<R> I;
    private int J;
    private h K;
    private g L;
    private long M;
    private boolean N;
    private Object O;
    private Thread P;
    private gq1 Q;
    private gq1 R;
    private Object S;
    private aq1 T;
    private rq1<?> U;
    private volatile mr1 V;
    private volatile boolean W;
    private volatile boolean X;
    private boolean Y;
    private final e w;
    private final ip.a<or1<?>> x;
    private final nr1<R> t = new nr1<>();
    private final List<Throwable> u = new ArrayList();
    private final d12 v = d12.a();
    private final d<?> y = new d<>();
    private final f z = new f();

    /* compiled from: DecodeJob.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            cq1.values();
            int[] iArr = new int[3];
            c = iArr;
            try {
                iArr[cq1.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[cq1.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            h.values();
            int[] iArr2 = new int[6];
            b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            g.values();
            int[] iArr3 = new int[3];
            a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes2.dex */
    public interface b<R> {
        void a(xr1 xr1Var);

        void c(cs1<R> cs1Var, aq1 aq1Var, boolean z);

        void d(or1<?> or1Var);
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes2.dex */
    public final class c<Z> implements pr1.a<Z> {
        private final aq1 a;

        public c(aq1 aq1Var) {
            this.a = aq1Var;
        }

        @Override // com.p7700g.p99005.pr1.a
        @x1
        public cs1<Z> a(@x1 cs1<Z> cs1Var) {
            return or1.this.v(this.a, cs1Var);
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes2.dex */
    public static class d<Z> {
        private gq1 a;
        private mq1<Z> b;
        private bs1<Z> c;

        public void a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public void b(e eVar, jq1 jq1Var) {
            c12.a("DecodeJob.encode");
            try {
                eVar.a().a(this.a, new lr1(this.b, this.c, jq1Var));
            } finally {
                this.c.h();
                c12.f();
            }
        }

        public boolean c() {
            return this.c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <X> void d(gq1 gq1Var, mq1<X> mq1Var, bs1<X> bs1Var) {
            this.a = gq1Var;
            this.b = mq1Var;
            this.c = bs1Var;
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes2.dex */
    public interface e {
        xs1 a();
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes2.dex */
    public static class f {
        private boolean a;
        private boolean b;
        private boolean c;

        private boolean a(boolean z) {
            return (this.c || z || this.b) && this.a;
        }

        public synchronized boolean b() {
            this.b = true;
            return a(false);
        }

        public synchronized boolean c() {
            this.c = true;
            return a(false);
        }

        public synchronized boolean d(boolean z) {
            this.a = true;
            return a(z);
        }

        public synchronized void e() {
            this.b = false;
            this.a = false;
            this.c = false;
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes2.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes2.dex */
    public enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public or1(e eVar, ip.a<or1<?>> aVar) {
        this.w = eVar;
        this.x = aVar;
    }

    private void A() {
        int ordinal = this.L.ordinal();
        if (ordinal == 0) {
            this.K = k(h.INITIALIZE);
            this.V = j();
            y();
        } else if (ordinal == 1) {
            y();
        } else if (ordinal == 2) {
            i();
        } else {
            StringBuilder G = wo1.G("Unrecognized run reason: ");
            G.append(this.L);
            throw new IllegalStateException(G.toString());
        }
    }

    private void B() {
        Throwable th;
        this.v.c();
        if (this.W) {
            if (this.u.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.u;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.W = true;
    }

    private <Data> cs1<R> g(rq1<?> rq1Var, Data data, aq1 aq1Var) throws xr1 {
        if (data == null) {
            return null;
        }
        try {
            long b2 = t02.b();
            cs1<R> h2 = h(data, aq1Var);
            if (Log.isLoggable(s, 2)) {
                o("Decoded result " + h2, b2);
            }
            return h2;
        } finally {
            rq1Var.b();
        }
    }

    private <Data> cs1<R> h(Data data, aq1 aq1Var) throws xr1 {
        return z(data, aq1Var, (as1<Data, ?, R>) this.t.h(data.getClass()));
    }

    private void i() {
        if (Log.isLoggable(s, 2)) {
            long j = this.M;
            StringBuilder G = wo1.G("data: ");
            G.append(this.S);
            G.append(", cache key: ");
            G.append(this.Q);
            G.append(", fetcher: ");
            G.append(this.U);
            p("Retrieved data", j, G.toString());
        }
        cs1<R> cs1Var = null;
        try {
            cs1Var = g(this.U, this.S, this.T);
        } catch (xr1 e2) {
            e2.n(this.R, this.T);
            this.u.add(e2);
        }
        if (cs1Var != null) {
            r(cs1Var, this.T, this.Y);
        } else {
            y();
        }
    }

    private mr1 j() {
        int ordinal = this.K.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 5) {
                        return null;
                    }
                    StringBuilder G = wo1.G("Unrecognized stage: ");
                    G.append(this.K);
                    throw new IllegalStateException(G.toString());
                }
                return new gs1(this.t, this);
            }
            return new jr1(this.t, this);
        }
        return new ds1(this.t, this);
    }

    private h k(h hVar) {
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            if (this.G.b()) {
                return h.RESOURCE_CACHE;
            }
            return k(h.RESOURCE_CACHE);
        } else if (ordinal == 1) {
            if (this.G.a()) {
                return h.DATA_CACHE;
            }
            return k(h.DATA_CACHE);
        } else if (ordinal == 2) {
            return this.N ? h.FINISHED : h.SOURCE;
        } else if (ordinal != 3 && ordinal != 5) {
            throw new IllegalArgumentException("Unrecognized stage: " + hVar);
        } else {
            return h.FINISHED;
        }
    }

    @x1
    private jq1 l(aq1 aq1Var) {
        jq1 jq1Var = this.H;
        if (Build.VERSION.SDK_INT < 26) {
            return jq1Var;
        }
        boolean z = aq1Var == aq1.RESOURCE_DISK_CACHE || this.t.x();
        iq1<Boolean> iq1Var = ov1.f;
        Boolean bool = (Boolean) jq1Var.c(iq1Var);
        if (bool == null || (bool.booleanValue() && !z)) {
            jq1 jq1Var2 = new jq1();
            jq1Var2.d(this.H);
            jq1Var2.e(iq1Var, Boolean.valueOf(z));
            return jq1Var2;
        }
        return jq1Var;
    }

    private int m() {
        return this.C.ordinal();
    }

    private void o(String str, long j) {
        p(str, j, null);
    }

    private void p(String str, long j, String str2) {
        StringBuilder L = wo1.L(str, " in ");
        L.append(t02.a(j));
        L.append(", load key: ");
        L.append(this.D);
        L.append(str2 != null ? wo1.t(", ", str2) : "");
        L.append(", thread: ");
        L.append(Thread.currentThread().getName());
        L.toString();
    }

    private void q(cs1<R> cs1Var, aq1 aq1Var, boolean z) {
        B();
        this.I.c(cs1Var, aq1Var, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r(cs1<R> cs1Var, aq1 aq1Var, boolean z) {
        c12.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (cs1Var instanceof yr1) {
                ((yr1) cs1Var).initialize();
            }
            bs1 bs1Var = 0;
            if (this.y.c()) {
                cs1Var = bs1.f(cs1Var);
                bs1Var = cs1Var;
            }
            q(cs1Var, aq1Var, z);
            this.K = h.ENCODE;
            if (this.y.c()) {
                this.y.b(this.w, this.H);
            }
            if (bs1Var != 0) {
                bs1Var.h();
            }
            t();
        } finally {
            c12.f();
        }
    }

    private void s() {
        B();
        this.I.a(new xr1("Failed to load resource", new ArrayList(this.u)));
        u();
    }

    private void t() {
        if (this.z.b()) {
            x();
        }
    }

    private void u() {
        if (this.z.c()) {
            x();
        }
    }

    private void x() {
        this.z.e();
        this.y.a();
        this.t.a();
        this.W = false;
        this.A = null;
        this.B = null;
        this.H = null;
        this.C = null;
        this.D = null;
        this.I = null;
        this.K = null;
        this.V = null;
        this.P = null;
        this.Q = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.M = 0L;
        this.X = false;
        this.O = null;
        this.u.clear();
        this.x.a(this);
    }

    private void y() {
        this.P = Thread.currentThread();
        this.M = t02.b();
        boolean z = false;
        while (!this.X && this.V != null && !(z = this.V.b())) {
            this.K = k(this.K);
            this.V = j();
            if (this.K == h.SOURCE) {
                c();
                return;
            }
        }
        if ((this.K == h.FINISHED || this.X) && !z) {
            s();
        }
    }

    private <Data, ResourceType> cs1<R> z(Data data, aq1 aq1Var, as1<Data, ResourceType, R> as1Var) throws xr1 {
        jq1 l = l(aq1Var);
        sq1<Data> l2 = this.A.i().l(data);
        try {
            return as1Var.b(l2, l, this.E, this.F, new c(aq1Var));
        } finally {
            l2.b();
        }
    }

    public boolean D() {
        h k = k(h.INITIALIZE);
        return k == h.RESOURCE_CACHE || k == h.DATA_CACHE;
    }

    @Override // com.p7700g.p99005.mr1.a
    public void a(gq1 gq1Var, Exception exc, rq1<?> rq1Var, aq1 aq1Var) {
        rq1Var.b();
        xr1 xr1Var = new xr1("Fetching data failed", exc);
        xr1Var.o(gq1Var, aq1Var, rq1Var.a());
        this.u.add(xr1Var);
        if (Thread.currentThread() != this.P) {
            this.L = g.SWITCH_TO_SOURCE_SERVICE;
            this.I.d(this);
            return;
        }
        y();
    }

    @Override // com.p7700g.p99005.b12.f
    @x1
    public d12 b() {
        return this.v;
    }

    @Override // com.p7700g.p99005.mr1.a
    public void c() {
        this.L = g.SWITCH_TO_SOURCE_SERVICE;
        this.I.d(this);
    }

    @Override // com.p7700g.p99005.mr1.a
    public void d(gq1 gq1Var, Object obj, rq1<?> rq1Var, aq1 aq1Var, gq1 gq1Var2) {
        this.Q = gq1Var;
        this.S = obj;
        this.U = rq1Var;
        this.T = aq1Var;
        this.R = gq1Var2;
        this.Y = gq1Var != this.t.c().get(0);
        if (Thread.currentThread() != this.P) {
            this.L = g.DECODE_DATA;
            this.I.d(this);
            return;
        }
        c12.a("DecodeJob.decodeFromRetrievedData");
        try {
            i();
        } finally {
            c12.f();
        }
    }

    public void e() {
        this.X = true;
        mr1 mr1Var = this.V;
        if (mr1Var != null) {
            mr1Var.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public int compareTo(@x1 or1<?> or1Var) {
        int m = m() - or1Var.m();
        return m == 0 ? this.J - or1Var.J : m;
    }

    public or1<R> n(ap1 ap1Var, Object obj, ur1 ur1Var, gq1 gq1Var, int i, int i2, Class<?> cls, Class<R> cls2, fp1 fp1Var, qr1 qr1Var, Map<Class<?>, nq1<?>> map, boolean z, boolean z2, boolean z3, jq1 jq1Var, b<R> bVar, int i3) {
        this.t.v(ap1Var, obj, gq1Var, i, i2, qr1Var, cls, cls2, fp1Var, jq1Var, map, z, z2, this.w);
        this.A = ap1Var;
        this.B = gq1Var;
        this.C = fp1Var;
        this.D = ur1Var;
        this.E = i;
        this.F = i2;
        this.G = qr1Var;
        this.N = z3;
        this.H = jq1Var;
        this.I = bVar;
        this.J = i3;
        this.L = g.INITIALIZE;
        this.O = obj;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        c12.d("DecodeJob#run(reason=%s, model=%s)", this.L, this.O);
        rq1<?> rq1Var = this.U;
        try {
            try {
                if (this.X) {
                    s();
                    if (rq1Var != null) {
                        rq1Var.b();
                    }
                    c12.f();
                    return;
                }
                A();
                if (rq1Var != null) {
                    rq1Var.b();
                }
                c12.f();
            } catch (ir1 e2) {
                throw e2;
            }
        }
    }

    @x1
    public <Z> cs1<Z> v(aq1 aq1Var, @x1 cs1<Z> cs1Var) {
        cs1<Z> cs1Var2;
        nq1<Z> nq1Var;
        cq1 cq1Var;
        gq1 kr1Var;
        Class<?> cls = cs1Var.get().getClass();
        mq1<Z> mq1Var = null;
        if (aq1Var != aq1.RESOURCE_DISK_CACHE) {
            nq1<Z> s2 = this.t.s(cls);
            nq1Var = s2;
            cs1Var2 = s2.b(this.A, cs1Var, this.E, this.F);
        } else {
            cs1Var2 = cs1Var;
            nq1Var = null;
        }
        if (!cs1Var.equals(cs1Var2)) {
            cs1Var.a();
        }
        if (this.t.w(cs1Var2)) {
            mq1Var = this.t.n(cs1Var2);
            cq1Var = mq1Var.b(this.H);
        } else {
            cq1Var = cq1.NONE;
        }
        mq1 mq1Var2 = mq1Var;
        if (this.G.d(!this.t.y(this.Q), aq1Var, cq1Var)) {
            if (mq1Var2 != null) {
                int ordinal = cq1Var.ordinal();
                if (ordinal == 0) {
                    kr1Var = new kr1(this.Q, this.B);
                } else if (ordinal == 1) {
                    kr1Var = new es1(this.t.b(), this.Q, this.B, this.E, this.F, nq1Var, cls, this.H);
                } else {
                    throw new IllegalArgumentException("Unknown strategy: " + cq1Var);
                }
                bs1 f2 = bs1.f(cs1Var2);
                this.y.d(kr1Var, mq1Var2, f2);
                return f2;
            }
            throw new hp1.d(cs1Var2.get().getClass());
        }
        return cs1Var2;
    }

    public void w(boolean z) {
        if (this.z.d(z)) {
            x();
        }
    }
}