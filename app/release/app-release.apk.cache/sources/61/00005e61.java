package com.p7700g.p99005;

import com.p7700g.p99005.jh5;
import com.p7700g.p99005.nh5;
import com.p7700g.p99005.sg5;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.WKSRecord;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T1
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Combine.kt */
@vo4(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001an\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u0090\u0001\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00010\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u0001H\u000e\u0018\u00010\u00110\u001329\u0010\u0007\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u0014H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u0015*\u001c\b\u0002\u0010\u0016\"\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00172\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"zipImpl", "Lkotlinx/coroutines/flow/Flow;", "R", "T1", "T2", "flow", "flow2", "transform", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "combineInternal", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "flows", "", "arrayFactory", "Lkotlin/Function0;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;[Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Update", "Lkotlin/collections/IndexedValue;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class tk5 {

    /* compiled from: Combine.kt */
    @mw4(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {57, 79, 82}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends vw4 implements j05<lc5, uv4<? super yq4>, Object> {
        public int A;
        private /* synthetic */ Object B;
        public final /* synthetic */ pi5<T>[] C;
        public final /* synthetic */ uz4<T[]> D;
        public final /* synthetic */ k05<qi5<? super R>, T[], uv4<? super yq4>, Object> E;
        public final /* synthetic */ qi5<R> F;
        public Object w;
        public Object x;
        public int y;
        public int z;

        /* compiled from: Combine.kt */
        @mw4(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.tk5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0245a extends vw4 implements j05<lc5, uv4<? super yq4>, Object> {
            public final /* synthetic */ og5<ct4<Object>> A;
            public int w;
            public final /* synthetic */ pi5<T>[] x;
            public final /* synthetic */ int y;
            public final /* synthetic */ AtomicInteger z;

            /* compiled from: Combine.kt */
            @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.p7700g.p99005.tk5$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0246a<T> implements qi5, uw4 {
                public final /* synthetic */ og5<ct4<Object>> s;
                public final /* synthetic */ int t;

                /* compiled from: Combine.kt */
                @mw4(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {35, 36}, m = "emit", n = {}, s = {})
                @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: com.p7700g.p99005.tk5$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0247a extends kw4 {
                    public /* synthetic */ Object v;
                    public final /* synthetic */ C0246a<T> w;
                    public int x;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0247a(C0246a<? super T> c0246a, uv4<? super C0247a> uv4Var) {
                        super(uv4Var);
                        this.w = c0246a;
                    }

                    @Override // com.p7700g.p99005.hw4
                    @Nullable
                    public final Object D1(@NotNull Object obj) {
                        this.v = obj;
                        this.x |= Integer.MIN_VALUE;
                        return this.w.b(null, this);
                    }
                }

                public C0246a(og5<ct4<Object>> og5Var, int i) {
                    this.s = og5Var;
                    this.t = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
                @Override // com.p7700g.p99005.qi5
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
                    C0247a c0247a;
                    Object h;
                    int i;
                    if (uv4Var instanceof C0247a) {
                        c0247a = (C0247a) uv4Var;
                        int i2 = c0247a.x;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0247a.x = i2 - Integer.MIN_VALUE;
                            Object obj = c0247a.v;
                            h = gw4.h();
                            i = c0247a.x;
                            if (i != 0) {
                                rp4.n(obj);
                                og5<ct4<Object>> og5Var = this.s;
                                ct4<Object> ct4Var = new ct4<>(this.t, t);
                                c0247a.x = 1;
                                if (og5Var.I(ct4Var, c0247a) == h) {
                                    return h;
                                }
                            } else if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                rp4.n(obj);
                                return yq4.a;
                            } else {
                                rp4.n(obj);
                            }
                            c0247a.x = 2;
                            if (vf5.a(c0247a) == h) {
                                return h;
                            }
                            return yq4.a;
                        }
                    }
                    c0247a = new C0247a(this, uv4Var);
                    Object obj2 = c0247a.v;
                    h = gw4.h();
                    i = c0247a.x;
                    if (i != 0) {
                    }
                    c0247a.x = 2;
                    if (vf5.a(c0247a) == h) {
                    }
                    return yq4.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0245a(pi5<? extends T>[] pi5VarArr, int i, AtomicInteger atomicInteger, og5<ct4<Object>> og5Var, uv4<? super C0245a> uv4Var) {
                super(2, uv4Var);
                this.x = pi5VarArr;
                this.y = i;
                this.z = atomicInteger;
                this.A = og5Var;
            }

            @Override // com.p7700g.p99005.j05
            @Nullable
            /* renamed from: C3 */
            public final Object w3(@NotNull lc5 lc5Var, @Nullable uv4<? super yq4> uv4Var) {
                return ((C0245a) X(lc5Var, uv4Var)).D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                AtomicInteger atomicInteger;
                Object h = gw4.h();
                int i = this.w;
                try {
                    if (i == 0) {
                        rp4.n(obj);
                        pi5[] pi5VarArr = this.x;
                        int i2 = this.y;
                        pi5 pi5Var = pi5VarArr[i2];
                        C0246a c0246a = new C0246a(this.A, i2);
                        this.w = 1;
                        if (pi5Var.a(c0246a, this) == h) {
                            return h;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        rp4.n(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        nh5.a.a(this.A, null, 1, null);
                    }
                    return yq4.a;
                } finally {
                    if (this.z.decrementAndGet() == 0) {
                        nh5.a.a(this.A, null, 1, null);
                    }
                }
            }

            @Override // com.p7700g.p99005.hw4
            @NotNull
            public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
                return new C0245a(this.x, this.y, this.z, this.A, uv4Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(pi5<? extends T>[] pi5VarArr, uz4<T[]> uz4Var, k05<? super qi5<? super R>, ? super T[], ? super uv4<? super yq4>, ? extends Object> k05Var, qi5<? super R> qi5Var, uv4<? super a> uv4Var) {
            super(2, uv4Var);
            this.C = pi5VarArr;
            this.D = uz4Var;
            this.E = k05Var;
            this.F = qi5Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull lc5 lc5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((a) X(lc5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ed A[LOOP:0: B:28:0x00ed->B:35:0x0111, LOOP_START, PHI: r3 r10 
          PHI: (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:25:0x00e8, B:35:0x0111] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v5 com.p7700g.p99005.ct4) = (r10v4 com.p7700g.p99005.ct4), (r10v18 com.p7700g.p99005.ct4) binds: [B:25:0x00e8, B:35:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r11v1, types: [com.p7700g.p99005.pi5[], com.p7700g.p99005.pi5<T>[]] */
        /* JADX WARN: Type inference failed for: r2v12, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Type inference failed for: r7v0, types: [com.p7700g.p99005.pi5<T>[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0136 -> B:20:0x00c8). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x016b -> B:46:0x0167). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            int length;
            Object[] objArr;
            byte[] bArr;
            a aVar;
            og5 og5Var;
            Object[] objArr2;
            Object obj2;
            a aVar2;
            og5 og5Var2;
            byte b;
            int i;
            ct4 ct4Var;
            Object[] objArr3;
            Object h = gw4.h();
            int i2 = this.A;
            byte b2 = 0;
            int i3 = 2;
            if (i2 == 0) {
                rp4.n(obj);
                lc5 lc5Var = (lc5) this.B;
                length = this.C.length;
                if (length == 0) {
                    return yq4.a;
                }
                objArr = new Object[length];
                zr4.w2(objArr, bl5.b, 0, 0, 6, null);
                og5 d = rg5.d(length, null, null, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                for (int i4 = 0; i4 < length; i4++) {
                    bb5.f(lc5Var, null, null, new C0245a(this.C, i4, atomicInteger, d, null), 3, null);
                    atomicInteger = atomicInteger;
                }
                bArr = new byte[length];
                aVar = this;
                og5Var = d;
            } else if (i2 == 1) {
                ?? r2 = this.z;
                i = this.y;
                byte[] bArr2 = (byte[]) this.x;
                og5Var2 = (og5) this.w;
                rp4.n(obj);
                obj2 = ((sg5) obj).o();
                objArr2 = (Object[]) this.B;
                aVar2 = this;
                b = r2;
                bArr = bArr2;
                ct4Var = (ct4) sg5.h(obj2);
                if (ct4Var != null) {
                    return yq4.a;
                }
                do {
                    int e = ct4Var.e();
                    Object obj3 = objArr2[e];
                    objArr2[e] = ct4Var.f();
                    if (obj3 == bl5.b) {
                        i--;
                    }
                    if (bArr[e] == b) {
                        break;
                    }
                    bArr[e] = b;
                    ct4Var = (ct4) sg5.h(og5Var2.q());
                } while (ct4Var != null);
                if (i != 0) {
                    objArr3 = objArr2;
                } else {
                    Object[] objArr4 = (Object[]) aVar2.D.x();
                    if (objArr4 == null) {
                        k05 k05Var = aVar2.E;
                        Object obj4 = aVar2.F;
                        aVar2.B = objArr2;
                        aVar2.w = og5Var2;
                        aVar2.x = bArr;
                        aVar2.y = i;
                        aVar2.z = b;
                        aVar2.A = i3;
                        if (k05Var.I(obj4, objArr2, aVar2) == h) {
                            return h;
                        }
                        length = i;
                        b2 = b;
                        og5Var = og5Var2;
                        aVar = aVar2;
                        objArr = objArr2;
                    } else {
                        objArr3 = objArr2;
                        zr4.l1(objArr2, objArr4, 0, 0, 0, 14, null);
                        k05 k05Var2 = aVar2.E;
                        Object obj5 = aVar2.F;
                        aVar2.B = objArr3;
                        aVar2.w = og5Var2;
                        aVar2.x = bArr;
                        aVar2.y = i;
                        aVar2.z = b;
                        aVar2.A = 3;
                        if (k05Var2.I(obj5, objArr4, aVar2) == h) {
                            return h;
                        }
                    }
                }
                length = i;
                objArr = objArr3;
                b2 = b;
                og5Var = og5Var2;
                aVar = aVar2;
                i3 = 2;
            } else if (i2 == 2) {
                ?? r22 = this.z;
                int i5 = this.y;
                rp4.n(obj);
                length = i5;
                objArr = (Object[]) this.B;
                b2 = r22;
                bArr = (byte[]) this.x;
                og5Var = (og5) this.w;
                aVar = this;
            } else if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ?? r23 = this.z;
                int i6 = this.y;
                rp4.n(obj);
                length = i6;
                objArr = (Object[]) this.B;
                b2 = r23;
                bArr = (byte[]) this.x;
                og5Var = (og5) this.w;
                aVar = this;
                i3 = 2;
            }
            byte b3 = (byte) (b2 + 1);
            aVar.B = objArr;
            aVar.w = og5Var;
            aVar.x = bArr;
            aVar.y = length;
            aVar.z = b3;
            aVar.A = 1;
            obj2 = og5Var.t(aVar);
            if (obj2 == h) {
                return h;
            }
            aVar2 = aVar;
            objArr2 = objArr;
            og5Var2 = og5Var;
            b = b3;
            i = length;
            ct4Var = (ct4) sg5.h(obj2);
            if (ct4Var != null) {
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            a aVar = new a(this.C, this.D, this.E, this.F, uv4Var);
            aVar.B = obj;
            return aVar;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements pi5<R> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ pi5 t;
        public final /* synthetic */ k05 u;

        public b(pi5 pi5Var, pi5 pi5Var2, k05 k05Var) {
            this.s = pi5Var;
            this.t = pi5Var2;
            this.u = k05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super R> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            Object g = mc5.g(new c(qi5Var, this.s, this.t, this.u, null), uv4Var);
            return g == gw4.h() ? g : yq4.a;
        }
    }

    /* compiled from: Combine.kt */
    @mw4(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends vw4 implements j05<lc5, uv4<? super yq4>, Object> {
        public final /* synthetic */ pi5<T1> A;
        public final /* synthetic */ k05<T1, T2, uv4<? super R>, Object> B;
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ qi5<R> y;
        public final /* synthetic */ pi5<T2> z;

        /* compiled from: Combine.kt */
        @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends e25 implements f05<Throwable, yq4> {
            public final /* synthetic */ sb5 t;
            public final /* synthetic */ qi5<R> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(sb5 sb5Var, qi5<? super R> qi5Var) {
                super(1);
                this.t = sb5Var;
                this.u = qi5Var;
            }

            @Override // com.p7700g.p99005.f05
            public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
                a(th);
                return yq4.a;
            }

            public final void a(@Nullable Throwable th) {
                if (this.t.h()) {
                    this.t.b(new hk5(this.u));
                }
            }
        }

        /* compiled from: Combine.kt */
        @mw4(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {WKSRecord.Service.CISCO_FNA}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b extends vw4 implements j05<yq4, uv4<? super yq4>, Object> {
            public final /* synthetic */ jh5<Object> A;
            public final /* synthetic */ qi5<R> B;
            public final /* synthetic */ k05<T1, T2, uv4<? super R>, Object> C;
            public int w;
            public final /* synthetic */ pi5<T1> x;
            public final /* synthetic */ xv4 y;
            public final /* synthetic */ Object z;

            /* compiled from: Combine.kt */
            @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a<T> implements qi5, uw4 {
                public final /* synthetic */ xv4 s;
                public final /* synthetic */ Object t;
                public final /* synthetic */ jh5<Object> u;
                public final /* synthetic */ qi5<R> v;
                public final /* synthetic */ k05<T1, T2, uv4<? super R>, Object> w;

                /* compiled from: Combine.kt */
                @mw4(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {WKSRecord.Service.CISCO_SYS, WKSRecord.Service.LOC_SRV, WKSRecord.Service.LOC_SRV}, m = "invokeSuspend", n = {}, s = {})
                @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it"}, k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: com.p7700g.p99005.tk5$c$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0248a extends vw4 implements j05<yq4, uv4<? super yq4>, Object> {
                    public final /* synthetic */ k05<T1, T2, uv4<? super R>, Object> A;
                    public final /* synthetic */ T1 B;
                    public Object w;
                    public int x;
                    public final /* synthetic */ jh5<Object> y;
                    public final /* synthetic */ qi5<R> z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0248a(jh5<? extends Object> jh5Var, qi5<? super R> qi5Var, k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var, T1 t1, uv4<? super C0248a> uv4Var) {
                        super(2, uv4Var);
                        this.y = jh5Var;
                        this.z = qi5Var;
                        this.A = k05Var;
                        this.B = t1;
                    }

                    @Nullable
                    public final Object C3(@NotNull yq4 yq4Var, @Nullable uv4<? super yq4> uv4Var) {
                        return ((C0248a) X(yq4Var, uv4Var)).D1(yq4.a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[RETURN] */
                    @Override // com.p7700g.p99005.hw4
                    @Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object D1(@NotNull Object obj) {
                        Object t;
                        qi5 qi5Var;
                        Object h = gw4.h();
                        int i = this.x;
                        if (i == 0) {
                            rp4.n(obj);
                            jh5<Object> jh5Var = this.y;
                            this.x = 1;
                            t = jh5Var.t(this);
                            if (t == h) {
                                return h;
                            }
                        } else if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                rp4.n(obj);
                                return yq4.a;
                            }
                            rp4.n(obj);
                            qi5Var = (qi5) this.w;
                            this.w = null;
                            this.x = 3;
                            if (qi5Var.b(obj, this) == h) {
                                return h;
                            }
                            return yq4.a;
                        } else {
                            rp4.n(obj);
                            t = ((sg5) obj).o();
                        }
                        qi5 qi5Var2 = this.z;
                        if (t instanceof sg5.c) {
                            Throwable f = sg5.f(t);
                            if (f == null) {
                                throw new hk5(qi5Var2);
                            }
                            throw f;
                        }
                        k05<T1, T2, uv4<? super R>, Object> k05Var = this.A;
                        T1 t1 = this.B;
                        if (t == bl5.a) {
                            t = null;
                        }
                        this.w = qi5Var2;
                        this.x = 2;
                        obj = k05Var.I(t1, t, this);
                        qi5Var = qi5Var2;
                        if (obj == h) {
                            return h;
                        }
                        this.w = null;
                        this.x = 3;
                        if (qi5Var.b(obj, this) == h) {
                        }
                        return yq4.a;
                    }

                    @Override // com.p7700g.p99005.hw4
                    @NotNull
                    public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
                        return new C0248a(this.y, this.z, this.A, this.B, uv4Var);
                    }

                    @Override // com.p7700g.p99005.j05
                    public /* bridge */ /* synthetic */ Object w3(yq4 yq4Var, uv4<? super yq4> uv4Var) {
                        return C3(yq4Var, uv4Var);
                    }
                }

                /* compiled from: Combine.kt */
                @mw4(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {WKSRecord.Service.CISCO_TNA}, m = "emit", n = {}, s = {})
                @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: com.p7700g.p99005.tk5$c$b$a$b  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0249b extends kw4 {
                    public /* synthetic */ Object v;
                    public final /* synthetic */ a<T> w;
                    public int x;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0249b(a<? super T> aVar, uv4<? super C0249b> uv4Var) {
                        super(uv4Var);
                        this.w = aVar;
                    }

                    @Override // com.p7700g.p99005.hw4
                    @Nullable
                    public final Object D1(@NotNull Object obj) {
                        this.v = obj;
                        this.x |= Integer.MIN_VALUE;
                        return this.w.b(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a(xv4 xv4Var, Object obj, jh5<? extends Object> jh5Var, qi5<? super R> qi5Var, k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var) {
                    this.s = xv4Var;
                    this.t = obj;
                    this.u = jh5Var;
                    this.v = qi5Var;
                    this.w = k05Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // com.p7700g.p99005.qi5
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object b(T1 t1, @NotNull uv4<? super yq4> uv4Var) {
                    C0249b c0249b;
                    int i;
                    if (uv4Var instanceof C0249b) {
                        c0249b = (C0249b) uv4Var;
                        int i2 = c0249b.x;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0249b.x = i2 - Integer.MIN_VALUE;
                            Object obj = c0249b.v;
                            Object h = gw4.h();
                            i = c0249b.x;
                            if (i != 0) {
                                rp4.n(obj);
                                xv4 xv4Var = this.s;
                                yq4 yq4Var = yq4.a;
                                Object obj2 = this.t;
                                C0248a c0248a = new C0248a(this.u, this.v, this.w, t1, null);
                                c0249b.x = 1;
                                if (mk5.c(xv4Var, yq4Var, obj2, c0248a, c0249b) == h) {
                                    return h;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                rp4.n(obj);
                            }
                            return yq4.a;
                        }
                    }
                    c0249b = new C0249b(this, uv4Var);
                    Object obj3 = c0249b.v;
                    Object h2 = gw4.h();
                    i = c0249b.x;
                    if (i != 0) {
                    }
                    return yq4.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(pi5<? extends T1> pi5Var, xv4 xv4Var, Object obj, jh5<? extends Object> jh5Var, qi5<? super R> qi5Var, k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var, uv4<? super b> uv4Var) {
                super(2, uv4Var);
                this.x = pi5Var;
                this.y = xv4Var;
                this.z = obj;
                this.A = jh5Var;
                this.B = qi5Var;
                this.C = k05Var;
            }

            @Nullable
            public final Object C3(@NotNull yq4 yq4Var, @Nullable uv4<? super yq4> uv4Var) {
                return ((b) X(yq4Var, uv4Var)).D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    pi5<T1> pi5Var = this.x;
                    a aVar = new a(this.y, this.z, this.A, this.B, this.C);
                    this.w = 1;
                    if (pi5Var.a(aVar, this) == h) {
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
                return new b(this.x, this.y, this.z, this.A, this.B, this.C, uv4Var);
            }

            @Override // com.p7700g.p99005.j05
            public /* bridge */ /* synthetic */ Object w3(yq4 yq4Var, uv4<? super yq4> uv4Var) {
                return C3(yq4Var, uv4Var);
            }
        }

        /* compiled from: Combine.kt */
        @mw4(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.tk5$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0250c extends vw4 implements j05<hh5<? super Object>, uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public final /* synthetic */ pi5<T2> y;

            /* compiled from: Combine.kt */
            @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.p7700g.p99005.tk5$c$c$a */
            /* loaded from: classes3.dex */
            public static final class a<T> implements qi5, uw4 {
                public final /* synthetic */ hh5<Object> s;

                /* compiled from: Combine.kt */
                @mw4(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {93}, m = "emit", n = {}, s = {})
                @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: com.p7700g.p99005.tk5$c$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0251a extends kw4 {
                    public /* synthetic */ Object v;
                    public final /* synthetic */ a<T> w;
                    public int x;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0251a(a<? super T> aVar, uv4<? super C0251a> uv4Var) {
                        super(uv4Var);
                        this.w = aVar;
                    }

                    @Override // com.p7700g.p99005.hw4
                    @Nullable
                    public final Object D1(@NotNull Object obj) {
                        this.v = obj;
                        this.x |= Integer.MIN_VALUE;
                        return this.w.b(null, this);
                    }
                }

                public a(hh5<Object> hh5Var) {
                    this.s = hh5Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // com.p7700g.p99005.qi5
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object b(T2 t2, @NotNull uv4<? super yq4> uv4Var) {
                    C0251a c0251a;
                    int i;
                    if (uv4Var instanceof C0251a) {
                        c0251a = (C0251a) uv4Var;
                        int i2 = c0251a.x;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0251a.x = i2 - Integer.MIN_VALUE;
                            Object obj = c0251a.v;
                            Object h = gw4.h();
                            i = c0251a.x;
                            if (i != 0) {
                                rp4.n(obj);
                                nh5<Object> c = this.s.c();
                                an5 an5Var = t2;
                                if (t2 == 0) {
                                    an5Var = bl5.a;
                                }
                                c0251a.x = 1;
                                if (c.I(an5Var, c0251a) == h) {
                                    return h;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                rp4.n(obj);
                            }
                            return yq4.a;
                        }
                    }
                    c0251a = new C0251a(this, uv4Var);
                    Object obj2 = c0251a.v;
                    Object h2 = gw4.h();
                    i = c0251a.x;
                    if (i != 0) {
                    }
                    return yq4.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0250c(pi5<? extends T2> pi5Var, uv4<? super C0250c> uv4Var) {
                super(2, uv4Var);
                this.y = pi5Var;
            }

            @Nullable
            public final Object C3(@NotNull hh5<Object> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
                return ((C0250c) X(hh5Var, uv4Var)).D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    pi5<T2> pi5Var = this.y;
                    a aVar = new a((hh5) this.x);
                    this.w = 1;
                    if (pi5Var.a(aVar, this) == h) {
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
                C0250c c0250c = new C0250c(this.y, uv4Var);
                c0250c.x = obj;
                return c0250c;
            }

            @Override // com.p7700g.p99005.j05
            public /* bridge */ /* synthetic */ Object w3(hh5<? super Object> hh5Var, uv4<? super yq4> uv4Var) {
                return C3(hh5Var, uv4Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(qi5<? super R> qi5Var, pi5<? extends T2> pi5Var, pi5<? extends T1> pi5Var2, k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var, uv4<? super c> uv4Var) {
            super(2, uv4Var);
            this.y = qi5Var;
            this.z = pi5Var;
            this.A = pi5Var2;
            this.B = k05Var;
        }

        @Nullable
        public final Object C3(@NotNull lc5 lc5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((c) X(lc5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v12, types: [com.p7700g.p99005.jh5] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v2, types: [com.p7700g.p99005.jh5] */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            sb5 c;
            jh5 jh5Var;
            jh5 jh5Var2;
            xv4 plus;
            yq4 yq4Var;
            b bVar;
            Object h = gw4.h();
            jh5 jh5Var3 = this.w;
            try {
                if (jh5Var3 != 0) {
                    if (jh5Var3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jh5Var2 = (jh5) this.x;
                    try {
                        rp4.n(obj);
                        jh5Var3 = jh5Var2;
                    } catch (hk5 e) {
                        e = e;
                    }
                    jh5.a.b(jh5Var3, null, 1, null);
                    return yq4.a;
                }
                rp4.n(obj);
                lc5 lc5Var = (lc5) this.x;
                jh5 f = fh5.f(lc5Var, null, 0, new C0250c(this.z, null), 3, null);
                c = ke5.c(null, 1, null);
                ((nh5) f).B(new a(c, this.y));
                try {
                    xv4 y = lc5Var.y();
                    Object b2 = fn5.b(y);
                    plus = lc5Var.y().plus(c);
                    yq4Var = yq4.a;
                    bVar = new b(this.A, y, b2, f, this.y, this.B, null);
                    this.x = f;
                    this.w = 1;
                    jh5Var = f;
                    try {
                    } catch (hk5 e2) {
                        e = e2;
                        jh5Var2 = jh5Var;
                        xk5.b(e, this.y);
                        jh5Var3 = jh5Var2;
                        jh5.a.b(jh5Var3, null, 1, null);
                        return yq4.a;
                    } catch (Throwable th) {
                        th = th;
                        jh5Var3 = jh5Var;
                        jh5.a.b(jh5Var3, null, 1, null);
                        throw th;
                    }
                } catch (hk5 e3) {
                    e = e3;
                    jh5Var = f;
                } catch (Throwable th2) {
                    th = th2;
                    jh5Var = f;
                }
                if (mk5.d(plus, yq4Var, null, bVar, this, 4, null) == h) {
                    return h;
                }
                jh5Var3 = jh5Var;
                jh5.a.b(jh5Var3, null, 1, null);
                return yq4.a;
                xk5.b(e, this.y);
                jh5Var3 = jh5Var2;
                jh5.a.b(jh5Var3, null, 1, null);
                return yq4.a;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            c cVar = new c(this.y, this.z, this.A, this.B, uv4Var);
            cVar.x = obj;
            return cVar;
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ Object w3(lc5 lc5Var, uv4<? super yq4> uv4Var) {
            return C3(lc5Var, uv4Var);
        }
    }

    @np4
    @Nullable
    public static final <R, T> Object a(@NotNull qi5<? super R> qi5Var, @NotNull pi5<? extends T>[] pi5VarArr, @NotNull uz4<T[]> uz4Var, @NotNull k05<? super qi5<? super R>, ? super T[], ? super uv4<? super yq4>, ? extends Object> k05Var, @NotNull uv4<? super yq4> uv4Var) {
        Object a2 = wk5.a(new a(pi5VarArr, uz4Var, k05Var, qi5Var, null), uv4Var);
        return a2 == gw4.h() ? a2 : yq4.a;
    }

    @NotNull
    public static final <T1, T2, R> pi5<R> b(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var) {
        return new b(pi5Var2, pi5Var, k05Var);
    }
}