package com.p7700g.p99005;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: ForwardingTimeout.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/p7700g/p99005/cw5;", "Lcom/p7700g/p99005/zw5;", "delegate", com.anythink.expressad.d.a.b.dH, "(Lcom/p7700g/p99005/zw5;)Lcom/p7700g/p99005/cw5;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "(JLjava/util/concurrent/TimeUnit;)Lcom/p7700g/p99005/zw5;", "j", "()J", "", "f", "()Z", "d", "deadlineNanoTime", "e", "(J)Lcom/p7700g/p99005/zw5;", "b", "()Lcom/p7700g/p99005/zw5;", "a", "Lcom/p7700g/p99005/yq4;", "h", "()V", "Lcom/p7700g/p99005/zw5;", "l", "n", "(Lcom/p7700g/p99005/zw5;)V", "<init>", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public class cw5 extends zw5 {
    @NotNull
    private zw5 f;

    public cw5(@NotNull zw5 zw5Var) {
        c25.p(zw5Var, "delegate");
        this.f = zw5Var;
    }

    @Override // com.p7700g.p99005.zw5
    @NotNull
    public zw5 a() {
        return this.f.a();
    }

    @Override // com.p7700g.p99005.zw5
    @NotNull
    public zw5 b() {
        return this.f.b();
    }

    @Override // com.p7700g.p99005.zw5
    public long d() {
        return this.f.d();
    }

    @Override // com.p7700g.p99005.zw5
    @NotNull
    public zw5 e(long j) {
        return this.f.e(j);
    }

    @Override // com.p7700g.p99005.zw5
    public boolean f() {
        return this.f.f();
    }

    @Override // com.p7700g.p99005.zw5
    public void h() throws IOException {
        this.f.h();
    }

    @Override // com.p7700g.p99005.zw5
    @NotNull
    public zw5 i(long j, @NotNull TimeUnit timeUnit) {
        c25.p(timeUnit, "unit");
        return this.f.i(j, timeUnit);
    }

    @Override // com.p7700g.p99005.zw5
    public long j() {
        return this.f.j();
    }

    @fz4(name = "delegate")
    @NotNull
    public final zw5 l() {
        return this.f;
    }

    @NotNull
    public final cw5 m(@NotNull zw5 zw5Var) {
        c25.p(zw5Var, "delegate");
        this.f = zw5Var;
        return this;
    }

    public final /* synthetic */ void n(zw5 zw5Var) {
        c25.p(zw5Var, "<set-?>");
        this.f = zw5Var;
    }
}