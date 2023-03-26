package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;

/* loaded from: assets/audience_network.dex */
public class U0 implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ U7 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"CyYconlRA", "Z99FvxWAH", "r", "I6nMbGSwO", "f1HEaIkkO6UN2Wyn2K6t6YhOL5YQHMub", "q7TOnFp8MDH9pVcAi7q7X5O", "kHDnEbJrZHu3VwOwnck16fHaeHzzt8", "W41og5bN"};
    }

    public U0(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo == null) {
            U7 u7 = this.A00;
            if (A01[6].length() != 14) {
                String[] strArr = A01;
                strArr[6] = "1VAENbmq7tYIb9ZQI0D0jEbiw3q";
                strArr[6] = "1VAENbmq7tYIb9ZQI0D0jEbiw3q";
                return u7.A08(EnumC04526t.A07);
            }
            return u7.A08(EnumC04526t.A07);
        }
        U7 u72 = this.A00;
        String[] strArr2 = A01;
        if (strArr2[3].length() != strArr2[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A01;
        strArr3[2] = "ZWV";
        strArr3[2] = "ZWV";
        applicationInfo2 = u72.A01;
        return u72.A09(applicationInfo2.sourceDir);
    }
}