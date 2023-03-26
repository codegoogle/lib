package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.Xh */
/* loaded from: assets/audience_network.dex */
public final class C1106Xh implements M7 {
    public static byte[] A0B;
    public int A00;
    public C7w A01;
    public final C1080Wh A02;
    public final JE A03;
    public final M6 A04;
    public final MW A05;
    public final C0792Lb A06;
    public final AbstractC0754Jk A0A = new AbstractC0754Jk() { // from class: com.facebook.ads.redexgen.X.9m
        public static byte[] A01;
        public static String[] A02;

        static {
            A02();
            A01();
        }

        public static String A00(int i, int i2, int i3) {
            byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
            int i4 = 0;
            while (true) {
                int length = copyOfRange.length;
                if (A02[1].charAt(16) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[7] = "MNhPeHQbaIIJpJ20hNozP";
                strArr[2] = "";
                if (i4 >= length) {
                    return new String(copyOfRange);
                }
                copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
                i4++;
            }
        }

        public static void A01() {
            A01 = new byte[]{35, 22, 17, 18, 28, -10, 27, 33, 18, 31, 32, 33, 22, 33, 14, 25, -14, 35, 18, 27, 33};
        }

        public static void A02() {
            A02 = new String[]{"AyjpfVMH4abbuU", "C4f54F5689i8nguXYuZVyawidNrV99tP", "", "kvcj7JPhLleA0fC5", "qT9ER7mxQyIS", "DVCseFxiIzNfwa", "yADVvB6XdmuuqrvB", "b9AAn0hyeOBCYK5qzyR18"};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9K
        /* renamed from: A03 */
        public final void A04(C0761Jt c0761Jt) {
            C1106Xh.A00(C1106Xh.this).A3t(A00(0, 21, 113), c0761Jt);
        }
    };
    public final AbstractC0766Jy A09 = new AbstractC0766Jy() { // from class: com.facebook.ads.redexgen.X.9l
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i, int i2, int i3) {
            byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
            }
            return new String(copyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{72, 87, 90, 91, 81, 119, 80, 74, 91, 76, 77, 74, 87, 74, 95, 82, 123, 72, 91, 80, 74};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9K
        /* renamed from: A02 */
        public final void A04(C04747t c04747t) {
            C1106Xh.A00(C1106Xh.this).A3t(A00(0, 21, 1), c04747t);
        }
    };
    public final K4 A07 = new K4() { // from class: com.facebook.ads.redexgen.X.9k
        public static byte[] A01;
        public static String[] A02;

        static {
            A02();
            A01();
        }

        public static String A00(int i, int i2, int i3) {
            byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
            }
            return new String(copyOfRange);
        }

        public static void A01() {
            byte[] bArr = {17, 4, -1, 0, 10, -28, 9, 15, 0, 13, 14, 15, 4, 15, -4, 7, -32, 17, 0, 9, 15};
            String[] strArr = A02;
            if (strArr[6].charAt(4) != strArr[3].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "e0kN46odqljBIthjpUkTXG9hdDsWHsKW";
            strArr2[2] = "e0kN46odqljBIthjpUkTXG9hdDsWHsKW";
            A01 = bArr;
        }

        public static void A02() {
            A02 = new String[]{"OtZHHid0c6Ryk9CDDBq47ngXcNldIUWH", "JwrlVwQ54E2WwwQvkywQUOYHwL6g1bho", "WFiM5IPZvaQ4xMZm5xgvQ3FNROoMY2Kr", "al6ZIECO6LO12zMiuvYELaWNpYKDhozx", "wYAPbQwhGVteNN6MGdL8gA6824n9AnKf", "jTihIhEYsz4XSFMEjn7OlZEBUOzI3KNS", "mXaQIkSzTCVxPQuz9HLogqhmhIjgMyMR", "pEgzTi4rZbqmTwficQat67UuNHBZNbaD"};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9K
        /* renamed from: A03 */
        public final void A04(C7v c7v) {
            C1106Xh.A00(C1106Xh.this).A3t(A00(0, 21, 69), c7v);
        }
    };
    public final K2 A08 = new K2() { // from class: com.facebook.ads.redexgen.X.9j
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9K
        /* renamed from: A00 */
        public final void A04(K3 k3) {
            C1106Xh.A01(C1106Xh.this).A9c();
        }
    };

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0B = new byte[]{-49, -29, -30, -35, -34, -38, -49, -25, -17, -8, -11, -15, -6, 0, -32, -5, -9, -15, -6, -68, -70, -84, -107, -88, -69, -80, -67, -84, -118, -69, -88, -119, -68, -69, -69, -74, -75, -73, -86, -91, -90, -80, -118, -81, -75, -90, -77, -76, -75, -86, -75, -94, -83, -122, -73, -90, -81, -75, -99, -112, -117, -116, -106, 115, -106, -114, -114, -116, -103, -2, -15, -20, -19, -9, -43, -40, -52, 24, Flags.CD, 6, 7, 17, -11, 7, 7, 13, -10, Flags.CD, 15, 7, -66, -79, -84, -83, -73, -99, -102, -108};
    }

    public C1106Xh(C1080Wh c1080Wh, MW mw, JE je, M6 m6) {
        this.A02 = c1080Wh;
        this.A03 = je;
        this.A05 = mw;
        this.A06 = new C0792Lb(c1080Wh);
        this.A06.A0Z(new C04657i(c1080Wh));
        this.A06.getEventBus().A04(this.A0A, this.A09, this.A07, this.A08);
        this.A04 = m6;
        this.A06.setIsFullScreen(true);
        this.A06.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        m6.A3L(this.A06, layoutParams);
        M9 m9 = new M9(c1080Wh);
        m9.setOnClickListener(new MU(this));
        m6.A3L(m9, m9.getDefaultLayoutParams());
    }

    public static /* synthetic */ M6 A00(C1106Xh c1106Xh) {
        return c1106Xh.A04;
    }

    public static /* synthetic */ MW A01(C1106Xh c1106Xh) {
        return c1106Xh.A05;
    }

    public final void A04(int i) {
        this.A06.setVideoProgressReportIntervalMs(i);
    }

    public final void A05(View view) {
        this.A06.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void A7r(Intent intent, Bundle bundle, AnonymousClass51 anonymousClass51) {
        String stringExtra = intent.getStringExtra(A02(19, 18, 33));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            OO oo = new OO(this.A02, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (16.0f * C0795Le.A01);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            oo.setOnClickListener(new MV(this));
            this.A04.A3L(oo, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 124), 0);
        this.A01 = new C7w(this.A02, this.A03, this.A06, intent.getStringExtra(A02(8, 11, 102)), intent.getBundleExtra(A02(58, 11, 1)));
        this.A06.setVideoMPD(intent.getStringExtra(A02(69, 8, 98)));
        this.A06.setVideoURI(intent.getStringExtra(A02(90, 8, 34)));
        int i2 = this.A00;
        if (i2 > 0) {
            this.A06.A0V(i2);
        }
        if (intent.getBooleanExtra(A02(0, 8, 72), false)) {
            this.A06.A0Y(EnumC0886Os.A05, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void AAO(boolean z) {
        this.A04.A3t(A02(37, 21, 27), new K1());
        this.A06.A0T();
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void AAl(boolean z) {
        this.A04.A3t(A02(37, 21, 27), new C0767Jz());
        if (!this.A06.A0g()) {
            this.A06.A0Y(EnumC0886Os.A05, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void ACg(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void onDestroy() {
        this.A04.A3t(A02(37, 21, 27), new IW(this.A00, this.A06.getCurrentPositionInMillis()));
        this.A01.A0e(this.A06.getCurrentPositionInMillis());
        this.A06.A0W(1);
        this.A06.A0S();
    }
}