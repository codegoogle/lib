package com.p7700g.p99005;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* compiled from: _MapsJvm.kt */
@vo4(d1 = {"\u0000(\n\u0000\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ah\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0004\u0012\u0002H\u00040\bH\u0087\bø\u0001\u0000\u001ai\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000622\u0010\n\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00010\u000bj\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001`\fH\u0087\b\u001ah\u0010\r\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0004\u0012\u0002H\u00040\bH\u0087\bø\u0001\u0000\u001ah\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000622\u0010\n\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00010\u000bj\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001`\fH\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"maxBy", "", "K", bx.C4, "R", "", "", "selector", "Lkotlin/Function1;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "minBy", "minWith", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/MapsKt")
/* loaded from: classes3.dex */
public class ot4 extends nt4 {
    /* JADX WARN: Multi-variable type inference failed */
    @dx4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxByOrNull instead.", replaceWith = @op4(expression = "this.maxByOrNull(selector)", imports = {}))
    private static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> L0(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        Object obj;
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj2 = (Object) it.next();
            if (it.hasNext()) {
                R M = f05Var.M(obj2);
                Object obj3 = obj2;
                do {
                    Object obj4 = (Object) it.next();
                    R M2 = f05Var.M(obj4);
                    obj2 = obj3;
                    if (M.compareTo(M2) < 0) {
                        M = M2;
                        obj2 = (Object) obj4;
                    }
                    obj3 = obj2;
                } while (it.hasNext());
                obj = obj2;
            } else {
                obj = obj2;
            }
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    @dx4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxWithOrNull instead.", replaceWith = @op4(expression = "this.maxWithOrNull(comparator)", imports = {}))
    private static final /* synthetic */ <K, V> Map.Entry<K, V> M0(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        c25.p(map, "<this>");
        c25.p(comparator, "comparator");
        return (Map.Entry) rs4.Q3(map.entrySet(), comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minByOrNull instead.", replaceWith = @op4(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> N0(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        Object obj;
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj2 = (Object) it.next();
            if (it.hasNext()) {
                R M = f05Var.M(obj2);
                Object obj3 = obj2;
                do {
                    Object obj4 = (Object) it.next();
                    R M2 = f05Var.M(obj4);
                    obj2 = obj3;
                    if (M.compareTo(M2) > 0) {
                        M = M2;
                        obj2 = (Object) obj4;
                    }
                    obj3 = obj2;
                } while (it.hasNext());
                obj = obj2;
            } else {
                obj = obj2;
            }
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minWithOrNull instead.", replaceWith = @op4(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Map.Entry O0(Map map, Comparator comparator) {
        c25.p(map, "<this>");
        c25.p(comparator, "comparator");
        return (Map.Entry) rs4.i4(map.entrySet(), comparator);
    }
}