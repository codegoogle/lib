package com.facebook.ads.redexgen.X;

import android.icu.util.TimeZone;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class WH implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ WI A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"smnl8goxbtEXy2ari0oo94M5wBAsJ", "4jdGfKjJVtKongVqtnlXz1qpag9QmJcO", "6HhyQoH63eZiDTc8tIM8lg1a8XmlaMXL", "TRovmJ8dsKeWsGtAEtnO1NLs5DkGdItv", "EJDQOjfPW", "Fvhxx1JOY2tpNVIZJk2UFnorm88CMjoG", "Hr", "QB67UPOvQOrUPNaLWc8iYWX5dhIe7kRi"};
    }

    public WH(WI wi) {
        this.A00 = wi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        if (Build.VERSION.SDK_INT < 24) {
            AbstractC04566x A08 = this.A00.A08(EnumC04526t.A05);
            String[] strArr = A01;
            if (strArr[5].charAt(2) != strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "zHpdef4a8sETM0qy6DqDlJHNwIYZi";
            strArr2[0] = "zHpdef4a8sETM0qy6DqDlJHNwIYZi";
            return A08;
        }
        return this.A00.A09(TimeZone.getDefault().getDisplayName());
    }
}