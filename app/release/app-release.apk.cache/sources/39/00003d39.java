package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p7700g.p99005.pp3;
import java.util.Iterator;

/* compiled from: DropAnimation.java */
/* loaded from: classes3.dex */
public class cq3 extends aq3<AnimatorSet> {
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private tp3 j;

    /* compiled from: DropAnimation.java */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ c s;

        public a(c cVar) {
            this.s = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            cq3.this.k(valueAnimator, this.s);
        }
    }

    /* compiled from: DropAnimation.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            c.values();
            int[] iArr = new int[3];
            a = iArr;
            try {
                iArr[c.Width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.Height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.Radius.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: DropAnimation.java */
    /* loaded from: classes3.dex */
    public enum c {
        Width,
        Height,
        Radius
    }

    public cq3(@x1 pp3.a aVar) {
        super(aVar);
        this.j = new tp3();
    }

    private ValueAnimator h(int i, int i2, long j, c cVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new a(cVar));
        return ofInt;
    }

    private boolean j(int i, int i2, int i3, int i4, int i5) {
        return (this.e == i && this.f == i2 && this.g == i3 && this.h == i4 && this.i == i5) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(@x1 ValueAnimator valueAnimator, @x1 c cVar) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            this.j.f(intValue);
        } else if (ordinal == 1) {
            this.j.d(intValue);
        } else if (ordinal == 2) {
            this.j.e(intValue);
        }
        pp3.a aVar = this.c;
        if (aVar != null) {
            aVar.a(this.j);
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

    @Override // com.p7700g.p99005.aq3
    /* renamed from: i */
    public cq3 b(long j) {
        super.b(j);
        return this;
    }

    @Override // com.p7700g.p99005.aq3
    /* renamed from: l */
    public cq3 d(float f) {
        T t = this.d;
        if (t != 0) {
            long j = f * ((float) this.b);
            boolean z = false;
            Iterator<Animator> it = ((AnimatorSet) t).getChildAnimations().iterator();
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                long j2 = z ? j - duration : j;
                if (j2 >= 0) {
                    if (j2 >= duration) {
                        j2 = duration;
                    }
                    if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                        valueAnimator.setCurrentPlayTime(j2);
                    }
                    if (!z && duration >= this.b) {
                        z = true;
                    }
                }
            }
        }
        return this;
    }

    public cq3 m(int i, int i2, int i3, int i4, int i5) {
        if (j(i, i2, i3, i4, i5)) {
            this.d = a();
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = i4;
            this.i = i5;
            int i6 = (int) (i5 / 1.5d);
            long j = this.b;
            long j2 = j / 2;
            ValueAnimator h = h(i, i2, j, c.Width);
            c cVar = c.Height;
            ValueAnimator h2 = h(i3, i4, j2, cVar);
            c cVar2 = c.Radius;
            ValueAnimator h3 = h(i5, i6, j2, cVar2);
            ValueAnimator h4 = h(i4, i3, j2, cVar);
            ((AnimatorSet) this.d).play(h2).with(h3).with(h).before(h4).before(h(i6, i5, j2, cVar2));
        }
        return this;
    }
}