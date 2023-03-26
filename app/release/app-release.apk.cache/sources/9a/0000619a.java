package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import com.p7700g.p99005.ff;

/* compiled from: MotionTelltales.java */
/* loaded from: classes.dex */
public class ve extends se {
    private static final String D = "MotionTelltales";
    private Paint E;
    public ge F;
    public float[] G;
    public Matrix H;
    public int I;
    public int J;
    public float K;

    public ve(Context context) {
        super(context);
        this.E = new Paint();
        this.G = new float[2];
        this.H = new Matrix();
        this.I = 0;
        this.J = -65281;
        this.K = 0.25f;
        a(context, null);
    }

    private void a(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, ff.m.sk);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.tk) {
                    this.J = obtainStyledAttributes.getColor(index, this.J);
                } else if (index == ff.m.vk) {
                    this.I = obtainStyledAttributes.getInt(index, this.I);
                } else if (index == ff.m.uk) {
                    this.K = obtainStyledAttributes.getFloat(index, this.K);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.E.setColor(this.J);
        this.E.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.p7700g.p99005.se, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.H);
        if (this.F == null) {
            ViewParent parent = getParent();
            if (parent instanceof ge) {
                this.F = (ge) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.F.A0(this, f2, f, this.G, this.I);
                this.H.mapVectors(this.G);
                float f3 = width * f2;
                float f4 = height * f;
                float[] fArr2 = this.G;
                float f5 = fArr2[0];
                float f6 = this.K;
                float f7 = f4 - (fArr2[1] * f6);
                this.H.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.E);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        postInvalidate();
    }

    public void setText(CharSequence text) {
        this.x = text.toString();
        requestLayout();
    }

    public ve(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.E = new Paint();
        this.G = new float[2];
        this.H = new Matrix();
        this.I = 0;
        this.J = -65281;
        this.K = 0.25f;
        a(context, attrs);
    }

    public ve(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.E = new Paint();
        this.G = new float[2];
        this.H = new Matrix();
        this.I = 0;
        this.J = -65281;
        this.K = 0.25f;
        a(context, attrs);
    }
}