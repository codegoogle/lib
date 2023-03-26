package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class Y8 implements M0 {
    public static String[] A01;
    public final /* synthetic */ C1118Xt A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"6N", "smQA5TSxp7vjrWoIt3G8gqRI7vuv9Mo2", "nC2JCQuxt461FEwUH0osGyRmdjA", "Hvedh13CT0GkY3JhzOxajNH8XlaZQpLN", "5Odrxu44jwGQpLwu9LnTSanJ4TNopF0a", "7krTPzdKMYjdejqNC8FU3CrmbwWia7OA", "A91WiRAFiXbxe3egNbtfICOYy0", "PiGZqdHGAPhzlIXS2UC0uVxfbNyiCcLD"};
    }

    public Y8(C1118Xt c1118Xt) {
        this.A00 = c1118Xt;
    }

    @Override // com.facebook.ads.redexgen.X.M0
    public final void A9A() {
        JL jl;
        C1080Wh c1080Wh;
        LX lx;
        boolean z;
        boolean z2;
        C0792Lb c0792Lb;
        boolean A0f;
        C0792Lb c0792Lb2;
        C0901Ph c0901Ph;
        LX lx2;
        JE je;
        RR rr;
        jl = this.A00.A0T;
        jl.A03(JK.A07, null);
        c1080Wh = this.A00.A0R;
        c1080Wh.A0A().A2Z();
        lx = this.A00.A0V;
        if (!lx.A0A(this.A00.getContext())) {
            z = this.A00.A0I;
            if (!z) {
                c0792Lb = this.A00.A09;
                if (A01[2].length() != 27) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[4] = "5zrYwBRwluqa1cGxPZZJZEcv5DdOFBPm";
                strArr[7] = "gq390Wd0Yu1IJshZC9Clpt7tVnhSzLar";
                if (c0792Lb != null) {
                    A0f = this.A00.A0f();
                    if (A0f) {
                        c0792Lb2 = this.A00.A09;
                        c0792Lb2.A0X(EnumC0882Oo.A07);
                        return;
                    }
                    this.A00.A0N();
                    return;
                }
            }
            z2 = this.A00.A0I;
            if (A01[1].charAt(8) == 'p') {
                String[] strArr2 = A01;
                strArr2[5] = "Zcc8pzIQVtObnEDs8jyH13QzYMXIQUWE";
                strArr2[5] = "Zcc8pzIQVtObnEDs8jyH13QzYMXIQUWE";
                if (!z2) {
                    return;
                }
            } else if (!z2) {
                return;
            }
            this.A00.A0I();
            return;
        }
        NU nu = new NU();
        c0901Ph = this.A00.A0f;
        NU A04 = nu.A04(c0901Ph);
        lx2 = this.A00.A0V;
        Map<String, String> A06 = A04.A03(lx2).A06();
        je = this.A00.A0S;
        rr = this.A00.A0P;
        je.A7z(rr.A0Q(), A06);
    }
}