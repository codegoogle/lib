package com.p7700g.p99005;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: Iterators.kt */
@vo4(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\bø\u0001\u0000\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\n\u001a\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b0\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"forEach", "", "T", "", "operation", "Lkotlin/Function1;", "iterator", "withIndex", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class ms4 extends ls4 {
    public static final <T> void e0(@NotNull Iterator<? extends T> it, @NotNull f05<? super T, yq4> f05Var) {
        c25.p(it, "<this>");
        c25.p(f05Var, "operation");
        while (it.hasNext()) {
            f05Var.M((T) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dx4
    private static final <T> Iterator<T> f0(Iterator<? extends T> it) {
        c25.p(it, "<this>");
        return it;
    }

    @NotNull
    public static final <T> Iterator<ct4<T>> g0(@NotNull Iterator<? extends T> it) {
        c25.p(it, "<this>");
        return new et4(it);
    }
}