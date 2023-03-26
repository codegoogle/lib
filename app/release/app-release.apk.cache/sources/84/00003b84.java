package com.p7700g.p99005;

import com.p7700g.p99005.b12;
import com.p7700g.p99005.ip;

/* compiled from: LockedResource.java */
/* loaded from: classes2.dex */
public final class bs1<Z> implements cs1<Z>, b12.f {
    private static final ip.a<bs1<?>> s = b12.e(20, new a());
    private final d12 t = d12.a();
    private cs1<Z> u;
    private boolean v;
    private boolean w;

    /* compiled from: LockedResource.java */
    /* loaded from: classes2.dex */
    public class a implements b12.d<bs1<?>> {
        @Override // com.p7700g.p99005.b12.d
        /* renamed from: a */
        public bs1<?> create() {
            return new bs1<>();
        }
    }

    private void e(cs1<Z> cs1Var) {
        this.w = false;
        this.v = true;
        this.u = cs1Var;
    }

    @x1
    public static <Z> bs1<Z> f(cs1<Z> cs1Var) {
        bs1<Z> bs1Var = (bs1) x02.d(s.b());
        bs1Var.e(cs1Var);
        return bs1Var;
    }

    private void g() {
        this.u = null;
        s.a(this);
    }

    @Override // com.p7700g.p99005.cs1
    public synchronized void a() {
        this.t.c();
        this.w = true;
        if (!this.v) {
            this.u.a();
            g();
        }
    }

    @Override // com.p7700g.p99005.b12.f
    @x1
    public d12 b() {
        return this.t;
    }

    @Override // com.p7700g.p99005.cs1
    public int c() {
        return this.u.c();
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    public Class<Z> d() {
        return this.u.d();
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    public Z get() {
        return this.u.get();
    }

    public synchronized void h() {
        this.t.c();
        if (this.v) {
            this.v = false;
            if (this.w) {
                a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}