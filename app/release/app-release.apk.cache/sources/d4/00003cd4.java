package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.ga2;

/* compiled from: RadialViewGroup.java */
/* loaded from: classes3.dex */
public class cj2 extends ConstraintLayout {
    private static final String x0 = "skip";
    private lh2 A0;
    private final Runnable y0;
    private int z0;

    /* compiled from: RadialViewGroup.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            cj2.this.G();
        }
    }

    public cj2(@x1 Context context) {
        this(context, null);
    }

    private Drawable C() {
        lh2 lh2Var = new lh2();
        this.A0 = lh2Var;
        lh2Var.l0(new oh2(0.5f));
        this.A0.o0(ColorStateList.valueOf(-1));
        return this.A0;
    }

    private static boolean F(View view) {
        return x0.equals(view.getTag());
    }

    private void H() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.y0);
            handler.post(this.y0);
        }
    }

    @b1
    public int D() {
        return this.z0;
    }

    public void E(@b1 int i) {
        this.z0 = i;
        G();
    }

    public void G() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (F(getChildAt(i2))) {
                i++;
            }
        }
        af afVar = new af();
        afVar.H(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = ga2.h.O0;
            if (id != i4 && !F(childAt)) {
                afVar.M(childAt.getId(), i4, this.z0, f);
                f = (360.0f / (childCount - i)) + f;
            }
        }
        afVar.r(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(sr.C());
        }
        H();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        G();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        H();
    }

    @Override // android.view.View
    public void setBackgroundColor(@w0 int i) {
        this.A0.o0(ColorStateList.valueOf(i));
    }

    public cj2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cj2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(ga2.k.d0, this);
        sr.H1(this, C());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ga2.o.hq, i, 0);
        this.z0 = obtainStyledAttributes.getDimensionPixelSize(ga2.o.iq, 0);
        this.y0 = new a();
        obtainStyledAttributes.recycle();
    }
}