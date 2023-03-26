package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Cu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0590Cu {
    public static String[] A00;

    static {
        A01();
    }

    public static void A01() {
        A00 = new String[]{"5xEbc1UmueoelDSrZ01pbd3BmJNIPp1U", "V2pwOmwpGDtIWtnsLDXNbgXk3OH02STy", "ZygQfCeNfaSOACHLv", "IIEFhzt6S27nqtVGpISchgUV1ko256DH", "7IV1id8R", "S", "X", "3B1kWjUEw7n1jDPOxVE4cJw7NZn0CFn3"};
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0048 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0589Ct A00(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += C0726Ig.A04(i4, i2);
        }
        long[] jArr2 = new long[i3];
        String[] strArr = A00;
        if (strArr[5].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[4] = "MOnhYedn";
        strArr2[2] = "VzeyWK1Y20Sbegflw";
        int[] iArr2 = new int[i3];
        int i5 = 0;
        long[] jArr3 = new long[i3];
        int[] iArr3 = new int[i3];
        int i6 = 0;
        int i7 = 0;
        for (int chunkIndex = 0; chunkIndex < newSampleIndex; chunkIndex++) {
            int maximumSize = iArr[chunkIndex];
            long j2 = jArr[chunkIndex];
            while (maximumSize > 0) {
                int min = Math.min(i2, maximumSize);
                jArr2[i7] = j2;
                int newSampleIndex = i * min;
                iArr2[i7] = newSampleIndex;
                int newSampleIndex2 = iArr2[i7];
                i5 = Math.max(i5, newSampleIndex2);
                jArr3[i7] = i6 * j;
                iArr3[i7] = 1;
                int newSampleIndex3 = iArr2[i7];
                j2 += newSampleIndex3;
                i6 += min;
                maximumSize -= min;
                i7++;
            }
        }
        return new C0589Ct(jArr2, iArr2, i5, jArr3, iArr3, j * i6);
    }
}