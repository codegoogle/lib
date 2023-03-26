package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.ar5;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealInterceptorChain.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u001c\u001a\u00020#\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b5\u00106JM\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u001f\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0011J\u001f\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u001c\u001a\u00020#8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u001c\u0010\n\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010'\u001a\u0004\b0\u0010\u0011R\u001c\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001fR\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u001c\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b4\u0010\u0011¨\u00067"}, d2 = {"Lcom/p7700g/p99005/xs5;", "Lcom/p7700g/p99005/ar5$a;", "", la1.l, "Lcom/p7700g/p99005/is5;", "exchange", "Lcom/p7700g/p99005/hr5;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "i", "(ILcom/p7700g/p99005/is5;Lcom/p7700g/p99005/hr5;III)Lcom/p7700g/p99005/xs5;", "Lcom/p7700g/p99005/mq5;", "f", "()Lcom/p7700g/p99005/mq5;", "h", "()I", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "d", "(ILjava/util/concurrent/TimeUnit;)Lcom/p7700g/p99005/ar5$a;", "b", com.anythink.basead.d.g.i, "c", "a", "Lcom/p7700g/p99005/hq5;", kg.p0, "()Lcom/p7700g/p99005/hq5;", "x0", "()Lcom/p7700g/p99005/hr5;", "Lcom/p7700g/p99005/jr5;", "e", "(Lcom/p7700g/p99005/hr5;)Lcom/p7700g/p99005/jr5;", "Lcom/p7700g/p99005/ks5;", "Lcom/p7700g/p99005/ks5;", "k", "()Lcom/p7700g/p99005/ks5;", AFHydra.STATUS_IDLE, "p", "", "Lcom/p7700g/p99005/ar5;", "Ljava/util/List;", "interceptors", "Lcom/p7700g/p99005/is5;", com.anythink.expressad.d.a.b.dH, "()Lcom/p7700g/p99005/is5;", "l", "Lcom/p7700g/p99005/hr5;", ij3.b, "calls", "n", "<init>", "(Lcom/p7700g/p99005/ks5;Ljava/util/List;ILcom/p7700g/p99005/is5;Lcom/p7700g/p99005/hr5;III)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class xs5 implements ar5.a {
    private int a;
    @NotNull
    private final ks5 b;
    private final List<ar5> c;
    private final int d;
    @Nullable
    private final is5 e;
    @NotNull
    private final hr5 f;
    private final int g;
    private final int h;
    private final int i;

    /* JADX WARN: Multi-variable type inference failed */
    public xs5(@NotNull ks5 ks5Var, @NotNull List<? extends ar5> list, int i, @Nullable is5 is5Var, @NotNull hr5 hr5Var, int i2, int i3, int i4) {
        c25.p(ks5Var, kg.p0);
        c25.p(list, "interceptors");
        c25.p(hr5Var, "request");
        this.b = ks5Var;
        this.c = list;
        this.d = i;
        this.e = is5Var;
        this.f = hr5Var;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public static /* synthetic */ xs5 j(xs5 xs5Var, int i, is5 is5Var, hr5 hr5Var, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = xs5Var.d;
        }
        if ((i5 & 2) != 0) {
            is5Var = xs5Var.e;
        }
        is5 is5Var2 = is5Var;
        if ((i5 & 4) != 0) {
            hr5Var = xs5Var.f;
        }
        hr5 hr5Var2 = hr5Var;
        if ((i5 & 8) != 0) {
            i2 = xs5Var.g;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = xs5Var.h;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = xs5Var.i;
        }
        return xs5Var.i(i, is5Var2, hr5Var2, i6, i7, i4);
    }

    @Override // com.p7700g.p99005.ar5.a
    @NotNull
    public ar5.a a(int i, @NotNull TimeUnit timeUnit) {
        c25.p(timeUnit, "unit");
        if (this.e == null) {
            return j(this, 0, null, null, 0, 0, sr5.j("writeTimeout", i, timeUnit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // com.p7700g.p99005.ar5.a
    public int b() {
        return this.h;
    }

    @Override // com.p7700g.p99005.ar5.a
    public int c() {
        return this.i;
    }

    @Override // com.p7700g.p99005.ar5.a
    @NotNull
    public hq5 call() {
        return this.b;
    }

    @Override // com.p7700g.p99005.ar5.a
    @NotNull
    public ar5.a d(int i, @NotNull TimeUnit timeUnit) {
        c25.p(timeUnit, "unit");
        if (this.e == null) {
            return j(this, 0, null, null, sr5.j("connectTimeout", i, timeUnit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // com.p7700g.p99005.ar5.a
    @NotNull
    public jr5 e(@NotNull hr5 hr5Var) throws IOException {
        c25.p(hr5Var, "request");
        if (this.d < this.c.size()) {
            this.a++;
            is5 is5Var = this.e;
            if (is5Var != null) {
                if (is5Var.j().g(hr5Var.q())) {
                    if (!(this.a == 1)) {
                        StringBuilder G = wo1.G("network interceptor ");
                        G.append(this.c.get(this.d - 1));
                        G.append(" must call proceed() exactly once");
                        throw new IllegalStateException(G.toString().toString());
                    }
                } else {
                    StringBuilder G2 = wo1.G("network interceptor ");
                    G2.append(this.c.get(this.d - 1));
                    G2.append(" must retain the same host and port");
                    throw new IllegalStateException(G2.toString().toString());
                }
            }
            xs5 j = j(this, this.d + 1, null, hr5Var, 0, 0, 0, 58, null);
            ar5 ar5Var = this.c.get(this.d);
            jr5 a = ar5Var.a(j);
            if (a != null) {
                if (this.e != null) {
                    if (!(this.d + 1 >= this.c.size() || j.a == 1)) {
                        throw new IllegalStateException(("network interceptor " + ar5Var + " must call proceed() exactly once").toString());
                    }
                }
                if (a.v() != null) {
                    return a;
                }
                throw new IllegalStateException(("interceptor " + ar5Var + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + ar5Var + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // com.p7700g.p99005.ar5.a
    @Nullable
    public mq5 f() {
        is5 is5Var = this.e;
        if (is5Var != null) {
            return is5Var.h();
        }
        return null;
    }

    @Override // com.p7700g.p99005.ar5.a
    @NotNull
    public ar5.a g(int i, @NotNull TimeUnit timeUnit) {
        c25.p(timeUnit, "unit");
        if (this.e == null) {
            return j(this, 0, null, null, 0, sr5.j("readTimeout", i, timeUnit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // com.p7700g.p99005.ar5.a
    public int h() {
        return this.g;
    }

    @NotNull
    public final xs5 i(int i, @Nullable is5 is5Var, @NotNull hr5 hr5Var, int i2, int i3, int i4) {
        c25.p(hr5Var, "request");
        return new xs5(this.b, this.c, i, is5Var, hr5Var, i2, i3, i4);
    }

    @NotNull
    public final ks5 k() {
        return this.b;
    }

    public final int l() {
        return this.g;
    }

    @Nullable
    public final is5 m() {
        return this.e;
    }

    public final int n() {
        return this.h;
    }

    @NotNull
    public final hr5 o() {
        return this.f;
    }

    public final int p() {
        return this.i;
    }

    @Override // com.p7700g.p99005.ar5.a
    @NotNull
    public hr5 x0() {
        return this.f;
    }
}