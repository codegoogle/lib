package com.p7700g.p99005;

/* compiled from: UProgressionUtil.kt */
@vo4(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", com.anythink.expressad.foundation.d.c.bR, "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class px4 {
    private static final int a(int i, int i2, int i3) {
        int e = br4.e(i, i3);
        int e2 = br4.e(i2, i3);
        int c = br4.c(e, e2);
        int h = jq4.h(e - e2);
        return c >= 0 ? h : jq4.h(h + i3);
    }

    private static final long b(long j, long j2, long j3) {
        long i = br4.i(j, j3);
        long i2 = br4.i(j2, j3);
        int g = br4.g(i, i2);
        long h = nq4.h(i - i2);
        return g >= 0 ? h : nq4.h(h + j3);
    }

    @np4
    @tp4(version = "1.3")
    public static final long c(long j, long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            return br4.g(j, j2) >= 0 ? j2 : nq4.h(j2 - b(j2, j, nq4.h(j3)));
        } else if (i < 0) {
            return br4.g(j, j2) <= 0 ? j2 : nq4.h(j2 + b(j, j2, nq4.h(-j3)));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @np4
    @tp4(version = "1.3")
    public static final int d(int i, int i2, int i3) {
        if (i3 > 0) {
            return br4.c(i, i2) >= 0 ? i2 : jq4.h(i2 - a(i2, i, jq4.h(i3)));
        } else if (i3 < 0) {
            return br4.c(i, i2) <= 0 ? i2 : jq4.h(i2 + a(i, i2, jq4.h(-i3)));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}