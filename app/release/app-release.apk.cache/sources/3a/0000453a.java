package com.p7700g.p99005;

import com.p7700g.p99005.ar5;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* compiled from: ConnectInterceptor.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/p7700g/p99005/gs5;", "Lcom/p7700g/p99005/ar5;", "Lcom/p7700g/p99005/ar5$a;", "chain", "Lcom/p7700g/p99005/jr5;", "a", "(Lcom/p7700g/p99005/ar5$a;)Lcom/p7700g/p99005/jr5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class gs5 implements ar5 {
    public static final gs5 b = new gs5();

    private gs5() {
    }

    @Override // com.p7700g.p99005.ar5
    @NotNull
    public jr5 a(@NotNull ar5.a aVar) throws IOException {
        c25.p(aVar, "chain");
        xs5 xs5Var = (xs5) aVar;
        return xs5.j(xs5Var, 0, xs5Var.k().B(xs5Var), null, 0, 0, 0, 61, null).e(xs5Var.o());
    }
}