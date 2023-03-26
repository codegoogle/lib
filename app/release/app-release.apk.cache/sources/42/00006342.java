package com.p7700g.p99005;

import com.p7700g.p99005.o95;

/* compiled from: longSaturatedMath.kt */
@vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u001a \u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"checkInfiniteSumDefined", "", "longNs", "duration", "Lkotlin/time/Duration;", "durationNs", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAdd", "saturatingAdd-pTJri5U", "(JJ)J", "saturatingAddInHalves", "saturatingAddInHalves-pTJri5U", "saturatingDiff", "valueNs", "originNs", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class w95 {
    private static final long a(long j, long j2, long j3) {
        if (!o95.w0(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    public static final long b(long j, long j2) {
        long L = o95.L(j2);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return a(j, j2, L);
        }
        if ((1 | (L - 1)) == Long.MAX_VALUE) {
            return c(j, j2);
        }
        long j3 = j + L;
        return ((j ^ j3) & (L ^ j3)) < 0 ? j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j3;
    }

    private static final long c(long j, long j2) {
        long l = o95.l(j2, 2);
        if (((o95.L(l) - 1) | 1) == Long.MAX_VALUE) {
            return (long) (o95.w1(j2, r95.NANOSECONDS) + j);
        }
        return b(b(j, l), l);
    }

    public static final long d(long j, long j2) {
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            return o95.T1(q95.n0(j2, r95.DAYS));
        }
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            long j4 = (long) q95.a;
            long j5 = (j % j4) - (j2 % j4);
            o95.a aVar = o95.s;
            return o95.a1(q95.n0((j / j4) - (j2 / j4), r95.MILLISECONDS), q95.n0(j5, r95.NANOSECONDS));
        }
        o95.a aVar2 = o95.s;
        return q95.n0(j3, r95.NANOSECONDS);
    }
}