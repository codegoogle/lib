package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.85 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass85 extends QZ {
    public static byte[] A0K;
    public static String[] A0L;
    @Nullable
    public AbstractC0856No A00;
    @Nullable
    public EnumC0886Os A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final InterfaceC04074z A08;
    public final C0872Oe A09;
    public final C0792Lb A0A;
    public final C7w A0B;
    public final K4 A0C;
    public final K2 A0D;
    public final AbstractC0766Jy A0E;
    public final AbstractC0754Jk A0F;
    public final JH A0G;
    public final AbstractC0724Ie A0H;
    public final HS A0I;
    public final H2 A0J;

    static {
        A09();
        A08();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0K = new byte[]{-3, 21, 7, 5, 21, -1, -38, -51, -56, -55, -45};
    }

    public static void A09() {
        A0L = new String[]{"Mriq29lS8vjEPztqvg4mnlhqPa1pf4jw", "J0ebGdEZD5oKohgNzUxMA3JiHaSF4bRJ", "IT9tvlYp44pYwsfxgtsksFS", "El43mrOkb3qqMjbYlNbneDDC3riKbt8u", "SsyQgLhJr8BA6K4Jeu0226NIXlotTSUK", "5pKSfcHcmxRzGJ6MCKbxSHPk9j0pnkgf", "vZ9Xs81YGHnjRjGsoTeSsIOHxP", "Y9Sammkz"};
    }

    public AnonymousClass85(C1080Wh c1080Wh, InterfaceC0818Mb interfaceC0818Mb, JE je, AnonymousClass16 anonymousClass16, C7H c7h, M6 m6) {
        super(c1080Wh, interfaceC0818Mb, je, anonymousClass16, c7h, m6);
        this.A08 = new P7(this);
        this.A0G = new JH() { // from class: com.facebook.ads.redexgen.X.8e
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(JJ jj) {
                AnonymousClass85.A0M(AnonymousClass85.this, true);
            }
        };
        this.A0F = new AbstractC0754Jk() { // from class: com.facebook.ads.redexgen.X.8D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C0761Jt c0761Jt) {
                AnonymousClass85.A0N(AnonymousClass85.this, true);
                AnonymousClass85.this.A0Q();
            }
        };
        this.A0E = new AbstractC0766Jy() { // from class: com.facebook.ads.redexgen.X.8A
            @Override // com.facebook.ads.redexgen.X.C9K
            public final /* bridge */ /* synthetic */ void A04(C04747t c04747t) {
            }
        };
        this.A0H = new AbstractC0724Ie() { // from class: com.facebook.ads.redexgen.X.88
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C04737s c04737s) {
                AnonymousClass85.A0B(AnonymousClass85.this, c04737s);
                AnonymousClass85.A0C(AnonymousClass85.this, c04737s);
                AnonymousClass85.A01(AnonymousClass85.this).A0L(c04737s);
            }
        };
        this.A0C = new K4() { // from class: com.facebook.ads.redexgen.X.87
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C7v c7v) {
                AnonymousClass85 anonymousClass85 = AnonymousClass85.this;
                AnonymousClass85.A0A(anonymousClass85, c7v, AnonymousClass85.A02(anonymousClass85).getState() != EnumC0898Pe.A06);
            }
        };
        this.A0D = new AnonymousClass86(this);
        boolean z = false;
        this.A06 = false;
        this.A07 = false;
        this.A05 = false;
        this.A03 = false;
        this.A0A = new C0792Lb(super.A03);
        this.A0A.setFunnelLoggingHandler(super.A05);
        this.A0A.getEventBus().A04(this.A0G, this.A0F, this.A0E, this.A0H, this.A0C, this.A0D);
        this.A0B = new C7w(super.A03, super.A04, this.A0A, super.A01.A0Q());
        this.A09 = new C0872Oe(super.A03, super.A09, super.A01.A0V(), m6);
        this.A0I = new HS(super.A03, super.A05);
        this.A0J = new H2(super.A03);
        A07();
        this.A0A.setVideoURI(super.A02.A0M(super.A01.A0M().A0E().A08()));
        A05();
        this.A04 = super.A01.A0M().A0E().A03() <= 0;
        if (super.A01.A0M().A0L() && super.A01.A0M().A0E().A02() > 0) {
            z = true;
        }
        this.A02 = z;
        C0795Le.A0P(this, super.A01.A0L().A01().A07(true));
    }

    private AbstractC0856No A00(int i) {
        return C0857Np.A00(new C0859Nr(super.A03, super.A04, super.A08, super.A01, this.A0A, super.A0A, super.A06).A0D(super.A07.getToolbarHeight()).A0F(super.A07).A0C(i).A0E(this.A0I).A0G(this.A0J).A0H(), null, true);
    }

    public static /* synthetic */ AbstractC0856No A01(AnonymousClass85 anonymousClass85) {
        return anonymousClass85.A00;
    }

    public static /* synthetic */ C0792Lb A02(AnonymousClass85 anonymousClass85) {
        return anonymousClass85.A0A;
    }

    private void A04() {
        this.A0A.postDelayed(new P5(this), J8.A0I(super.A03));
    }

    private void A05() {
        this.A0A.postDelayed(new P0(this), J8.A0J(super.A03));
    }

    private void A06() {
        this.A04 = true;
        AbstractC0856No abstractC0856No = this.A00;
        if (abstractC0856No != null) {
            abstractC0856No.A0Z();
        }
    }

    private void A07() {
        this.A0A.A0Z(this.A0J);
        this.A0A.A0Z(this.A0I);
        if (!TextUtils.isEmpty(super.A01.A0M().A0E().A07())) {
            C04597a c04597a = new C04597a(super.A03);
            this.A0A.A0Z(c04597a);
            c04597a.setImage(super.A01.A0M().A0E().A07());
        }
        C7B c7b = new C7B(super.A03, true, super.A05);
        this.A0A.A0Z(c7b);
        this.A0A.A0Z(new HU(c7b, P4.A03, true));
        this.A0A.A0Z(new C7R(super.A03));
    }

    public static /* synthetic */ void A0A(AnonymousClass85 anonymousClass85, C7v c7v, boolean z) {
        anonymousClass85.A0E(c7v, z);
    }

    public static /* synthetic */ void A0B(AnonymousClass85 anonymousClass85, C04737s c04737s) {
        anonymousClass85.A0G(c04737s);
    }

    public static /* synthetic */ void A0C(AnonymousClass85 anonymousClass85, C04737s c04737s) {
        anonymousClass85.A0F(c04737s);
    }

    public void A0E(C7v c7v, boolean z) {
        if (this.A05) {
            return;
        }
        this.A05 = true;
        if (!this.A04) {
            A06();
        }
        AbstractC0856No abstractC0856No = this.A00;
        if (A0L[6].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[1] = "skYYV88BTcDGkk1Ge0IaKZH0HqJ76mgM";
        strArr[1] = "skYYV88BTcDGkk1Ge0IaKZH0HqJ76mgM";
        if (abstractC0856No != null) {
            abstractC0856No.A0K(c7v);
        }
        super.A07.setToolbarActionMode(getCloseButtonStyle());
        super.A07.setToolbarActionMessage(A03(0, 0, 25));
        A0I(z);
    }

    public void A0F(C04737s c04737s) {
        if (this.A0A.getState() == EnumC0898Pe.A02 && J8.A0w(super.A03)) {
            this.A0A.postDelayed(new P8(this, c04737s), 5000L);
        }
    }

    public void A0G(C04737s c04737s) {
        int A00 = c04737s.A00();
        float min = A00 / Math.min(super.A01.A0M().A0E().A03() * 1000.0f, this.A0A.getDuration());
        super.A07.setProgress(100.0f * min);
        if (min >= 1.0f && !this.A04) {
            A06();
            super.A07.setToolbarActionMode(getCloseButtonStyle());
        }
        if (this.A02) {
            int totalSecondsForReward = A00 / 1000;
            int A02 = super.A01.A0M().A0E().A02() - totalSecondsForReward;
            if (A02 > 0) {
                AnonymousClass16 anonymousClass16 = super.A01;
                String[] strArr = A0L;
                String str = strArr[2];
                String str2 = strArr[7];
                int length = str.length();
                int remainingSecondsForReward = str2.length();
                if (length == remainingSecondsForReward) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0L;
                strArr2[0] = "PXM0w4DTcyhv6xVVxlaJPbpxowOdlGPl";
                strArr2[4] = "ZagmJHoPVKqTZKI94Zh80WtjAbW4VeCE";
                super.A07.setToolbarActionMessage(anonymousClass16.A0P().A00().replace(A03(0, 6, 74), String.valueOf(A02)));
                return;
            }
            super.A07.setToolbarActionMessage(A03(0, 0, 25));
            A0I(false);
        }
    }

    public void A0H(String str) {
        int i = 0;
        int i2 = 0;
        C0792Lb c0792Lb = this.A0A;
        if (c0792Lb != null) {
            i = c0792Lb.getCurrentPositionInMillis();
            i2 = this.A0A.getDuration();
        }
        super.A03.A04().A82(A03(6, 5, 12), C04848i.A2B, new C04858j(str));
        if (J8.A0x(super.A03)) {
            A0E(new C7v(i, i2), false);
            return;
        }
        M6 m6 = super.A08;
        if (A0L[3].charAt(0) == 'z') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[3] = "uhCmlX27t5rzSWT78KYVdoY12DutI5Be";
        strArr[3] = "uhCmlX27t5rzSWT78KYVdoY12DutI5Be";
        m6.A3s(super.A09.A6C());
        super.A08.A3s(super.A09.A67());
    }

    private synchronized void A0I(boolean z) {
        boolean z2 = this.A02;
        String[] strArr = A0L;
        if (strArr[2].length() != strArr[7].length()) {
            String[] strArr2 = A0L;
            strArr2[6] = "RUkVKvLXKou3DkajJbljeqXSK8";
            strArr2[6] = "RUkVKvLXKou3DkajJbljeqXSK8";
            if (z2 && !z) {
                super.A08.A3s(super.A09.A5F());
                this.A09.A06();
                this.A02 = false;
                if (this.A00 != null) {
                    this.A00.A0X();
                }
                return;
            }
            this.A02 = false;
            String[] strArr3 = A0L;
            if (strArr3[2].length() != strArr3[7].length()) {
                String[] strArr4 = A0L;
                strArr4[6] = "pCCqOlrdcXyBK9Nv0jyTBmGbmh";
                strArr4[6] = "pCCqOlrdcXyBK9Nv0jyTBmGbmh";
                return;
            }
        }
        throw new RuntimeException();
    }

    public static /* synthetic */ boolean A0M(AnonymousClass85 anonymousClass85, boolean z) {
        anonymousClass85.A06 = z;
        return z;
    }

    public static /* synthetic */ boolean A0N(AnonymousClass85 anonymousClass85, boolean z) {
        anonymousClass85.A07 = z;
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.QZ
    public final void A0R() {
        C0795Le.A0O(this.A00);
        C0795Le.A0O(super.A07);
        this.A0A.setVolume(super.A01.A0M().A0E().A09() ? 0.0f : 1.0f);
        this.A0A.A0Y(EnumC0886Os.A03, 20);
        AbstractC0856No abstractC0856No = this.A00;
        if (abstractC0856No != null && this.A02) {
            abstractC0856No.A0Y();
        }
        AbstractC0856No abstractC0856No2 = this.A00;
        if (abstractC0856No2 != null && !this.A04) {
            abstractC0856No2.A0a();
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.X.QZ
    public final void A0T(AnonymousClass51 anonymousClass51) {
        anonymousClass51.A0L(this.A08);
        this.A00 = A00(anonymousClass51.A0I().getResources().getConfiguration().orientation);
        addView(this.A00, QZ.A0D);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        C0795Le.A0K(this.A00);
        C0795Le.A0K(super.A07);
        AbstractC0856No abstractC0856No = this.A00;
        setUpFullscreenMode(abstractC0856No != null && abstractC0856No.A0c());
    }

    @Override // com.facebook.ads.redexgen.X.QZ
    public final boolean A0U() {
        AbstractC0856No abstractC0856No = this.A00;
        return abstractC0856No != null && abstractC0856No.A0d(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void AAO(boolean z) {
        if (this.A0A.A0f()) {
            return;
        }
        this.A01 = this.A0A.getVideoStartReason();
        this.A03 = z;
        this.A0A.A0b(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void AAl(boolean z) {
        if (this.A0A.A0g() || this.A05 || this.A0A.getState() == EnumC0898Pe.A06 || this.A01 == null) {
            return;
        }
        if (!this.A03 || z) {
            C0792Lb c0792Lb = this.A0A;
            EnumC0886Os enumC0886Os = this.A01;
            String[] strArr = A0L;
            if (strArr[0].charAt(8) == strArr[4].charAt(8)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[1] = "5vrQw9TAnlgebYwA7tbvLzoGHglPMjBr";
            strArr2[1] = "5vrQw9TAnlgebYwA7tbvLzoGHglPMjBr";
            c0792Lb.A0Y(enumC0886Os, 19);
        }
    }

    private int getCloseButtonStyle() {
        AbstractC0856No abstractC0856No = this.A00;
        if (abstractC0856No != null) {
            return abstractC0856No.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.QZ, com.facebook.ads.redexgen.X.M7
    public final void onDestroy() {
        super.onDestroy();
        AbstractC0856No abstractC0856No = this.A00;
        if (abstractC0856No != null) {
            abstractC0856No.A0W();
        }
        C0792Lb c0792Lb = this.A0A;
        if (c0792Lb != null) {
            if (!this.A05) {
                c0792Lb.A0X(EnumC0882Oo.A03);
            }
            this.A0A.getEventBus().A05(this.A0G, this.A0F, this.A0E, this.A0H, this.A0C, this.A0D);
            this.A0A.A0S();
        }
        this.A0B.A0h();
    }
}