package com.facebook.ads.redexgen.X;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Vg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1053Vg implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ C1057Vk A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"zJajY9dZZxYFsLRzsvnBiwQWt0HnizLC", "gzFaheVOcPUMbI38nwUIVYmc91b5uR", "ce0KJPPQByTAaQ9ATxZk2kwW24DeaJ9j", "R6Wiv8wmYaZdmPdgU3hXsutSf", "job2ys34errF3to", "kwK9VFGEGX8wPEd", "j3AidPNHk3dBWfN6HPyZ7", "rfM1O6R1RyyEf1DP"};
    }

    public C1053Vg(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        packageInfo = this.A00.A01;
        if (packageInfo == null || Build.VERSION.SDK_INT < 22) {
            return this.A00.A08(EnumC04526t.A07);
        }
        C1057Vk c1057Vk = this.A00;
        if (A01[1].length() != 30) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "SsABSdrOWb5CHUfmSefeH";
        strArr[6] = "SsABSdrOWb5CHUfmSefeH";
        packageInfo2 = c1057Vk.A01;
        return c1057Vk.A05(packageInfo2.baseRevisionCode);
    }
}