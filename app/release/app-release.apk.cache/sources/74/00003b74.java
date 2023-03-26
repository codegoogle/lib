package com.p7700g.p99005;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p7700g.p99005.pp3;

/* compiled from: ColorAnimation.java */
/* loaded from: classes3.dex */
public class bq3 extends aq3<ValueAnimator> {
    public static final String e = "#33ffffff";
    public static final String f = "#ffffff";
    public static final String g = "ANIMATION_COLOR_REVERSE";
    public static final String h = "ANIMATION_COLOR";
    private sp3 i;
    public int j;
    public int k;

    /* compiled from: ColorAnimation.java */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            bq3.this.j(valueAnimator);
        }
    }

    public bq3(@z1 pp3.a aVar) {
        super(aVar);
        this.i = new sp3();
    }

    private boolean i(int i, int i2) {
        return (this.j == i && this.k == i2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(@x1 ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue(h)).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue(g)).intValue();
        this.i.c(intValue);
        this.i.d(intValue2);
        pp3.a aVar = this.c;
        if (aVar != null) {
            aVar.a(this.i);
        }
    }

    @Override // com.p7700g.p99005.aq3
    @x1
    /* renamed from: g */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    public PropertyValuesHolder h(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i = this.k;
            i2 = this.j;
            str = g;
        } else {
            i = this.j;
            i2 = this.k;
            str = h;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i, i2);
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    @Override // com.p7700g.p99005.aq3
    /* renamed from: k */
    public bq3 d(float f2) {
        T t = this.d;
        if (t != 0) {
            long j = f2 * ((float) this.b);
            if (((ValueAnimator) t).getValues() != null && ((ValueAnimator) this.d).getValues().length > 0) {
                ((ValueAnimator) this.d).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    @x1
    public bq3 l(int i, int i2) {
        if (this.d != 0 && i(i, i2)) {
            this.j = i;
            this.k = i2;
            ((ValueAnimator) this.d).setValues(h(false), h(true));
        }
        return this;
    }
}