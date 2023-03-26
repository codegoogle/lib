package com.p7700g.p99005;

import com.p7700g.p99005.hq5;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: OkHttpCall.java */
/* loaded from: classes4.dex */
public final class rz5<T> implements hz5<T> {
    private final wz5 s;
    private final Object[] t;
    private final hq5.a u;
    private final lz5<kr5, T> v;
    private volatile boolean w;
    @GuardedBy("this")
    @Nullable
    private hq5 x;
    @GuardedBy("this")
    @Nullable
    private Throwable y;
    @GuardedBy("this")
    private boolean z;

    /* compiled from: OkHttpCall.java */
    /* loaded from: classes4.dex */
    public class a implements iq5 {
        public final /* synthetic */ jz5 a;

        public a(jz5 jz5Var) {
            this.a = jz5Var;
        }

        private void c(Throwable th) {
            try {
                this.a.a(rz5.this, th);
            } catch (Throwable th2) {
                c06.s(th2);
                th2.printStackTrace();
            }
        }

        @Override // com.p7700g.p99005.iq5
        public void a(hq5 hq5Var, jr5 jr5Var) {
            try {
                try {
                    this.a.b(rz5.this, rz5.this.d(jr5Var));
                } catch (Throwable th) {
                    c06.s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                c06.s(th2);
                c(th2);
            }
        }

        @Override // com.p7700g.p99005.iq5
        public void b(hq5 hq5Var, IOException iOException) {
            c(iOException);
        }
    }

    /* compiled from: OkHttpCall.java */
    /* loaded from: classes4.dex */
    public static final class b extends kr5 {
        private final kr5 u;
        private final uv5 v;
        @Nullable
        public IOException w;

        /* compiled from: OkHttpCall.java */
        /* loaded from: classes4.dex */
        public class a extends bw5 {
            public a(xw5 xw5Var) {
                super(xw5Var);
            }

            @Override // com.p7700g.p99005.bw5, com.p7700g.p99005.xw5
            public long read(sv5 sv5Var, long j) throws IOException {
                try {
                    return super.read(sv5Var, j);
                } catch (IOException e) {
                    b.this.w = e;
                    throw e;
                }
            }
        }

        public b(kr5 kr5Var) {
            this.u = kr5Var;
            this.v = jw5.d(new a(kr5Var.A()));
        }

        @Override // com.p7700g.p99005.kr5
        public uv5 A() {
            return this.v;
        }

        public void F() throws IOException {
            IOException iOException = this.w;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.p7700g.p99005.kr5, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.u.close();
        }

        @Override // com.p7700g.p99005.kr5
        public long j() {
            return this.u.j();
        }

        @Override // com.p7700g.p99005.kr5
        public br5 k() {
            return this.u.k();
        }
    }

    /* compiled from: OkHttpCall.java */
    /* loaded from: classes4.dex */
    public static final class c extends kr5 {
        @Nullable
        private final br5 u;
        private final long v;

        public c(@Nullable br5 br5Var, long j) {
            this.u = br5Var;
            this.v = j;
        }

        @Override // com.p7700g.p99005.kr5
        public uv5 A() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        @Override // com.p7700g.p99005.kr5
        public long j() {
            return this.v;
        }

        @Override // com.p7700g.p99005.kr5
        public br5 k() {
            return this.u;
        }
    }

    public rz5(wz5 wz5Var, Object[] objArr, hq5.a aVar, lz5<kr5, T> lz5Var) {
        this.s = wz5Var;
        this.t = objArr;
        this.u = aVar;
        this.v = lz5Var;
    }

    private hq5 b() throws IOException {
        hq5 a2 = this.u.a(this.s.a(this.t));
        Objects.requireNonNull(a2, "Call.Factory returned null.");
        return a2;
    }

    @GuardedBy("this")
    private hq5 c() throws IOException {
        hq5 hq5Var = this.x;
        if (hq5Var != null) {
            return hq5Var;
        }
        Throwable th = this.y;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw ((IOException) th);
        }
        try {
            hq5 b2 = b();
            this.x = b2;
            return b2;
        } catch (IOException | Error | RuntimeException e) {
            c06.s(e);
            this.y = e;
            throw e;
        }
    }

    @Override // com.p7700g.p99005.hz5
    public synchronized boolean X0() {
        return this.z;
    }

    @Override // com.p7700g.p99005.hz5
    /* renamed from: a */
    public rz5<T> d1() {
        return new rz5<>(this.s, this.t, this.u, this.v);
    }

    @Override // com.p7700g.p99005.hz5
    public boolean c1() {
        boolean z = true;
        if (this.w) {
            return true;
        }
        synchronized (this) {
            hq5 hq5Var = this.x;
            if (hq5Var == null || !hq5Var.c1()) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.p7700g.p99005.hz5
    public void cancel() {
        hq5 hq5Var;
        this.w = true;
        synchronized (this) {
            hq5Var = this.x;
        }
        if (hq5Var != null) {
            hq5Var.cancel();
        }
    }

    public xz5<T> d(jr5 jr5Var) throws IOException {
        kr5 v = jr5Var.v();
        jr5 c2 = jr5Var.c1().b(new c(v.k(), v.j())).c();
        int E = c2.E();
        if (E < 200 || E >= 300) {
            try {
                return xz5.d(c06.a(v), c2);
            } finally {
                v.close();
            }
        } else if (E != 204 && E != 205) {
            b bVar = new b(v);
            try {
                return xz5.m(this.v.a(bVar), c2);
            } catch (RuntimeException e) {
                bVar.F();
                throw e;
            }
        } else {
            v.close();
            return xz5.m(null, c2);
        }
    }

    @Override // com.p7700g.p99005.hz5
    public void m(jz5<T> jz5Var) {
        hq5 hq5Var;
        Throwable th;
        Objects.requireNonNull(jz5Var, "callback == null");
        synchronized (this) {
            if (!this.z) {
                this.z = true;
                hq5Var = this.x;
                th = this.y;
                if (hq5Var == null && th == null) {
                    hq5 b2 = b();
                    this.x = b2;
                    hq5Var = b2;
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            jz5Var.a(this, th);
            return;
        }
        if (this.w) {
            hq5Var.cancel();
        }
        hq5Var.D1(new a(jz5Var));
    }

    @Override // com.p7700g.p99005.hz5
    public synchronized zw5 timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return c().timeout();
    }

    @Override // com.p7700g.p99005.hz5
    public xz5<T> w0() throws IOException {
        hq5 c2;
        synchronized (this) {
            if (!this.z) {
                this.z = true;
                c2 = c();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.w) {
            c2.cancel();
        }
        return d(c2.w0());
    }

    @Override // com.p7700g.p99005.hz5
    public synchronized hr5 x0() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return c().x0();
    }
}