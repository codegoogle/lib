package com.p7700g.p99005;

import com.p7700g.p99005.b35;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: GroupingJVM.kt */
@vo4(d1 = {"\u0000&\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\u001a0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u0005H\u0007\u001aZ\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\b*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\u00072\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\f\u0012\u0004\u0012\u0002H\b0\u000bH\u0081\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"eachCount", "", "K", "", "T", "Lkotlin/collections/Grouping;", "mapValuesInPlace", "", "R", bx.C4, "f", "Lkotlin/Function1;", "", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/GroupingKt")
/* loaded from: classes3.dex */
public class at4 {
    @tp4(version = "1.1")
    @NotNull
    public static final <T, K> Map<K, Integer> a(@NotNull ys4<T, ? extends K> ys4Var) {
        c25.p(ys4Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b = ys4Var.b();
        while (b.hasNext()) {
            K a = ys4Var.a(b.next());
            Object obj = linkedHashMap.get(a);
            if (obj == null && !linkedHashMap.containsKey(a)) {
                obj = new b35.f();
            }
            b35.f fVar = (b35.f) obj;
            fVar.s++;
            linkedHashMap.put(a, fVar);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            c25.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4>");
            k35.m(entry).setValue(Integer.valueOf(((b35.f) entry.getValue()).s));
        }
        return k35.k(linkedHashMap);
    }

    @np4
    @dx4
    private static final <K, V, R> Map<K, R> b(Map<K, V> map, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "f");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c25.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4>");
            k35.m(entry).setValue(f05Var.M(entry));
        }
        return k35.k(map);
    }
}