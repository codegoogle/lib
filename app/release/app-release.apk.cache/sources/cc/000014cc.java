package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* loaded from: assets/audience_network.dex */
public class W4 implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ WE A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"xn6Y4xiAj5nTE1ZX0fcI9", "IuzZJNTC9Fpz", "Zp9uFgGuFlryeSNHyo4T0p", "eRJH2gjtevDtLFu1wMxFEv", "pTKacr9NdWTXHSX", "3c0ViuxMUKEAC", "2WDSEnCYP4spNEJs", "S3q5Kz3J"};
    }

    public W4(WE we) {
        this.A00 = we;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        if (Build.VERSION.SDK_INT < 26) {
            WE we = this.A00;
            String[] strArr = A01;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "x95Rh7kgyGSfBF3YHwpGzi";
            strArr2[3] = "73CHLU13D6YvD39ECjSAyL";
            return we.A08(EnumC04526t.A05);
        }
        telephonyManager = this.A00.A00;
        if (telephonyManager == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        WE we2 = this.A00;
        telephonyManager2 = we2.A00;
        return we2.A0G(telephonyManager2.isDataEnabled());
    }
}