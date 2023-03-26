package com.p7700g.p99005;

import android.content.Context;
import android.view.View;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;

/* compiled from: NavigationRailItemView.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class vf2 extends pf2 {
    public vf2(@x1 Context context) {
        super(context);
    }

    @Override // com.p7700g.p99005.pf2
    @a1
    public int getItemDefaultMarginResId() {
        return ga2.f.A8;
    }

    @Override // com.p7700g.p99005.pf2
    @s1
    public int getItemLayoutResId() {
        return ga2.k.D0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)), i2, 0));
        }
    }
}