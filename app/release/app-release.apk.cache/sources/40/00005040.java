package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Job.kt */
@vo4(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/ChildHandle;", "Lkotlinx/coroutines/DisposableHandle;", "parent", "Lkotlinx/coroutines/Job;", "getParent$annotations", "()V", "getParent", "()Lkotlinx/coroutines/Job;", "childCancelled", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@xn4(level = zn4.ERROR, message = "This is internal API and may be removed in the future releases")
@zd5
/* loaded from: classes3.dex */
public interface mb5 extends gd5 {

    /* compiled from: Job.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        @zd5
        public static /* synthetic */ void a() {
        }
    }

    @Nullable
    ee5 getParent();

    @zd5
    boolean q(@NotNull Throwable th);
}