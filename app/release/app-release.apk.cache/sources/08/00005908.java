package com.p7700g.p99005;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: JDK7PlatformImplementations.kt */
@vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "()V", "addSuppressed", "", "cause", "", "exception", "getSuppressed", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class qx4 extends jx4 {
    @Override // com.p7700g.p99005.jx4
    public void a(@NotNull Throwable th, @NotNull Throwable th2) {
        c25.p(th, "cause");
        c25.p(th2, "exception");
        th.addSuppressed(th2);
    }

    @Override // com.p7700g.p99005.jx4
    @NotNull
    public List<Throwable> d(@NotNull Throwable th) {
        c25.p(th, "exception");
        Throwable[] suppressed = th.getSuppressed();
        c25.o(suppressed, "exception.suppressed");
        return zr4.t(suppressed);
    }
}