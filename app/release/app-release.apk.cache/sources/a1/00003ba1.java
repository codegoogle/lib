package com.p7700g.p99005;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: Grouping.kt */
@vo4(d1 = {"\u0000@\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u009e\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\bø\u0001\u0000\u001a·\u0001\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aI\u0010\u0014\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0016\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00150\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u0010H\u0007¢\u0006\u0002\u0010\u0016\u001a¿\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u000526\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00192K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u001aH\u0087\bø\u0001\u0000\u001a\u007f\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u001b\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0019H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001aØ\u0001\u0010\u001d\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u001026\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00192K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u001aH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a\u0093\u0001\u0010\u001d\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102\u0006\u0010\u001b\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0019H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001f\u001a\u008b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0001\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0004*\u0002H!\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H!¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H!0\u001aH\u0087\bø\u0001\u0000\u001a¤\u0001\u0010\"\u001a\u0002H\u0010\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0004*\u0002H!\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H!¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H!0\u001aH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"aggregate", "", "K", "R", "T", "Lkotlin/collections/Grouping;", "operation", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "key", "accumulator", "element", "", "first", "aggregateTo", "M", "", "destination", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)Ljava/util/Map;", "eachCountTo", "", "(Lkotlin/collections/Grouping;Ljava/util/Map;)Ljava/util/Map;", "fold", "initialValueSelector", "Lkotlin/Function2;", "Lkotlin/Function3;", "initialValue", "(Lkotlin/collections/Grouping;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "foldTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "(Lkotlin/collections/Grouping;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "reduce", "S", "reduceTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/GroupingKt")
/* loaded from: classes3.dex */
public class bt4 extends at4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @tp4(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> c(@NotNull ys4<T, ? extends K> ys4Var, @NotNull l05<? super K, ? super R, ? super T, ? super Boolean, ? extends R> l05Var) {
        c25.p(ys4Var, "<this>");
        c25.p(l05Var, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b = ys4Var.b();
        while (b.hasNext()) {
            ?? next = b.next();
            Object obj = (K) ys4Var.a(next);
            Object obj2 = (Object) linkedHashMap.get(obj);
            linkedHashMap.put(obj, l05Var.Z(obj, obj2, next, Boolean.valueOf(obj2 == 0 && !linkedHashMap.containsKey(obj))));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @tp4(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M d(@NotNull ys4<T, ? extends K> ys4Var, @NotNull M m, @NotNull l05<? super K, ? super R, ? super T, ? super Boolean, ? extends R> l05Var) {
        c25.p(ys4Var, "<this>");
        c25.p(m, "destination");
        c25.p(l05Var, "operation");
        Iterator<T> b = ys4Var.b();
        while (b.hasNext()) {
            ?? next = b.next();
            Object a = ys4Var.a(next);
            Object obj = (Object) m.get(a);
            m.put(a, l05Var.Z(a, obj, next, Boolean.valueOf(obj == 0 && !m.containsKey(a))));
        }
        return m;
    }

    @tp4(version = "1.1")
    @NotNull
    public static final <T, K, M extends Map<? super K, Integer>> M e(@NotNull ys4<T, ? extends K> ys4Var, @NotNull M m) {
        c25.p(ys4Var, "<this>");
        c25.p(m, "destination");
        Iterator<T> b = ys4Var.b();
        while (b.hasNext()) {
            K a = ys4Var.a(b.next());
            Object obj = m.get(a);
            if (obj == null && !m.containsKey(a)) {
                obj = 0;
            }
            m.put(a, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @tp4(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> f(@NotNull ys4<T, ? extends K> ys4Var, R r, @NotNull j05<? super R, ? super T, ? extends R> j05Var) {
        c25.p(ys4Var, "<this>");
        c25.p(j05Var, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b = ys4Var.b();
        while (b.hasNext()) {
            ?? next = b.next();
            K a = ys4Var.a(next);
            Object obj = (Object) linkedHashMap.get(a);
            if (obj == null && !linkedHashMap.containsKey(a)) {
                obj = (Object) r;
            }
            linkedHashMap.put(a, j05Var.w3(obj, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @tp4(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> g(@NotNull ys4<T, ? extends K> ys4Var, @NotNull j05<? super K, ? super T, ? extends R> j05Var, @NotNull k05<? super K, ? super R, ? super T, ? extends R> k05Var) {
        c25.p(ys4Var, "<this>");
        c25.p(j05Var, "initialValueSelector");
        c25.p(k05Var, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b = ys4Var.b();
        while (b.hasNext()) {
            ?? next = b.next();
            Object obj = (K) ys4Var.a(next);
            R r = (Object) linkedHashMap.get(obj);
            if (r == null && !linkedHashMap.containsKey(obj)) {
                r = j05Var.w3(obj, next);
            }
            linkedHashMap.put(obj, k05Var.I(obj, r, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @tp4(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M h(@NotNull ys4<T, ? extends K> ys4Var, @NotNull M m, R r, @NotNull j05<? super R, ? super T, ? extends R> j05Var) {
        c25.p(ys4Var, "<this>");
        c25.p(m, "destination");
        c25.p(j05Var, "operation");
        Iterator<T> b = ys4Var.b();
        while (b.hasNext()) {
            ?? next = b.next();
            K a = ys4Var.a(next);
            Object obj = (Object) m.get(a);
            if (obj == null && !m.containsKey(a)) {
                obj = (Object) r;
            }
            m.put(a, j05Var.w3(obj, next));
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @tp4(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M i(@NotNull ys4<T, ? extends K> ys4Var, @NotNull M m, @NotNull j05<? super K, ? super T, ? extends R> j05Var, @NotNull k05<? super K, ? super R, ? super T, ? extends R> k05Var) {
        c25.p(ys4Var, "<this>");
        c25.p(m, "destination");
        c25.p(j05Var, "initialValueSelector");
        c25.p(k05Var, "operation");
        Iterator<T> b = ys4Var.b();
        while (b.hasNext()) {
            ?? next = b.next();
            Object a = ys4Var.a(next);
            R r = (Object) m.get(a);
            if (r == null && !m.containsKey(a)) {
                r = j05Var.w3(a, next);
            }
            m.put(a, k05Var.I(a, r, next));
        }
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @tp4(version = "1.1")
    @NotNull
    public static final <S, T extends S, K> Map<K, S> j(@NotNull ys4<T, ? extends K> ys4Var, @NotNull k05<? super K, ? super S, ? super T, ? extends S> k05Var) {
        c25.p(ys4Var, "<this>");
        c25.p(k05Var, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b = ys4Var.b();
        while (b.hasNext()) {
            S s = (Object) b.next();
            Object obj = (Object) ys4Var.a(s);
            Object obj2 = (Object) linkedHashMap.get(obj);
            if (!(obj2 == 0 && !linkedHashMap.containsKey(obj))) {
                s = k05Var.I(obj, obj2, s);
            }
            linkedHashMap.put(obj, s);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @tp4(version = "1.1")
    @NotNull
    public static final <S, T extends S, K, M extends Map<? super K, S>> M k(@NotNull ys4<T, ? extends K> ys4Var, @NotNull M m, @NotNull k05<? super K, ? super S, ? super T, ? extends S> k05Var) {
        c25.p(ys4Var, "<this>");
        c25.p(m, "destination");
        c25.p(k05Var, "operation");
        Iterator b = ys4Var.b();
        while (b.hasNext()) {
            S s = (Object) b.next();
            Object obj = (Object) ys4Var.a(s);
            Object obj2 = (Object) m.get(obj);
            if (!(obj2 == 0 && !m.containsKey(obj))) {
                s = k05Var.I(obj, obj2, s);
            }
            m.put(obj, s);
        }
        return m;
    }
}