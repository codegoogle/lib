package com.p7700g.p99005;

import com.p7700g.p99005.qp4;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DispatchedContinuation.kt */
@vo4(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082\b\u001aU\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u0012\u0010\u001d\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00100\bH\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"REUSABLE_CLAIMED", "Lkotlinx/coroutines/internal/Symbol;", "getREUSABLE_CLAIMED$annotations", "()V", "UNDEFINED", "getUNDEFINED$annotations", "executeUnconfined", "", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "contState", "", "mode", "", "doYield", "block", "Lkotlin/Function0;", "", "resumeCancellableWith", "T", "Lkotlin/coroutines/Continuation;", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "yieldUndispatched", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class vl5 {
    @NotNull
    private static final an5 a = new an5("UNDEFINED");
    @cz4
    @NotNull
    public static final an5 b = new an5("REUSABLE_CLAIMED");

    private static final boolean b(ul5<?> ul5Var, Object obj, int i, boolean z, uz4<yq4> uz4Var) {
        kd5 b2 = lf5.a.b();
        if (z && b2.b2()) {
            return false;
        }
        if (b2.a2()) {
            ul5Var.y = obj;
            ul5Var.u = i;
            b2.J1(ul5Var);
            return true;
        }
        b2.T1(true);
        try {
            uz4Var.x();
            do {
            } while (b2.d2());
            z15.d(1);
        } catch (Throwable th) {
            try {
                ul5Var.g(th, null);
                z15.d(1);
            } catch (Throwable th2) {
                z15.d(1);
                b2.K(true);
                z15.c(1);
                throw th2;
            }
        }
        b2.K(true);
        z15.c(1);
        return false;
    }

    public static /* synthetic */ boolean c(ul5 ul5Var, Object obj, int i, boolean z, uz4 uz4Var, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        kd5 b2 = lf5.a.b();
        if (z && b2.b2()) {
            return false;
        }
        if (b2.a2()) {
            ul5Var.y = obj;
            ul5Var.u = i;
            b2.J1(ul5Var);
            return true;
        }
        b2.T1(true);
        try {
            uz4Var.x();
            do {
            } while (b2.d2());
            z15.d(1);
        } catch (Throwable th) {
            try {
                ul5Var.g(th, null);
                z15.d(1);
            } catch (Throwable th2) {
                z15.d(1);
                b2.K(true);
                z15.c(1);
                throw th2;
            }
        }
        b2.K(true);
        z15.c(1);
        return false;
    }

    public static /* synthetic */ void d() {
    }

    private static /* synthetic */ void e() {
    }

    @zd5
    public static final <T> void f(@NotNull uv4<? super T> uv4Var, @NotNull Object obj, @Nullable f05<? super Throwable, yq4> f05Var) {
        boolean z;
        if (uv4Var instanceof ul5) {
            ul5 ul5Var = (ul5) uv4Var;
            Object b2 = ac5.b(obj, f05Var);
            if (ul5Var.w.w(ul5Var.getContext())) {
                ul5Var.y = b2;
                ul5Var.u = 1;
                ul5Var.w.s(ul5Var.getContext(), ul5Var);
                return;
            }
            kd5 b3 = lf5.a.b();
            if (b3.a2()) {
                ul5Var.y = b2;
                ul5Var.u = 1;
                b3.J1(ul5Var);
                return;
            }
            b3.T1(true);
            try {
                ee5 ee5Var = (ee5) ul5Var.getContext().get(ee5.m0);
                if (ee5Var == null || ee5Var.h()) {
                    z = false;
                } else {
                    CancellationException c1 = ee5Var.c1();
                    ul5Var.c(b2, c1);
                    qp4.a aVar = qp4.s;
                    ul5Var.u(qp4.b(rp4.a(c1)));
                    z = true;
                }
                if (!z) {
                    uv4<T> uv4Var2 = ul5Var.x;
                    Object obj2 = ul5Var.z;
                    xv4 context = uv4Var2.getContext();
                    Object c = fn5.c(context, obj2);
                    sf5<?> g = c != fn5.a ? dc5.g(uv4Var2, context, c) : null;
                    ul5Var.x.u(obj);
                    yq4 yq4Var = yq4.a;
                    if (g == null || g.x1()) {
                        fn5.a(context, c);
                    }
                }
                do {
                } while (b3.d2());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        uv4Var.u(obj);
    }

    public static /* synthetic */ void g(uv4 uv4Var, Object obj, f05 f05Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            f05Var = null;
        }
        f(uv4Var, obj, f05Var);
    }

    public static final boolean h(@NotNull ul5<? super yq4> ul5Var) {
        yq4 yq4Var = yq4.a;
        kd5 b2 = lf5.a.b();
        if (b2.b2()) {
            return false;
        }
        if (b2.a2()) {
            ul5Var.y = yq4Var;
            ul5Var.u = 1;
            b2.J1(ul5Var);
            return true;
        }
        b2.T1(true);
        try {
            ul5Var.run();
            do {
            } while (b2.d2());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}