package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.p7700g.p99005.xv4;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThreadContext.kt */
@vo4(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "updateState", "Lkotlinx/coroutines/internal/ThreadState;", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class fn5 {
    @cz4
    @NotNull
    public static final an5 a = new an5("NO_THREAD_ELEMENTS");
    @NotNull
    private static final j05<Object, xv4.b, Object> b = a.t;
    @NotNull
    private static final j05<jf5<?>, xv4.b, jf5<?>> c = b.t;
    @NotNull
    private static final j05<ln5, xv4.b, ln5> d = c.t;

    /* compiled from: ThreadContext.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "", "countOrElement", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements j05<Object, xv4.b, Object> {
        public static final a t = new a();

        public a() {
            super(2);
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: a */
        public final Object w3(@Nullable Object obj, @NotNull xv4.b bVar) {
            if (bVar instanceof jf5) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num == null ? 1 : num.intValue();
                return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* compiled from: ThreadContext.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/ThreadContextElement;", "found", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements j05<jf5<?>, xv4.b, jf5<?>> {
        public static final b t = new b();

        public b() {
            super(2);
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: a */
        public final jf5<?> w3(@Nullable jf5<?> jf5Var, @NotNull xv4.b bVar) {
            if (jf5Var != null) {
                return jf5Var;
            }
            if (bVar instanceof jf5) {
                return (jf5) bVar;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/internal/ThreadState;", CallMraidJS.b, "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends e25 implements j05<ln5, xv4.b, ln5> {
        public static final c t = new c();

        public c() {
            super(2);
        }

        @Override // com.p7700g.p99005.j05
        @NotNull
        /* renamed from: a */
        public final ln5 w3(@NotNull ln5 ln5Var, @NotNull xv4.b bVar) {
            if (bVar instanceof jf5) {
                jf5<?> jf5Var = (jf5) bVar;
                ln5Var.a(jf5Var, jf5Var.p3(ln5Var.a));
            }
            return ln5Var;
        }
    }

    public static final void a(@NotNull xv4 xv4Var, @Nullable Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof ln5) {
            ((ln5) obj).b(xv4Var);
            return;
        }
        Object fold = xv4Var.fold(null, c);
        Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((jf5) fold).j3(xv4Var, obj);
    }

    @NotNull
    public static final Object b(@NotNull xv4 xv4Var) {
        Object fold = xv4Var.fold(0, b);
        c25.m(fold);
        return fold;
    }

    @Nullable
    public static final Object c(@NotNull xv4 xv4Var, @Nullable Object obj) {
        if (obj == null) {
            obj = b(xv4Var);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return xv4Var.fold(new ln5(xv4Var, ((Number) obj).intValue()), d);
        }
        return ((jf5) obj).p3(xv4Var);
    }
}