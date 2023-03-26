package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;

/* renamed from: com.facebook.ads.redexgen.X.Tb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0996Tb implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ C1007Tm A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"ks6FgoJovve7iHM2pZkl", "wha53u", "49wSJ7V8XkDKZTUcjMDnpoSn", "1JQ5I5ad77Yrp3ewkirQ0oRutiEmvr6i", "jAt3ZHaaMbDXz0fIQiir7V", "EKdcAjdCbYFTR4bnYqi4SV", "MwtlcC", "w1RouBmka6J1zGDRhikmrfItH78owLWg"};
    }

    public C0996Tb(C1007Tm c1007Tm) {
        this.A00 = c1007Tm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ActivityManager activityManager;
        activityManager = this.A00.A02;
        if (activityManager != null) {
            return this.A00.A0G(ActivityManager.isUserAMonkey());
        }
        C1007Tm c1007Tm = this.A00;
        EnumC04526t enumC04526t = EnumC04526t.A07;
        if (A01[2].length() != 23) {
            String[] strArr = A01;
            strArr[3] = "MHidzBjnmsHNQkooJipxy3AaWgleVPOv";
            strArr[7] = "EW2Ra62KpqEXQLSIkiFDqiivYFqdEGvM";
            return c1007Tm.A08(enumC04526t);
        }
        throw new RuntimeException();
    }
}