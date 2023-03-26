package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.a30;
import com.p7700g.p99005.ar;
import com.p7700g.p99005.au;
import com.p7700g.p99005.br;
import com.p7700g.p99005.c2;
import com.p7700g.p99005.cr;
import com.p7700g.p99005.er;
import com.p7700g.p99005.fq;
import com.p7700g.p99005.ft;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.in;
import com.p7700g.p99005.jp;
import com.p7700g.p99005.js;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.n30;
import com.p7700g.p99005.o20;
import com.p7700g.p99005.p20;
import com.p7700g.p99005.pr;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.t0;
import com.p7700g.p99005.tr;
import com.p7700g.p99005.v20;
import com.p7700g.p99005.v30;
import com.p7700g.p99005.w20;
import com.p7700g.p99005.w30;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.z20;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xbill.DNS.WKSRecord;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements pr, br, cr {
    private static final boolean A;
    private static final boolean B;
    public static final boolean C = false;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 1;
    public static final int G = -1;
    public static final long H = -1;
    public static final int I = -1;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = Integer.MIN_VALUE;
    public static final int M = 2000;
    public static final String N = "RV Scroll";
    private static final String O = "RV OnLayout";
    private static final String P = "RV FullInvalidate";
    private static final String Q = "RV PartialInvalidate";
    public static final String R = "RV OnBindView";
    public static final String S = "RV Prefetch";
    public static final String T = "RV Nested Prefetch";
    public static final String U = "RV CreateView";
    private static final Class<?>[] V;
    private static final int W = -1;
    public static final String s = "RecyclerView";
    public static final boolean t = false;
    public static final boolean u = false;
    public static final int u0 = 0;
    private static final int[] v = {16843830};
    public static final int v0 = 1;
    public static final boolean w;
    public static final int w0 = 2;
    public static final boolean x;
    public static final long x0 = Long.MAX_VALUE;
    public static final boolean y;
    public static final Interpolator y0;
    public static final boolean z;
    public final w A0;
    public final e0 A1;
    private z B0;
    public a30 B1;
    public p20 C0;
    public a30.b C1;
    public v20 D0;
    public final c0 D1;
    public final w30 E0;
    private t E1;
    public boolean F0;
    private List<t> F1;
    public final Runnable G0;
    public boolean G1;
    public final Rect H0;
    public boolean H1;
    private final Rect I0;
    private l.c I1;
    public final RectF J0;
    public boolean J1;
    public g K0;
    public n30 K1;
    @r2
    public o L0;
    private j L1;
    public x M0;
    private final int[] M1;
    public final ArrayList<n> N0;
    private er N1;
    private final ArrayList<s> O0;
    private final int[] O1;
    private s P0;
    private final int[] P1;
    public boolean Q0;
    public final int[] Q1;
    public boolean R0;
    @r2
    public final List<f0> R1;
    public boolean S0;
    private Runnable S1;
    @r2
    public boolean T0;
    private final w30.b T1;
    private int U0;
    public boolean V0;
    public boolean W0;
    private boolean X0;
    private int Y0;
    public boolean Z0;
    private final AccessibilityManager a1;
    private List<q> b1;
    public boolean c1;
    public boolean d1;
    private int e1;
    private int f1;
    @x1
    private k g1;
    private EdgeEffect h1;
    private EdgeEffect i1;
    private EdgeEffect j1;
    private EdgeEffect k1;
    public l l1;
    private int m1;
    private int n1;
    private VelocityTracker o1;
    private int p1;
    private int q1;
    private int r1;
    private int s1;
    private int t1;
    private r u1;
    private final int v1;
    private final int w1;
    private float x1;
    private float y1;
    private final y z0;
    private boolean z1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.T0 || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.Q0) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.W0) {
                recyclerView2.V0 = true;
            } else {
                recyclerView2.D();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a0 implements s {
        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(@x1 RecyclerView recyclerView, @x1 MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean c(@x1 RecyclerView recyclerView, @x1 MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void e(boolean z) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.l1;
            if (lVar != null) {
                lVar.x();
            }
            RecyclerView.this.J1 = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b0 {
        private RecyclerView b;
        private o c;
        private boolean d;
        private boolean e;
        private View f;
        private boolean h;
        private int a = -1;
        private final a g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {
            public static final int a = Integer.MIN_VALUE;
            private int b;
            private int c;
            private int d;
            private int e;
            private Interpolator f;
            private boolean g;
            private int h;

            public a(@c2 int i, @c2 int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            private void m() {
                if (this.f != null && this.d < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.d < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public int a() {
                return this.d;
            }

            @c2
            public int b() {
                return this.b;
            }

            @c2
            public int c() {
                return this.c;
            }

            @z1
            public Interpolator d() {
                return this.f;
            }

            public boolean e() {
                return this.e >= 0;
            }

            public void f(int i) {
                this.e = i;
            }

            public void g(RecyclerView recyclerView) {
                int i = this.e;
                if (i >= 0) {
                    this.e = -1;
                    recyclerView.O0(i);
                    this.g = false;
                } else if (this.g) {
                    m();
                    recyclerView.A1.f(this.b, this.c, this.d, this.f);
                    this.h++;
                    this.g = false;
                } else {
                    this.h = 0;
                }
            }

            public void h(int i) {
                this.g = true;
                this.d = i;
            }

            public void i(@c2 int i) {
                this.g = true;
                this.b = i;
            }

            public void j(@c2 int i) {
                this.g = true;
                this.c = i;
            }

            public void k(@z1 Interpolator interpolator) {
                this.g = true;
                this.f = interpolator;
            }

            public void l(@c2 int i, @c2 int i2, int i3, @z1 Interpolator interpolator) {
                this.b = i;
                this.c = i2;
                this.d = i3;
                this.f = interpolator;
                this.g = true;
            }

            public a(@c2 int i, @c2 int i2, int i3) {
                this(i, i2, i3, null);
            }

            public a(@c2 int i, @c2 int i2, int i3, @z1 Interpolator interpolator) {
                this.e = -1;
                this.g = false;
                this.h = 0;
                this.b = i;
                this.c = i2;
                this.d = i3;
                this.f = interpolator;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            @z1
            PointF a(int i);
        }

        @z1
        public PointF a(int i) {
            o e = e();
            if (e instanceof b) {
                return ((b) e).a(i);
            }
            return null;
        }

        public View b(int i) {
            return this.b.L0.J(i);
        }

        public int c() {
            return this.b.L0.Q();
        }

        public int d(View view) {
            return this.b.p0(view);
        }

        @z1
        public o e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        @Deprecated
        public void g(int i) {
            this.b.B1(i);
        }

        public boolean h() {
            return this.d;
        }

        public boolean i() {
            return this.e;
        }

        public void j(@x1 PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void k(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                s();
            }
            if (this.d && this.f == null && this.c != null && (a2 = a(this.a)) != null) {
                float f = a2.x;
                if (f != 0.0f || a2.y != 0.0f) {
                    recyclerView.A1((int) Math.signum(f), (int) Math.signum(a2.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (d(view) == this.a) {
                    p(this.f, recyclerView.D1, this.g);
                    this.g.g(recyclerView);
                    s();
                } else {
                    this.f = null;
                }
            }
            if (this.e) {
                m(i, i2, recyclerView.D1, this.g);
                boolean e = this.g.e();
                this.g.g(recyclerView);
                if (e && this.e) {
                    this.d = true;
                    recyclerView.A1.e();
                }
            }
        }

        public void l(View view) {
            if (d(view) == f()) {
                this.f = view;
            }
        }

        public abstract void m(@c2 int i, @c2 int i2, @x1 c0 c0Var, @x1 a aVar);

        public abstract void n();

        public abstract void o();

        public abstract void p(@x1 View view, @x1 c0 c0Var, @x1 a aVar);

        public void q(int i) {
            this.a = i;
        }

        public void r(RecyclerView recyclerView, o oVar) {
            recyclerView.A1.g();
            if (this.h) {
                getClass().getSimpleName();
                getClass().getSimpleName();
            }
            this.b = recyclerView;
            this.c = oVar;
            int i = this.a;
            if (i != -1) {
                recyclerView.D1.d = i;
                this.e = true;
                this.d = true;
                this.f = b(f());
                n();
                this.b.A1.e();
                this.h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void s() {
            if (this.e) {
                this.e = false;
                o();
                this.b.D1.d = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                this.c.w1(this);
                this.c = null;
                this.b = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static class c0 {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 4;
        private SparseArray<Object> e;
        public int p;
        public long q;
        public int r;
        public int s;
        public int t;
        public int d = -1;
        public int f = 0;
        public int g = 0;
        public int h = 1;
        public int i = 0;
        public boolean j = false;
        public boolean k = false;
        public boolean l = false;
        public boolean m = false;
        public boolean n = false;
        public boolean o = false;

        public void a(int i) {
            if ((this.h & i) != 0) {
                return;
            }
            StringBuilder G = wo1.G("Layout state should be one of ");
            G.append(Integer.toBinaryString(i));
            G.append(" but it is ");
            G.append(Integer.toBinaryString(this.h));
            throw new IllegalStateException(G.toString());
        }

        public boolean b() {
            return this.j;
        }

        public <T> T c(int i) {
            SparseArray<Object> sparseArray = this.e;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i);
        }

        public int d() {
            return this.k ? this.f - this.g : this.i;
        }

        public int e() {
            return this.s;
        }

        public int f() {
            return this.t;
        }

        public int g() {
            return this.d;
        }

        public boolean h() {
            return this.d != -1;
        }

        public boolean i() {
            return this.m;
        }

        public boolean j() {
            return this.k;
        }

        public void k(g gVar) {
            this.h = 1;
            this.i = gVar.e();
            this.k = false;
            this.l = false;
            this.m = false;
        }

        public void l(int i, Object obj) {
            if (this.e == null) {
                this.e = new SparseArray<>();
            }
            this.e.put(i, obj);
        }

        public void m(int i) {
            SparseArray<Object> sparseArray = this.e;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i);
        }

        public boolean n() {
            return this.o;
        }

        public boolean o() {
            return this.n;
        }

        public String toString() {
            StringBuilder G = wo1.G("State{mTargetPosition=");
            G.append(this.d);
            G.append(", mData=");
            G.append(this.e);
            G.append(", mItemCount=");
            G.append(this.i);
            G.append(", mIsMeasuring=");
            G.append(this.m);
            G.append(", mPreviousLayoutItemCount=");
            G.append(this.f);
            G.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            G.append(this.g);
            G.append(", mStructureChanged=");
            G.append(this.j);
            G.append(", mInPreLayout=");
            G.append(this.k);
            G.append(", mRunSimpleAnimations=");
            G.append(this.n);
            G.append(", mRunPredictiveAnimations=");
            G.append(this.o);
            G.append('}');
            return G.toString();
        }
    }

    /* loaded from: classes.dex */
    public class d implements w30.b {
        public d() {
        }

        @Override // com.p7700g.p99005.w30.b
        public void a(f0 f0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.L0.F1(f0Var.p, recyclerView.A0);
        }

        @Override // com.p7700g.p99005.w30.b
        public void b(f0 f0Var, l.d dVar, l.d dVar2) {
            RecyclerView.this.r(f0Var, dVar, dVar2);
        }

        @Override // com.p7700g.p99005.w30.b
        public void c(f0 f0Var, @x1 l.d dVar, @z1 l.d dVar2) {
            RecyclerView.this.A0.K(f0Var);
            RecyclerView.this.t(f0Var, dVar, dVar2);
        }

        @Override // com.p7700g.p99005.w30.b
        public void d(f0 f0Var, @x1 l.d dVar, @x1 l.d dVar2) {
            f0Var.H(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.c1) {
                if (recyclerView.l1.b(f0Var, f0Var, dVar, dVar2)) {
                    RecyclerView.this.e1();
                }
            } else if (recyclerView.l1.d(f0Var, dVar, dVar2)) {
                RecyclerView.this.e1();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d0 {
        @z1
        public abstract View a(@x1 w wVar, int i, int i2);
    }

    /* loaded from: classes.dex */
    public class e implements v20.b {
        public e() {
        }

        @Override // com.p7700g.p99005.v20.b
        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // com.p7700g.p99005.v20.b
        public void addView(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.H(view);
        }

        @Override // com.p7700g.p99005.v20.b
        public void b(View view) {
            f0 s0 = RecyclerView.s0(view);
            if (s0 != null) {
                s0.C(RecyclerView.this);
            }
        }

        @Override // com.p7700g.p99005.v20.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // com.p7700g.p99005.v20.b
        public void d() {
            int c = c();
            for (int i = 0; i < c; i++) {
                View a = a(i);
                RecyclerView.this.I(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // com.p7700g.p99005.v20.b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // com.p7700g.p99005.v20.b
        public f0 f(View view) {
            return RecyclerView.s0(view);
        }

        @Override // com.p7700g.p99005.v20.b
        public void g(int i) {
            f0 s0;
            View a = a(i);
            if (a != null && (s0 = RecyclerView.s0(a)) != null) {
                if (s0.y() && !s0.K()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("called detach on an already detached child ");
                    sb.append(s0);
                    throw new IllegalArgumentException(wo1.k(RecyclerView.this, sb));
                }
                s0.b(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // com.p7700g.p99005.v20.b
        public void h(View view) {
            f0 s0 = RecyclerView.s0(view);
            if (s0 != null) {
                s0.D(RecyclerView.this);
            }
        }

        @Override // com.p7700g.p99005.v20.b
        public void i(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.I(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // com.p7700g.p99005.v20.b
        public void j(View view, int i, ViewGroup.LayoutParams layoutParams) {
            f0 s0 = RecyclerView.s0(view);
            if (s0 != null) {
                if (!s0.y() && !s0.K()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Called attach on a child which is not detached: ");
                    sb.append(s0);
                    throw new IllegalArgumentException(wo1.k(RecyclerView.this, sb));
                }
                s0.f();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* loaded from: classes.dex */
    public class e0 implements Runnable {
        private int s;
        private int t;
        public OverScroller u;
        public Interpolator v;
        private boolean w;
        private boolean x;

        public e0() {
            Interpolator interpolator = RecyclerView.y0;
            this.v = interpolator;
            this.w = false;
            this.x = false;
            this.u = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((i4 * i4) + (i3 * i3));
            int sqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = width;
            float f2 = i6;
            float b = (b(Math.min(1.0f, (sqrt2 * 1.0f) / f)) * f2) + f2;
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(b / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        private float b(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            sr.o1(RecyclerView.this, this);
        }

        public void c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.t = 0;
            this.s = 0;
            Interpolator interpolator = this.v;
            Interpolator interpolator2 = RecyclerView.y0;
            if (interpolator != interpolator2) {
                this.v = interpolator2;
                this.u = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.u.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        public void e() {
            if (this.w) {
                this.x = true;
            } else {
                d();
            }
        }

        public void f(int i, int i2, int i3, @z1 Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.y0;
            }
            if (this.v != interpolator) {
                this.v = interpolator;
                this.u = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.t = 0;
            this.s = 0;
            RecyclerView.this.setScrollState(2);
            this.u.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.u.computeScrollOffset();
            }
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.u.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.L0 == null) {
                g();
                return;
            }
            this.x = false;
            this.w = true;
            recyclerView.D();
            OverScroller overScroller = this.u;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.s;
                int i4 = currY - this.t;
                this.s = currX;
                this.t = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.Q1;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.b(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.Q1;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.C(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.K0 != null) {
                    int[] iArr3 = recyclerView3.Q1;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.A1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.Q1;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    b0 b0Var = recyclerView4.L0.g;
                    if (b0Var != null && !b0Var.h() && b0Var.i()) {
                        int d = RecyclerView.this.D1.d();
                        if (d == 0) {
                            b0Var.s();
                        } else if (b0Var.f() >= d) {
                            b0Var.q(d - 1);
                            b0Var.k(i2, i);
                        } else {
                            b0Var.k(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.N0.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.Q1;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.c(i2, i, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.Q1;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.P(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                b0 b0Var2 = RecyclerView.this.L0.g;
                if (!(b0Var2 != null && b0Var2.h()) && z) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.g(i7, currVelocity);
                    }
                    if (RecyclerView.z) {
                        RecyclerView.this.C1.b();
                    }
                } else {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    a30 a30Var = recyclerView7.B1;
                    if (a30Var != null) {
                        a30Var.f(recyclerView7, i2, i);
                    }
                }
            }
            b0 b0Var3 = RecyclerView.this.L0.g;
            if (b0Var3 != null && b0Var3.h()) {
                b0Var3.k(0, 0);
            }
            this.w = false;
            if (this.x) {
                d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.f(1);
        }
    }

    /* loaded from: classes.dex */
    public class f implements p20.a {
        public f() {
        }

        @Override // com.p7700g.p99005.p20.a
        public void a(int i, int i2) {
            RecyclerView.this.U0(i, i2);
            RecyclerView.this.G1 = true;
        }

        @Override // com.p7700g.p99005.p20.a
        public void b(p20.b bVar) {
            i(bVar);
        }

        @Override // com.p7700g.p99005.p20.a
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.P1(i, i2, obj);
            RecyclerView.this.H1 = true;
        }

        @Override // com.p7700g.p99005.p20.a
        public void d(p20.b bVar) {
            i(bVar);
        }

        @Override // com.p7700g.p99005.p20.a
        public f0 e(int i) {
            f0 j0 = RecyclerView.this.j0(i, true);
            if (j0 == null || RecyclerView.this.D0.n(j0.p)) {
                return null;
            }
            return j0;
        }

        @Override // com.p7700g.p99005.p20.a
        public void f(int i, int i2) {
            RecyclerView.this.V0(i, i2, false);
            RecyclerView.this.G1 = true;
        }

        @Override // com.p7700g.p99005.p20.a
        public void g(int i, int i2) {
            RecyclerView.this.T0(i, i2);
            RecyclerView.this.G1 = true;
        }

        @Override // com.p7700g.p99005.p20.a
        public void h(int i, int i2) {
            RecyclerView.this.V0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.G1 = true;
            recyclerView.D1.g += i2;
        }

        public void i(p20.b bVar) {
            int i = bVar.f;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.L0.i1(recyclerView, bVar.g, bVar.i);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.L0.l1(recyclerView2, bVar.g, bVar.i);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.L0.n1(recyclerView3, bVar.g, bVar.i, bVar.h);
            } else if (i != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.L0.k1(recyclerView4, bVar.g, bVar.i, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f0 {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 4;
        public static final int d = 8;
        public static final int e = 16;
        public static final int f = 32;
        public static final int g = 128;
        public static final int h = 256;
        public static final int i = 512;
        public static final int j = 1024;
        public static final int k = 2048;
        public static final int l = 4096;
        public static final int m = -1;
        public static final int n = 8192;
        private static final List<Object> o = Collections.emptyList();
        public RecyclerView G;
        @x1
        public final View p;
        public WeakReference<RecyclerView> q;
        public int y;
        public int r = -1;
        public int s = -1;
        public long t = -1;
        public int u = -1;
        public int v = -1;
        public f0 w = null;
        public f0 x = null;
        public List<Object> z = null;
        public List<Object> A = null;
        private int B = 0;
        public w C = null;
        public boolean D = false;
        private int E = 0;
        @r2
        public int F = -1;

        public f0(@x1 View view) {
            if (view != null) {
                this.p = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void g() {
            if (this.z == null) {
                ArrayList arrayList = new ArrayList();
                this.z = arrayList;
                this.A = Collections.unmodifiableList(arrayList);
            }
        }

        public boolean A() {
            return (this.y & 2) != 0;
        }

        public void B(int i2, boolean z) {
            if (this.s == -1) {
                this.s = this.r;
            }
            if (this.v == -1) {
                this.v = this.r;
            }
            if (z) {
                this.v += i2;
            }
            this.r += i2;
            if (this.p.getLayoutParams() != null) {
                ((p) this.p.getLayoutParams()).c = true;
            }
        }

        public void C(RecyclerView recyclerView) {
            int i2 = this.F;
            if (i2 != -1) {
                this.E = i2;
            } else {
                this.E = sr.U(this.p);
            }
            recyclerView.D1(this, 4);
        }

        public void D(RecyclerView recyclerView) {
            recyclerView.D1(this, this.E);
            this.E = 0;
        }

        public void E() {
            this.y = 0;
            this.r = -1;
            this.s = -1;
            this.t = -1L;
            this.v = -1;
            this.B = 0;
            this.w = null;
            this.x = null;
            d();
            this.E = 0;
            this.F = -1;
            RecyclerView.y(this);
        }

        public void F() {
            if (this.s == -1) {
                this.s = this.r;
            }
        }

        public void G(int i2, int i3) {
            this.y = (i2 & i3) | (this.y & (~i3));
        }

        public final void H(boolean z) {
            int i2 = this.B;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.B = i3;
            if (i3 < 0) {
                this.B = 0;
                String str = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this;
            } else if (!z && i3 == 1) {
                this.y |= 16;
            } else if (z && i3 == 0) {
                this.y &= -17;
            }
        }

        public void I(w wVar, boolean z) {
            this.C = wVar;
            this.D = z;
        }

        public boolean J() {
            return (this.y & 16) != 0;
        }

        public boolean K() {
            return (this.y & 128) != 0;
        }

        public void L() {
            this.y &= -129;
        }

        public void M() {
            this.C.K(this);
        }

        public boolean N() {
            return (this.y & 32) != 0;
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.y) == 0) {
                g();
                this.z.add(obj);
            }
        }

        public void b(int i2) {
            this.y = i2 | this.y;
        }

        public void c() {
            this.s = -1;
            this.v = -1;
        }

        public void d() {
            List<Object> list = this.z;
            if (list != null) {
                list.clear();
            }
            this.y &= -1025;
        }

        public void e() {
            this.y &= -33;
        }

        public void f() {
            this.y &= -257;
        }

        public boolean h() {
            return (this.y & 16) == 0 && sr.L0(this.p);
        }

        public void i(int i2, int i3, boolean z) {
            b(8);
            B(i3, z);
            this.r = i2;
        }

        public final int j() {
            RecyclerView recyclerView = this.G;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.l0(this);
        }

        public final long k() {
            return this.t;
        }

        public final int l() {
            return this.u;
        }

        public final int m() {
            int i2 = this.v;
            return i2 == -1 ? this.r : i2;
        }

        public final int n() {
            return this.s;
        }

        @Deprecated
        public final int o() {
            int i2 = this.v;
            return i2 == -1 ? this.r : i2;
        }

        public List<Object> p() {
            if ((this.y & 1024) == 0) {
                List<Object> list = this.z;
                if (list != null && list.size() != 0) {
                    return this.A;
                }
                return o;
            }
            return o;
        }

        public boolean q(int i2) {
            return (i2 & this.y) != 0;
        }

        public boolean r() {
            return (this.y & 512) != 0 || u();
        }

        public boolean s() {
            return (this.p.getParent() == null || this.p.getParent() == this.G) ? false : true;
        }

        public boolean t() {
            return (this.y & 1) != 0;
        }

        public String toString() {
            StringBuilder L = wo1.L(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            L.append(Integer.toHexString(hashCode()));
            L.append(" position=");
            L.append(this.r);
            L.append(" id=");
            L.append(this.t);
            L.append(", oldPos=");
            L.append(this.s);
            L.append(", pLpos:");
            L.append(this.v);
            StringBuilder sb = new StringBuilder(L.toString());
            if (x()) {
                sb.append(" scrap ");
                sb.append(this.D ? "[changeScrap]" : "[attachedScrap]");
            }
            if (u()) {
                sb.append(" invalid");
            }
            if (!t()) {
                sb.append(" unbound");
            }
            if (A()) {
                sb.append(" update");
            }
            if (w()) {
                sb.append(" removed");
            }
            if (K()) {
                sb.append(" ignored");
            }
            if (y()) {
                sb.append(" tmpDetached");
            }
            if (!v()) {
                StringBuilder G = wo1.G(" not recyclable(");
                G.append(this.B);
                G.append(")");
                sb.append(G.toString());
            }
            if (r()) {
                sb.append(" undefined adapter position");
            }
            if (this.p.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean u() {
            return (this.y & 4) != 0;
        }

        public final boolean v() {
            return (this.y & 16) == 0 && !sr.L0(this.p);
        }

        public boolean w() {
            return (this.y & 8) != 0;
        }

        public boolean x() {
            return this.C != null;
        }

        public boolean y() {
            return (this.y & 256) != 0;
        }

        public boolean z() {
            return (this.y & 2) != 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g<VH extends f0> {
        private final h a = new h();
        private boolean b = false;

        public void A(@x1 VH vh) {
        }

        public void B(@x1 VH vh) {
        }

        public void C(@x1 i iVar) {
            this.a.registerObserver(iVar);
        }

        public void D(boolean z) {
            if (!h()) {
                this.b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void E(@x1 i iVar) {
            this.a.unregisterObserver(iVar);
        }

        public final void c(@x1 VH vh, int i) {
            vh.r = i;
            if (i()) {
                vh.t = f(i);
            }
            vh.G(1, 519);
            in.b(RecyclerView.R);
            v(vh, i, vh.p());
            vh.d();
            ViewGroup.LayoutParams layoutParams = vh.p.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).c = true;
            }
            in.d();
        }

        @x1
        public final VH d(@x1 ViewGroup viewGroup, int i) {
            try {
                in.b(RecyclerView.U);
                VH w = w(viewGroup, i);
                if (w.p.getParent() == null) {
                    w.u = i;
                    return w;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                in.d();
            }
        }

        public abstract int e();

        public long f(int i) {
            return -1L;
        }

        public int g(int i) {
            return 0;
        }

        public final boolean h() {
            return this.a.a();
        }

        public final boolean i() {
            return this.b;
        }

        public final void j() {
            this.a.b();
        }

        public final void k(int i) {
            this.a.d(i, 1);
        }

        public final void l(int i, @z1 Object obj) {
            this.a.e(i, 1, obj);
        }

        public final void m(int i) {
            this.a.f(i, 1);
        }

        public final void n(int i, int i2) {
            this.a.c(i, i2);
        }

        public final void o(int i, int i2) {
            this.a.d(i, i2);
        }

        public final void p(int i, int i2, @z1 Object obj) {
            this.a.e(i, i2, obj);
        }

        public final void q(int i, int i2) {
            this.a.f(i, i2);
        }

        public final void r(int i, int i2) {
            this.a.g(i, i2);
        }

        public final void s(int i) {
            this.a.g(i, 1);
        }

        public void t(@x1 RecyclerView recyclerView) {
        }

        public abstract void u(@x1 VH vh, int i);

        public void v(@x1 VH vh, int i, @x1 List<Object> list) {
            u(vh, i);
        }

        @x1
        public abstract VH w(@x1 ViewGroup viewGroup, int i);

        public void x(@x1 RecyclerView recyclerView) {
        }

        public boolean y(@x1 VH vh) {
            return false;
        }

        public void z(@x1 VH vh) {
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Observable<i> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).e(i, i2, 1);
            }
        }

        public void d(int i, int i2) {
            e(i, i2, null);
        }

        public void e(int i, int i2, @z1 Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
            }
        }

        public void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).d(i, i2);
            }
        }

        public void g(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).f(i, i2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, @z1 Object obj) {
            b(i, i2);
        }

        public void d(int i, int i2) {
        }

        public void e(int i, int i2, int i3) {
        }

        public void f(int i, int i2) {
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        int a(int i, int i2);
    }

    /* loaded from: classes.dex */
    public static class k {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        @x1
        public EdgeEffect a(@x1 RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public static final int a = 2;
        public static final int b = 8;
        public static final int c = 4;
        public static final int d = 2048;
        public static final int e = 4096;
        private c f = null;
        private ArrayList<b> g = new ArrayList<>();
        private long h = 120;
        private long i = 120;
        private long j = 250;
        private long k = 250;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        /* loaded from: classes.dex */
        public interface b {
            void a();
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(@x1 f0 f0Var);
        }

        /* loaded from: classes.dex */
        public static class d {
            public int a;
            public int b;
            public int c;
            public int d;
            public int e;

            @x1
            public d a(@x1 f0 f0Var) {
                return b(f0Var, 0);
            }

            @x1
            public d b(@x1 f0 f0Var, int i) {
                View view = f0Var.p;
                this.a = view.getLeft();
                this.b = view.getTop();
                this.c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }

        public static int e(f0 f0Var) {
            int i = f0Var.y & 14;
            if (f0Var.u()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int n = f0Var.n();
                int j = f0Var.j();
                return (n == -1 || j == -1 || n == j) ? i : i | 2048;
            }
            return i;
        }

        public void A(c cVar) {
            this.f = cVar;
        }

        public void B(long j) {
            this.j = j;
        }

        public void C(long j) {
            this.i = j;
        }

        public abstract boolean a(@x1 f0 f0Var, @z1 d dVar, @x1 d dVar2);

        public abstract boolean b(@x1 f0 f0Var, @x1 f0 f0Var2, @x1 d dVar, @x1 d dVar2);

        public abstract boolean c(@x1 f0 f0Var, @x1 d dVar, @z1 d dVar2);

        public abstract boolean d(@x1 f0 f0Var, @x1 d dVar, @x1 d dVar2);

        public boolean f(@x1 f0 f0Var) {
            return true;
        }

        public boolean g(@x1 f0 f0Var, @x1 List<Object> list) {
            return f(f0Var);
        }

        public final void h(@x1 f0 f0Var) {
            t(f0Var);
            c cVar = this.f;
            if (cVar != null) {
                cVar.a(f0Var);
            }
        }

        public final void i(@x1 f0 f0Var) {
            u(f0Var);
        }

        public final void j() {
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                this.g.get(i).a();
            }
            this.g.clear();
        }

        public abstract void k(@x1 f0 f0Var);

        public abstract void l();

        public long m() {
            return this.h;
        }

        public long n() {
            return this.k;
        }

        public long o() {
            return this.j;
        }

        public long p() {
            return this.i;
        }

        public abstract boolean q();

        public final boolean r(@z1 b bVar) {
            boolean q = q();
            if (bVar != null) {
                if (!q) {
                    bVar.a();
                } else {
                    this.g.add(bVar);
                }
            }
            return q;
        }

        @x1
        public d s() {
            return new d();
        }

        public void t(@x1 f0 f0Var) {
        }

        public void u(@x1 f0 f0Var) {
        }

        @x1
        public d v(@x1 c0 c0Var, @x1 f0 f0Var) {
            return s().a(f0Var);
        }

        @x1
        public d w(@x1 c0 c0Var, @x1 f0 f0Var, int i, @x1 List<Object> list) {
            return s().a(f0Var);
        }

        public abstract void x();

        public void y(long j) {
            this.h = j;
        }

        public void z(long j) {
            this.k = j;
        }
    }

    /* loaded from: classes.dex */
    public class m implements l.c {
        public m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.c
        public void a(f0 f0Var) {
            f0Var.H(true);
            if (f0Var.w != null && f0Var.x == null) {
                f0Var.w = null;
            }
            f0Var.x = null;
            if (f0Var.J() || RecyclerView.this.n1(f0Var.p) || !f0Var.y()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f0Var.p, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {
        @Deprecated
        public void f(@x1 Rect rect, int i, @x1 RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(@x1 Rect rect, @x1 View view, @x1 RecyclerView recyclerView, @x1 c0 c0Var) {
            f(rect, ((p) view.getLayoutParams()).b(), recyclerView);
        }

        @Deprecated
        public void h(@x1 Canvas canvas, @x1 RecyclerView recyclerView) {
        }

        public void i(@x1 Canvas canvas, @x1 RecyclerView recyclerView, @x1 c0 c0Var) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void j(@x1 Canvas canvas, @x1 RecyclerView recyclerView) {
        }

        public void k(@x1 Canvas canvas, @x1 RecyclerView recyclerView, @x1 c0 c0Var) {
            j(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
        public v20 a;
        public RecyclerView b;
        private final v30.b c;
        private final v30.b d;
        public v30 e;
        public v30 f;
        @z1
        public b0 g;
        public boolean h;
        public boolean i;
        public boolean j;
        private boolean k;
        private boolean l;
        public int m;
        public boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        /* loaded from: classes.dex */
        public class a implements v30.b {
            public a() {
            }

            @Override // com.p7700g.p99005.v30.b
            public View a(int i) {
                return o.this.P(i);
            }

            @Override // com.p7700g.p99005.v30.b
            public int b(View view) {
                return o.this.Y(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // com.p7700g.p99005.v30.b
            public int c() {
                return o.this.o0();
            }

            @Override // com.p7700g.p99005.v30.b
            public int d() {
                return o.this.z0() - o.this.p0();
            }

            @Override // com.p7700g.p99005.v30.b
            public int e(View view) {
                return o.this.b0(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements v30.b {
            public b() {
            }

            @Override // com.p7700g.p99005.v30.b
            public View a(int i) {
                return o.this.P(i);
            }

            @Override // com.p7700g.p99005.v30.b
            public int b(View view) {
                return o.this.c0(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // com.p7700g.p99005.v30.b
            public int c() {
                return o.this.r0();
            }

            @Override // com.p7700g.p99005.v30.b
            public int d() {
                return o.this.e0() - o.this.m0();
            }

            @Override // com.p7700g.p99005.v30.b
            public int e(View view) {
                return o.this.W(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i, int i2);
        }

        /* loaded from: classes.dex */
        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public o() {
            a aVar = new a();
            this.c = aVar;
            b bVar = new b();
            this.d = bVar;
            this.e = new v30(aVar);
            this.f = new v30(bVar);
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = true;
        }

        private void E(int i, @x1 View view) {
            this.a.d(i);
        }

        private boolean H0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int o0 = o0();
            int r0 = r0();
            int z0 = z0() - p0();
            int e0 = e0() - m0();
            Rect rect = this.b.H0;
            X(focusedChild, rect);
            return rect.left - i < z0 && rect.right - i > o0 && rect.top - i2 < e0 && rect.bottom - i2 > r0;
        }

        private static boolean L0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i;
                } else {
                    return true;
                }
            }
            return false;
        }

        private void P1(w wVar, int i, View view) {
            f0 s0 = RecyclerView.s0(view);
            if (s0.K()) {
                return;
            }
            if (s0.u() && !s0.w() && !this.b.K0.i()) {
                K1(i);
                wVar.D(s0);
                return;
            }
            D(i);
            wVar.E(view);
            this.b.E0.k(s0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int R(int i, int i2, int i3, int i4, boolean z) {
            int max = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 != Integer.MIN_VALUE) {
                            if (i2 != 0) {
                            }
                        }
                        i4 = max;
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i2 = 1073741824;
            } else {
                if (i4 < 0) {
                    if (i4 != -1) {
                        if (i4 == -2) {
                            i2 = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
                        }
                        i2 = 0;
                        i4 = 0;
                    }
                    i4 = max;
                }
                i2 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
            if (r3 >= 0) goto L8;
         */
        @Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int S(int i, int i2, int i3, boolean z) {
            int i4 = i - i2;
            int i5 = 0;
            int max = Math.max(0, i4);
            if (!z) {
                if (i3 < 0) {
                    if (i3 == -1) {
                        i5 = 1073741824;
                    } else {
                        i5 = i3 == -2 ? Integer.MIN_VALUE : Integer.MIN_VALUE;
                        i3 = 0;
                    }
                    i3 = max;
                }
                i5 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i3, i5);
        }

        private int[] T(View view, Rect rect) {
            int[] iArr = new int[2];
            int o0 = o0();
            int r0 = r0();
            int z0 = z0() - p0();
            int e0 = e0() - m0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - o0;
            int min = Math.min(0, i);
            int i2 = top - r0;
            int min2 = Math.min(0, i2);
            int i3 = width - z0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - e0);
            if (i0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private void g(View view, int i, boolean z) {
            f0 s0 = RecyclerView.s0(view);
            if (!z && !s0.w()) {
                this.b.E0.p(s0);
            } else {
                this.b.E0.b(s0);
            }
            p pVar = (p) view.getLayoutParams();
            if (!s0.N() && !s0.x()) {
                if (view.getParent() == this.b) {
                    int m = this.a.m(view);
                    if (i == -1) {
                        i = this.a.g();
                    }
                    if (m == -1) {
                        StringBuilder G = wo1.G("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        G.append(this.b.indexOfChild(view));
                        throw new IllegalStateException(wo1.k(this.b, G));
                    } else if (m != i) {
                        this.b.L0.S0(m, i);
                    }
                } else {
                    this.a.a(view, i, false);
                    pVar.c = true;
                    b0 b0Var = this.g;
                    if (b0Var != null && b0Var.i()) {
                        this.g.l(view);
                    }
                }
            } else {
                if (s0.x()) {
                    s0.M();
                } else {
                    s0.e();
                }
                this.a.c(view, i, view.getLayoutParams(), false);
            }
            if (pVar.d) {
                s0.p.invalidate();
                pVar.d = false;
            }
        }

        public static int q(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        public static d t0(@x1 Context context, @z1 AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o20.j.P, i, i2);
            dVar.a = obtainStyledAttributes.getInt(o20.j.Q, 1);
            dVar.b = obtainStyledAttributes.getInt(o20.j.a0, 1);
            dVar.c = obtainStyledAttributes.getBoolean(o20.j.Z, false);
            dVar.d = obtainStyledAttributes.getBoolean(o20.j.b0, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public void A(@x1 View view, @x1 w wVar) {
            P1(wVar, this.a.m(view), view);
        }

        public int A0() {
            return this.o;
        }

        public boolean A1(@x1 w wVar, @x1 c0 c0Var, @x1 View view, int i, @z1 Bundle bundle) {
            return false;
        }

        public void B(int i, @x1 w wVar) {
            P1(wVar, i, P(i));
        }

        public boolean B0() {
            int Q = Q();
            for (int i = 0; i < Q; i++) {
                ViewGroup.LayoutParams layoutParams = P(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void B1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                sr.o1(recyclerView, runnable);
            }
        }

        public void C(@x1 View view) {
            int m = this.a.m(view);
            if (m >= 0) {
                E(m, view);
            }
        }

        public boolean C0() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void C1() {
            for (int Q = Q() - 1; Q >= 0; Q--) {
                this.a.q(Q);
            }
        }

        public void D(int i) {
            E(i, P(i));
        }

        public void D0(@x1 View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
                f0 s0 = RecyclerView.s0(view);
                s0.b(128);
                this.b.E0.q(s0);
                return;
            }
            throw new IllegalArgumentException(wo1.k(this.b, wo1.G("View should be fully attached to be ignored")));
        }

        public void D1(@x1 w wVar) {
            for (int Q = Q() - 1; Q >= 0; Q--) {
                if (!RecyclerView.s0(P(Q)).K()) {
                    G1(Q, wVar);
                }
            }
        }

        public boolean E0() {
            return this.i;
        }

        public void E1(w wVar) {
            int k = wVar.k();
            for (int i = k - 1; i >= 0; i--) {
                View o = wVar.o(i);
                f0 s0 = RecyclerView.s0(o);
                if (!s0.K()) {
                    s0.H(false);
                    if (s0.y()) {
                        this.b.removeDetachedView(o, false);
                    }
                    l lVar = this.b.l1;
                    if (lVar != null) {
                        lVar.k(s0);
                    }
                    s0.H(true);
                    wVar.z(o);
                }
            }
            wVar.f();
            if (k > 0) {
                this.b.invalidate();
            }
        }

        public void F(RecyclerView recyclerView) {
            this.i = true;
            X0(recyclerView);
        }

        public boolean F0() {
            return this.j;
        }

        public void F1(@x1 View view, @x1 w wVar) {
            J1(view);
            wVar.C(view);
        }

        public void G(RecyclerView recyclerView, w wVar) {
            this.i = false;
            Z0(recyclerView, wVar);
        }

        public boolean G0() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.isFocused();
        }

        public void G1(int i, @x1 w wVar) {
            View P = P(i);
            K1(i);
            wVar.C(P);
        }

        public void H(View view) {
            l lVar = this.b.l1;
            if (lVar != null) {
                lVar.k(RecyclerView.s0(view));
            }
        }

        public boolean H1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @z1
        public View I(@x1 View view) {
            View Z;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (Z = recyclerView.Z(view)) == null || this.a.n(Z)) {
                return null;
            }
            return Z;
        }

        public final boolean I0() {
            return this.l;
        }

        public void I1(@x1 View view) {
            this.b.removeDetachedView(view, false);
        }

        @z1
        public View J(int i) {
            int Q = Q();
            for (int i2 = 0; i2 < Q; i2++) {
                View P = P(i2);
                f0 s0 = RecyclerView.s0(P);
                if (s0 != null && s0.m() == i && !s0.K() && (this.b.D1.j() || !s0.w())) {
                    return P;
                }
            }
            return null;
        }

        public boolean J0(@x1 w wVar, @x1 c0 c0Var) {
            return false;
        }

        public void J1(View view) {
            this.a.p(view);
        }

        public abstract p K();

        public boolean K0() {
            return this.k;
        }

        public void K1(int i) {
            if (P(i) != null) {
                this.a.q(i);
            }
        }

        public p L(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public boolean L1(@x1 RecyclerView recyclerView, @x1 View view, @x1 Rect rect, boolean z) {
            return M1(recyclerView, view, rect, z, false);
        }

        public p M(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new p(layoutParams);
        }

        public boolean M0() {
            b0 b0Var = this.g;
            return b0Var != null && b0Var.i();
        }

        public boolean M1(@x1 RecyclerView recyclerView, @x1 View view, @x1 Rect rect, boolean z, boolean z2) {
            int[] T = T(view, rect);
            int i = T[0];
            int i2 = T[1];
            if ((!z2 || H0(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.F1(i, i2);
                }
                return true;
            }
            return false;
        }

        public int N() {
            return -1;
        }

        public boolean N0(@x1 View view, boolean z, boolean z2) {
            boolean z3 = this.e.b(view, 24579) && this.f.b(view, 24579);
            return z ? z3 : !z3;
        }

        public void N1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int O(@x1 View view) {
            return ((p) view.getLayoutParams()).b.bottom;
        }

        public void O0(@x1 View view, int i, int i2, int i3, int i4) {
            Rect rect = ((p) view.getLayoutParams()).b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void O1() {
            this.h = true;
        }

        @z1
        public View P(int i) {
            v20 v20Var = this.a;
            if (v20Var != null) {
                return v20Var.f(i);
            }
            return null;
        }

        public void P0(@x1 View view, int i, int i2, int i3, int i4) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public int Q() {
            v20 v20Var = this.a;
            if (v20Var != null) {
                return v20Var.g();
            }
            return 0;
        }

        public void Q0(@x1 View view, int i, int i2) {
            p pVar = (p) view.getLayoutParams();
            Rect x0 = this.b.x0(view);
            int i3 = x0.left + x0.right + i;
            int i4 = x0.top + x0.bottom + i2;
            int R = R(z0(), A0(), p0() + o0() + i3, ((ViewGroup.MarginLayoutParams) pVar).width, n());
            int R2 = R(e0(), f0(), m0() + r0() + i4, ((ViewGroup.MarginLayoutParams) pVar).height, o());
            if (c2(view, R, R2, pVar)) {
                view.measure(R, R2);
            }
        }

        public int Q1(int i, w wVar, c0 c0Var) {
            return 0;
        }

        public void R0(@x1 View view, int i, int i2) {
            p pVar = (p) view.getLayoutParams();
            Rect x0 = this.b.x0(view);
            int i3 = x0.left + x0.right + i;
            int i4 = x0.top + x0.bottom + i2;
            int R = R(z0(), A0(), p0() + o0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) pVar).width, n());
            int R2 = R(e0(), f0(), m0() + r0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).height, o());
            if (c2(view, R, R2, pVar)) {
                view.measure(R, R2);
            }
        }

        public void R1(int i) {
        }

        public void S0(int i, int i2) {
            View P = P(i);
            if (P != null) {
                D(i);
                k(P, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.b.toString());
        }

        public int S1(int i, w wVar, c0 c0Var) {
            return 0;
        }

        public void T0(@c2 int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.R0(i);
            }
        }

        @Deprecated
        public void T1(boolean z) {
            this.j = z;
        }

        public boolean U() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.F0;
        }

        public void U0(@c2 int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.S0(i);
            }
        }

        public void U1(RecyclerView recyclerView) {
            W1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int V(@x1 w wVar, @x1 c0 c0Var) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.K0 == null || !n()) {
                return 1;
            }
            return this.b.K0.e();
        }

        public void V0(@z1 g gVar, @z1 g gVar2) {
        }

        public final void V1(boolean z) {
            if (z != this.l) {
                this.l = z;
                this.m = 0;
                RecyclerView recyclerView = this.b;
                if (recyclerView != null) {
                    recyclerView.A0.L();
                }
            }
        }

        public int W(@x1 View view) {
            return O(view) + view.getBottom();
        }

        public boolean W0(@x1 RecyclerView recyclerView, @x1 ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public void W1(int i, int i2) {
            this.q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.o = mode;
            if (mode == 0 && !RecyclerView.x) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.p = mode2;
            if (mode2 != 0 || RecyclerView.x) {
                return;
            }
            this.r = 0;
        }

        public void X(@x1 View view, @x1 Rect rect) {
            RecyclerView.u0(view, rect);
        }

        @t0
        public void X0(RecyclerView recyclerView) {
        }

        public void X1(int i, int i2) {
            this.b.setMeasuredDimension(i, i2);
        }

        public int Y(@x1 View view) {
            return view.getLeft() - j0(view);
        }

        @Deprecated
        public void Y0(RecyclerView recyclerView) {
        }

        public void Y1(Rect rect, int i, int i2) {
            X1(q(i, p0() + o0() + rect.width(), l0()), q(i2, m0() + r0() + rect.height(), k0()));
        }

        public int Z(@x1 View view) {
            Rect rect = ((p) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        @t0
        public void Z0(RecyclerView recyclerView, w wVar) {
            Y0(recyclerView);
        }

        public void Z1(int i, int i2) {
            int Q = Q();
            if (Q == 0) {
                this.b.F(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < Q; i7++) {
                View P = P(i7);
                Rect rect = this.b.H0;
                X(P, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.b.H0.set(i5, i6, i3, i4);
            Y1(this.b.H0, i, i2);
        }

        public int a0(@x1 View view) {
            Rect rect = ((p) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        @z1
        public View a1(@x1 View view, int i, @x1 w wVar, @x1 c0 c0Var) {
            return null;
        }

        public void a2(boolean z) {
            this.k = z;
        }

        public int b0(@x1 View view) {
            return u0(view) + view.getRight();
        }

        public void b1(@x1 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            c1(recyclerView.A0, recyclerView.D1, accessibilityEvent);
        }

        public void b2(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.q = 0;
                this.r = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.D0;
                this.q = recyclerView.getWidth();
                this.r = recyclerView.getHeight();
            }
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public void c(View view) {
            d(view, -1);
        }

        public int c0(@x1 View view) {
            return view.getTop() - x0(view);
        }

        public void c1(@x1 w wVar, @x1 c0 c0Var, @x1 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            g gVar = this.b.K0;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.e());
            }
        }

        public boolean c2(View view, int i, int i2, p pVar) {
            return (!view.isLayoutRequested() && this.k && L0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && L0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public void d(View view, int i) {
            g(view, i, true);
        }

        @z1
        public View d0() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void d1(ls lsVar) {
            RecyclerView recyclerView = this.b;
            e1(recyclerView.A0, recyclerView.D1, lsVar);
        }

        public boolean d2() {
            return false;
        }

        public void e(View view) {
            f(view, -1);
        }

        @c2
        public int e0() {
            return this.r;
        }

        public void e1(@x1 w wVar, @x1 c0 c0Var, @x1 ls lsVar) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                lsVar.a(8192);
                lsVar.F1(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                lsVar.a(4096);
                lsVar.F1(true);
            }
            lsVar.Y0(ls.b.f(v0(wVar, c0Var), V(wVar, c0Var), J0(wVar, c0Var), w0(wVar, c0Var)));
        }

        public boolean e2(View view, int i, int i2, p pVar) {
            return (this.k && L0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && L0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public void f(View view, int i) {
            g(view, i, false);
        }

        public int f0() {
            return this.p;
        }

        public void f1(View view, ls lsVar) {
            f0 s0 = RecyclerView.s0(view);
            if (s0 == null || s0.w() || this.a.n(s0.p)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            g1(recyclerView.A0, recyclerView.D1, view, lsVar);
        }

        public void f2(RecyclerView recyclerView, c0 c0Var, int i) {
        }

        public int g0() {
            RecyclerView recyclerView = this.b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.e();
            }
            return 0;
        }

        public void g1(@x1 w wVar, @x1 c0 c0Var, @x1 View view, @x1 ls lsVar) {
            lsVar.Z0(ls.c.h(o() ? s0(view) : 0, 1, n() ? s0(view) : 0, 1, false, false));
        }

        public void g2(b0 b0Var) {
            b0 b0Var2 = this.g;
            if (b0Var2 != null && b0Var != b0Var2 && b0Var2.i()) {
                this.g.s();
            }
            this.g = b0Var;
            b0Var.r(this.b, this);
        }

        public void h(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.u(str);
            }
        }

        public int h0(@x1 View view) {
            return RecyclerView.s0(view).l();
        }

        @z1
        public View h1(@x1 View view, int i) {
            return null;
        }

        public void h2(@x1 View view) {
            f0 s0 = RecyclerView.s0(view);
            s0.L();
            s0.E();
            s0.b(4);
        }

        public void i(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.v(str);
            }
        }

        public int i0() {
            return sr.Y(this.b);
        }

        public void i1(@x1 RecyclerView recyclerView, int i, int i2) {
        }

        public void i2() {
            b0 b0Var = this.g;
            if (b0Var != null) {
                b0Var.s();
            }
        }

        public void j(@x1 View view) {
            k(view, -1);
        }

        public int j0(@x1 View view) {
            return ((p) view.getLayoutParams()).b.left;
        }

        public void j1(@x1 RecyclerView recyclerView) {
        }

        public boolean j2() {
            return false;
        }

        public void k(@x1 View view, int i) {
            l(view, i, (p) view.getLayoutParams());
        }

        @c2
        public int k0() {
            return sr.d0(this.b);
        }

        public void k1(@x1 RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void l(@x1 View view, int i, p pVar) {
            f0 s0 = RecyclerView.s0(view);
            if (s0.w()) {
                this.b.E0.b(s0);
            } else {
                this.b.E0.p(s0);
            }
            this.a.c(view, i, pVar, s0.w());
        }

        @c2
        public int l0() {
            return sr.e0(this.b);
        }

        public void l1(@x1 RecyclerView recyclerView, int i, int i2) {
        }

        public void m(@x1 View view, @x1 Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.x0(view));
            }
        }

        @c2
        public int m0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void m1(@x1 RecyclerView recyclerView, int i, int i2) {
        }

        public boolean n() {
            return false;
        }

        @c2
        public int n0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return sr.i0(recyclerView);
            }
            return 0;
        }

        public void n1(@x1 RecyclerView recyclerView, int i, int i2, @z1 Object obj) {
            m1(recyclerView, i, i2);
        }

        public boolean o() {
            return false;
        }

        @c2
        public int o0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void o1(w wVar, c0 c0Var) {
        }

        public boolean p(p pVar) {
            return pVar != null;
        }

        @c2
        public int p0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void p1(c0 c0Var) {
        }

        @c2
        public int q0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return sr.j0(recyclerView);
            }
            return 0;
        }

        public void q1(@x1 w wVar, @x1 c0 c0Var, int i, int i2) {
            this.b.F(i, i2);
        }

        public void r(int i, int i2, c0 c0Var, c cVar) {
        }

        @c2
        public int r0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        @Deprecated
        public boolean r1(@x1 RecyclerView recyclerView, @x1 View view, @z1 View view2) {
            return M0() || recyclerView.L0();
        }

        public void s(int i, c cVar) {
        }

        public int s0(@x1 View view) {
            return ((p) view.getLayoutParams()).b();
        }

        public boolean s1(@x1 RecyclerView recyclerView, @x1 c0 c0Var, @x1 View view, @z1 View view2) {
            return r1(recyclerView, view, view2);
        }

        public int t(@x1 c0 c0Var) {
            return 0;
        }

        public void t1(Parcelable parcelable) {
        }

        public int u(@x1 c0 c0Var) {
            return 0;
        }

        public int u0(@x1 View view) {
            return ((p) view.getLayoutParams()).b.right;
        }

        @z1
        public Parcelable u1() {
            return null;
        }

        public int v(@x1 c0 c0Var) {
            return 0;
        }

        public int v0(@x1 w wVar, @x1 c0 c0Var) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.K0 == null || !o()) {
                return 1;
            }
            return this.b.K0.e();
        }

        public void v1(int i) {
        }

        public int w(@x1 c0 c0Var) {
            return 0;
        }

        public int w0(@x1 w wVar, @x1 c0 c0Var) {
            return 0;
        }

        public void w1(b0 b0Var) {
            if (this.g == b0Var) {
                this.g = null;
            }
        }

        public int x(@x1 c0 c0Var) {
            return 0;
        }

        public int x0(@x1 View view) {
            return ((p) view.getLayoutParams()).b.top;
        }

        public boolean x1(int i, @z1 Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return y1(recyclerView.A0, recyclerView.D1, i, bundle);
        }

        public int y(@x1 c0 c0Var) {
            return 0;
        }

        public void y0(@x1 View view, boolean z, @x1 Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((p) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.J0;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean y1(@x1 w wVar, @x1 c0 c0Var, int i, @z1 Bundle bundle) {
            int e0;
            int z0;
            int i2;
            int i3;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                e0 = recyclerView.canScrollVertically(1) ? (e0() - r0()) - m0() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    z0 = (z0() - o0()) - p0();
                    i2 = e0;
                    i3 = z0;
                }
                i2 = e0;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                e0 = recyclerView.canScrollVertically(-1) ? -((e0() - r0()) - m0()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    z0 = -((z0() - o0()) - p0());
                    i2 = e0;
                    i3 = z0;
                }
                i2 = e0;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.b.I1(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void z(@x1 w wVar) {
            for (int Q = Q() - 1; Q >= 0; Q--) {
                P1(wVar, Q, P(Q));
            }
        }

        @c2
        public int z0() {
            return this.q;
        }

        public boolean z1(@x1 View view, int i, @z1 Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return A1(recyclerView.A0, recyclerView.D1, view, i, bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        void b(@x1 View view);

        void d(@x1 View view);
    }

    /* loaded from: classes.dex */
    public static abstract class r {
        public abstract boolean a(int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface s {
        void a(@x1 RecyclerView recyclerView, @x1 MotionEvent motionEvent);

        boolean c(@x1 RecyclerView recyclerView, @x1 MotionEvent motionEvent);

        void e(boolean z);
    }

    /* loaded from: classes.dex */
    public static abstract class t {
        public void a(@x1 RecyclerView recyclerView, int i) {
        }

        public void b(@x1 RecyclerView recyclerView, int i, int i2) {
        }
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface u {
    }

    /* loaded from: classes.dex */
    public static class v {
        private static final int a = 5;
        public SparseArray<a> b = new SparseArray<>();
        private int c = 0;

        /* loaded from: classes.dex */
        public static class a {
            public final ArrayList<f0> a = new ArrayList<>();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        private a h(int i) {
            a aVar = this.b.get(i);
            if (aVar == null) {
                a aVar2 = new a();
                this.b.put(i, aVar2);
                return aVar2;
            }
            return aVar;
        }

        public void a() {
            this.c++;
        }

        public void b() {
            for (int i = 0; i < this.b.size(); i++) {
                this.b.valueAt(i).a.clear();
            }
        }

        public void c() {
            this.c--;
        }

        public void d(int i, long j) {
            a h = h(i);
            h.d = k(h.d, j);
        }

        public void e(int i, long j) {
            a h = h(i);
            h.c = k(h.c, j);
        }

        @z1
        public f0 f(int i) {
            a aVar = this.b.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<f0> arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).s()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public int g(int i) {
            return h(i).a.size();
        }

        public void i(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.c == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void j(f0 f0Var) {
            int l = f0Var.l();
            ArrayList<f0> arrayList = h(l).a;
            if (this.b.get(l).b <= arrayList.size()) {
                return;
            }
            f0Var.E();
            arrayList.add(f0Var);
        }

        public long k(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }

        public void l(int i, int i2) {
            a h = h(i);
            h.b = i2;
            ArrayList<f0> arrayList = h.a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public int m() {
            int i = 0;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                ArrayList<f0> arrayList = this.b.valueAt(i2).a;
                if (arrayList != null) {
                    i = arrayList.size() + i;
                }
            }
            return i;
        }

        public boolean n(int i, long j, long j2) {
            long j3 = h(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        public boolean o(int i, long j, long j2) {
            long j3 = h(i).c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* loaded from: classes.dex */
    public final class w {
        public static final int a = 2;
        public final ArrayList<f0> b;
        public ArrayList<f0> c;
        public final ArrayList<f0> d;
        private final List<f0> e;
        private int f;
        public int g;
        public v h;
        private d0 i;

        public w() {
            ArrayList<f0> arrayList = new ArrayList<>();
            this.b = arrayList;
            this.c = null;
            this.d = new ArrayList<>();
            this.e = Collections.unmodifiableList(arrayList);
            this.f = 2;
            this.g = 2;
        }

        private boolean I(@x1 f0 f0Var, int i, int i2, long j) {
            f0Var.G = RecyclerView.this;
            int l = f0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j == Long.MAX_VALUE || this.h.n(l, nanoTime, j)) {
                RecyclerView.this.K0.c(f0Var, i);
                this.h.d(f0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
                b(f0Var);
                if (RecyclerView.this.D1.j()) {
                    f0Var.v = i2;
                    return true;
                }
                return true;
            }
            return false;
        }

        private void b(f0 f0Var) {
            if (RecyclerView.this.J0()) {
                View view = f0Var.p;
                if (sr.U(view) == 0) {
                    sr.Q1(view, 1);
                }
                n30 n30Var = RecyclerView.this.K1;
                if (n30Var == null) {
                    return;
                }
                fq n = n30Var.n();
                if (n instanceof n30.a) {
                    ((n30.a) n).o(view);
                }
                sr.A1(view, n);
            }
        }

        private void r(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    r((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void s(f0 f0Var) {
            View view = f0Var.p;
            if (view instanceof ViewGroup) {
                r((ViewGroup) view, false);
            }
        }

        public void A() {
            for (int size = this.d.size() - 1; size >= 0; size--) {
                B(size);
            }
            this.d.clear();
            if (RecyclerView.z) {
                RecyclerView.this.C1.b();
            }
        }

        public void B(int i) {
            a(this.d.get(i), true);
            this.d.remove(i);
        }

        public void C(@x1 View view) {
            f0 s0 = RecyclerView.s0(view);
            if (s0.y()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (s0.x()) {
                s0.M();
            } else if (s0.N()) {
                s0.e();
            }
            D(s0);
            if (RecyclerView.this.l1 == null || s0.v()) {
                return;
            }
            RecyclerView.this.l1.k(s0);
        }

        public void D(f0 f0Var) {
            boolean z = true;
            if (!f0Var.x() && f0Var.p.getParent() == null) {
                if (!f0Var.y()) {
                    if (!f0Var.K()) {
                        boolean h = f0Var.h();
                        g gVar = RecyclerView.this.K0;
                        if ((gVar != null && h && gVar.y(f0Var)) || f0Var.v()) {
                            if (this.g <= 0 || f0Var.q(IronSourceError.ERROR_CAPPED_PER_SESSION)) {
                                r1 = false;
                            } else {
                                int size = this.d.size();
                                if (size >= this.g && size > 0) {
                                    B(0);
                                    size--;
                                }
                                if (RecyclerView.z && size > 0 && !RecyclerView.this.C1.d(f0Var.r)) {
                                    do {
                                        size--;
                                        if (size < 0) {
                                            break;
                                        }
                                    } while (RecyclerView.this.C1.d(this.d.get(size).r));
                                    size++;
                                }
                                this.d.add(size, f0Var);
                                r1 = true;
                            }
                            if (!r1) {
                                a(f0Var, true);
                                RecyclerView.this.E0.q(f0Var);
                                if (r1 && !z && h) {
                                    f0Var.G = null;
                                    return;
                                }
                                return;
                            }
                        }
                        z = false;
                        RecyclerView.this.E0.q(f0Var);
                        if (r1) {
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException(wo1.k(RecyclerView.this, wo1.G("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(f0Var);
                throw new IllegalArgumentException(wo1.k(RecyclerView.this, sb));
            }
            StringBuilder G = wo1.G("Scrapped or attached views may not be recycled. isScrap:");
            G.append(f0Var.x());
            G.append(" isAttached:");
            G.append(f0Var.p.getParent() != null);
            throw new IllegalArgumentException(wo1.k(RecyclerView.this, G));
        }

        public void E(View view) {
            f0 s0 = RecyclerView.s0(view);
            if (!s0.q(12) && s0.z() && !RecyclerView.this.w(s0)) {
                if (this.c == null) {
                    this.c = new ArrayList<>();
                }
                s0.I(this, true);
                this.c.add(s0);
            } else if (s0.u() && !s0.w() && !RecyclerView.this.K0.i()) {
                throw new IllegalArgumentException(wo1.k(RecyclerView.this, wo1.G("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            } else {
                s0.I(this, false);
                this.b.add(s0);
            }
        }

        public void F(v vVar) {
            v vVar2 = this.h;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.h = vVar;
            if (vVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.h.a();
        }

        public void G(d0 d0Var) {
            this.i = d0Var;
        }

        public void H(int i) {
            this.f = i;
            L();
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x01fc A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01d2  */
        @z1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f0 J(int i, boolean z, long j) {
            f0 f0Var;
            boolean z2;
            f0 f0Var2;
            boolean z3;
            boolean I;
            ViewGroup.LayoutParams layoutParams;
            p pVar;
            RecyclerView d0;
            d0 d0Var;
            View a2;
            if (i >= 0 && i < RecyclerView.this.D1.d()) {
                boolean z4 = true;
                if (RecyclerView.this.D1.j()) {
                    f0Var = i(i);
                    if (f0Var != null) {
                        z2 = true;
                        if (f0Var == null && (f0Var = n(i, z)) != null) {
                            if (M(f0Var)) {
                                if (!z) {
                                    f0Var.b(4);
                                    if (f0Var.x()) {
                                        RecyclerView.this.removeDetachedView(f0Var.p, false);
                                        f0Var.M();
                                    } else if (f0Var.N()) {
                                        f0Var.e();
                                    }
                                    D(f0Var);
                                }
                                f0Var = null;
                            } else {
                                z2 = true;
                            }
                        }
                        if (f0Var == null) {
                            int n = RecyclerView.this.C0.n(i);
                            if (n >= 0 && n < RecyclerView.this.K0.e()) {
                                int g = RecyclerView.this.K0.g(n);
                                if (RecyclerView.this.K0.i() && (f0Var = m(RecyclerView.this.K0.f(n), g, z)) != null) {
                                    f0Var.r = n;
                                    z2 = true;
                                }
                                if (f0Var == null && (d0Var = this.i) != null && (a2 = d0Var.a(this, i, g)) != null) {
                                    f0Var = RecyclerView.this.r0(a2);
                                    if (f0Var != null) {
                                        if (f0Var.K()) {
                                            throw new IllegalArgumentException(wo1.k(RecyclerView.this, wo1.G("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.")));
                                        }
                                    } else {
                                        throw new IllegalArgumentException(wo1.k(RecyclerView.this, wo1.G("getViewForPositionAndType returned a view which does not have a ViewHolder")));
                                    }
                                }
                                if (f0Var == null) {
                                    f0 f = j().f(g);
                                    if (f != null) {
                                        f.E();
                                        if (RecyclerView.w) {
                                            s(f);
                                        }
                                    }
                                    f0Var = f;
                                }
                                if (f0Var == null) {
                                    long nanoTime = RecyclerView.this.getNanoTime();
                                    if (j == Long.MAX_VALUE || this.h.o(g, nanoTime, j)) {
                                        RecyclerView recyclerView = RecyclerView.this;
                                        f0 d = recyclerView.K0.d(recyclerView, g);
                                        if (RecyclerView.z && (d0 = RecyclerView.d0(d.p)) != null) {
                                            d.q = new WeakReference<>(d0);
                                        }
                                        this.h.e(g, RecyclerView.this.getNanoTime() - nanoTime);
                                        f0Var2 = d;
                                        z3 = z2;
                                        if (z3 && !RecyclerView.this.D1.j() && f0Var2.q(8192)) {
                                            f0Var2.G(0, 8192);
                                            if (RecyclerView.this.D1.n) {
                                                RecyclerView recyclerView2 = RecyclerView.this;
                                                RecyclerView.this.j1(f0Var2, recyclerView2.l1.w(recyclerView2.D1, f0Var2, l.e(f0Var2) | 4096, f0Var2.p()));
                                            }
                                        }
                                        if (!RecyclerView.this.D1.j() && f0Var2.t()) {
                                            f0Var2.v = i;
                                        } else if (f0Var2.t() || f0Var2.A() || f0Var2.u()) {
                                            I = I(f0Var2, RecyclerView.this.C0.n(i), i, j);
                                            layoutParams = f0Var2.p.getLayoutParams();
                                            if (layoutParams != null) {
                                                pVar = (p) RecyclerView.this.generateDefaultLayoutParams();
                                                f0Var2.p.setLayoutParams(pVar);
                                            } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                                                pVar = (p) RecyclerView.this.generateLayoutParams(layoutParams);
                                                f0Var2.p.setLayoutParams(pVar);
                                            } else {
                                                pVar = (p) layoutParams;
                                            }
                                            pVar.a = f0Var2;
                                            pVar.d = (z3 || !I) ? false : false;
                                            return f0Var2;
                                        }
                                        I = false;
                                        layoutParams = f0Var2.p.getLayoutParams();
                                        if (layoutParams != null) {
                                        }
                                        pVar.a = f0Var2;
                                        pVar.d = (z3 || !I) ? false : false;
                                        return f0Var2;
                                    }
                                    return null;
                                }
                            } else {
                                StringBuilder J = wo1.J("Inconsistency detected. Invalid item position ", i, "(offset:", n, ").state:");
                                J.append(RecyclerView.this.D1.d());
                                throw new IndexOutOfBoundsException(wo1.k(RecyclerView.this, J));
                            }
                        }
                        f0Var2 = f0Var;
                        z3 = z2;
                        if (z3) {
                            f0Var2.G(0, 8192);
                            if (RecyclerView.this.D1.n) {
                            }
                        }
                        if (!RecyclerView.this.D1.j()) {
                        }
                        if (f0Var2.t()) {
                        }
                        I = I(f0Var2, RecyclerView.this.C0.n(i), i, j);
                        layoutParams = f0Var2.p.getLayoutParams();
                        if (layoutParams != null) {
                        }
                        pVar.a = f0Var2;
                        pVar.d = (z3 || !I) ? false : false;
                        return f0Var2;
                    }
                } else {
                    f0Var = null;
                }
                z2 = false;
                if (f0Var == null) {
                    if (M(f0Var)) {
                    }
                }
                if (f0Var == null) {
                }
                f0Var2 = f0Var;
                z3 = z2;
                if (z3) {
                }
                if (!RecyclerView.this.D1.j()) {
                }
                if (f0Var2.t()) {
                }
                I = I(f0Var2, RecyclerView.this.C0.n(i), i, j);
                layoutParams = f0Var2.p.getLayoutParams();
                if (layoutParams != null) {
                }
                pVar.a = f0Var2;
                pVar.d = (z3 || !I) ? false : false;
                return f0Var2;
            }
            StringBuilder J2 = wo1.J("Invalid item position ", i, "(", i, "). Item count:");
            J2.append(RecyclerView.this.D1.d());
            throw new IndexOutOfBoundsException(wo1.k(RecyclerView.this, J2));
        }

        public void K(f0 f0Var) {
            if (f0Var.D) {
                this.c.remove(f0Var);
            } else {
                this.b.remove(f0Var);
            }
            f0Var.C = null;
            f0Var.D = false;
            f0Var.e();
        }

        public void L() {
            o oVar = RecyclerView.this.L0;
            this.g = this.f + (oVar != null ? oVar.m : 0);
            for (int size = this.d.size() - 1; size >= 0 && this.d.size() > this.g; size--) {
                B(size);
            }
        }

        public boolean M(f0 f0Var) {
            if (f0Var.w()) {
                return RecyclerView.this.D1.j();
            }
            int i = f0Var.r;
            if (i >= 0 && i < RecyclerView.this.K0.e()) {
                if (RecyclerView.this.D1.j() || RecyclerView.this.K0.g(f0Var.r) == f0Var.l()) {
                    return !RecyclerView.this.K0.i() || f0Var.k() == RecyclerView.this.K0.f(f0Var.r);
                }
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Inconsistency detected. Invalid view holder adapter position");
            sb.append(f0Var);
            throw new IndexOutOfBoundsException(wo1.k(RecyclerView.this, sb));
        }

        public void N(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.d.size() - 1; size >= 0; size--) {
                f0 f0Var = this.d.get(size);
                if (f0Var != null && (i3 = f0Var.r) >= i && i3 < i4) {
                    f0Var.b(2);
                    B(size);
                }
            }
        }

        public void a(@x1 f0 f0Var, boolean z) {
            RecyclerView.y(f0Var);
            View view = f0Var.p;
            n30 n30Var = RecyclerView.this.K1;
            if (n30Var != null) {
                fq n = n30Var.n();
                sr.A1(view, n instanceof n30.a ? ((n30.a) n).n(view) : null);
            }
            if (z) {
                h(f0Var);
            }
            f0Var.G = null;
            j().j(f0Var);
        }

        public void c(@x1 View view, int i) {
            p pVar;
            f0 s0 = RecyclerView.s0(view);
            if (s0 != null) {
                int n = RecyclerView.this.C0.n(i);
                if (n >= 0 && n < RecyclerView.this.K0.e()) {
                    I(s0, n, i, Long.MAX_VALUE);
                    ViewGroup.LayoutParams layoutParams = s0.p.getLayoutParams();
                    if (layoutParams == null) {
                        pVar = (p) RecyclerView.this.generateDefaultLayoutParams();
                        s0.p.setLayoutParams(pVar);
                    } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                        pVar = (p) RecyclerView.this.generateLayoutParams(layoutParams);
                        s0.p.setLayoutParams(pVar);
                    } else {
                        pVar = (p) layoutParams;
                    }
                    pVar.c = true;
                    pVar.a = s0;
                    pVar.d = s0.p.getParent() == null;
                    return;
                }
                StringBuilder J = wo1.J("Inconsistency detected. Invalid item position ", i, "(offset:", n, ").state:");
                J.append(RecyclerView.this.D1.d());
                throw new IndexOutOfBoundsException(wo1.k(RecyclerView.this, J));
            }
            throw new IllegalArgumentException(wo1.k(RecyclerView.this, wo1.G("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter")));
        }

        public void d() {
            this.b.clear();
            A();
        }

        public void e() {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                this.d.get(i).c();
            }
            int size2 = this.b.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.b.get(i2).c();
            }
            ArrayList<f0> arrayList = this.c;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.c.get(i3).c();
                }
            }
        }

        public void f() {
            this.b.clear();
            ArrayList<f0> arrayList = this.c;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int g(int i) {
            if (i >= 0 && i < RecyclerView.this.D1.d()) {
                return !RecyclerView.this.D1.j() ? i : RecyclerView.this.C0.n(i);
            }
            StringBuilder H = wo1.H("invalid position ", i, ". State item count is ");
            H.append(RecyclerView.this.D1.d());
            throw new IndexOutOfBoundsException(wo1.k(RecyclerView.this, H));
        }

        public void h(@x1 f0 f0Var) {
            x xVar = RecyclerView.this.M0;
            if (xVar != null) {
                xVar.a(f0Var);
            }
            g gVar = RecyclerView.this.K0;
            if (gVar != null) {
                gVar.B(f0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.D1 != null) {
                recyclerView.E0.q(f0Var);
            }
        }

        public f0 i(int i) {
            int size;
            int n;
            ArrayList<f0> arrayList = this.c;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    f0 f0Var = this.c.get(i2);
                    if (!f0Var.N() && f0Var.m() == i) {
                        f0Var.b(32);
                        return f0Var;
                    }
                }
                if (RecyclerView.this.K0.i() && (n = RecyclerView.this.C0.n(i)) > 0 && n < RecyclerView.this.K0.e()) {
                    long f = RecyclerView.this.K0.f(n);
                    for (int i3 = 0; i3 < size; i3++) {
                        f0 f0Var2 = this.c.get(i3);
                        if (!f0Var2.N() && f0Var2.k() == f) {
                            f0Var2.b(32);
                            return f0Var2;
                        }
                    }
                }
            }
            return null;
        }

        public v j() {
            if (this.h == null) {
                this.h = new v();
            }
            return this.h;
        }

        public int k() {
            return this.b.size();
        }

        @x1
        public List<f0> l() {
            return this.e;
        }

        public f0 m(long j, int i, boolean z) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                f0 f0Var = this.b.get(size);
                if (f0Var.k() == j && !f0Var.N()) {
                    if (i == f0Var.l()) {
                        f0Var.b(32);
                        if (f0Var.w() && !RecyclerView.this.D1.j()) {
                            f0Var.G(2, 14);
                        }
                        return f0Var;
                    } else if (!z) {
                        this.b.remove(size);
                        RecyclerView.this.removeDetachedView(f0Var.p, false);
                        z(f0Var.p);
                    }
                }
            }
            int size2 = this.d.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                f0 f0Var2 = this.d.get(size2);
                if (f0Var2.k() == j && !f0Var2.s()) {
                    if (i == f0Var2.l()) {
                        if (!z) {
                            this.d.remove(size2);
                        }
                        return f0Var2;
                    } else if (!z) {
                        B(size2);
                        return null;
                    }
                }
            }
        }

        public f0 n(int i, boolean z) {
            View e;
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                f0 f0Var = this.b.get(i2);
                if (!f0Var.N() && f0Var.m() == i && !f0Var.u() && (RecyclerView.this.D1.k || !f0Var.w())) {
                    f0Var.b(32);
                    return f0Var;
                }
            }
            if (!z && (e = RecyclerView.this.D0.e(i)) != null) {
                f0 s0 = RecyclerView.s0(e);
                RecyclerView.this.D0.s(e);
                int m = RecyclerView.this.D0.m(e);
                if (m != -1) {
                    RecyclerView.this.D0.d(m);
                    E(e);
                    s0.b(8224);
                    return s0;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("layout index should not be -1 after unhiding a view:");
                sb.append(s0);
                throw new IllegalStateException(wo1.k(RecyclerView.this, sb));
            }
            int size2 = this.d.size();
            for (int i3 = 0; i3 < size2; i3++) {
                f0 f0Var2 = this.d.get(i3);
                if (!f0Var2.u() && f0Var2.m() == i && !f0Var2.s()) {
                    if (!z) {
                        this.d.remove(i3);
                    }
                    return f0Var2;
                }
            }
            return null;
        }

        public View o(int i) {
            return this.b.get(i).p;
        }

        @x1
        public View p(int i) {
            return q(i, false);
        }

        public View q(int i, boolean z) {
            return J(i, z, Long.MAX_VALUE).p;
        }

        public void t() {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                p pVar = (p) this.d.get(i).p.getLayoutParams();
                if (pVar != null) {
                    pVar.c = true;
                }
            }
        }

        public void u() {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                f0 f0Var = this.d.get(i);
                if (f0Var != null) {
                    f0Var.b(6);
                    f0Var.a(null);
                }
            }
            g gVar = RecyclerView.this.K0;
            if (gVar == null || !gVar.i()) {
                A();
            }
        }

        public void v(int i, int i2) {
            int size = this.d.size();
            for (int i3 = 0; i3 < size; i3++) {
                f0 f0Var = this.d.get(i3);
                if (f0Var != null && f0Var.r >= i) {
                    f0Var.B(i2, true);
                }
            }
        }

        public void w(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.d.size();
            for (int i7 = 0; i7 < size; i7++) {
                f0 f0Var = this.d.get(i7);
                if (f0Var != null && (i6 = f0Var.r) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        f0Var.B(i2 - i, false);
                    } else {
                        f0Var.B(i3, false);
                    }
                }
            }
        }

        public void x(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.d.size() - 1; size >= 0; size--) {
                f0 f0Var = this.d.get(size);
                if (f0Var != null) {
                    int i4 = f0Var.r;
                    if (i4 >= i3) {
                        f0Var.B(-i2, z);
                    } else if (i4 >= i) {
                        f0Var.b(8);
                        B(size);
                    }
                }
            }
        }

        public void y(g gVar, g gVar2, boolean z) {
            d();
            j().i(gVar, gVar2, z);
        }

        public void z(View view) {
            f0 s0 = RecyclerView.s0(view);
            s0.C = null;
            s0.D = false;
            s0.e();
            D(s0);
        }
    }

    /* loaded from: classes.dex */
    public interface x {
        void a(@x1 f0 f0Var);
    }

    /* loaded from: classes.dex */
    public class y extends i {
        public y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            RecyclerView.this.v(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.D1.j = true;
            recyclerView.h1(true);
            if (RecyclerView.this.C0.q()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.v(null);
            if (RecyclerView.this.C0.s(i, i2, obj)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void d(int i, int i2) {
            RecyclerView.this.v(null);
            if (RecyclerView.this.C0.t(i, i2)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void e(int i, int i2, int i3) {
            RecyclerView.this.v(null);
            if (RecyclerView.this.C0.u(i, i2, i3)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void f(int i, int i2) {
            RecyclerView.this.v(null);
            if (RecyclerView.this.C0.v(i, i2)) {
                g();
            }
        }

        public void g() {
            if (RecyclerView.y) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.R0 && recyclerView.Q0) {
                    sr.o1(recyclerView, recyclerView.G0);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.Z0 = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        w = false;
        x = i2 >= 23;
        y = true;
        z = true;
        A = false;
        B = false;
        Class<?> cls = Integer.TYPE;
        V = new Class[]{Context.class, AttributeSet.class, cls, cls};
        y0 = new c();
    }

    public RecyclerView(@x1 Context context) {
        this(context, null);
    }

    private boolean C0() {
        int g2 = this.D0.g();
        for (int i2 = 0; i2 < g2; i2++) {
            f0 s0 = s0(this.D0.f(i2));
            if (s0 != null && !s0.K() && s0.z()) {
                return true;
            }
        }
        return false;
    }

    private void C1(@z1 g gVar, boolean z2, boolean z3) {
        g gVar2 = this.K0;
        if (gVar2 != null) {
            gVar2.E(this.z0);
            this.K0.x(this);
        }
        if (!z2 || z3) {
            m1();
        }
        this.C0.z();
        g gVar3 = this.K0;
        this.K0 = gVar;
        if (gVar != null) {
            gVar.C(this.z0);
            gVar.t(this);
        }
        o oVar = this.L0;
        if (oVar != null) {
            oVar.V0(gVar3, this.K0);
        }
        this.A0.y(gVar3, this.K0, z2);
        this.D1.j = true;
    }

    private void E(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        ClassLoader classLoader;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String w02 = w0(context, trim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(w02, false, classLoader).asSubclass(o.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(V);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + w02, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + w02, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + w02, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + w02, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + w02, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + w02, e8);
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    private void E0() {
        if (sr.V(this) == 0) {
            sr.R1(this, 8);
        }
    }

    private void F0() {
        this.D0 = new v20(new e());
    }

    private boolean G(int i2, int i3) {
        c0(this.M1);
        int[] iArr = this.M1;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void J() {
        int i2 = this.Y0;
        this.Y0 = 0;
        if (i2 == 0 || !J0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        js.i(obtain, i2);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void L() {
        boolean z2 = true;
        this.D1.a(1);
        X(this.D1);
        this.D1.m = false;
        K1();
        this.E0.f();
        Y0();
        g1();
        x1();
        c0 c0Var = this.D1;
        c0Var.l = (c0Var.n && this.H1) ? false : false;
        this.H1 = false;
        this.G1 = false;
        c0Var.k = c0Var.o;
        c0Var.i = this.K0.e();
        c0(this.M1);
        if (this.D1.n) {
            int g2 = this.D0.g();
            for (int i2 = 0; i2 < g2; i2++) {
                f0 s0 = s0(this.D0.f(i2));
                if (!s0.K() && (!s0.u() || this.K0.i())) {
                    this.E0.e(s0, this.l1.w(this.D1, s0, l.e(s0), s0.p()));
                    if (this.D1.l && s0.z() && !s0.w() && !s0.K() && !s0.u()) {
                        this.E0.c(m0(s0), s0);
                    }
                }
            }
        }
        if (this.D1.o) {
            y1();
            c0 c0Var2 = this.D1;
            boolean z3 = c0Var2.j;
            c0Var2.j = false;
            this.L0.o1(this.A0, c0Var2);
            this.D1.j = z3;
            for (int i3 = 0; i3 < this.D0.g(); i3++) {
                f0 s02 = s0(this.D0.f(i3));
                if (!s02.K() && !this.E0.i(s02)) {
                    int e2 = l.e(s02);
                    boolean q2 = s02.q(8192);
                    if (!q2) {
                        e2 |= 4096;
                    }
                    l.d w2 = this.l1.w(this.D1, s02, e2, s02.p());
                    if (q2) {
                        j1(s02, w2);
                    } else {
                        this.E0.a(s02, w2);
                    }
                }
            }
            z();
        } else {
            z();
        }
        Z0();
        L1(false);
        this.D1.h = 2;
    }

    private void M() {
        K1();
        Y0();
        this.D1.a(6);
        this.C0.k();
        this.D1.i = this.K0.e();
        c0 c0Var = this.D1;
        c0Var.g = 0;
        c0Var.k = false;
        this.L0.o1(this.A0, c0Var);
        c0 c0Var2 = this.D1;
        c0Var2.j = false;
        this.B0 = null;
        c0Var2.n = c0Var2.n && this.l1 != null;
        c0Var2.h = 4;
        Z0();
        L1(false);
    }

    private void N() {
        this.D1.a(4);
        K1();
        Y0();
        c0 c0Var = this.D1;
        c0Var.h = 1;
        if (c0Var.n) {
            for (int g2 = this.D0.g() - 1; g2 >= 0; g2--) {
                f0 s0 = s0(this.D0.f(g2));
                if (!s0.K()) {
                    long m0 = m0(s0);
                    l.d v2 = this.l1.v(this.D1, s0);
                    f0 g3 = this.E0.g(m0);
                    if (g3 != null && !g3.K()) {
                        boolean h2 = this.E0.h(g3);
                        boolean h3 = this.E0.h(s0);
                        if (h2 && g3 == s0) {
                            this.E0.d(s0, v2);
                        } else {
                            l.d n2 = this.E0.n(g3);
                            this.E0.d(s0, v2);
                            l.d m2 = this.E0.m(s0);
                            if (n2 == null) {
                                z0(m0, s0, g3);
                            } else {
                                s(g3, s0, n2, m2, h2, h3);
                            }
                        }
                    } else {
                        this.E0.d(s0, v2);
                    }
                }
            }
            this.E0.o(this.T1);
        }
        this.L0.E1(this.A0);
        c0 c0Var2 = this.D1;
        c0Var2.f = c0Var2.i;
        this.c1 = false;
        this.d1 = false;
        c0Var2.n = false;
        c0Var2.o = false;
        this.L0.h = false;
        ArrayList<f0> arrayList = this.A0.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.L0;
        if (oVar.n) {
            oVar.m = 0;
            oVar.n = false;
            this.A0.L();
        }
        this.L0.p1(this.D1);
        Z0();
        L1(false);
        this.E0.f();
        int[] iArr = this.M1;
        if (G(iArr[0], iArr[1])) {
            P(0, 0);
        }
        k1();
        v1();
    }

    private boolean N0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || Z(view2) == null) {
            return false;
        }
        if (view == null || Z(view) == null) {
            return true;
        }
        this.H0.set(0, 0, view.getWidth(), view.getHeight());
        this.I0.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.H0);
        offsetDescendantRectToMyCoords(view2, this.I0);
        char c2 = 65535;
        int i4 = this.L0.i0() == 1 ? -1 : 1;
        Rect rect = this.H0;
        int i5 = rect.left;
        Rect rect2 = this.I0;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 <= 0);
        } else if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 >= 0);
        } else if (i2 == 17) {
            return i3 < 0;
        } else if (i2 == 33) {
            return c2 < 0;
        } else if (i2 == 66) {
            return i3 > 0;
        } else if (i2 == 130) {
            return c2 > 0;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid direction: ");
            sb.append(i2);
            throw new IllegalArgumentException(wo1.k(this, sb));
        }
    }

    private void N1() {
        this.A1.g();
        o oVar = this.L0;
        if (oVar != null) {
            oVar.i2();
        }
    }

    private boolean R(MotionEvent motionEvent) {
        s sVar = this.P0;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return b0(motionEvent);
        }
        sVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.P0 = null;
        }
        return true;
    }

    private boolean b0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.O0.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = this.O0.get(i2);
            if (sVar.c(this, motionEvent) && action != 3) {
                this.P0 = sVar;
                return true;
            }
        }
        return false;
    }

    private void b1(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.n1) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.n1 = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.r1 = x2;
            this.p1 = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.s1 = y2;
            this.q1 = y2;
        }
    }

    private void c0(int[] iArr) {
        int g2 = this.D0.g();
        if (g2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < g2; i4++) {
            f0 s0 = s0(this.D0.f(i4));
            if (!s0.K()) {
                int m2 = s0.m();
                if (m2 < i2) {
                    i2 = m2;
                }
                if (m2 > i3) {
                    i3 = m2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    @z1
    public static RecyclerView d0(@x1 View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView d02 = d0(viewGroup.getChildAt(i2));
                if (d02 != null) {
                    return d02;
                }
            }
            return null;
        }
        return null;
    }

    @z1
    private View e0() {
        f0 f02;
        c0 c0Var = this.D1;
        int i2 = c0Var.p;
        if (i2 == -1) {
            i2 = 0;
        }
        int d2 = c0Var.d();
        for (int i3 = i2; i3 < d2; i3++) {
            f0 f03 = f0(i3);
            if (f03 == null) {
                break;
            } else if (f03.p.hasFocusable()) {
                return f03.p;
            }
        }
        int min = Math.min(d2, i2);
        while (true) {
            min--;
            if (min < 0 || (f02 = f0(min)) == null) {
                return null;
            }
            if (f02.p.hasFocusable()) {
                return f02.p;
            }
        }
    }

    private boolean f1() {
        return this.l1 != null && this.L0.j2();
    }

    private void g1() {
        boolean z2;
        if (this.c1) {
            this.C0.z();
            if (this.d1) {
                this.L0.j1(this);
            }
        }
        if (f1()) {
            this.C0.x();
        } else {
            this.C0.k();
        }
        boolean z3 = false;
        boolean z4 = this.G1 || this.H1;
        this.D1.n = this.T0 && this.l1 != null && ((z2 = this.c1) || z4 || this.L0.h) && (!z2 || this.K0.i());
        c0 c0Var = this.D1;
        if (c0Var.n && z4 && !this.c1 && f1()) {
            z3 = true;
        }
        c0Var.o = z3;
    }

    private er getScrollingChildHelper() {
        if (this.N1 == null) {
            this.N1 = new er(this);
        }
        return this.N1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i1(float f2, float f3, float f4, float f5) {
        boolean z2;
        boolean z3 = true;
        if (f3 < 0.0f) {
            T();
            ft.g(this.h1, (-f3) / getWidth(), 1.0f - (f4 / getHeight()));
        } else if (f3 <= 0.0f) {
            z2 = false;
            if (f5 >= 0.0f) {
                V();
                ft.g(this.i1, (-f5) / getHeight(), f2 / getWidth());
            } else if (f5 > 0.0f) {
                S();
                ft.g(this.k1, f5 / getHeight(), 1.0f - (f2 / getWidth()));
            } else {
                z3 = z2;
            }
            if (z3 && f3 == 0.0f && f5 == 0.0f) {
                return;
            }
            sr.m1(this);
        } else {
            U();
            ft.g(this.j1, f3 / getWidth(), f4 / getHeight());
        }
        z2 = true;
        if (f5 >= 0.0f) {
        }
        if (z3) {
        }
        sr.m1(this);
    }

    private void k1() {
        View findViewById;
        if (!this.z1 || this.K0 == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (B && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (this.D0.g() == 0) {
                    requestFocus();
                    return;
                }
            } else if (!this.D0.n(focusedChild)) {
                return;
            }
        }
        View view = null;
        f0 g0 = (this.D1.q == -1 || !this.K0.i()) ? null : g0(this.D1.q);
        if (g0 != null && !this.D0.n(g0.p) && g0.p.hasFocusable()) {
            view = g0.p;
        } else if (this.D0.g() > 0) {
            view = e0();
        }
        if (view != null) {
            int i2 = this.D1.r;
            if (i2 != -1 && (findViewById = view.findViewById(i2)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void l(f0 f0Var) {
        View view = f0Var.p;
        boolean z2 = view.getParent() == this;
        this.A0.K(r0(view));
        if (f0Var.y()) {
            this.D0.c(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.D0.b(view, true);
        } else {
            this.D0.k(view);
        }
    }

    private void l1() {
        boolean z2;
        EdgeEffect edgeEffect = this.h1;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.h1.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.i1;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.i1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.j1;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.j1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.k1;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.k1.isFinished();
        }
        if (z2) {
            sr.m1(this);
        }
    }

    private void s(@x1 f0 f0Var, @x1 f0 f0Var2, @x1 l.d dVar, @x1 l.d dVar2, boolean z2, boolean z3) {
        f0Var.H(false);
        if (z2) {
            l(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z3) {
                l(f0Var2);
            }
            f0Var.w = f0Var2;
            l(f0Var);
            this.A0.K(f0Var);
            f0Var2.H(false);
            f0Var2.x = f0Var;
        }
        if (this.l1.b(f0Var, f0Var2, dVar, dVar2)) {
            e1();
        }
    }

    public static f0 s0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).a;
    }

    public static void u0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private void u1(@x1 View view, @z1 View view2) {
        View view3 = view2 != null ? view2 : view;
        this.H0.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.c) {
                Rect rect = pVar.b;
                Rect rect2 = this.H0;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.H0);
            offsetRectIntoDescendantCoords(view, this.H0);
        }
        this.L0.M1(this, view, this.H0, !this.T0, view2 == null);
    }

    private int v0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private void v1() {
        c0 c0Var = this.D1;
        c0Var.q = -1L;
        c0Var.p = -1;
        c0Var.r = -1;
    }

    private String w0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(CryptoConstants.ALIAS_SEPARATOR)) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private void w1() {
        VelocityTracker velocityTracker = this.o1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        f(0);
        l1();
    }

    private void x() {
        w1();
        setScrollState(0);
    }

    private void x1() {
        int j2;
        View focusedChild = (this.z1 && hasFocus() && this.K0 != null) ? getFocusedChild() : null;
        f0 a02 = focusedChild != null ? a0(focusedChild) : null;
        if (a02 == null) {
            v1();
            return;
        }
        this.D1.q = this.K0.i() ? a02.k() : -1L;
        c0 c0Var = this.D1;
        if (this.c1) {
            j2 = -1;
        } else {
            j2 = a02.w() ? a02.s : a02.j();
        }
        c0Var.p = j2;
        this.D1.r = v0(a02.p);
    }

    public static void y(@x1 f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.q;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f0Var.p) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            f0Var.q = null;
        }
    }

    private void z0(long j2, f0 f0Var, f0 f0Var2) {
        int g2 = this.D0.g();
        for (int i2 = 0; i2 < g2; i2++) {
            f0 s0 = s0(this.D0.f(i2));
            if (s0 != f0Var && m0(s0) == j2) {
                g gVar = this.K0;
                if (gVar != null && gVar.i()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                    sb.append(s0);
                    sb.append(" \n View Holder 2:");
                    sb.append(f0Var);
                    throw new IllegalStateException(wo1.k(this, sb));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sb2.append(s0);
                sb2.append(" \n View Holder 2:");
                sb2.append(f0Var);
                throw new IllegalStateException(wo1.k(this, sb2));
            }
        }
        String str = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f0Var2 + " cannot be found but it is necessary for " + f0Var + W();
    }

    public void A() {
        List<q> list = this.b1;
        if (list != null) {
            list.clear();
        }
    }

    public boolean A0() {
        return this.R0;
    }

    public void A1(int i2, int i3, @z1 int[] iArr) {
        K1();
        Y0();
        in.b(N);
        X(this.D1);
        int Q1 = i2 != 0 ? this.L0.Q1(i2, this.A0, this.D1) : 0;
        int S1 = i3 != 0 ? this.L0.S1(i3, this.A0, this.D1) : 0;
        in.d();
        t1();
        Z0();
        L1(false);
        if (iArr != null) {
            iArr[0] = Q1;
            iArr[1] = S1;
        }
    }

    public void B() {
        List<t> list = this.F1;
        if (list != null) {
            list.clear();
        }
    }

    public boolean B0() {
        return !this.T0 || this.c1 || this.C0.q();
    }

    public void B1(int i2) {
        if (this.W0) {
            return;
        }
        M1();
        o oVar = this.L0;
        if (oVar == null) {
            return;
        }
        oVar.R1(i2);
        awakenScrollBars();
    }

    public void C(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.h1;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.h1.onRelease();
            z2 = this.h1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.j1;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.j1.onRelease();
            z2 |= this.j1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.i1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.i1.onRelease();
            z2 |= this.i1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.k1;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.k1.onRelease();
            z2 |= this.k1.isFinished();
        }
        if (z2) {
            sr.m1(this);
        }
    }

    public void D() {
        if (this.T0 && !this.c1) {
            if (this.C0.q()) {
                if (this.C0.p(4) && !this.C0.p(11)) {
                    in.b(Q);
                    K1();
                    Y0();
                    this.C0.x();
                    if (!this.V0) {
                        if (C0()) {
                            K();
                        } else {
                            this.C0.j();
                        }
                    }
                    L1(true);
                    Z0();
                    in.d();
                    return;
                } else if (this.C0.q()) {
                    in.b(P);
                    K();
                    in.d();
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        in.b(P);
        K();
        in.d();
    }

    public void D0() {
        this.C0 = new p20(new f());
    }

    @r2
    public boolean D1(f0 f0Var, int i2) {
        if (L0()) {
            f0Var.F = i2;
            this.R1.add(f0Var);
            return false;
        }
        sr.Q1(f0Var.p, i2);
        return true;
    }

    public boolean E1(AccessibilityEvent accessibilityEvent) {
        if (L0()) {
            int d2 = accessibilityEvent != null ? js.d(accessibilityEvent) : 0;
            this.Y0 |= d2 != 0 ? d2 : 0;
            return true;
        }
        return false;
    }

    public void F(int i2, int i3) {
        setMeasuredDimension(o.q(i2, getPaddingRight() + getPaddingLeft(), sr.e0(this)), o.q(i3, getPaddingBottom() + getPaddingTop(), sr.d0(this)));
    }

    public void F1(@c2 int i2, @c2 int i3) {
        G1(i2, i3, null);
    }

    @r2
    public void G0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new z20(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(o20.c.h), resources.getDimensionPixelSize(o20.c.j), resources.getDimensionPixelOffset(o20.c.i));
            return;
        }
        throw new IllegalArgumentException(wo1.k(this, wo1.G("Trying to set fast scroller without both required drawables.")));
    }

    public void G1(@c2 int i2, @c2 int i3, @z1 Interpolator interpolator) {
        H1(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    public void H(View view) {
        f0 s0 = s0(view);
        W0(view);
        g gVar = this.K0;
        if (gVar != null && s0 != null) {
            gVar.z(s0);
        }
        List<q> list = this.b1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.b1.get(size).d(view);
            }
        }
    }

    public void H0() {
        this.k1 = null;
        this.i1 = null;
        this.j1 = null;
        this.h1 = null;
    }

    public void H1(@c2 int i2, @c2 int i3, @z1 Interpolator interpolator, int i4) {
        I1(i2, i3, interpolator, i4, false);
    }

    public void I(View view) {
        f0 s0 = s0(view);
        X0(view);
        g gVar = this.K0;
        if (gVar != null && s0 != null) {
            gVar.A(s0);
        }
        List<q> list = this.b1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.b1.get(size).b(view);
            }
        }
    }

    public void I0() {
        if (this.N0.size() == 0) {
            return;
        }
        o oVar = this.L0;
        if (oVar != null) {
            oVar.i("Cannot invalidate item decorations during a scroll or layout");
        }
        P0();
        requestLayout();
    }

    public void I1(@c2 int i2, @c2 int i3, @z1 Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.L0;
        if (oVar == null || this.W0) {
            return;
        }
        if (!oVar.n()) {
            i2 = 0;
        }
        if (!this.L0.o()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (i4 == Integer.MIN_VALUE || i4 > 0) {
            if (z2) {
                int i5 = i2 != 0 ? 1 : 0;
                if (i3 != 0) {
                    i5 |= 2;
                }
                e(i5, 1);
            }
            this.A1.f(i2, i3, i4, interpolator);
            return;
        }
        scrollBy(i2, i3);
    }

    public boolean J0() {
        AccessibilityManager accessibilityManager = this.a1;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void J1(int i2) {
        o oVar;
        if (this.W0 || (oVar = this.L0) == null) {
            return;
        }
        oVar.f2(this, this.D1, i2);
    }

    public void K() {
        if (this.K0 == null || this.L0 == null) {
            return;
        }
        c0 c0Var = this.D1;
        c0Var.m = false;
        if (c0Var.h == 1) {
            L();
            this.L0.U1(this);
            M();
        } else if (!this.C0.r() && this.L0.z0() == getWidth() && this.L0.e0() == getHeight()) {
            this.L0.U1(this);
        } else {
            this.L0.U1(this);
            M();
        }
        N();
    }

    public boolean K0() {
        l lVar = this.l1;
        return lVar != null && lVar.q();
    }

    public void K1() {
        int i2 = this.U0 + 1;
        this.U0 = i2;
        if (i2 != 1 || this.W0) {
            return;
        }
        this.V0 = false;
    }

    public boolean L0() {
        return this.e1 > 0;
    }

    public void L1(boolean z2) {
        if (this.U0 < 1) {
            this.U0 = 1;
        }
        if (!z2 && !this.W0) {
            this.V0 = false;
        }
        if (this.U0 == 1) {
            if (z2 && this.V0 && !this.W0 && this.L0 != null && this.K0 != null) {
                K();
            }
            if (!this.W0) {
                this.V0 = false;
            }
        }
        this.U0--;
    }

    @Deprecated
    public boolean M0() {
        return isLayoutSuppressed();
    }

    public void M1() {
        setScrollState(0);
        N1();
    }

    public void O(int i2) {
        o oVar = this.L0;
        if (oVar != null) {
            oVar.v1(i2);
        }
        c1(i2);
        t tVar = this.E1;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        List<t> list = this.F1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.F1.get(size).a(this, i2);
            }
        }
    }

    public void O0(int i2) {
        if (this.L0 == null) {
            return;
        }
        setScrollState(2);
        this.L0.R1(i2);
        awakenScrollBars();
    }

    public void O1(@z1 g gVar, boolean z2) {
        setLayoutFrozen(false);
        C1(gVar, true, z2);
        h1(true);
        requestLayout();
    }

    public void P(int i2, int i3) {
        this.f1++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        d1(i2, i3);
        t tVar = this.E1;
        if (tVar != null) {
            tVar.b(this, i2, i3);
        }
        List<t> list = this.F1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.F1.get(size).b(this, i2, i3);
            }
        }
        this.f1--;
    }

    public void P0() {
        int j2 = this.D0.j();
        for (int i2 = 0; i2 < j2; i2++) {
            ((p) this.D0.i(i2).getLayoutParams()).c = true;
        }
        this.A0.t();
    }

    public void P1(int i2, int i3, Object obj) {
        int i4;
        int j2 = this.D0.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < j2; i6++) {
            View i7 = this.D0.i(i6);
            f0 s0 = s0(i7);
            if (s0 != null && !s0.K() && (i4 = s0.r) >= i2 && i4 < i5) {
                s0.b(2);
                s0.a(obj);
                ((p) i7.getLayoutParams()).c = true;
            }
        }
        this.A0.N(i2, i3);
    }

    public void Q() {
        int i2;
        for (int size = this.R1.size() - 1; size >= 0; size--) {
            f0 f0Var = this.R1.get(size);
            if (f0Var.p.getParent() == this && !f0Var.K() && (i2 = f0Var.F) != -1) {
                sr.Q1(f0Var.p, i2);
                f0Var.F = -1;
            }
        }
        this.R1.clear();
    }

    public void Q0() {
        int j2 = this.D0.j();
        for (int i2 = 0; i2 < j2; i2++) {
            f0 s0 = s0(this.D0.i(i2));
            if (s0 != null && !s0.K()) {
                s0.b(6);
            }
        }
        P0();
        this.A0.u();
    }

    public void R0(@c2 int i2) {
        int g2 = this.D0.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.D0.f(i3).offsetLeftAndRight(i2);
        }
    }

    public void S() {
        if (this.k1 != null) {
            return;
        }
        EdgeEffect a2 = this.g1.a(this, 3);
        this.k1 = a2;
        if (this.F0) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void S0(@c2 int i2) {
        int g2 = this.D0.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.D0.f(i3).offsetTopAndBottom(i2);
        }
    }

    public void T() {
        if (this.h1 != null) {
            return;
        }
        EdgeEffect a2 = this.g1.a(this, 0);
        this.h1 = a2;
        if (this.F0) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void T0(int i2, int i3) {
        int j2 = this.D0.j();
        for (int i4 = 0; i4 < j2; i4++) {
            f0 s0 = s0(this.D0.i(i4));
            if (s0 != null && !s0.K() && s0.r >= i2) {
                s0.B(i3, false);
                this.D1.j = true;
            }
        }
        this.A0.v(i2, i3);
        requestLayout();
    }

    public void U() {
        if (this.j1 != null) {
            return;
        }
        EdgeEffect a2 = this.g1.a(this, 2);
        this.j1 = a2;
        if (this.F0) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void U0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int j2 = this.D0.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < j2; i8++) {
            f0 s0 = s0(this.D0.i(i8));
            if (s0 != null && (i7 = s0.r) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    s0.B(i3 - i2, false);
                } else {
                    s0.B(i6, false);
                }
                this.D1.j = true;
            }
        }
        this.A0.w(i2, i3);
        requestLayout();
    }

    public void V() {
        if (this.i1 != null) {
            return;
        }
        EdgeEffect a2 = this.g1.a(this, 1);
        this.i1 = a2;
        if (this.F0) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void V0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int j2 = this.D0.j();
        for (int i5 = 0; i5 < j2; i5++) {
            f0 s0 = s0(this.D0.i(i5));
            if (s0 != null && !s0.K()) {
                int i6 = s0.r;
                if (i6 >= i4) {
                    s0.B(-i3, z2);
                    this.D1.j = true;
                } else if (i6 >= i2) {
                    s0.i(i2 - 1, -i3, z2);
                    this.D1.j = true;
                }
            }
        }
        this.A0.x(i2, i3, z2);
        requestLayout();
    }

    public String W() {
        StringBuilder G2 = wo1.G(" ");
        G2.append(super.toString());
        G2.append(", adapter:");
        G2.append(this.K0);
        G2.append(", layout:");
        G2.append(this.L0);
        G2.append(", context:");
        G2.append(getContext());
        return G2.toString();
    }

    public void W0(@x1 View view) {
    }

    public final void X(c0 c0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A1.u;
            c0Var.s = overScroller.getFinalX() - overScroller.getCurrX();
            c0Var.t = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        c0Var.s = 0;
        c0Var.t = 0;
    }

    public void X0(@x1 View view) {
    }

    @z1
    public View Y(float f2, float f3) {
        for (int g2 = this.D0.g() - 1; g2 >= 0; g2--) {
            View f4 = this.D0.f(g2);
            float translationX = f4.getTranslationX();
            float translationY = f4.getTranslationY();
            if (f2 >= f4.getLeft() + translationX && f2 <= f4.getRight() + translationX && f3 >= f4.getTop() + translationY && f3 <= f4.getBottom() + translationY) {
                return f4;
            }
        }
        return null;
    }

    public void Y0() {
        this.e1++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View Z(@x1 View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        return null;
    }

    public void Z0() {
        a1(true);
    }

    @Override // com.p7700g.p99005.br
    public boolean a(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().g(i2, i3, i4, i5, iArr, i6);
    }

    @z1
    public f0 a0(@x1 View view) {
        View Z = Z(view);
        if (Z == null) {
            return null;
        }
        return r0(Z);
    }

    public void a1(boolean z2) {
        int i2 = this.e1 - 1;
        this.e1 = i2;
        if (i2 < 1) {
            this.e1 = 0;
            if (z2) {
                J();
                Q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.L0;
        if (oVar == null || !oVar.W0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    @Override // com.p7700g.p99005.br
    public boolean b(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    @Override // com.p7700g.p99005.cr
    public final void c(int i2, int i3, int i4, int i5, int[] iArr, int i6, @x1 int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void c1(int i2) {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.L0.p((p) layoutParams);
    }

    @Override // android.view.View, com.p7700g.p99005.pr
    public int computeHorizontalScrollExtent() {
        o oVar = this.L0;
        if (oVar != null && oVar.n()) {
            return this.L0.t(this.D1);
        }
        return 0;
    }

    @Override // android.view.View, com.p7700g.p99005.pr
    public int computeHorizontalScrollOffset() {
        o oVar = this.L0;
        if (oVar != null && oVar.n()) {
            return this.L0.u(this.D1);
        }
        return 0;
    }

    @Override // android.view.View, com.p7700g.p99005.pr
    public int computeHorizontalScrollRange() {
        o oVar = this.L0;
        if (oVar != null && oVar.n()) {
            return this.L0.v(this.D1);
        }
        return 0;
    }

    @Override // android.view.View, com.p7700g.p99005.pr
    public int computeVerticalScrollExtent() {
        o oVar = this.L0;
        if (oVar != null && oVar.o()) {
            return this.L0.w(this.D1);
        }
        return 0;
    }

    @Override // android.view.View, com.p7700g.p99005.pr
    public int computeVerticalScrollOffset() {
        o oVar = this.L0;
        if (oVar != null && oVar.o()) {
            return this.L0.x(this.D1);
        }
        return 0;
    }

    @Override // android.view.View, com.p7700g.p99005.pr
    public int computeVerticalScrollRange() {
        o oVar = this.L0;
        if (oVar != null && oVar.o()) {
            return this.L0.y(this.D1);
        }
        return 0;
    }

    @Override // com.p7700g.p99005.br
    public boolean d(int i2) {
        return getScrollingChildHelper().l(i2);
    }

    public void d1(@c2 int i2, @c2 int i3) {
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.N0.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.N0.get(i2).k(canvas, this, this.D1);
        }
        EdgeEffect edgeEffect = this.h1;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.F0 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.h1;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.i1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.F0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.i1;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.j1;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.F0 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.j1;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.k1;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.F0) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.k1;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.l1 == null || this.N0.size() <= 0 || !this.l1.q()) {
            z4 = z2;
        }
        if (z4) {
            sr.m1(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    @Override // com.p7700g.p99005.br
    public boolean e(int i2, int i3) {
        return getScrollingChildHelper().s(i2, i3);
    }

    public void e1() {
        if (this.J1 || !this.Q0) {
            return;
        }
        sr.o1(this, this.S1);
        this.J1 = true;
    }

    @Override // com.p7700g.p99005.br
    public void f(int i2) {
        getScrollingChildHelper().u(i2);
    }

    @z1
    public f0 f0(int i2) {
        f0 f0Var = null;
        if (this.c1) {
            return null;
        }
        int j2 = this.D0.j();
        for (int i3 = 0; i3 < j2; i3++) {
            f0 s0 = s0(this.D0.i(i3));
            if (s0 != null && !s0.w() && l0(s0) == i2) {
                if (!this.D0.n(s0.p)) {
                    return s0;
                }
                f0Var = s0;
            }
        }
        return f0Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View h1 = this.L0.h1(view, i2);
        if (h1 != null) {
            return h1;
        }
        boolean z3 = (this.K0 == null || this.L0 == null || L0() || this.W0) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.L0.o()) {
                int i3 = i2 == 2 ? WKSRecord.Service.CISCO_FNA : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (A) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.L0.n()) {
                int i4 = (this.L0.i0() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (A) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                D();
                if (Z(view) == null) {
                    return null;
                }
                K1();
                this.L0.a1(view, i2, this.A0, this.D1);
                L1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus == null && z3) {
                D();
                if (Z(view) == null) {
                    return null;
                }
                K1();
                view2 = this.L0.a1(view, i2, this.A0, this.D1);
                L1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return N0(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        } else {
            u1(view2, null);
            return view;
        }
    }

    public void g(int i2, int i3) {
        if (i2 < 0) {
            T();
            if (this.h1.isFinished()) {
                this.h1.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            U();
            if (this.j1.isFinished()) {
                this.j1.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            V();
            if (this.i1.isFinished()) {
                this.i1.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            S();
            if (this.k1.isFinished()) {
                this.k1.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        sr.m1(this);
    }

    public f0 g0(long j2) {
        g gVar = this.K0;
        f0 f0Var = null;
        if (gVar != null && gVar.i()) {
            int j3 = this.D0.j();
            for (int i2 = 0; i2 < j3; i2++) {
                f0 s0 = s0(this.D0.i(i2));
                if (s0 != null && !s0.w() && s0.k() == j2) {
                    if (!this.D0.n(s0.p)) {
                        return s0;
                    }
                    f0Var = s0;
                }
            }
        }
        return f0Var;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.L0;
        if (oVar != null) {
            return oVar.K();
        }
        throw new IllegalStateException(wo1.k(this, wo1.G("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.L0;
        if (oVar != null) {
            return oVar.L(getContext(), attributeSet);
        }
        throw new IllegalStateException(wo1.k(this, wo1.G("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @z1
    public g getAdapter() {
        return this.K0;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.L0;
        if (oVar != null) {
            return oVar.N();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.L1;
        if (jVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        return jVar.a(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.F0;
    }

    @z1
    public n30 getCompatAccessibilityDelegate() {
        return this.K1;
    }

    @x1
    public k getEdgeEffectFactory() {
        return this.g1;
    }

    @z1
    public l getItemAnimator() {
        return this.l1;
    }

    public int getItemDecorationCount() {
        return this.N0.size();
    }

    @z1
    public o getLayoutManager() {
        return this.L0;
    }

    public int getMaxFlingVelocity() {
        return this.w1;
    }

    public int getMinFlingVelocity() {
        return this.v1;
    }

    public long getNanoTime() {
        if (z) {
            return System.nanoTime();
        }
        return 0L;
    }

    @z1
    public r getOnFlingListener() {
        return this.u1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.z1;
    }

    @x1
    public v getRecycledViewPool() {
        return this.A0.j();
    }

    public int getScrollState() {
        return this.m1;
    }

    @z1
    public f0 h0(int i2) {
        return j0(i2, false);
    }

    public void h1(boolean z2) {
        this.d1 = z2 | this.d1;
        this.c1 = true;
        Q0();
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    @z1
    @Deprecated
    public f0 i0(int i2) {
        return j0(i2, false);
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.Q0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.W0;
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f0 j0(int i2, boolean z2) {
        int j2 = this.D0.j();
        f0 f0Var = null;
        for (int i3 = 0; i3 < j2; i3++) {
            f0 s0 = s0(this.D0.i(i3));
            if (s0 != null && !s0.w()) {
                if (z2) {
                    if (s0.r != i2) {
                        continue;
                    }
                    if (this.D0.n(s0.p)) {
                        return s0;
                    }
                    f0Var = s0;
                } else {
                    if (s0.m() != i2) {
                        continue;
                    }
                    if (this.D0.n(s0.p)) {
                    }
                }
            }
        }
        return f0Var;
    }

    public void j1(f0 f0Var, l.d dVar) {
        f0Var.G(0, 8192);
        if (this.D1.l && f0Var.z() && !f0Var.w() && !f0Var.K()) {
            this.E0.c(m0(f0Var), f0Var);
        }
        this.E0.e(f0Var, dVar);
    }

    public boolean k0(int i2, int i3) {
        o oVar = this.L0;
        if (oVar == null || this.W0) {
            return false;
        }
        boolean n2 = oVar.n();
        boolean o2 = this.L0.o();
        i2 = (!n2 || Math.abs(i2) < this.v1) ? 0 : 0;
        i3 = (!o2 || Math.abs(i3) < this.v1) ? 0 : 0;
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = i2;
        float f3 = i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = n2 || o2;
            dispatchNestedFling(f2, f3, z2);
            r rVar = this.u1;
            if (rVar != null && rVar.a(i2, i3)) {
                return true;
            }
            if (z2) {
                int i4 = n2 ? 1 : 0;
                if (o2) {
                    i4 |= 2;
                }
                e(i4, 1);
                int i5 = this.w1;
                int max = Math.max(-i5, Math.min(i2, i5));
                int i6 = this.w1;
                this.A1.c(max, Math.max(-i6, Math.min(i3, i6)));
                return true;
            }
        }
        return false;
    }

    public int l0(f0 f0Var) {
        if (f0Var.q(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT) || !f0Var.t()) {
            return -1;
        }
        return this.C0.f(f0Var.r);
    }

    public void m(@x1 n nVar) {
        n(nVar, -1);
    }

    public long m0(f0 f0Var) {
        return this.K0.i() ? f0Var.k() : f0Var.r;
    }

    public void m1() {
        l lVar = this.l1;
        if (lVar != null) {
            lVar.l();
        }
        o oVar = this.L0;
        if (oVar != null) {
            oVar.D1(this.A0);
            this.L0.E1(this.A0);
        }
        this.A0.d();
    }

    public void n(@x1 n nVar, int i2) {
        o oVar = this.L0;
        if (oVar != null) {
            oVar.i("Cannot add item decoration during a scroll  or layout");
        }
        if (this.N0.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.N0.add(nVar);
        } else {
            this.N0.add(i2, nVar);
        }
        P0();
        requestLayout();
    }

    public int n0(@x1 View view) {
        f0 s0 = s0(view);
        if (s0 != null) {
            return s0.j();
        }
        return -1;
    }

    public boolean n1(View view) {
        K1();
        boolean r2 = this.D0.r(view);
        if (r2) {
            f0 s0 = s0(view);
            this.A0.K(s0);
            this.A0.D(s0);
        }
        L1(!r2);
        return r2;
    }

    public void o(@x1 q qVar) {
        if (this.b1 == null) {
            this.b1 = new ArrayList();
        }
        this.b1.add(qVar);
    }

    public long o0(@x1 View view) {
        f0 s0;
        g gVar = this.K0;
        if (gVar == null || !gVar.i() || (s0 = s0(view)) == null) {
            return -1L;
        }
        return s0.k();
    }

    public void o1(@x1 n nVar) {
        o oVar = this.L0;
        if (oVar != null) {
            oVar.i("Cannot remove item decoration during a scroll  or layout");
        }
        this.N0.remove(nVar);
        if (this.N0.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        P0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e1 = 0;
        boolean z2 = true;
        this.Q0 = true;
        this.T0 = (!this.T0 || isLayoutRequested()) ? false : false;
        o oVar = this.L0;
        if (oVar != null) {
            oVar.F(this);
        }
        this.J1 = false;
        if (z) {
            ThreadLocal<a30> threadLocal = a30.s;
            a30 a30Var = threadLocal.get();
            this.B1 = a30Var;
            if (a30Var == null) {
                this.B1 = new a30();
                Display P2 = sr.P(this);
                float f2 = 60.0f;
                if (!isInEditMode() && P2 != null) {
                    float refreshRate = P2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                a30 a30Var2 = this.B1;
                a30Var2.w = 1.0E9f / f2;
                threadLocal.set(a30Var2);
            }
            this.B1.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        a30 a30Var;
        super.onDetachedFromWindow();
        l lVar = this.l1;
        if (lVar != null) {
            lVar.l();
        }
        M1();
        this.Q0 = false;
        o oVar = this.L0;
        if (oVar != null) {
            oVar.G(this, this.A0);
        }
        this.R1.clear();
        removeCallbacks(this.S1);
        this.E0.j();
        if (!z || (a30Var = this.B1) == null) {
            return;
        }
        a30Var.j(this);
        this.B1 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.N0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.N0.get(i2).i(canvas, this, this.D1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.L0 != null && !this.W0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.L0.o() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.L0.n()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        z1((int) (f3 * this.x1), (int) (f2 * this.y1), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                z1((int) (f3 * this.x1), (int) (f2 * this.y1), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (!this.L0.o()) {
                        if (this.L0.n()) {
                            f3 = axisValue;
                            f2 = 0.0f;
                            if (f2 == 0.0f) {
                            }
                            z1((int) (f3 * this.x1), (int) (f2 * this.y1), motionEvent);
                        }
                    } else {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        z1((int) (f3 * this.x1), (int) (f2 * this.y1), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                z1((int) (f3 * this.x1), (int) (f2 * this.y1), motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.W0) {
            return false;
        }
        this.P0 = null;
        if (b0(motionEvent)) {
            x();
            return true;
        }
        o oVar = this.L0;
        if (oVar == null) {
            return false;
        }
        boolean n2 = oVar.n();
        boolean o2 = this.L0.o();
        if (this.o1 == null) {
            this.o1 = VelocityTracker.obtain();
        }
        this.o1.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.X0) {
                this.X0 = false;
            }
            this.n1 = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.r1 = x2;
            this.p1 = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.s1 = y2;
            this.q1 = y2;
            if (this.m1 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                f(1);
            }
            int[] iArr = this.P1;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = n2;
            if (o2) {
                i2 = (n2 ? 1 : 0) | 2;
            }
            e(i2, 0);
        } else if (actionMasked == 1) {
            this.o1.clear();
            f(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.n1);
            if (findPointerIndex < 0) {
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.m1 != 1) {
                int i3 = x3 - this.p1;
                int i4 = y3 - this.q1;
                if (!n2 || Math.abs(i3) <= this.t1) {
                    z2 = false;
                } else {
                    this.r1 = x3;
                    z2 = true;
                }
                if (o2 && Math.abs(i4) > this.t1) {
                    this.s1 = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            x();
        } else if (actionMasked == 5) {
            this.n1 = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.r1 = x4;
            this.p1 = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.s1 = y4;
            this.q1 = y4;
        } else if (actionMasked == 6) {
            b1(motionEvent);
        }
        return this.m1 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        in.b(O);
        K();
        in.d();
        this.T0 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        o oVar = this.L0;
        if (oVar == null) {
            F(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.F0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.L0.q1(this.A0, this.D1, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (z2 || this.K0 == null) {
                return;
            }
            if (this.D1.h == 1) {
                L();
            }
            this.L0.W1(i2, i3);
            this.D1.m = true;
            M();
            this.L0.Z1(i2, i3);
            if (this.L0.d2()) {
                this.L0.W1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.D1.m = true;
                M();
                this.L0.Z1(i2, i3);
            }
        } else if (this.R0) {
            this.L0.q1(this.A0, this.D1, i2, i3);
        } else {
            if (this.Z0) {
                K1();
                Y0();
                g1();
                Z0();
                c0 c0Var = this.D1;
                if (c0Var.o) {
                    c0Var.k = true;
                } else {
                    this.C0.k();
                    this.D1.k = false;
                }
                this.Z0 = false;
                L1(false);
            } else if (this.D1.o) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.K0;
            if (gVar != null) {
                this.D1.i = gVar.e();
            } else {
                this.D1.i = 0;
            }
            K1();
            this.L0.q1(this.A0, this.D1, i2, i3);
            L1(false);
            this.D1.k = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (L0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.B0 = zVar;
        super.onRestoreInstanceState(zVar.getSuperState());
        o oVar = this.L0;
        if (oVar == null || (parcelable2 = this.B0.s) == null) {
            return;
        }
        oVar.t1(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.B0;
        if (zVar2 != null) {
            zVar.c(zVar2);
        } else {
            o oVar = this.L0;
            if (oVar != null) {
                zVar.s = oVar.u1();
            } else {
                zVar.s = null;
            }
        }
        return zVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        H0();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3 = false;
        if (this.W0 || this.X0) {
            return false;
        }
        if (R(motionEvent)) {
            x();
            return true;
        }
        o oVar = this.L0;
        if (oVar == null) {
            return false;
        }
        boolean n2 = oVar.n();
        boolean o2 = this.L0.o();
        if (this.o1 == null) {
            this.o1 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.P1;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.P1;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.n1 = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.r1 = x2;
            this.p1 = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.s1 = y2;
            this.q1 = y2;
            int i2 = n2;
            if (o2) {
                i2 = (n2 ? 1 : 0) | 2;
            }
            e(i2, 0);
        } else if (actionMasked == 1) {
            this.o1.addMovement(obtain);
            this.o1.computeCurrentVelocity(1000, this.w1);
            float f2 = n2 ? -this.o1.getXVelocity(this.n1) : 0.0f;
            float f3 = o2 ? -this.o1.getYVelocity(this.n1) : 0.0f;
            if ((f2 == 0.0f && f3 == 0.0f) || !k0((int) f2, (int) f3)) {
                setScrollState(0);
            }
            w1();
            z3 = true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.n1);
            if (findPointerIndex < 0) {
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            int i3 = this.r1 - x3;
            int i4 = this.s1 - y3;
            if (this.m1 != 1) {
                if (n2) {
                    if (i3 > 0) {
                        i3 = Math.max(0, i3 - this.t1);
                    } else {
                        i3 = Math.min(0, i3 + this.t1);
                    }
                    if (i3 != 0) {
                        z2 = true;
                        if (o2) {
                            if (i4 > 0) {
                                i4 = Math.max(0, i4 - this.t1);
                            } else {
                                i4 = Math.min(0, i4 + this.t1);
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                }
                z2 = false;
                if (o2) {
                }
                if (z2) {
                }
            }
            int i5 = i3;
            int i6 = i4;
            if (this.m1 == 1) {
                int[] iArr3 = this.Q1;
                iArr3[0] = 0;
                iArr3[1] = 0;
                if (b(n2 ? i5 : 0, o2 ? i6 : 0, iArr3, this.O1, 0)) {
                    int[] iArr4 = this.Q1;
                    i5 -= iArr4[0];
                    i6 -= iArr4[1];
                    int[] iArr5 = this.P1;
                    int i7 = iArr5[0];
                    int[] iArr6 = this.O1;
                    iArr5[0] = i7 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i8 = i6;
                int[] iArr7 = this.O1;
                this.r1 = x3 - iArr7[0];
                this.s1 = y3 - iArr7[1];
                if (z1(n2 ? i5 : 0, o2 ? i8 : 0, motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                a30 a30Var = this.B1;
                if (a30Var != null && (i5 != 0 || i8 != 0)) {
                    a30Var.f(this, i5, i8);
                }
            }
        } else if (actionMasked == 3) {
            x();
        } else if (actionMasked == 5) {
            this.n1 = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.r1 = x4;
            this.p1 = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.s1 = y4;
            this.q1 = y4;
        } else if (actionMasked == 6) {
            b1(motionEvent);
        }
        if (!z3) {
            this.o1.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void p(@x1 s sVar) {
        this.O0.add(sVar);
    }

    public int p0(@x1 View view) {
        f0 s0 = s0(view);
        if (s0 != null) {
            return s0.m();
        }
        return -1;
    }

    public void p1(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            o1(y0(i2));
            return;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public void q(@x1 t tVar) {
        if (this.F1 == null) {
            this.F1 = new ArrayList();
        }
        this.F1.add(tVar);
    }

    @Deprecated
    public int q0(@x1 View view) {
        return n0(view);
    }

    public void q1(@x1 q qVar) {
        List<q> list = this.b1;
        if (list == null) {
            return;
        }
        list.remove(qVar);
    }

    public void r(@x1 f0 f0Var, @z1 l.d dVar, @x1 l.d dVar2) {
        f0Var.H(false);
        if (this.l1.a(f0Var, dVar, dVar2)) {
            e1();
        }
    }

    public f0 r0(@x1 View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return s0(view);
    }

    public void r1(@x1 s sVar) {
        this.O0.remove(sVar);
        if (this.P0 == sVar) {
            this.P0 = null;
        }
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        f0 s0 = s0(view);
        if (s0 != null) {
            if (s0.y()) {
                s0.f();
            } else if (!s0.K()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(s0);
                throw new IllegalArgumentException(wo1.k(this, sb));
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.L0.s1(this, this.D1, view, view2) && view2 != null) {
            u1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.L0.L1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.O0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.O0.get(i2).e(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.U0 == 0 && !this.W0) {
            super.requestLayout();
        } else {
            this.V0 = true;
        }
    }

    public void s1(@x1 t tVar) {
        List<t> list = this.F1;
        if (list != null) {
            list.remove(tVar);
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        o oVar = this.L0;
        if (oVar == null || this.W0) {
            return;
        }
        boolean n2 = oVar.n();
        boolean o2 = this.L0.o();
        if (n2 || o2) {
            if (!n2) {
                i2 = 0;
            }
            if (!o2) {
                i3 = 0;
            }
            z1(i2, i3, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (E1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@z1 n30 n30Var) {
        this.K1 = n30Var;
        sr.A1(this, n30Var);
    }

    public void setAdapter(@z1 g gVar) {
        setLayoutFrozen(false);
        C1(gVar, false, true);
        h1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@z1 j jVar) {
        if (jVar == this.L1) {
            return;
        }
        this.L1 = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.F0) {
            H0();
        }
        this.F0 = z2;
        super.setClipToPadding(z2);
        if (this.T0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@x1 k kVar) {
        jp.l(kVar);
        this.g1 = kVar;
        H0();
    }

    public void setHasFixedSize(boolean z2) {
        this.R0 = z2;
    }

    public void setItemAnimator(@z1 l lVar) {
        l lVar2 = this.l1;
        if (lVar2 != null) {
            lVar2.l();
            this.l1.A(null);
        }
        this.l1 = lVar;
        if (lVar != null) {
            lVar.A(this.I1);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.A0.H(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(@z1 o oVar) {
        if (oVar == this.L0) {
            return;
        }
        M1();
        if (this.L0 != null) {
            l lVar = this.l1;
            if (lVar != null) {
                lVar.l();
            }
            this.L0.D1(this.A0);
            this.L0.E1(this.A0);
            this.A0.d();
            if (this.Q0) {
                this.L0.G(this, this.A0);
            }
            this.L0.b2(null);
            this.L0 = null;
        } else {
            this.A0.d();
        }
        this.D0.o();
        this.L0 = oVar;
        if (oVar != null) {
            if (oVar.b == null) {
                oVar.b2(this);
                if (this.Q0) {
                    this.L0.F(this);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(oVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(wo1.k(oVar.b, sb));
            }
        }
        this.A0.L();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().p(z2);
    }

    public void setOnFlingListener(@z1 r rVar) {
        this.u1 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(@z1 t tVar) {
        this.E1 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.z1 = z2;
    }

    public void setRecycledViewPool(@z1 v vVar) {
        this.A0.F(vVar);
    }

    public void setRecyclerListener(@z1 x xVar) {
        this.M0 = xVar;
    }

    public void setScrollState(int i2) {
        if (i2 == this.m1) {
            return;
        }
        this.m1 = i2;
        if (i2 != 2) {
            N1();
        }
        O(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 1) {
            this.t1 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.t1 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(@z1 d0 d0Var) {
        this.A0.G(d0Var);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().r(i2);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public void stopNestedScroll() {
        getScrollingChildHelper().t();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.W0) {
            v("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.W0 = false;
                if (this.V0 && this.L0 != null && this.K0 != null) {
                    requestLayout();
                }
                this.V0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.W0 = true;
            this.X0 = true;
            M1();
        }
    }

    public void t(@x1 f0 f0Var, @x1 l.d dVar, @z1 l.d dVar2) {
        l(f0Var);
        f0Var.H(false);
        if (this.l1.c(f0Var, dVar, dVar2)) {
            e1();
        }
    }

    public void t0(@x1 View view, @x1 Rect rect) {
        u0(view, rect);
    }

    public void t1() {
        f0 f0Var;
        int g2 = this.D0.g();
        for (int i2 = 0; i2 < g2; i2++) {
            View f2 = this.D0.f(i2);
            f0 r0 = r0(f2);
            if (r0 != null && (f0Var = r0.x) != null) {
                View view = f0Var.p;
                int left = f2.getLeft();
                int top = f2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void u(String str) {
        if (L0()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException(wo1.k(this, wo1.G("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
        }
        throw new IllegalStateException(wo1.k(this, wo1.G(str)));
    }

    public void v(String str) {
        if (L0()) {
            if (str == null) {
                throw new IllegalStateException(wo1.k(this, wo1.G("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.f1 > 0) {
            new IllegalStateException(wo1.k(this, wo1.G("")));
        }
    }

    public boolean w(f0 f0Var) {
        l lVar = this.l1;
        return lVar == null || lVar.g(f0Var, f0Var.p());
    }

    public Rect x0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.c) {
            return pVar.b;
        }
        if (this.D1.j() && (pVar.d() || pVar.f())) {
            return pVar.b;
        }
        Rect rect = pVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.N0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.H0.set(0, 0, 0, 0);
            this.N0.get(i2).g(this.H0, view, this, this.D1);
            int i3 = rect.left;
            Rect rect2 = this.H0;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.c = false;
        return rect;
    }

    @x1
    public n y0(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.N0.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public void y1() {
        int j2 = this.D0.j();
        for (int i2 = 0; i2 < j2; i2++) {
            f0 s0 = s0(this.D0.i(i2));
            if (!s0.K()) {
                s0.F();
            }
        }
    }

    public void z() {
        int j2 = this.D0.j();
        for (int i2 = 0; i2 < j2; i2++) {
            f0 s0 = s0(this.D0.i(i2));
            if (!s0.K()) {
                s0.c();
            }
        }
        this.A0.e();
    }

    public boolean z1(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        D();
        if (this.K0 != null) {
            int[] iArr = this.Q1;
            iArr[0] = 0;
            iArr[1] = 0;
            A1(i2, i3, iArr);
            int[] iArr2 = this.Q1;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i2 - i8;
            i7 = i3 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.N0.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.Q1;
        iArr3[0] = 0;
        iArr3[1] = 0;
        c(i5, i4, i6, i7, this.O1, 0, iArr3);
        int[] iArr4 = this.Q1;
        int i10 = i6 - iArr4[0];
        int i11 = i7 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.r1;
        int[] iArr5 = this.O1;
        this.r1 = i12 - iArr5[0];
        this.s1 -= iArr5[1];
        int[] iArr6 = this.P1;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !ar.l(motionEvent, 8194)) {
                i1(motionEvent.getX(), i10, motionEvent.getY(), i11);
            }
            C(i2, i3);
        }
        if (i5 != 0 || i4 != 0) {
            P(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i4 == 0) ? false : true;
    }

    public RecyclerView(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, o20.a.r);
    }

    public RecyclerView(@x1 Context context, @z1 AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.z0 = new y();
        this.A0 = new w();
        this.E0 = new w30();
        this.G0 = new a();
        this.H0 = new Rect();
        this.I0 = new Rect();
        this.J0 = new RectF();
        this.N0 = new ArrayList<>();
        this.O0 = new ArrayList<>();
        this.U0 = 0;
        this.c1 = false;
        this.d1 = false;
        this.e1 = 0;
        this.f1 = 0;
        this.g1 = new k();
        this.l1 = new w20();
        this.m1 = 0;
        this.n1 = -1;
        this.x1 = Float.MIN_VALUE;
        this.y1 = Float.MIN_VALUE;
        this.z1 = true;
        this.A1 = new e0();
        this.C1 = z ? new a30.b() : null;
        this.D1 = new c0();
        this.G1 = false;
        this.H1 = false;
        this.I1 = new m();
        this.J1 = false;
        this.M1 = new int[2];
        this.O1 = new int[2];
        this.P1 = new int[2];
        this.Q1 = new int[2];
        this.R1 = new ArrayList();
        this.S1 = new b();
        this.T1 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.t1 = viewConfiguration.getScaledTouchSlop();
        this.x1 = tr.b(viewConfiguration, context);
        this.y1 = tr.e(viewConfiguration, context);
        this.v1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.w1 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.l1.A(this.I1);
        D0();
        F0();
        E0();
        if (sr.U(this) == 0) {
            sr.Q1(this, 1);
        }
        this.a1 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new n30(this));
        int[] iArr = o20.j.P;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(o20.j.Y);
        if (obtainStyledAttributes.getInt(o20.j.S, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.F0 = obtainStyledAttributes.getBoolean(o20.j.R, true);
        boolean z2 = obtainStyledAttributes.getBoolean(o20.j.T, false);
        this.S0 = z2;
        if (z2) {
            G0((StateListDrawable) obtainStyledAttributes.getDrawable(o20.j.W), obtainStyledAttributes.getDrawable(o20.j.X), (StateListDrawable) obtainStyledAttributes.getDrawable(o20.j.U), obtainStyledAttributes.getDrawable(o20.j.V));
        }
        obtainStyledAttributes.recycle();
        E(context, string, attributeSet, i2, 0);
        int[] iArr2 = v;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
        }
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    /* loaded from: classes.dex */
    public static class p extends ViewGroup.MarginLayoutParams {
        public f0 a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public int a() {
            return this.a.j();
        }

        public int b() {
            return this.a.m();
        }

        @Deprecated
        public int c() {
            return this.a.o();
        }

        public boolean d() {
            return this.a.z();
        }

        public boolean e() {
            return this.a.w();
        }

        public boolean f() {
            return this.a.u();
        }

        public boolean g() {
            return this.a.A();
        }

        public p(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    @i2({i2.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class z extends au {
        public static final Parcelable.Creator<z> CREATOR = new a();
        public Parcelable s;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<z> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public z[] newArray(int i) {
                return new z[i];
            }
        }

        public z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.s = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public void c(z zVar) {
            this.s = zVar.s;
        }

        @Override // com.p7700g.p99005.au, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.s, 0);
        }

        public z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.L0;
        if (oVar != null) {
            return oVar.M(layoutParams);
        }
        throw new IllegalStateException(wo1.k(this, wo1.G("RecyclerView has no LayoutManager")));
    }
}