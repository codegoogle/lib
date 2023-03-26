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

/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: classes2.dex */
public abstract class uz1<T extends View, Z> extends ez1<Z> {
    private static final String t = "ViewTarget";
    private static boolean u;
    private static int v = gp1.h.v0;
    private boolean A;
    public final T w;
    private final b x;
    @z1
    private View.OnAttachStateChangeListener y;
    private boolean z;

    /* compiled from: ViewTarget.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            uz1.this.n();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            uz1.this.i();
        }
    }

    /* compiled from: ViewTarget.java */
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

        /* compiled from: ViewTarget.java */
        /* loaded from: classes2.dex */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<b> s;

            public a(@x1 b bVar) {
                this.s = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(uz1.t, 2)) {
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
            Log.isLoggable(uz1.t, 4);
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

    public uz1(@x1 T t2) {
        this.w = (T) x02.d(t2);
        this.x = new b(t2);
    }

    @z1
    private Object f() {
        return this.w.getTag(v);
    }

    private void g() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.y;
        if (onAttachStateChangeListener == null || this.A) {
            return;
        }
        this.w.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.A = true;
    }

    private void h() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.y;
        if (onAttachStateChangeListener == null || !this.A) {
            return;
        }
        this.w.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.A = false;
    }

    private void o(@z1 Object obj) {
        u = true;
        this.w.setTag(v, obj);
    }

    @Deprecated
    public static void r(int i) {
        if (!u) {
            v = i;
            return;
        }
        throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
    }

    @Override // com.p7700g.p99005.sz1
    @t0
    public void b(@x1 rz1 rz1Var) {
        this.x.k(rz1Var);
    }

    @x1
    public final uz1<T, Z> e() {
        if (this.y != null) {
            return this;
        }
        this.y = new a();
        g();
        return this;
    }

    @x1
    public T getView() {
        return this.w;
    }

    public void i() {
        vy1 m = m();
        if (m != null) {
            this.z = true;
            m.clear();
            this.z = false;
        }
    }

    @Override // com.p7700g.p99005.ez1, com.p7700g.p99005.sz1
    public void j(@z1 vy1 vy1Var) {
        o(vy1Var);
    }

    @Override // com.p7700g.p99005.ez1, com.p7700g.p99005.sz1
    @t0
    public void l(@z1 Drawable drawable) {
        super.l(drawable);
        g();
    }

    @Override // com.p7700g.p99005.ez1, com.p7700g.p99005.sz1
    @z1
    public vy1 m() {
        Object f = f();
        if (f != null) {
            if (f instanceof vy1) {
                return (vy1) f;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    public void n() {
        vy1 m = m();
        if (m == null || !m.f()) {
            return;
        }
        m.h();
    }

    @Override // com.p7700g.p99005.ez1, com.p7700g.p99005.sz1
    @t0
    public void p(@z1 Drawable drawable) {
        super.p(drawable);
        this.x.b();
        if (this.z) {
            return;
        }
        h();
    }

    @Override // com.p7700g.p99005.sz1
    @t0
    public void q(@x1 rz1 rz1Var) {
        this.x.d(rz1Var);
    }

    @x1
    public final uz1<T, Z> s() {
        this.x.e = true;
        return this;
    }

    public String toString() {
        StringBuilder G = wo1.G("Target for: ");
        G.append(this.w);
        return G.toString();
    }

    @Deprecated
    public uz1(@x1 T t2, boolean z) {
        this(t2);
        if (z) {
            s();
        }
    }
}