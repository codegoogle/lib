package com.p7700g.p99005;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p7700g.p99005.pp3;

/* compiled from: FillAnimation.java */
/* loaded from: classes3.dex */
public class dq3 extends bq3 {
    private static final String l = "ANIMATION_RADIUS_REVERSE";
    private static final String m = "ANIMATION_RADIUS";
    private static final String n = "ANIMATION_STROKE_REVERSE";
    private static final String o = "ANIMATION_STROKE";
    public static final int p = 1;
    private up3 q;
    private int r;
    private int s;

    /* compiled from: FillAnimation.java */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            dq3.this.j(valueAnimator);
        }
    }

    public dq3(@x1 pp3.a aVar) {
        super(aVar);
        this.q = new up3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(@x1 ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue(bq3.h)).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue(bq3.g)).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue(m)).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue(l)).intValue();
        int intValue5 = ((Integer) valueAnimator.getAnimatedValue(o)).intValue();
        int intValue6 = ((Integer) valueAnimator.getAnimatedValue(n)).intValue();
        this.q.c(intValue);
        this.q.d(intValue2);
        this.q.i(intValue3);
        this.q.j(intValue4);
        this.q.k(intValue5);
        this.q.l(intValue6);
        pp3.a aVar = this.c;
        if (aVar != null) {
            aVar.a(this.q);
        }
    }

    @x1
    private PropertyValuesHolder n(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i2 = this.r;
            i = i2 / 2;
            str = l;
        } else {
            i = this.r;
            i2 = i / 2;
            str = m;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i, i2);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    @x1
    private PropertyValuesHolder o(boolean z) {
        String str;
        int i;
        int i2;
        if (z) {
            i2 = this.r;
            str = n;
            i = 0;
        } else {
            int i3 = this.r;
            str = o;
            i = i3;
            i2 = 0;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i2, i);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private boolean p(int i, int i2, int i3, int i4) {
        return (this.j == i && this.k == i2 && this.r == i3 && this.s == i4) ? false : true;
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
    public dq3 q(int i, int i2, int i3, int i4) {
        if (this.d != 0 && p(i, i2, i3, i4)) {
            this.j = i;
            this.k = i2;
            this.r = i3;
            this.s = i4;
            ((ValueAnimator) this.d).setValues(h(false), h(true), n(false), n(true), o(false), o(true));
        }
        return this;
    }
}