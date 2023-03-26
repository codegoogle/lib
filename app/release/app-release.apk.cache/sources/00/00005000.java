package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Sequences.kt */
@vo4(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001ab\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\f2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00050\u000eH\u0000\u001a&\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000e\u001a=\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000eH\u0007¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0017\"\u0002H\u0002¢\u0006\u0002\u0010\u0018\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00050\u000eH\u0002¢\u0006\u0002\b\u001c\u001a)\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001d0\u0001H\u0007¢\u0006\u0002\b\u001e\u001a\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a2\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a!\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a&\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0007\u001a@\u0010%\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0'0&\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0&0\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "flatMapIndexed", "R", "C", rs2.f.b, "transform", "Lkotlin/Function2;", "", "Lkotlin/Function1;", "generateSequence", "", "nextFunction", "seedFunction", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "shuffled", "random", "Lkotlin/random/Random;", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes3.dex */
public class m75 extends l75 {

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class a implements g75<T> {
        public final /* synthetic */ uz4<Iterator<T>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(uz4<? extends Iterator<? extends T>> uz4Var) {
            this.a = uz4Var;
        }

        @Override // com.p7700g.p99005.g75
        @NotNull
        public Iterator<T> iterator() {
            return (Iterator) this.a.x();
        }
    }

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements g75<T> {
        public final /* synthetic */ Iterator a;

        public b(Iterator it) {
            this.a = it;
        }

        @Override // com.p7700g.p99005.g75
        @NotNull
        public Iterator<T> iterator() {
            return this.a;
        }
    }

    /* compiled from: Sequences.kt */
    @mw4(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {332}, m = "invokeSuspend", n = {"$this$sequence", la1.l}, s = {"L$0", "I$0"})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "C", "R", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends rw4 implements j05<i75<? super R>, uv4<? super yq4>, Object> {
        public final /* synthetic */ f05<C, Iterator<R>> A;
        public Object u;
        public int v;
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ g75<T> y;
        public final /* synthetic */ j05<Integer, T, C> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(g75<? extends T> g75Var, j05<? super Integer, ? super T, ? extends C> j05Var, f05<? super C, ? extends Iterator<? extends R>> f05Var, uv4<? super c> uv4Var) {
            super(2, uv4Var);
            this.y = g75Var;
            this.z = j05Var;
            this.A = f05Var;
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            int i;
            Iterator it;
            i75 i75Var;
            Object h = gw4.h();
            int i2 = this.w;
            if (i2 == 0) {
                rp4.n(obj);
                i = 0;
                it = this.y.iterator();
                i75Var = (i75) this.x;
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i = this.v;
                it = (Iterator) this.u;
                i75Var = (i75) this.x;
                rp4.n(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                j05<Integer, T, C> j05Var = this.z;
                int i3 = i + 1;
                if (i < 0) {
                    js4.X();
                }
                Object w3 = j05Var.w3(iw4.f(i), next);
                this.x = i75Var;
                this.u = it;
                this.v = i3;
                this.w = 1;
                if (i75Var.d((Iterator) this.A.M(w3), this) == h) {
                    return h;
                }
                i = i3;
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            c cVar = new c(this.y, this.z, this.A, uv4Var);
            cVar.x = obj;
            return cVar;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: t3 */
        public final Object w3(@NotNull i75<? super R> i75Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((c) X(i75Var, uv4Var)).D1(yq4.a);
        }
    }

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlin/sequences/Sequence;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends e25 implements f05<g75<? extends T>, Iterator<? extends T>> {
        public static final d t = new d();

        public d() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final Iterator<T> M(@NotNull g75<? extends T> g75Var) {
            c25.p(g75Var, "it");
            return g75Var.iterator();
        }
    }

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends e25 implements f05<Iterable<? extends T>, Iterator<? extends T>> {
        public static final e t = new e();

        public e() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final Iterator<T> M(@NotNull Iterable<? extends T> iterable) {
            c25.p(iterable, "it");
            return iterable.iterator();
        }
    }

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "R", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends e25 implements f05<T, T> {
        public static final f t = new f();

        public f() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        public final T M(T t2) {
            return t2;
        }
    }

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends e25 implements f05<T, T> {
        public final /* synthetic */ uz4<T> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(uz4<? extends T> uz4Var) {
            super(1);
            this.t = uz4Var;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
        @Override // com.p7700g.p99005.f05
        @Nullable
        public final T M(@NotNull T t) {
            c25.p(t, "it");
            return this.t.x();
        }
    }

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h extends e25 implements uz4<T> {
        public final /* synthetic */ T t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(T t) {
            super(0);
            this.t = t;
        }

        @Override // com.p7700g.p99005.uz4
        @Nullable
        public final T x() {
            return this.t;
        }
    }

    /* compiled from: Sequences.kt */
    @mw4(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i extends rw4 implements j05<i75<? super T>, uv4<? super yq4>, Object> {
        public int u;
        private /* synthetic */ Object v;
        public final /* synthetic */ g75<T> w;
        public final /* synthetic */ uz4<g75<T>> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(g75<? extends T> g75Var, uz4<? extends g75<? extends T>> uz4Var, uv4<? super i> uv4Var) {
            super(2, uv4Var);
            this.w = g75Var;
            this.x = uz4Var;
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.u;
            if (i == 0) {
                rp4.n(obj);
                i75 i75Var = (i75) this.v;
                Iterator it = this.w.iterator();
                if (it.hasNext()) {
                    this.u = 1;
                    if (i75Var.d(it, this) == h) {
                        return h;
                    }
                } else {
                    this.u = 2;
                    if (i75Var.e((g75) this.x.x(), this) == h) {
                        return h;
                    }
                }
            } else if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            i iVar = new i(this.w, this.x, uv4Var);
            iVar.v = obj;
            return iVar;
        }

        @Nullable
        public final Object t3(@NotNull i75<? super T> i75Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((i) X(i75Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ Object w3(Object obj, uv4<? super yq4> uv4Var) {
            return t3((i75) obj, uv4Var);
        }
    }

    /* compiled from: Sequences.kt */
    @mw4(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j extends rw4 implements j05<i75<? super T>, uv4<? super yq4>, Object> {
        public Object u;
        public int v;
        private /* synthetic */ Object w;
        public final /* synthetic */ g75<T> x;
        public final /* synthetic */ n45 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(g75<? extends T> g75Var, n45 n45Var, uv4<? super j> uv4Var) {
            super(2, uv4Var);
            this.x = g75Var;
            this.y = n45Var;
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            List d3;
            i75 i75Var;
            Object h = gw4.h();
            int i = this.v;
            if (i == 0) {
                rp4.n(obj);
                d3 = o75.d3(this.x);
                i75Var = (i75) this.w;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                d3 = (List) this.u;
                i75Var = (i75) this.w;
                rp4.n(obj);
            }
            while (!d3.isEmpty()) {
                int A = this.y.A(d3.size());
                Object L0 = os4.L0(d3);
                if (A < d3.size()) {
                    L0 = d3.set(A, L0);
                }
                this.w = i75Var;
                this.u = d3;
                this.v = 1;
                if (i75Var.b(L0, this) == h) {
                    return h;
                }
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            j jVar = new j(this.x, this.y, uv4Var);
            jVar.w = obj;
            return jVar;
        }

        @Nullable
        public final Object t3(@NotNull i75<? super T> i75Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((j) X(i75Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ Object w3(Object obj, uv4<? super yq4> uv4Var) {
            return t3((i75) obj, uv4Var);
        }
    }

    public m75() {
    }

    @dx4
    private static final <T> g75<T> d(uz4<? extends Iterator<? extends T>> uz4Var) {
        c25.p(uz4Var, "iterator");
        return new a(uz4Var);
    }

    @NotNull
    public static final <T> g75<T> e(@NotNull Iterator<? extends T> it) {
        c25.p(it, "<this>");
        return f(new b(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> g75<T> f(@NotNull g75<? extends T> g75Var) {
        c25.p(g75Var, "<this>");
        return g75Var instanceof u65 ? g75Var : new u65(g75Var);
    }

    @NotNull
    public static final <T> g75<T> g() {
        return a75.a;
    }

    @NotNull
    public static final <T, C, R> g75<R> h(@NotNull g75<? extends T> g75Var, @NotNull j05<? super Integer, ? super T, ? extends C> j05Var, @NotNull f05<? super C, ? extends Iterator<? extends R>> f05Var) {
        c25.p(g75Var, rs2.f.b);
        c25.p(j05Var, "transform");
        c25.p(f05Var, "iterator");
        return k75.b(new c(g75Var, j05Var, f05Var, null));
    }

    @NotNull
    public static final <T> g75<T> i(@NotNull g75<? extends g75<? extends T>> g75Var) {
        c25.p(g75Var, "<this>");
        return j(g75Var, d.t);
    }

    private static final <T, R> g75<R> j(g75<? extends T> g75Var, f05<? super T, ? extends Iterator<? extends R>> f05Var) {
        if (g75Var instanceof t75) {
            return ((t75) g75Var).e(f05Var);
        }
        return new c75(g75Var, f.t, f05Var);
    }

    @fz4(name = "flattenSequenceOfIterable")
    @NotNull
    public static final <T> g75<T> k(@NotNull g75<? extends Iterable<? extends T>> g75Var) {
        c25.p(g75Var, "<this>");
        return j(g75Var, e.t);
    }

    @fx4
    @NotNull
    public static final <T> g75<T> l(@Nullable T t, @NotNull f05<? super T, ? extends T> f05Var) {
        c25.p(f05Var, "nextFunction");
        if (t == null) {
            return a75.a;
        }
        return new d75(new h(t), f05Var);
    }

    @NotNull
    public static final <T> g75<T> m(@NotNull uz4<? extends T> uz4Var) {
        c25.p(uz4Var, "nextFunction");
        return f(new d75(uz4Var, new g(uz4Var)));
    }

    @NotNull
    public static final <T> g75<T> n(@NotNull uz4<? extends T> uz4Var, @NotNull f05<? super T, ? extends T> f05Var) {
        c25.p(uz4Var, "seedFunction");
        c25.p(f05Var, "nextFunction");
        return new d75(uz4Var, f05Var);
    }

    @tp4(version = "1.3")
    @NotNull
    public static final <T> g75<T> o(@NotNull g75<? extends T> g75Var, @NotNull uz4<? extends g75<? extends T>> uz4Var) {
        c25.p(g75Var, "<this>");
        c25.p(uz4Var, "defaultValue");
        return k75.b(new i(g75Var, uz4Var, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dx4
    @tp4(version = "1.3")
    private static final <T> g75<T> p(g75<? extends T> g75Var) {
        return g75Var == 0 ? g() : g75Var;
    }

    @NotNull
    public static final <T> g75<T> q(@NotNull T... tArr) {
        c25.p(tArr, "elements");
        return tArr.length == 0 ? g() : as4.l6(tArr);
    }

    @tp4(version = "1.4")
    @NotNull
    public static final <T> g75<T> r(@NotNull g75<? extends T> g75Var) {
        c25.p(g75Var, "<this>");
        return s(g75Var, n45.s);
    }

    @tp4(version = "1.4")
    @NotNull
    public static final <T> g75<T> s(@NotNull g75<? extends T> g75Var, @NotNull n45 n45Var) {
        c25.p(g75Var, "<this>");
        c25.p(n45Var, "random");
        return k75.b(new j(g75Var, n45Var, null));
    }

    @NotNull
    public static final <T, R> hp4<List<T>, List<R>> t(@NotNull g75<? extends hp4<? extends T, ? extends R>> g75Var) {
        c25.p(g75Var, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (hp4<? extends T, ? extends R> hp4Var : g75Var) {
            arrayList.add(hp4Var.m());
            arrayList2.add(hp4Var.n());
        }
        return cq4.a(arrayList, arrayList2);
    }
}