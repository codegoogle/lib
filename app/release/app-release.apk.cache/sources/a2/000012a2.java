package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public final class N4 extends ViewGroup {
    public static final int A01 = (int) (C0795Le.A01 * 8.0f);
    public int A00;

    public N4(C1080Wh c1080Wh) {
        super(c1080Wh);
        setMotionEventSplittingEnabled(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childHeight = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (paddingLeft + measuredWidth > childHeight) {
                paddingLeft = getPaddingLeft();
                paddingTop += this.A00;
            }
            childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + measuredHeight);
            paddingLeft += A01 + measuredWidth;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0033 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3 = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i4 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom(), Integer.MIN_VALUE);
        int i5 = getChildCount() > 0 ? 1 : 0;
        for (int i6 = 0; i6 < lines; i6++) {
            View child = getChildAt(i6);
            int lines = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            child.measure(lines, makeMeasureSpec);
            int measuredWidth = child.getMeasuredWidth();
            int measuredHeight = child.getMeasuredHeight();
            int childWidth = A01;
            i4 = Math.max(i4, measuredHeight + childWidth);
            int childWidth2 = paddingLeft + measuredWidth;
            if (childWidth2 > i3) {
                i5++;
                paddingLeft = getPaddingLeft();
            }
            int childWidth3 = A01;
            paddingLeft += childWidth3 + measuredWidth;
        }
        this.A00 = i4;
        setMeasuredDimension(i3, (this.A00 * i5) + A01);
    }
}