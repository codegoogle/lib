package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.bN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1256bN extends AbstractC0900Pg {
    public static String[] A01;
    public final /* synthetic */ C1258bP A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"17VeHKqvAV3iPquTRFV5nkfekqPAOX2Y", "lAWAATHLIf1ZCLkldXz2HdhVco5hUmDN", "zF5", "DmLMY21jiUoRuKlWConaRVpMyfqBnv90", "gnaW18bfkM8k", "Xsqe1WvhzdEOHDRdZu2mXr6vcctMp9sP", "yZ63PHoRBoKgX7qS3XV5e7w7nB", "vlnJSN6CnOAejO47j4gW78Wzdr557VH0"};
    }

    public C1256bN(C1258bP c1258bP) {
        this.A00 = c1258bP;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0900Pg
    public final void A02() {
        C05219t c05219t;
        C05219t c05219t2;
        c05219t = this.A00.A04;
        if (c05219t == null) {
            return;
        }
        c05219t2 = this.A00.A04;
        c05219t2.A0T();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r0 != false) goto L11;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC0900Pg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A04() {
        C05219t c05219t;
        boolean z;
        boolean z2;
        boolean A0L;
        c05219t = this.A00.A04;
        if (c05219t == null) {
            return;
        }
        z = this.A00.A0B;
        if (!z) {
            z2 = this.A00.A0A;
            if (!z2) {
                A0L = this.A00.A0L();
            }
            C1258bP c1258bP = this.A00;
            EnumC0886Os enumC0886Os = EnumC0886Os.A03;
            if (A01[5].charAt(14) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "6AVoG9MmguoU1vvLobA8P3uXYnnJUDvb";
            strArr[3] = "6AVoG9MmguoU1vvLobA8P3uXYnnJUDvb";
            c1258bP.A0K(enumC0886Os);
        }
        this.A00.A0A = false;
        this.A00.A0B = false;
    }
}