package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: UnsignedUtils.kt */
@fz4(name = "UnsignedKt")
@vo4(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001\u001a\"\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0001\u001a\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\"\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0013H\u0001\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0013H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tH\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"doubleToUInt", "Lkotlin/UInt;", com.ironsource.sdk.controller.v.a, "", "(D)I", "doubleToULong", "Lkotlin/ULong;", "(D)J", "uintCompare", "", "v1", qh3.x, "uintDivide", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "uintToDouble", "ulongCompare", "", "ulongDivide", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToDouble", "ulongToString", "", "base", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class br4 {
    @np4
    public static final int a(double d) {
        if (!Double.isNaN(d) && d > f(0)) {
            if (d >= f(-1)) {
                return -1;
            }
            if (d <= 2.147483647E9d) {
                return jq4.h((int) d);
            }
            return jq4.h(jq4.h(Integer.MAX_VALUE) + jq4.h((int) (d - Integer.MAX_VALUE)));
        }
        return 0;
    }

    @np4
    public static final long b(double d) {
        if (!Double.isNaN(d) && d > j(0L)) {
            if (d >= j(-1L)) {
                return -1L;
            }
            if (d < 9.223372036854776E18d) {
                return nq4.h((long) d);
            }
            return nq4.h(nq4.h((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
        }
        return 0L;
    }

    @np4
    public static final int c(int i, int i2) {
        return c25.t(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    @np4
    public static final int d(int i, int i2) {
        return jq4.h((int) ((i & 4294967295L) / (i2 & 4294967295L)));
    }

    @np4
    public static final int e(int i, int i2) {
        return jq4.h((int) ((i & 4294967295L) % (i2 & 4294967295L)));
    }

    @np4
    public static final double f(int i) {
        return (((i >>> 31) << 30) * 2) + (Integer.MAX_VALUE & i);
    }

    @np4
    public static final int g(long j, long j2) {
        return c25.u(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    @np4
    public static final long h(long j, long j2) {
        if (j2 < 0) {
            return g(j, j2) < 0 ? nq4.h(0L) : nq4.h(1L);
        } else if (j >= 0) {
            return nq4.h(j / j2);
        } else {
            long j3 = ((j >>> 1) / j2) << 1;
            return nq4.h(j3 + (g(nq4.h(j - (j3 * j2)), nq4.h(j2)) < 0 ? 0 : 1));
        }
    }

    @np4
    public static final long i(long j, long j2) {
        if (j2 < 0) {
            return g(j, j2) < 0 ? j : nq4.h(j - j2);
        } else if (j >= 0) {
            return nq4.h(j % j2);
        } else {
            long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
            if (g(nq4.h(j3), nq4.h(j2)) < 0) {
                j2 = 0;
            }
            return nq4.h(j3 - j2);
        }
    }

    @np4
    public static final double j(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    @NotNull
    public static final String k(long j) {
        return l(j, 10);
    }

    @NotNull
    public static final String l(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, d85.a(i));
            c25.o(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String l2 = Long.toString(j3, d85.a(i));
        c25.o(l2, "toString(this, checkRadix(radix))");
        sb.append(l2);
        String l3 = Long.toString(j4, d85.a(i));
        c25.o(l3, "toString(this, checkRadix(radix))");
        sb.append(l3);
        return sb.toString();
    }
}