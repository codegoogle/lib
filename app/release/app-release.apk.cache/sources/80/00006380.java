package com.p7700g.p99005;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p7700g.p99005.i2;

/* compiled from: NavigationRailMenuView.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class wf2 extends rf2 {
    @c2
    private int v0;
    private final FrameLayout.LayoutParams w0;

    public wf2(@x1 Context context) {
        super(context);
        this.v0 = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.w0 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int u(int i, int i2, int i3) {
        int max = i2 / Math.max(1, i3);
        int i4 = this.v0;
        if (i4 == -1) {
            i4 = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i4, max), 0);
    }

    private int v(View view, int i, int i2) {
        if (view.getVisibility() != 8) {
            view.measure(i, i2);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int w(int i, int i2, int i3, View view) {
        int makeMeasureSpec;
        u(i, i2, i3);
        if (view == null) {
            makeMeasureSpec = u(i, i2, i3);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != view) {
                i4 += v(childAt, i, makeMeasureSpec);
            }
        }
        return i4;
    }

    private int x(int i, int i2, int i3) {
        int i4;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i4 = v(childAt, i, u(i, i2, i3));
            i2 -= i4;
            i3--;
        } else {
            i4 = 0;
        }
        return i4 + w(i, i2, i3, childAt);
    }

    @Override // com.p7700g.p99005.rf2
    @x1
    public pf2 f(@x1 Context context) {
        return new vf2(context);
    }

    @c2
    public int getItemMinimumHeight() {
        return this.v0;
    }

    public int getMenuGravity() {
        return this.w0.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int w;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = getMenu().H().size();
        if (size2 > 1 && k(getLabelVisibilityMode(), size2)) {
            w = x(i, size, size2);
        } else {
            w = w(i, size, size2, null);
        }
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), View.resolveSizeAndState(w, i2, 0));
    }

    public void setItemMinimumHeight(@c2 int i) {
        if (this.v0 != i) {
            this.v0 = i;
            requestLayout();
        }
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.w0;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }

    public boolean t() {
        return (this.w0.gravity & 112) == 48;
    }
}