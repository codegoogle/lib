package com.p7700g.p99005;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p7700g.p99005.pp3;

/* compiled from: ScaleAnimation.java */
/* loaded from: classes3.dex */
public class fq3 extends bq3 {
    public static final float l = 0.7f;
    public static final float m = 0.3f;
    public static final float n = 1.0f;
    public static final String o = "ANIMATION_SCALE_REVERSE";
    public static final String p = "ANIMATION_SCALE";
    public int q;
    public float r;
    private vp3 s;

    /* compiled from: ScaleAnimation.java */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            fq3.this.j(valueAnimator);
        }
    }

    public fq3(@x1 pp3.a aVar) {
        super(aVar);
        this.s = new vp3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(@x1 ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue(bq3.h)).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue(bq3.g)).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue(p)).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue(o)).intValue();
        this.s.c(intValue);
        this.s.d(intValue2);
        this.s.g(intValue3);
        this.s.h(intValue4);
        pp3.a aVar = this.c;
        if (aVar != null) {
            aVar.a(this.s);
        }
    }

    private boolean o(int i, int i2, int i3, float f) {
        return (this.j == i && this.k == i2 && this.q == i3 && this.r == f) ? false : true;
    }

    @Override // com.p7700g.p99005.bq3, com.p7700g.p99005.aq3
    @x1
    /* renamed from: g */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    @x1
    public PropertyValuesHolder n(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i2 = this.q;
            i = (int) (i2 * this.r);
            str = o;
        } else {
            i = this.q;
            i2 = (int) (i * this.r);
            str = p;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i2, i);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    @x1
    public fq3 p(int i, int i2, int i3, float f) {
        if (this.d != 0 && o(i, i2, i3, f)) {
            this.j = i;
            this.k = i2;
            this.q = i3;
            this.r = f;
            ((ValueAnimator) this.d).setValues(h(false), h(true), n(false), n(true));
        }
        return this;
    }
}