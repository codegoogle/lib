package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;

/* compiled from: BottomNavigationMenuView.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class eb2 extends rf2 {
    private int[] A0;
    private final int v0;
    private final int w0;
    private final int x0;
    private final int y0;
    private boolean z0;

    public eb2(@x1 Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.v0 = resources.getDimensionPixelSize(ga2.f.W0);
        this.w0 = resources.getDimensionPixelSize(ga2.f.X0);
        this.x0 = resources.getDimensionPixelSize(ga2.f.Q0);
        this.y0 = resources.getDimensionPixelSize(ga2.f.R0);
        this.A0 = new int[5];
    }

    @Override // com.p7700g.p99005.rf2
    @x1
    public pf2 f(@x1 Context context) {
        return new db2(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (sr.Y(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        p4 menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.H().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (k(getLabelVisibilityMode(), size2) && t()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int i3 = this.y0;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.x0, Integer.MIN_VALUE), makeMeasureSpec);
                i3 = Math.max(i3, childAt.getMeasuredWidth());
            }
            int i4 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.w0 * i4), Math.min(i3, this.x0));
            int i5 = size - min;
            int min2 = Math.min(i5 / (i4 == 0 ? 1 : i4), this.v0);
            int i6 = i5 - (i4 * min2);
            int i7 = 0;
            while (i7 < childCount) {
                if (getChildAt(i7).getVisibility() != 8) {
                    this.A0[i7] = i7 == getSelectedItemPosition() ? min : min2;
                    if (i6 > 0) {
                        int[] iArr = this.A0;
                        iArr[i7] = iArr[i7] + 1;
                        i6--;
                    }
                } else {
                    this.A0[i7] = 0;
                }
                i7++;
            }
        } else {
            int min3 = Math.min(size / (size2 == 0 ? 1 : size2), this.x0);
            int i8 = size - (size2 * min3);
            for (int i9 = 0; i9 < childCount; i9++) {
                if (getChildAt(i9).getVisibility() != 8) {
                    int[] iArr2 = this.A0;
                    iArr2[i9] = min3;
                    if (i8 > 0) {
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.A0[i9] = 0;
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.A0[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(size3, i2, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.z0 = z;
    }

    public boolean t() {
        return this.z0;
    }
}