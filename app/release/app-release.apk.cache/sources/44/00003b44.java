package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.anythink.core.api.ATAdConst;
import com.p7700g.p99005.aa;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StateFlow.kt */
@vo4(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u0010062\b\u0012\u0004\u0012\u00028\u0000072\b\u0012\u0004\u0012\u00028\u0000082\b\u0012\u0004\u0012\u00028\u000009B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u00022\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010\u000fR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R*\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b4\u0010%\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expect", "update", "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/StateFlowSlot;", "createSlot", "()Lkotlinx/coroutines/flow/StateFlowSlot;", "", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "createSlotArray", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "fuse", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "resetReplayCache", "()V", "tryEmit", "(Ljava/lang/Object;)Z", "expectedState", "newState", "updateState", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "sequence", AFHydra.STATUS_IDLE, "getValue", "()Ljava/lang/Object;", "setValue", "getValue$annotations", "kotlinx-coroutines-core", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class bk5<T> extends ik5<dk5> implements lj5<T>, ji5<T>, yk5<T> {
    @NotNull
    private volatile /* synthetic */ Object _state;
    private int w;

    /* compiled from: StateFlow.kt */
    @mw4(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {386, 398, aa.c.d}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends kw4 {
        public /* synthetic */ Object A;
        public final /* synthetic */ bk5<T> B;
        public int C;
        public Object v;
        public Object w;
        public Object x;
        public Object y;
        public Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bk5<T> bk5Var, uv4<? super a> uv4Var) {
            super(uv4Var);
            this.B = bk5Var;
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return this.B.a(null, this);
        }
    }

    public bk5(@NotNull Object obj) {
        this._state = obj;
    }

    public static /* synthetic */ void r() {
    }

    private final boolean s(Object obj, Object obj2) {
        int i;
        dk5[] m;
        m();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !c25.g(obj3, obj)) {
                return false;
            }
            if (c25.g(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i2 = this.w;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.w = i3;
                dk5[] m2 = m();
                yq4 yq4Var = yq4.a;
                while (true) {
                    dk5[] dk5VarArr = m2;
                    if (dk5VarArr != null) {
                        int length = dk5VarArr.length;
                        int i4 = 0;
                        while (i4 < length) {
                            dk5 dk5Var = dk5VarArr[i4];
                            i4++;
                            if (dk5Var != null) {
                                dk5Var.f();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.w;
                        if (i == i3) {
                            this.w = i3 + 1;
                            return true;
                        }
                        m = m();
                        yq4 yq4Var2 = yq4.a;
                    }
                    m2 = m;
                    i3 = i;
                }
            } else {
                this.w = i2 + 2;
                return true;
            }
        }
    }

    @Override // com.p7700g.p99005.kj5
    public boolean A(T t) {
        setValue(t);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
        if (com.p7700g.p99005.c25.g(r11, r12) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.p7700g.p99005.kk5] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00d5 -> B:34:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e7 -> B:34:0x00a6). Please submit an issue!!! */
    @Override // com.p7700g.p99005.pj5, com.p7700g.p99005.pi5
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<?> uv4Var) {
        a aVar;
        Object h;
        int i;
        bk5<T> bk5Var;
        dk5 dk5Var;
        qi5 qi5Var2;
        ee5 ee5Var;
        Object obj;
        qi5<? super T> qi5Var3;
        dk5 dk5Var2;
        boolean g;
        Object obj2;
        try {
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.C;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.C = i2 - Integer.MIN_VALUE;
                    Object obj3 = aVar.A;
                    h = gw4.h();
                    i = aVar.C;
                    dk5 dk5Var3 = 1;
                    if (i != 0) {
                        rp4.n(obj3);
                        dk5 g2 = g();
                        try {
                            if (qi5Var instanceof ek5) {
                                aVar.v = this;
                                aVar.w = qi5Var;
                                aVar.x = g2;
                                aVar.C = 1;
                                if (((ek5) qi5Var).a(aVar) == h) {
                                    return h;
                                }
                            }
                            bk5Var = this;
                            dk5Var = g2;
                        } catch (Throwable th) {
                            th = th;
                            bk5Var = this;
                            dk5Var3 = g2;
                            bk5Var.k(dk5Var3);
                            throw th;
                        }
                    } else if (i == 1) {
                        dk5Var = (dk5) aVar.x;
                        qi5Var = (qi5) aVar.w;
                        bk5Var = (bk5) aVar.v;
                        rp4.n(obj3);
                    } else if (i == 2) {
                        obj = aVar.z;
                        ee5Var = (ee5) aVar.y;
                        dk5 dk5Var4 = (dk5) aVar.x;
                        qi5<? super T> qi5Var4 = (qi5) aVar.w;
                        bk5Var = (bk5) aVar.v;
                        rp4.n(obj3);
                        dk5Var2 = dk5Var4;
                        qi5Var3 = qi5Var4;
                        g = dk5Var2.g();
                        dk5Var3 = dk5Var2;
                        qi5Var2 = qi5Var3;
                        if (!g) {
                        }
                        Object obj4 = bk5Var._state;
                        if (ee5Var != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj4 == bl5.a) {
                        }
                        aVar.v = bk5Var;
                        aVar.w = qi5Var2;
                        aVar.x = dk5Var3;
                        aVar.y = ee5Var;
                        aVar.z = obj4;
                        aVar.C = 2;
                        if (qi5Var2.b(obj2, aVar) == h) {
                        }
                    } else if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        obj = aVar.z;
                        ee5Var = (ee5) aVar.y;
                        dk5 dk5Var5 = (dk5) aVar.x;
                        qi5 qi5Var5 = (qi5) aVar.w;
                        bk5Var = (bk5) aVar.v;
                        rp4.n(obj3);
                        dk5Var3 = dk5Var5;
                        qi5Var2 = qi5Var5;
                        Object obj42 = bk5Var._state;
                        if (ee5Var != null) {
                            ie5.A(ee5Var);
                        }
                        if (obj != null) {
                            dk5Var2 = dk5Var3;
                            qi5Var3 = qi5Var2;
                        }
                        obj2 = obj42 == bl5.a ? null : obj42;
                        aVar.v = bk5Var;
                        aVar.w = qi5Var2;
                        aVar.x = dk5Var3;
                        aVar.y = ee5Var;
                        aVar.z = obj42;
                        aVar.C = 2;
                        if (qi5Var2.b(obj2, aVar) == h) {
                            return h;
                        }
                        obj = obj42;
                        dk5Var2 = dk5Var3;
                        qi5Var3 = qi5Var2;
                        g = dk5Var2.g();
                        dk5Var3 = dk5Var2;
                        qi5Var2 = qi5Var3;
                        if (!g) {
                            aVar.v = bk5Var;
                            aVar.w = qi5Var3;
                            aVar.x = dk5Var2;
                            aVar.y = ee5Var;
                            aVar.z = obj;
                            aVar.C = 3;
                            Object d = dk5Var2.d(aVar);
                            dk5Var3 = dk5Var2;
                            qi5Var2 = qi5Var3;
                            if (d == h) {
                                return h;
                            }
                        }
                        Object obj422 = bk5Var._state;
                        if (ee5Var != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj422 == bl5.a) {
                        }
                        aVar.v = bk5Var;
                        aVar.w = qi5Var2;
                        aVar.x = dk5Var3;
                        aVar.y = ee5Var;
                        aVar.z = obj422;
                        aVar.C = 2;
                        if (qi5Var2.b(obj2, aVar) == h) {
                        }
                    }
                    qi5Var2 = qi5Var;
                    ee5Var = (ee5) aVar.getContext().get(ee5.m0);
                    obj = null;
                    dk5Var3 = dk5Var;
                    Object obj4222 = bk5Var._state;
                    if (ee5Var != null) {
                    }
                    if (obj != null) {
                    }
                    if (obj4222 == bl5.a) {
                    }
                    aVar.v = bk5Var;
                    aVar.w = qi5Var2;
                    aVar.x = dk5Var3;
                    aVar.y = ee5Var;
                    aVar.z = obj4222;
                    aVar.C = 2;
                    if (qi5Var2.b(obj2, aVar) == h) {
                    }
                }
            }
            if (i != 0) {
            }
            qi5Var2 = qi5Var;
            ee5Var = (ee5) aVar.getContext().get(ee5.m0);
            obj = null;
            dk5Var3 = dk5Var;
            Object obj42222 = bk5Var._state;
            if (ee5Var != null) {
            }
            if (obj != null) {
            }
            if (obj42222 == bl5.a) {
            }
            aVar.v = bk5Var;
            aVar.w = qi5Var2;
            aVar.x = dk5Var3;
            aVar.y = ee5Var;
            aVar.z = obj42222;
            aVar.C = 2;
            if (qi5Var2.b(obj2, aVar) == h) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        aVar = new a(this, uv4Var);
        Object obj32 = aVar.A;
        h = gw4.h();
        i = aVar.C;
        dk5 dk5Var32 = 1;
    }

    @Override // com.p7700g.p99005.kj5, com.p7700g.p99005.qi5
    @Nullable
    public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
        setValue(t);
        return yq4.a;
    }

    @Override // com.p7700g.p99005.pj5
    @NotNull
    public List<T> c() {
        return is4.l(getValue());
    }

    @Override // com.p7700g.p99005.yk5
    @NotNull
    public pi5<T> d(@NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var) {
        return ck5.d(this, xv4Var, i, ng5Var);
    }

    @Override // com.p7700g.p99005.lj5, com.p7700g.p99005.ak5
    public T getValue() {
        an5 an5Var = bl5.a;
        T t = (T) this._state;
        if (t == an5Var) {
            return null;
        }
        return t;
    }

    @Override // com.p7700g.p99005.ik5
    @NotNull
    /* renamed from: o */
    public dk5 h() {
        return new dk5();
    }

    @Override // com.p7700g.p99005.lj5
    public boolean p(T t, T t2) {
        if (t == null) {
            t = (T) bl5.a;
        }
        if (t2 == null) {
            t2 = (T) bl5.a;
        }
        return s(t, t2);
    }

    @Override // com.p7700g.p99005.ik5
    @NotNull
    /* renamed from: q */
    public dk5[] i(int i) {
        return new dk5[i];
    }

    @Override // com.p7700g.p99005.lj5
    public void setValue(T t) {
        if (t == null) {
            t = (T) bl5.a;
        }
        s(null, t);
    }

    @Override // com.p7700g.p99005.kj5
    public void y() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }
}