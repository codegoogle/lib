package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.za2;
import com.p7700g.p99005.ze2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

/* compiled from: BadgeDrawable.java */
/* loaded from: classes2.dex */
public class ya2 extends Drawable implements ze2.b {
    public static final int s = 8388661;
    public static final int t = 8388659;
    public static final int u = 8388693;
    public static final int v = 8388691;
    private static final int w = 9;
    @m2
    private static final int x = ga2.n.dh;
    @q0
    private static final int y = ga2.c.s0;
    public static final String z = "+";
    @x1
    private final WeakReference<Context> A;
    @x1
    private final lh2 B;
    @x1
    private final ze2 C;
    @x1
    private final Rect D;
    @x1
    private final za2 E;
    private float F;
    private float G;
    private int H;
    private float I;
    private float J;
    private float K;
    @z1
    private WeakReference<View> L;
    @z1
    private WeakReference<FrameLayout> M;

    /* compiled from: BadgeDrawable.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public final /* synthetic */ View s;
        public final /* synthetic */ FrameLayout t;

        public a(View view, FrameLayout frameLayout) {
            this.s = view;
            this.t = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            ya2.this.i0(this.s, this.t);
        }
    }

    /* compiled from: BadgeDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    private ya2(@x1 Context context, @t2 int i, @q0 int i2, @m2 int i3, @z1 za2.a aVar) {
        this.A = new WeakReference<>(context);
        cf2.c(context);
        this.D = new Rect();
        this.B = new lh2();
        ze2 ze2Var = new ze2(this);
        this.C = ze2Var;
        ze2Var.e().setTextAlign(Paint.Align.CENTER);
        Z(ga2.n.n8);
        this.E = new za2(context, i, i2, i3, aVar);
        J();
    }

    private void C() {
        this.C.e().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void D() {
        ColorStateList valueOf = ColorStateList.valueOf(this.E.f());
        if (this.B.y() != valueOf) {
            this.B.o0(valueOf);
            invalidateSelf();
        }
    }

    private void E() {
        WeakReference<View> weakReference = this.L;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.L.get();
        WeakReference<FrameLayout> weakReference2 = this.M;
        i0(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void F() {
        this.C.e().setColor(this.E.h());
        invalidateSelf();
    }

    private void G() {
        k0();
        this.C.j(true);
        j0();
        invalidateSelf();
    }

    private void H() {
        this.C.j(true);
        j0();
        invalidateSelf();
    }

    private void I() {
        boolean u2 = this.E.u();
        setVisible(u2, false);
        if (!ab2.a || p() == null || u2) {
            return;
        }
        ((ViewGroup) p().getParent()).invalidate();
    }

    private void J() {
        G();
        H();
        C();
        D();
        F();
        E();
        j0();
        I();
    }

    private void Y(@z1 tg2 tg2Var) {
        Context context;
        if (this.C.d() == tg2Var || (context = this.A.get()) == null) {
            return;
        }
        this.C.i(tg2Var, context);
        j0();
    }

    private void Z(@m2 int i) {
        Context context = this.A.get();
        if (context == null) {
            return;
        }
        Y(new tg2(context, i));
    }

    private void b(@x1 Context context, @x1 Rect rect, @x1 View view) {
        int i;
        float f;
        float f2;
        int x2 = x();
        int g = this.E.g();
        if (g != 8388691 && g != 8388693) {
            this.G = rect.top + x2;
        } else {
            this.G = rect.bottom - x2;
        }
        if (u() <= 9) {
            float f3 = !B() ? this.E.e : this.E.f;
            this.I = f3;
            this.K = f3;
            this.J = f3;
        } else {
            float f4 = this.E.f;
            this.I = f4;
            this.K = f4;
            this.J = (this.C.f(m()) / 2.0f) + this.E.g;
        }
        Resources resources = context.getResources();
        if (B()) {
            i = ga2.f.Z5;
        } else {
            i = ga2.f.W5;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int w2 = w();
        int g2 = this.E.g();
        if (g2 != 8388659 && g2 != 8388691) {
            if (sr.Y(view) == 0) {
                f2 = ((rect.right + this.J) - dimensionPixelSize) - w2;
            } else {
                f2 = (rect.left - this.J) + dimensionPixelSize + w2;
            }
            this.F = f2;
            return;
        }
        if (sr.Y(view) == 0) {
            f = (rect.left - this.J) + dimensionPixelSize + w2;
        } else {
            f = ((rect.right + this.J) - dimensionPixelSize) - w2;
        }
        this.F = f;
    }

    @x1
    public static ya2 d(@x1 Context context) {
        return new ya2(context, 0, y, x, null);
    }

    @x1
    public static ya2 e(@x1 Context context, @t2 int i) {
        return new ya2(context, i, y, x, null);
    }

    private void e0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != ga2.h.f3) {
            WeakReference<FrameLayout> weakReference = this.M;
            if (weakReference == null || weakReference.get() != viewGroup) {
                f0(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(ga2.h.f3);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.M = new WeakReference<>(frameLayout);
                frameLayout.post(new a(view, frameLayout));
            }
        }
    }

    @x1
    public static ya2 f(@x1 Context context, @x1 za2.a aVar) {
        return new ya2(context, 0, y, x, aVar);
    }

    private static void f0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void g(Canvas canvas) {
        Rect rect = new Rect();
        String m = m();
        this.C.e().getTextBounds(m, 0, m.length(), rect);
        canvas.drawText(m, this.F, this.G + (rect.height() / 2), this.C.e());
    }

    private void j0() {
        Context context = this.A.get();
        WeakReference<View> weakReference = this.L;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.D);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.M;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || ab2.a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        ab2.o(this.D, this.F, this.G, this.J, this.K);
        this.B.k0(this.I);
        if (rect.equals(this.D)) {
            return;
        }
        this.B.setBounds(this.D);
    }

    private void k0() {
        this.H = ((int) Math.pow(10.0d, t() - 1.0d)) - 1;
    }

    @x1
    private String m() {
        if (u() <= this.H) {
            return NumberFormat.getInstance(this.E.p()).format(u());
        }
        Context context = this.A.get();
        return context == null ? "" : String.format(this.E.p(), context.getString(ga2.m.D0), Integer.valueOf(this.H), z);
    }

    private int w() {
        return this.E.c() + (B() ? this.E.l() : this.E.m());
    }

    private int x() {
        return this.E.d() + (B() ? this.E.r() : this.E.s());
    }

    @c2
    public int A() {
        return this.E.s();
    }

    public boolean B() {
        return this.E.t();
    }

    public void K(int i) {
        this.E.w(i);
        j0();
    }

    public void L(@c2 int i) {
        this.E.x(i);
        j0();
    }

    public void M(@w0 int i) {
        this.E.z(i);
        D();
    }

    public void N(int i) {
        if (this.E.g() != i) {
            this.E.A(i);
            E();
        }
    }

    public void O(@x1 Locale locale) {
        if (locale.equals(this.E.p())) {
            return;
        }
        this.E.J(locale);
        invalidateSelf();
    }

    public void P(@w0 int i) {
        if (this.C.e().getColor() != i) {
            this.E.B(i);
            F();
        }
    }

    public void Q(@l2 int i) {
        this.E.C(i);
    }

    public void R(CharSequence charSequence) {
        this.E.D(charSequence);
    }

    public void S(@b2 int i) {
        this.E.E(i);
    }

    public void T(int i) {
        V(i);
        U(i);
    }

    public void U(@c2 int i) {
        this.E.F(i);
        j0();
    }

    public void V(@c2 int i) {
        this.E.G(i);
        j0();
    }

    public void W(int i) {
        if (this.E.n() != i) {
            this.E.H(i);
            G();
        }
    }

    public void X(int i) {
        int max = Math.max(0, i);
        if (this.E.o() != max) {
            this.E.I(max);
            H();
        }
    }

    @Override // com.p7700g.p99005.ze2.b
    @i2({i2.a.LIBRARY_GROUP})
    public void a() {
        invalidateSelf();
    }

    public void a0(int i) {
        c0(i);
        b0(i);
    }

    public void b0(@c2 int i) {
        this.E.K(i);
        j0();
    }

    public void c() {
        if (B()) {
            this.E.a();
            H();
        }
    }

    public void c0(@c2 int i) {
        this.E.L(i);
        j0();
    }

    public void d0(boolean z2) {
        this.E.M(z2);
        I();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.B.draw(canvas);
        if (B()) {
            g(canvas);
        }
    }

    public void g0(@x1 View view) {
        i0(view, null);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.E.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.D.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.D.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int h() {
        return this.E.c();
    }

    @Deprecated
    public void h0(@x1 View view, @z1 ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            i0(view, (FrameLayout) viewGroup);
            return;
        }
        throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
    }

    @c2
    public int i() {
        return this.E.d();
    }

    public void i0(@x1 View view, @z1 FrameLayout frameLayout) {
        this.L = new WeakReference<>(view);
        boolean z2 = ab2.a;
        if (z2 && frameLayout == null) {
            e0(view);
        } else {
            this.M = new WeakReference<>(frameLayout);
        }
        if (!z2) {
            f0(view);
        }
        j0();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @w0
    public int j() {
        return this.B.y().getDefaultColor();
    }

    public int k() {
        return this.E.g();
    }

    @x1
    public Locale l() {
        return this.E.p();
    }

    @w0
    public int n() {
        return this.C.e().getColor();
    }

    @z1
    public CharSequence o() {
        Context context;
        if (isVisible()) {
            if (B()) {
                if (this.E.k() == 0 || (context = this.A.get()) == null) {
                    return null;
                }
                if (u() <= this.H) {
                    return context.getResources().getQuantityString(this.E.k(), u(), Integer.valueOf(u()));
                }
                return context.getString(this.E.i(), Integer.valueOf(this.H));
            }
            return this.E.j();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.ze2.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @z1
    public FrameLayout p() {
        WeakReference<FrameLayout> weakReference = this.M;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int q() {
        return this.E.m();
    }

    @c2
    public int r() {
        return this.E.l();
    }

    @c2
    public int s() {
        return this.E.m();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.E.y(i);
        C();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int t() {
        return this.E.n();
    }

    public int u() {
        if (B()) {
            return this.E.o();
        }
        return 0;
    }

    @x1
    public za2.a v() {
        return this.E.q();
    }

    public int y() {
        return this.E.s();
    }

    @c2
    public int z() {
        return this.E.r();
    }
}