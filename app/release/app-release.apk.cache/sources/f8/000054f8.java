package com.p7700g.p99005;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MutableCollections.kt */
@vo4(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a9\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u000e\u001a9\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u000e\u001a(\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0013\u001a.\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0087\n\u001a)\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\n\u001a(\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0013\u001a.\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0087\n\u001a)\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\n\u001a-\u0010\u0016\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0017*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0018\u001a&\u0010\u0016\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0087\b¢\u0006\u0002\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010\u001c\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0017*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001dH\u0087\b\u001a*\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a*\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a\u001d\u0010\u001e\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010 \u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001f\u001a\u001d\u0010!\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010\"\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001f\u001a-\u0010#\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010#\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010#\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010#\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0017*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001dH\u0087\b\u001a*\u0010#\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a*\u0010#\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a\u0015\u0010$\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0002\b%¨\u0006&"}, d2 = {"addAll", "", "T", "", "elements", "", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "filterInPlace", "", "predicate", "Lkotlin/Function1;", "predicateResultToRemove", "filterInPlace$CollectionsKt__MutableCollectionsKt", "", "minusAssign", "", "element", "(Ljava/util/Collection;Ljava/lang/Object;)V", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "plusAssign", la1.b, "Lkotlin/internal/OnlyInputTypes;", "(Ljava/util/Collection;Ljava/lang/Object;)Z", la1.l, "", "(Ljava/util/List;I)Ljava/lang/Object;", "removeAll", "", "removeFirst", "(Ljava/util/List;)Ljava/lang/Object;", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "retainNothing", "retainNothing$CollectionsKt__MutableCollectionsKt", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class os4 extends ns4 {
    @dx4
    private static final <T> void A0(Collection<? super T> collection, T[] tArr) {
        c25.p(collection, "<this>");
        c25.p(tArr, "elements");
        q0(collection, tArr);
    }

    @dx4
    @xn4(level = zn4.ERROR, message = "Use removeAt(index) instead.", replaceWith = @op4(expression = "removeAt(index)", imports = {}))
    private static final <T> T B0(List<T> list, int i) {
        c25.p(list, "<this>");
        return list.remove(i);
    }

    @dx4
    private static final <T> boolean C0(Collection<? extends T> collection, T t) {
        c25.p(collection, "<this>");
        return k35.a(collection).remove(t);
    }

    public static final <T> boolean D0(@NotNull Iterable<? extends T> iterable, @NotNull f05<? super T, Boolean> f05Var) {
        c25.p(iterable, "<this>");
        c25.p(f05Var, "predicate");
        return r0(iterable, f05Var, true);
    }

    public static final <T> boolean E0(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        c25.p(collection, "<this>");
        c25.p(iterable, "elements");
        return k35.a(collection).removeAll(ds4.d(iterable, collection));
    }

    @dx4
    private static final <T> boolean F0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        c25.p(collection, "<this>");
        c25.p(collection2, "elements");
        return k35.a(collection).removeAll(collection2);
    }

    public static final <T> boolean G0(@NotNull Collection<? super T> collection, @NotNull g75<? extends T> g75Var) {
        c25.p(collection, "<this>");
        c25.p(g75Var, "elements");
        Collection<?> b = ds4.b(g75Var);
        return (b.isEmpty() ^ true) && collection.removeAll(b);
    }

    public static final <T> boolean H0(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        c25.p(collection, "<this>");
        c25.p(tArr, "elements");
        return ((tArr.length == 0) ^ true) && collection.removeAll(ds4.c(tArr));
    }

    public static final <T> boolean I0(@NotNull List<T> list, @NotNull f05<? super T, Boolean> f05Var) {
        c25.p(list, "<this>");
        c25.p(f05Var, "predicate");
        return s0(list, f05Var, true);
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    public static final <T> T J0(@NotNull List<T> list) {
        c25.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    @Nullable
    public static final <T> T K0(@NotNull List<T> list) {
        c25.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    public static final <T> T L0(@NotNull List<T> list) {
        c25.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(js4.H(list));
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    @Nullable
    public static final <T> T M0(@NotNull List<T> list) {
        c25.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(js4.H(list));
    }

    public static final <T> boolean N0(@NotNull Iterable<? extends T> iterable, @NotNull f05<? super T, Boolean> f05Var) {
        c25.p(iterable, "<this>");
        c25.p(f05Var, "predicate");
        return r0(iterable, f05Var, false);
    }

    public static final <T> boolean O0(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        c25.p(collection, "<this>");
        c25.p(iterable, "elements");
        return k35.a(collection).retainAll(ds4.d(iterable, collection));
    }

    @dx4
    private static final <T> boolean P0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        c25.p(collection, "<this>");
        c25.p(collection2, "elements");
        return k35.a(collection).retainAll(collection2);
    }

    public static final <T> boolean Q0(@NotNull Collection<? super T> collection, @NotNull g75<? extends T> g75Var) {
        c25.p(collection, "<this>");
        c25.p(g75Var, "elements");
        Collection<?> b = ds4.b(g75Var);
        if (!b.isEmpty()) {
            return collection.retainAll(b);
        }
        return T0(collection);
    }

    public static final <T> boolean R0(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        c25.p(collection, "<this>");
        c25.p(tArr, "elements");
        if (!(tArr.length == 0)) {
            return collection.retainAll(ds4.c(tArr));
        }
        return T0(collection);
    }

    public static final <T> boolean S0(@NotNull List<T> list, @NotNull f05<? super T, Boolean> f05Var) {
        c25.p(list, "<this>");
        c25.p(f05Var, "predicate");
        return s0(list, f05Var, false);
    }

    private static final boolean T0(Collection<?> collection) {
        boolean z = !collection.isEmpty();
        collection.clear();
        return z;
    }

    public static final <T> boolean o0(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        c25.p(collection, "<this>");
        c25.p(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean p0(@NotNull Collection<? super T> collection, @NotNull g75<? extends T> g75Var) {
        c25.p(collection, "<this>");
        c25.p(g75Var, "elements");
        Iterator<? extends T> it = g75Var.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean q0(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        c25.p(collection, "<this>");
        c25.p(tArr, "elements");
        return collection.addAll(zr4.t(tArr));
    }

    private static final <T> boolean r0(Iterable<? extends T> iterable, f05<? super T, Boolean> f05Var, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (f05Var.M((T) it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    private static final <T> boolean s0(List<T> list, f05<? super T, Boolean> f05Var, boolean z) {
        if (!(list instanceof RandomAccess)) {
            c25.n(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return r0(k35.c(list), f05Var, z);
        }
        ft4 it = new c55(0, js4.H(list)).iterator();
        int i = 0;
        while (it.hasNext()) {
            int b = it.b();
            T t = list.get(b);
            if (f05Var.M(t).booleanValue() != z) {
                if (i != b) {
                    list.set(i, t);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int H = js4.H(list);
        if (i > H) {
            return true;
        }
        while (true) {
            list.remove(H);
            if (H == i) {
                return true;
            }
            H--;
        }
    }

    @dx4
    private static final <T> void t0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        c25.p(collection, "<this>");
        c25.p(iterable, "elements");
        E0(collection, iterable);
    }

    @dx4
    private static final <T> void u0(Collection<? super T> collection, T t) {
        c25.p(collection, "<this>");
        collection.remove(t);
    }

    @dx4
    private static final <T> void v0(Collection<? super T> collection, g75<? extends T> g75Var) {
        c25.p(collection, "<this>");
        c25.p(g75Var, "elements");
        G0(collection, g75Var);
    }

    @dx4
    private static final <T> void w0(Collection<? super T> collection, T[] tArr) {
        c25.p(collection, "<this>");
        c25.p(tArr, "elements");
        H0(collection, tArr);
    }

    @dx4
    private static final <T> void x0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        c25.p(collection, "<this>");
        c25.p(iterable, "elements");
        o0(collection, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dx4
    private static final <T> void y0(Collection<? super T> collection, T t) {
        c25.p(collection, "<this>");
        collection.add(t);
    }

    @dx4
    private static final <T> void z0(Collection<? super T> collection, g75<? extends T> g75Var) {
        c25.p(collection, "<this>");
        c25.p(g75Var, "elements");
        p0(collection, g75Var);
    }
}