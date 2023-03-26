package com.p7700g.p99005;

import com.p7700g.p99005.qp4;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Await.kt */
@vo4(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u000e:\u0002\u000b\fB\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/AwaitAll;", "T", "", "Lkotlinx/coroutines/Deferred;", "deferreds", "<init>", "([Lkotlinx/coroutines/Deferred;)V", "", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "[Lkotlinx/coroutines/Deferred;", "AwaitAllNode", "DisposeHandlersOnCancel", "kotlinx-coroutines-core", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ua5<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(ua5.class, "notCompletedCount");
    @NotNull
    private final tc5<T>[] b;
    @NotNull
    public volatile /* synthetic */ int notCompletedCount;

    /* compiled from: Await.kt */
    @vo4(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0082\u0004\u0018\u00002\u00020\u001cB\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR<\u0010\u0013\u001a\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u000e\u001a\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00028\u00000\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/CancellableContinuation;", "", "continuation", "<init>", "(Lkotlinx/coroutines/AwaitAll;Lkotlinx/coroutines/CancellableContinuation;)V", "", "cause", "", "invoke", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/AwaitAll;", "value", "getDisposer", "()Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "setDisposer", "(Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;)V", "disposer", "Lkotlinx/coroutines/DisposableHandle;", "handle", "Lkotlinx/coroutines/DisposableHandle;", "getHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setHandle", "(Lkotlinx/coroutines/DisposableHandle;)V", "kotlinx-coroutines-core", "Lkotlinx/coroutines/JobNode;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class a extends le5 {
        @NotNull
        private volatile /* synthetic */ Object _disposer = null;
        @NotNull
        private final gb5<List<? extends T>> w;
        public gd5 x;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull gb5<? super List<? extends T>> gb5Var) {
            this.w = gb5Var;
        }

        @Override // com.p7700g.p99005.wb5
        public void D0(@Nullable Throwable th) {
            if (th != null) {
                Object J = this.w.J(th);
                if (J != null) {
                    this.w.w0(J);
                    ua5<T>.b G0 = G0();
                    if (G0 == null) {
                        return;
                    }
                    G0.b();
                    return;
                }
                return;
            }
            if (ua5.a.decrementAndGet(ua5.this) == 0) {
                gb5<List<? extends T>> gb5Var = this.w;
                qp4.a aVar = qp4.s;
                tc5[] tc5VarArr = ((ua5) ua5.this).b;
                ArrayList arrayList = new ArrayList(tc5VarArr.length);
                int i = 0;
                int length = tc5VarArr.length;
                while (i < length) {
                    tc5 tc5Var = tc5VarArr[i];
                    i++;
                    arrayList.add(tc5Var.A());
                }
                gb5Var.u(qp4.b(arrayList));
            }
        }

        @Nullable
        public final ua5<T>.b G0() {
            return (b) this._disposer;
        }

        @NotNull
        public final gd5 H0() {
            gd5 gd5Var = this.x;
            if (gd5Var != null) {
                return gd5Var;
            }
            c25.S("handle");
            return null;
        }

        public final void I0(@Nullable ua5<T>.b bVar) {
            this._disposer = bVar;
        }

        public final void J0(@NotNull gd5 gd5Var) {
            this.x = gd5Var;
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
            D0(th);
            return yq4.a;
        }
    }

    /* compiled from: Await.kt */
    @vo4(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R \u0010\u0002\u001a\u0012\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "nodes", "", "Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/AwaitAll;", "(Lkotlinx/coroutines/AwaitAll;[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;)V", "[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "disposeAll", "", "invoke", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class b extends eb5 {
        @NotNull
        private final ua5<T>.a[] s;

        public b(@NotNull ua5<T>.a[] aVarArr) {
            this.s = aVarArr;
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
            a(th);
            return yq4.a;
        }

        @Override // com.p7700g.p99005.fb5
        public void a(@Nullable Throwable th) {
            b();
        }

        public final void b() {
            ua5<T>.a[] aVarArr = this.s;
            int length = aVarArr.length;
            int i = 0;
            while (i < length) {
                ua5<T>.a aVar = aVarArr[i];
                i++;
                aVar.H0().w();
            }
        }

        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("DisposeHandlersOnCancel[");
            G.append(this.s);
            G.append(f14.v);
            return G.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ua5(@NotNull tc5<? extends T>[] tc5VarArr) {
        this.b = tc5VarArr;
        this.notCompletedCount = tc5VarArr.length;
    }

    @Nullable
    public final Object b(@NotNull uv4<? super List<? extends T>> uv4Var) {
        hb5 hb5Var = new hb5(fw4.d(uv4Var), 1);
        hb5Var.T();
        int length = this.b.length;
        a[] aVarArr = new a[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            tc5 tc5Var = this.b[i2];
            tc5Var.start();
            a aVar = new a(hb5Var);
            aVar.J0(tc5Var.d3(aVar));
            yq4 yq4Var = yq4.a;
            aVarArr[i2] = aVar;
        }
        ua5<T>.b bVar = new b(aVarArr);
        while (i < length) {
            a aVar2 = aVarArr[i];
            i++;
            aVar2.I0(bVar);
        }
        if (hb5Var.m()) {
            bVar.b();
        } else {
            hb5Var.D(bVar);
        }
        Object x = hb5Var.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x;
    }
}