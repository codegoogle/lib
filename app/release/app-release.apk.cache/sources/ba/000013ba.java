package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Rb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0947Rb extends AbstractRunnableC0770Kc {
    public static byte[] A02;
    public static String[] A03;
    public final /* synthetic */ AbstractC0950Re A00;
    public final /* synthetic */ C1204aV A01;

    static {
        A03();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[4].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[0] = "oScLyKWb3fn2oYJPJdX8D34ZjyUzRvxz";
            strArr2[3] = "G9gk2wDsh72JfZvDy2Lys6UEtMP3Y1SB";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 84);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{51, 52, 44, 59, 54, 51, 62, 122, bx.W5, 54, 59, 57, ax5.a, 55, ax5.a, 52, 46, 122, 51, 52, 122, 40, ax5.a, 41, bx.W5, 53, 52, 41, ax5.a};
    }

    public static void A03() {
        A03 = new String[]{"rcAoHT8yzEEoCxFmEfFHXcUl0vjpGdgY", "LSTuq6Bu4IKsOuvOF", "N9ND8qL7XSSd32I", "yk3W1HvskfBH2x0X91qy9qW3VKhe7rxg", "6nHANpKnXNhaq6nYT", "xMxpxuwRsi8wtxmAob8T1Ch5JVdvxyTv", "", "PgJ"};
    }

    public C0947Rb(AbstractC0950Re abstractC0950Re, C1204aV c1204aV) {
        this.A00 = abstractC0950Re;
        this.A01 = c1204aV;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        AnonymousClass90 A00 = this.A01.A00();
        if (A00 == null || A00.A05() == null) {
            String A002 = A00(0, 29, 14);
            C0755Jm c0755Jm = new C0755Jm(AdErrorType.NO_AD_PLACEMENT, A002);
            this.A00.A0C.A0A().A4Y(c0755Jm.A04().getErrorCode(), A002);
            this.A00.A07.A0F(c0755Jm);
            return;
        }
        this.A00.A05 = A00;
        this.A00.A0O();
    }
}