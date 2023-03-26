package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class V1 extends C6Z {
    public static PackageManager A00;
    public static String[] A01;

    static {
        A04();
    }

    public static void A04() {
        A01 = new String[]{"mMUsySdK", "G1dnExSQKLbMoTCo5d1h1U5A6G7ndhFt", "GiJYkTHpyeTaf3ywPcthUoX2rTVjWFCb", "0A5FUJ9kDHtL7zu8WVVZPRsd6iFGNBV", "Uxf0Oizk", "zpV62zjrrTP1cgdKU18BbBXv", "Pb6NlhKASELFsFyHLiNoj4ENeXMrfTQa", "RrSFtRYH4qZAbHiyxnUErsMfABxwLq"};
    }

    public V1(Context context, C04325z c04325z) {
        super(context, c04325z);
        A00 = context.getPackageManager();
    }

    public static /* synthetic */ PackageManager A01() {
        PackageManager packageManager = A00;
        if (A01[1].charAt(22) != 'k') {
            String[] strArr = A01;
            strArr[7] = "gjUVtXXuXbvsWPZLBaiwFqVTuNtnGy";
            strArr[3] = "aaBFOo2Y3N72goZoHRvUb35kO6Lzp1W";
            return packageManager;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC04566x A03(HashMap<String, V0> hashMap) {
        return new WY(SystemClock.elapsedRealtime(), A03(), hashMap, EnumC04556w.A0C);
    }

    public final InterfaceC04416i A0H(List<C04406h> list) {
        return new C1046Uz(this, list);
    }
}