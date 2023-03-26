package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bT  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1262bT implements AnonymousClass79 {
    public static byte[] A03;
    public static String[] A04;
    public final /* synthetic */ RG A00;
    public final /* synthetic */ C1267bZ A01;
    public final /* synthetic */ boolean A02;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-41, -14, -6, -3, -10, -11, -79, 5, 0, -79, -11, 0, 8, -1, -3, 0, -14, -11, -79, -14, -79, -2, -10, -11, -6, -14, -65};
    }

    public static void A02() {
        A04 = new String[]{"8KjqebZv60QJkTDxRMgw9", "thfRn5pDzJN70UFYfVIlaB6cN7Gudk2R", "C9BVpw9UV8RgNssPir2gScGxH", "7AiIJI7TwWfHsESFux14U5S4ACJbRhuU", "Q7zUSmRtSU1V7fItr4R7SI8x29M95mvp", "Azfz", "38Oiuq4LYjnMY2HJpsmmy", "sSYHnhmgAc6ueqp"};
    }

    public C1262bT(C1267bZ c1267bZ, RG rg, boolean z) {
        this.A01 = c1267bZ;
        this.A00 = rg;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass79
    public final void A97() {
        C1080Wh c1080Wh;
        long j;
        InterfaceC1268ba interfaceC1268ba;
        InterfaceC1268ba interfaceC1268ba2;
        if (this.A01.A0W != null) {
            this.A01.A0W.A0W();
            this.A01.A0W = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 49);
        c1080Wh = this.A01.A0Y;
        C0S A0A = c1080Wh.A0A();
        j = this.A01.A00;
        A0A.A2d(LW.A01(j), adErrorType.getErrorCode(), A00);
        interfaceC1268ba = this.A01.A0F;
        if (interfaceC1268ba == null) {
            return;
        }
        interfaceC1268ba2 = this.A01.A0F;
        interfaceC1268ba2.A9X(C0755Jm.A02(adErrorType, A00));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
        if (r1.equals(com.facebook.ads.redexgen.X.JU.A04) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
        r0 = r4.A01.A0n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
        if (r0 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
        r0 = r4.A01.A0F;
        r0.AA9();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
        if (r4.A02 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
        r0 = r4.A01.A0F;
        r0.A8n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
        if (r1.equals(com.facebook.ads.redexgen.X.JU.A04) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A9E() {
        InterfaceC1268ba interfaceC1268ba;
        JU ju;
        JU ju2;
        C0636Es c0636Es;
        C0636Es c0636Es2;
        C1267bZ c1267bZ = this.A01;
        c1267bZ.A0W = this.A00;
        if (this.A02) {
            c0636Es = c1267bZ.A09;
            if (c0636Es != null) {
                c0636Es2 = this.A01.A09;
                String[] strArr = A04;
                if (strArr[4].charAt(21) == strArr[1].charAt(21)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[4] = "VPn7Tjnl2g2ZoGzxCsTNTuvzL6QbPFmz";
                strArr2[1] = "YMqnQw7eyVGctn758ocTTHmAed4stf5y";
                c0636Es2.A0J();
            }
        }
        interfaceC1268ba = this.A01.A0F;
        if (interfaceC1268ba != null) {
            C1267bZ c1267bZ2 = this.A01;
            String[] strArr3 = A04;
            if (strArr3[4].charAt(21) != strArr3[1].charAt(21)) {
                String[] strArr4 = A04;
                strArr4[2] = "6qlMxmRDBvH4L6kOfkSoYm3n5";
                strArr4[7] = "yt5qGGbrsd8TRcD";
                ju2 = c1267bZ2.A0D;
            } else {
                String[] strArr5 = A04;
                strArr5[4] = "NqrZxTPTxSSE484geuNhnuVXrlMqLfJJ";
                strArr5[1] = "nXt660y1rE1HMRNPODglVba6eKGAZLBD";
                ju = c1267bZ2.A0D;
            }
        }
    }
}