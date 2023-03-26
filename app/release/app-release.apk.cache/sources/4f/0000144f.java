package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;

/* loaded from: assets/audience_network.dex */
public class U3 implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ U7 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"b1sQJ", "SIF58uGHe7qyLmHU2z0R0", "OwOBv3ZEKz2Te88ibAl3d47J53q2OGoK", "esWFBpscKVup9jNI8XCXNCETTdpqRq5Z", "zivB8", "FBi4O7QrEsFNvdqkgZ6MOGJI", "H45EAoAIvQ1szMaGMHC8haArjN6", "w12X6M1S0qfh4A3JJ2wkr2WlTLMqdjE1"};
    }

    public U3(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo == null) {
            U7 u7 = this.A00;
            String[] strArr = A01;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "DiCvH";
            strArr2[0] = "OWYZT";
            return u7.A08(EnumC04526t.A07);
        }
        U7 u72 = this.A00;
        applicationInfo2 = u72.A01;
        return u72.A09(applicationInfo2.publicSourceDir);
    }
}