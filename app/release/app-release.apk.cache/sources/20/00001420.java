package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public final class TI implements C5U {
    public static byte[] A02;
    public static final String A03;
    public final C5X A00;
    public final C7H A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{50, 84, 71, 78, 81, 67, 70, 75, 80, 73, 2, 7, 70, 2, 67, 85, 85, 71, 86, 85, 58, 92, 79, 86, 89, 75, 78, 83, 88, 81, 10, 83, 87, 75, 81, 79, 36, 10, 15, 93, 35, 69, 56, ax5.a, 66, 52, 55, 60, 65, 58, -13, 64, 52, 69, 62, 72, 67, 13, -13, -8, 70, 25, 59, 46, 53, 56, bx.W5, 45, 50, 55, 48, -23, ax5.a, 50, 45, 46, 56, 3, -23, -18, 60, -33, -82, bx.j7, bx.j7, -79, -78, -81, -81, -88, -35, -77, -82, -83, -88, -84, -84, -32, -76, -88, -36, -83, -36, -82, -88, -83, -36, -83, -36, -32, -83, -33, -35, -34, -34, -32, -81, 58, 60, 47, 48, 47, 62, 45, 50, 19, 12, 9, 12, 13, 21, 12};
    }

    static {
        A02();
        A03 = TI.class.getSimpleName();
    }

    public TI(C5X c5x, C1081Wi c1081Wi) {
        this.A00 = c5x;
        this.A00.A3G(new TG(this));
        this.A01 = new C7H(c1081Wi);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(0, 20, 114), Integer.valueOf(this.A00.A5O().size()));
        }
        for (InterfaceC04085a interfaceC04085a : this.A00.A5O()) {
            int i = C5W.A00[interfaceC04085a.A7B().ordinal()];
            if (i == 1) {
                A04(interfaceC04085a.getUrl());
            } else if (i == 2) {
                A06(interfaceC04085a.getUrl());
            } else if (i == 3) {
                A05(interfaceC04085a.getUrl());
            }
        }
        this.A01.A0Q(new TH(this), new C7A(A00(81, 36, 11), A00(125, 7, 46)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 122), str);
        }
        C7E c7e = new C7E(str, -1, -1, A00(81, 36, 11), A00(125, 7, 46));
        c7e.A01 = A00(117, 8, 90);
        this.A01.A0R(c7e);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 99), str);
        }
        C7G c7g = new C7G(str, A00(81, 36, 11), A00(125, 7, 46));
        c7g.A04 = true;
        c7g.A02 = A00(117, 8, 90);
        this.A01.A0T(c7g);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 89), str);
        }
        C7G c7g = new C7G(str, A00(81, 36, 11), A00(125, 7, 46));
        c7g.A04 = false;
        c7g.A02 = A00(117, 8, 90);
        this.A01.A0W(c7g);
    }
}