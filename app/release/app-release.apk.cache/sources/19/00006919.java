package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.p7700g.p99005.ag2;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.z90;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* compiled from: BaseProgressIndicator.java */
/* loaded from: classes3.dex */
public abstract class zf2<S extends ag2> extends ProgressBar {
    public static final int A = 255;
    public static final int B = 1000;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = ga2.n.Bi;
    public static final float z = 0.2f;
    public S C;
    private int D;
    private boolean E;
    private boolean F;
    private final int G;
    private final int H;
    private long I;
    public yf2 J;
    private boolean K;
    private int L;
    private final Runnable M;
    private final Runnable N;
    private final z90.a O;
    private final z90.a P;

    /* compiled from: BaseProgressIndicator.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zf2.this.l();
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zf2.this.k();
            zf2.this.I = -1L;
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* loaded from: classes3.dex */
    public class c extends z90.a {
        public c() {
        }

        @Override // com.p7700g.p99005.z90.a
        public void b(Drawable drawable) {
            zf2.this.setIndeterminate(false);
            zf2 zf2Var = zf2.this;
            zf2Var.p(zf2Var.D, zf2.this.E);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* loaded from: classes3.dex */
    public class d extends z90.a {
        public d() {
        }

        @Override // com.p7700g.p99005.z90.a
        public void b(Drawable drawable) {
            super.b(drawable);
            if (zf2.this.K) {
                return;
            }
            zf2 zf2Var = zf2.this;
            zf2Var.setVisibility(zf2Var.L);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface e {
    }

    /* compiled from: BaseProgressIndicator.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface f {
    }

    public zf2(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        super(yi2.c(context, attributeSet, i, y), attributeSet, i);
        this.I = -1L;
        this.K = false;
        this.L = 4;
        this.M = new a();
        this.N = new b();
        this.O = new c();
        this.P = new d();
        Context context2 = getContext();
        this.C = i(context2, attributeSet);
        TypedArray j = cf2.j(context2, attributeSet, ga2.o.j4, i, i2, new int[0]);
        this.G = j.getInt(ga2.o.p4, -1);
        this.H = Math.min(j.getInt(ga2.o.n4, -1), 1000);
        j.recycle();
        this.J = new yf2();
        this.F = true;
    }

    @z1
    private hg2<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().A();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ((gg2) getCurrentDrawable()).v(false, false, true);
        if (n()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.H > 0) {
            this.I = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean n() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    private void o() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().z().d(this.O);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().b(this.P);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b(this.P);
        }
    }

    private void r() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().d(this.P);
            getIndeterminateDrawable().z().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().d(this.P);
        }
    }

    @Override // android.widget.ProgressBar
    @z1
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.C.f;
    }

    @x1
    public int[] getIndicatorColor() {
        return this.C.c;
    }

    public int getShowAnimationBehavior() {
        return this.C.e;
    }

    @w0
    public int getTrackColor() {
        return this.C.d;
    }

    @c2
    public int getTrackCornerRadius() {
        return this.C.b;
    }

    @c2
    public int getTrackThickness() {
        return this.C.a;
    }

    public void h(boolean z2) {
        if (this.F) {
            ((gg2) getCurrentDrawable()).v(s(), false, z2);
        }
    }

    public abstract S i(@x1 Context context, @x1 AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public void j() {
        if (getVisibility() != 0) {
            removeCallbacks(this.M);
            return;
        }
        removeCallbacks(this.N);
        long uptimeMillis = SystemClock.uptimeMillis() - this.I;
        int i = this.H;
        if (uptimeMillis >= ((long) i)) {
            this.N.run();
        } else {
            postDelayed(this.N, i - uptimeMillis);
        }
    }

    public boolean m() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o();
        if (s()) {
            l();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.N);
        removeCallbacks(this.M);
        ((gg2) getCurrentDrawable()).l();
        r();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@x1 Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingTop;
        super.onMeasure(i, i2);
        hg2<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        int e2 = currentDrawingDelegate.e();
        int d2 = currentDrawingDelegate.d();
        if (e2 < 0) {
            paddingLeft = getMeasuredWidth();
        } else {
            paddingLeft = e2 + getPaddingLeft() + getPaddingRight();
        }
        if (d2 < 0) {
            paddingTop = getMeasuredHeight();
        } else {
            paddingTop = d2 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@x1 View view, int i) {
        super.onVisibilityChanged(view, i);
        h(i == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        h(false);
    }

    public void p(int i, boolean z2) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.D = i;
                this.E = z2;
                this.K = true;
                if (getIndeterminateDrawable().isVisible() && this.J.a(getContext().getContentResolver()) != 0.0f) {
                    getIndeterminateDrawable().z().f();
                    return;
                } else {
                    this.O.b(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() == null || z2) {
            return;
        }
        getProgressDrawable().jumpToCurrentState();
    }

    public void q() {
        if (this.G > 0) {
            removeCallbacks(this.M);
            postDelayed(this.M, this.G);
            return;
        }
        this.M.run();
    }

    public boolean s() {
        return sr.N0(this) && getWindowVisibility() == 0 && m();
    }

    @i2({i2.a.LIBRARY_GROUP})
    @r2
    public void setAnimatorDurationScaleProvider(@x1 yf2 yf2Var) {
        this.J = yf2Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().x = yf2Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().x = yf2Var;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.C.f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z2) {
        if (z2 == isIndeterminate()) {
            return;
        }
        gg2 gg2Var = (gg2) getCurrentDrawable();
        if (gg2Var != null) {
            gg2Var.l();
        }
        super.setIndeterminate(z2);
        gg2 gg2Var2 = (gg2) getCurrentDrawable();
        if (gg2Var2 != null) {
            gg2Var2.v(s(), false, false);
        }
        if ((gg2Var2 instanceof jg2) && s()) {
            ((jg2) gg2Var2).z().g();
        }
        this.K = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@z1 Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof jg2) {
            ((gg2) drawable).l();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(@w0 int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{kc2.b(getContext(), ga2.c.f3, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.C.c = iArr;
        getIndeterminateDrawable().z().c();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        p(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@z1 Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof fg2) {
            fg2 fg2Var = (fg2) drawable;
            fg2Var.l();
            super.setProgressDrawable(fg2Var);
            fg2Var.H(getProgress() / getMax());
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.C.e = i;
        invalidate();
    }

    public void setTrackColor(@w0 int i) {
        S s2 = this.C;
        if (s2.d != i) {
            s2.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@c2 int i) {
        S s2 = this.C;
        if (s2.b != i) {
            s2.b = Math.min(i, s2.a / 2);
        }
    }

    public void setTrackThickness(@c2 int i) {
        S s2 = this.C;
        if (s2.a != i) {
            s2.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.L = i;
    }

    @Override // android.widget.ProgressBar
    @z1
    public jg2<S> getIndeterminateDrawable() {
        return (jg2) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @z1
    public fg2<S> getProgressDrawable() {
        return (fg2) super.getProgressDrawable();
    }
}