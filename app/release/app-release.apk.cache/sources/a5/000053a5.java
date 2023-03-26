package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: Random.kt */
@vo4(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0007\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\fH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\u0012\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0013H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0000¨\u0006\u0016"}, d2 = {"Random", "Lkotlin/random/Random;", "seed", "", "", "boundsErrorMessage", "", "from", "", "until", "checkRangeBounds", "", "", "fastLog2", "value", "nextInt", "range", "Lkotlin/ranges/IntRange;", "nextLong", "Lkotlin/ranges/LongRange;", "takeUpperBits", "bitCount", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class o45 {
    @tp4(version = "1.3")
    @NotNull
    public static final n45 a(int i) {
        return new q45(i, i >> 31);
    }

    @tp4(version = "1.3")
    @NotNull
    public static final n45 b(long j) {
        return new q45((int) j, (int) (j >> 32));
    }

    @NotNull
    public static final String c(@NotNull Object obj, @NotNull Object obj2) {
        c25.p(obj, "from");
        c25.p(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void d(double d, double d2) {
        if (!(d2 > d)) {
            throw new IllegalArgumentException(c(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    public static final void e(int i, int i2) {
        if (!(i2 > i)) {
            throw new IllegalArgumentException(c(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    public static final void f(long j, long j2) {
        if (!(j2 > j)) {
            throw new IllegalArgumentException(c(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    public static final int g(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    @tp4(version = "1.3")
    public static final int h(@NotNull n45 n45Var, @NotNull c55 c55Var) {
        c25.p(n45Var, "<this>");
        c25.p(c55Var, "range");
        if (!c55Var.isEmpty()) {
            return c55Var.h() < Integer.MAX_VALUE ? n45Var.B(c55Var.e(), c55Var.h() + 1) : c55Var.e() > Integer.MIN_VALUE ? n45Var.B(c55Var.e() - 1, c55Var.h()) + 1 : n45Var.y();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + c55Var);
    }

    @tp4(version = "1.3")
    public static final long i(@NotNull n45 n45Var, @NotNull f55 f55Var) {
        c25.p(n45Var, "<this>");
        c25.p(f55Var, "range");
        if (!f55Var.isEmpty()) {
            return f55Var.h() < Long.MAX_VALUE ? n45Var.G(f55Var.e(), f55Var.h() + 1) : f55Var.e() > Long.MIN_VALUE ? n45Var.G(f55Var.e() - 1, f55Var.h()) + 1 : n45Var.D();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + f55Var);
    }

    public static final int j(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}