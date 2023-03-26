package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public final class OK {
    public final int[] A00(View view, int i, int i2) {
        C4G c4g = (C4G) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), c4g.width), ViewGroup.getChildMeasureSpec(i2, view.getPaddingTop() + view.getPaddingBottom(), c4g.height));
        return new int[]{view.getMeasuredWidth() + c4g.leftMargin + c4g.rightMargin, view.getMeasuredHeight() + c4g.bottomMargin + c4g.topMargin};
    }
}