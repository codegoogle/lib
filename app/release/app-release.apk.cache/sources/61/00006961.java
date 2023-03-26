package com.p7700g.p99005;

import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharingStarted.kt */
@vo4(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0017J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Lkotlinx/coroutines/flow/SharingStarted;", "stopTimeout", "", "replayExpiration", "(JJ)V", "command", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "equals", "", "other", "", "hashCode", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class zj5 implements vj5 {
    private final long b;
    private final long c;

    /* compiled from: SharingStarted.kt */
    @mw4(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, yg1.D, yg1.F}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    @vo4(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", NewHtcHomeBadger.d, ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends vw4 implements k05<qi5<? super tj5>, Integer, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public /* synthetic */ int y;

        public a(uv4<? super a> uv4Var) {
            super(3, uv4Var);
        }

        @Nullable
        public final Object C3(@NotNull qi5<? super tj5> qi5Var, int i, @Nullable uv4<? super yq4> uv4Var) {
            a aVar = new a(uv4Var);
            aVar.x = qi5Var;
            aVar.y = i;
            return aVar.D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            qi5 qi5Var;
            long j;
            tj5 tj5Var;
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                qi5Var = (qi5) this.x;
                if (this.y <= 0) {
                    long j2 = zj5.this.b;
                    this.x = qi5Var;
                    this.w = 2;
                    if (wc5.b(j2, this) == h) {
                        return h;
                    }
                    if (zj5.this.c > 0) {
                    }
                    tj5Var = tj5.STOP_AND_RESET_REPLAY_CACHE;
                    this.x = null;
                    this.w = 5;
                    if (qi5Var.b(tj5Var, this) == h) {
                    }
                    return yq4.a;
                }
                tj5 tj5Var2 = tj5.START;
                this.w = 1;
                if (qi5Var.b(tj5Var2, this) == h) {
                    return h;
                }
                return yq4.a;
            }
            if (i != 1) {
                if (i == 2) {
                    qi5Var = (qi5) this.x;
                    rp4.n(obj);
                    if (zj5.this.c > 0) {
                        tj5 tj5Var3 = tj5.STOP;
                        this.x = qi5Var;
                        this.w = 3;
                        if (qi5Var.b(tj5Var3, this) == h) {
                            return h;
                        }
                        j = zj5.this.c;
                        this.x = qi5Var;
                        this.w = 4;
                        if (wc5.b(j, this) == h) {
                        }
                    }
                    tj5Var = tj5.STOP_AND_RESET_REPLAY_CACHE;
                    this.x = null;
                    this.w = 5;
                    if (qi5Var.b(tj5Var, this) == h) {
                    }
                    return yq4.a;
                } else if (i == 3) {
                    qi5Var = (qi5) this.x;
                    rp4.n(obj);
                    j = zj5.this.c;
                    this.x = qi5Var;
                    this.w = 4;
                    if (wc5.b(j, this) == h) {
                        return h;
                    }
                    tj5Var = tj5.STOP_AND_RESET_REPLAY_CACHE;
                    this.x = null;
                    this.w = 5;
                    if (qi5Var.b(tj5Var, this) == h) {
                    }
                    return yq4.a;
                } else if (i == 4) {
                    qi5Var = (qi5) this.x;
                    rp4.n(obj);
                    tj5Var = tj5.STOP_AND_RESET_REPLAY_CACHE;
                    this.x = null;
                    this.w = 5;
                    if (qi5Var.b(tj5Var, this) == h) {
                        return h;
                    }
                    return yq4.a;
                } else if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            rp4.n(obj);
            return yq4.a;
        }

        @Override // com.p7700g.p99005.k05
        public /* bridge */ /* synthetic */ Object I(qi5<? super tj5> qi5Var, Integer num, uv4<? super yq4> uv4Var) {
            return C3(qi5Var, num.intValue(), uv4Var);
        }
    }

    /* compiled from: SharingStarted.kt */
    @mw4(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends vw4 implements j05<tj5, uv4<? super Boolean>, Object> {
        public int w;
        public /* synthetic */ Object x;

        public b(uv4<? super b> uv4Var) {
            super(2, uv4Var);
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull tj5 tj5Var, @Nullable uv4<? super Boolean> uv4Var) {
            return ((b) X(tj5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            gw4.h();
            if (this.w == 0) {
                rp4.n(obj);
                return iw4.a(((tj5) this.x) != tj5.START);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            b bVar = new b(uv4Var);
            bVar.x = obj;
            return bVar;
        }
    }

    public zj5(long j, long j2) {
        this.b = j;
        this.c = j2;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
        }
        if (j2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
    }

    @Override // com.p7700g.p99005.vj5
    @NotNull
    public pi5<tj5> a(@NotNull ak5<Integer> ak5Var) {
        return ri5.g0(ri5.k0(ri5.b2(ak5Var, new a(null)), new b(null)));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof zj5) {
            zj5 zj5Var = (zj5) obj;
            if (this.b == zj5Var.b && this.c == zj5Var.c) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return jc5.a(this.c) + (jc5.a(this.b) * 31);
    }

    @NotNull
    public String toString() {
        List k = is4.k(2);
        if (this.b > 0) {
            StringBuilder G = wo1.G("stopTimeout=");
            G.append(this.b);
            G.append("ms");
            k.add(G.toString());
        }
        if (this.c < Long.MAX_VALUE) {
            StringBuilder G2 = wo1.G("replayExpiration=");
            G2.append(this.c);
            G2.append("ms");
            k.add(G2.toString());
        }
        return wo1.B(wo1.G("SharingStarted.WhileSubscribed("), rs4.h3(is4.b(k), null, null, null, 0, null, null, 63, null), ')');
    }
}