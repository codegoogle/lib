package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.bx;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0579Cj {
    public static byte[] A03;
    public static final long[] A04;
    public int A00;
    public int A01;
    public final byte[] A02 = new byte[8];

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{0, 33, 110, 56, 47, 34, 39, bx.W5, 110, 56, 47, 60, 39, 32, 58, 110, 34, 43, 32, 41, 58, 38, 110, 35, 47, 61, 37, 110, 40, 33, 59, 32, bx.W5};
    }

    static {
        A03();
        A04 = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    }

    public static int A00(int varIntLength) {
        int i = 0;
        while (true) {
            long[] jArr = A04;
            if (i >= jArr.length) {
                return -1;
            }
            if ((jArr[i] & varIntLength) != 0) {
                int i2 = i + 1;
                return i2;
            }
            i++;
        }
    }

    public static long A01(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= A04[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = bArr[i2];
            j = (j << 8) | (i3 & 255);
        }
        return j;
    }

    public final int A04() {
        return this.A00;
    }

    public final long A05(CL cl, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            if (!cl.AC2(this.A02, 0, 1, z)) {
                return -1L;
            }
            this.A00 = A00(this.A02[0] & 255);
            if (this.A00 != -1) {
                this.A01 = 1;
            } else {
                throw new IllegalStateException(A02(0, 33, 100));
            }
        }
        int i2 = this.A00;
        if (i2 > i) {
            this.A01 = 0;
            return -2L;
        }
        if (i2 != 1) {
            cl.readFully(this.A02, 1, i2 - 1);
        }
        this.A01 = 0;
        return A01(this.A02, this.A00, z2);
    }

    public final void A06() {
        this.A01 = 0;
        this.A00 = 0;
    }
}