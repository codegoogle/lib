package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PagerTabStrip.java */
/* loaded from: classes.dex */
public class sa0 extends ta0 {
    private static final String K = "PagerTabStrip";
    private static final int L = 3;
    private static final int M = 6;
    private static final int N = 16;
    private static final int O = 32;
    private static final int P = 64;
    private static final int Q = 1;
    private static final int R = 32;
    private int A0;
    private boolean B0;
    private float C0;
    private float D0;
    private int E0;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int u0;
    private final Paint v0;
    private final Rect w0;
    private int x0;
    private boolean y0;
    private boolean z0;

    /* compiled from: PagerTabStrip.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ua0 ua0Var = sa0.this.w;
            ua0Var.setCurrentItem(ua0Var.getCurrentItem() - 1);
        }
    }

    /* compiled from: PagerTabStrip.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ua0 ua0Var = sa0.this.w;
            ua0Var.setCurrentItem(ua0Var.getCurrentItem() + 1);
        }
    }

    public sa0(@x1 Context context) {
        this(context, null);
    }

    @Override // com.p7700g.p99005.ta0
    public void d(int i, float f, boolean z) {
        Rect rect = this.w0;
        int height = getHeight();
        int left = this.y.getLeft() - this.u0;
        int right = this.y.getRight() + this.u0;
        int i2 = height - this.T;
        rect.set(left, i2, right, height);
        super.d(i, f, z);
        this.x0 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.y.getLeft() - this.u0, i2, this.y.getRight() + this.u0, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.y0;
    }

    @Override // com.p7700g.p99005.ta0
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.W);
    }

    @w0
    public int getTabIndicatorColor() {
        return this.S;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.y.getLeft() - this.u0;
        int right = this.y.getRight() + this.u0;
        this.v0.setColor((this.x0 << 24) | (this.S & sr.s));
        float f = height;
        canvas.drawRect(left, height - this.T, right, f, this.v0);
        if (this.y0) {
            this.v0.setColor((-16777216) | (this.S & sr.s));
            canvas.drawRect(getPaddingLeft(), height - this.A0, getWidth() - getPaddingRight(), f, this.v0);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || !this.B0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (action == 0) {
                this.C0 = x;
                this.D0 = y;
                this.B0 = false;
            } else if (action != 1) {
                if (action == 2 && (Math.abs(x - this.C0) > this.E0 || Math.abs(y - this.D0) > this.E0)) {
                    this.B0 = true;
                }
            } else if (x < this.y.getLeft() - this.u0) {
                ua0 ua0Var = this.w;
                ua0Var.setCurrentItem(ua0Var.getCurrentItem() - 1);
            } else if (x > this.y.getRight() + this.u0) {
                ua0 ua0Var2 = this.w;
                ua0Var2.setCurrentItem(ua0Var2.getCurrentItem() + 1);
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundColor(@w0 int i) {
        super.setBackgroundColor(i);
        if (this.z0) {
            return;
        }
        this.y0 = (i & sr.t) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.z0) {
            return;
        }
        this.y0 = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@f1 int i) {
        super.setBackgroundResource(i);
        if (this.z0) {
            return;
        }
        this.y0 = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.y0 = z;
        this.z0 = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.U;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@w0 int i) {
        this.S = i;
        this.v0.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(@y0 int i) {
        setTabIndicatorColor(gh.f(getContext(), i));
    }

    @Override // com.p7700g.p99005.ta0
    public void setTextSpacing(int i) {
        int i2 = this.V;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public sa0(@x1 Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.v0 = paint;
        this.w0 = new Rect();
        this.x0 = 255;
        this.y0 = false;
        this.z0 = false;
        int i = this.J;
        this.S = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.T = (int) ((3.0f * f) + 0.5f);
        this.U = (int) ((6.0f * f) + 0.5f);
        this.V = (int) (64.0f * f);
        this.u0 = (int) ((16.0f * f) + 0.5f);
        this.A0 = (int) ((1.0f * f) + 0.5f);
        this.W = (int) ((f * 32.0f) + 0.5f);
        this.E0 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.x.setFocusable(true);
        this.x.setOnClickListener(new a());
        this.z.setFocusable(true);
        this.z.setOnClickListener(new b());
        if (getBackground() == null) {
            this.y0 = true;
        }
    }
}