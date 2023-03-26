package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import com.p7700g.p99005.b4;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.x2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ActionBar.java */
/* loaded from: classes.dex */
public abstract class z2 {
    @Deprecated
    public static final int a = 0;
    @Deprecated
    public static final int b = 1;
    @Deprecated
    public static final int c = 2;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 4;
    public static final int g = 8;
    public static final int h = 16;

    /* compiled from: ActionBar.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* compiled from: ActionBar.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* compiled from: ActionBar.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(boolean z);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* loaded from: classes.dex */
    public interface e {
        boolean a(int i, long j);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class f {
        public static final int a = -1;

        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract Object e();

        public abstract CharSequence f();

        public abstract void g();

        public abstract f h(@l2 int i);

        public abstract f i(CharSequence charSequence);

        public abstract f j(int i);

        public abstract f k(View view);

        public abstract f l(@f1 int i);

        public abstract f m(Drawable drawable);

        public abstract f n(g gVar);

        public abstract f o(Object obj);

        public abstract f p(int i);

        public abstract f q(CharSequence charSequence);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* loaded from: classes.dex */
    public interface g {
        void a(f fVar, dy dyVar);

        void b(f fVar, dy dyVar);

        void c(f fVar, dy dyVar);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public boolean A() {
        return false;
    }

    @Deprecated
    public abstract f B();

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void C(Configuration configuration) {
    }

    public void D() {
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public boolean E(int i, KeyEvent keyEvent) {
        return false;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public boolean F(KeyEvent keyEvent) {
        return false;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public boolean G() {
        return false;
    }

    @Deprecated
    public abstract void H();

    public abstract void I(d dVar);

    @Deprecated
    public abstract void J(f fVar);

    @Deprecated
    public abstract void K(int i);

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public boolean L() {
        return false;
    }

    @Deprecated
    public abstract void M(f fVar);

    public abstract void N(@z1 Drawable drawable);

    public abstract void O(int i);

    public abstract void P(View view);

    public abstract void Q(View view, b bVar);

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void R(boolean z) {
    }

    public abstract void S(boolean z);

    public abstract void T(int i);

    public abstract void U(int i, int i2);

    public abstract void V(boolean z);

    public abstract void W(boolean z);

    public abstract void X(boolean z);

    public abstract void Y(boolean z);

    public void Z(float f2) {
        if (f2 != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public abstract void a(d dVar);

    public void a0(int i) {
        if (i != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void b(f fVar);

    public void b0(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void c(f fVar, int i);

    public void c0(@l2 int i) {
    }

    @Deprecated
    public abstract void d(f fVar, int i, boolean z);

    public void d0(@z1 CharSequence charSequence) {
    }

    @Deprecated
    public abstract void e(f fVar, boolean z);

    public void e0(@f1 int i) {
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public boolean f() {
        return false;
    }

    public void f0(@z1 Drawable drawable) {
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public boolean g() {
        return false;
    }

    public void g0(boolean z) {
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void h(boolean z) {
    }

    public abstract void h0(@f1 int i);

    public abstract View i();

    public abstract void i0(Drawable drawable);

    public abstract int j();

    @Deprecated
    public abstract void j0(SpinnerAdapter spinnerAdapter, e eVar);

    public float k() {
        return 0.0f;
    }

    public abstract void k0(@f1 int i);

    public abstract int l();

    public abstract void l0(Drawable drawable);

    public int m() {
        return 0;
    }

    @Deprecated
    public abstract void m0(int i);

    @Deprecated
    public abstract int n();

    @Deprecated
    public abstract void n0(int i);

    @Deprecated
    public abstract int o();

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void o0(boolean z) {
    }

    @Deprecated
    public abstract int p();

    public void p0(Drawable drawable) {
    }

    @z1
    @Deprecated
    public abstract f q();

    public void q0(Drawable drawable) {
    }

    @z1
    public abstract CharSequence r();

    public abstract void r0(int i);

    @Deprecated
    public abstract f s(int i);

    public abstract void s0(CharSequence charSequence);

    @Deprecated
    public abstract int t();

    public abstract void t0(@l2 int i);

    public Context u() {
        return null;
    }

    public abstract void u0(CharSequence charSequence);

    @z1
    public abstract CharSequence v();

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void v0(CharSequence charSequence) {
    }

    public abstract void w();

    public abstract void w0();

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public boolean x() {
        return false;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public b4 x0(b4.a aVar) {
        return null;
    }

    public boolean y() {
        return false;
    }

    public abstract boolean z();

    /* compiled from: ActionBar.java */
    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int gravity;

        public b(@x1 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x2.m.E);
            this.gravity = obtainStyledAttributes.getInt(x2.m.F, 0);
            obtainStyledAttributes.recycle();
        }

        public b(int i, int i2) {
            super(i, i2);
            this.gravity = 0;
            this.gravity = 8388627;
        }

        public b(int i, int i2, int i3) {
            super(i, i2);
            this.gravity = 0;
            this.gravity = i3;
        }

        public b(int i) {
            this(-2, -1, i);
        }

        public b(b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
            this.gravity = 0;
            this.gravity = bVar.gravity;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }
    }
}