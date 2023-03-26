package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import com.p7700g.p99005.qp4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharedFlow.kt */
@vo4(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001hB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020,H\u0002J\u001f\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0096@ø\u0001\u0000¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u0012H\u0002J\b\u0010:\u001a\u00020\u0003H\u0014J\u001d\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0006\u0010<\u001a\u00020\bH\u0014¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020,H\u0002J\u0019\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0019\u0010B\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0012\u0010C\u001a\u00020,2\b\u0010D\u001a\u0004\u0018\u00010\u000fH\u0002J1\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0014\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000eH\u0002¢\u0006\u0002\u0010HJ&\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010O\u001a\u00020\u0012H\u0002J7\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0010\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0002¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020,H\u0016J\u0015\u0010V\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Z\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0010\u0010[\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0012\u0010\\\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\u0003H\u0002J(\u0010]\u001a\u00020,2\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\u0012H\u0002J%\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0006\u0010c\u001a\u00020\u0012H\u0000¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\u0012H\u0000¢\u0006\u0002\bgR\u001a\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006i"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "replay", "", "bufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "buffer", "", "", "[Ljava/lang/Object;", "bufferEndIndex", "", "getBufferEndIndex", "()J", "bufferSize", "head", "getHead", "lastReplayedLocked", "getLastReplayedLocked$annotations", "()V", "getLastReplayedLocked", "()Ljava/lang/Object;", "minCollectorIndex", "queueEndIndex", "getQueueEndIndex", "queueSize", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "replayIndex", "replaySize", "getReplaySize", "()I", "totalSize", "getTotalSize", "awaitValue", "", "slot", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelEmitter", "emitter", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "cleanupTailLocked", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "correctCollectorIndexesOnDropOldest", "newHead", "createSlot", "createSlotArray", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "dropOldestLocked", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSuspend", "enqueueLocked", "item", "findSlotsToResumeLocked", "Lkotlin/coroutines/Continuation;", "resumesIn", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getPeekedValueLockedAt", la1.l, "growBuffer", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "resetReplayCache", "tryEmit", "", "(Ljava/lang/Object;)Z", "tryEmitLocked", "tryEmitNoCollectorsLocked", "tryPeekLocked", "tryTakeValue", "updateBufferLocked", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateNewCollectorIndexLocked", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class qj5<T> extends ik5<sj5> implements kj5<T>, ji5<T>, yk5<T> {
    private long A;
    private long B;
    private int C;
    private int D;
    private final int w;
    private final int x;
    @NotNull
    private final ng5 y;
    @Nullable
    private Object[] z;

    /* compiled from: SharedFlow.kt */
    @vo4(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", la1.l, "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements gd5 {
        @cz4
        @NotNull
        public final qj5<?> s;
        @cz4
        public long t;
        @cz4
        @Nullable
        public final Object u;
        @cz4
        @NotNull
        public final uv4<yq4> v;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull qj5<?> qj5Var, long j, @Nullable Object obj, @NotNull uv4<? super yq4> uv4Var) {
            this.s = qj5Var;
            this.t = j;
            this.u = obj;
            this.v = uv4Var;
        }

        @Override // com.p7700g.p99005.gd5
        public void w() {
            this.s.F(this);
        }
    }

    /* compiled from: SharedFlow.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            ng5.values();
            int[] iArr = new int[3];
            iArr[ng5.SUSPEND.ordinal()] = 1;
            iArr[ng5.DROP_LATEST.ordinal()] = 2;
            iArr[ng5.DROP_OLDEST.ordinal()] = 3;
            a = iArr;
        }
    }

    /* compiled from: SharedFlow.kt */
    @mw4(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {373, 380, 383}, m = "collect$suspendImpl", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends kw4 {
        public final /* synthetic */ qj5<T> A;
        public int B;
        public Object v;
        public Object w;
        public Object x;
        public Object y;
        public /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qj5<T> qj5Var, uv4<? super c> uv4Var) {
            super(uv4Var);
            this.A = qj5Var;
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.z = obj;
            this.B |= Integer.MIN_VALUE;
            return qj5.H(this.A, null, this);
        }
    }

    public qj5(int i, int i2, @NotNull ng5 ng5Var) {
        this.w = i;
        this.x = i2;
        this.y = ng5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(sj5 sj5Var, uv4<? super yq4> uv4Var) {
        yq4 yq4Var;
        hb5 hb5Var = new hb5(fw4.d(uv4Var), 1);
        hb5Var.T();
        synchronized (this) {
            if (b0(sj5Var) < 0) {
                sj5Var.b = hb5Var;
                sj5Var.b = hb5Var;
            } else {
                qp4.a aVar = qp4.s;
                hb5Var.u(qp4.b(yq4.a));
            }
            yq4Var = yq4.a;
        }
        Object x = hb5Var.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x == gw4.h() ? x : yq4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(a aVar) {
        synchronized (this) {
            if (aVar.t < R()) {
                return;
            }
            Object[] objArr = this.z;
            c25.m(objArr);
            if (rj5.c(objArr, aVar.t) != aVar) {
                return;
            }
            rj5.d(objArr, aVar.t, rj5.a);
            G();
            yq4 yq4Var = yq4.a;
        }
    }

    private final void G() {
        if (this.x != 0 || this.D > 1) {
            Object[] objArr = this.z;
            c25.m(objArr);
            while (this.D > 0 && rj5.c(objArr, (R() + X()) - 1) == rj5.a) {
                this.D--;
                rj5.d(objArr, R() + X(), null);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:42|43))(1:44)|12|13|14|15|(3:16|(4:26|(1:28)(1:34)|29|(2:31|32)(1:33))(3:18|19|(2:21|22)(1:24))|25))(4:45|46|47|48)|38|39)(5:54|55|56|(2:58|(1:60))|62)|49|50|15|(3:16|(0)(0)|25)))|65|6|(0)(0)|49|50|15|(3:16|(0)(0)|25)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object H(qj5 qj5Var, qi5 qi5Var, uv4 uv4Var) {
        c cVar;
        int i;
        qj5 qj5Var2;
        Throwable th;
        sj5 sj5Var;
        qi5 qi5Var2;
        ee5 ee5Var;
        Object c0;
        ee5 ee5Var2;
        qi5 qi5Var3;
        if (uv4Var instanceof c) {
            cVar = (c) uv4Var;
            int i2 = cVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.B = i2 - Integer.MIN_VALUE;
                Object obj = cVar.z;
                Object h = gw4.h();
                i = cVar.B;
                if (i != 0) {
                    rp4.n(obj);
                    sj5 sj5Var2 = (sj5) qj5Var.g();
                    try {
                        if (qi5Var instanceof ek5) {
                            cVar.v = qj5Var;
                            cVar.w = qi5Var;
                            cVar.x = sj5Var2;
                            cVar.B = 1;
                            if (((ek5) qi5Var).a(cVar) == h) {
                                return h;
                            }
                        }
                        qi5Var2 = qi5Var;
                        sj5Var = sj5Var2;
                    } catch (Throwable th2) {
                        qj5Var2 = qj5Var;
                        th = th2;
                        sj5Var = sj5Var2;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ee5Var2 = (ee5) cVar.y;
                            sj5Var = (sj5) cVar.x;
                            qi5Var3 = (qi5) cVar.w;
                            qj5Var2 = (qj5) cVar.v;
                        } else if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            ee5Var2 = (ee5) cVar.y;
                            sj5Var = (sj5) cVar.x;
                            qi5Var3 = (qi5) cVar.w;
                            qj5Var2 = (qj5) cVar.v;
                        }
                        try {
                            rp4.n(obj);
                            qi5Var2 = qi5Var3;
                            ee5Var = ee5Var2;
                            qj5Var = qj5Var2;
                            while (true) {
                                c0 = qj5Var.c0(sj5Var);
                                if (c0 != rj5.a) {
                                    if (ee5Var != null) {
                                        ie5.A(ee5Var);
                                    }
                                    cVar.v = qj5Var;
                                    cVar.w = qi5Var2;
                                    cVar.x = sj5Var;
                                    cVar.y = ee5Var;
                                    cVar.B = 3;
                                    if (qi5Var2.b(c0, cVar) == h) {
                                        return h;
                                    }
                                } else {
                                    cVar.v = qj5Var;
                                    cVar.w = qi5Var2;
                                    cVar.x = sj5Var;
                                    cVar.y = ee5Var;
                                    cVar.B = 2;
                                    if (qj5Var.D(sj5Var, cVar) == h) {
                                        return h;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        sj5Var = (sj5) cVar.x;
                        qi5 qi5Var4 = (qi5) cVar.w;
                        qj5 qj5Var3 = (qj5) cVar.v;
                        try {
                            rp4.n(obj);
                            qi5Var2 = qi5Var4;
                            qj5Var = qj5Var3;
                        } catch (Throwable th4) {
                            th = th4;
                            qj5Var2 = qj5Var3;
                        }
                    }
                    qj5Var2.k(sj5Var);
                    throw th;
                }
                ee5Var = (ee5) cVar.getContext().get(ee5.m0);
                while (true) {
                    c0 = qj5Var.c0(sj5Var);
                    if (c0 != rj5.a) {
                    }
                }
            }
        }
        cVar = new c(qj5Var, uv4Var);
        Object obj2 = cVar.z;
        Object h2 = gw4.h();
        i = cVar.B;
        if (i != 0) {
        }
        ee5Var = (ee5) cVar.getContext().get(ee5.m0);
        while (true) {
            c0 = qj5Var.c0(sj5Var);
            if (c0 != rj5.a) {
            }
        }
    }

    private final void I(long j) {
        kk5[] f;
        if (ik5.e(this) != 0 && (f = ik5.f(this)) != null) {
            int i = 0;
            int length = f.length;
            while (i < length) {
                kk5 kk5Var = f[i];
                i++;
                if (kk5Var != null) {
                    sj5 sj5Var = (sj5) kk5Var;
                    long j2 = sj5Var.a;
                    if (j2 >= 0 && j2 < j) {
                        sj5Var.a = j;
                    }
                }
            }
        }
        this.B = j;
    }

    private final void L() {
        Object[] objArr = this.z;
        c25.m(objArr);
        rj5.d(objArr, R(), null);
        this.C--;
        long R = R() + 1;
        if (this.A < R) {
            this.A = R;
        }
        if (this.B < R) {
            I(R);
        }
    }

    public static /* synthetic */ Object M(qj5 qj5Var, Object obj, uv4 uv4Var) {
        Object N;
        return (!qj5Var.A(obj) && (N = qj5Var.N(obj, uv4Var)) == gw4.h()) ? N : yq4.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N(T t, uv4<? super yq4> uv4Var) {
        uv4<yq4>[] uv4VarArr;
        a aVar;
        hb5 hb5Var = new hb5(fw4.d(uv4Var), 1);
        hb5Var.T();
        uv4<yq4>[] uv4VarArr2 = jk5.a;
        synchronized (this) {
            if (Z(t)) {
                qp4.a aVar2 = qp4.s;
                hb5Var.u(qp4.b(yq4.a));
                uv4VarArr = P(uv4VarArr2);
                aVar = null;
            } else {
                a aVar3 = new a(this, X() + R(), t, hb5Var);
                O(aVar3);
                this.D++;
                if (this.x == 0) {
                    uv4VarArr2 = P(uv4VarArr2);
                }
                uv4VarArr = uv4VarArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            jb5.a(hb5Var, aVar);
        }
        int i = 0;
        int length = uv4VarArr.length;
        while (i < length) {
            uv4<yq4> uv4Var2 = uv4VarArr[i];
            i++;
            if (uv4Var2 != null) {
                qp4.a aVar4 = qp4.s;
                uv4Var2.u(qp4.b(yq4.a));
            }
        }
        Object x = hb5Var.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x == gw4.h() ? x : yq4.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(Object obj) {
        int X = X();
        Object[] objArr = this.z;
        if (objArr == null) {
            objArr = Y(null, 0, 2);
        } else if (X >= objArr.length) {
            objArr = Y(objArr, X, objArr.length * 2);
        }
        rj5.d(objArr, R() + X, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    public final uv4<yq4>[] P(uv4<yq4>[] uv4VarArr) {
        kk5[] f;
        sj5 sj5Var;
        uv4<? super yq4> uv4Var;
        int length = uv4VarArr.length;
        if (ik5.e(this) != 0 && (f = ik5.f(this)) != null) {
            int i = 0;
            int length2 = f.length;
            while (i < length2) {
                kk5 kk5Var = f[i];
                i++;
                if (kk5Var != null && (uv4Var = (sj5Var = (sj5) kk5Var).b) != null && b0(sj5Var) >= 0) {
                    int length3 = uv4VarArr.length;
                    uv4VarArr = uv4VarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(uv4VarArr, Math.max(2, uv4VarArr.length * 2));
                        c25.o(copyOf, "copyOf(this, newSize)");
                        uv4VarArr = copyOf;
                    }
                    uv4VarArr[length] = uv4Var;
                    sj5Var.b = null;
                    length++;
                }
            }
        }
        return uv4VarArr;
    }

    private final long Q() {
        return R() + this.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long R() {
        return Math.min(this.B, this.A);
    }

    public static /* synthetic */ void T() {
    }

    private final Object U(long j) {
        Object[] objArr = this.z;
        c25.m(objArr);
        Object c2 = rj5.c(objArr, j);
        return c2 instanceof a ? ((a) c2).u : c2;
    }

    private final long V() {
        return R() + this.C + this.D;
    }

    private final int W() {
        return (int) ((R() + this.C) - this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int X() {
        return this.C + this.D;
    }

    private final Object[] Y(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.z = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long R = R();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + R;
                rj5.d(objArr2, j, rj5.c(objArr, j));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z(T t) {
        if (l() == 0) {
            return a0(t);
        }
        if (this.C >= this.x && this.B <= this.A) {
            int ordinal = this.y.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 2) {
                return true;
            }
        }
        O(t);
        int i = this.C + 1;
        this.C = i;
        if (i > this.x) {
            L();
        }
        if (W() > this.w) {
            d0(this.A + 1, this.B, Q(), V());
        }
        return true;
    }

    private final boolean a0(T t) {
        if (this.w == 0) {
            return true;
        }
        O(t);
        int i = this.C + 1;
        this.C = i;
        if (i > this.w) {
            L();
        }
        this.B = R() + this.C;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long b0(sj5 sj5Var) {
        long j = sj5Var.a;
        if (j < Q()) {
            return j;
        }
        if (this.x <= 0 && j <= R() && this.D != 0) {
            return j;
        }
        return -1L;
    }

    private final Object c0(sj5 sj5Var) {
        Object obj;
        uv4<yq4>[] uv4VarArr = jk5.a;
        synchronized (this) {
            long b0 = b0(sj5Var);
            if (b0 < 0) {
                obj = rj5.a;
            } else {
                long j = sj5Var.a;
                Object U = U(b0);
                sj5Var.a = b0 + 1;
                uv4VarArr = e0(j);
                obj = U;
            }
        }
        int i = 0;
        int length = uv4VarArr.length;
        while (i < length) {
            uv4<yq4> uv4Var = uv4VarArr[i];
            i++;
            if (uv4Var != null) {
                qp4.a aVar = qp4.s;
                uv4Var.u(qp4.b(yq4.a));
            }
        }
        return obj;
    }

    private final void d0(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long R = R(); R < min; R = 1 + R) {
            Object[] objArr = this.z;
            c25.m(objArr);
            rj5.d(objArr, R, null);
        }
        this.A = j;
        this.B = j2;
        this.C = (int) (j3 - min);
        this.D = (int) (j4 - j3);
    }

    @Override // com.p7700g.p99005.kj5
    public boolean A(T t) {
        int i;
        boolean z;
        uv4<yq4>[] uv4VarArr = jk5.a;
        synchronized (this) {
            i = 0;
            if (Z(t)) {
                uv4VarArr = P(uv4VarArr);
                z = true;
            } else {
                z = false;
            }
        }
        int length = uv4VarArr.length;
        while (i < length) {
            uv4<yq4> uv4Var = uv4VarArr[i];
            i++;
            if (uv4Var != null) {
                qp4.a aVar = qp4.s;
                uv4Var.u(qp4.b(yq4.a));
            }
        }
        return z;
    }

    @Override // com.p7700g.p99005.ik5
    @NotNull
    /* renamed from: J */
    public sj5 h() {
        return new sj5();
    }

    @Override // com.p7700g.p99005.ik5
    @NotNull
    /* renamed from: K */
    public sj5[] i(int i) {
        return new sj5[i];
    }

    public final T S() {
        Object[] objArr = this.z;
        c25.m(objArr);
        return (T) rj5.c(objArr, (this.A + W()) - 1);
    }

    @Override // com.p7700g.p99005.pj5, com.p7700g.p99005.pi5
    @Nullable
    public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<?> uv4Var) {
        return H(this, qi5Var, uv4Var);
    }

    @Override // com.p7700g.p99005.kj5, com.p7700g.p99005.qi5
    @Nullable
    public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
        return M(this, t, uv4Var);
    }

    @Override // com.p7700g.p99005.pj5
    @NotNull
    public List<T> c() {
        synchronized (this) {
            int W = W();
            if (W == 0) {
                return js4.F();
            }
            ArrayList arrayList = new ArrayList(W);
            Object[] objArr = this.z;
            c25.m(objArr);
            int i = 0;
            while (i < W) {
                int i2 = i + 1;
                arrayList.add(rj5.c(objArr, this.A + i));
                i = i2;
            }
            return arrayList;
        }
    }

    @Override // com.p7700g.p99005.yk5
    @NotNull
    public pi5<T> d(@NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var) {
        return rj5.e(this, xv4Var, i, ng5Var);
    }

    @NotNull
    public final uv4<yq4>[] e0(long j) {
        int i;
        long j2;
        kk5[] f;
        if (j > this.B) {
            return jk5.a;
        }
        long R = R();
        long j3 = this.C + R;
        long j4 = 1;
        if (this.x == 0 && this.D > 0) {
            j3++;
        }
        if (ik5.e(this) != 0 && (f = ik5.f(this)) != null) {
            int length = f.length;
            int i2 = 0;
            while (i2 < length) {
                kk5 kk5Var = f[i2];
                i2++;
                if (kk5Var != null) {
                    long j5 = ((sj5) kk5Var).a;
                    if (j5 >= 0 && j5 < j3) {
                        j3 = j5;
                    }
                }
            }
        }
        if (j3 <= this.B) {
            return jk5.a;
        }
        long Q = Q();
        if (l() > 0) {
            i = Math.min(this.D, this.x - ((int) (Q - j3)));
        } else {
            i = this.D;
        }
        uv4<yq4>[] uv4VarArr = jk5.a;
        long j6 = this.D + Q;
        if (i > 0) {
            uv4VarArr = new uv4[i];
            Object[] objArr = this.z;
            c25.m(objArr);
            long j7 = Q;
            int i3 = 0;
            while (true) {
                if (Q >= j6) {
                    j2 = j3;
                    break;
                }
                long j8 = Q + j4;
                Object c2 = rj5.c(objArr, Q);
                an5 an5Var = rj5.a;
                if (c2 != an5Var) {
                    Objects.requireNonNull(c2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) c2;
                    int i4 = i3 + 1;
                    j2 = j3;
                    uv4VarArr[i3] = aVar.v;
                    rj5.d(objArr, Q, an5Var);
                    long j9 = j7;
                    rj5.d(objArr, j9, aVar.u);
                    j7 = j9 + 1;
                    if (i4 >= i) {
                        break;
                    }
                    i3 = i4;
                    Q = j8;
                    j3 = j2;
                } else {
                    Q = j8;
                }
                j4 = 1;
            }
            Q = j7;
        } else {
            j2 = j3;
        }
        int i5 = (int) (Q - R);
        long j10 = l() == 0 ? Q : j2;
        long max = Math.max(this.A, Q - Math.min(this.w, i5));
        if (this.x == 0 && max < j6) {
            Object[] objArr2 = this.z;
            c25.m(objArr2);
            if (c25.g(rj5.c(objArr2, max), rj5.a)) {
                Q++;
                max++;
            }
        }
        d0(max, j10, Q, j6);
        G();
        return (uv4VarArr.length == 0) ^ true ? P(uv4VarArr) : uv4VarArr;
    }

    public final long f0() {
        long j = this.A;
        if (j < this.B) {
            this.B = j;
        }
        return j;
    }

    @Override // com.p7700g.p99005.kj5
    public void y() {
        synchronized (this) {
            d0(Q(), this.B, Q(), V());
            yq4 yq4Var = yq4.a;
        }
    }
}