package com.p7700g.p99005;

import android.os.OutcomeReceiver;
import com.p7700g.p99005.qp4;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* compiled from: OutcomeReceiver.kt */
@e2(31)
@vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00042\u00020\u0005B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/core/os/ContinuationOutcomeReceiver;", "R", "E", "", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "continuation", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/Continuation;)V", "onError", "", "error", "(Ljava/lang/Throwable;)V", "onResult", "result", "(Ljava/lang/Object;)V", "toString", "", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class pm<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    @NotNull
    private final uv4<R> s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pm(@NotNull uv4<? super R> uv4Var) {
        super(false);
        c25.p(uv4Var, "continuation");
        this.s = uv4Var;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(@NotNull E e) {
        c25.p(e, "error");
        if (compareAndSet(false, true)) {
            uv4<R> uv4Var = this.s;
            qp4.a aVar = qp4.s;
            uv4Var.u(qp4.b(rp4.a(e)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            uv4<R> uv4Var = this.s;
            qp4.a aVar = qp4.s;
            uv4Var.u(qp4.b(r));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("ContinuationOutcomeReceiver(outcomeReceived = ");
        G.append(get());
        G.append(')');
        return G.toString();
    }
}