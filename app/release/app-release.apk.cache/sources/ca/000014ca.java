package com.facebook.ads.redexgen.X;

import android.telephony.TelephonyManager;

/* loaded from: assets/audience_network.dex */
public class W2 implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ WE A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"z8dx8jcAs7HM5esb7c49HgQlCMJUD3t9", "Z27XjLV71jIj1KfRNg7i9pb54cjqos2V", "6E0WXe0HHFnnwQetVOp4LyZJXKm0EhYW", "5n0zxjSh5lrA6YdkKKdKdPto", "m3yiGl3d5h8kg9DGPr7qvl1tLoj9C1EY", "6Zd3QoWt03yEzQBhZFxcVO7q01Uelitn", "t47YK6eEHNb1t1eyBeM4t0RbN9Ph57Vj", "OvhOKFZHGYEQ5NA3UMfcxvSqe0D108CD"};
    }

    public W2(WE we) {
        this.A00 = we;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        telephonyManager = this.A00.A00;
        if (telephonyManager != null) {
            WE we = this.A00;
            if (A01[6].charAt(15) != 'y') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "Ct76XBGNMfDXyoQyHbEHQKjczjA9HjKg";
            strArr[6] = "Ct76XBGNMfDXyoQyHbEHQKjczjA9HjKg";
            telephonyManager2 = we.A00;
            return we.A05(telephonyManager2.getSimState());
        }
        return this.A00.A08(EnumC04526t.A07);
    }
}