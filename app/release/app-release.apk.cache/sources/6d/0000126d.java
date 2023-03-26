package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* loaded from: assets/audience_network.dex */
public final class MC extends AdNativeComponentView {
    public static final int A01 = (int) (C0795Le.A01 * 1.0f);
    public final ImageView A00;

    public MC(C1080Wh c1080Wh) {
        super(c1080Wh);
        this.A00 = new MR(c1080Wh);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        LC.A04(this.A00, LC.A0A);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        C0795Le.A0P(this.A00, -2130706433);
        int i = A01;
        setPadding(i, i, i, i);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}