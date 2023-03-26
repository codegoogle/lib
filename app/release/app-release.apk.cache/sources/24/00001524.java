package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class XU extends AbstractC0823Mg {
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C1080Wh A04;
    public static final int A07 = (int) (C0795Le.A01 * 4.0f);
    public static final int A06 = (int) (C0795Le.A01 * 10.0f);
    public static final int A05 = (int) (C0795Le.A01 * 44.0f);

    public XU(C1080Wh c1080Wh, JE je, String str) {
        super(c1080Wh, je, str);
        this.A04 = c1080Wh;
        this.A01 = new ImageView(getContext());
        ImageView imageView = this.A01;
        int i = A06;
        imageView.setPadding(i, i, i, i);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        int i2 = A05;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        C0795Le.A0P(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final void A0K() {
        this.A01.setImageBitmap(C0804Ln.A00(EnumC0803Lm.CROSS));
        this.A01.setOnClickListener(new View$OnClickListenerC0832Mp(this));
        C0827Mk c0827Mk = new C0827Mk(this.A04);
        c0827Mk.setData(AnonymousClass23.A0B(this.A04.A00()), EnumC0803Lm.HIDE_AD);
        c0827Mk.setOnClickListener(new View$OnClickListenerC0833Mq(this, c0827Mk));
        C0827Mk c0827Mk2 = new C0827Mk(this.A04);
        c0827Mk2.setData(AnonymousClass23.A0F(this.A04.A00()), EnumC0803Lm.REPORT_AD);
        c0827Mk2.setOnClickListener(new View$OnClickListenerC0834Mr(this, c0827Mk2));
        C0827Mk c0827Mk3 = new C0827Mk(this.A04);
        c0827Mk3.setData(AnonymousClass23.A0G(this.A04.A00()), EnumC0803Lm.AD_CHOICES_ICON);
        c0827Mk3.setOnClickListener(new Ms(this, c0827Mk3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A07;
        layoutParams.setMargins(0, i, i, i);
        C0795Le.A0X(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c0827Mk, layoutParams);
        this.A02.addView(c0827Mk2, layoutParams);
        this.A02.addView(c0827Mk3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final void A0L() {
        C0795Le.A0L(this);
        C0795Le.A0M(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final void A0M(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        C0795Le.A0b(textView, true, 14);
        textView.setText(AnonymousClass23.A07(this.A04.A00()));
        textView.setGravity(17);
        C0795Le.A0X(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final void A0N(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24) {
        C0795Le.A0X(this.A03);
        this.A01.setImageBitmap(C0804Ln.A00(EnumC0803Lm.BACK_ARROW));
        this.A01.setOnClickListener(new View$OnClickListenerC0835Mt(this));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A07;
        layoutParams.setMargins(0, i, i, i);
        for (AnonymousClass26 anonymousClass262 : anonymousClass26.A05()) {
            C0827Mk c0827Mk = new C0827Mk(this.A04);
            c0827Mk.setData(anonymousClass262.A04(), null);
            c0827Mk.setOnClickListener(new View$OnClickListenerC0836Mu(this, c0827Mk, anonymousClass262));
            this.A02.addView(c0827Mk, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final boolean A0O() {
        return true;
    }
}