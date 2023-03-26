package com.p7700g.p99005;

import com.p7700g.p99005.b35;
import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContext.kt */
@vo4(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a8\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012H\u0080\b¢\u0006\u0002\u0010\u0013\u001a4\u0010\u0014\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012H\u0080\b¢\u0006\u0002\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\n*\u00020\u0003H\u0002\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0003H\u0007\u001a\u0013\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u00020\u001dH\u0080\u0010\u001a(\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006 "}, d2 = {"DEBUG_THREAD_NAME_SEPARATOR", "", "coroutineName", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "foldCopies", "originalContext", "appendContext", "isNewCoroutine", "", "withContinuationContext", "T", "continuation", "Lkotlin/coroutines/Continuation;", "countOrElement", "", "block", "Lkotlin/Function0;", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withCoroutineContext", "context", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hasCopyableElements", "newCoroutineContext", "addedContext", "Lkotlinx/coroutines/CoroutineScope;", "undispatchedCompletion", "Lkotlinx/coroutines/UndispatchedCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateUndispatchedCompletion", "oldValue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class dc5 {
    @NotNull
    private static final String a = " @";

    /* compiled from: CoroutineContext.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "result", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements j05<xv4, xv4.b, xv4> {
        public static final a t = new a();

        public a() {
            super(2);
        }

        @Override // com.p7700g.p99005.j05
        @NotNull
        /* renamed from: a */
        public final xv4 w3(@NotNull xv4 xv4Var, @NotNull xv4.b bVar) {
            if (bVar instanceof bc5) {
                return xv4Var.plus(((bc5) bVar).i3());
            }
            return xv4Var.plus(bVar);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "result", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements j05<xv4, xv4.b, xv4> {
        public final /* synthetic */ b35.h<xv4> t;
        public final /* synthetic */ boolean u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b35.h<xv4> hVar, boolean z) {
            super(2);
            this.t = hVar;
            this.u = z;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, com.p7700g.p99005.xv4] */
        @Override // com.p7700g.p99005.j05
        @NotNull
        /* renamed from: a */
        public final xv4 w3(@NotNull xv4 xv4Var, @NotNull xv4.b bVar) {
            if (bVar instanceof bc5) {
                xv4.b bVar2 = this.t.s.get(bVar.getKey());
                if (bVar2 == null) {
                    bc5 bc5Var = (bc5) bVar;
                    if (this.u) {
                        bc5Var = bc5Var.i3();
                    }
                    return xv4Var.plus(bc5Var);
                }
                b35.h<xv4> hVar = this.t;
                hVar.s = hVar.s.minusKey(bVar.getKey());
                return xv4Var.plus(((bc5) bVar).P(bVar2));
            }
            return xv4Var.plus(bVar);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "it", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(ZLkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends e25 implements j05<Boolean, xv4.b, Boolean> {
        public static final c t = new c();

        public c() {
            super(2);
        }

        @NotNull
        public final Boolean a(boolean z, @NotNull xv4.b bVar) {
            return Boolean.valueOf(z || (bVar instanceof bc5));
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ Boolean w3(Boolean bool, xv4.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final xv4 a(xv4 xv4Var, xv4 xv4Var2, boolean z) {
        boolean c2 = c(xv4Var);
        boolean c3 = c(xv4Var2);
        if (!c2 && !c3) {
            return xv4Var.plus(xv4Var2);
        }
        b35.h hVar = new b35.h();
        hVar.s = xv4Var2;
        zv4 zv4Var = zv4.s;
        xv4 xv4Var3 = (xv4) xv4Var.fold(zv4Var, new b(hVar, z));
        if (c3) {
            hVar.s = ((xv4) hVar.s).fold(zv4Var, a.t);
        }
        return xv4Var3.plus((xv4) hVar.s);
    }

    @Nullable
    public static final String b(@NotNull xv4 xv4Var) {
        return null;
    }

    private static final boolean c(xv4 xv4Var) {
        return ((Boolean) xv4Var.fold(Boolean.FALSE, c.t)).booleanValue();
    }

    @zd5
    @NotNull
    public static final xv4 d(@NotNull xv4 xv4Var, @NotNull xv4 xv4Var2) {
        return !c(xv4Var2) ? xv4Var.plus(xv4Var2) : a(xv4Var, xv4Var2, false);
    }

    @td5
    @NotNull
    public static final xv4 e(@NotNull lc5 lc5Var, @NotNull xv4 xv4Var) {
        xv4 a2 = a(lc5Var.y(), xv4Var, true);
        return (a2 == dd5.a() || a2.get(vv4.k0) != null) ? a2 : a2.plus(dd5.a());
    }

    @Nullable
    public static final sf5<?> f(@NotNull lw4 lw4Var) {
        while (!(lw4Var instanceof zc5) && (lw4Var = lw4Var.o()) != null) {
            if (lw4Var instanceof sf5) {
                return (sf5) lw4Var;
            }
        }
        return null;
    }

    @Nullable
    public static final sf5<?> g(@NotNull uv4<?> uv4Var, @NotNull xv4 xv4Var, @Nullable Object obj) {
        if (uv4Var instanceof lw4) {
            if (xv4Var.get(tf5.s) != null) {
                sf5<?> f = f((lw4) uv4Var);
                if (f != null) {
                    f.y1(xv4Var, obj);
                }
                return f;
            }
            return null;
        }
        return null;
    }

    public static final <T> T h(@NotNull uv4<?> uv4Var, @Nullable Object obj, @NotNull uz4<? extends T> uz4Var) {
        xv4 context = uv4Var.getContext();
        Object c2 = fn5.c(context, obj);
        sf5<?> g = c2 != fn5.a ? g(uv4Var, context, c2) : null;
        try {
            return uz4Var.x();
        } finally {
            z15.d(1);
            if (g == null || g.x1()) {
                fn5.a(context, c2);
            }
            z15.c(1);
        }
    }

    public static final <T> T i(@NotNull xv4 xv4Var, @Nullable Object obj, @NotNull uz4<? extends T> uz4Var) {
        Object c2 = fn5.c(xv4Var, obj);
        try {
            return uz4Var.x();
        } finally {
            z15.d(1);
            fn5.a(xv4Var, c2);
            z15.c(1);
        }
    }
}