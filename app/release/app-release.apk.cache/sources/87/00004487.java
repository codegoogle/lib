package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.p7700g.p99005.z90;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes3.dex */
public abstract class gg2 extends Drawable implements z90 {
    private static final boolean s = false;
    private static final int t = 500;
    private static final Property<gg2, Float> u = new c(Float.class, "growFraction");
    private boolean A;
    private boolean B;
    private float C;
    private List<z90.a> D;
    private z90.a E;
    private boolean F;
    private float G;
    private int I;
    public final Context v;
    public final ag2 w;
    private ValueAnimator y;
    private ValueAnimator z;
    public final Paint H = new Paint();
    public yf2 x = new yf2();

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            gg2.this.h();
        }
    }

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            gg2.super.setVisible(false, false);
            gg2.this.g();
        }
    }

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes3.dex */
    public class c extends Property<gg2, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(gg2 gg2Var) {
            return Float.valueOf(gg2Var.j());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(gg2 gg2Var, Float f) {
            gg2Var.p(f.floatValue());
        }
    }

    public gg2(@x1 Context context, @x1 ag2 ag2Var) {
        this.v = context;
        this.w = ag2Var;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        z90.a aVar = this.E;
        if (aVar != null) {
            aVar.b(this);
        }
        List<z90.a> list = this.D;
        if (list == null || this.F) {
            return;
        }
        for (z90.a aVar2 : list) {
            aVar2.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        z90.a aVar = this.E;
        if (aVar != null) {
            aVar.c(this);
        }
        List<z90.a> list = this.D;
        if (list == null || this.F) {
            return;
        }
        for (z90.a aVar2 : list) {
            aVar2.c(this);
        }
    }

    private void i(@x1 ValueAnimator... valueAnimatorArr) {
        boolean z = this.F;
        this.F = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.F = z;
    }

    private void o() {
        if (this.y == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, u, 0.0f, 1.0f);
            this.y = ofFloat;
            ofFloat.setDuration(500L);
            this.y.setInterpolator(ha2.b);
            u(this.y);
        }
        if (this.z == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, u, 1.0f, 0.0f);
            this.z = ofFloat2;
            ofFloat2.setDuration(500L);
            this.z.setInterpolator(ha2.b);
            q(this.z);
        }
    }

    private void q(@x1 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.z;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.z = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void u(@x1 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.y;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.y = valueAnimator;
        valueAnimator.addListener(new a());
    }

    public void b(@x1 z90.a aVar) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        if (this.D.contains(aVar)) {
            return;
        }
        this.D.add(aVar);
    }

    public void c() {
        this.D.clear();
        this.D = null;
    }

    public boolean d(@x1 z90.a aVar) {
        List<z90.a> list = this.D;
        if (list == null || !list.contains(aVar)) {
            return false;
        }
        this.D.remove(aVar);
        if (this.D.isEmpty()) {
            this.D = null;
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.I;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return n() || m();
    }

    public float j() {
        if (this.w.b() || this.w.a()) {
            if (!this.B && !this.A) {
                return this.G;
            }
            return this.C;
        }
        return 1.0f;
    }

    @x1
    public ValueAnimator k() {
        return this.z;
    }

    public boolean l() {
        return v(false, false, false);
    }

    public boolean m() {
        ValueAnimator valueAnimator = this.z;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.B;
    }

    public boolean n() {
        ValueAnimator valueAnimator = this.y;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.A;
    }

    public void p(@g1(from = 0.0d, to = 1.0d) float f) {
        if (this.G != f) {
            this.G = f;
            invalidateSelf();
        }
    }

    public void r(@x1 z90.a aVar) {
        this.E = aVar;
    }

    @r2
    public void s(boolean z, @g1(from = 0.0d, to = 1.0d) float f) {
        this.B = z;
        this.C = f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.I = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@z1 ColorFilter colorFilter) {
        this.H.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return v(z, z2, true);
    }

    public void start() {
        w(true, true, false);
    }

    public void stop() {
        w(false, true, false);
    }

    @r2
    public void t(boolean z, @g1(from = 0.0d, to = 1.0d) float f) {
        this.A = z;
        this.C = f;
    }

    public boolean v(boolean z, boolean z2, boolean z3) {
        return w(z, z2, z3 && this.x.a(this.v.getContentResolver()) > 0.0f);
    }

    public boolean w(boolean z, boolean z2, boolean z3) {
        o();
        if (isVisible() || z) {
            ValueAnimator valueAnimator = z ? this.y : this.z;
            if (!z3) {
                if (valueAnimator.isRunning()) {
                    valueAnimator.end();
                } else {
                    i(valueAnimator);
                }
                return super.setVisible(z, false);
            } else if (z3 && valueAnimator.isRunning()) {
                return false;
            } else {
                boolean z4 = !z || super.setVisible(z, false);
                if (!(z ? this.w.b() : this.w.a())) {
                    i(valueAnimator);
                    return z4;
                }
                if (!z2 && valueAnimator.isPaused()) {
                    valueAnimator.resume();
                } else {
                    valueAnimator.start();
                }
                return z4;
            }
        }
        return false;
    }
}