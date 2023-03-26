package com.p7700g.p99005;

import com.p7700g.p99005.y45;
import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Ranges.kt */
@vo4(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0005\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, d2 = {"Lkotlin/ranges/ComparableRange;", "T", "", "Lkotlin/ranges/ClosedRange;", com.anythink.expressad.foundation.d.c.bR, "endInclusive", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "getEndInclusive", "()Ljava/lang/Comparable;", "Ljava/lang/Comparable;", "getStart", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public class z45<T extends Comparable<? super T>> implements y45<T> {
    @NotNull
    private final T s;
    @NotNull
    private final T t;

    public z45(@NotNull T t, @NotNull T t2) {
        c25.p(t, com.anythink.expressad.foundation.d.c.bR);
        c25.p(t2, "endInclusive");
        this.s = t;
        this.t = t2;
    }

    @Override // com.p7700g.p99005.y45
    public boolean a(@NotNull T t) {
        return y45.a.a(this, t);
    }

    @Override // com.p7700g.p99005.y45
    @NotNull
    public T c() {
        return this.s;
    }

    @Override // com.p7700g.p99005.y45
    @NotNull
    public T d() {
        return this.t;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof z45) {
            if (!isEmpty() || !((z45) obj).isEmpty()) {
                z45 z45Var = (z45) obj;
                if (!c25.g(c(), z45Var.c()) || !c25.g(d(), z45Var.d())) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c().hashCode() * 31) + d().hashCode();
    }

    @Override // com.p7700g.p99005.y45
    public boolean isEmpty() {
        return y45.a.b(this);
    }

    @NotNull
    public String toString() {
        return c() + ".." + d();
    }
}