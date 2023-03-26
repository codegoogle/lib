package com.p7700g.p99005;

import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionsJVM.kt */
@vo4(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\t\u0010\u0000\u001a\u00020\u0001H\u0080\b\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u0001\u001a?\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\b\u001a\u00020\t2\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000\u001a\u0011\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0081\b\u001a\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0081\b\u001a\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0081\b¢\u0006\u0002\u0010\u0017\u001a4\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0013\"\u0004\b\u0000\u0010\u00182\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0013H\u0081\b¢\u0006\u0002\u0010\u001a\u001a\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006\"\u0004\b\u0000\u0010\u0004H\u0001\u001a\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006\"\u0004\b\u0000\u0010\u00042\u0006\u0010\b\u001a\u00020\tH\u0001\u001a\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0003\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u001d\u001a\u0002H\u0018¢\u0006\u0002\u0010\u001e\u001a1\u0010\u001f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0013\"\u0004\b\u0000\u0010\u0018*\n\u0012\u0006\b\u0001\u0012\u0002H\u00180\u00132\u0006\u0010 \u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010!\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0003\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180#H\u0007\u001a&\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0003\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180#2\u0006\u0010$\u001a\u00020%H\u0007\u001a\u001f\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0003\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180'H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"brittleContainsOptimizationEnabled", "", "build", "", "E", "builder", "", "buildListInternal", "capacity", "", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "checkCountOverflow", NewHtcHomeBadger.d, "checkIndexOverflow", la1.l, "copyToArrayImpl", "", "", "collection", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "T", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "createListBuilder", "listOf", "element", "(Ljava/lang/Object;)Ljava/util/List;", "copyToArrayOfAny", "isVarargs", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "shuffled", "", "random", "Ljava/util/Random;", "toList", "Ljava/util/Enumeration;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class is4 {
    public static final boolean a() {
        return gs4.b;
    }

    @np4
    @tp4(version = "1.3")
    @NotNull
    public static final <E> List<E> b(@NotNull List<E> list) {
        c25.p(list, "builder");
        return ((iu4) list).u();
    }

    @np4
    @dx4
    @tp4(version = "1.3")
    private static final <E> List<E> c(int i, f05<? super List<E>, yq4> f05Var) {
        c25.p(f05Var, "builderAction");
        List k = k(i);
        f05Var.M(k);
        return b(k);
    }

    @np4
    @dx4
    @tp4(version = "1.3")
    private static final <E> List<E> d(f05<? super List<E>, yq4> f05Var) {
        c25.p(f05Var, "builderAction");
        List j = j();
        f05Var.M(j);
        return b(j);
    }

    @np4
    @dx4
    @tp4(version = "1.3")
    private static final int e(int i) {
        if (i < 0) {
            if (kx4.a(1, 3, 0)) {
                js4.W();
            } else {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    @np4
    @dx4
    @tp4(version = "1.3")
    private static final int f(int i) {
        if (i < 0) {
            if (kx4.a(1, 3, 0)) {
                js4.X();
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        return i;
    }

    @dx4
    private static final Object[] g(Collection<?> collection) {
        c25.p(collection, "collection");
        return n15.a(collection);
    }

    @dx4
    private static final <T> T[] h(Collection<?> collection, T[] tArr) {
        c25.p(collection, "collection");
        c25.p(tArr, "array");
        T[] tArr2 = (T[]) n15.b(collection, tArr);
        c25.n(tArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt__CollectionsJVMKt.copyToArrayImpl>");
        return tArr2;
    }

    @NotNull
    public static final <T> Object[] i(@NotNull T[] tArr, boolean z) {
        c25.p(tArr, "<this>");
        if (z && c25.g(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        c25.o(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @np4
    @tp4(version = "1.3")
    @NotNull
    public static final <E> List<E> j() {
        return new iu4();
    }

    @np4
    @tp4(version = "1.3")
    @NotNull
    public static final <E> List<E> k(int i) {
        return new iu4(i);
    }

    @NotNull
    public static final <T> List<T> l(T t) {
        List<T> singletonList = Collections.singletonList(t);
        c25.o(singletonList, "singletonList(element)");
        return singletonList;
    }

    @tp4(version = "1.2")
    @NotNull
    public static final <T> List<T> m(@NotNull Iterable<? extends T> iterable) {
        c25.p(iterable, "<this>");
        List<T> S5 = rs4.S5(iterable);
        Collections.shuffle(S5);
        return S5;
    }

    @tp4(version = "1.2")
    @NotNull
    public static final <T> List<T> n(@NotNull Iterable<? extends T> iterable, @NotNull Random random) {
        c25.p(iterable, "<this>");
        c25.p(random, "random");
        List<T> S5 = rs4.S5(iterable);
        Collections.shuffle(S5, random);
        return S5;
    }

    @dx4
    private static final <T> List<T> o(Enumeration<T> enumeration) {
        c25.p(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        c25.o(list, "list(this)");
        return list;
    }
}