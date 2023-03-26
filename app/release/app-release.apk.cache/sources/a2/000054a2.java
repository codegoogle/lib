package com.p7700g.p99005;

import com.p7700g.p99005.qp4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Cancellable.kt */
@vo4(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a#\u0010\u0006\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0082\b\u001a\u001e\u0010\t\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000\u001a>\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000b*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001ay\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u000b*\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00102\u0006\u0010\u0011\u001a\u0002H\u000f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00032%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"dispatcherFailure", "", "completion", "Lkotlin/coroutines/Continuation;", "e", "", "runSafely", "block", "Lkotlin/Function0;", "startCoroutineCancellable", "fatalCompletion", "T", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "onCancellation", "Lkotlin/ParameterName;", "name", "cause", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class on5 {
    private static final void a(uv4<?> uv4Var, Throwable th) {
        qp4.a aVar = qp4.s;
        uv4Var.u(qp4.b(rp4.a(th)));
        throw th;
    }

    private static final void b(uv4<?> uv4Var, uz4<yq4> uz4Var) {
        try {
            uz4Var.x();
        } catch (Throwable th) {
            a(uv4Var, th);
        }
    }

    public static final void c(@NotNull uv4<? super yq4> uv4Var, @NotNull uv4<?> uv4Var2) {
        try {
            uv4 d = fw4.d(uv4Var);
            qp4.a aVar = qp4.s;
            vl5.g(d, qp4.b(yq4.a), null, 2, null);
        } catch (Throwable th) {
            a(uv4Var2, th);
        }
    }

    @zd5
    public static final <T> void d(@NotNull f05<? super uv4<? super T>, ? extends Object> f05Var, @NotNull uv4<? super T> uv4Var) {
        try {
            uv4 d = fw4.d(fw4.b(f05Var, uv4Var));
            qp4.a aVar = qp4.s;
            vl5.g(d, qp4.b(yq4.a), null, 2, null);
        } catch (Throwable th) {
            a(uv4Var, th);
        }
    }

    public static final <R, T> void e(@NotNull j05<? super R, ? super uv4<? super T>, ? extends Object> j05Var, R r, @NotNull uv4<? super T> uv4Var, @Nullable f05<? super Throwable, yq4> f05Var) {
        try {
            uv4 d = fw4.d(fw4.c(j05Var, r, uv4Var));
            qp4.a aVar = qp4.s;
            vl5.f(d, qp4.b(yq4.a), f05Var);
        } catch (Throwable th) {
            a(uv4Var, th);
        }
    }

    public static /* synthetic */ void f(j05 j05Var, Object obj, uv4 uv4Var, f05 f05Var, int i, Object obj2) {
        if ((i & 4) != 0) {
            f05Var = null;
        }
        e(j05Var, obj, uv4Var, f05Var);
    }
}