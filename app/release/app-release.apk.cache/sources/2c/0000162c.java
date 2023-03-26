package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: ShimmerDrawable.java */
/* loaded from: classes2.dex */
public final class d extends Drawable {
    private final ValueAnimator.AnimatorUpdateListener a = new a();
    private final Paint b;
    private final Rect c;
    private final Matrix d;
    @z1
    private ValueAnimator e;
    @z1
    private c f;

    /* compiled from: ShimmerDrawable.java */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.invalidateSelf();
        }
    }

    public d() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    private float c(float f, float f2, float f3) {
        return wo1.a(f2, f, f3, f);
    }

    private void g() {
        c cVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || (cVar = this.f) == null) {
            return;
        }
        int e = cVar.e(width);
        int a2 = this.f.a(height);
        c cVar2 = this.f;
        boolean z = true;
        if (cVar2.h != 1) {
            int i = cVar2.e;
            if (i != 1 && i != 3) {
                z = false;
            }
            if (z) {
                e = 0;
            }
            if (!z) {
                a2 = 0;
            }
            float f = a2;
            c cVar3 = this.f;
            radialGradient = new LinearGradient(0.0f, 0.0f, e, f, cVar3.c, cVar3.b, Shader.TileMode.CLAMP);
        } else {
            float f2 = a2 / 2.0f;
            float max = (float) (Math.max(e, a2) / Math.sqrt(2.0d));
            c cVar4 = this.f;
            radialGradient = new RadialGradient(e / 2.0f, f2, max, cVar4.c, cVar4.b, Shader.TileMode.CLAMP);
        }
        this.b.setShader(radialGradient);
    }

    private void h() {
        boolean z;
        if (this.f == null) {
            return;
        }
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            z = valueAnimator.isStarted();
            this.e.cancel();
            this.e.removeAllUpdateListeners();
        } else {
            z = false;
        }
        c cVar = this.f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (cVar.v / cVar.u)) + 1.0f);
        this.e = ofFloat;
        ofFloat.setRepeatMode(this.f.t);
        this.e.setRepeatCount(this.f.s);
        ValueAnimator valueAnimator2 = this.e;
        c cVar2 = this.f;
        valueAnimator2.setDuration(cVar2.u + cVar2.v);
        this.e.addUpdateListener(this.a);
        if (z) {
            this.e.start();
        }
    }

    public boolean a() {
        ValueAnimator valueAnimator = this.e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public void b() {
        c cVar;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator.isStarted() || (cVar = this.f) == null || !cVar.q || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public void d(@z1 c cVar) {
        this.f = cVar;
        if (cVar != null) {
            this.b.setXfermode(new PorterDuffXfermode(this.f.r ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        g();
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        float c;
        float c2;
        if (this.f == null || this.b.getShader() == null) {
            return;
        }
        float tan = (float) Math.tan(Math.toRadians(this.f.o));
        float width = (this.c.width() * tan) + this.c.height();
        float height = (tan * this.c.height()) + this.c.width();
        ValueAnimator valueAnimator = this.e;
        float f = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i = this.f.e;
        if (i != 1) {
            if (i == 2) {
                c2 = c(height, -height, animatedFraction);
            } else if (i != 3) {
                c2 = c(-height, height, animatedFraction);
            } else {
                c = c(width, -width, animatedFraction);
            }
            f = c2;
            c = 0.0f;
        } else {
            c = c(-width, width, animatedFraction);
        }
        this.d.reset();
        this.d.setRotate(this.f.o, this.c.width() / 2.0f, this.c.height() / 2.0f);
        this.d.postTranslate(f, c);
        this.b.getShader().setLocalMatrix(this.d);
        canvas.drawRect(this.c, this.b);
    }

    public void e() {
        if (this.e == null || a() || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public void f() {
        if (this.e == null || !a()) {
            return;
        }
        this.e.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        c cVar = this.f;
        return (cVar == null || !(cVar.p || cVar.r)) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        g();
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@z1 ColorFilter colorFilter) {
    }
}