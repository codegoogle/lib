package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ol  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0879Ol extends AbstractC0900Pg {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass83 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{2, 14, 12, 79, 7, 0, 2, 4, 3, 14, 14, 10, 79, 0, 5, 18, 79, 8, 15, 21, 4, 19, 18, 21, 8, 21, 8, 0, 13, 79, 8, 12, 17, 19, 4, 18, 18, 8, 14, 15, 79, 13, 14, 6, 6, 4, 5};
    }

    public C0879Ol(AnonymousClass83 anonymousClass83) {
        this.A00 = anonymousClass83;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0900Pg
    public final void A04() {
        LX lx;
        LX lx2;
        M6 audienceNetworkListener;
        String str;
        C0901Ph c0901Ph;
        LX lx3;
        RQ rq;
        JE je;
        String str2;
        C1080Wh c1080Wh;
        M6 audienceNetworkListener2;
        lx = this.A00.A0D;
        if (!lx.A08()) {
            lx2 = this.A00.A0D;
            lx2.A06();
            audienceNetworkListener = this.A00.getAudienceNetworkListener();
            if (audienceNetworkListener != null) {
                audienceNetworkListener2 = this.A00.getAudienceNetworkListener();
                audienceNetworkListener2.A3s(A00(0, 47, 116));
            }
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                NU nu = new NU();
                c0901Ph = this.A00.A09;
                NU A04 = nu.A04(c0901Ph);
                lx3 = this.A00.A0D;
                NU A03 = A04.A03(lx3);
                rq = ((ZY) this.A00).A08;
                Map<String, String> A06 = A03.A05(rq.A0S()).A06();
                je = ((ZY) this.A00).A0A;
                str2 = this.A00.A0A;
                je.A86(str2, A06);
                c1080Wh = this.A00.A0C;
                c1080Wh.A0A().A2a();
            }
        }
    }
}