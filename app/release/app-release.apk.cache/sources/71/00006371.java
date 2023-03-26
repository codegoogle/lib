package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;

/* compiled from: ScrimInsetsFrameLayout.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class we2 extends FrameLayout {
    @z1
    public Drawable s;
    public Rect t;
    private Rect u;
    private boolean v;
    private boolean w;

    /* compiled from: ScrimInsetsFrameLayout.java */
    /* loaded from: classes3.dex */
    public class a implements jr {
        public a() {
        }

        @Override // com.p7700g.p99005.jr
        public gs a(View view, @x1 gs gsVar) {
            we2 we2Var = we2.this;
            if (we2Var.t == null) {
                we2Var.t = new Rect();
            }
            we2.this.t.set(gsVar.p(), gsVar.r(), gsVar.q(), gsVar.o());
            we2.this.a(gsVar);
            we2.this.setWillNotDraw(!gsVar.w() || we2.this.s == null);
            sr.m1(we2.this);
            return gsVar.c();
        }
    }

    public we2(@x1 Context context) {
        this(context, null);
    }

    public void a(gs gsVar) {
    }

    @Override // android.view.View
    public void draw(@x1 Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.t == null || this.s == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.v) {
            this.u.set(0, 0, width, this.t.top);
            this.s.setBounds(this.u);
            this.s.draw(canvas);
        }
        if (this.w) {
            this.u.set(0, height - this.t.bottom, width, height);
            this.s.setBounds(this.u);
            this.s.draw(canvas);
        }
        Rect rect = this.u;
        Rect rect2 = this.t;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.s.setBounds(this.u);
        this.s.draw(canvas);
        Rect rect3 = this.u;
        Rect rect4 = this.t;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.s.setBounds(this.u);
        this.s.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.w = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.v = z;
    }

    public void setScrimInsetForeground(@z1 Drawable drawable) {
        this.s = drawable;
    }

    public we2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public we2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = new Rect();
        this.v = true;
        this.w = true;
        TypedArray j = cf2.j(context, attributeSet, ga2.o.Cq, i, ga2.n.ge, new int[0]);
        this.s = j.getDrawable(ga2.o.Dq);
        j.recycle();
        setWillNotDraw(true);
        sr.Z1(this, new a());
    }
}