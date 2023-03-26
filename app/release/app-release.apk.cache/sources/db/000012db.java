package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Nz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0867Nz extends RelativeLayout {
    public final View A00;
    public final C0848Ng A01;

    public C0867Nz(C1080Wh c1080Wh, View view) {
        super(c1080Wh);
        this.A00 = view;
        this.A01 = new C0848Ng(c1080Wh);
        C0795Le.A0N(this.A01);
    }

    public final void A00(int i) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i));
    }

    public final void A01(@Nullable C0853Nl c0853Nl, boolean z) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (c0853Nl != null) {
            if (z) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                c0853Nl.setAlignment(3);
                layoutParams2.setMargins(AbstractC0856No.A09 / 2, AbstractC0856No.A09 / 2, AbstractC0856No.A09 / 2, AbstractC0856No.A09 / 2);
                linearLayout.addView(c0853Nl, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                C0795Le.A0W(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.addRule(3, this.A01.getId());
                layoutParams3.setMargins(0, AbstractC0856No.A09, 0, 0);
                c0853Nl.setAlignment(17);
                addView(c0853Nl, layoutParams3);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}