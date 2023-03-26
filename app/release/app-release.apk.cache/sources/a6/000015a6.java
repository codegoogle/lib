package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Zd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1154Zd implements M0 {
    public static String[] A02;
    public final /* synthetic */ AnonymousClass51 A00;
    public final /* synthetic */ ZY A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"9zQQ", "ignw1BD", "Iwiu", "Rj9759ruFeEHfZFHtC0tN77N", "Yw9WW67qBp7nurOongm62UMTZpj72Daq", "XdprQx2", "zMrI2nkZvee1EVY6Hu3DKwgaLEX6aHI5", "7LD9TnQa5MzlVBDCJJS9JW3wW2x"};
    }

    public C1154Zd(ZY zy, AnonymousClass51 anonymousClass51) {
        this.A01 = zy;
        this.A00 = anonymousClass51;
    }

    @Override // com.facebook.ads.redexgen.X.M0
    public final void A9A() {
        this.A01.A0B.A03(JK.A07, null);
        if (this.A01.A0X()) {
            return;
        }
        if (this.A01.A0U()) {
            this.A01.A0T(this.A00);
            return;
        }
        AnonymousClass51 anonymousClass51 = this.A00;
        if (A02[7].length() != 27) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "TQLH18Rv5MEOVOxcIrRMtSKcbgUrlpIS";
        strArr[4] = "TQLH18Rv5MEOVOxcIrRMtSKcbgUrlpIS";
        anonymousClass51.finish(1);
    }
}