package com.facebook.ads.redexgen.X;

import android.telephony.TelephonyManager;

/* loaded from: assets/audience_network.dex */
public class W7 implements InterfaceC04416i {
    public final /* synthetic */ WE A00;

    public W7(WE we) {
        this.A00 = we;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        telephonyManager = this.A00.A00;
        if (telephonyManager == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        WE we = this.A00;
        telephonyManager2 = we.A00;
        return we.A05(telephonyManager2.getPhoneType());
    }
}