package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ScaleText.java */
/* loaded from: classes3.dex */
public class ce3 extends wd3 {
    public float n = 20.0f;
    public float o = 400.0f;
    private List<sd3> p = new ArrayList();
    private long q;
    private ValueAnimator r;

    /* compiled from: ScaleText.java */
    /* loaded from: classes3.dex */
    public class a extends ud3 {
        public a() {
        }

        @Override // com.p7700g.p99005.ud3, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (ce3.this.m != null) {
                ce3.this.m.a(ce3.this.g);
            }
        }
    }

    /* compiled from: ScaleText.java */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ce3.this.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ce3.this.g.invalidate();
        }
    }

    /* compiled from: ScaleText.java */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public final /* synthetic */ CharSequence s;

        public c(CharSequence charSequence) {
            this.s = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ce3.this.g == null || ce3.this.g.getLayout() == null) {
                return;
            }
            ce3 ce3Var = ce3.this;
            ce3Var.l = ce3Var.g.getLayout().getLineLeft(0);
            ce3.super.c(this.s);
        }
    }

    @Override // com.p7700g.p99005.wd3, com.p7700g.p99005.yd3
    public void c(CharSequence charSequence) {
        xd3 xd3Var = this.g;
        if (xd3Var == null || xd3Var.getLayout() == null) {
            return;
        }
        this.g.post(new c(charSequence));
    }

    @Override // com.p7700g.p99005.wd3, com.p7700g.p99005.yd3
    public void d(xd3 xd3Var, AttributeSet attributeSet, int i) {
        super.d(xd3Var, attributeSet, i);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.r = valueAnimator;
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        this.r.addListener(new a());
        this.r.addUpdateListener(new b());
        int length = this.c.length();
        if (length <= 0) {
            length = 1;
        }
        float f = this.o;
        this.q = ((f / this.n) * (length - 1)) + f;
    }

    @Override // com.p7700g.p99005.wd3
    public void e(CharSequence charSequence) {
        this.p.clear();
        this.p.addAll(td3.a(this.d, this.c));
    }

    @Override // com.p7700g.p99005.wd3
    public void f(CharSequence charSequence) {
        int length = this.c.length();
        if (length <= 0) {
            length = 1;
        }
        float f = this.o;
        this.q = ((f / this.n) * (length - 1)) + f;
        this.r.cancel();
        this.r.setFloatValues(0.0f, 1.0f);
        this.r.setDuration(this.q);
        this.r.start();
    }

    @Override // com.p7700g.p99005.wd3
    public void g(Canvas canvas) {
        float f;
        String str;
        int i;
        float lineLeft = this.g.getLayout().getLineLeft(0);
        float baseline = this.g.getBaseline();
        float f2 = this.l;
        int max = Math.max(this.c.length(), this.d.length());
        float f3 = lineLeft;
        float f4 = f2;
        int i2 = 0;
        while (i2 < max) {
            if (i2 < this.d.length()) {
                int c2 = td3.c(i2, this.p);
                if (c2 != -1) {
                    this.f.setTextSize(this.k);
                    this.f.setAlpha(255);
                    float f5 = this.j * 2.0f;
                    str = "";
                    float b2 = td3.b(i2, c2, f5 > 1.0f ? 1.0f : f5, lineLeft, this.l, this.h, this.i);
                    f = lineLeft;
                    i = 255;
                    canvas.drawText(this.d.charAt(i2) + str, 0, 1, b2, baseline, (Paint) this.f);
                } else {
                    f = lineLeft;
                    str = "";
                    i = 255;
                    this.f.setAlpha((int) ((1.0f - this.j) * 255.0f));
                    this.f.setTextSize((1.0f - this.j) * this.k);
                    canvas.drawText(this.d.charAt(i2) + str, 0, 1, ((this.i.get(i2).floatValue() - this.f.measureText(this.d.charAt(i2) + str)) / 2.0f) + f4, baseline, (Paint) this.f);
                }
                f4 = this.i.get(i2).floatValue() + f4;
            } else {
                f = lineLeft;
                str = "";
                i = 255;
            }
            if (i2 < this.c.length()) {
                if (!td3.d(i2, this.p)) {
                    float f6 = this.o;
                    float f7 = this.j;
                    long j = this.q;
                    float f8 = i2;
                    float f9 = this.n;
                    int i3 = (int) (((((float) j) * f7) - ((f6 * f8) / f9)) * (255.0f / f6));
                    if (i3 <= i) {
                        i = i3;
                    }
                    if (i < 0) {
                        i = 0;
                    }
                    float f10 = this.k;
                    float f11 = ((f7 * ((float) j)) - ((f6 * f8) / f9)) * ((1.0f * f10) / f6);
                    if (f11 <= f10) {
                        f10 = f11;
                    }
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    this.e.setAlpha(i);
                    this.e.setTextSize(f10);
                    canvas.drawText(this.c.charAt(i2) + str, 0, 1, ((this.h.get(i2).floatValue() - this.e.measureText(this.c.charAt(i2) + str)) / 2.0f) + f3, baseline, (Paint) this.e);
                }
                f3 += this.h.get(i2).floatValue();
            }
            i2++;
            lineLeft = f;
        }
    }

    @Override // com.p7700g.p99005.wd3
    public void h() {
    }
}