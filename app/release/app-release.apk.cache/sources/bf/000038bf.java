package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.p7700g.p99005.qp4;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DispatchedTask.kt */
@vo4(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0002\b\u0014J\u001f\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u001b\u001a\u00020\fJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000eH ¢\u0006\u0002\b\u001dR\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "cancelCompletedResult", "", "takenState", "", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "getExceptionalResult", CallMraidJS.b, "getExceptionalResult$kotlinx_coroutines_core", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "handleFatalException", "exception", "finallyException", "run", "takeState", "takeState$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ad5<T> extends ao5 {
    @cz4
    public int u;

    public ad5(int i) {
        this.u = i;
    }

    public void c(@Nullable Object obj, @NotNull Throwable th) {
    }

    @NotNull
    public abstract uv4<T> d();

    @Nullable
    public Throwable e(@Nullable Object obj) {
        ub5 ub5Var = obj instanceof ub5 ? (ub5) obj : null;
        if (ub5Var == null) {
            return null;
        }
        return ub5Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(@Nullable Object obj) {
        return obj;
    }

    public final void g(@Nullable Throwable th, @Nullable Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            co4.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        c25.m(th);
        hc5.b(d().getContext(), new oc5("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Nullable
    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object b;
        Object b2;
        bo5 bo5Var = this.t;
        try {
            ul5 ul5Var = (ul5) d();
            uv4<T> uv4Var = ul5Var.x;
            Object obj = ul5Var.z;
            xv4 context = uv4Var.getContext();
            Object c = fn5.c(context, obj);
            sf5<?> g = c != fn5.a ? dc5.g(uv4Var, context, c) : null;
            xv4 context2 = uv4Var.getContext();
            Object i = i();
            Throwable e = e(i);
            ee5 ee5Var = (e == null && bd5.c(this.u)) ? (ee5) context2.get(ee5.m0) : null;
            if (ee5Var != null && !ee5Var.h()) {
                CancellationException c1 = ee5Var.c1();
                c(i, c1);
                qp4.a aVar = qp4.s;
                uv4Var.u(qp4.b(rp4.a(c1)));
            } else if (e != null) {
                qp4.a aVar2 = qp4.s;
                uv4Var.u(qp4.b(rp4.a(e)));
            } else {
                T f = f(i);
                qp4.a aVar3 = qp4.s;
                uv4Var.u(qp4.b(f));
            }
            yq4 yq4Var = yq4.a;
            if (g == null || g.x1()) {
                fn5.a(context, c);
            }
            try {
                qp4.a aVar4 = qp4.s;
                bo5Var.k();
                b2 = qp4.b(yq4Var);
            } catch (Throwable th) {
                qp4.a aVar5 = qp4.s;
                b2 = qp4.b(rp4.a(th));
            }
            g(null, qp4.e(b2));
        } catch (Throwable th2) {
            try {
                qp4.a aVar6 = qp4.s;
                bo5Var.k();
                b = qp4.b(yq4.a);
            } catch (Throwable th3) {
                qp4.a aVar7 = qp4.s;
                b = qp4.b(rp4.a(th3));
            }
            g(th2, qp4.e(b));
        }
    }
}