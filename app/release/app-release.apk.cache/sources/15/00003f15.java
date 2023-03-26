package com.p7700g.p99005;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* compiled from: TestCoroutineContext.kt */
@vo4(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¨\u0006\u0007"}, d2 = {"withTestContext", "", "testContext", "Lkotlinx/coroutines/test/TestCoroutineContext;", "testBody", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class dp5 {
    @xn4(level = zn4.ERROR, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @op4(expression = "testContext.runBlockingTest(testBody)", imports = {"kotlin.coroutines.test"}))
    public static final void a(@NotNull cp5 cp5Var, @NotNull f05<? super cp5, yq4> f05Var) {
        f05Var.M(cp5Var);
        List<Throwable> B = cp5Var.B();
        boolean z = true;
        if (!(B instanceof Collection) || !B.isEmpty()) {
            Iterator<T> it = B.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!(((Throwable) it.next()) instanceof CancellationException)) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            throw new AssertionError(c25.C("Coroutine encountered unhandled exceptions:\n", cp5Var.B()));
        }
    }

    public static /* synthetic */ void b(cp5 cp5Var, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            cp5Var = new cp5(null, 1, null);
        }
        a(cp5Var, f05Var);
    }
}