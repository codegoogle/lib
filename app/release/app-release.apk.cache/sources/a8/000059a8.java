package com.p7700g.p99005;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p7700g.p99005.ec3;
import com.p7700g.p99005.sz2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ra3<T, R> implements sz2.b, ka3<T, R>, ec3.b {
    @NotNull
    public static final a s = new a(null);
    @Nullable
    private sz2 A;
    @NotNull
    private final ec3.a<T, R> t;
    @NotNull
    private final ka3<T, R> u;
    @NotNull
    private ec3 v;
    @Nullable
    private b23<T, R> w;
    @Nullable
    private h23<R> x;
    @Nullable
    private h23<String> y;
    @Nullable
    private Throwable z;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ra3(@NotNull ec3.a<T, R> aVar, @NotNull ka3<T, R> ka3Var) {
        c25.p(aVar, "backOffPolicyBuilder");
        c25.p(ka3Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.t = aVar;
        this.u = ka3Var;
        this.v = aVar.c(this).h();
        sz2 a2 = sz2.a.a();
        if (a2 == null) {
            a2 = null;
        } else {
            a2.e(this);
            yq4 yq4Var = yq4.a;
        }
        this.A = a2;
    }

    @Override // com.p7700g.p99005.ka3
    public void a(@NotNull b23<T, R> b23Var, @NotNull h23<String> h23Var, @NotNull Throwable th) {
        c25.p(b23Var, "request");
        c25.p(h23Var, "response");
        c25.p(th, "t");
        i(b23Var, h23Var, th);
    }

    @Override // com.p7700g.p99005.ka3
    public void b(@NotNull b23<T, R> b23Var, @NotNull h23<R> h23Var) {
        c25.p(b23Var, "request");
        c25.p(h23Var, "response");
        if (!h23Var.d()) {
            h(b23Var, h23Var);
            return;
        }
        this.u.b(b23Var, h23Var);
        this.v.d();
        sz2 sz2Var = this.A;
        if (sz2Var == null) {
            return;
        }
        sz2Var.q(this);
    }

    @Override // com.p7700g.p99005.ec3.b
    public void c() {
        String[] strArr = new String[1];
        b23<T, R> b23Var = this.w;
        strArr[0] = c25.C("Sending next request ", b23Var == null ? null : b23Var.j());
        xz2.c("RequestRetryHandler", strArr);
        b23<T, R> b23Var2 = this.w;
        if (b23Var2 == null) {
            return;
        }
        b23Var2.q();
    }

    @Override // com.p7700g.p99005.ec3.b
    public void d() {
        b23<T, R> b23Var = this.w;
        if (b23Var == null) {
            return;
        }
        h23<String> e = e();
        if (e == null) {
            e = new h23<>("Request failed with no error and max tries reached", (int) com.anythink.expressad.video.dynview.a.a.t, false);
        }
        ka3<T, R> ka3Var = this.u;
        Throwable g = g();
        if (g == null) {
            g = new Throwable();
        }
        ka3Var.a(b23Var, e, g);
    }

    @Nullable
    public final h23<String> e() {
        return this.y;
    }

    public final void f(@Nullable Throwable th) {
        this.z = th;
    }

    @Nullable
    public final Throwable g() {
        return this.z;
    }

    @r2
    public final void h(@NotNull b23<T, R> b23Var, @NotNull h23<R> h23Var) {
        c25.p(b23Var, "request");
        c25.p(h23Var, "response");
        xz2.c("RequestRetryHandler", "Request failed with error null error");
        this.w = b23Var;
        this.x = h23Var;
        this.y = null;
        this.v.c();
    }

    @r2
    public final void i(@NotNull b23<T, R> b23Var, @NotNull h23<String> h23Var, @Nullable Throwable th) {
        c25.p(b23Var, "request");
        c25.p(h23Var, "response");
        xz2.c("RequestRetryHandler", c25.C("Request failed with error ", h23Var.c()));
        this.w = b23Var;
        this.x = null;
        this.y = h23Var;
        if (th != null) {
            f(th);
        }
        this.v.c();
    }

    @Override // com.p7700g.p99005.sz2.b
    public void u() {
        xz2.c("RequestRetryHandler", "Network Lost. Pausing timer");
        this.v.e();
    }

    @Override // com.p7700g.p99005.sz2.b
    public void x() {
        xz2.c("RequestRetryHandler", "Network Connected. Resuming timer");
        this.v.f();
    }
}