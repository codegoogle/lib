package com.facebook.ads.redexgen.X;

import android.util.Pair;

/* renamed from: com.facebook.ads.redexgen.X.Aj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0536Aj {
    public static String[] A00;
    public static final AbstractC0536Aj A01;

    public static void A00() {
        A00 = new String[]{"jU13W9NSebta1ZmimveRwiImSwvynw8G", "bR9yhpeYgYLfxjGn405sIF1CLUaNKRNv", "y6GS60dgSiOKDJGhj3wt9T6pcdF3KRzS", "kAdv6lw0fV2hZ8Ef8nLl5eDcrpXJ", "gDoO0sRHxUPo6SrSL989dqr7yWBZykVP", "xoqdGlgoaRmw7wZuwViSR5WxyeJjGGpo", "tn8QhSSQsmhaZqBgPW05rXLjjsf9pF2E", "LT5aPkpwV7"};
    }

    public abstract int A01();

    public abstract int A02();

    public abstract int A05(Object obj);

    public abstract C0534Ah A0B(int i, C0534Ah c0534Ah, boolean z);

    public abstract C0535Ai A0E(int i, C0535Ai c0535Ai, boolean z, long j);

    static {
        A00();
        A01 = new C1107Xi();
    }

    public int A03(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == A07(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == A07(z) ? A06(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public final int A04(int nextWindowIndex, C0534Ah c0534Ah, C0535Ai c0535Ai, int i, boolean z) {
        int i2 = A0A(nextWindowIndex, c0534Ah).A00;
        if (A0C(i2, c0535Ai).A01 == nextWindowIndex) {
            int A03 = A03(i2, i, z);
            if (A03 == -1) {
                return -1;
            }
            return A0C(A03, c0535Ai).A00;
        }
        return nextWindowIndex + 1;
    }

    public int A06(boolean z) {
        return A0F() ? -1 : 0;
    }

    public int A07(boolean z) {
        if (A0F()) {
            return -1;
        }
        return A02() - 1;
    }

    public final Pair<Integer, Long> A08(C0535Ai c0535Ai, C0534Ah c0534Ah, int i, long j) {
        return A09(c0535Ai, c0534Ah, i, j, 0L);
    }

    public final Pair<Integer, Long> A09(C0535Ai c0535Ai, C0534Ah c0534Ah, int i, long j, long j2) {
        I1.A00(i, 0, A02());
        A0E(i, c0535Ai, false, j2);
        if (j == -9223372036854775807L) {
            j = c0535Ai.A01();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c0535Ai.A00;
        long A03 = c0535Ai.A03() + j;
        long A07 = A0A(i2, c0534Ah).A07();
        while (A07 != -9223372036854775807L) {
            int i3 = (A03 > A07 ? 1 : (A03 == A07 ? 0 : -1));
            if (A00[7].length() == 24) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "t4u2YUU8OEdoMFYJ2jQWzxX4wha";
            strArr[7] = "t4u2YUU8OEdoMFYJ2jQWzxX4wha";
            if (i3 < 0 || i2 >= c0535Ai.A01) {
                break;
            }
            A03 -= A07;
            i2++;
            A07 = A0A(i2, c0534Ah).A07();
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(A03));
    }

    public final C0534Ah A0A(int i, C0534Ah c0534Ah) {
        return A0B(i, c0534Ah, false);
    }

    public final C0535Ai A0C(int i, C0535Ai c0535Ai) {
        return A0D(i, c0535Ai, false);
    }

    public final C0535Ai A0D(int i, C0535Ai c0535Ai, boolean z) {
        return A0E(i, c0535Ai, z, 0L);
    }

    public final boolean A0F() {
        return A02() == 0;
    }

    public final boolean A0G(int i, C0534Ah c0534Ah, C0535Ai c0535Ai, int i2, boolean z) {
        return A04(i, c0534Ah, c0535Ai, i2, z) == -1;
    }
}