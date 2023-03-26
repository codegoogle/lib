package com.p7700g.p99005;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* compiled from: _Sets.kt */
@vo4(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004¨\u0006\r"}, d2 = {"minus", "", "T", "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "elements", "", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/sequences/Sequence;", "minusElement", "plus", "plusElement", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/SetsKt")
/* loaded from: classes3.dex */
public class zt4 extends yt4 {
    @NotNull
    public static final <T> Set<T> A(@NotNull Set<? extends T> set, @NotNull T[] tArr) {
        c25.p(set, "<this>");
        c25.p(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        os4.H0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @dx4
    private static final <T> Set<T> B(Set<? extends T> set, T t) {
        c25.p(set, "<this>");
        return y(set, t);
    }

    @NotNull
    public static final <T> Set<T> C(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        int size;
        c25.p(set, "<this>");
        c25.p(iterable, "elements");
        Integer a0 = ks4.a0(iterable);
        if (a0 != null) {
            size = set.size() + a0.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(mt4.j(size));
        linkedHashSet.addAll(set);
        os4.o0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> D(@NotNull Set<? extends T> set, T t) {
        c25.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(mt4.j(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> E(@NotNull Set<? extends T> set, @NotNull g75<? extends T> g75Var) {
        c25.p(set, "<this>");
        c25.p(g75Var, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(mt4.j(set.size() * 2));
        linkedHashSet.addAll(set);
        os4.p0(linkedHashSet, g75Var);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> F(@NotNull Set<? extends T> set, @NotNull T[] tArr) {
        c25.p(set, "<this>");
        c25.p(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(mt4.j(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        os4.q0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @dx4
    private static final <T> Set<T> G(Set<? extends T> set, T t) {
        c25.p(set, "<this>");
        return D(set, t);
    }

    @NotNull
    public static final <T> Set<T> x(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        c25.p(set, "<this>");
        c25.p(iterable, "elements");
        Collection<?> d = ds4.d(iterable, set);
        if (d.isEmpty()) {
            return rs4.V5(set);
        }
        if (d instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : set) {
                if (!d.contains(t)) {
                    linkedHashSet.add(t);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(d);
        return linkedHashSet2;
    }

    @NotNull
    public static final <T> Set<T> y(@NotNull Set<? extends T> set, T t) {
        c25.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(mt4.j(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && c25.g(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> z(@NotNull Set<? extends T> set, @NotNull g75<? extends T> g75Var) {
        c25.p(set, "<this>");
        c25.p(g75Var, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        os4.G0(linkedHashSet, g75Var);
        return linkedHashSet;
    }
}