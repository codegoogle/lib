package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.p7700g.p99005.gp1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CustomViewTarget.java */
/* loaded from: classes2.dex */
public abstract class iz1<T extends View, Z> implements sz1<Z> {
    private static final String s = "CustomViewTarget";
    @m1
    private static final int t = gp1.h.v0;
    private final b u;
    public final T v;
    @z1
    private View.OnAttachStateChangeListener w;
    private boolean x;
    private boolean y;

    /* compiled from: CustomViewTarget.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            iz1.this.o();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            iz1.this.n();
        }
    }

    /* compiled from: CustomViewTarget.java */
    @r2
    /* loaded from: classes2.dex */
    public static final class b {
        private static final int a = 0;
        @r2
        @z1
        public static Integer b;
        private final View c;
        private final List<rz1> d = new ArrayList();
        public boolean e;
        @z1
        private a f;

        /* compiled from: CustomViewTarget.java */
        /* loaded from: classes2.dex */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<b> s;

            public a(@x1 b bVar) {
                this.s = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(iz1.s, 2)) {
                    String str = "OnGlobalLayoutListener called attachStateListener=" + this;
                }
                b bVar = this.s.get();
                if (bVar != null) {
                    bVar.a();
                    return true;
                }
                return true;
            }
        }

        public b(@x1 View view) {
            this.c = view;
        }

        private static int c(@x1 Context context) {
            if (b == null) {
                Display defaultDisplay = ((WindowManager) x02.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                b = Integer.valueOf(Math.max(point.x, point.y));
            }
            return b.intValue();
        }

        private int e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.e && this.c.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.c.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Log.isLoggable(iz1.s, 4);
            return c(this.c.getContext());
        }

        private int f() {
            int paddingBottom = this.c.getPaddingBottom() + this.c.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            return e(this.c.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        private int g() {
            int paddingRight = this.c.getPaddingRight() + this.c.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            return e(this.c.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        private boolean h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        private boolean i(int i, int i2) {
            return h(i) && h(i2);
        }

        private void j(int i, int i2) {
            Iterator it = new ArrayList(this.d).iterator();
            while (it.hasNext()) {
                ((rz1) it.next()).e(i, i2);
            }
        }

        public void a() {
            if (this.d.isEmpty()) {
                return;
            }
            int g = g();
            int f = f();
            if (i(g, f)) {
                j(g, f);
                b();
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.c.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f);
            }
            this.f = null;
            this.d.clear();
        }

        public void d(@x1 rz1 rz1Var) {
            int g = g();
            int f = f();
            if (i(g, f)) {
                rz1Var.e(g, f);
                return;
            }
            if (!this.d.contains(rz1Var)) {
                this.d.add(rz1Var);
            }
            if (this.f == null) {
                ViewTreeObserver viewTreeObserver = this.c.getViewTreeObserver();
                a aVar = new a(this);
                this.f = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        public void k(@x1 rz1 rz1Var) {
            this.d.remove(rz1Var);
        }
    }

    public iz1(@x1 T t2) {
        this.v = (T) x02.d(t2);
        this.u = new b(t2);
    }

    @z1
    private Object d() {
        return this.v.getTag(t);
    }

    private void f() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.w;
        if (onAttachStateChangeListener == null || this.y) {
            return;
        }
        this.v.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.y = true;
    }

    private void g() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.w;
        if (onAttachStateChangeListener == null || !this.y) {
            return;
        }
        this.v.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.y = false;
    }

    private void r(@z1 Object obj) {
        this.v.setTag(t, obj);
    }

    @x1
    public final iz1<T, Z> a() {
        if (this.w != null) {
            return this;
        }
        this.w = new a();
        f();
        return this;
    }

    @Override // com.p7700g.p99005.sz1
    public final void b(@x1 rz1 rz1Var) {
        this.u.k(rz1Var);
    }

    @x1
    public final T e() {
        return this.v;
    }

    public abstract void h(@z1 Drawable drawable);

    public void i(@z1 Drawable drawable) {
    }

    @Override // com.p7700g.p99005.sz1
    public final void j(@z1 vy1 vy1Var) {
        r(vy1Var);
    }

    @Override // com.p7700g.p99005.sz1
    public final void l(@z1 Drawable drawable) {
        f();
        i(drawable);
    }

    @Override // com.p7700g.p99005.sz1
    @z1
    public final vy1 m() {
        Object d = d();
        if (d != null) {
            if (d instanceof vy1) {
                return (vy1) d;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    public final void n() {
        vy1 m = m();
        if (m != null) {
            this.x = true;
            m.clear();
            this.x = false;
        }
    }

    public final void o() {
        vy1 m = m();
        if (m == null || !m.f()) {
            return;
        }
        m.h();
    }

    @Override // com.p7700g.p99005.wx1
    public void onDestroy() {
    }

    @Override // com.p7700g.p99005.wx1
    public void onStart() {
    }

    @Override // com.p7700g.p99005.wx1
    public void onStop() {
    }

    @Override // com.p7700g.p99005.sz1
    public final void p(@z1 Drawable drawable) {
        this.u.b();
        h(drawable);
        if (this.x) {
            return;
        }
        g();
    }

    @Override // com.p7700g.p99005.sz1
    public final void q(@x1 rz1 rz1Var) {
        this.u.d(rz1Var);
    }

    @Deprecated
    public final iz1<T, Z> s(@m1 int i) {
        return this;
    }

    @x1
    public final iz1<T, Z> t() {
        this.u.e = true;
        return this;
    }

    public String toString() {
        StringBuilder G = wo1.G("Target for: ");
        G.append(this.v);
        return G.toString();
    }
}