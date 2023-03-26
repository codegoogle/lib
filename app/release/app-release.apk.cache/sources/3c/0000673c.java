package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HandlerDispatcher.kt */
@vo4(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u001c\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100#H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0000X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "handler", "Landroid/os/Handler;", "name", "", "(Landroid/os/Handler;Ljava/lang/String;)V", "invokeImmediately", "", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "_immediate", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "cancelOnRejection", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "equals", "other", "", "hashCode", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "isDispatchNeeded", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class yf5 extends zf5 implements vc5 {
    @Nullable
    private volatile yf5 _immediate;
    @NotNull
    private final Handler t;
    @Nullable
    private final String u;
    private final boolean v;
    @NotNull
    private final yf5 w;

    /* compiled from: Runnable.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "kotlinx/coroutines/RunnableKt$Runnable$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ gb5 s;
        public final /* synthetic */ yf5 t;

        public a(gb5 gb5Var, yf5 yf5Var) {
            this.s = gb5Var;
            this.t = yf5Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.S(this.t, yq4.a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements f05<Throwable, yq4> {
        public final /* synthetic */ Runnable u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable) {
            super(1);
            yf5.this = r1;
            this.u = runnable;
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
            a(th);
            return yq4.a;
        }

        public final void a(@Nullable Throwable th) {
            yf5.this.t.removeCallbacks(this.u);
        }
    }

    private yf5(Handler handler, String str, boolean z) {
        super(null);
        this.t = handler;
        this.u = str;
        this.v = z;
        this._immediate = z ? this : null;
        yf5 yf5Var = this._immediate;
        if (yf5Var == null) {
            yf5Var = new yf5(handler, str, true);
            this._immediate = yf5Var;
        }
        this.w = yf5Var;
    }

    private final void K1(xv4 xv4Var, Runnable runnable) {
        ie5.f(xv4Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        dd5.c().s(xv4Var, runnable);
    }

    public static final void Y1(yf5 yf5Var, Runnable runnable) {
        yf5Var.t.removeCallbacks(runnable);
    }

    public static /* synthetic */ void Z1(yf5 yf5Var, Runnable runnable) {
        Y1(yf5Var, runnable);
    }

    @Override // com.p7700g.p99005.zf5
    @NotNull
    /* renamed from: T1 */
    public yf5 Y() {
        return this.w;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof yf5) && ((yf5) obj).t == this.t;
    }

    public int hashCode() {
        return System.identityHashCode(this.t);
    }

    @Override // com.p7700g.p99005.vc5
    public void j(long j, @NotNull gb5<? super yq4> gb5Var) {
        a aVar = new a(gb5Var, this);
        if (this.t.postDelayed(aVar, i55.v(j, q95.c))) {
            gb5Var.D(new b(aVar));
        } else {
            K1(gb5Var.getContext(), aVar);
        }
    }

    @Override // com.p7700g.p99005.zf5, com.p7700g.p99005.vc5
    @NotNull
    public gd5 q(long j, @NotNull final Runnable runnable, @NotNull xv4 xv4Var) {
        if (this.t.postDelayed(runnable, i55.v(j, q95.c))) {
            return new gd5() { // from class: com.p7700g.p99005.wf5
                @Override // com.p7700g.p99005.gd5
                public final void w() {
                    yf5.Z1(yf5.this, runnable);
                }
            };
        }
        K1(xv4Var, runnable);
        return te5.s;
    }

    @Override // com.p7700g.p99005.ec5
    public void s(@NotNull xv4 xv4Var, @NotNull Runnable runnable) {
        if (this.t.post(runnable)) {
            return;
        }
        K1(xv4Var, runnable);
    }

    @Override // com.p7700g.p99005.qe5, com.p7700g.p99005.ec5
    @NotNull
    public String toString() {
        String W = W();
        if (W == null) {
            String str = this.u;
            if (str == null) {
                str = this.t.toString();
            }
            return this.v ? c25.C(str, ".immediate") : str;
        }
        return W;
    }

    @Override // com.p7700g.p99005.ec5
    public boolean w(@NotNull xv4 xv4Var) {
        return (this.v && c25.g(Looper.myLooper(), this.t.getLooper())) ? false : true;
    }

    public /* synthetic */ yf5(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public yf5(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }
}