package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Mf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0822Mf extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C1080Wh A02;
    public final InterfaceC0825Mi A03;
    public final boolean A04;
    public static final int A08 = (int) (C0795Le.A01 * 16.0f);
    public static final int A09 = (int) (C0795Le.A01 * 8.0f);
    public static final int A0C = (int) (C0795Le.A01 * 44.0f);
    public static final int A07 = (int) (C0795Le.A01 * 10.0f);
    public static final int A06 = A08 - A07;
    public static final int A0D = (int) (C0795Le.A01 * 75.0f);
    public static final int A0A = (int) (C0795Le.A01 * 25.0f);
    public static final int A0E = (int) (C0795Le.A01 * 45.0f);
    public static final int A0B = (int) (C0795Le.A01 * 15.0f);
    public static final int A05 = (int) (C0795Le.A01 * 16.0f);

    public C0822Mf(C0821Me c0821Me) {
        super(C0821Me.A01(c0821Me));
        this.A02 = C0821Me.A01(c0821Me);
        this.A03 = C0821Me.A03(c0821Me);
        this.A01 = C0821Me.A09(c0821Me) ? A0D : A0E;
        this.A00 = C0821Me.A09(c0821Me) ? A0A : A0B;
        this.A04 = C0821Me.A0A(c0821Me);
        setClickable(true);
        View A01 = A01(c0821Me);
        View A00 = A00(c0821Me);
        View footerView = getFooterView();
        C0795Le.A0N(A01);
        C0795Le.A0N(A00);
        C0795Le.A0N(footerView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        layoutParams2.addRule(3, A01.getId());
        layoutParams2.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12);
        int i = A08;
        layoutParams3.setMargins(i, 0, i, i);
        addView(A01, layoutParams);
        addView(A00, layoutParams2);
        addView(footerView, layoutParams3);
        footerView.setVisibility(C0821Me.A0B(c0821Me) ? 0 : 8);
    }

    public /* synthetic */ C0822Mf(C0821Me c0821Me, View$OnClickListenerC0819Mc view$OnClickListenerC0819Mc) {
        this(c0821Me);
    }

    private View A00(C0821Me c0821Me) {
        ImageView imageView = new ImageView(getContext());
        int i = this.A00;
        imageView.setPadding(i, i, i, i);
        imageView.setImageBitmap(C0804Ln.A00(C0821Me.A02(c0821Me)));
        imageView.setColorFilter(-1);
        int i2 = this.A01;
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(i2, i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(C0821Me.A00(c0821Me));
        C0795Le.A0W(imageView, gradientDrawable);
        titleParams.gravity = 17;
        int i3 = A08;
        titleParams.setMargins(i3, 0, i3, i3);
        TextView textView = new TextView(getContext());
        C0795Le.A0b(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(C0821Me.A04(c0821Me));
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i4 = A08;
        layoutParams.setMargins(i4, 0, i4, i4);
        TextView textView2 = new TextView(getContext());
        C0795Le.A0b(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(C0821Me.A05(c0821Me));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i5 = A08;
        layoutParams2.setMargins(i5, 0, i5, i5);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        linearLayout.addView(textView2, layoutParams2);
        if (C0821Me.A08(c0821Me)) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(C0821Me.A06(c0821Me))) {
                C0847Nf c0847Nf = new C0847Nf(this.A02);
                int i6 = A0E;
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i6, i6);
                layoutParams3.setMargins(0, 0, A09, 0);
                c0847Nf.setFullCircleCorners(true);
                AsyncTaskC1091Ws asyncTaskC1091Ws = new AsyncTaskC1091Ws(c0847Nf, this.A02);
                int i7 = A0E;
                asyncTaskC1091Ws.A06(i7, i7).A08(C0821Me.A06(c0821Me));
                linearLayout2.addView(c0847Nf, layoutParams3);
            }
            C0827Mk c0827Mk = new C0827Mk(this.A02);
            c0827Mk.setData(C0821Me.A07(c0821Me), EnumC0803Lm.CHECKMARK);
            c0827Mk.setSelected(true);
            LinearLayout.LayoutParams selectedOptionParams = new LinearLayout.LayoutParams(-2, -2);
            linearLayout2.addView(c0827Mk, selectedOptionParams);
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C0821Me c0821Me) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (C0821Me.A0C(c0821Me)) {
            ImageView imageView = new ImageView(getContext());
            int i = A07;
            imageView.setPadding(i, i, i, i);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(C0804Ln.A00(EnumC0803Lm.CROSS));
            imageView.setOnClickListener(new View$OnClickListenerC0819Mc(this));
            int i2 = A0C;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            int i3 = A06;
            layoutParams.setMargins(i3, i3, i3, i3);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(C0804Ln.A00(EnumC0803Lm.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i = A05;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        C0795Le.A0b(textView, false, 16);
        textView.setTextColor(-13272859);
        int i2 = A09;
        textView.setPadding(i2, i2, i2, i2);
        textView.setText(AnonymousClass23.A0D(this.A02.A00()));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new View$OnClickListenerC0820Md(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }
}