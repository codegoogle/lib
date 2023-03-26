package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.gl4;
import java.util.Arrays;
import java.util.Locale;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.Rn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0959Rn implements InterfaceC03221p {
    public static byte[] A04;
    public static String[] A05;
    public EnumC03211o A00 = EnumC03211o.A03;
    public EnumC03211o A01 = EnumC03211o.A03;
    public final AbstractC0962Rq A02;
    public final C1080Wh A03;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A05;
            if (strArr[7].charAt(1) != strArr[5].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "d2XCtNqKB2PlkmIVLWNasBjUSsZJOiBr";
            strArr2[0] = "d2XCtNqKB2PlkmIVLWNasBjUSsZJOiBr";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
            i4++;
        }
    }

    public static void A01() {
        A04 = new byte[]{-73, Flags.CD, 6, -73, 118, 104, -95, -73, -67, 104, -85, -87, -74, 104, -85, -80, -87, -74, -81, -83, 104, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, 104, -115, -70, -70, -73, -70, 104, -75, -73, -84, -83, 104, -86, -63, 104, -69, -83, -68, -68, -79, -74, -81, 104, -119, -84, -101, -83, -68, -68, -79, -74, -81, -69, 118, -69, -83, -68, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, -115, -70, -70, -73, -70, -107, -73, -84, -83, 112, 113, 112, 108, 107, -97, -114, -109, -113, -104, -115, -113, 120, -113, -98, -95, -103, -100, -107, -103, -59, -62, -64, 115, -41, -14, -17, -18, -25, -96, -23, -18, -12, -27, -14, -18, bx.j7, -20, -96, -12, -14, bx.j7, -18, -13, -23, -12, -23, -17, -18, -82, -15, 0, -7, -67, -64, -78, -75, 121, 122, -63, -74, -67, -59, 118, 119, 15, 3, -4, 15, -69, 4, 14, -69, -4, 7, 13, 0, -4, -1, 20, -69, -25, -22, -36, -33, -28, -23, -30, -57, -69, -25, -22, -36, -33, -32, -33, -69, 10, 13, -69, -18, -29, -22, -14, -28, -23, -30, -45, -57, -64, -45, g15.c, -56, -46, g15.c, -64, -53, -47, -60, -64, -61, -40, g15.c, -78, -89, -82, -74, -88, -83, -90, -14, -26, -33, -14, -98, -25, -15, -98, -20, -19, -14, -98, -54, -51, -65, -62, -61, -62};
    }

    public static void A02() {
        A05 = new String[]{"iEaWyjzULIZCFnp1nESlU5XZjwcvRjHd", "KbGYZiX8Pduw0KfpYwrRe1NWFWC1OMxy", "fhu9engps4P6WEn4zln6smGq5lQXex4h", "tbT6PfDqIL055", "rKa5gX4b0", "TAsNWcfBygYGmj6nueBPL3we7Mc4FYi0", "mn5595Nd0", "gAb4cPpeQcskkpTdmUE6rt9G8rZq3FNo"};
    }

    public C0959Rn(C1080Wh c1080Wh, AbstractC0962Rq abstractC0962Rq) {
        this.A03 = c1080Wh;
        this.A02 = abstractC0962Rq;
    }

    private void A03(EnumC03211o enumC03211o, EnumC03211o enumC03211o2) {
        String A00 = A00(113, 26, 99);
        String str = A00(108, 5, 54) + enumC03211o + A00(0, 4, 122) + enumC03211o2;
        this.A03.A04().A82(A00(WKSRecord.Service.NETBIOS_SSN, 3, 115), C04848i.A0T, new C04858j(A00, str));
        this.A03.A0A().ADz(A00 + gl4.R + str);
    }

    private void A04(String str, String str2, boolean z) {
        AdSettings.IntegrationErrorMode A00 = C03181l.A00(this.A03);
        String format = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String A002 = A00(WKSRecord.Service.NETBIOS_SSN, 3, 115);
        String A003 = A00(91, 17, 13);
        if (!z) {
            Log.e(A003, format);
            this.A03.A04().A82(A002, C04848i.A0R, new C04858j(format));
            this.A03.A0A().ADy(format);
            return;
        }
        int i = C03201n.A00[A00.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.A02.A05();
                this.A02.A06(10, AdErrorType.INCORRECT_STATE_ERROR, format);
                this.A03.A0A().ADy(format);
                Log.e(A003, format);
                this.A03.A04().A82(A002, C04848i.A0R, new C04858j(format));
            }
            Log.e(A003, format);
            return;
        }
        throw new C03231q(format + A00(4, 87, 43));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03221p
    public final boolean A51() {
        boolean z = (this.A00 == EnumC03211o.A03 || this.A00 == EnumC03211o.A05) && this.A01 != EnumC03211o.A08;
        if (z) {
            this.A00 = EnumC03211o.A07;
        } else {
            A04(A00(WKSRecord.Service.BL_IDM, 6, 52), A00(154, 42, 126), false);
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03221p
    public final boolean A52() {
        boolean z = this.A00 == EnumC03211o.A06 && (this.A01 != EnumC03211o.A08 || J8.A0d(this.A03));
        if (z) {
            this.A00 = EnumC03211o.A03;
            this.A01 = EnumC03211o.A08;
        } else {
            EnumC03211o enumC03211o = this.A00;
            EnumC03211o enumC03211o2 = EnumC03211o.A06;
            String A00 = A00(148, 6, 49);
            if (enumC03211o != enumC03211o2) {
                A04(A00, A00(219, 18, 97), true);
            } else {
                A04(A00, A00(196, 23, 66), false);
            }
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03221p
    public final EnumC03211o A5I() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03221p
    public final void ACt(EnumC03211o enumC03211o) {
        this.A00 = enumC03211o;
        this.A01 = enumC03211o;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03221p
    public final void ACw(AdError adError) {
        this.A00 = EnumC03211o.A05;
        this.A01 = EnumC03211o.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03221p
    public final void AD0() {
        if (this.A00 != EnumC03211o.A07) {
            A03(this.A00, EnumC03211o.A06);
        }
        this.A00 = EnumC03211o.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03221p
    public final void AD6() {
        if (this.A01 != EnumC03211o.A08) {
            A03(this.A00, EnumC03211o.A09);
        }
        this.A01 = EnumC03211o.A09;
    }
}