package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Share.kt */
@vo4(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BE\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R:\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "action", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSubscription", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ek5<T> implements qi5<T> {
    @NotNull
    private final qi5<T> s;
    @NotNull
    private final j05<qi5<? super T>, uv4<? super yq4>, Object> t;

    /* compiled from: Share.kt */
    @mw4(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {419, aa.c.u}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends kw4 {
        public Object v;
        public Object w;
        public /* synthetic */ Object x;
        public final /* synthetic */ ek5<T> y;
        public int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ek5<T> ek5Var, uv4<? super a> uv4Var) {
            super(uv4Var);
            this.y = ek5Var;
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.x = obj;
            this.z |= Integer.MIN_VALUE;
            return this.y.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ek5(@NotNull qi5<? super T> qi5Var, @NotNull j05<? super qi5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        this.s = qi5Var;
        this.t = j05Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.p7700g.p99005.cl5] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull uv4<? super yq4> uv4Var) {
        a aVar;
        ?? r2;
        cl5 cl5Var;
        ek5<T> ek5Var;
        try {
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i = aVar.z;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.z = i - Integer.MIN_VALUE;
                    Object obj = aVar.x;
                    Object h = gw4.h();
                    r2 = aVar.z;
                    if (r2 != 0) {
                        rp4.n(obj);
                        cl5Var = new cl5(this.s, aVar.getContext());
                        j05<qi5<? super T>, uv4<? super yq4>, Object> j05Var = this.t;
                        aVar.v = this;
                        aVar.w = cl5Var;
                        aVar.z = 1;
                        if (j05Var.w3(cl5Var, aVar) == h) {
                            return h;
                        }
                        ek5Var = this;
                    } else if (r2 != 1) {
                        if (r2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rp4.n(obj);
                        return yq4.a;
                    } else {
                        cl5Var = (cl5) aVar.w;
                        ek5Var = (ek5) aVar.v;
                        rp4.n(obj);
                    }
                    cl5Var.j3();
                    qi5<T> qi5Var = ek5Var.s;
                    r2 = qi5Var instanceof ek5;
                    if (r2 == 0) {
                        aVar.v = null;
                        aVar.w = null;
                        aVar.z = 2;
                        if (((ek5) qi5Var).a(aVar) == h) {
                            return h;
                        }
                        return yq4.a;
                    }
                    return yq4.a;
                }
            }
            if (r2 != 0) {
            }
            cl5Var.j3();
            qi5<T> qi5Var2 = ek5Var.s;
            r2 = qi5Var2 instanceof ek5;
            if (r2 == 0) {
            }
        } catch (Throwable th) {
            r2.j3();
            throw th;
        }
        aVar = new a(this, uv4Var);
        Object obj2 = aVar.x;
        Object h2 = gw4.h();
        r2 = aVar.z;
    }

    @Override // com.p7700g.p99005.qi5
    @Nullable
    public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
        return this.s.b(t, uv4Var);
    }
}