package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Tz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1020Tz implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ U7 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"pBrDaZa5X5LjOgDS06qrKfvSDyGe8efw", "mQEhYUIy596kL", "EIforD6eBYb22Ex4JOKq", "k4SBaaSc1moa84J0CFgFz3nqLP2HVqmu", "u8nSh4T3SaBZfkGp86pLE93qaiXMklcf", "jMwuEx2OfYupc0", "IfOhRtB8SPti74hSuqBgnsqawc0MdhYN", "25E6wEyieKrSwG"};
    }

    public C1020Tz(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        ApplicationInfo applicationInfo3;
        if (Build.VERSION.SDK_INT < 4) {
            U7 u7 = this.A00;
            String[] strArr = A01;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "5uTBAcIF1H8x94";
            strArr2[5] = "w8sP31VUPTTap4";
            return u7.A08(EnumC04526t.A05);
        }
        applicationInfo = this.A00.A01;
        if (applicationInfo != null) {
            U7 u72 = this.A00;
            String[] strArr3 = A01;
            if (strArr3[3].charAt(9) != strArr3[6].charAt(9)) {
                String[] strArr4 = A01;
                strArr4[7] = "fRLqK3UXRIvALx";
                strArr4[5] = "beY33YfNkspfTw";
                applicationInfo3 = u72.A01;
                return u72.A05(applicationInfo3.targetSdkVersion);
            }
            String[] strArr5 = A01;
            strArr5[4] = "qWUfrjWL8adA9tG6bFG21ciodwCrSrmB";
            strArr5[4] = "qWUfrjWL8adA9tG6bFG21ciodwCrSrmB";
            applicationInfo2 = u72.A01;
            return u72.A05(applicationInfo2.targetSdkVersion);
        }
        return this.A00.A08(EnumC04526t.A07);
    }
}