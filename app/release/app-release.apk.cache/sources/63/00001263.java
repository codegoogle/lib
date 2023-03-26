package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public class M2 implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ C1165Zs A00;

    public M2(C1165Zs c1165Zs) {
        this.A00 = c1165Zs;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        RelativeLayout.LayoutParams layoutParams;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z = this.A00.getResources().getConfiguration().orientation == 1;
        if (z) {
            layoutParams = this.A00.A09;
        } else {
            layoutParams = this.A00.A08;
        }
        if ((i & 2) == 0) {
            this.A00.A02 = true;
            if (!z) {
                i5 = 0;
            } else {
                i5 = C1165Zs.A0M;
            }
            if (!z) {
                i6 = 0;
            } else {
                i6 = C1165Zs.A0M;
            }
            if (!z) {
                i7 = 0;
            } else {
                i8 = C1165Zs.A0M;
                i7 = i8 * 3;
            }
            layoutParams.setMargins(i5, 0, i6, i7);
        } else {
            this.A00.A02 = false;
            if (!z) {
                i2 = 0;
            } else {
                i2 = C1165Zs.A0M;
            }
            if (!z) {
                i3 = 0;
            } else {
                i3 = C1165Zs.A0M;
            }
            if (!z) {
                i4 = 0;
            } else {
                i4 = C1165Zs.A0M;
            }
            layoutParams.setMargins(i2, 0, i3, i4);
        }
        this.A00.setLayoutParams(layoutParams);
    }
}