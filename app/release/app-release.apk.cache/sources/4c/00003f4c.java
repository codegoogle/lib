package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* compiled from: BrittleContainsOptimization.kt */
@vo4(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000\u001a,\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0000\u001a\u0018\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0002¨\u0006\u000b"}, d2 = {"convertToSetForSetOperation", "", "T", "", "([Ljava/lang/Object;)Ljava/util/Collection;", "", "Lkotlin/sequences/Sequence;", "convertToSetForSetOperationWith", rs2.f.b, "safeToConvertToSet", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ds4 {
    @NotNull
    public static final <T> Collection<T> a(@NotNull Iterable<? extends T> iterable) {
        c25.p(iterable, "<this>");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return gs4.b ? rs4.O5(iterable) : rs4.Q5(iterable);
        }
        Collection<T> collection = (Collection) iterable;
        return e(collection) ? rs4.O5(iterable) : collection;
    }

    @NotNull
    public static final <T> Collection<T> b(@NotNull g75<? extends T> g75Var) {
        c25.p(g75Var, "<this>");
        return gs4.b ? o75.b3(g75Var) : o75.c3(g75Var);
    }

    @NotNull
    public static final <T> Collection<T> c(@NotNull T[] tArr) {
        c25.p(tArr, "<this>");
        return gs4.b ? as4.Yy(tArr) : zr4.t(tArr);
    }

    @NotNull
    public static final <T> Collection<T> d(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        c25.p(iterable, "<this>");
        c25.p(iterable2, rs2.f.b);
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return gs4.b ? rs4.O5(iterable) : rs4.Q5(iterable);
        } else if (!(iterable2 instanceof Collection) || ((Collection) iterable2).size() >= 2) {
            Collection<T> collection = (Collection) iterable;
            return e(collection) ? rs4.O5(iterable) : collection;
        } else {
            return (Collection) iterable;
        }
    }

    private static final <T> boolean e(Collection<? extends T> collection) {
        return gs4.b && collection.size() > 2 && (collection instanceof ArrayList);
    }
}