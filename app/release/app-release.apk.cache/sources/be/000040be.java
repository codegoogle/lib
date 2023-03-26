package com.p7700g.p99005;

import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeCollector.common.kt */
@vo4(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022/\b\u0005\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\u000b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0080\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"unsafeFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "checkContext", "Lkotlinx/coroutines/flow/internal/SafeCollector;", "currentContext", "Lkotlin/coroutines/CoroutineContext;", "transitiveCoroutineParent", "Lkotlinx/coroutines/Job;", "collectJob", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class el5 {

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", NewHtcHomeBadger.d, "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(ILkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements j05<Integer, xv4.b, Integer> {
        public final /* synthetic */ cl5<?> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cl5<?> cl5Var) {
            super(2);
            this.t = cl5Var;
        }

        @NotNull
        public final Integer a(int i, @NotNull xv4.b bVar) {
            xv4.c<?> key = bVar.getKey();
            xv4.b bVar2 = this.t.w.get(key);
            if (key != ee5.m0) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i + 1);
            }
            ee5 ee5Var = (ee5) bVar2;
            ee5 b = el5.b((ee5) bVar, ee5Var);
            if (b == ee5Var) {
                if (ee5Var != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + ee5Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ Integer w3(Integer num, xv4.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class b implements pi5<T> {
        public final /* synthetic */ j05<qi5<? super T>, uv4<? super yq4>, Object> s;

        /* compiled from: SafeCollector.common.kt */
        @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int x;

            public a(uv4<? super a> uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.x |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(j05<? super qi5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
            this.s = j05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            Object w3 = this.s.w3(qi5Var, uv4Var);
            return w3 == gw4.h() ? w3 : yq4.a;
        }

        @Nullable
        public Object e(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            z15.e(4);
            new a(uv4Var);
            z15.e(5);
            this.s.w3(qi5Var, uv4Var);
            return yq4.a;
        }
    }

    @fz4(name = "checkContext")
    public static final void a(@NotNull cl5<?> cl5Var, @NotNull xv4 xv4Var) {
        if (((Number) xv4Var.fold(0, new a(cl5Var))).intValue() == cl5Var.x) {
            return;
        }
        StringBuilder G = wo1.G("Flow invariant is violated:\n\t\tFlow was collected in ");
        G.append(cl5Var.w);
        G.append(",\n\t\tbut emission happened in ");
        G.append(xv4Var);
        G.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
        throw new IllegalStateException(G.toString().toString());
    }

    @Nullable
    public static final ee5 b(@Nullable ee5 ee5Var, @Nullable ee5 ee5Var2) {
        while (ee5Var != null) {
            if (ee5Var == ee5Var2 || !(ee5Var instanceof wm5)) {
                return ee5Var;
            }
            ee5Var = ((wm5) ee5Var).w1();
        }
        return null;
    }

    @np4
    @NotNull
    public static final <T> pi5<T> c(@on4 @NotNull j05<? super qi5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        return new b(j05Var);
    }
}