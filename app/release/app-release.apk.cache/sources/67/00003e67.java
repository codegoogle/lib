package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.af;
import com.p7700g.p99005.ff;

/* compiled from: Flow.java */
/* loaded from: classes.dex */
public class dd extends jf {
    private static final String D = "Flow";
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 0;
    public static final int N = 1;
    public static final int O = 2;
    public static final int P = 0;
    public static final int Q = 1;
    public static final int R = 2;
    public static final int S = 3;
    private bc T;

    public dd(Context context) {
        super(context);
    }

    @Override // com.p7700g.p99005.xe
    public void B(zb widget, boolean isRtl) {
        this.T.m2(isRtl);
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
        J(this.T, widthMeasureSpec, heightMeasureSpec);
    }

    public void setFirstHorizontalBias(float bias) {
        this.T.k3(bias);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int style) {
        this.T.l3(style);
        requestLayout();
    }

    public void setFirstVerticalBias(float bias) {
        this.T.m3(bias);
        requestLayout();
    }

    public void setFirstVerticalStyle(int style) {
        this.T.n3(style);
        requestLayout();
    }

    public void setHorizontalAlign(int align) {
        this.T.o3(align);
        requestLayout();
    }

    public void setHorizontalBias(float bias) {
        this.T.p3(bias);
        requestLayout();
    }

    public void setHorizontalGap(int gap) {
        this.T.q3(gap);
        requestLayout();
    }

    public void setHorizontalStyle(int style) {
        this.T.r3(style);
        requestLayout();
    }

    public void setLastHorizontalBias(float bias) {
        this.T.s3(bias);
        requestLayout();
    }

    public void setLastHorizontalStyle(int style) {
        this.T.t3(style);
        requestLayout();
    }

    public void setLastVerticalBias(float bias) {
        this.T.u3(bias);
        requestLayout();
    }

    public void setLastVerticalStyle(int style) {
        this.T.v3(style);
        requestLayout();
    }

    public void setMaxElementsWrap(int max) {
        this.T.w3(max);
        requestLayout();
    }

    public void setOrientation(int orientation) {
        this.T.x3(orientation);
        requestLayout();
    }

    public void setPadding(int padding) {
        this.T.B2(padding);
        requestLayout();
    }

    public void setPaddingBottom(int paddingBottom) {
        this.T.C2(paddingBottom);
        requestLayout();
    }

    public void setPaddingLeft(int paddingLeft) {
        this.T.E2(paddingLeft);
        requestLayout();
    }

    public void setPaddingRight(int paddingRight) {
        this.T.F2(paddingRight);
        requestLayout();
    }

    public void setPaddingTop(int paddingTop) {
        this.T.H2(paddingTop);
        requestLayout();
    }

    public void setVerticalAlign(int align) {
        this.T.y3(align);
        requestLayout();
    }

    public void setVerticalBias(float bias) {
        this.T.z3(bias);
        requestLayout();
    }

    public void setVerticalGap(int gap) {
        this.T.A3(gap);
        requestLayout();
    }

    public void setVerticalStyle(int style) {
        this.T.B3(style);
        requestLayout();
    }

    public void setWrapMode(int mode) {
        this.T.C3(mode);
        requestLayout();
    }

    @Override // com.p7700g.p99005.jf, com.p7700g.p99005.xe
    public void y(AttributeSet attrs) {
        super.y(attrs);
        this.T = new bc();
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.y6) {
                    this.T.x3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == ff.m.z6) {
                    this.T.B2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ff.m.Q6) {
                    this.T.G2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ff.m.R6) {
                    this.T.D2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ff.m.A6) {
                    this.T.E2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ff.m.B6) {
                    this.T.H2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ff.m.C6) {
                    this.T.F2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ff.m.D6) {
                    this.T.C2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ff.m.A7) {
                    this.T.C3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == ff.m.q7) {
                    this.T.r3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == ff.m.z7) {
                    this.T.B3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == ff.m.k7) {
                    this.T.l3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == ff.m.s7) {
                    this.T.t3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == ff.m.m7) {
                    this.T.n3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == ff.m.u7) {
                    this.T.v3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == ff.m.o7) {
                    this.T.p3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == ff.m.j7) {
                    this.T.k3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == ff.m.r7) {
                    this.T.s3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == ff.m.l7) {
                    this.T.m3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == ff.m.t7) {
                    this.T.u3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == ff.m.x7) {
                    this.T.z3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == ff.m.n7) {
                    this.T.o3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == ff.m.w7) {
                    this.T.y3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == ff.m.p7) {
                    this.T.q3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ff.m.y7) {
                    this.T.A3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ff.m.v7) {
                    this.T.w3(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.v = this.T;
        I();
    }

    @Override // com.p7700g.p99005.xe
    public void z(af.a constraint, ec child, ConstraintLayout.b layoutParams, SparseArray<zb> mapIdToWidget) {
        super.z(constraint, child, layoutParams, mapIdToWidget);
        if (child instanceof bc) {
            bc bcVar = (bc) child;
            int i = layoutParams.x0;
            if (i != -1) {
                bcVar.x3(i);
            }
        }
    }

    public dd(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public dd(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}