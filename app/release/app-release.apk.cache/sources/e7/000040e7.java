package com.p7700g.p99005;

import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TestCoroutineContext.kt */
@vo4(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B%\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0011\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/test/TimedRunnableObsolete;", "", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "run", NewHtcHomeBadger.d, "", "time", "(Ljava/lang/Runnable;JJ)V", "heap", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", la1.l, "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ep5 implements Comparable<ep5>, Runnable, kn5 {
    @NotNull
    private final Runnable s;
    private final long t;
    @cz4
    public final long u;
    @Nullable
    private jn5<?> v;
    private int w;

    public ep5(@NotNull Runnable runnable, long j, long j2) {
        this.s = runnable;
        this.t = j;
        this.u = j2;
    }

    @Override // com.p7700g.p99005.kn5
    public void a(@Nullable jn5<?> jn5Var) {
        this.v = jn5Var;
    }

    @Override // com.p7700g.p99005.kn5
    @Nullable
    public jn5<?> b() {
        return this.v;
    }

    @Override // com.p7700g.p99005.kn5
    public void c(int i) {
        this.w = i;
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(@NotNull ep5 ep5Var) {
        long j = this.u;
        long j2 = ep5Var.u;
        if (j == j2) {
            return c25.u(this.t, ep5Var.t);
        }
        return c25.u(j, j2);
    }

    @Override // com.p7700g.p99005.kn5
    public int p() {
        return this.w;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.s.run();
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("TimedRunnable(time=");
        G.append(this.u);
        G.append(", run=");
        G.append(this.s);
        G.append(')');
        return G.toString();
    }

    public /* synthetic */ ep5(Runnable runnable, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(runnable, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2);
    }
}