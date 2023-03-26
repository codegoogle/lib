package com.p7700g.p99005;

import com.p7700g.p99005.ec3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fc3<T, R> extends ec3 {
    @NotNull
    public static final b d = new b(null);
    private static final int e = 32;
    private static final int f = 64;
    private static final int g = 3;
    @NotNull
    private final a<T, R> h;
    @Nullable
    private fy2 i;

    /* loaded from: classes3.dex */
    public static final class a<T, R> extends ec3.a<T, R> {
        @Override // com.p7700g.p99005.ec3.a
        @NotNull
        /* renamed from: i */
        public fc3<T, R> h() {
            if (e() != null) {
                return new fc3<>(this);
            }
            throw new ey2(null, 1, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return fc3.e;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends fy2 {
        public final /* synthetic */ long h;
        public final /* synthetic */ fc3<T, R> i;
        public final /* synthetic */ long j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, fc3<T, R> fc3Var, long j2) {
            super(j, j2);
            this.h = j;
            this.i = fc3Var;
            this.j = j2;
        }

        @Override // com.p7700g.p99005.fy2
        public void j() {
            xz2.c(fy2.b, c25.C("Timer Complete for ", Long.valueOf(this.h)));
            ec3.b a = this.i.a();
            if (a == null) {
                return;
            }
            a.c();
        }

        @Override // com.p7700g.p99005.fy2
        public void k(long j) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc3(@NotNull a<T, R> aVar) {
        super(aVar.a(), aVar.e());
        c25.p(aVar, "builder");
        this.h = aVar;
    }

    public static /* synthetic */ fy2 l(fc3 fc3Var, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = fc3Var.m();
        }
        if ((i & 2) != 0) {
            j2 = 1000;
        }
        return fc3Var.k(j, j2);
    }

    @Override // com.p7700g.p99005.ec3
    public void c() {
        i();
        if (h()) {
            xz2.c("ExponentialBackOffPolicy", "Exponential Retry limit reached. Exiting");
            ec3.b a2 = a();
            if (a2 != null) {
                a2.d();
            }
            g();
            return;
        }
        xz2.c("ExponentialBackOffPolicy", c25.C("Starting retry attempt ", Integer.valueOf(j())));
        fy2 l = l(this, 0L, 0L, 3, null);
        StringBuilder G = wo1.G("Starting attempt ");
        G.append(j());
        G.append(" with time ");
        xz2.c("ExponentialBackOffPolicy", G.toString());
        l.q();
        yq4 yq4Var = yq4.a;
        this.i = l;
    }

    @Override // com.p7700g.p99005.ec3
    public void d() {
        fy2 fy2Var = this.i;
        if (fy2Var != null) {
            fy2Var.a();
        }
        this.i = null;
    }

    @Override // com.p7700g.p99005.ec3
    public void e() {
        fy2 fy2Var = this.i;
        if (fy2Var == null) {
            return;
        }
        fy2Var.l();
    }

    @Override // com.p7700g.p99005.ec3
    public void f() {
        fy2 fy2Var = this.i;
        if (fy2Var == null) {
            return;
        }
        fy2Var.m();
    }

    @Override // com.p7700g.p99005.ec3
    public void g() {
        super.g();
        fy2 fy2Var = this.i;
        if (fy2Var != null) {
            fy2Var.a();
        }
        this.i = null;
        b(null);
    }

    @r2(otherwise = 2)
    @NotNull
    public final fy2 k(long j, long j2) {
        xz2.c("ExponentialBackOffPolicy", String.valueOf(j));
        return new c(j, this, j2);
    }

    public long m() {
        double pow = Math.pow(2.0d, j()) + n() + this.h.f();
        xz2.c("ExponentialBackOffPolicy", "Generated backOff millies for " + pow + " millis ");
        return (long) pow;
    }

    @r2(otherwise = 2)
    public final long n() {
        return a45.K0((Math.random() * (this.h.f() - 1001)) + 1000);
    }
}