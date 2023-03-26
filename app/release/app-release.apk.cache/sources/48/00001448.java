package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1017Tw implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ U7 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"xoHvVsjIwv7W5ClpzJbisJEpOcq", "SYDRmpizq5sDZ4GfL4h8WluGMHdmoTuM", "DVzF2PeQv7hgrICuH3nyQdrZNKSxdA", "4lIziXMzxgphshR2rAqW9SlDjwpMcvxS", "Bksnruu9CDcd9v5jIjvraWrOMG1PGOq1", "vT5fBH5lG6OjAtE20tf2f7rqol7xKp1H", "b74VzSGUDjeF5gq780pkK2xwxVTOFG7b", "77MleEyOR9uHuiszCvhjWPNRz4PKDadz"};
    }

    public C1017Tw(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        C04325z c04325z;
        c04325z = this.A00.A02;
        String A0f = c04325z.A0f();
        if (A0f != null) {
            U7 u7 = this.A00;
            if (A01[7].charAt(13) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "f9T5AhYAPA98oVvlWKPWGyhu6RS3SO";
            strArr[0] = "b7yxm3cRAk17Eqj8H4F2BjoUql6";
            return u7.A09(A0f);
        }
        return this.A00.A08(EnumC04526t.A07);
    }
}