package com.anythink.basead.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.anythink.core.common.j.h;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class ScanningAnimTextView extends TextView {
    private Paint a;
    private Paint b;
    private Paint c;
    private int d;
    private RectF e;
    private ValueAnimator f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private Bitmap m;
    private Canvas n;

    public ScanningAnimTextView(Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = true;
        this.k = h.a(context, 10.0f);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(Color.parseColor("#7fffffff"));
        this.a.setStrokeWidth(this.k);
        this.a.setMaskFilter(new BlurMaskFilter(20.0f, BlurMaskFilter.Blur.NORMAL));
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint2.setColor(sr.t);
        this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint3 = new Paint(1);
        this.c = paint3;
        paint3.setColor(sr.t);
        this.d = h.a(getContext(), 24.0f);
        this.g = -this.k;
        int a = h.a(context, 20.0f);
        this.i = a;
        this.h = this.g - a;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.l || this.m == null || this.n == null) {
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        this.m.eraseColor(0);
        int i = this.g;
        int i2 = this.j;
        canvas.drawLine(i + i2, 0.0f, this.h + i2, getHeight(), this.a);
        Canvas canvas2 = this.n;
        RectF rectF = this.e;
        int i3 = this.d;
        canvas2.drawRoundRect(rectF, i3, i3, this.c);
        canvas.drawBitmap(this.m, 0.0f, 0.0f, this.b);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != 0 && i2 != 0) {
            try {
                RectF rectF = new RectF();
                this.e = rectF;
                rectF.left = 0.0f;
                rectF.top = 0.0f;
                rectF.right = i;
                rectF.bottom = i2;
                this.m = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.n = new Canvas(this.m);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.l = true;
            post(new Runnable() { // from class: com.anythink.basead.ui.ScanningAnimTextView.1
                @Override // java.lang.Runnable
                public final void run() {
                    ScanningAnimTextView.this.startAnimation();
                }
            });
            return;
        }
        this.l = false;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    public void startAnimation() {
        if (this.f == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f = ofFloat;
            ofFloat.setDuration(1200L);
            this.f.setRepeatMode(1);
            this.f.setRepeatCount(-1);
            this.f.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.ScanningAnimTextView.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScanningAnimTextView.this.j = (int) (((ScanningAnimTextView.this.k * 2) + ScanningAnimTextView.this.i + ScanningAnimTextView.this.getWidth()) * ((Float) valueAnimator.getAnimatedValue()).floatValue());
                    ScanningAnimTextView.this.invalidate();
                }
            });
        }
        this.f.start();
    }

    private void a(Context context) {
        this.k = h.a(context, 10.0f);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(Color.parseColor("#7fffffff"));
        this.a.setStrokeWidth(this.k);
        this.a.setMaskFilter(new BlurMaskFilter(20.0f, BlurMaskFilter.Blur.NORMAL));
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint2.setColor(sr.t);
        this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint3 = new Paint(1);
        this.c = paint3;
        paint3.setColor(sr.t);
        this.d = h.a(getContext(), 24.0f);
        this.g = -this.k;
        int a = h.a(context, 20.0f);
        this.i = a;
        this.h = this.g - a;
    }
}