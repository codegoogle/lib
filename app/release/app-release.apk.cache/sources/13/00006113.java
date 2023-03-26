package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.x2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: DrawerArrowDrawable.java */
/* loaded from: classes.dex */
public class v3 extends Drawable {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private static final float e = (float) Math.toRadians(45.0d);
    private final Paint f;
    private float g;
    private float h;
    private float i;
    private float j;
    private boolean k;
    private final Path l;
    private final int m;
    private boolean n;
    private float o;
    private float p;
    private int q;

    /* compiled from: DrawerArrowDrawable.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public v3(Context context) {
        Paint paint = new Paint();
        this.f = paint;
        this.l = new Path();
        this.n = false;
        this.q = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, x2.m.C3, x2.b.o1, x2.l.v1);
        p(obtainStyledAttributes.getColor(x2.m.G3, 0));
        o(obtainStyledAttributes.getDimension(x2.m.K3, 0.0f));
        t(obtainStyledAttributes.getBoolean(x2.m.J3, true));
        r(Math.round(obtainStyledAttributes.getDimension(x2.m.I3, 0.0f)));
        this.m = obtainStyledAttributes.getDimensionPixelSize(x2.m.H3, 0);
        this.h = Math.round(obtainStyledAttributes.getDimension(x2.m.F3, 0.0f));
        this.g = Math.round(obtainStyledAttributes.getDimension(x2.m.D3, 0.0f));
        this.i = obtainStyledAttributes.getDimension(x2.m.E3, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float k(float f, float f2, float f3) {
        return wo1.a(f2, f, f3, f);
    }

    public float a() {
        return this.g;
    }

    public float b() {
        return this.i;
    }

    public float c() {
        return this.h;
    }

    public float d() {
        return this.f.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        int i = this.q;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? fk.f(this) == 0 : fk.f(this) == 1))) {
            z = true;
        }
        float f2 = this.g;
        float k = k(this.h, (float) Math.sqrt(f2 * f2 * 2.0f), this.o);
        float k2 = k(this.h, this.i, this.o);
        float round = Math.round(k(0.0f, this.p, this.o));
        float k3 = k(0.0f, e, this.o);
        float k4 = k(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.o);
        double d2 = k;
        double d3 = k3;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d3) * d2);
        float round3 = (float) Math.round(Math.sin(d3) * d2);
        this.l.rewind();
        float k5 = k(this.f.getStrokeWidth() + this.j, -this.p, this.o);
        float f3 = (-k2) / 2.0f;
        this.l.moveTo(f3 + round, 0.0f);
        this.l.rLineTo(k2 - (round * 2.0f), 0.0f);
        this.l.moveTo(f3, k5);
        this.l.rLineTo(round2, round3);
        this.l.moveTo(f3, -k5);
        this.l.rLineTo(round2, -round3);
        this.l.close();
        canvas.save();
        float strokeWidth = this.f.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.j + ((((int) (height - (2.0f * f))) / 4) * 2));
        if (this.k) {
            canvas.rotate(k4 * (this.n ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.l, this.f);
        canvas.restore();
    }

    @w0
    public int e() {
        return this.f.getColor();
    }

    public int f() {
        return this.q;
    }

    public float g() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.f;
    }

    @g1(from = zg2.s, to = 1.0d)
    public float i() {
        return this.o;
    }

    public boolean j() {
        return this.k;
    }

    public void l(float f) {
        if (this.g != f) {
            this.g = f;
            invalidateSelf();
        }
    }

    public void m(float f) {
        if (this.i != f) {
            this.i = f;
            invalidateSelf();
        }
    }

    public void n(float f) {
        if (this.h != f) {
            this.h = f;
            invalidateSelf();
        }
    }

    public void o(float f) {
        if (this.f.getStrokeWidth() != f) {
            this.f.setStrokeWidth(f);
            this.p = (float) (Math.cos(e) * (f / 2.0f));
            invalidateSelf();
        }
    }

    public void p(@w0 int i) {
        if (i != this.f.getColor()) {
            this.f.setColor(i);
            invalidateSelf();
        }
    }

    public void q(int i) {
        if (i != this.q) {
            this.q = i;
            invalidateSelf();
        }
    }

    public void r(float f) {
        if (f != this.j) {
            this.j = f;
            invalidateSelf();
        }
    }

    public void s(@g1(from = 0.0d, to = 1.0d) float f) {
        if (this.o != f) {
            this.o = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f.getAlpha()) {
            this.f.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void t(boolean z) {
        if (this.k != z) {
            this.k = z;
            invalidateSelf();
        }
    }

    public void u(boolean z) {
        if (this.n != z) {
            this.n = z;
            invalidateSelf();
        }
    }
}