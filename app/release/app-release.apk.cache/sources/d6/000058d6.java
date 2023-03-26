package com.p7700g.p99005;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;

/* compiled from: _CollectionsJvm.kt */
@vo4(d1 = {"\u0000d\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001aA\u0010\u0006\u001a\u0002H\u0007\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\b\"\u0004\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\t\u001a\u0002H\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\n\u001a)\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r*\b\u0012\u0004\u0012\u0002H\f0\u0003H\u0007¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00110\u0003H\u0007¢\u0006\u0002\u0010\u0012\u001aG\u0010\u0013\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r*\b\u0012\u0004\u0012\u0002H\f0\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a;\u0010\u0017\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00032\u001a\u0010\u0018\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\f0\u0019j\n\u0012\u0006\b\u0000\u0012\u0002H\f`\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a)\u0010\u001c\u001a\u0004\u0018\u0001H\f\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r*\b\u0012\u0004\u0012\u0002H\f0\u0003H\u0007¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00110\u0003H\u0007¢\u0006\u0002\u0010\u0012\u001aG\u0010\u001d\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r*\b\u0012\u0004\u0012\u0002H\f0\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a;\u0010\u001e\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00032\u001a\u0010\u0018\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\f0\u0019j\n\u0012\u0006\b\u0000\u0012\u0002H\f`\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a\u0016\u0010\u001f\u001a\u00020 \"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0!\u001a5\u0010\"\u001a\u00020#\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020#0\u0015H\u0087\bø\u0001\u0000¢\u0006\u0002\b$\u001a5\u0010\"\u001a\u00020%\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020%0\u0015H\u0087\bø\u0001\u0000¢\u0006\u0002\b&\u001a&\u0010'\u001a\b\u0012\u0004\u0012\u0002H\f0(\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r*\b\u0012\u0004\u0012\u0002H\f0\u0003\u001a8\u0010'\u001a\b\u0012\u0004\u0012\u0002H\f0(\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00032\u001a\u0010\u0018\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\f0\u0019j\n\u0012\u0006\b\u0000\u0012\u0002H\f`\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"filterIsInstance", "", "R", "", "klass", "Ljava/lang/Class;", "filterIsInstanceTo", "C", "", "destination", "(Ljava/lang/Iterable;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "max", "T", "", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "", "(Ljava/lang/Iterable;)Ljava/lang/Double;", "", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "maxBy", "selector", "Lkotlin/Function1;", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;", "min", "minBy", "minWith", "reverse", "", "", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class qs4 extends ps4 {
    @NotNull
    public static final <R> List<R> a1(@NotNull Iterable<?> iterable, @NotNull Class<R> cls) {
        c25.p(iterable, "<this>");
        c25.p(cls, "klass");
        return (List) b1(iterable, new ArrayList(), cls);
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C b1(@NotNull Iterable<?> iterable, @NotNull C c, @NotNull Class<R> cls) {
        c25.p(iterable, "<this>");
        c25.p(c, "destination");
        c25.p(cls, "klass");
        for (Object obj : iterable) {
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
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T f1(Iterable<? extends T> iterable, f05<? super T, ? extends R> f05Var) {
        Iterator S = wo1.S(iterable, "<this>", f05Var, "selector");
        if (S.hasNext()) {
            Object obj = (Object) S.next();
            if (S.hasNext()) {
                R M = f05Var.M(obj);
                Object obj2 = obj;
                do {
                    Object obj3 = (Object) S.next();
                    R M2 = f05Var.M(obj3);
                    obj = obj2;
                    if (M.compareTo(M2) < 0) {
                        M = M2;
                        obj = (Object) obj3;
                    }
                    obj2 = obj;
                } while (S.hasNext());
                return obj;
            }
            return obj;
        }
        return null;
    }

    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxWithOrNull instead.", replaceWith = @op4(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object g1(Iterable iterable, Comparator comparator) {
        c25.p(iterable, "<this>");
        c25.p(comparator, "comparator");
        return rs4.Q3(iterable, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minByOrNull instead.", replaceWith = @op4(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T k1(Iterable<? extends T> iterable, f05<? super T, ? extends R> f05Var) {
        Iterator S = wo1.S(iterable, "<this>", f05Var, "selector");
        if (S.hasNext()) {
            Object obj = (Object) S.next();
            if (S.hasNext()) {
                R M = f05Var.M(obj);
                Object obj2 = obj;
                do {
                    Object obj3 = (Object) S.next();
                    R M2 = f05Var.M(obj3);
                    obj = obj2;
                    if (M.compareTo(M2) > 0) {
                        M = M2;
                        obj = (Object) obj3;
                    }
                    obj2 = obj;
                } while (S.hasNext());
                return obj;
            }
            return obj;
        }
        return null;
    }

    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minWithOrNull instead.", replaceWith = @op4(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object l1(Iterable iterable, Comparator comparator) {
        c25.p(iterable, "<this>");
        c25.p(comparator, "comparator");
        return rs4.i4(iterable, comparator);
    }

    public static final <T> void m1(@NotNull List<T> list) {
        c25.p(list, "<this>");
        Collections.reverse(list);
    }

    @fz4(name = "sumOfBigDecimal")
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <T> BigDecimal n1(Iterable<? extends T> iterable, f05<? super T, ? extends BigDecimal> f05Var) {
        c25.p(iterable, "<this>");
        c25.p(f05Var, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T> BigInteger o1(Iterable<? extends T> iterable, f05<? super T, ? extends BigInteger> f05Var) {
        c25.p(iterable, "<this>");
        c25.p(f05Var, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(f05Var.M((T) it.next()));
            c25.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> p1(@NotNull Iterable<? extends T> iterable) {
        c25.p(iterable, "<this>");
        return (SortedSet) rs4.L5(iterable, new TreeSet());
    }

    @NotNull
    public static final <T> SortedSet<T> q1(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        c25.p(iterable, "<this>");
        c25.p(comparator, "comparator");
        return (SortedSet) rs4.L5(iterable, new TreeSet(comparator));
    }
}