package com.p7700g.p99005;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* compiled from: Call.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0000H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/p7700g/p99005/hq5;", "", "Lcom/p7700g/p99005/hr5;", "x0", "()Lcom/p7700g/p99005/hr5;", "Lcom/p7700g/p99005/jr5;", "w0", "()Lcom/p7700g/p99005/jr5;", "Lcom/p7700g/p99005/iq5;", "responseCallback", "Lcom/p7700g/p99005/yq4;", "D1", "(Lcom/p7700g/p99005/iq5;)V", com.anythink.expressad.d.a.b.dO, "()V", "", "X0", "()Z", "c1", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", com.anythink.expressad.foundation.g.a.N, "()Lcom/p7700g/p99005/hq5;", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface hq5 extends Cloneable {

    /* compiled from: Call.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/hq5$a", "", "Lcom/p7700g/p99005/hr5;", "request", "Lcom/p7700g/p99005/hq5;", "a", "(Lcom/p7700g/p99005/hr5;)Lcom/p7700g/p99005/hq5;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public interface a {
        @NotNull
        hq5 a(@NotNull hr5 hr5Var);
    }

    void D1(@NotNull iq5 iq5Var);

    boolean X0();

    boolean c1();

    void cancel();

    @NotNull
    hq5 d1();

    @NotNull
    zw5 timeout();

    @NotNull
    jr5 w0() throws IOException;

    @NotNull
    hr5 x0();
}