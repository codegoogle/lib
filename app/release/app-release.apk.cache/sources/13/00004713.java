package com.p7700g.p99005;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p7700g.p99005.pp3;

/* compiled from: SlideAnimation.java */
/* loaded from: classes3.dex */
public class hq3 extends aq3<ValueAnimator> {
    private static final String e = "ANIMATION_COORDINATE";
    private static final int f = -1;
    private wp3 g;
    private int h;
    private int i;

    /* compiled from: SlideAnimation.java */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            hq3.this.j(valueAnimator);
        }
    }

    public hq3(@x1 pp3.a aVar) {
        super(aVar);
        this.h = -1;
        this.i = -1;
        this.g = new wp3();
    }

    private PropertyValuesHolder h() {
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(e, this.h, this.i);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private boolean i(int i, int i2) {
        return (this.h == i && this.i == i2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(@x1 ValueAnimator valueAnimator) {
        this.g.b(((Integer) valueAnimator.getAnimatedValue(e)).intValue());
        pp3.a aVar = this.c;
        if (aVar != null) {
            aVar.a(this.g);
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

    @Override // com.p7700g.p99005.aq3
    /* renamed from: k */
    public hq3 d(float f2) {
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
    public hq3 l(int i, int i2) {
        if (this.d != 0 && i(i, i2)) {
            this.h = i;
            this.i = i2;
            ((ValueAnimator) this.d).setValues(h());
        }
        return this;
    }
}