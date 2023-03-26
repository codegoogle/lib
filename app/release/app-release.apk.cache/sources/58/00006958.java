package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Distinct.kt */
@vo4(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\n\u001aT\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\n26\u0010\f\u001a2\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00030\u0001\u001a6\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u000b0\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u00120\u0007\u001au\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\n2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u0002H\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072:\u0010\f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¢\u0006\u0002\b\u0014\",\u0010\u0000\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"&\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0005¨\u0006\u0015"}, d2 = {"defaultAreEquivalent", "Lkotlin/Function2;", "", "", "getDefaultAreEquivalent$annotations$FlowKt__DistinctKt", "()V", "defaultKeySelector", "Lkotlin/Function1;", "getDefaultKeySelector$annotations$FlowKt__DistinctKt", "distinctUntilChanged", "Lkotlinx/coroutines/flow/Flow;", "T", "areEquivalent", "Lkotlin/ParameterName;", "name", "old", "new", "distinctUntilChangedBy", "K", "keySelector", "distinctUntilChangedBy$FlowKt__DistinctKt", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class zi5 {
    @NotNull
    private static final f05<Object, Object> a = b.t;
    @NotNull
    private static final j05<Object, Object, Boolean> b = a.t;

    /* compiled from: Distinct.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "old", "", "new", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements j05<Object, Object, Boolean> {
        public static final a t = new a();

        public a() {
            super(2);
        }

        @Override // com.p7700g.p99005.j05
        @NotNull
        /* renamed from: a */
        public final Boolean w3(@Nullable Object obj, @Nullable Object obj2) {
            return Boolean.valueOf(c25.g(obj, obj2));
        }
    }

    /* compiled from: Distinct.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements f05<Object, Object> {
        public static final b t = new b();

        public b() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        @Nullable
        public final Object M(@Nullable Object obj) {
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> pi5<T> a(@NotNull pi5<? extends T> pi5Var) {
        return pi5Var instanceof ak5 ? pi5Var : d(pi5Var, a, b);
    }

    @NotNull
    public static final <T> pi5<T> b(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super T, Boolean> j05Var) {
        return d(pi5Var, a, (j05) k35.q(j05Var, 2));
    }

    @NotNull
    public static final <T, K> pi5<T> c(@NotNull pi5<? extends T> pi5Var, @NotNull f05<? super T, ? extends K> f05Var) {
        return d(pi5Var, f05Var, b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> pi5<T> d(pi5<? extends T> pi5Var, f05<? super T, ? extends Object> f05Var, j05<Object, Object, Boolean> j05Var) {
        if (pi5Var instanceof ni5) {
            ni5 ni5Var = (ni5) pi5Var;
            if (ni5Var.t == f05Var && ni5Var.u == j05Var) {
                return pi5Var;
            }
        }
        return new ni5(pi5Var, f05Var, j05Var);
    }

    private static /* synthetic */ void e() {
    }

    private static /* synthetic */ void f() {
    }
}