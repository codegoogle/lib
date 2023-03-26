package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Yp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1140Yp implements L3 {
    public static String[] A01;
    public final /* synthetic */ YA A00;

    public static void A00() {
        A01 = new String[]{"XQ6pDaA1rZEM", "XoeGOYiSv0w2M1U1qXC2kK0WxpTFbq6C", "goNPtYs5sZFfNSJyOgs171oDuCl7t69H", "IBRmsKraW8ihcuaNuynFKjmRlH", "udOMyB", "k9bLdXox5SSCuqwZoRmzAy5kJm", "rLCACxpviKCtWgunDsmekf59Ef0kXw8R", "IiDilnQTvcIperbA6lCpmy3utrrmGEhT"};
    }

    static {
        A00();
    }

    public C1140Yp(YA ya) {
        this.A00 = ya;
    }

    public /* synthetic */ C1140Yp(YA ya, ZV zv) {
        this(ya);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // com.facebook.ads.redexgen.X.L3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A9D() {
        boolean z;
        boolean z2;
        View$OnClickListenerC1087Wo view$OnClickListenerC1087Wo;
        View$OnClickListenerC1087Wo view$OnClickListenerC1087Wo2;
        boolean A0W;
        this.A00.A0H();
        z = this.A00.A0N;
        if (z) {
            A0W = this.A00.A0W();
            if (A0W) {
                this.A00.A0P.setToolbarActionMode(1);
                z2 = this.A00.A0O;
                if (A01[4].length() == 6) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[4] = "RNuzR8";
                strArr[4] = "RNuzR8";
                if (!z2) {
                    C0795Le.A0Y(this.A00, 500);
                    view$OnClickListenerC1087Wo = this.A00.A05;
                    if (view$OnClickListenerC1087Wo != null) {
                        view$OnClickListenerC1087Wo2 = this.A00.A05;
                        C0795Le.A0Q(view$OnClickListenerC1087Wo2, 0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.A00.A0P.setToolbarActionMode(0);
        z2 = this.A00.A0O;
        if (A01[4].length() == 6) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.L3
    public final void AAc(float f) {
        C1S c1s;
        c1s = this.A00.A0A;
        this.A00.A0P.setProgress(100.0f * (1.0f - (f / c1s.A08())));
        this.A00.A0O((int) f);
    }
}