package com.p7700g.p99005;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* compiled from: RouteException.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0007J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/p7700g/p99005/ps5;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "e", "Lcom/p7700g/p99005/yq4;", "a", "(Ljava/io/IOException;)V", "<set-?>", "s", "Ljava/io/IOException;", com.anythink.basead.d.g.i, "()Ljava/io/IOException;", "lastConnectException", "t", "f", "firstConnectException", "<init>", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ps5 extends RuntimeException {
    @NotNull
    private IOException s;
    @NotNull
    private final IOException t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps5(@NotNull IOException iOException) {
        super(iOException);
        c25.p(iOException, "firstConnectException");
        this.t = iOException;
        this.s = iOException;
    }

    public final void a(@NotNull IOException iOException) {
        c25.p(iOException, "e");
        co4.a(this.t, iOException);
        this.s = iOException;
    }

    @NotNull
    public final IOException f() {
        return this.t;
    }

    @NotNull
    public final IOException g() {
        return this.s;
    }
}