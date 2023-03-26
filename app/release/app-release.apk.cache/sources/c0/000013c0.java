package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Rh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0953Rh extends AbstractRunnableC0770Kc {
    public static byte[] A05;
    public static String[] A06;
    public final /* synthetic */ long A00;
    public final /* synthetic */ RG A01;
    public final /* synthetic */ C0636Es A02;
    public final /* synthetic */ C05008y A03;
    public final /* synthetic */ Map A04;

    static {
        A03();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A06;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "zvIoaGxek6NRisBEUIKkM8UdU9N5bmYn";
            strArr2[2] = "zvIoaGxek6NRisBEUIKkM8UdU9N5bmYn";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
            i4++;
        }
    }

    public static void A01() {
        A05 = new byte[]{33, 61, 55, 32, 32, 61, 32, 82, 76, 88, 61, 32, 36, 44, 38, 60, 61};
        if (A06[4].charAt(21) == 'x') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[2] = "OuAVUMSSWbttlxL4z5HkeS5T535dgvDy";
        strArr[2] = "OuAVUMSSWbttlxL4z5HkeS5T535dgvDy";
    }

    public static void A03() {
        A06 = new String[]{"Gpv8eHHTEOtePQmo1OD6muRo415gTvmp", "m8VLVbL9uinkegCEMoYL3DBV4Qd", "9DesmfPYImwpHbFMCkN8D4N2A0eEtTnA", "p6qK7niiHhY9MGJ6cPP69YBKuDETC8Y4", "5iURk91XNbuPvrJWt8OL2zSUhjl2Moa0", "44pBDqZwGccZEwpE1ClPCXXxeIB", "3LUdHIp1lrC6CN8jsqyi77AXm4NZ0z", "iLxtTrJV"};
    }

    public C0953Rh(C0636Es c0636Es, Map map, RG rg, long j, C05008y c05008y) {
        this.A02 = c0636Es;
        this.A04 = map;
        this.A01 = rg;
        this.A00 = j;
        this.A03 = c05008y;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        Map A01;
        this.A02.A0V(this.A04);
        this.A02.A0P(this.A01);
        A01 = this.A02.A01(this.A00);
        A01.put(A00(2, 5, 96), A00(0, 2, 62));
        A01.put(A00(7, 3, 13), A00(10, 7, 123));
        this.A02.A06(this.A03.A05(AnonymousClass92.A05), A01);
        this.A02.A0O();
    }
}