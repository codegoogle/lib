package com.p7700g.p99005;

import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.p7700g.p99005.b35;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharingStarted.kt */
@vo4(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/flow/StartedLazily;", "Lkotlinx/coroutines/flow/SharingStarted;", "()V", "command", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class yj5 implements vj5 {

    /* compiled from: SharingStarted.kt */
    @mw4(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends vw4 implements j05<qi5<? super tj5>, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ ak5<Integer> y;

        /* compiled from: SharingStarted.kt */
        @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", NewHtcHomeBadger.d, "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.yj5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0275a<T> implements qi5, uw4 {
            public final /* synthetic */ b35.a s;
            public final /* synthetic */ qi5<tj5> t;

            /* compiled from: SharingStarted.kt */
            @mw4(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {158}, m = "emit", n = {}, s = {})
            @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.p7700g.p99005.yj5$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0276a extends kw4 {
                public /* synthetic */ Object v;
                public final /* synthetic */ C0275a<T> w;
                public int x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0276a(C0275a<? super T> c0275a, uv4<? super C0276a> uv4Var) {
                    super(uv4Var);
                    this.w = c0275a;
                }

                @Override // com.p7700g.p99005.hw4
                @Nullable
                public final Object D1(@NotNull Object obj) {
                    this.v = obj;
                    this.x |= Integer.MIN_VALUE;
                    return this.w.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0275a(b35.a aVar, qi5<? super tj5> qi5Var) {
                this.s = aVar;
                this.t = qi5Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object a(int i, @NotNull uv4<? super yq4> uv4Var) {
                C0276a c0276a;
                int i2;
                if (uv4Var instanceof C0276a) {
                    c0276a = (C0276a) uv4Var;
                    int i3 = c0276a.x;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c0276a.x = i3 - Integer.MIN_VALUE;
                        Object obj = c0276a.v;
                        Object h = gw4.h();
                        i2 = c0276a.x;
                        if (i2 != 0) {
                            rp4.n(obj);
                            if (i > 0) {
                                b35.a aVar = this.s;
                                if (!aVar.s) {
                                    aVar.s = true;
                                    qi5<tj5> qi5Var = this.t;
                                    tj5 tj5Var = tj5.START;
                                    c0276a.x = 1;
                                    if (qi5Var.b(tj5Var, c0276a) == h) {
                                        return h;
                                    }
                                }
                            }
                            return yq4.a;
                        } else if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            rp4.n(obj);
                        }
                        return yq4.a;
                    }
                }
                c0276a = new C0276a(this, uv4Var);
                Object obj2 = c0276a.v;
                Object h2 = gw4.h();
                i2 = c0276a.x;
                if (i2 != 0) {
                }
                return yq4.a;
            }

            @Override // com.p7700g.p99005.qi5
            public /* bridge */ /* synthetic */ Object b(Object obj, uv4 uv4Var) {
                return a(((Number) obj).intValue(), uv4Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ak5<Integer> ak5Var, uv4<? super a> uv4Var) {
            super(2, uv4Var);
            this.y = ak5Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull qi5<? super tj5> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((a) X(qi5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                b35.a aVar = new b35.a();
                ak5<Integer> ak5Var = this.y;
                C0275a c0275a = new C0275a(aVar, (qi5) this.x);
                this.w = 1;
                if (ak5Var.a(c0275a, this) == h) {
                    return h;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
            throw new lo4();
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            a aVar = new a(this.y, uv4Var);
            aVar.x = obj;
            return aVar;
        }
    }

    @Override // com.p7700g.p99005.vj5
    @NotNull
    public pi5<tj5> a(@NotNull ak5<Integer> ak5Var) {
        return ri5.I0(new a(ak5Var, null));
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}