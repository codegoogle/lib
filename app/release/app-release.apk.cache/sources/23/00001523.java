package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/* loaded from: assets/audience_network.dex */
public final class XT extends AbstractC0823Mg {
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C1080Wh A03;
    public static final int A06 = (int) (C0795Le.A01 * 8.0f);
    public static final int A05 = (int) (C0795Le.A01 * 10.0f);
    public static final int A04 = (int) (C0795Le.A01 * 44.0f);

    public XT(C1080Wh c1080Wh, JE je, String str) {
        super(c1080Wh, je, str);
        this.A03 = c1080Wh;
        this.A00 = new ImageView(getContext());
        ImageView imageView = this.A00;
        int i = A05;
        imageView.setPadding(i, i, i, i);
        this.A00.setColorFilter(-10459280);
        int i2 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        C0795Le.A0P(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        LinearLayout linearLayout = this.A01;
        int i3 = A06;
        linearLayout.setPadding(i3, i3, i3, i3);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final void A0K() {
        this.A00.setImageBitmap(C0804Ln.A00(EnumC0803Lm.CROSS));
        this.A00.setOnClickListener(new View$OnClickListenerC0841Mz(this));
        C0827Mk c0827Mk = new C0827Mk(this.A03);
        c0827Mk.setData(AnonymousClass23.A0B(this.A03.A00()), EnumC0803Lm.HIDE_AD);
        c0827Mk.setOnClickListener(new N0(this, c0827Mk));
        C0827Mk c0827Mk2 = new C0827Mk(this.A03);
        c0827Mk2.setData(AnonymousClass23.A0F(this.A03.A00()), EnumC0803Lm.REPORT_AD);
        c0827Mk2.setOnClickListener(new N1(this, c0827Mk2));
        C0827Mk c0827Mk3 = new C0827Mk(this.A03);
        c0827Mk3.setData(AnonymousClass23.A0G(this.A03.A00()), EnumC0803Lm.AD_CHOICES_ICON);
        c0827Mk3.setOnClickListener(new N2(this, c0827Mk3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A06;
        layoutParams.setMargins(i, i, i, i);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, 0);
        layoutParams2.gravity = 17;
        layoutParams2.weight = 1.0f;
        C0795Le.A0X(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams2);
        linearLayout.addView(c0827Mk, layoutParams);
        linearLayout.addView(c0827Mk2, layoutParams);
        linearLayout.addView(c0827Mk3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final void A0L() {
        C0795Le.A0L(this);
        C0795Le.A0M(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final void A0M(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24) {
        String A0B;
        EnumC0803Lm enumC0803Lm;
        int i;
        this.A00.setOnClickListener(null);
        if (anonymousClass24 == AnonymousClass24.A05) {
            A0B = AnonymousClass23.A09(this.A03.A00());
            enumC0803Lm = EnumC0803Lm.REPORT_AD;
            i = -552389;
        } else {
            A0B = AnonymousClass23.A0B(this.A03.A00());
            enumC0803Lm = EnumC0803Lm.HIDE_AD;
            i = -13272859;
        }
        C0822Mf A0M = new C0821Me(this.A03, this.A0A).A0I(A0B).A0H(AnonymousClass23.A07(this.A03.A00())).A0F(anonymousClass26.A04()).A0K(false).A0E(enumC0803Lm).A0D(i).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        C0795Le.A0X(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(A0M, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final void A0N(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24) {
        C0840My c0840My = new C0840My(this.A03, anonymousClass26, this.A0A, anonymousClass24 == AnonymousClass24.A05 ? EnumC0803Lm.REPORT_AD : EnumC0803Lm.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(C0804Ln.A00(EnumC0803Lm.BACK_ARROW));
        this.A00.setOnClickListener(new N3(this));
        C0795Le.A0X(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c0840My, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final boolean A0O() {
        return true;
    }
}