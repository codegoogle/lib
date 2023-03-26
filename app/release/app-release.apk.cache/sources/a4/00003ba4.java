package com.p7700g.p99005;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.p7700g.p99005.cu;
import java.util.ArrayList;
import java.util.List;
import org.xbill.DNS.WKSRecord;

/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes.dex */
public abstract class bu extends fq {
    public static final int d = Integer.MIN_VALUE;
    public static final int e = -1;
    private static final String f = "android.view.View";
    private static final Rect g = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final cu.a<ls> h = new a();
    private static final cu.b<z7<ls>, ls> i = new b();
    private final AccessibilityManager n;
    private final View o;
    private c p;
    private final Rect j = new Rect();
    private final Rect k = new Rect();
    private final Rect l = new Rect();
    private final int[] m = new int[2];
    public int q = Integer.MIN_VALUE;
    public int r = Integer.MIN_VALUE;
    private int s = Integer.MIN_VALUE;

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    public class a implements cu.a<ls> {
        @Override // com.p7700g.p99005.cu.a
        /* renamed from: b */
        public void a(ls lsVar, Rect rect) {
            lsVar.s(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    public class b implements cu.b<z7<ls>, ls> {
        @Override // com.p7700g.p99005.cu.b
        /* renamed from: c */
        public ls a(z7<ls> z7Var, int i) {
            return z7Var.J(i);
        }

        @Override // com.p7700g.p99005.cu.b
        /* renamed from: d */
        public int b(z7<ls> z7Var) {
            return z7Var.I();
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    public class c extends ms {
        public c() {
        }

        @Override // com.p7700g.p99005.ms
        public ls b(int i) {
            return ls.F0(bu.this.L(i));
        }

        @Override // com.p7700g.p99005.ms
        public ls d(int i) {
            int i2 = i == 2 ? bu.this.q : bu.this.r;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // com.p7700g.p99005.ms
        public boolean f(int i, int i2, Bundle bundle) {
            return bu.this.T(i, i2, bundle);
        }
    }

    public bu(@x1 View view) {
        if (view != null) {
            this.o = view;
            this.n = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (sr.U(view) == 0) {
                sr.Q1(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect E(@x1 View view, int i2, @x1 Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i2 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean I(Rect rect) {
        if (rect == null || rect.isEmpty() || this.o.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.o.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int J(int i2) {
        if (i2 != 19) {
            if (i2 != 21) {
                if (i2 != 22) {
                    return WKSRecord.Service.CISCO_FNA;
                }
                return 66;
            }
            return 17;
        }
        return 33;
    }

    private boolean K(int i2, @z1 Rect rect) {
        ls lsVar;
        z7<ls> y = y();
        int i3 = this.r;
        ls h2 = i3 == Integer.MIN_VALUE ? null : y.h(i3);
        if (i2 == 1 || i2 == 2) {
            lsVar = (ls) cu.d(y, i, h, h2, i2, sr.Y(this.o) == 1, false);
        } else if (i2 != 17 && i2 != 33 && i2 != 66 && i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i4 = this.r;
            if (i4 != Integer.MIN_VALUE) {
                z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                E(this.o, i2, rect2);
            }
            lsVar = (ls) cu.c(y, i, h, h2, rect2, i2);
        }
        return X(lsVar != null ? y.t(y.o(lsVar)) : Integer.MIN_VALUE);
    }

    private boolean U(int i2, int i3, Bundle bundle) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 64) {
                    if (i3 != 128) {
                        return N(i2, i3, bundle);
                    }
                    return n(i2);
                }
                return W(i2);
            }
            return o(i2);
        }
        return X(i2);
    }

    private boolean V(int i2, Bundle bundle) {
        return sr.k1(this.o, i2, bundle);
    }

    private boolean W(int i2) {
        int i3;
        if (this.n.isEnabled() && this.n.isTouchExplorationEnabled() && (i3 = this.q) != i2) {
            if (i3 != Integer.MIN_VALUE) {
                n(i3);
            }
            this.q = i2;
            this.o.invalidate();
            Y(i2, 32768);
            return true;
        }
        return false;
    }

    private void Z(int i2) {
        int i3 = this.s;
        if (i3 == i2) {
            return;
        }
        this.s = i2;
        Y(i2, 128);
        Y(i3, 256);
    }

    private boolean n(int i2) {
        if (this.q == i2) {
            this.q = Integer.MIN_VALUE;
            this.o.invalidate();
            Y(i2, 65536);
            return true;
        }
        return false;
    }

    private boolean p() {
        int i2 = this.r;
        return i2 != Integer.MIN_VALUE && N(i2, 16, null);
    }

    private AccessibilityEvent q(int i2, int i3) {
        if (i2 != -1) {
            return r(i2, i3);
        }
        return s(i3);
    }

    private AccessibilityEvent r(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        ls L = L(i2);
        obtain.getText().add(L.U());
        obtain.setContentDescription(L.A());
        obtain.setScrollable(L.x0());
        obtain.setPassword(L.v0());
        obtain.setEnabled(L.o0());
        obtain.setChecked(L.i0());
        P(i2, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(L.w());
        ns.Y(obtain, this.o, i2);
        obtain.setPackageName(this.o.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent s(int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        this.o.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @x1
    private ls t(int i2) {
        ls C0 = ls.C0();
        C0.g1(true);
        C0.i1(true);
        C0.W0("android.view.View");
        Rect rect = g;
        C0.R0(rect);
        C0.S0(rect);
        C0.z1(this.o);
        R(i2, C0);
        if (C0.U() == null && C0.A() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        C0.s(this.k);
        if (!this.k.equals(rect)) {
            int p = C0.p();
            if ((p & 64) == 0) {
                if ((p & 128) == 0) {
                    C0.x1(this.o.getContext().getPackageName());
                    C0.J1(this.o, i2);
                    if (this.q == i2) {
                        C0.O0(true);
                        C0.a(128);
                    } else {
                        C0.O0(false);
                        C0.a(64);
                    }
                    boolean z = this.r == i2;
                    if (z) {
                        C0.a(2);
                    } else if (C0.p0()) {
                        C0.a(1);
                    }
                    C0.j1(z);
                    this.o.getLocationOnScreen(this.m);
                    C0.t(this.j);
                    if (this.j.equals(rect)) {
                        C0.s(this.j);
                        if (C0.g0 != -1) {
                            ls C02 = ls.C0();
                            for (int i3 = C0.g0; i3 != -1; i3 = C02.g0) {
                                C02.A1(this.o, -1);
                                C02.R0(g);
                                R(i3, C02);
                                C02.s(this.k);
                                Rect rect2 = this.j;
                                Rect rect3 = this.k;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            C02.I0();
                        }
                        this.j.offset(this.m[0] - this.o.getScrollX(), this.m[1] - this.o.getScrollY());
                    }
                    if (this.o.getLocalVisibleRect(this.l)) {
                        this.l.offset(this.m[0] - this.o.getScrollX(), this.m[1] - this.o.getScrollY());
                        if (this.j.intersect(this.l)) {
                            C0.S0(this.j);
                            if (I(this.j)) {
                                C0.V1(true);
                            }
                        }
                    }
                    return C0;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    @x1
    private ls u() {
        ls D0 = ls.D0(this.o);
        sr.h1(this.o, D0);
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        if (D0.v() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            D0.d(this.o, ((Integer) arrayList.get(i2)).intValue());
        }
        return D0;
    }

    private z7<ls> y() {
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        z7<ls> z7Var = new z7<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            z7Var.u(((Integer) arrayList.get(i2)).intValue(), t(((Integer) arrayList.get(i2)).intValue()));
        }
        return z7Var;
    }

    private void z(int i2, Rect rect) {
        L(i2).s(rect);
    }

    @Deprecated
    public int A() {
        return x();
    }

    public final int B() {
        return this.r;
    }

    public abstract int C(float f2, float f3);

    public abstract void D(List<Integer> list);

    public final void F() {
        H(-1, 1);
    }

    public final void G(int i2) {
        H(i2, 0);
    }

    public final void H(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.n.isEnabled() || (parent = this.o.getParent()) == null) {
            return;
        }
        AccessibilityEvent q = q(i2, 2048);
        js.i(q, i3);
        parent.requestSendAccessibilityEvent(this.o, q);
    }

    @x1
    public ls L(int i2) {
        if (i2 == -1) {
            return u();
        }
        return t(i2);
    }

    public final void M(boolean z, int i2, @z1 Rect rect) {
        int i3 = this.r;
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        if (z) {
            K(i2, rect);
        }
    }

    public abstract boolean N(int i2, int i3, @z1 Bundle bundle);

    public void O(@x1 AccessibilityEvent accessibilityEvent) {
    }

    public void P(int i2, @x1 AccessibilityEvent accessibilityEvent) {
    }

    public void Q(@x1 ls lsVar) {
    }

    public abstract void R(int i2, @x1 ls lsVar);

    public void S(int i2, boolean z) {
    }

    public boolean T(int i2, int i3, Bundle bundle) {
        if (i2 != -1) {
            return U(i2, i3, bundle);
        }
        return V(i3, bundle);
    }

    public final boolean X(int i2) {
        int i3;
        if ((this.o.isFocused() || this.o.requestFocus()) && (i3 = this.r) != i2) {
            if (i3 != Integer.MIN_VALUE) {
                o(i3);
            }
            if (i2 == Integer.MIN_VALUE) {
                return false;
            }
            this.r = i2;
            S(i2, true);
            Y(i2, 8);
            return true;
        }
        return false;
    }

    public final boolean Y(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.n.isEnabled() || (parent = this.o.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.o, q(i2, i3));
    }

    @Override // com.p7700g.p99005.fq
    public ms b(View view) {
        if (this.p == null) {
            this.p = new c();
        }
        return this.p;
    }

    @Override // com.p7700g.p99005.fq
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        O(accessibilityEvent);
    }

    @Override // com.p7700g.p99005.fq
    public void g(View view, ls lsVar) {
        super.g(view, lsVar);
        Q(lsVar);
    }

    public final boolean o(int i2) {
        if (this.r != i2) {
            return false;
        }
        this.r = Integer.MIN_VALUE;
        S(i2, false);
        Y(i2, 8);
        return true;
    }

    public final boolean v(@x1 MotionEvent motionEvent) {
        if (this.n.isEnabled() && this.n.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && this.s != Integer.MIN_VALUE) {
                    Z(Integer.MIN_VALUE);
                    return true;
                }
                return false;
            }
            int C = C(motionEvent.getX(), motionEvent.getY());
            Z(C);
            return C != Integer.MIN_VALUE;
        }
        return false;
    }

    public final boolean w(@x1 KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int J = J(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && K(J, null)) {
                                    i2++;
                                    z = true;
                                }
                                return z;
                            }
                            return false;
                        case 23:
                            break;
                        default:
                            return false;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    p();
                    return true;
                }
                return false;
            } else if (keyEvent.hasNoModifiers()) {
                return K(2, null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return K(1, null);
                }
                return false;
            }
        }
        return false;
    }

    public final int x() {
        return this.q;
    }
}