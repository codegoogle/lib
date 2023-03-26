package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;

/* compiled from: FlowLayout.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class me2 extends ViewGroup {
    private int s;
    private int t;
    private boolean u;
    private int v;

    public me2(@x1 Context context) {
        this(context, null);
    }

    private static int a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    private void d(@x1 Context context, @z1 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ga2.o.Hf, 0, 0);
        this.s = obtainStyledAttributes.getDimensionPixelSize(ga2.o.Jf, 0);
        this.t = obtainStyledAttributes.getDimensionPixelSize(ga2.o.If, 0);
        obtainStyledAttributes.recycle();
    }

    public int b(@x1 View view) {
        Object tag = view.getTag(ga2.h.q4);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.u;
    }

    public int getItemSpacing() {
        return this.t;
    }

    public int getLineSpacing() {
        return this.s;
    }

    public int getRowCount() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.v = 0;
            return;
        }
        this.v = 1;
        boolean z2 = sr.Y(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(ga2.h.q4, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = sq.c(marginLayoutParams);
                    i5 = sq.b(marginLayoutParams);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i8 + i6;
                if (!this.u && measuredWidth > i7) {
                    i9 = this.s + paddingTop;
                    this.v++;
                    i8 = paddingRight;
                }
                childAt.setTag(ga2.h.q4, Integer.valueOf(this.v - 1));
                int i11 = i8 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i6, measuredHeight);
                } else {
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                }
                i8 += childAt.getMeasuredWidth() + i6 + i5 + this.t;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i10 = paddingLeft;
                if (childAt.getMeasuredWidth() + paddingLeft + i3 <= paddingRight || c()) {
                    i5 = i10;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.s + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i5 + i3;
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i3 + i4 + this.t + i5;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, getPaddingRight() + i8), a(size2, mode2, getPaddingBottom() + paddingTop));
    }

    public void setItemSpacing(int i) {
        this.t = i;
    }

    public void setLineSpacing(int i) {
        this.s = i;
    }

    public void setSingleLine(boolean z) {
        this.u = z;
    }

    public me2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public me2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = false;
        d(context, attributeSet);
    }

    @TargetApi(21)
    public me2(@x1 Context context, @z1 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.u = false;
        d(context, attributeSet);
    }
}