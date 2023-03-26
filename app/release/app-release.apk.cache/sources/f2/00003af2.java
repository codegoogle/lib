package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: Runnable.kt */
@vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0006"}, d2 = {"Runnable", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/Function0;", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class bf5 {

    /* compiled from: Runnable.kt */
    @vo4(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ uz4<yq4> s;

        public a(uz4<yq4> uz4Var) {
            this.s = uz4Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.x();
        }
    }

    @NotNull
    public static final Runnable a(@NotNull uz4<yq4> uz4Var) {
        return new a(uz4Var);
    }
}