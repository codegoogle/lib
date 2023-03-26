package com.p7700g.p99005;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: _SequencesJvm.kt */
@vo4(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001aA\u0010\u0005\u001a\u0002H\u0006\"\u0010\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0007\"\u0004\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\b\u001a\u0002H\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¢\u0006\u0002\u0010\t\u001a)\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f*\b\u0012\u0004\u0012\u0002H\u000b0\u0001H\u0007¢\u0006\u0002\u0010\r\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\u000e0\u0001H\u0007¢\u0006\u0002\u0010\u000f\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00020\u00100\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001aG\u0010\u0012\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a;\u0010\u0016\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000b0\u0018j\n\u0012\u0006\b\u0000\u0012\u0002H\u000b`\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a)\u0010\u001b\u001a\u0004\u0018\u0001H\u000b\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f*\b\u0012\u0004\u0012\u0002H\u000b0\u0001H\u0007¢\u0006\u0002\u0010\r\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\u000e0\u0001H\u0007¢\u0006\u0002\u0010\u000f\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00020\u00100\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001aG\u0010\u001c\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a;\u0010\u001d\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000b0\u0018j\n\u0012\u0006\b\u0000\u0012\u0002H\u000b`\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a5\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u001f0\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\b \u001a5\u0010\u001e\u001a\u00020!\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020!0\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\b\"\u001a&\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u000b0$\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f*\b\u0012\u0004\u0012\u0002H\u000b0\u0001\u001a8\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u000b0$\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000b0\u0018j\n\u0012\u0006\b\u0000\u0012\u0002H\u000b`\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, d2 = {"filterIsInstance", "Lkotlin/sequences/Sequence;", "R", "klass", "Ljava/lang/Class;", "filterIsInstanceTo", "C", "", "destination", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "max", "T", "", "(Lkotlin/sequences/Sequence;)Ljava/lang/Comparable;", "", "(Lkotlin/sequences/Sequence;)Ljava/lang/Double;", "", "(Lkotlin/sequences/Sequence;)Ljava/lang/Float;", "maxBy", "selector", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Lkotlin/sequences/Sequence;Ljava/util/Comparator;)Ljava/lang/Object;", "min", "minBy", "minWith", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes3.dex */
public class n75 extends m75 {

    /* compiled from: _SequencesJvm.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements f05<Object, Boolean> {
        public final /* synthetic */ Class<R> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<R> cls) {
            super(1);
            this.t = cls;
        }

        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final Boolean M(@Nullable Object obj) {
            return Boolean.valueOf(this.t.isInstance(obj));
        }
    }

    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxWithOrNull instead.", replaceWith = @op4(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object A(g75 g75Var, Comparator comparator) {
        c25.p(g75Var, "<this>");
        c25.p(comparator, "comparator");
        return o75.I1(g75Var, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minByOrNull instead.", replaceWith = @op4(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T E(g75<? extends T> g75Var, f05<? super T, ? extends R> f05Var) {
        Iterator U = wo1.U(g75Var, "<this>", f05Var, "selector");
        if (U.hasNext()) {
            Object obj = (Object) U.next();
            if (U.hasNext()) {
                R M = f05Var.M(obj);
                Object obj2 = obj;
                do {
                    Object obj3 = (Object) U.next();
                    R M2 = f05Var.M(obj3);
                    obj = obj2;
                    if (M.compareTo(M2) > 0) {
                        M = M2;
                        obj = (Object) obj3;
                    }
                    obj2 = obj;
                } while (U.hasNext());
                return obj;
            }
            return obj;
        }
        return null;
    }

    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minWithOrNull instead.", replaceWith = @op4(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object F(g75 g75Var, Comparator comparator) {
        c25.p(g75Var, "<this>");
        c25.p(comparator, "comparator");
        return o75.a2(g75Var, comparator);
    }

    @fz4(name = "sumOfBigDecimal")
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <T> BigDecimal G(g75<? extends T> g75Var, f05<? super T, ? extends BigDecimal> f05Var) {
        c25.p(g75Var, "<this>");
        c25.p(f05Var, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = g75Var.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(f05Var.M((T) it.next()));
            c25.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @fz4(name = "sumOfBigInteger")
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <T> BigInteger H(g75<? extends T> g75Var, f05<? super T, ? extends BigInteger> f05Var) {
        c25.p(g75Var, "<this>");
        c25.p(f05Var, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = g75Var.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(f05Var.M((T) it.next()));
            c25.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> I(@NotNull g75<? extends T> g75Var) {
        c25.p(g75Var, "<this>");
        return (SortedSet) o75.a3(g75Var, new TreeSet());
    }

    @NotNull
    public static final <T> SortedSet<T> J(@NotNull g75<? extends T> g75Var, @NotNull Comparator<? super T> comparator) {
        c25.p(g75Var, "<this>");
        c25.p(comparator, "comparator");
        return (SortedSet) o75.a3(g75Var, new TreeSet(comparator));
    }

    @NotNull
    public static final <R> g75<R> u(@NotNull g75<?> g75Var, @NotNull Class<R> cls) {
        c25.p(g75Var, "<this>");
        c25.p(cls, "klass");
        g75<R> p0 = o75.p0(g75Var, new a(cls));
        c25.n(p0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return p0;
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C v(@NotNull g75<?> g75Var, @NotNull C c, @NotNull Class<R> cls) {
        c25.p(g75Var, "<this>");
        c25.p(c, "destination");
        c25.p(cls, "klass");
        for (Object obj : g75Var) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxByOrNull instead.", replaceWith = @op4(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T z(g75<? extends T> g75Var, f05<? super T, ? extends R> f05Var) {
        Iterator U = wo1.U(g75Var, "<this>", f05Var, "selector");
        if (U.hasNext()) {
            Object obj = (Object) U.next();
            if (U.hasNext()) {
                R M = f05Var.M(obj);
                Object obj2 = obj;
                do {
                    Object obj3 = (Object) U.next();
                    R M2 = f05Var.M(obj3);
                    obj = obj2;
                    if (M.compareTo(M2) < 0) {
                        M = M2;
                        obj = (Object) obj3;
                    }
                    obj2 = obj;
                } while (U.hasNext());
                return obj;
            }
            return obj;
        }
        return null;
    }
}