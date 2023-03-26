package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.p7700g.p99005.eu;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.lu;
import com.p7700g.p99005.os;
import java.util.ArrayList;
import java.util.List;
import org.xbill.DNS.SimpleResolver;

/* compiled from: DrawerLayout.java */
/* loaded from: classes.dex */
public class mu extends ViewGroup implements du {
    public static final int A = 3;
    private static final int B = 64;
    private static final int C = -1728053248;
    private static final int D = 160;
    private static final int E = 400;
    private static final boolean F = false;
    private static final boolean G = true;
    private static final float H = 1.0f;
    public static final boolean J;
    private static final boolean K;
    private static final String L = "androidx.drawerlayout.widget.DrawerLayout";
    private static boolean M = false;
    private static final String s = "DrawerLayout";
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 0;
    public static final int y = 1;
    public static final int z = 2;
    private int A0;
    private boolean B0;
    @z1
    private e C0;
    private List<e> D0;
    private float E0;
    private float F0;
    private Drawable G0;
    private Drawable H0;
    private Drawable I0;
    private CharSequence J0;
    private CharSequence K0;
    private Object L0;
    private boolean M0;
    private final d N;
    private Drawable N0;
    private float O;
    private Drawable O0;
    private int P;
    private Drawable P0;
    private int Q;
    private Drawable Q0;
    private float R;
    private final ArrayList<View> R0;
    private Paint S;
    private Rect S0;
    private final eu T;
    private Matrix T0;
    private final eu U;
    private final os U0;
    private final i V;
    private final i W;
    private int u0;
    private boolean v0;
    private boolean w0;
    private int x0;
    private int y0;
    private int z0;
    private static final int[] t = {16843828};
    public static final int[] I = {16842931};

    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    public class a implements os {
        public a() {
        }

        @Override // com.p7700g.p99005.os
        public boolean a(@x1 View view, @z1 os.a aVar) {
            if (!mu.this.D(view) || mu.this.r(view) == 2) {
                return false;
            }
            mu.this.f(view);
            return true;
        }
    }

    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    public class b implements View.OnApplyWindowInsetsListener {
        public b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((mu) view).S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    public class c extends fq {
        private final Rect d = new Rect();

        public c() {
        }

        private void n(ls lsVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (mu.A(childAt)) {
                    lsVar.c(childAt);
                }
            }
        }

        private void o(ls lsVar, ls lsVar2) {
            Rect rect = this.d;
            lsVar2.t(rect);
            lsVar.S0(rect);
            lsVar.V1(lsVar2.B0());
            lsVar.x1(lsVar2.N());
            lsVar.W0(lsVar2.w());
            lsVar.a1(lsVar2.A());
            lsVar.g1(lsVar2.o0());
            lsVar.j1(lsVar2.q0());
            lsVar.O0(lsVar2.g0());
            lsVar.G1(lsVar2.y0());
            lsVar.a(lsVar2.p());
        }

        @Override // com.p7700g.p99005.fq
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View p = mu.this.p();
                if (p != null) {
                    CharSequence s = mu.this.s(mu.this.t(p));
                    if (s != null) {
                        text.add(s);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // com.p7700g.p99005.fq
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(mu.L);
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            if (mu.J) {
                super.g(view, lsVar);
            } else {
                ls F0 = ls.F0(lsVar);
                super.g(view, F0);
                lsVar.I1(view);
                ViewParent k0 = sr.k0(view);
                if (k0 instanceof View) {
                    lsVar.z1((View) k0);
                }
                o(lsVar, F0);
                F0.I0();
                n(lsVar, (ViewGroup) view);
            }
            lsVar.W0(mu.L);
            lsVar.i1(false);
            lsVar.j1(false);
            lsVar.K0(ls.a.b);
            lsVar.K0(ls.a.c);
        }

        @Override // com.p7700g.p99005.fq
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (mu.J || mu.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    public static final class d extends fq {
        @Override // com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            super.g(view, lsVar);
            if (mu.A(view)) {
                return;
            }
            lsVar.z1(null);
        }
    }

    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    public interface e {
        void a(@x1 View view);

        void b(@x1 View view);

        void c(int i);

        void d(@x1 View view, float f);
    }

    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    public static abstract class h implements e {
        @Override // com.p7700g.p99005.mu.e
        public void a(View view) {
        }

        @Override // com.p7700g.p99005.mu.e
        public void b(View view) {
        }

        @Override // com.p7700g.p99005.mu.e
        public void c(int i) {
        }

        @Override // com.p7700g.p99005.mu.e
        public void d(View view, float f) {
        }
    }

    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    public class i extends eu.c {
        private final int a;
        private eu b;
        private final Runnable c = new a();

        /* compiled from: DrawerLayout.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.o();
            }
        }

        public i(int i) {
            this.a = i;
        }

        private void n() {
            View n = mu.this.n(this.a == 3 ? 5 : 3);
            if (n != null) {
                mu.this.f(n);
            }
        }

        @Override // com.p7700g.p99005.eu.c
        public int a(View view, int i, int i2) {
            if (mu.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = mu.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // com.p7700g.p99005.eu.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.p7700g.p99005.eu.c
        public int d(View view) {
            if (mu.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // com.p7700g.p99005.eu.c
        public void f(int i, int i2) {
            View n;
            if ((i & 1) == 1) {
                n = mu.this.n(3);
            } else {
                n = mu.this.n(5);
            }
            if (n == null || mu.this.r(n) != 0) {
                return;
            }
            this.b.d(n, i2);
        }

        @Override // com.p7700g.p99005.eu.c
        public boolean g(int i) {
            return false;
        }

        @Override // com.p7700g.p99005.eu.c
        public void h(int i, int i2) {
            mu.this.postDelayed(this.c, 160L);
        }

        @Override // com.p7700g.p99005.eu.c
        public void i(View view, int i) {
            ((f) view.getLayoutParams()).f = false;
            n();
        }

        @Override // com.p7700g.p99005.eu.c
        public void j(int i) {
            mu.this.b0(i, this.b.z());
        }

        @Override // com.p7700g.p99005.eu.c
        public void k(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (mu.this.c(view, 3) ? i + width : mu.this.getWidth() - i) / width;
            mu.this.Y(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            mu.this.invalidate();
        }

        @Override // com.p7700g.p99005.eu.c
        public void l(View view, float f, float f2) {
            int i;
            float u = mu.this.u(view);
            int width = view.getWidth();
            if (mu.this.c(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && u > 0.5f)) ? 0 : -width;
            } else {
                int width2 = mu.this.getWidth();
                if (f < 0.0f || (f == 0.0f && u > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.V(i, view.getTop());
            mu.this.invalidate();
        }

        @Override // com.p7700g.p99005.eu.c
        public boolean m(View view, int i) {
            return mu.this.E(view) && mu.this.c(view, this.a) && mu.this.r(view) == 0;
        }

        public void o() {
            View n;
            int width;
            int B = this.b.B();
            boolean z = this.a == 3;
            if (z) {
                n = mu.this.n(3);
                width = (n != null ? -n.getWidth() : 0) + B;
            } else {
                n = mu.this.n(5);
                width = mu.this.getWidth() - B;
            }
            if (n != null) {
                if (((!z || n.getLeft() >= width) && (z || n.getLeft() <= width)) || mu.this.r(n) != 0) {
                    return;
                }
                this.b.X(n, width, n.getTop());
                ((f) n.getLayoutParams()).f = true;
                mu.this.invalidate();
                n();
                mu.this.b();
            }
        }

        public void p() {
            mu.this.removeCallbacks(this.c);
        }

        public void q(eu euVar) {
            this.b = euVar;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        J = true;
        K = true;
        M = i2 >= 29;
    }

    public mu(@x1 Context context) {
        this(context, null);
    }

    public static boolean A(View view) {
        return (sr.U(view) == 4 || sr.U(view) == 2) ? false : true;
    }

    private boolean H(float f2, float f3, View view) {
        if (this.S0 == null) {
            this.S0 = new Rect();
        }
        view.getHitRect(this.S0);
        return this.S0.contains((int) f2, (int) f3);
    }

    private void I(Drawable drawable, int i2) {
        if (drawable == null || !fk.h(drawable)) {
            return;
        }
        fk.m(drawable, i2);
    }

    private Drawable P() {
        int Y = sr.Y(this);
        if (Y == 0) {
            Drawable drawable = this.N0;
            if (drawable != null) {
                I(drawable, Y);
                return this.N0;
            }
        } else {
            Drawable drawable2 = this.O0;
            if (drawable2 != null) {
                I(drawable2, Y);
                return this.O0;
            }
        }
        return this.P0;
    }

    private Drawable Q() {
        int Y = sr.Y(this);
        if (Y == 0) {
            Drawable drawable = this.O0;
            if (drawable != null) {
                I(drawable, Y);
                return this.O0;
            }
        } else {
            Drawable drawable2 = this.N0;
            if (drawable2 != null) {
                I(drawable2, Y);
                return this.N0;
            }
        }
        return this.Q0;
    }

    private void R() {
        if (K) {
            return;
        }
        this.H0 = P();
        this.I0 = Q();
    }

    private void Z(View view) {
        ls.a aVar = ls.a.v;
        sr.q1(view, aVar.b());
        if (!D(view) || r(view) == 2) {
            return;
        }
        sr.t1(view, aVar, null, this.U0);
    }

    private void a0(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((!z2 && !E(childAt)) || (z2 && childAt == view)) {
                sr.Q1(childAt, 1);
            } else {
                sr.Q1(childAt, 4);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v2 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v2);
            v2.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.T0 == null) {
                this.T0 = new Matrix();
            }
            matrix.invert(this.T0);
            obtain.transform(this.T0);
        }
        return obtain;
    }

    public static String w(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((f) getChildAt(i2).getLayoutParams()).f) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    public boolean B(View view) {
        return ((f) view.getLayoutParams()).d == 0;
    }

    public boolean C(int i2) {
        View n = n(i2);
        if (n != null) {
            return D(n);
        }
        return false;
    }

    public boolean D(@x1 View view) {
        if (E(view)) {
            return (((f) view.getLayoutParams()).g & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean E(View view) {
        int d2 = nq.d(((f) view.getLayoutParams()).d, sr.Y(view));
        return ((d2 & 3) == 0 && (d2 & 5) == 0) ? false : true;
    }

    public boolean F(int i2) {
        View n = n(i2);
        if (n != null) {
            return G(n);
        }
        return false;
    }

    public boolean G(@x1 View view) {
        if (E(view)) {
            return ((f) view.getLayoutParams()).e > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void J(View view, float f2) {
        float u2 = u(view);
        float width = view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (u2 * width));
        if (!c(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        Y(view, f2);
    }

    public void K(int i2) {
        L(i2, true);
    }

    public void L(int i2, boolean z2) {
        View n = n(i2);
        if (n != null) {
            N(n, z2);
            return;
        }
        StringBuilder G2 = wo1.G("No drawer view found with gravity ");
        G2.append(w(i2));
        throw new IllegalArgumentException(G2.toString());
    }

    public void M(@x1 View view) {
        N(view, true);
    }

    public void N(@x1 View view, boolean z2) {
        if (E(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.w0) {
                fVar.e = 1.0f;
                fVar.g = 1;
                a0(view, true);
                Z(view);
            } else if (z2) {
                fVar.g |= 2;
                if (c(view, 3)) {
                    this.T.X(view, 0, view.getTop());
                } else {
                    this.U.X(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                J(view, 1.0f);
                b0(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void O(@x1 e eVar) {
        List<e> list;
        if (eVar == null || (list = this.D0) == null) {
            return;
        }
        list.remove(eVar);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void S(Object obj, boolean z2) {
        this.L0 = obj;
        this.M0 = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        requestLayout();
    }

    public void T(int i2, int i3) {
        View n;
        int d2 = nq.d(i3, sr.Y(this));
        if (i3 == 3) {
            this.x0 = i2;
        } else if (i3 == 5) {
            this.y0 = i2;
        } else if (i3 == 8388611) {
            this.z0 = i2;
        } else if (i3 == 8388613) {
            this.A0 = i2;
        }
        if (i2 != 0) {
            (d2 == 3 ? this.T : this.U).c();
        }
        if (i2 != 1) {
            if (i2 == 2 && (n = n(d2)) != null) {
                M(n);
                return;
            }
            return;
        }
        View n2 = n(d2);
        if (n2 != null) {
            f(n2);
        }
    }

    public void U(int i2, @x1 View view) {
        if (E(view)) {
            T(i2, ((f) view.getLayoutParams()).d);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void V(@f1 int i2, int i3) {
        W(gh.i(getContext(), i2), i3);
    }

    public void W(Drawable drawable, int i2) {
        if (K) {
            return;
        }
        if ((i2 & nq.b) == 8388611) {
            this.N0 = drawable;
        } else if ((i2 & nq.c) == 8388613) {
            this.O0 = drawable;
        } else if ((i2 & 3) == 3) {
            this.P0 = drawable;
        } else if ((i2 & 5) != 5) {
            return;
        } else {
            this.Q0 = drawable;
        }
        R();
        invalidate();
    }

    public void X(int i2, @z1 CharSequence charSequence) {
        int d2 = nq.d(i2, sr.Y(this));
        if (d2 == 3) {
            this.J0 = charSequence;
        } else if (d2 == 5) {
            this.K0 = charSequence;
        }
    }

    public void Y(View view, float f2) {
        f fVar = (f) view.getLayoutParams();
        if (f2 == fVar.e) {
            return;
        }
        fVar.e = f2;
        l(view, f2);
    }

    public void a(@x1 e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.D0 == null) {
            this.D0 = new ArrayList();
        }
        this.D0.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (E(childAt)) {
                if (D(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z2 = true;
                }
            } else {
                this.R0.add(childAt);
            }
        }
        if (!z2) {
            int size = this.R0.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = this.R0.get(i5);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i2, i3);
                }
            }
        }
        this.R0.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (o() == null && !E(view)) {
            sr.Q1(view, 1);
        } else {
            sr.Q1(view, 4);
        }
        if (J) {
            return;
        }
        sr.A1(view, this.N);
    }

    public void b() {
        if (this.B0) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.B0 = true;
    }

    public void b0(int i2, View view) {
        int F2 = this.T.F();
        int F3 = this.U.F();
        int i3 = 2;
        if (F2 == 1 || F3 == 1) {
            i3 = 1;
        } else if (F2 != 2 && F3 != 2) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f2 = ((f) view.getLayoutParams()).e;
            if (f2 == 0.0f) {
                j(view);
            } else if (f2 == 1.0f) {
                k(view);
            }
        }
        if (i3 != this.u0) {
            this.u0 = i3;
            List<e> list = this.D0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.D0.get(size).c(i3);
                }
            }
        }
    }

    public boolean c(View view, int i2) {
        return (t(view) & i2) == i2;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // com.p7700g.p99005.du
    public void close() {
        d(nq.b);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((f) getChildAt(i2).getLayoutParams()).e);
        }
        this.R = f2;
        boolean o = this.T.o(true);
        boolean o2 = this.U.o(true);
        if (o || o2) {
            sr.m1(this);
        }
    }

    public void d(int i2) {
        e(i2, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.R > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                for (int i2 = childCount - 1; i2 >= 0; i2--) {
                    View childAt = getChildAt(i2);
                    if (H(x2, y2, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean B2 = B(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (B2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.R;
        if (f2 > 0.0f && B2) {
            int i5 = this.Q;
            this.S.setColor((i5 & sr.s) | (((int) ((((-16777216) & i5) >>> 24) * f2)) << 24));
            canvas.drawRect(i2, 0.0f, width, getHeight(), this.S);
        } else if (this.H0 != null && c(view, 3)) {
            int intrinsicWidth = this.H0.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.T.B(), 1.0f));
            this.H0.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.H0.setAlpha((int) (max * 255.0f));
            this.H0.draw(canvas);
        } else if (this.I0 != null && c(view, 5)) {
            int intrinsicWidth2 = this.I0.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.U.B(), 1.0f));
            this.I0.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.I0.setAlpha((int) (max2 * 255.0f));
            this.I0.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i2, boolean z2) {
        View n = n(i2);
        if (n != null) {
            g(n, z2);
            return;
        }
        StringBuilder G2 = wo1.G("No drawer view found with gravity ");
        G2.append(w(i2));
        throw new IllegalArgumentException(G2.toString());
    }

    public void f(@x1 View view) {
        g(view, true);
    }

    public void g(@x1 View view, boolean z2) {
        if (E(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.w0) {
                fVar.e = 0.0f;
                fVar.g = 0;
            } else if (z2) {
                fVar.g |= 4;
                if (c(view, 3)) {
                    this.T.X(view, -view.getWidth(), view.getTop());
                } else {
                    this.U.X(view, getWidth(), view.getTop());
                }
            } else {
                J(view, 0.0f);
                b0(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (K) {
            return this.O;
        }
        return 0.0f;
    }

    @z1
    public Drawable getStatusBarBackgroundDrawable() {
        return this.G0;
    }

    public void h() {
        i(false);
    }

    public void i(boolean z2) {
        boolean X;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            if (E(childAt) && (!z2 || fVar.f)) {
                int width = childAt.getWidth();
                if (c(childAt, 3)) {
                    X = this.T.X(childAt, -width, childAt.getTop());
                } else {
                    X = this.U.X(childAt, getWidth(), childAt.getTop());
                }
                z3 |= X;
                fVar.f = false;
            }
        }
        this.V.p();
        this.W.p();
        if (z3) {
            invalidate();
        }
    }

    @Override // com.p7700g.p99005.du
    public boolean isOpen() {
        return C(nq.b);
    }

    public void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.g & 1) == 1) {
            fVar.g = 0;
            List<e> list = this.D0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.D0.get(size).b(view);
                }
            }
            a0(view, false);
            Z(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.g & 1) == 0) {
            fVar.g = 1;
            List<e> list = this.D0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.D0.get(size).a(view);
                }
            }
            a0(view, true);
            Z(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void l(View view, float f2) {
        List<e> list = this.D0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.D0.get(size).d(view, f2);
            }
        }
    }

    public View n(int i2) {
        int d2 = nq.d(i2, sr.Y(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((t(childAt) & 7) == d2) {
                return childAt;
            }
        }
        return null;
    }

    public View o() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((f) childAt.getLayoutParams()).g & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w0 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.M0 || this.G0 == null) {
            return;
        }
        Object obj = this.L0;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.G0.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.G0.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        View v2;
        int actionMasked = motionEvent.getActionMasked();
        boolean W = this.T.W(motionEvent) | this.U.W(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.T.f(3)) {
                        this.V.p();
                        this.W.p();
                    }
                }
                z2 = false;
            }
            i(true);
            this.B0 = false;
            z2 = false;
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.E0 = x2;
            this.F0 = y2;
            z2 = this.R > 0.0f && (v2 = this.T.v((int) x2, (int) y2)) != null && B(v2);
            this.B0 = false;
        }
        return W || z2 || y() || this.B0;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4 && z()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            View p = p();
            if (p != null && r(p) == 0) {
                h();
            }
            return p != null;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        WindowInsets rootWindowInsets;
        int i6;
        float f2;
        int i7;
        this.v0 = true;
        int i8 = i4 - i2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i10 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i10, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i10, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f3 = measuredWidth;
                        i7 = (-measuredWidth) + ((int) (fVar.e * f3));
                        f2 = (measuredWidth + i7) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i8 - i6) / f4;
                        i7 = i8 - ((int) (fVar.e * f4));
                    }
                    boolean z3 = f2 != fVar.e;
                    int i11 = fVar.d & 112;
                    if (i11 == 16) {
                        int i12 = i5 - i3;
                        int i13 = (i12 - measuredHeight) / 2;
                        int i14 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i13 < i14) {
                            i13 = i14;
                        } else {
                            int i15 = i13 + measuredHeight;
                            int i16 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i15 > i12 - i16) {
                                i13 = (i12 - i16) - measuredHeight;
                            }
                        }
                        childAt.layout(i7, i13, measuredWidth + i7, measuredHeight + i13);
                    } else if (i11 != 80) {
                        int i17 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i7, i17, measuredWidth + i7, measuredHeight + i17);
                    } else {
                        int i18 = i5 - i3;
                        childAt.layout(i7, (i18 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i18 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z3) {
                        Y(childAt, f2);
                    }
                    int i19 = fVar.e > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        if (M && (rootWindowInsets = getRootWindowInsets()) != null) {
            hj n = gs.K(rootWindowInsets).n();
            eu euVar = this.T;
            euVar.S(Math.max(euVar.A(), n.b));
            eu euVar2 = this.U;
            euVar2.S(Math.max(euVar2.A(), n.d));
        }
        this.v0 = false;
        this.w0 = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i4 = 0;
        boolean z2 = this.L0 != null && sr.T(this);
        int Y = sr.Y(this);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z2) {
                    int d2 = nq.d(fVar.d, Y);
                    if (sr.T(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.L0;
                        if (d2 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i4, windowInsets.getSystemWindowInsetBottom());
                        } else if (d2 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(i4, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.L0;
                        if (d2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i4, windowInsets2.getSystemWindowInsetBottom());
                        } else if (d2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i4, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else if (E(childAt)) {
                    if (K) {
                        float Q = sr.Q(childAt);
                        float f2 = this.O;
                        if (Q != f2) {
                            sr.M1(childAt, f2);
                        }
                    }
                    int t2 = t(childAt) & 7;
                    boolean z5 = t2 == 3;
                    if ((z5 && z3) || (!z5 && z4)) {
                        StringBuilder G2 = wo1.G("Child drawer has absolute gravity ");
                        G2.append(w(t2));
                        G2.append(" but this ");
                        G2.append(s);
                        G2.append(" already has a drawer view along that edge");
                        throw new IllegalStateException(G2.toString());
                    }
                    if (z5) {
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i2, this.P + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i3, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                    i5++;
                    i4 = 0;
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i5++;
            i4 = 0;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View n;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        int i2 = gVar.s;
        if (i2 != 0 && (n = n(i2)) != null) {
            M(n);
        }
        int i3 = gVar.t;
        if (i3 != 3) {
            T(i3, 3);
        }
        int i4 = gVar.u;
        if (i4 != 3) {
            T(i4, 5);
        }
        int i5 = gVar.v;
        if (i5 != 3) {
            T(i5, nq.b);
        }
        int i6 = gVar.w;
        if (i6 != 3) {
            T(i6, nq.c);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        R();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            f fVar = (f) getChildAt(i2).getLayoutParams();
            int i3 = fVar.g;
            boolean z2 = i3 == 1;
            boolean z3 = i3 == 2;
            if (z2 || z3) {
                gVar.s = fVar.d;
                break;
            }
        }
        gVar.t = this.x0;
        gVar.u = this.y0;
        gVar.v = this.z0;
        gVar.w = this.A0;
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.T.M(motionEvent);
        this.U.M(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z2 = false;
        if (action == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.E0 = x2;
            this.F0 = y2;
            this.B0 = false;
        } else if (action == 1) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            View v2 = this.T.v((int) x3, (int) y3);
            if (v2 != null && B(v2)) {
                float f2 = x3 - this.E0;
                float f3 = y3 - this.F0;
                int E2 = this.T.E();
                if ((f3 * f3) + (f2 * f2) < E2 * E2) {
                    View o = o();
                    if (o != null) {
                    }
                }
            }
            z2 = true;
            i(z2);
        } else if (action == 3) {
            i(true);
            this.B0 = false;
        }
        return true;
    }

    @Override // com.p7700g.p99005.du
    public void open() {
        K(nq.b);
    }

    public View p() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i2) {
        int Y = sr.Y(this);
        if (i2 == 3) {
            int i3 = this.x0;
            if (i3 != 3) {
                return i3;
            }
            int i4 = Y == 0 ? this.z0 : this.A0;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i2 == 5) {
            int i5 = this.y0;
            if (i5 != 3) {
                return i5;
            }
            int i6 = Y == 0 ? this.A0 : this.z0;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        } else if (i2 == 8388611) {
            int i7 = this.z0;
            if (i7 != 3) {
                return i7;
            }
            int i8 = Y == 0 ? this.x0 : this.y0;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        } else if (i2 != 8388613) {
            return 0;
        } else {
            int i9 = this.A0;
            if (i9 != 3) {
                return i9;
            }
            int i10 = Y == 0 ? this.y0 : this.x0;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
    }

    public int r(@x1 View view) {
        if (E(view)) {
            return q(((f) view.getLayoutParams()).d);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.v0) {
            return;
        }
        super.requestLayout();
    }

    @z1
    public CharSequence s(int i2) {
        int d2 = nq.d(i2, sr.Y(this));
        if (d2 == 3) {
            return this.J0;
        }
        if (d2 == 5) {
            return this.K0;
        }
        return null;
    }

    public void setDrawerElevation(float f2) {
        this.O = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (E(childAt)) {
                sr.M1(childAt, this.O);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.C0;
        if (eVar2 != null) {
            O(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.C0 = eVar;
    }

    public void setDrawerLockMode(int i2) {
        T(i2, 3);
        T(i2, 5);
    }

    public void setScrimColor(@w0 int i2) {
        this.Q = i2;
        invalidate();
    }

    public void setStatusBarBackground(@z1 Drawable drawable) {
        this.G0 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@w0 int i2) {
        this.G0 = new ColorDrawable(i2);
        invalidate();
    }

    public int t(View view) {
        return nq.d(((f) view.getLayoutParams()).d, sr.Y(this));
    }

    public float u(View view) {
        return ((f) view.getLayoutParams()).e;
    }

    public mu(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, lu.a.b);
    }

    public mu(@x1 Context context, @z1 AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.N = new d();
        this.Q = C;
        this.S = new Paint();
        this.w0 = true;
        this.x0 = 3;
        this.y0 = 3;
        this.z0 = 3;
        this.A0 = 3;
        this.N0 = null;
        this.O0 = null;
        this.P0 = null;
        this.Q0 = null;
        this.U0 = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.P = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        i iVar = new i(3);
        this.V = iVar;
        i iVar2 = new i(5);
        this.W = iVar2;
        eu p = eu.p(this, 1.0f, iVar);
        this.T = p;
        p.T(1);
        p.U(f3);
        iVar.q(p);
        eu p2 = eu.p(this, 1.0f, iVar2);
        this.U = p2;
        p2.T(2);
        p2.U(f3);
        iVar2.q(p2);
        setFocusableInTouchMode(true);
        sr.Q1(this, 1);
        sr.A1(this, new c());
        setMotionEventSplittingEnabled(false);
        if (sr.T(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(t);
            try {
                this.G0 = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, lu.j.g, i2, 0);
        try {
            int i3 = lu.j.h;
            if (obtainStyledAttributes2.hasValue(i3)) {
                this.O = obtainStyledAttributes2.getDimension(i3, 0.0f);
            } else {
                this.O = getResources().getDimension(lu.c.h);
            }
            obtainStyledAttributes2.recycle();
            this.R0 = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i2) {
        this.G0 = i2 != 0 ? gh.i(getContext(), i2) : null;
        invalidate();
    }

    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 4;
        public int d;
        public float e;
        public boolean f;
        public int g;

        public f(@x1 Context context, @z1 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.d = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mu.I);
            this.d = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(int i, int i2) {
            super(i, i2);
            this.d = 0;
        }

        public f(int i, int i2, int i3) {
            this(i, i2);
            this.d = i3;
        }

        public f(@x1 f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.d = 0;
            this.d = fVar.d;
        }

        public f(@x1 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.d = 0;
        }

        public f(@x1 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.d = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    public static class g extends au {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;

        /* compiled from: DrawerLayout.java */
        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(@x1 Parcel parcel, @z1 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.s = 0;
            this.s = parcel.readInt();
            this.t = parcel.readInt();
            this.u = parcel.readInt();
            this.v = parcel.readInt();
            this.w = parcel.readInt();
        }

        @Override // com.p7700g.p99005.au, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t);
            parcel.writeInt(this.u);
            parcel.writeInt(this.v);
            parcel.writeInt(this.w);
        }

        public g(@x1 Parcelable parcelable) {
            super(parcelable);
            this.s = 0;
        }
    }
}