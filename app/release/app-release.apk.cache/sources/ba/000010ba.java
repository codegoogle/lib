package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import com.p7700g.p99005.ax5;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class F0 extends XQ {
    public static byte[] A02;
    public final /* synthetic */ RD A00;
    public final /* synthetic */ RI A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{21, 34, 34, ax5.a, 34, 112, 53, 40, 53, 51, 37, 36, 57, 62, 55, 112, 49, 51, 36, 57, ax5.a, 62, 17, 21, 22, 19};
    }

    public F0(RD rd, RI ri) {
        this.A00 = rd;
        this.A01 = ri;
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A8t() {
        boolean z;
        this.A00.A09 = true;
        z = this.A00.A0A;
        if (!z) {
            return;
        }
        this.A00.A06();
    }

    @Override // com.facebook.ads.redexgen.X.XQ, com.facebook.ads.redexgen.X.NN
    public final void A99(String str, Map<String, String> map) {
        C0591Cv c0591Cv;
        C0591Cv c0591Cv2;
        JE je;
        String str2;
        C0591Cv c0591Cv3;
        InterfaceC03020v interfaceC03020v;
        InterfaceC03020v interfaceC03020v2;
        c0591Cv = this.A00.A02;
        c0591Cv.A0A().A3Z();
        Uri parse = Uri.parse(str);
        if (A00(22, 4, 12).equals(parse.getScheme()) && C02870g.A04(parse.getAuthority())) {
            interfaceC03020v = this.A00.A00;
            if (interfaceC03020v != null) {
                interfaceC03020v2 = this.A00.A00;
                interfaceC03020v2.A91(this.A00);
            }
        }
        c0591Cv2 = this.A00.A02;
        je = this.A00.A03;
        AbstractC02860f A00 = C02870g.A00(c0591Cv2, je, this.A01.A5j(), parse, map);
        if (A00 == null) {
            return;
        }
        try {
            c0591Cv3 = this.A00.A02;
            c0591Cv3.A0A().A3W();
            A00.A0D();
        } catch (Exception e) {
            str2 = RD.A0D;
            Log.e(str2, A00(0, 22, 43), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.XQ, com.facebook.ads.redexgen.X.NN
    public final void A9i() {
        C0591Cv c0591Cv;
        RK rk;
        RK rk2;
        RK rk3;
        c0591Cv = this.A00.A02;
        InterfaceC0945Qz A0A = c0591Cv.A0A();
        rk = this.A00.A01;
        A0A.A3a(rk != null);
        rk2 = this.A00.A01;
        if (rk2 == null) {
            return;
        }
        rk3 = this.A00.A01;
        rk3.A03();
    }

    @Override // com.facebook.ads.redexgen.X.XQ, com.facebook.ads.redexgen.X.NN
    public final void AAM() {
        C0591Cv c0591Cv;
        RK rk;
        c0591Cv = this.A00.A02;
        c0591Cv.A0A().A3c();
        rk = this.A00.A01;
        rk.A08();
    }
}