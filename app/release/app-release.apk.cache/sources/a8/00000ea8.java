package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.p7700g.p99005.ax5;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04255s {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C04265t A00;
    public final C04275u A01;
    public final C1081Wi A02;
    public final QB A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, 19, 41, 52, 56, 62, 45, ax5.a};
    }

    static {
        A01();
        A06 = C04255s.class.getSimpleName();
    }

    public C04255s(C1081Wi c1081Wi, QN qn, C04265t c04265t, C04275u c04275u) {
        this.A02 = c1081Wi;
        this.A03 = qn.A4N(QC.A06);
        this.A00 = c04265t;
        this.A01 = c04275u;
        this.A03.A3I(new TO(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (KU.A02(this)) {
            return;
        }
        if (!this.A03.A7i()) {
            BuildConfigApi.isDebug();
            return;
        }
        String optString = this.A03.A5x().optString(A00(0, 9, 62));
        if (!TextUtils.isEmpty(optString)) {
            this.A00.A04(this.A02, optString);
            if (!A04 || J8.A0e(this.A02)) {
                A04 = true;
                this.A01.A05();
            }
        }
    }
}