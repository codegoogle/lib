package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Mk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0827Mk extends LinearLayout {
    public boolean A00;
    public final ImageView A01;
    public final TextView A02;
    public static final int A04 = (int) (C0795Le.A01 * 16.0f);
    public static final int A05 = (int) (C0795Le.A01 * 12.0f);
    public static final int A06 = (int) (C0795Le.A01 * 12.0f);
    public static final int A03 = (int) (C0795Le.A01 * 16.0f);

    public C0827Mk(C1080Wh c1080Wh) {
        super(c1080Wh);
        this.A00 = false;
        setOrientation(0);
        int i = A04;
        int i2 = A05;
        setPadding(i, i2, i, i2);
        this.A01 = new ImageView(getContext());
        int i3 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 17;
        this.A02 = new TextView(getContext());
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        addView(this.A01, layoutParams);
        addView(this.A02, layoutParams2);
        A00();
    }

    private void A00() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.A00 ? -13272859 : -1315344);
        gradientDrawable.setCornerRadius(50.0f);
        C0795Le.A0W(this, gradientDrawable);
        C0795Le.A0b(this.A02, false, 14);
        int textColor = this.A00 ? -1 : -10459280;
        this.A02.setTextColor(textColor);
        this.A01.setColorFilter(textColor);
    }

    public final void A01() {
        setSelected(!this.A00);
    }

    public void setData(String str, @Nullable EnumC0803Lm enumC0803Lm) {
        this.A02.setText(str);
        if (enumC0803Lm != null) {
            this.A01.setImageBitmap(C0804Ln.A00(enumC0803Lm));
            this.A01.setVisibility(0);
            this.A02.setPadding(A06, 0, 0, 0);
        } else {
            this.A01.setVisibility(8);
            this.A02.setPadding(0, 0, 0, 0);
        }
        A00();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.A00 = z;
        A00();
    }
}