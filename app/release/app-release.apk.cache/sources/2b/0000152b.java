package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import com.p7700g.p99005.bx;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1100Xb implements InterfaceC0825Mi {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ AbstractC0823Mg A00;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -17, -19, -82, -26, bx.j7, -29, -27, -30, -17, -17, -21, -82, bx.j7, -28, -13, -82, bx.j7, -28, -14, -27, -16, -17, -14, -12, -23, -18, -25, -82, -58, -55, -50, -55, -45, -56, -33, -63, -60, -33, -46, -59, -48, -49, -46, -44, -55, -50, -57, -33, -58, -52, -49, -41};
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
        strArr2[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
    }

    public static void A02() {
        A02 = new String[]{"nV", "0i4Wqrqqd8V", "SjjlSsHq4luZ", "UY2G1G5tdkkQRCLDawUW8PMELrtkam", "x8YzSsjyce", "sMLSYBAewXVAxhh2DbXf8YHA5QSbjC", "Z41BjwW", "WlPnbv1jMaDivlCQdRIz8mOz1GWjjHLQ"};
    }

    public C1100Xb(AbstractC0823Mg abstractC0823Mg) {
        this.A00 = abstractC0823Mg;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Mi
    public final void A42() {
        M6 m6;
        M6 m62;
        m6 = this.A00.A06;
        if (m6 != null) {
            m62 = this.A00.A06;
            m62.A3s(A00(0, 53, 17));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Mi
    public final void A43() {
        M7 m7;
        M7 m72;
        this.A00.A0L();
        m7 = this.A00.A07;
        if (m7 != null) {
            m72 = this.A00.A07;
            m72.AAl(true);
        }
        this.A00.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Mi
    public final void A7D() {
        AnonymousClass26 anonymousClass26;
        AnonymousClass26 anonymousClass262;
        AnonymousClass26 anonymousClass263;
        anonymousClass26 = this.A00.A03;
        if (anonymousClass26 == null) {
            A43();
            return;
        }
        AbstractC0823Mg.A01(this.A00);
        anonymousClass262 = this.A00.A03;
        if (anonymousClass262.A02() == null) {
            AbstractC0823Mg abstractC0823Mg = this.A00;
            if (A02[6].length() != 7) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            strArr[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            abstractC0823Mg.A0B();
            return;
        }
        AbstractC0823Mg abstractC0823Mg2 = this.A00;
        anonymousClass263 = abstractC0823Mg2.A03;
        abstractC0823Mg2.A0D(anonymousClass263.A02());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Mi
    public final void A7o() {
        C1080Wh c1080Wh;
        AnonymousClass25 anonymousClass25;
        C1080Wh c1080Wh2;
        C1080Wh c1080Wh3;
        String str;
        c1080Wh = this.A00.A04;
        if (!TextUtils.isEmpty(AnonymousClass23.A0C(c1080Wh.A00()))) {
            Kw kw = new Kw();
            c1080Wh2 = this.A00.A04;
            c1080Wh3 = this.A00.A04;
            Uri parse = Uri.parse(AnonymousClass23.A0C(c1080Wh3.A00()));
            str = this.A00.A08;
            Kw.A09(kw, c1080Wh2, parse, str);
        }
        anonymousClass25 = this.A00.A02;
        anonymousClass25.A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Mi
    public final void A7p() {
        M7 m7;
        C1080Wh c1080Wh;
        AnonymousClass25 anonymousClass25;
        C1080Wh c1080Wh2;
        C1080Wh c1080Wh3;
        String str;
        M7 m72;
        this.A00.A0L();
        m7 = this.A00.A07;
        if (m7 != null) {
            m72 = this.A00.A07;
            m72.AAl(true);
        }
        c1080Wh = this.A00.A04;
        if (!TextUtils.isEmpty(AnonymousClass23.A06(c1080Wh.A00()))) {
            Kw kw = new Kw();
            c1080Wh2 = this.A00.A04;
            c1080Wh3 = this.A00.A04;
            Uri parse = Uri.parse(AnonymousClass23.A06(c1080Wh3.A00()));
            str = this.A00.A08;
            Kw.A09(kw, c1080Wh2, parse, str);
        }
        anonymousClass25 = this.A00.A02;
        anonymousClass25.A07();
        this.A00.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Mi
    public final void AAC(AnonymousClass24 anonymousClass24) {
        AnonymousClass24 anonymousClass242;
        C1080Wh c1080Wh;
        AnonymousClass26 A04;
        C1080Wh c1080Wh2;
        AbstractC0823Mg.A00(this.A00);
        this.A00.A01 = anonymousClass24;
        anonymousClass242 = this.A00.A01;
        if (anonymousClass242 == AnonymousClass24.A03) {
            c1080Wh2 = this.A00.A04;
            A04 = AnonymousClass23.A03(c1080Wh2.A00());
        } else {
            c1080Wh = this.A00.A04;
            A04 = AnonymousClass23.A04(c1080Wh.A00());
        }
        this.A00.A0D(A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Mi
    public final void AAK(AnonymousClass26 anonymousClass26) {
        AnonymousClass25 anonymousClass25;
        AbstractC0823Mg.A00(this.A00);
        anonymousClass25 = this.A00.A02;
        anonymousClass25.A08(anonymousClass26.A01());
        if (!anonymousClass26.A05().isEmpty()) {
            this.A00.A0D(anonymousClass26);
        } else {
            this.A00.A0C(anonymousClass26);
        }
    }
}