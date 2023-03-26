package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;

/* compiled from: MotionPlaceholder.java */
/* loaded from: classes.dex */
public class gd extends jf {
    private static final String D = "MotionPlaceholder";
    public gc E;

    public gd(Context context) {
        super(context);
    }

    @Override // com.p7700g.p99005.xe
    public void G(ac container, dc helper, SparseArray<zb> map) {
    }

    @Override // com.p7700g.p99005.jf
    public void J(ic layout, int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (layout != null) {
            layout.v2(mode, size, mode2, size2);
            setMeasuredDimension(layout.q2(), layout.p2());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // com.p7700g.p99005.xe, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        J(this.E, widthMeasureSpec, heightMeasureSpec);
    }

    @Override // com.p7700g.p99005.jf, com.p7700g.p99005.xe
    public void y(AttributeSet attrs) {
        super.y(attrs);
        this.v = new gc();
        I();
    }

    public gd(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public gd(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public gd(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
    }
}