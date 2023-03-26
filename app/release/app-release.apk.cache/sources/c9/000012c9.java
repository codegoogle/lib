package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.Nh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0849Nh extends LinearLayout {
    public static final int A06 = (int) (C0795Le.A01 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1080Wh A04;
    public final C0850Ni[] A05;

    public C0849Nh(C1080Wh c1080Wh, int i, int i2, int i3, int i4) {
        super(c1080Wh);
        this.A00 = A06;
        this.A04 = c1080Wh;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i3;
        this.A02 = i4;
        this.A05 = new C0850Ni[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            this.A05[i5] = A00();
            addView(this.A05[i5]);
        }
        A01();
    }

    private C0850Ni A00() {
        C0850Ni c0850Ni = new C0850Ni(this.A04, this.A01, this.A02);
        int i = this.A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        c0850Ni.setLayoutParams(layoutParams);
        return c0850Ni;
    }

    private void A01() {
        int i = 0;
        while (true) {
            C0850Ni[] c0850NiArr = this.A05;
            if (i < c0850NiArr.length) {
                ((LinearLayout.LayoutParams) c0850NiArr[i].getLayoutParams()).leftMargin = i == 0 ? 0 : this.A00;
                i++;
            } else {
                requestLayout();
                return;
            }
        }
    }

    private void A02(float f) {
        for (int i = 0; i < this.A05.length; i++) {
            float min = Math.min(1.0f, f - i);
            if (min < 0.0f) {
                min = 0.0f;
            }
            this.A05[i].setFillRatio(min);
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
        A01();
    }

    public void setRating(float f) {
        A02(f);
    }
}