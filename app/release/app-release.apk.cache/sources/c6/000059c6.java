package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.p7700g.p99005.ga2;

/* compiled from: MaterialDivider.java */
/* loaded from: classes3.dex */
public class rd2 extends View {
    private static final int s = ga2.n.qi;
    @x1
    private final lh2 t;
    private int u;
    @w0
    private int v;
    private int w;
    private int x;

    public rd2(@x1 Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.v;
    }

    @c2
    public int getDividerInsetEnd() {
        return this.x;
    }

    @c2
    public int getDividerInsetStart() {
        return this.w;
    }

    public int getDividerThickness() {
        return this.u;
    }

    @Override // android.view.View
    public void onDraw(@x1 Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = sr.Y(this) == 1;
        int i2 = z ? this.x : this.w;
        if (z) {
            width = getWidth();
            i = this.w;
        } else {
            width = getWidth();
            i = this.x;
        }
        this.t.setBounds(i2, 0, width - i, getBottom() - getTop());
        this.t.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.u;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@w0 int i) {
        if (this.v != i) {
            this.v = i;
            this.t.o0(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(@y0 int i) {
        setDividerColor(gh.f(getContext(), i));
    }

    public void setDividerInsetEnd(@c2 int i) {
        this.x = i;
    }

    public void setDividerInsetEndResource(@a1 int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@c2 int i) {
        this.w = i;
    }

    public void setDividerInsetStartResource(@a1 int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@c2 int i) {
        if (this.u != i) {
            this.u = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@a1 int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public rd2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.jb);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rd2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = s;
        Context context2 = getContext();
        this.t = new lh2();
        TypedArray j = cf2.j(context2, attributeSet, ga2.o.mm, i, i2, new int[0]);
        this.u = j.getDimensionPixelSize(ga2.o.qm, getResources().getDimensionPixelSize(ga2.f.s5));
        this.w = j.getDimensionPixelOffset(ga2.o.pm, 0);
        this.x = j.getDimensionPixelOffset(ga2.o.om, 0);
        setDividerColor(sg2.a(context2, j, ga2.o.nm).getDefaultColor());
        j.recycle();
    }
}