package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.sr;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.9a  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05029a extends Si implements MQ {
    public static byte[] A0D;
    public static String[] A0E;
    @Nullable
    public View A00;
    public View A01;
    @Nullable
    public ImageView A02;
    public C1080Wh A03;
    @Nullable
    public M1 A04;
    public C0871Od A05;
    @Nullable
    public C0674Gg A06;
    public boolean A07;
    public final FrameLayout A08;
    public final M6 A09;
    public final C0792Lb A0A;
    public final H2 A0B;
    public final AtomicBoolean A0C;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0D = new byte[]{-53, -60, bx.l7, -56, -30, -42, -41, -60, -43, -41, -52, -47, -54, -30, -60, -47, -52, -48, -60, -41, -52, -46, -47, -42, -30, -45, -49, -60, -36, -56, -57, -51, -48, -44, -58, -32, -45, -58, -40, -62, -45, -59, -32, -44, -60, -45, -58, -58, -49, -32, -44, -55, -48, -40, -49, -53, -75, -57, -45, -71, -62, -72, -45, -73, -75, -58, -72, -45, -57, -68, -61, -53, -62, -86, -74, -76, 117, -83, -88, -86, -84, -87, -74, -74, -78, 117, -88, -85, -70, 117, -80, -75, -69, -84, -71, -70, -69, -80, -69, -80, -88, -77, 117, -83, -80, -75, -80, -70, -81, -90, -88, -86, -69, -80, -67, -80, -69, -64};
    }

    public static void A0F() {
        A0E = new String[]{"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};
    }

    static {
        A0F();
        A0E();
    }

    public C05029a(C0860Ns c0860Ns) {
        super(c0860Ns, false);
        this.A0C = new AtomicBoolean(false);
        this.A07 = false;
        this.A03 = c0860Ns.A05();
        this.A04 = c0860Ns.A08();
        this.A01 = new View(this.A03);
        C0795Le.A0N(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A09();
        this.A09 = c0860Ns.A09();
        C0854Nm.A00(c0860Ns.A05(), this, getAdInfo().A0E().A07());
        this.A0A = A02(c0860Ns);
        getAdDetailsView().bringToFront();
        this.A0B = A04(c0860Ns);
        A0f();
        this.A05 = new C0871Od(this.A03, c0860Ns.A06(), getAdDataBundle());
        this.A08 = new FrameLayout(getContext());
        if (!J8.A1Q(this.A03)) {
            A07();
        }
    }

    private C0792Lb A02(C0860Ns c0860Ns) {
        C0792Lb c0792Lb = (C0792Lb) c0860Ns.A02();
        int A0e = A0e(c0860Ns.A08());
        ImageView imageView = (ImageView) c0860Ns.A03();
        imageView.setPadding(Si.A0D, Si.A0D, Si.A0D, Si.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Si.A0E, Si.A0E);
        layoutParams.setMargins(0, A0e, Si.A0C, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        if (J8.A1M(this.A03)) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            NX adDetailsView = getAdDetailsView();
            RelativeLayout.LayoutParams simpleVideoViewParams = adDetailsView.A0C(this.A01);
            adDetailsView.setLayoutParams(simpleVideoViewParams);
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams2.addRule(13);
            } else {
                layoutParams2.addRule(0, this.A01.getId());
                layoutParams2.setMargins(0, 0, 0, 0);
            }
            this.A02 = imageView;
            addView(c0792Lb, layoutParams2);
            addView(imageView, layoutParams);
        } else {
            RelativeLayout.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
            videoViewParams.addRule(13);
            addView(c0792Lb, videoViewParams);
            c0792Lb.addView(imageView, layoutParams);
        }
        return c0792Lb;
    }

    private H2 A04(C0860Ns c0860Ns) {
        H2 A0A = c0860Ns.A0A();
        A0A.A0A(-1, Si.A09);
        if (J8.A1M(this.A03)) {
            if (getResources().getConfiguration().orientation == 1) {
                setUpPortraitAdDetails(A0A);
            } else {
                setUpLandscapeAdDetails(A0A);
            }
        } else {
            A0A.setPadding(Si.A0H, Si.A0H, Si.A0H, Si.A0H);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, Si.A0G);
            layoutParams.addRule(12);
            addView(A0A, layoutParams);
        }
        return A0A;
    }

    private void A07() {
        String title;
        RewardData A0K = getAdDataBundle().A0K();
        if (A0K == null) {
            title = getAdDataBundle().A0N().A06();
        } else {
            title = getAdDataBundle().A0N().A07(A0K.getCurrency(), A0K.getQuantity());
        }
        MF mf = new MF(getAdContextWrapper(), -1, sr.t, title, null, getAdDataBundle().A0N().A05(), getAdDataBundle().A0N().A04(), C0804Ln.A00(EnumC0803Lm.REWARD_ICON));
        mf.A02.setOnClickListener(new View$OnClickListenerC0861Nt(this));
        mf.A01.setOnClickListener(new View$OnClickListenerC0862Nu(this));
        this.A08.addView(mf, new RelativeLayout.LayoutParams(-1, -1));
    }

    private void A08() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0F();
            this.A0A.A0a(getAnimationPlugin());
        }
    }

    private void A09() {
        M1 m1 = this.A04;
        if (m1 == null) {
            return;
        }
        this.A06 = new C0674Gg(m1, 400, -m1.getToolbarHeight(), 0);
    }

    private void A0A() {
        new JL(getAdDataBundle().A0Q(), getAdEventManager()).A03(JK.A0n, null);
        if (!getAdInfo().A0N()) {
            return;
        }
        this.A0C.set(true);
        C0795Le.A0X(this);
        C0795Le.A0K(this.A0A);
        C0795Le.A0d(this.A0A, this.A0B, this.A08, this.A00);
        C0795Le.A0O(this.A04);
        C0871Od c0871Od = this.A05;
        View$OnClickListenerC1087Wo ctaButton = getCtaButton();
        String[] strArr = A0E;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        strArr2[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        Pair<EnumC0870Oc, View> A03 = c0871Od.A03(ctaButton);
        this.A00 = (View) A03.second;
        int i = C0863Nv.A00[((EnumC0870Oc) A03.first).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C0795Le.A0d(getAdDetailsView());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(Si.A0F, Si.A0F, Si.A0F, Si.A0F);
            addView(this.A00, layoutParams);
            return;
        }
        getAdDetailsView().setVisibility(0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (J8.A1M(this.A03)) {
            ImageView imageView = this.A02;
            if (imageView != null) {
                String[] strArr3 = A0E;
                if (strArr3[2].length() != strArr3[0].length()) {
                    String[] strArr4 = A0E;
                    strArr4[7] = "RenllHEOEhUEXuJGVHYKXOkiOEbWR";
                    strArr4[4] = "Ez9H6xpGZ9";
                    imageView.setVisibility(8);
                } else {
                    String[] strArr5 = A0E;
                    strArr5[2] = "KicgKgsrHX1lzbvbA0fubHpFySDNt";
                    strArr5[0] = "T8uqPR7oq7Ja3xFAu7WdainZogpwN";
                    imageView.setVisibility(8);
                }
            }
            getAdDetailsView().setLayoutParams(getAdDetailsView().A0B(this.A01));
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams2.setMargins(0, A0e(this.A04), 0, AbstractC0856No.A09);
                layoutParams2.addRule(2, getAdDetailsView().getId());
            } else {
                layoutParams2.setMargins(0, AbstractC0856No.A09, 0, AbstractC0856No.A09);
                layoutParams2.addRule(0, this.A01.getId());
            }
        } else {
            layoutParams2.setMargins(0, A0e(this.A04), 0, 0);
            layoutParams2.addRule(2, getAdDetailsView().getId());
        }
        addView(this.A00, layoutParams2);
    }

    private void A0B() {
        M1 m1;
        if (!this.A0A.A0g()) {
            this.A0A.A0c(false, false, 11);
        }
        if (J8.A1Q(this.A03) && (m1 = this.A04) != null) {
            m1.A06(this);
        } else {
            M1 m12 = this.A04;
            if (m12 != null) {
                C0795Le.A0K(m12);
            }
            C0795Le.A0Q(this.A0A, 4);
            C0795Le.A0Q(this.A0B, 4);
            C0795Le.A0Q(getAdDetailsView(), 4);
            addView(this.A08, new RelativeLayout.LayoutParams(-1, -1));
        }
        this.A07 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        if (getAdInfo().A0N()) {
            this.A0A.A0X(EnumC0882Oo.A05);
            return;
        }
        M6 m6 = this.A09;
        if (A0E[3].length() != 25) {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[1] = "Zliat4mU5XNL19AyOd3jcD22cYPYEARz";
        strArr[1] = "Zliat4mU5XNL19AyOd3jcD22cYPYEARz";
        m6.A3s(A06(73, 45, 58));
    }

    private void A0D() {
        C0674Gg c0674Gg = this.A06;
        if (c0674Gg != null) {
            c0674Gg.A3O(true, false);
        }
        if (getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A3O(true, false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final void A0K(C7v c7v) {
        super.A0K(c7v);
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final void A0L(C04737s c04737s) {
        super.A0L(c04737s);
        int duration = this.A0A.getDuration() - c04737s.A00();
        if (getAnimationPlugin() != null) {
            int remainingVideoTimeInMillis = A0E[1].charAt(18);
            if (remainingVideoTimeInMillis != 51) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            strArr[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            if (duration < 3000 && getAnimationPlugin().A0K()) {
                getAnimationPlugin().A0G();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final void A0W() {
        super.A0W();
        A08();
        this.A04 = null;
    }

    @Override // com.facebook.ads.redexgen.X.Si, com.facebook.ads.redexgen.X.AbstractC0856No
    public final void A0b(AnonymousClass19 anonymousClass19, String str, double d, @Nullable Bundle bundle) {
        super.A0b(anonymousClass19, str, d, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A06(0, 31, 118), false)) {
            A0D();
        }
        if (bundle.getBoolean(A06(55, 18, 103), false)) {
            A0A();
        }
        if (bundle.getBoolean(A06(31, 24, 116), false)) {
            A0B();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final boolean A0c() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final boolean A0d(boolean z) {
        if (z && !this.A07) {
            boolean z2 = this.A0C.get();
            String[] strArr = A0E;
            if (strArr[7].length() != strArr[4].length()) {
                String[] strArr2 = A0E;
                strArr2[2] = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw";
                strArr2[0] = "8CoNQoXVMdzgwU1krh95bRLsSKKH4";
                if (!z2) {
                    A0B();
                    return true;
                }
            }
            throw new RuntimeException();
        }
        boolean A0N = getAdInfo().A0N();
        if (A0E[5].charAt(17) != 'k') {
            String[] strArr3 = A0E;
            strArr3[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
            strArr3[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
            if (A0N && !this.A0C.get()) {
                this.A0A.A0X(EnumC0882Oo.A06);
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.Si
    public final void A0f() {
        super.A0f();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A7s(this.A0A);
        }
    }

    public final boolean A0g() {
        return getAdInfo().A0N();
    }

    @Override // com.facebook.ads.redexgen.X.MQ
    public final void A8o() {
        this.A07 = false;
        this.A0A.A0Y(EnumC0886Os.A03, 15);
    }

    @Override // com.facebook.ads.redexgen.X.MQ
    public final void A8p() {
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        if (A0g() && !this.A0C.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.X.Si, com.facebook.ads.redexgen.X.AbstractC0856No, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (J8.A1M(this.A03)) {
            boolean z = configuration.orientation == 1;
            if (!this.A0C.get()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (z) {
                    setUpPortraitAdDetails(this.A0B);
                    layoutParams.addRule(13);
                } else {
                    setUpLandscapeAdDetails(this.A0B);
                    layoutParams.addRule(0, this.A01.getId());
                    layoutParams.setMargins(0, 0, 0, 0);
                }
                C0792Lb c0792Lb = this.A0A;
                String[] strArr = A0E;
                if (strArr[7].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[1] = "DO7In235juv9PXUKV934zSaX5akZYCRG";
                strArr2[1] = "DO7In235juv9PXUKV934zSaX5akZYCRG";
                c0792Lb.setLayoutParams(layoutParams);
            } else if (this.A00 == null) {
            } else {
                ImageView imageView = this.A02;
                if (A0E[5].charAt(17) == 'k') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0E;
                strArr3[5] = "g7uXpIwsYCOJvIzf4Zz9qplJQO82wATZ";
                strArr3[5] = "g7uXpIwsYCOJvIzf4Zz9qplJQO82wATZ";
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                getAdDetailsView().setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                getAdDetailsView().setLayoutParams(getAdDetailsView().A0B(this.A01));
                if (z) {
                    layoutParams2.setMargins(0, A0e(this.A04), 0, AbstractC0856No.A09);
                    layoutParams2.addRule(2, getAdDetailsView().getId());
                } else {
                    layoutParams2.setMargins(0, AbstractC0856No.A09, 0, AbstractC0856No.A09);
                    layoutParams2.addRule(0, this.A01.getId());
                }
                this.A00.setLayoutParams(layoutParams2);
            }
        }
    }

    private void setUpLandscapeAdDetails(H2 h2) {
        getAdDetailsView().removeAllViews();
        removeView(h2);
        getAdDetailsView().setLayoutParams(getAdDetailsView().A0C(this.A01));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C1165Zs.A0G);
        layoutParams.addRule(12);
        addView(h2, layoutParams);
    }

    private void setUpPortraitAdDetails(H2 h2) {
        getAdDetailsView().removeAllViews();
        removeView(h2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C1165Zs.A0H);
        layoutParams.setMargins(0, 0, 0, C1165Zs.A0I);
        getAdDetailsView().addView(h2, layoutParams);
        getAdDetailsView().setLayoutParams(getAdDetailsView().A0C(this.A01));
    }
}