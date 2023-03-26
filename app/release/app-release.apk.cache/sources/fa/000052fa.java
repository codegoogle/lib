package com.p7700g.p99005;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import org.jetbrains.annotations.NotNull;

/* compiled from: MutableCollectionsJVM.kt */
@vo4(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\b\u001a!\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0087\b\u001a \u0010\t\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a6\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\r0\fH\u0087\bø\u0001\u0000\u001a5\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u000fj\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0010H\u0087\b\u001a2\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u000fj\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"fill", "", "T", "", "value", "(Ljava/util/List;Ljava/lang/Object;)V", "shuffle", "random", "Ljava/util/Random;", "sort", "", "comparison", "Lkotlin/Function2;", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "sortWith", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class ns4 extends ms4 {
    @dx4
    @tp4(version = "1.2")
    private static final <T> void h0(List<T> list, T t) {
        c25.p(list, "<this>");
        Collections.fill(list, t);
    }

    @dx4
    @tp4(version = "1.2")
    private static final <T> void i0(List<T> list) {
        c25.p(list, "<this>");
        Collections.shuffle(list);
    }

    @dx4
    @tp4(version = "1.2")
    private static final <T> void j0(List<T> list, Random random) {
        c25.p(list, "<this>");
        c25.p(random, "random");
        Collections.shuffle(list, random);
    }

    public static final <T extends Comparable<? super T>> void k0(@NotNull List<T> list) {
        c25.p(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @dx4
    @xn4(level = zn4.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @op4(expression = "this.sortWith(comparator)", imports = {}))
    private static final <T> void l0(List<T> list, Comparator<? super T> comparator) {
        c25.p(list, "<this>");
        c25.p(comparator, "comparator");
        throw new xo4(null, 1, null);
    }

    @dx4
    @xn4(level = zn4.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @op4(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    private static final <T> void m0(List<T> list, j05<? super T, ? super T, Integer> j05Var) {
        c25.p(list, "<this>");
        c25.p(j05Var, "comparison");
        throw new xo4(null, 1, null);
    }

    public static final <T> void n0(@NotNull List<T> list, @NotNull Comparator<? super T> comparator) {
        c25.p(list, "<this>");
        c25.p(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}