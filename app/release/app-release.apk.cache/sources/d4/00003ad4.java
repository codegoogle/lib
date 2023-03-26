package com.p7700g.p99005;

import com.p7700g.p99005.qp4;
import org.jetbrains.annotations.NotNull;

/* compiled from: DispatchedTask.kt */
@vo4(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0000\u001a.\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000fH\u0002\u001a\u0019\u0010\u0016\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a'\u0010\u0019\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001e"}, d2 = {"MODE_ATOMIC", "", "MODE_CANCELLABLE", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE_REUSABLE", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "isCancellableMode", "", "(I)Z", "isReusableMode", "dispatch", "", "T", "Lkotlinx/coroutines/DispatchedTask;", "mode", com.anythink.expressad.foundation.d.c.ca, "delegate", "Lkotlin/coroutines/Continuation;", "undispatched", "resumeUnconfined", "resumeWithStackTrace", "exception", "", "runUnconfinedEventLoop", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "block", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class bd5 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = -1;

    public static final <T> void a(@NotNull ad5<? super T> ad5Var, int i) {
        uv4<? super T> d2 = ad5Var.d();
        boolean z = i == 4;
        if (!z && (d2 instanceof ul5) && c(i) == c(ad5Var.u)) {
            ec5 ec5Var = ((ul5) d2).w;
            xv4 context = d2.getContext();
            if (ec5Var.w(context)) {
                ec5Var.s(context, ad5Var);
                return;
            } else {
                f(ad5Var);
                return;
            }
        }
        e(ad5Var, d2, z);
    }

    @np4
    public static /* synthetic */ void b() {
    }

    public static final boolean c(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean d(int i) {
        return i == 2;
    }

    public static final <T> void e(@NotNull ad5<? super T> ad5Var, @NotNull uv4<? super T> uv4Var, boolean z) {
        Object f;
        boolean x1;
        Object i = ad5Var.i();
        Throwable e2 = ad5Var.e(i);
        if (e2 != null) {
            qp4.a aVar = qp4.s;
            f = rp4.a(e2);
        } else {
            qp4.a aVar2 = qp4.s;
            f = ad5Var.f(i);
        }
        Object b2 = qp4.b(f);
        if (z) {
            ul5 ul5Var = (ul5) uv4Var;
            uv4<T> uv4Var2 = ul5Var.x;
            Object obj = ul5Var.z;
            xv4 context = uv4Var2.getContext();
            Object c2 = fn5.c(context, obj);
            sf5<?> g = c2 != fn5.a ? dc5.g(uv4Var2, context, c2) : null;
            try {
                ul5Var.x.u(b2);
                yq4 yq4Var = yq4.a;
                if (g != null) {
                    if (!x1) {
                        return;
                    }
                }
                return;
            } finally {
                if (g == null || g.x1()) {
                    fn5.a(context, c2);
                }
            }
        }
        uv4Var.u(b2);
    }

    private static final void f(ad5<?> ad5Var) {
        kd5 b2 = lf5.a.b();
        if (b2.a2()) {
            b2.J1(ad5Var);
            return;
        }
        b2.T1(true);
        try {
            e(ad5Var, ad5Var.d(), true);
            do {
            } while (b2.d2());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void g(@NotNull uv4<?> uv4Var, @NotNull Throwable th) {
        qp4.a aVar = qp4.s;
        uv4Var.u(qp4.b(rp4.a(th)));
    }

    public static final void h(@NotNull ad5<?> ad5Var, @NotNull kd5 kd5Var, @NotNull uz4<yq4> uz4Var) {
        kd5Var.T1(true);
        try {
            uz4Var.x();
            do {
            } while (kd5Var.d2());
            z15.d(1);
        } catch (Throwable th) {
            try {
                ad5Var.g(th, null);
                z15.d(1);
            } catch (Throwable th2) {
                z15.d(1);
                kd5Var.K(true);
                z15.c(1);
                throw th2;
            }
        }
        kd5Var.K(true);
        z15.c(1);
    }
}