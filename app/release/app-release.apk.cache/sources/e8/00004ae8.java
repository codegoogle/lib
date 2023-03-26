package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LockFreeTaskQueue.kt */
@vo4(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0001\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "", "E", "", "singleConsumer", "<init>", "(Z)V", "element", "addLast", "(Ljava/lang/Object;)Z", "", com.anythink.expressad.foundation.d.c.cd, "()V", "isClosed", "()Z", "R", "Lkotlin/Function1;", "transform", "", "map", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "removeFirstOrNull", "()Ljava/lang/Object;", "isEmpty", "", "getSize", "()I", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class jm5<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(jm5.class, Object.class, "_cur");
    @NotNull
    private volatile /* synthetic */ Object _cur;

    public jm5(boolean z) {
        this._cur = new km5(8, z);
    }

    public final boolean a(@NotNull E e) {
        while (true) {
            km5 km5Var = (km5) this._cur;
            int a2 = km5Var.a(e);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                a.compareAndSet(this, km5Var, km5Var.k());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            km5 km5Var = (km5) this._cur;
            if (km5Var.d()) {
                return;
            }
            a.compareAndSet(this, km5Var, km5Var.k());
        }
    }

    public final int c() {
        return ((km5) this._cur).f();
    }

    public final boolean d() {
        return ((km5) this._cur).g();
    }

    public final boolean e() {
        return ((km5) this._cur).h();
    }

    @NotNull
    public final <R> List<R> f(@NotNull f05<? super E, ? extends R> f05Var) {
        return ((km5) this._cur).i(f05Var);
    }

    @Nullable
    public final E g() {
        while (true) {
            km5 km5Var = (km5) this._cur;
            E e = (E) km5Var.l();
            if (e != km5.p) {
                return e;
            }
            a.compareAndSet(this, km5Var, km5Var.k());
        }
    }
}