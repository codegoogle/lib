package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p7700g.p99005.pp3;
import java.util.Iterator;

/* compiled from: WormAnimation.java */
/* loaded from: classes3.dex */
public class kq3 extends aq3<AnimatorSet> {
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    private zp3 k;

    /* compiled from: WormAnimation.java */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ zp3 s;
        public final /* synthetic */ boolean t;

        public a(zp3 zp3Var, boolean z) {
            this.s = zp3Var;
            this.t = z;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            kq3.this.l(this.s, valueAnimator, this.t);
        }
    }

    /* compiled from: WormAnimation.java */
    /* loaded from: classes3.dex */
    public class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public b(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    public kq3(@x1 pp3.a aVar) {
        super(aVar);
        this.k = new zp3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(@x1 zp3 zp3Var, @x1 ValueAnimator valueAnimator, boolean z) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (this.h) {
            if (!z) {
                zp3Var.c(intValue);
            } else {
                zp3Var.d(intValue);
            }
        } else if (!z) {
            zp3Var.d(intValue);
        } else {
            zp3Var.c(intValue);
        }
        pp3.a aVar = this.c;
        if (aVar != null) {
            aVar.a(zp3Var);
        }
    }

    @Override // com.p7700g.p99005.aq3
    @x1
    /* renamed from: g */
    public AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    @x1
    public b h(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.e;
            int i6 = this.g;
            i = i5 + i6;
            int i7 = this.f;
            i2 = i7 + i6;
            i3 = i5 - i6;
            i4 = i7 - i6;
        } else {
            int i8 = this.e;
            int i9 = this.g;
            i = i8 - i9;
            int i10 = this.f;
            i2 = i10 - i9;
            i3 = i8 + i9;
            i4 = i10 + i9;
        }
        return new b(i, i2, i3, i4);
    }

    public ValueAnimator i(int i, int i2, long j, boolean z, zp3 zp3Var) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new a(zp3Var, z));
        return ofInt;
    }

    @Override // com.p7700g.p99005.aq3
    /* renamed from: j */
    public kq3 b(long j) {
        super.b(j);
        return this;
    }

    public boolean k(int i, int i2, int i3, boolean z) {
        return (this.e == i && this.f == i2 && this.g == i3 && this.h == z) ? false : true;
    }

    @Override // com.p7700g.p99005.aq3
    /* renamed from: m */
    public kq3 d(float f) {
        T t = this.d;
        if (t == 0) {
            return this;
        }
        long j = f * ((float) this.b);
        Iterator<Animator> it = ((AnimatorSet) t).getChildAnimations().iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            long duration = valueAnimator.getDuration();
            if (j <= duration) {
                duration = j;
            }
            valueAnimator.setCurrentPlayTime(duration);
            j -= duration;
        }
        return this;
    }

    public kq3 n(int i, int i2, int i3, boolean z) {
        if (k(i, i2, i3, z)) {
            this.d = a();
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = z;
            int i4 = i - i3;
            this.i = i4;
            this.j = i + i3;
            this.k.d(i4);
            this.k.c(this.j);
            b h = h(z);
            long j = this.b / 2;
            ((AnimatorSet) this.d).playSequentially(i(h.a, h.b, j, false, this.k), i(h.c, h.d, j, true, this.k));
        }
        return this;
    }
}