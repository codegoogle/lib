package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: Tasks.kt */
@vo4(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/scheduling/TaskImpl;", "Lkotlinx/coroutines/scheduling/Task;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "submissionTime", "", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/TaskContext;)V", "run", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class do5 extends ao5 {
    @cz4
    @NotNull
    public final Runnable u;

    public do5(@NotNull Runnable runnable, long j, @NotNull bo5 bo5Var) {
        super(j, bo5Var);
        this.u = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.u.run();
        } finally {
            this.t.k();
        }
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("Task[");
        G.append(qc5.a(this.u));
        G.append('@');
        G.append(qc5.b(this.u));
        G.append(", ");
        G.append(this.s);
        G.append(", ");
        G.append(this.t);
        G.append(f14.v);
        return G.toString();
    }
}