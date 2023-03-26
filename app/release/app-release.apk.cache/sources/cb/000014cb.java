package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;

/* loaded from: assets/audience_network.dex */
public class W3 implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ WE A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"Zr9pMbCXDOnIQia1rxNbs", "xgHdKmUla89dgoNlEUmYBSdthljERTVN", "t0eJ9CzsilrQTJZ3mBY5uHdLOToWpPD0", "xn7Df6Bsn6N8b", "nuXOesuXOGqaff6jWjDzzwB48Mr7m9Ru", "HD4PNhpjIErL9f7FhF1L2XB0w8jmfy8z", "GFJMAbd7JtPv78Iw3eZ5GKABpr6j7C", "a6D5eDw1EZzTAa7WvhZLV0FGc6KUpGTS"};
    }

    public W3(WE we) {
        this.A00 = we;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    @SuppressLint({"MissingPermission"})
    public final AbstractC04566x A50() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        int A012;
        if (Build.VERSION.SDK_INT < 17) {
            return this.A00.A08(EnumC04526t.A05);
        }
        boolean A0E = AnonymousClass76.A0E();
        if (A01[2].charAt(7) != 's') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "7cAAgCcjwnswSonydGODzEoLsKghCJb5";
        strArr[4] = "7cAAgCcjwnswSonydGODzEoLsKghCJb5";
        if (A0E) {
            boolean A0D = AnonymousClass76.A0D();
            if (A01[1].charAt(23) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "A1O8dvsw8NjieGbBncMIJ1M47KAaXmaM";
            strArr2[7] = "A1O8dvsw8NjieGbBncMIJ1M47KAaXmaM";
            if (A0D) {
                return this.A00.A08(EnumC04526t.A07);
            }
        }
        telephonyManager = this.A00.A00;
        if (telephonyManager == null) {
            WE we = this.A00;
            EnumC04526t enumC04526t = EnumC04526t.A07;
            String[] strArr3 = A01;
            if (strArr3[3].length() != strArr3[6].length()) {
                String[] strArr4 = A01;
                strArr4[3] = "coCM9MFponCPc";
                strArr4[6] = "NV1iD8UH9ErBba9OnjbAeyrfSpL8qw";
                return we.A08(enumC04526t);
            }
            return we.A08(enumC04526t);
        }
        WE we2 = this.A00;
        telephonyManager2 = we2.A00;
        A012 = WE.A01(telephonyManager2.getAllCellInfo().get(0));
        return we2.A05(A012);
    }
}