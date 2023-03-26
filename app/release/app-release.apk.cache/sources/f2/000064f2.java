package com.p7700g.p99005;

import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;

/* compiled from: Ranges.kt */
@vo4(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/ranges/ClosedFloatingPointRange;", "T", "", "Lkotlin/ranges/ClosedRange;", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "lessThanOrEquals", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.1")
/* loaded from: classes3.dex */
public interface x45<T extends Comparable<? super T>> extends y45<T> {

    /* compiled from: Ranges.kt */
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@NotNull x45<T> x45Var, @NotNull T t) {
            c25.p(t, "value");
            return x45Var.b(x45Var.c(), t) && x45Var.b(t, x45Var.d());
        }

        public static <T extends Comparable<? super T>> boolean b(@NotNull x45<T> x45Var) {
            return !x45Var.b(x45Var.c(), x45Var.d());
        }
    }

    @Override // com.p7700g.p99005.y45
    boolean a(@NotNull T t);

    boolean b(@NotNull T t, @NotNull T t2);

    @Override // com.p7700g.p99005.y45
    boolean isEmpty();
}