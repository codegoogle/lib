package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: DefaultExecutor.kt */
@vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"DefaultDelay", "Lkotlinx/coroutines/Delay;", "getDefaultDelay", "()Lkotlinx/coroutines/Delay;", "defaultMainDelayOptIn", "", "initializeDefaultDelay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class sc5 {
    private static final boolean a = cn5.e("kotlinx.coroutines.main.delay", false);
    @NotNull
    private static final vc5 b = b();

    @NotNull
    public static final vc5 a() {
        return b;
    }

    private static final vc5 b() {
        if (a) {
            qe5 e = dd5.e();
            return (om5.d(e) || !(e instanceof vc5)) ? rc5.y : (vc5) e;
        }
        return rc5.y;
    }
}