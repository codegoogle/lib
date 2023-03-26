package com.p7700g.p99005;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebSocket.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/p7700g/p99005/nr5;", "", "Lcom/p7700g/p99005/hr5;", "x0", "()Lcom/p7700g/p99005/hr5;", "", com.anythink.basead.d.g.i, "()J", "", "text", "", "b", "(Ljava/lang/String;)Z", "Lcom/p7700g/p99005/vv5;", "bytes", "a", "(Lcom/p7700g/p99005/vv5;)Z", "", "code", "reason", "f", "(ILjava/lang/String;)Z", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.d.a.b.dO, "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface nr5 {

    /* compiled from: WebSocket.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/p7700g/p99005/nr5$a", "", "Lcom/p7700g/p99005/hr5;", "request", "Lcom/p7700g/p99005/or5;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/p7700g/p99005/nr5;", "b", "(Lcom/p7700g/p99005/hr5;Lcom/p7700g/p99005/or5;)Lcom/p7700g/p99005/nr5;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public interface a {
        @NotNull
        nr5 b(@NotNull hr5 hr5Var, @NotNull or5 or5Var);
    }

    boolean a(@NotNull vv5 vv5Var);

    boolean b(@NotNull String str);

    void cancel();

    boolean f(int i, @Nullable String str);

    long g();

    @NotNull
    hr5 x0();
}