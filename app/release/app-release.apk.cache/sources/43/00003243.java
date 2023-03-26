package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.p7700g.p99005.b1;
import com.p7700g.p99005.c2;
import com.p7700g.p99005.g1;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zg2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ClockHandView extends View {
    private static final int s = 200;
    private final int A;
    private final float B;
    private final Paint C;
    private final RectF D;
    @c2
    private final int E;
    private float F;
    private boolean G;
    private c H;
    private double I;
    private int J;
    private ValueAnimator t;
    private boolean u;
    private float v;
    private float w;
    private boolean x;
    private int y;
    private final List<d> z;

    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.n(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void b(@g1(from = 0.0d, to = 360.0d) float f, boolean z);
    }

    /* loaded from: classes3.dex */
    public interface d {
        void d(@g1(from = 0.0d, to = 360.0d) float f, boolean z);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    private void c(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        this.C.setStrokeWidth(0.0f);
        canvas.drawCircle((this.J * ((float) Math.cos(this.I))) + width2, (this.J * ((float) Math.sin(this.I))) + f, this.A, this.C);
        double sin = Math.sin(this.I);
        double cos = Math.cos(this.I);
        this.C.setStrokeWidth(this.E);
        canvas.drawLine(width2, f, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.C);
        canvas.drawCircle(width2, f, this.B, this.C);
    }

    private int e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    private Pair<Float, Float> h(float f) {
        float f2 = f();
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    private boolean i(float f, float f2, boolean z, boolean z2, boolean z3) {
        float e = e(f, f2);
        boolean z4 = false;
        boolean z5 = f() != e;
        if (z2 && z5) {
            return true;
        }
        if (z5 || z) {
            if (z3 && this.u) {
                z4 = true;
            }
            m(e, z4);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(@g1(from = 0.0d, to = 360.0d) float f, boolean z) {
        float f2 = f % 360.0f;
        this.F = f2;
        this.I = Math.toRadians(f2 - 90.0f);
        float cos = (this.J * ((float) Math.cos(this.I))) + (getWidth() / 2);
        float sin = (this.J * ((float) Math.sin(this.I))) + (getHeight() / 2);
        RectF rectF = this.D;
        int i = this.A;
        rectF.set(cos - i, sin - i, cos + i, sin + i);
        for (d dVar : this.z) {
            dVar.d(f2, z);
        }
        invalidate();
    }

    public void b(d dVar) {
        this.z.add(dVar);
    }

    public RectF d() {
        return this.D;
    }

    @g1(from = zg2.s, to = 360.0d)
    public float f() {
        return this.F;
    }

    public int g() {
        return this.A;
    }

    public void j(boolean z) {
        this.u = z;
    }

    public void k(@b1 int i) {
        this.J = i;
        invalidate();
    }

    public void l(@g1(from = 0.0d, to = 360.0d) float f) {
        m(f, false);
    }

    public void m(@g1(from = 0.0d, to = 360.0d) float f, boolean z) {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            n(f, false);
            return;
        }
        Pair<Float, Float> h = h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) h.first).floatValue(), ((Float) h.second).floatValue());
        this.t = ofFloat;
        ofFloat.setDuration(200L);
        this.t.addUpdateListener(new a());
        this.t.addListener(new b());
        this.t.start();
    }

    public void o(c cVar) {
        this.H = cVar;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        l(f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.v);
                int i2 = (int) (y - this.w);
                this.x = (i2 * i2) + (i * i) > this.y;
                boolean z4 = this.G;
                z = actionMasked == 1;
                z2 = z4;
            } else {
                z = false;
                z2 = false;
            }
            z3 = false;
        } else {
            this.v = x;
            this.w = y;
            this.x = true;
            this.G = false;
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean i3 = i(x, y, z2, z3, z) | this.G;
        this.G = i3;
        if (i3 && z && (cVar = this.H) != null) {
            cVar.b(e(x, y), this.x);
        }
        return true;
    }

    public ClockHandView(Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.gb);
    }

    public ClockHandView(Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.z = new ArrayList();
        Paint paint = new Paint();
        this.C = paint;
        this.D = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ga2.o.C6, i, ga2.n.Zi);
        this.J = obtainStyledAttributes.getDimensionPixelSize(ga2.o.E6, 0);
        this.A = obtainStyledAttributes.getDimensionPixelSize(ga2.o.F6, 0);
        Resources resources = getResources();
        this.E = resources.getDimensionPixelSize(ga2.f.i5);
        this.B = resources.getDimensionPixelSize(ga2.f.g5);
        int color = obtainStyledAttributes.getColor(ga2.o.D6, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        l(0.0f);
        this.y = ViewConfiguration.get(context).getScaledTouchSlop();
        sr.Q1(this, 2);
        obtainStyledAttributes.recycle();
    }
}