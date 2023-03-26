package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Er  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0635Er extends AbstractC1175a2<C0956Rk> {
    public static String[] A00;

    static {
        A00();
    }

    public static void A00() {
        A00 = new String[]{"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};
    }

    public C0635Er(C0956Rk c0956Rk) {
        super(c0956Rk);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        C1080Wh c1080Wh;
        Handler handler;
        Runnable runnable;
        C0956Rk A08 = A08();
        if (A08 == null) {
            return;
        }
        c1080Wh = A08.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[5] = "SiVLKh";
        strArr2[5] = "SiVLKh";
        if (C0812Lv.A02(c1080Wh)) {
            A08.A08();
            return;
        }
        handler = A08.A05;
        runnable = A08.A0C;
        handler.postDelayed(runnable, 5000L);
    }
}