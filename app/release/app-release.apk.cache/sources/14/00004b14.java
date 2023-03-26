package com.p7700g.p99005;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p7700g.p99005.kq3;
import com.p7700g.p99005.pp3;

/* compiled from: ThinWormAnimation.java */
/* loaded from: classes3.dex */
public class jq3 extends kq3 {
    private yp3 l;

    /* compiled from: ThinWormAnimation.java */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            jq3.this.r(valueAnimator);
        }
    }

    public jq3(@x1 pp3.a aVar) {
        super(aVar);
        this.l = new yp3();
    }

    private ValueAnimator p(int i, int i2, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new a());
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(@x1 ValueAnimator valueAnimator) {
        this.l.f(((Integer) valueAnimator.getAnimatedValue()).intValue());
        pp3.a aVar = this.c;
        if (aVar != null) {
            aVar.a(this.l);
        }
    }

    @Override // com.p7700g.p99005.kq3
    public kq3 n(int i, int i2, int i3, boolean z) {
        if (k(i, i2, i3, z)) {
            this.d = a();
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = z;
            int i4 = i3 * 2;
            int i5 = i - i3;
            this.i = i5;
            this.j = i + i3;
            this.l.d(i5);
            this.l.c(this.j);
            this.l.f(i4);
            kq3.b h = h(z);
            long j = this.b;
            long j2 = (long) (j * 0.8d);
            long j3 = (long) (j * 0.2d);
            long j4 = (long) (j * 0.5d);
            long j5 = (long) (j * 0.5d);
            ValueAnimator i6 = i(h.a, h.b, j2, false, this.l);
            ValueAnimator i7 = i(h.c, h.d, j2, true, this.l);
            i7.setStartDelay(j3);
            ValueAnimator p = p(i4, i3, j4);
            ValueAnimator p2 = p(i3, i4, j4);
            p2.setStartDelay(j5);
            ((AnimatorSet) this.d).playTogether(i6, i7, p, p2);
        }
        return this;
    }

    @Override // com.p7700g.p99005.kq3
    /* renamed from: q */
    public jq3 j(long j) {
        super.b(j);
        return this;
    }

    @Override // com.p7700g.p99005.kq3
    /* renamed from: s */
    public jq3 m(float f) {
        T t = this.d;
        if (t != 0) {
            long j = f * ((float) this.b);
            int size = ((AnimatorSet) t).getChildAnimations().size();
            for (int i = 0; i < size; i++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.d).getChildAnimations().get(i);
                long startDelay = j - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
        return this;
    }
}