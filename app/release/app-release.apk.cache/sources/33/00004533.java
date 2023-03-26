package com.p7700g.p99005;

import android.util.Log;
import com.p7700g.p99005.du1;
import com.p7700g.p99005.mr1;
import com.p7700g.p99005.rq1;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: SourceGenerator.java */
/* loaded from: classes2.dex */
public class gs1 implements mr1, mr1.a {
    private static final String s = "SourceGenerator";
    private final nr1<?> t;
    private final mr1.a u;
    private volatile int v;
    private volatile jr1 w;
    private volatile Object x;
    private volatile du1.a<?> y;
    private volatile kr1 z;

    /* compiled from: SourceGenerator.java */
    /* loaded from: classes2.dex */
    public class a implements rq1.a<Object> {
        public final /* synthetic */ du1.a s;

        public a(du1.a aVar) {
            this.s = aVar;
        }

        @Override // com.p7700g.p99005.rq1.a
        public void c(@x1 Exception exc) {
            if (gs1.this.g(this.s)) {
                gs1.this.i(this.s, exc);
            }
        }

        @Override // com.p7700g.p99005.rq1.a
        public void f(@z1 Object obj) {
            if (gs1.this.g(this.s)) {
                gs1.this.h(this.s, obj);
            }
        }
    }

    public gs1(nr1<?> nr1Var, mr1.a aVar) {
        this.t = nr1Var;
        this.u = aVar;
    }

    private boolean e(Object obj) throws IOException {
        long b = t02.b();
        boolean z = true;
        try {
            sq1<T> o = this.t.o(obj);
            Object a2 = o.a();
            dq1<X> q = this.t.q(a2);
            lr1 lr1Var = new lr1(q, a2, this.t.k());
            kr1 kr1Var = new kr1(this.y.a, this.t.p());
            xs1 d = this.t.d();
            d.a(kr1Var, lr1Var);
            if (Log.isLoggable(s, 2)) {
                String str = "Finished encoding source to cache, key: " + kr1Var + ", data: " + obj + ", encoder: " + q + ", duration: " + t02.a(b);
            }
            if (d.b(kr1Var) != null) {
                this.z = kr1Var;
                this.w = new jr1(Collections.singletonList(this.y.a), this.t, this);
                this.y.c.b();
                return true;
            }
            if (Log.isLoggable(s, 3)) {
                String str2 = "Attempt to write: " + this.z + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...";
            }
            try {
                this.u.d(this.y.a, o.a(), this.y.c, this.y.c.d(), this.y.a);
                return false;
            } catch (Throwable th) {
                th = th;
                if (!z) {
                    this.y.c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    private boolean f() {
        return this.v < this.t.g().size();
    }

    private void j(du1.a<?> aVar) {
        this.y.c.e(this.t.l(), new a(aVar));
    }

    @Override // com.p7700g.p99005.mr1.a
    public void a(gq1 gq1Var, Exception exc, rq1<?> rq1Var, aq1 aq1Var) {
        this.u.a(gq1Var, exc, rq1Var, this.y.c.d());
    }

    @Override // com.p7700g.p99005.mr1
    public boolean b() {
        if (this.x != null) {
            Object obj = this.x;
            this.x = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable(s, 3);
            }
        }
        if (this.w == null || !this.w.b()) {
            this.w = null;
            this.y = null;
            boolean z = false;
            while (!z && f()) {
                List<du1.a<?>> g = this.t.g();
                int i = this.v;
                this.v = i + 1;
                this.y = g.get(i);
                if (this.y != null && (this.t.e().c(this.y.c.d()) || this.t.u(this.y.c.a()))) {
                    j(this.y);
                    z = true;
                }
            }
            return z;
        }
        return true;
    }

    @Override // com.p7700g.p99005.mr1.a
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.p7700g.p99005.mr1
    public void cancel() {
        du1.a<?> aVar = this.y;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // com.p7700g.p99005.mr1.a
    public void d(gq1 gq1Var, Object obj, rq1<?> rq1Var, aq1 aq1Var, gq1 gq1Var2) {
        this.u.d(gq1Var, obj, rq1Var, this.y.c.d(), gq1Var);
    }

    public boolean g(du1.a<?> aVar) {
        du1.a<?> aVar2 = this.y;
        return aVar2 != null && aVar2 == aVar;
    }

    public void h(du1.a<?> aVar, Object obj) {
        qr1 e = this.t.e();
        if (obj != null && e.c(aVar.c.d())) {
            this.x = obj;
            this.u.c();
            return;
        }
        mr1.a aVar2 = this.u;
        gq1 gq1Var = aVar.a;
        rq1<?> rq1Var = aVar.c;
        aVar2.d(gq1Var, obj, rq1Var, rq1Var.d(), this.z);
    }

    public void i(du1.a<?> aVar, @x1 Exception exc) {
        mr1.a aVar2 = this.u;
        kr1 kr1Var = this.z;
        rq1<?> rq1Var = aVar.c;
        aVar2.a(kr1Var, exc, rq1Var, rq1Var.d());
    }
}