package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.p7700g.p99005.cj2;
import com.p7700g.p99005.fq;
import com.p7700g.p99005.g1;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.l2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.r3;
import com.p7700g.p99005.sg2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class ClockFaceView extends cj2 implements ClockHandView.d {
    private static final float B0 = 0.001f;
    private static final int C0 = 12;
    private static final String D0 = "";
    private final ClockHandView E0;
    private final Rect F0;
    private final RectF G0;
    private final SparseArray<TextView> H0;
    private final fq I0;
    private final int[] J0;
    private final float[] K0;
    private final int L0;
    private final int M0;
    private final int N0;
    private final int O0;
    private String[] P0;
    private float Q0;
    private final ColorStateList R0;

    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (ClockFaceView.this.isShown()) {
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.E(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.E0.g()) - ClockFaceView.this.L0);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends fq {
        public b() {
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, @x1 ls lsVar) {
            super.g(view, lsVar);
            int intValue = ((Integer) view.getTag(ga2.h.T2)).intValue();
            if (intValue > 0) {
                lsVar.Q1((View) ClockFaceView.this.H0.get(intValue - 1));
            }
            lsVar.Z0(ls.c.h(0, 1, intValue, 1, false, view.isSelected()));
            lsVar.X0(true);
            lsVar.b(ls.a.f);
        }

        @Override // com.p7700g.p99005.fq
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 16) {
                long uptimeMillis = SystemClock.uptimeMillis();
                float x = view.getX() + (view.getWidth() / 2.0f);
                float height = (view.getHeight() / 2.0f) + view.getY();
                ClockFaceView.this.E0.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x, height, 0));
                ClockFaceView.this.E0.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x, height, 0));
                return true;
            }
            return super.j(view, i, bundle);
        }
    }

    public ClockFaceView(@x1 Context context) {
        this(context, null);
    }

    private void L() {
        RectF d = this.E0.d();
        for (int i = 0; i < this.H0.size(); i++) {
            TextView textView = this.H0.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.F0);
                offsetDescendantRectToMyCoords(textView, this.F0);
                textView.setSelected(d.contains(this.F0.centerX(), this.F0.centerY()));
                textView.getPaint().setShader(M(d, this.F0, textView));
                textView.invalidate();
            }
        }
    }

    @z1
    private RadialGradient M(RectF rectF, Rect rect, TextView textView) {
        this.G0.set(rect);
        this.G0.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (RectF.intersects(rectF, this.G0)) {
            return new RadialGradient(rectF.centerX() - this.G0.left, rectF.centerY() - this.G0.top, rectF.width() * 0.5f, this.J0, this.K0, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private static float N(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    private void O(@l2 int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.H0.size();
        for (int i2 = 0; i2 < Math.max(this.P0.length, size); i2++) {
            TextView textView = this.H0.get(i2);
            if (i2 >= this.P0.length) {
                removeView(textView);
                this.H0.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(ga2.k.b0, (ViewGroup) this, false);
                    this.H0.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.P0[i2]);
                textView.setTag(ga2.h.T2, Integer.valueOf(i2));
                sr.A1(textView, this.I0);
                textView.setTextColor(this.R0);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.P0[i2]));
                }
            }
        }
    }

    @Override // com.p7700g.p99005.cj2
    public void E(int i) {
        if (i != D()) {
            super.E(i);
            this.E0.k(D());
        }
    }

    public void c(String[] strArr, @l2 int i) {
        this.P0 = strArr;
        O(i);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void d(float f, boolean z) {
        if (Math.abs(this.Q0 - f) > B0) {
            this.Q0 = f;
            L();
        }
    }

    public void e(@g1(from = 0.0d, to = 360.0d) float f) {
        this.E0.l(f);
        L();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@x1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ls.X1(accessibilityNodeInfo).Y0(ls.b.f(1, this.P0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        L();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int N = (int) (this.O0 / N(this.M0 / displayMetrics.heightPixels, this.N0 / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(N, 1073741824);
        setMeasuredDimension(N, N);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public ClockFaceView(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.gb);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F0 = new Rect();
        this.G0 = new RectF();
        this.H0 = new SparseArray<>();
        this.K0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ga2.o.z6, i, ga2.n.Zi);
        Resources resources = getResources();
        ColorStateList a2 = sg2.a(context, obtainStyledAttributes, ga2.o.B6);
        this.R0 = a2;
        LayoutInflater.from(context).inflate(ga2.k.c0, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(ga2.h.D2);
        this.E0 = clockHandView;
        this.L0 = resources.getDimensionPixelSize(ga2.f.h5);
        int colorForState = a2.getColorForState(new int[]{16842913}, a2.getDefaultColor());
        this.J0 = new int[]{colorForState, colorForState, a2.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = r3.a(context, ga2.e.U8).getDefaultColor();
        ColorStateList a3 = sg2.a(context, obtainStyledAttributes, ga2.o.A6);
        setBackgroundColor(a3 != null ? a3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.I0 = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        c(strArr, 0);
        this.M0 = resources.getDimensionPixelSize(ga2.f.O5);
        this.N0 = resources.getDimensionPixelSize(ga2.f.P5);
        this.O0 = resources.getDimensionPixelSize(ga2.f.o5);
    }
}