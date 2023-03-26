package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class U4 implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ U7 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"9CH7FUr60fjSOu0uDtam6QWrW1LAXcO0", "MGZ5NGAJYsXrcQ530Rpa4mq072uYsiXm", "FSEpTqAJrXrPXD8Cb", "YDmM9nsCETgUfJB46tzDOSpydcNxEQ3F", "VGv8Kw1xSq2totQkDwmbaDQvoJVXTwia", "PqLjk4LqC3tC9ytXEM059nB67sHSnsxP", "xjbenFCMrkBs7EfKqhSnYCZ0lRG62qii", "xgMaaa53aLKiV09tKVXK6rj7dvlbsjte"};
    }

    public U4(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        if (Build.VERSION.SDK_INT < 24) {
            U7 u7 = this.A00;
            EnumC04526t enumC04526t = EnumC04526t.A05;
            String[] strArr = A01;
            if (strArr[4].charAt(20) != strArr[5].charAt(20)) {
                String[] strArr2 = A01;
                strArr2[3] = "fnZh3TS8JAEKtifjP4n7RBztgRvZoar8";
                strArr2[2] = "4XQjD71oxr9tiB6pv";
                return u7.A08(enumC04526t);
            }
            throw new RuntimeException();
        }
        applicationInfo = this.A00.A01;
        if (applicationInfo == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        U7 u72 = this.A00;
        applicationInfo2 = u72.A01;
        return u72.A09(applicationInfo2.deviceProtectedDataDir);
    }
}