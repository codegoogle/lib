package com.p7700g.p99005;

import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;

/* compiled from: Range.kt */
@vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0016R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/ClosedRange;", "T", "", "", "endInclusive", "getEndInclusive", "()Ljava/lang/Comparable;", com.anythink.expressad.foundation.d.c.bR, "getStart", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface y45<T extends Comparable<? super T>> {

    /* compiled from: Range.kt */
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@NotNull y45<T> y45Var, @NotNull T t) {
            c25.p(t, "value");
            return t.compareTo(y45Var.c()) >= 0 && t.compareTo(y45Var.d()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@NotNull y45<T> y45Var) {
            return y45Var.c().compareTo(y45Var.d()) > 0;
        }
    }

    boolean a(@NotNull T t);

    @NotNull
    T c();

    @NotNull
    T d();

    boolean isEmpty();
}