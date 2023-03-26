package com.p7700g.p99005;

/* compiled from: LimitedDispatcher.kt */
@vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"checkParallelism", "", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class cm5 {
    public static final void a(int i) {
        if (!(i >= 1)) {
            throw new IllegalArgumentException(c25.C("Expected positive parallelism level, but got ", Integer.valueOf(i)).toString());
        }
    }
}