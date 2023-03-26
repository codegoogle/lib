package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p7700g.p99005.eu;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.os;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    private static final float g = 0.5f;
    private static final float h = 0.0f;
    private static final float i = 0.5f;
    public eu j;
    public c k;
    private boolean l;
    private boolean n;
    private float m = 0.0f;
    public int o = 2;
    public float p = 0.5f;
    public float q = 0.0f;
    public float r = 0.5f;
    private final eu.c s = new a();

    /* loaded from: classes2.dex */
    public class a extends eu.c {
        private static final int a = -1;
        private int b;
        private int c = -1;

        public a() {
        }

        private boolean n(@x1 View view, float f) {
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i == 0) {
                return Math.abs(view.getLeft() - this.b) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.p);
            }
            boolean z = sr.Y(view) == 1;
            int i2 = SwipeDismissBehavior.this.o;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (i <= 0) {
                    return false;
                }
                return true;
            } else if (i2 == 1) {
                if (z) {
                    if (i <= 0) {
                        return false;
                    }
                } else if (f >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }

        @Override // com.p7700g.p99005.eu.c
        public int a(@x1 View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = sr.Y(view) == 1;
            int i3 = SwipeDismissBehavior.this.o;
            if (i3 == 0) {
                if (z) {
                    width = this.b - view.getWidth();
                    width2 = this.b;
                } else {
                    width = this.b;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.b - view.getWidth();
                width2 = view.getWidth() + this.b;
            } else if (z) {
                width = this.b;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.b - view.getWidth();
                width2 = this.b;
            }
            return SwipeDismissBehavior.I(width, i, width2);
        }

        @Override // com.p7700g.p99005.eu.c
        public int b(@x1 View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.p7700g.p99005.eu.c
        public int d(@x1 View view) {
            return view.getWidth();
        }

        @Override // com.p7700g.p99005.eu.c
        public void i(@x1 View view, int i) {
            this.c = i;
            this.b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // com.p7700g.p99005.eu.c
        public void j(int i) {
            c cVar = SwipeDismissBehavior.this.k;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        @Override // com.p7700g.p99005.eu.c
        public void k(@x1 View view, int i, int i2, int i3, int i4) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.q) + this.b;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.r) + this.b;
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.H(0.0f, 1.0f - SwipeDismissBehavior.K(width, width2, f), 1.0f));
            }
        }

        @Override // com.p7700g.p99005.eu.c
        public void l(@x1 View view, float f, float f2) {
            int i;
            boolean z;
            c cVar;
            this.c = -1;
            int width = view.getWidth();
            if (n(view, f)) {
                int left = view.getLeft();
                int i2 = this.b;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.b;
                z = false;
            }
            if (SwipeDismissBehavior.this.j.V(i, view.getTop())) {
                sr.o1(view, new d(view, z));
            } else if (!z || (cVar = SwipeDismissBehavior.this.k) == null) {
            } else {
                cVar.a(view);
            }
        }

        @Override // com.p7700g.p99005.eu.c
        public boolean m(View view, int i) {
            int i2 = this.c;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.G(view);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements os {
        public b() {
        }

        @Override // com.p7700g.p99005.os
        public boolean a(@x1 View view, @z1 os.a aVar) {
            boolean z = false;
            if (SwipeDismissBehavior.this.G(view)) {
                boolean z2 = sr.Y(view) == 1;
                int i = SwipeDismissBehavior.this.o;
                if ((i == 0 && z2) || (i == 1 && !z2)) {
                    z = true;
                }
                int width = view.getWidth();
                if (z) {
                    width = -width;
                }
                sr.d1(view, width);
                view.setAlpha(0.0f);
                c cVar = SwipeDismissBehavior.this.k;
                if (cVar != null) {
                    cVar.a(view);
                }
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(View view);

        void b(int i);
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        private final View s;
        private final boolean t;

        public d(View view, boolean z) {
            this.s = view;
            this.t = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            eu euVar = SwipeDismissBehavior.this.j;
            if (euVar != null && euVar.o(true)) {
                sr.o1(this.s, this);
            } else if (!this.t || (cVar = SwipeDismissBehavior.this.k) == null) {
            } else {
                cVar.a(this.s);
            }
        }
    }

    public static float H(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    public static int I(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    private void J(ViewGroup viewGroup) {
        eu q;
        if (this.j == null) {
            if (this.n) {
                q = eu.p(viewGroup, this.m, this.s);
            } else {
                q = eu.q(viewGroup, this.s);
            }
            this.j = q;
        }
    }

    public static float K(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    private void T(View view) {
        sr.q1(view, 1048576);
        if (G(view)) {
            sr.t1(view, ls.a.v, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        eu euVar = this.j;
        if (euVar != null) {
            euVar.M(motionEvent);
            return true;
        }
        return false;
    }

    public boolean G(@x1 View view) {
        return true;
    }

    public int L() {
        eu euVar = this.j;
        if (euVar != null) {
            return euVar.F();
        }
        return 0;
    }

    @r2
    @z1
    public c M() {
        return this.k;
    }

    public void N(float f2) {
        this.p = H(0.0f, f2, 1.0f);
    }

    public void O(float f2) {
        this.r = H(0.0f, f2, 1.0f);
    }

    public void P(@z1 c cVar) {
        this.k = cVar;
    }

    public void Q(float f2) {
        this.m = f2;
        this.n = true;
    }

    public void R(float f2) {
        this.q = H(0.0f, f2, 1.0f);
    }

    public void S(int i2) {
        this.o = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 MotionEvent motionEvent) {
        boolean z = this.l;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.A(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.l = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.l = false;
        }
        if (z) {
            J(coordinatorLayout);
            return this.j.W(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, int i2) {
        boolean m = super.m(coordinatorLayout, v, i2);
        if (sr.U(v) == 0) {
            sr.Q1(v, 1);
            T(v);
        }
        return m;
    }
}