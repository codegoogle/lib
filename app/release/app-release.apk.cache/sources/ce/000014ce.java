package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* loaded from: assets/audience_network.dex */
public class W6 implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ WE A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"YvgwWocx1FADdeAzbpsmJqKucTKVrLw8", "IN5yo6alVzQxSBDS0LSAMVLc9G2MRZFn", "HAZTu6IPNZsD1qj0M1i9utr9DJx5S0QZ", "N5cGJfQ0ESKW2WKzc5hPaTPWXOaKWBwf", "tNMXMhxZjOCLmtsXwerOChNpJkA4NIz8", "qe3nCZLHllYVPimtyVQbZz0eRg0vYsPF", "hksQgw", "nUQ4NN4k5WyfvhfMBfttwidjpDAXB5K7"};
    }

    public W6(WE we) {
        this.A00 = we;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        TelephonyManager telephonyManager3;
        telephonyManager = this.A00.A00;
        if (telephonyManager == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            WE we = this.A00;
            telephonyManager3 = we.A00;
            return we.A05(telephonyManager3.getVoiceNetworkType());
        }
        WE we2 = this.A00;
        telephonyManager2 = we2.A00;
        if (A01[2].charAt(0) != 'L') {
            String[] strArr = A01;
            strArr[1] = "ynGeEoYIomGmDWEGPoJ89qRpE67tUZnz";
            strArr[1] = "ynGeEoYIomGmDWEGPoJ89qRpE67tUZnz";
            return we2.A05(telephonyManager2.getNetworkType());
        }
        throw new RuntimeException();
    }
}