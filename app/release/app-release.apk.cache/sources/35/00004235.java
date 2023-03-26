package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.p7700g.p99005.ga2;

/* compiled from: ShapeableImageView.java */
/* loaded from: classes3.dex */
public class fe2 extends AppCompatImageView implements uh2 {
    private static final int s = ga2.n.Ci;
    private static final int t = Integer.MIN_VALUE;
    @z1
    private ColorStateList A;
    @z1
    private lh2 B;
    private qh2 C;
    @b1
    private float D;
    private Path E;
    @b1
    private int F;
    @b1
    private int G;
    @b1
    private int H;
    @b1
    private int I;
    @b1
    private int J;
    @b1
    private int K;
    private boolean L;
    private final rh2 u;
    private final RectF v;
    private final RectF w;
    private final Paint x;
    private final Paint y;
    private final Path z;

    /* compiled from: ShapeableImageView.java */
    @TargetApi(21)
    /* loaded from: classes3.dex */
    public class a extends ViewOutlineProvider {
        private final Rect a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (fe2.this.C == null) {
                return;
            }
            if (fe2.this.B == null) {
                fe2.this.B = new lh2(fe2.this.C);
            }
            fe2.this.v.round(this.a);
            fe2.this.B.setBounds(this.a);
            fe2.this.B.getOutline(outline);
        }
    }

    public fe2(Context context) {
        this(context, null, 0);
    }

    private void e(Canvas canvas) {
        if (this.A == null) {
            return;
        }
        this.x.setStrokeWidth(this.D);
        int colorForState = this.A.getColorForState(getDrawableState(), this.A.getDefaultColor());
        if (this.D <= 0.0f || colorForState == 0) {
            return;
        }
        this.x.setColor(colorForState);
        canvas.drawPath(this.z, this.x);
    }

    private boolean f() {
        return (this.J == Integer.MIN_VALUE && this.K == Integer.MIN_VALUE) ? false : true;
    }

    private boolean g() {
        return getLayoutDirection() == 1;
    }

    private void j(int i, int i2) {
        this.v.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.u.d(this.C, 1.0f, this.v, this.z);
        this.E.rewind();
        this.E.addPath(this.z);
        this.w.set(0.0f, 0.0f, i, i2);
        this.E.addRect(this.w, Path.Direction.CCW);
    }

    @b1
    public int getContentPaddingBottom() {
        return this.I;
    }

    @b1
    public final int getContentPaddingEnd() {
        int i = this.K;
        return i != Integer.MIN_VALUE ? i : g() ? this.F : this.H;
    }

    @b1
    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (f()) {
            if (g() && (i2 = this.K) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!g() && (i = this.J) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.F;
    }

    @b1
    public int getContentPaddingRight() {
        int i;
        int i2;
        if (f()) {
            if (g() && (i2 = this.J) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!g() && (i = this.K) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.H;
    }

    @b1
    public final int getContentPaddingStart() {
        int i = this.J;
        return i != Integer.MIN_VALUE ? i : g() ? this.H : this.F;
    }

    @b1
    public int getContentPaddingTop() {
        return this.G;
    }

    @Override // android.view.View
    @b1
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @b1
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @b1
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @b1
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @b1
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @b1
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // com.p7700g.p99005.uh2
    @x1
    public qh2 getShapeAppearanceModel() {
        return this.C;
    }

    @z1
    public ColorStateList getStrokeColor() {
        return this.A;
    }

    @b1
    public float getStrokeWidth() {
        return this.D;
    }

    public void h(@b1 int i, @b1 int i2, @b1 int i3, @b1 int i4) {
        this.J = Integer.MIN_VALUE;
        this.K = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.F) + i, (super.getPaddingTop() - this.G) + i2, (super.getPaddingRight() - this.H) + i3, (super.getPaddingBottom() - this.I) + i4);
        this.F = i;
        this.G = i2;
        this.H = i3;
        this.I = i4;
    }

    @e2(17)
    public void i(@b1 int i, @b1 int i2, @b1 int i3, @b1 int i4) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i, (super.getPaddingTop() - this.G) + i2, (super.getPaddingEnd() - getContentPaddingEnd()) + i3, (super.getPaddingBottom() - this.I) + i4);
        this.F = g() ? i3 : i;
        this.G = i2;
        if (!g()) {
            i = i3;
        }
        this.H = i;
        this.I = i4;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.E, this.y);
        e(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.L && isLayoutDirectionResolved()) {
            this.L = true;
            if (!isPaddingRelative() && !f()) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        j(i, i2);
    }

    @Override // android.view.View
    public void setPadding(@b1 int i, @b1 int i2, @b1 int i3, @b1 int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public void setPaddingRelative(@b1 int i, @b1 int i2, @b1 int i3, @b1 int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // com.p7700g.p99005.uh2
    public void setShapeAppearanceModel(@x1 qh2 qh2Var) {
        this.C = qh2Var;
        lh2 lh2Var = this.B;
        if (lh2Var != null) {
            lh2Var.setShapeAppearanceModel(qh2Var);
        }
        j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@z1 ColorStateList colorStateList) {
        this.A = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@y0 int i) {
        setStrokeColor(r3.a(getContext(), i));
    }

    public void setStrokeWidth(@b1 float f) {
        if (this.D != f) {
            this.D = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@a1 int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public fe2(Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fe2(Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r0), attributeSet, i);
        int i2 = s;
        this.u = rh2.k();
        this.z = new Path();
        this.L = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.y = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.v = new RectF();
        this.w = new RectF();
        this.E = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ga2.o.jr, i, i2);
        this.A = sg2.a(context2, obtainStyledAttributes, ga2.o.tr);
        this.D = obtainStyledAttributes.getDimensionPixelSize(ga2.o.ur, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(ga2.o.kr, 0);
        this.F = dimensionPixelSize;
        this.G = dimensionPixelSize;
        this.H = dimensionPixelSize;
        this.I = dimensionPixelSize;
        this.F = obtainStyledAttributes.getDimensionPixelSize(ga2.o.nr, dimensionPixelSize);
        this.G = obtainStyledAttributes.getDimensionPixelSize(ga2.o.qr, dimensionPixelSize);
        this.H = obtainStyledAttributes.getDimensionPixelSize(ga2.o.or, dimensionPixelSize);
        this.I = obtainStyledAttributes.getDimensionPixelSize(ga2.o.lr, dimensionPixelSize);
        this.J = obtainStyledAttributes.getDimensionPixelSize(ga2.o.pr, Integer.MIN_VALUE);
        this.K = obtainStyledAttributes.getDimensionPixelSize(ga2.o.mr, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.x = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.C = qh2.e(context2, attributeSet, i, i2).m();
        setOutlineProvider(new a());
    }
}