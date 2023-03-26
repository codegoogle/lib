package com.p7700g.p99005;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReversedViews.kt */
@vo4(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\b\u001a\u001d\u0010\t\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"asReversed", "", "T", "", "asReversedMutable", "reverseElementIndex", "", la1.l, "reverseElementIndex$CollectionsKt__ReversedViewsKt", "reversePositionIndex", "reversePositionIndex$CollectionsKt__ReversedViewsKt", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class ps4 extends os4 {
    @NotNull
    public static final <T> List<T> W0(@NotNull List<? extends T> list) {
        c25.p(list, "<this>");
        return new ut4(list);
    }

    @fz4(name = "asReversedMutable")
    @NotNull
    public static final <T> List<T> X0(@NotNull List<T> list) {
        c25.p(list, "<this>");
        return new tt4(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Y0(List<?> list, int i) {
        if (new c55(0, js4.H(list)).o(i)) {
            return js4.H(list) - i;
        }
        StringBuilder H = wo1.H("Element index ", i, " must be in range [");
        H.append(new c55(0, js4.H(list)));
        H.append("].");
        throw new IndexOutOfBoundsException(H.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Z0(List<?> list, int i) {
        if (new c55(0, list.size()).o(i)) {
            return list.size() - i;
        }
        StringBuilder H = wo1.H("Position index ", i, " must be in range [");
        H.append(new c55(0, list.size()));
        H.append("].");
        throw new IndexOutOfBoundsException(H.toString());
    }
}