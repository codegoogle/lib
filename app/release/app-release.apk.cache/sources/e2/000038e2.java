package com.p7700g.p99005;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.p7700g.p99005.qp4;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HandlerDispatcher.kt */
@vo4(d1 = {"\u0000@\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0011\u0010\b\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002\u001a\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002\u001a\u001d\u0010\u000f\u001a\u00020\u0003*\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\b\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0010*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"MAX_DELAY", "", "Main", "Lkotlinx/coroutines/android/HandlerDispatcher;", "getMain$annotations", "()V", "choreographer", "Landroid/view/Choreographer;", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postFrameCallback", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "updateChoreographerAndPostFrameCallback", "asCoroutineDispatcher", "Landroid/os/Handler;", "name", "", "from", "asHandler", "Landroid/os/Looper;", "async", "", "kotlinx-coroutines-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ag5 {
    private static final long a = 4611686018427387903L;
    @cz4
    @Nullable
    public static final zf5 b;
    @Nullable
    private static volatile Choreographer choreographer;

    /* compiled from: Runnable.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "kotlinx/coroutines/RunnableKt$Runnable$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ gb5 s;

        public a(gb5 gb5Var) {
            this.s = gb5Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ag5.l(this.s);
        }
    }

    static {
        Object b2;
        try {
            qp4.a aVar = qp4.s;
            b2 = qp4.b(new yf5(c(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            qp4.a aVar2 = qp4.s;
            b2 = qp4.b(rp4.a(th));
        }
        b = qp4.i(b2) ? null : b2;
    }

    @r2
    @NotNull
    public static final Handler c(@NotNull Looper looper, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
                return (Handler) invoke;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    @Nullable
    public static final Object d(@NotNull uv4<? super Long> uv4Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            hb5 hb5Var = new hb5(fw4.d(uv4Var), 1);
            hb5Var.T();
            j(choreographer2, hb5Var);
            Object x = hb5Var.x();
            if (x == gw4.h()) {
                ow4.c(uv4Var);
            }
            return x;
        }
        hb5 hb5Var2 = new hb5(fw4.d(uv4Var), 1);
        hb5Var2.T();
        dd5.e().s(zv4.s, new a(hb5Var2));
        Object x2 = hb5Var2.x();
        if (x2 == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x2;
    }

    @gz4
    @fz4(name = "from")
    @NotNull
    public static final zf5 e(@NotNull Handler handler) {
        return g(handler, null, 1, null);
    }

    @gz4
    @fz4(name = "from")
    @NotNull
    public static final zf5 f(@NotNull Handler handler, @Nullable String str) {
        return new yf5(handler, str);
    }

    public static /* synthetic */ zf5 g(Handler handler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return f(handler, str);
    }

    @xn4(level = zn4.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void i(gb5 gb5Var, long j) {
        k(gb5Var, j);
    }

    public static final void j(Choreographer choreographer2, final gb5<? super Long> gb5Var) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: com.p7700g.p99005.xf5
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                ag5.i(gb5.this, j);
            }
        });
    }

    public static final void k(gb5 gb5Var, long j) {
        gb5Var.S(dd5.e(), Long.valueOf(j));
    }

    public static final void l(gb5<? super Long> gb5Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            c25.m(choreographer2);
            choreographer = choreographer2;
        }
        j(choreographer2, gb5Var);
    }
}