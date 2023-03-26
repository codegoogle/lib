package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.util.Range;
import com.p7700g.p99005.y45;
import org.jetbrains.annotations.NotNull;

/* compiled from: Range.kt */
@vo4(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\f\u001a6\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0007\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\n\u001a0\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u0002H\u00022\u0006\u0010\t\u001a\u0002H\u0002H\u0087\f¢\u0006\u0002\u0010\n\u001a(\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0007¨\u0006\u000e"}, d2 = {"and", "Landroid/util/Range;", "T", "", "other", "plus", "value", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "rangeTo", "that", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "toClosedRange", "Lkotlin/ranges/ClosedRange;", "toRange", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class lp {

    /* compiled from: Range.kt */
    @vo4(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u001c\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00018\u00008\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00018\u00008\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"androidx/core/util/RangeKt$toClosedRange$1", "Lkotlin/ranges/ClosedRange;", "endInclusive", "kotlin.jvm.PlatformType", "getEndInclusive", "()Ljava/lang/Comparable;", com.anythink.expressad.foundation.d.c.bR, "getStart", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements y45<T> {
        public final /* synthetic */ Range<T> s;

        public a(Range<T> range) {
            this.s = range;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // com.p7700g.p99005.y45
        public boolean a(@NotNull Comparable comparable) {
            return y45.a.a(this, comparable);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // com.p7700g.p99005.y45
        public Comparable c() {
            return this.s.getLower();
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // com.p7700g.p99005.y45
        public Comparable d() {
            return this.s.getUpper();
        }

        @Override // com.p7700g.p99005.y45
        public boolean isEmpty() {
            return y45.a.b(this);
        }
    }

    @e2(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> a(@NotNull Range<T> range, @NotNull Range<T> range2) {
        c25.p(range, "<this>");
        c25.p(range2, "other");
        Range<T> intersect = range.intersect(range2);
        c25.o(intersect, "intersect(other)");
        return intersect;
    }

    @e2(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> b(@NotNull Range<T> range, @NotNull Range<T> range2) {
        c25.p(range, "<this>");
        c25.p(range2, "other");
        Range<T> extend = range.extend(range2);
        c25.o(extend, "extend(other)");
        return extend;
    }

    @e2(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> c(@NotNull Range<T> range, @NotNull T t) {
        c25.p(range, "<this>");
        c25.p(t, "value");
        Range<T> extend = range.extend((Range<T>) t);
        c25.o(extend, "extend(value)");
        return extend;
    }

    @e2(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> d(@NotNull T t, @NotNull T t2) {
        c25.p(t, "<this>");
        c25.p(t2, "that");
        return new Range<>(t, t2);
    }

    @e2(21)
    @NotNull
    public static final <T extends Comparable<? super T>> y45<T> e(@NotNull Range<T> range) {
        c25.p(range, "<this>");
        return new a(range);
    }

    @e2(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> f(@NotNull y45<T> y45Var) {
        c25.p(y45Var, "<this>");
        return new Range<>(y45Var.c(), y45Var.d());
    }
}