package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebugCoroutineInfoImpl.kt */
@vo4(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\b\u0010$\u001a\u00020\u000eH\u0016J!\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u000e2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(H\u0000¢\u0006\u0002\b)J%\u0010*\u001a\u00020&*\b\u0012\u0004\u0012\u00020\u00150+2\b\u0010'\u001a\u0004\u0018\u00010\fH\u0082Pø\u0001\u0000¢\u0006\u0002\u0010,R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "", "context", "Lkotlin/coroutines/CoroutineContext;", "creationStackBottom", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "sequenceNumber", "", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/debug/internal/StackTraceFrame;J)V", "_context", "Ljava/lang/ref/WeakReference;", "_lastObservedFrame", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "_state", "", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCreationStackBottom", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "creationStackTrace", "", "Ljava/lang/StackTraceElement;", "getCreationStackTrace", "()Ljava/util/List;", "value", "lastObservedFrame", "getLastObservedFrame$kotlinx_coroutines_core", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "setLastObservedFrame$kotlinx_coroutines_core", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "lastObservedThread", "Ljava/lang/Thread;", CallMraidJS.b, "getState", "()Ljava/lang/String;", "lastObservedStackTrace", "toString", "updateState", "", "frame", "Lkotlin/coroutines/Continuation;", "updateState$kotlinx_coroutines_core", "yieldFrames", "Lkotlin/sequences/SequenceScope;", "(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class yh5 {
    @Nullable
    private final gi5 a;
    @cz4
    public final long b;
    @NotNull
    private final WeakReference<xv4> c;
    @NotNull
    private String d = zh5.a;
    @cz4
    @Nullable
    public Thread e;
    @Nullable
    private WeakReference<lw4> f;

    /* compiled from: DebugCoroutineInfoImpl.kt */
    @mw4(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/lang/StackTraceElement;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends rw4 implements j05<i75<? super StackTraceElement>, uv4<? super yq4>, Object> {
        public int u;
        private /* synthetic */ Object v;
        public final /* synthetic */ gi5 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gi5 gi5Var, uv4<? super a> uv4Var) {
            super(2, uv4Var);
            this.x = gi5Var;
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.u;
            if (i == 0) {
                rp4.n(obj);
                yh5 yh5Var = yh5.this;
                lw4 o = this.x.o();
                this.u = 1;
                if (yh5Var.k((i75) this.v, o, this) == h) {
                    return h;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            a aVar = new a(this.x, uv4Var);
            aVar.v = obj;
            return aVar;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: t3 */
        public final Object w3(@NotNull i75<? super StackTraceElement> i75Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((a) X(i75Var, uv4Var)).D1(yq4.a);
        }
    }

    /* compiled from: DebugCoroutineInfoImpl.kt */
    @mw4(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {80}, m = "yieldFrames", n = {}, s = {})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends kw4 {
        public int A;
        public Object v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;

        public b(uv4<? super b> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.y = obj;
            this.A |= Integer.MIN_VALUE;
            return yh5.this.k(null, null, this);
        }
    }

    public yh5(@Nullable xv4 xv4Var, @Nullable gi5 gi5Var, long j) {
        this.a = gi5Var;
        this.b = j;
        this.c = new WeakReference<>(xv4Var);
    }

    private final List<StackTraceElement> b() {
        gi5 gi5Var = this.a;
        return gi5Var == null ? js4.F() : o75.c3(k75.b(new a(gi5Var, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004a -> B:26:0x0062). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005c -> B:25:0x005f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(i75<? super StackTraceElement> i75Var, lw4 lw4Var, uv4<? super yq4> uv4Var) {
        b bVar;
        int i;
        yh5 yh5Var;
        if (uv4Var instanceof b) {
            bVar = (b) uv4Var;
            int i2 = bVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.A = i2 - Integer.MIN_VALUE;
                Object obj = bVar.y;
                Object h = gw4.h();
                i = bVar.A;
                if (i != 0) {
                    rp4.n(obj);
                    yh5Var = this;
                    if (lw4Var == null) {
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    lw4 lw4Var2 = (lw4) bVar.x;
                    i75<? super StackTraceElement> i75Var2 = (i75) bVar.w;
                    yh5Var = (yh5) bVar.v;
                    rp4.n(obj);
                    i75<? super StackTraceElement> i75Var3 = i75Var2;
                    lw4Var = lw4Var2;
                    i75Var = i75Var3;
                    lw4Var = lw4Var.o();
                    if (lw4Var == null) {
                        return yq4.a;
                    }
                    if (lw4Var == null) {
                        StackTraceElement H = lw4Var.H();
                        if (H != null) {
                            bVar.v = yh5Var;
                            bVar.w = i75Var;
                            bVar.x = lw4Var;
                            bVar.A = 1;
                            if (i75Var.b(H, bVar) == h) {
                                return h;
                            }
                            lw4 lw4Var3 = lw4Var;
                            i75Var2 = i75Var;
                            lw4Var2 = lw4Var3;
                            i75<? super StackTraceElement> i75Var32 = i75Var2;
                            lw4Var = lw4Var2;
                            i75Var = i75Var32;
                        }
                        lw4Var = lw4Var.o();
                        if (lw4Var == null) {
                        }
                        if (lw4Var == null) {
                            return yq4.a;
                        }
                    }
                }
            }
        }
        bVar = new b(uv4Var);
        Object obj2 = bVar.y;
        Object h2 = gw4.h();
        i = bVar.A;
        if (i != 0) {
        }
    }

    @Nullable
    public final xv4 c() {
        return this.c.get();
    }

    @Nullable
    public final gi5 d() {
        return this.a;
    }

    @NotNull
    public final List<StackTraceElement> e() {
        return b();
    }

    @Nullable
    public final lw4 f() {
        WeakReference<lw4> weakReference = this.f;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @NotNull
    public final String g() {
        return this.d;
    }

    @NotNull
    public final List<StackTraceElement> h() {
        lw4 f = f();
        if (f == null) {
            return js4.F();
        }
        ArrayList arrayList = new ArrayList();
        while (f != null) {
            StackTraceElement H = f.H();
            if (H != null) {
                arrayList.add(H);
            }
            f = f.o();
        }
        return arrayList;
    }

    public final void i(@Nullable lw4 lw4Var) {
        this.f = lw4Var == null ? null : new WeakReference<>(lw4Var);
    }

    public final void j(@NotNull String str, @NotNull uv4<?> uv4Var) {
        if (c25.g(this.d, str) && c25.g(str, zh5.c) && f() != null) {
            return;
        }
        this.d = str;
        i(uv4Var instanceof lw4 ? (lw4) uv4Var : null);
        this.e = c25.g(str, zh5.b) ? Thread.currentThread() : null;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("DebugCoroutineInfo(state=");
        G.append(g());
        G.append(",context=");
        G.append(c());
        G.append(')');
        return G.toString();
    }
}