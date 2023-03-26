package com.p7700g.p99005;

import com.p7700g.p99005.fc5;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.vc5;
import com.p7700g.p99005.xv4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TestCoroutineContext.kt */
@vo4(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001<B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0019J$\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 J$\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 J*\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020!0 J$\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 J\u0006\u0010%\u001a\u00020\u001bJ\u0014\u0010&\u001a\u00020\u001b2\n\u0010'\u001a\u00060(j\u0002`)H\u0002J5\u0010*\u001a\u0002H+\"\u0004\b\u0000\u0010+2\u0006\u0010,\u001a\u0002H+2\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002H+0.H\u0016¢\u0006\u0002\u00100J(\u00101\u001a\u0004\u0018\u0001H2\"\b\b\u0000\u00102*\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u0002H204H\u0096\u0002¢\u0006\u0002\u00105J\u0014\u00106\u001a\u00020\u00012\n\u00103\u001a\u0006\u0012\u0002\b\u000304H\u0016J\u0010\u00107\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u001c\u00108\u001a\u00020\u00122\n\u0010'\u001a\u00060(j\u0002`)2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u00109\u001a\u00020\u0006H\u0002J\b\u0010:\u001a\u00020\u0003H\u0016J\u0006\u0010;\u001a\u00020\u001bJ\u0010\u0010;\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "name", "", "(Ljava/lang/String;)V", "counter", "", "ctxDispatcher", "Lkotlinx/coroutines/test/TestCoroutineContext$Dispatcher;", "ctxHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptions", "", "", "getExceptions", "()Ljava/util/List;", "queue", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/test/TimedRunnableObsolete;", "time", "uncaughtExceptions", "", "advanceTimeBy", "delayTime", "unit", "Ljava/util/concurrent/TimeUnit;", "advanceTimeTo", "", "targetTime", "assertAllUnhandledExceptions", qm3.b.j, "predicate", "Lkotlin/Function1;", "", "assertAnyUnhandledException", "assertExceptions", "assertUnhandledException", "cancelAllActions", "enqueue", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "now", "postDelayed", "processNextEvent", "toString", "triggerActions", "Dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@xn4(level = zn4.ERROR, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @op4(expression = "TestCoroutineScope", imports = {"kotlin.coroutines.test"}))
/* loaded from: classes3.dex */
public final class cp5 implements xv4 {
    @Nullable
    private final String s;
    @NotNull
    private final List<Throwable> t;
    @NotNull
    private final a u;
    @NotNull
    private final fc5 v;
    @NotNull
    private final jn5<ep5> w;
    private long x;
    private long y;

    /* compiled from: TestCoroutineContext.kt */
    @vo4(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineContext$Dispatcher;", "Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/Delay;", "(Lkotlinx/coroutines/test/TestCoroutineContext;)V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "processNextEvent", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "shouldBeProcessedFromContext", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class a extends kd5 implements vc5 {

        /* compiled from: TestCoroutineContext.kt */
        @vo4(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"kotlinx/coroutines/test/TestCoroutineContext$Dispatcher$invokeOnTimeout$1", "Lkotlinx/coroutines/DisposableHandle;", "dispose", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.cp5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0155a implements gd5 {
            public final /* synthetic */ cp5 s;
            public final /* synthetic */ ep5 t;

            public C0155a(cp5 cp5Var, ep5 ep5Var) {
                this.s = cp5Var;
                this.t = ep5Var;
            }

            @Override // com.p7700g.p99005.gd5
            public void w() {
                this.s.w.j(this.t);
            }
        }

        /* compiled from: Runnable.kt */
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "kotlinx/coroutines/RunnableKt$Runnable$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b implements Runnable {
            public final /* synthetic */ gb5 s;
            public final /* synthetic */ a t;

            public b(gb5 gb5Var, a aVar) {
                this.s = gb5Var;
                this.t = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.s.S(this.t, yq4.a);
            }
        }

        public a() {
            kd5.Y1(this, false, 1, null);
        }

        @Override // com.p7700g.p99005.kd5
        public long c2() {
            return cp5.this.G();
        }

        @Override // com.p7700g.p99005.kd5
        public boolean e2() {
            return true;
        }

        @Override // com.p7700g.p99005.vc5
        public void j(long j, @NotNull gb5<? super yq4> gb5Var) {
            cp5.this.F(new b(gb5Var, this), j);
        }

        @Override // com.p7700g.p99005.vc5
        @NotNull
        public gd5 q(long j, @NotNull Runnable runnable, @NotNull xv4 xv4Var) {
            return new C0155a(cp5.this, cp5.this.F(runnable, j));
        }

        @Override // com.p7700g.p99005.vc5
        @xn4(level = zn4.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @Nullable
        public Object r(long j, @NotNull uv4<? super yq4> uv4Var) {
            return vc5.a.a(this, j, uv4Var);
        }

        @Override // com.p7700g.p99005.ec5
        public void s(@NotNull xv4 xv4Var, @NotNull Runnable runnable) {
            cp5.this.z(runnable);
        }

        @Override // com.p7700g.p99005.ec5
        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("Dispatcher(");
            G.append(cp5.this);
            G.append(')');
            return G.toString();
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @vo4(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends rv4 implements fc5 {
        public final /* synthetic */ cp5 s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fc5.b bVar, cp5 cp5Var) {
            super(bVar);
            this.s = cp5Var;
        }

        @Override // com.p7700g.p99005.fc5
        public void handleException(@NotNull xv4 xv4Var, @NotNull Throwable th) {
            this.s.t.add(th);
        }
    }

    public cp5() {
        this(null, 1, null);
    }

    public cp5(@Nullable String str) {
        this.s = str;
        this.t = new ArrayList();
        this.u = new a();
        this.v = new b(fc5.l0, this);
        this.w = new jn5<>();
    }

    public static /* synthetic */ long D(cp5 cp5Var, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return cp5Var.C(timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ep5 F(Runnable runnable, long j) {
        long j2 = this.x;
        this.x = 1 + j2;
        ep5 ep5Var = new ep5(runnable, j2, TimeUnit.MILLISECONDS.toNanos(j) + this.y);
        this.w.b(ep5Var);
        return ep5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long G() {
        ep5 h = this.w.h();
        if (h != null) {
            I(h.u);
        }
        return this.w.g() ? Long.MAX_VALUE : 0L;
    }

    private final void I(long j) {
        ep5 ep5Var;
        while (true) {
            jn5<ep5> jn5Var = this.w;
            synchronized (jn5Var) {
                ep5 e = jn5Var.e();
                if (e != null) {
                    ep5Var = (e.u > j ? 1 : (e.u == j ? 0 : -1)) <= 0 ? jn5Var.k(0) : null;
                }
            }
            ep5 ep5Var2 = ep5Var;
            if (ep5Var2 == null) {
                return;
            }
            long j2 = ep5Var2.u;
            if (j2 != 0) {
                this.y = j2;
            }
            ep5Var2.run();
        }
    }

    public static /* synthetic */ long n(cp5 cp5Var, long j, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return cp5Var.l(j, timeUnit);
    }

    public static /* synthetic */ void p(cp5 cp5Var, long j, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        cp5Var.o(j, timeUnit);
    }

    public static /* synthetic */ void r(cp5 cp5Var, String str, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        cp5Var.q(str, f05Var);
    }

    public static /* synthetic */ void t(cp5 cp5Var, String str, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        cp5Var.s(str, f05Var);
    }

    public static /* synthetic */ void v(cp5 cp5Var, String str, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        cp5Var.u(str, f05Var);
    }

    public static /* synthetic */ void x(cp5 cp5Var, String str, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        cp5Var.w(str, f05Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(Runnable runnable) {
        jn5<ep5> jn5Var = this.w;
        long j = this.x;
        this.x = 1 + j;
        jn5Var.b(new ep5(runnable, j, 0L, 4, null));
    }

    @NotNull
    public final List<Throwable> B() {
        return this.t;
    }

    public final long C(@NotNull TimeUnit timeUnit) {
        return timeUnit.convert(this.y, TimeUnit.NANOSECONDS);
    }

    public final void H() {
        I(this.y);
    }

    @Override // com.p7700g.p99005.xv4
    public <R> R fold(R r, @NotNull j05<? super R, ? super xv4.b, ? extends R> j05Var) {
        return j05Var.w3((R) j05Var.w3(r, this.u), this.v);
    }

    @Override // com.p7700g.p99005.xv4
    @Nullable
    public <E extends xv4.b> E get(@NotNull xv4.c<E> cVar) {
        if (cVar == vv4.k0) {
            return this.u;
        }
        if (cVar == fc5.l0) {
            return this.v;
        }
        return null;
    }

    public final long l(long j, @NotNull TimeUnit timeUnit) {
        long j2 = this.y;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        o(timeUnit.toNanos(j) + j2, timeUnit2);
        return timeUnit.convert(this.y - j2, timeUnit2);
    }

    @Override // com.p7700g.p99005.xv4
    @NotNull
    public xv4 minusKey(@NotNull xv4.c<?> cVar) {
        return cVar == vv4.k0 ? this.v : cVar == fc5.l0 ? this.u : this;
    }

    public final void o(long j, @NotNull TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        I(nanos);
        if (nanos > this.y) {
            this.y = nanos;
        }
    }

    @Override // com.p7700g.p99005.xv4
    @NotNull
    public xv4 plus(@NotNull xv4 xv4Var) {
        return xv4.a.a(this, xv4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(@NotNull String str, @NotNull f05<? super Throwable, Boolean> f05Var) {
        List<Throwable> list = this.t;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!f05Var.M(it.next()).booleanValue()) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            this.t.clear();
            return;
        }
        throw new AssertionError(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(@NotNull String str, @NotNull f05<? super Throwable, Boolean> f05Var) {
        List<Throwable> list = this.t;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (f05Var.M(it.next()).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.t.clear();
            return;
        }
        throw new AssertionError(str);
    }

    @NotNull
    public String toString() {
        String str = this.s;
        return str == null ? c25.C("TestCoroutineContext@", qc5.b(this)) : str;
    }

    public final void u(@NotNull String str, @NotNull f05<? super List<? extends Throwable>, Boolean> f05Var) {
        if (f05Var.M(this.t).booleanValue()) {
            this.t.clear();
            return;
        }
        throw new AssertionError(str);
    }

    public final void w(@NotNull String str, @NotNull f05<? super Throwable, Boolean> f05Var) {
        if (this.t.size() == 1 && f05Var.M(this.t.get(0)).booleanValue()) {
            this.t.clear();
            return;
        }
        throw new AssertionError(str);
    }

    public final void y() {
        if (this.w.g()) {
            return;
        }
        this.w.d();
    }

    public /* synthetic */ cp5(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}