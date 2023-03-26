package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.ff;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public class bf extends ViewGroup {
    public static final String s = "Constraints";
    public af t;

    public bf(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void c(AttributeSet attrs) {
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attrs) {
        return new a(getContext(), attrs);
    }

    public af getConstraintSet() {
        if (this.t == null) {
            this.t = new af();
        }
        this.t.J(this);
        return this.t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new ConstraintLayout.b(p);
    }

    public bf(Context context, AttributeSet attrs) {
        super(context, attrs);
        c(attrs);
        super.setVisibility(8);
    }

    public bf(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        c(attrs);
        super.setVisibility(8);
    }

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public float V0;
        public boolean W0;
        public float X0;
        public float Y0;
        public float Z0;
        public float a1;
        public float b1;
        public float c1;
        public float d1;
        public float e1;
        public float f1;
        public float g1;
        public float h1;

        public a(int width, int height) {
            super(width, height);
            this.V0 = 1.0f;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.a1 = 0.0f;
            this.b1 = 1.0f;
            this.c1 = 1.0f;
            this.d1 = 0.0f;
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.g1 = 0.0f;
            this.h1 = 0.0f;
        }

        public a(a source) {
            super((ConstraintLayout.b) source);
            this.V0 = 1.0f;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.a1 = 0.0f;
            this.b1 = 1.0f;
            this.c1 = 1.0f;
            this.d1 = 0.0f;
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.g1 = 0.0f;
            this.h1 = 0.0f;
        }

        public a(Context c, AttributeSet attrs) {
            super(c, attrs);
            this.V0 = 1.0f;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.a1 = 0.0f;
            this.b1 = 1.0f;
            this.c1 = 1.0f;
            this.d1 = 0.0f;
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.g1 = 0.0f;
            this.h1 = 0.0f;
            TypedArray obtainStyledAttributes = c.obtainStyledAttributes(attrs, ff.m.Wa);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.mb) {
                    this.V0 = obtainStyledAttributes.getFloat(index, this.V0);
                } else if (index == ff.m.zb) {
                    this.X0 = obtainStyledAttributes.getFloat(index, this.X0);
                    this.W0 = true;
                } else if (index == ff.m.ub) {
                    this.Z0 = obtainStyledAttributes.getFloat(index, this.Z0);
                } else if (index == ff.m.vb) {
                    this.a1 = obtainStyledAttributes.getFloat(index, this.a1);
                } else if (index == ff.m.tb) {
                    this.Y0 = obtainStyledAttributes.getFloat(index, this.Y0);
                } else if (index == ff.m.rb) {
                    this.b1 = obtainStyledAttributes.getFloat(index, this.b1);
                } else if (index == ff.m.sb) {
                    this.c1 = obtainStyledAttributes.getFloat(index, this.c1);
                } else if (index == ff.m.nb) {
                    this.d1 = obtainStyledAttributes.getFloat(index, this.d1);
                } else if (index == ff.m.ob) {
                    this.e1 = obtainStyledAttributes.getFloat(index, this.e1);
                } else if (index == ff.m.pb) {
                    this.f1 = obtainStyledAttributes.getFloat(index, this.f1);
                } else if (index == ff.m.qb) {
                    this.g1 = obtainStyledAttributes.getFloat(index, this.g1);
                } else if (index == ff.m.yb) {
                    this.h1 = obtainStyledAttributes.getFloat(index, this.h1);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}