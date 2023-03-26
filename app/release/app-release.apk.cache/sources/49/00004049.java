package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.ff;

/* compiled from: Layer.java */
/* loaded from: classes.dex */
public class ed extends xe {
    private static final String B = "Layer";
    private float C;
    private float D;
    private float E;
    public ConstraintLayout F;
    private float G;
    private float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public boolean O;
    public View[] P;
    private float Q;
    private float R;
    private boolean S;
    private boolean T;

    public ed(Context context) {
        super(context);
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.G = 1.0f;
        this.H = 1.0f;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = Float.NaN;
        this.N = Float.NaN;
        this.O = true;
        this.P = null;
        this.Q = 0.0f;
        this.R = 0.0f;
    }

    private void K() {
        int i;
        if (this.F == null || (i = this.t) == 0) {
            return;
        }
        View[] viewArr = this.P;
        if (viewArr == null || viewArr.length != i) {
            this.P = new View[i];
        }
        for (int i2 = 0; i2 < this.t; i2++) {
            this.P[i2] = this.F.n(this.s[i2]);
        }
    }

    private void L() {
        if (this.F == null) {
            return;
        }
        if (this.P == null) {
            K();
        }
        J();
        double radians = Float.isNaN(this.E) ? zg2.s : Math.toRadians(this.E);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f = this.G;
        float f2 = f * cos;
        float f3 = this.H;
        float f4 = (-f3) * sin;
        float f5 = f * sin;
        float f6 = f3 * cos;
        for (int i = 0; i < this.t; i++) {
            View view = this.P[i];
            int left = view.getLeft();
            int top = view.getTop();
            float right = ((view.getRight() + left) / 2) - this.I;
            float bottom = ((view.getBottom() + top) / 2) - this.J;
            view.setTranslationX((((f4 * bottom) + (f2 * right)) - right) + this.Q);
            view.setTranslationY((((f6 * bottom) + (right * f5)) - bottom) + this.R);
            view.setScaleY(this.H);
            view.setScaleX(this.G);
            if (!Float.isNaN(this.E)) {
                view.setRotation(this.E);
            }
        }
    }

    @Override // com.p7700g.p99005.xe
    public void D(ConstraintLayout container) {
        K();
        this.I = Float.NaN;
        this.J = Float.NaN;
        zb b = ((ConstraintLayout.b) getLayoutParams()).b();
        b.c2(0);
        b.y1(0);
        J();
        layout(((int) this.M) - getPaddingLeft(), ((int) this.N) - getPaddingTop(), getPaddingRight() + ((int) this.K), getPaddingBottom() + ((int) this.L));
        L();
    }

    @Override // com.p7700g.p99005.xe
    public void F(ConstraintLayout container) {
        this.F = container;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (Float.isNaN(this.E)) {
                return;
            }
            this.E = rotation;
            return;
        }
        this.E = rotation;
    }

    public void J() {
        if (this.F == null) {
            return;
        }
        if (this.O || Float.isNaN(this.I) || Float.isNaN(this.J)) {
            if (!Float.isNaN(this.C) && !Float.isNaN(this.D)) {
                this.J = this.D;
                this.I = this.C;
                return;
            }
            View[] w = w(this.F);
            int left = w[0].getLeft();
            int top = w[0].getTop();
            int right = w[0].getRight();
            int bottom = w[0].getBottom();
            for (int i = 0; i < this.t; i++) {
                View view = w[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.K = right;
            this.L = bottom;
            this.M = left;
            this.N = top;
            if (Float.isNaN(this.C)) {
                this.I = (left + right) / 2;
            } else {
                this.I = this.C;
            }
            if (Float.isNaN(this.D)) {
                this.J = (top + bottom) / 2;
            } else {
                this.J = this.D;
            }
        }
    }

    @Override // com.p7700g.p99005.xe, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = (ConstraintLayout) getParent();
        if (this.S || this.T) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.t; i++) {
                View n = this.F.n(this.s[i]);
                if (n != null) {
                    if (this.S) {
                        n.setVisibility(visibility);
                    }
                    if (this.T && elevation > 0.0f) {
                        n.setTranslationZ(n.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // com.p7700g.p99005.xe
    public void r(ConstraintLayout container) {
        q(container);
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        p();
    }

    @Override // android.view.View
    public void setPivotX(float pivotX) {
        this.C = pivotX;
        L();
    }

    @Override // android.view.View
    public void setPivotY(float pivotY) {
        this.D = pivotY;
        L();
    }

    @Override // android.view.View
    public void setRotation(float angle) {
        this.E = angle;
        L();
    }

    @Override // android.view.View
    public void setScaleX(float scaleX) {
        this.G = scaleX;
        L();
    }

    @Override // android.view.View
    public void setScaleY(float scaleY) {
        this.H = scaleY;
        L();
    }

    @Override // android.view.View
    public void setTranslationX(float dx) {
        this.Q = dx;
        L();
    }

    @Override // android.view.View
    public void setTranslationY(float dy) {
        this.R = dy;
        L();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        p();
    }

    @Override // com.p7700g.p99005.xe
    public void y(AttributeSet attrs) {
        super.y(attrs);
        this.w = false;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.E6) {
                    this.S = true;
                } else if (index == ff.m.U6) {
                    this.T = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public ed(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.G = 1.0f;
        this.H = 1.0f;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = Float.NaN;
        this.N = Float.NaN;
        this.O = true;
        this.P = null;
        this.Q = 0.0f;
        this.R = 0.0f;
    }

    public ed(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.G = 1.0f;
        this.H = 1.0f;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = Float.NaN;
        this.N = Float.NaN;
        this.O = true;
        this.P = null;
        this.Q = 0.0f;
        this.R = 0.0f;
    }
}