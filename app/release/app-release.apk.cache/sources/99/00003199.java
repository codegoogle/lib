package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p7700g.p99005.au;
import com.p7700g.p99005.b1;
import com.p7700g.p99005.bm;
import com.p7700g.p99005.cf2;
import com.p7700g.p99005.dr;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.ep;
import com.p7700g.p99005.f1;
import com.p7700g.p99005.fk;
import com.p7700g.p99005.fq;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.gs;
import com.p7700g.p99005.ha2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.jr;
import com.p7700g.p99005.lh2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.m1;
import com.p7700g.p99005.mh2;
import com.p7700g.p99005.os;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.r3;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.ta2;
import com.p7700g.p99005.ua2;
import com.p7700g.p99005.w0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xa2;
import com.p7700g.p99005.yi2;
import com.p7700g.p99005.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 4;
    public static final int w = 8;
    private static final int x = ga2.n.ae;
    private static final int y = -1;
    private int A;
    private int B;
    private int C;
    private boolean D;
    private int E;
    @z1
    private gs F;
    private List<c> G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    @m1
    private int L;
    @z1
    private WeakReference<View> M;
    @z1
    private ValueAnimator N;
    private final List<g> O;
    private int[] P;
    @z1
    private Drawable Q;
    private Behavior R;
    private int z;

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends ta2<T> {
        private static final int l = 600;
        private int m;
        private int n;
        private ValueAnimator o;
        private f p;
        @z1
        private WeakReference<View> q;
        private e r;
        private boolean s;

        /* loaded from: classes2.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ CoordinatorLayout s;
            public final /* synthetic */ AppBarLayout t;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.s = coordinatorLayout;
                this.t = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
                BaseBehavior.this.X(this.s, this.t, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* loaded from: classes2.dex */
        public class b extends fq {
            public b() {
            }

            @Override // com.p7700g.p99005.fq
            public void g(View view, @x1 ls lsVar) {
                super.g(view, lsVar);
                lsVar.F1(BaseBehavior.this.s);
                lsVar.W0(ScrollView.class.getName());
            }
        }

        /* loaded from: classes2.dex */
        public class c implements os {
            public final /* synthetic */ CoordinatorLayout a;
            public final /* synthetic */ AppBarLayout b;
            public final /* synthetic */ View c;
            public final /* synthetic */ int d;

            public c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.a = coordinatorLayout;
                this.b = appBarLayout;
                this.c = view;
                this.d = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p7700g.p99005.os
            public boolean a(@x1 View view, @z1 os.a aVar) {
                BaseBehavior.this.r(this.a, this.b, this.c, 0, this.d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* loaded from: classes2.dex */
        public class d implements os {
            public final /* synthetic */ AppBarLayout a;
            public final /* synthetic */ boolean b;

            public d(AppBarLayout appBarLayout, boolean z) {
                this.a = appBarLayout;
                this.b = z;
            }

            @Override // com.p7700g.p99005.os
            public boolean a(@x1 View view, @z1 os.a aVar) {
                this.a.setExpanded(this.b);
                return true;
            }
        }

        /* loaded from: classes2.dex */
        public static abstract class e<T extends AppBarLayout> {
            public abstract boolean a(@x1 T t);
        }

        public BaseBehavior() {
        }

        private boolean F0(@x1 CoordinatorLayout coordinatorLayout, @x1 T t) {
            List<View> r = coordinatorLayout.r(t);
            int size = r.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.c f2 = ((CoordinatorLayout.g) r.get(i).getLayoutParams()).f();
                if (f2 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f2).S() != 0;
                }
            }
            return false;
        }

        private void G0(CoordinatorLayout coordinatorLayout, @x1 T t) {
            int paddingTop = t.getPaddingTop() + t.getTopInset();
            int U = U() - paddingTop;
            int m0 = m0(t, U);
            if (m0 >= 0) {
                View childAt = t.getChildAt(m0);
                f fVar = (f) childAt.getLayoutParams();
                int c2 = fVar.c();
                if ((c2 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (m0 == 0 && sr.T(t) && sr.T(childAt)) {
                        i -= t.getTopInset();
                    }
                    if (i0(c2, 2)) {
                        i2 += sr.d0(childAt);
                    } else if (i0(c2, 5)) {
                        int d0 = sr.d0(childAt) + i2;
                        if (U < d0) {
                            i = d0;
                        } else {
                            i2 = d0;
                        }
                    }
                    if (i0(c2, 32)) {
                        i += ((LinearLayout.LayoutParams) fVar).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) fVar).bottomMargin;
                    }
                    d0(coordinatorLayout, t, bm.e(f0(U, i2, i) + paddingTop, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void H0(CoordinatorLayout coordinatorLayout, @x1 T t) {
            View n0;
            sr.q1(coordinatorLayout, ls.a.n.b());
            sr.q1(coordinatorLayout, ls.a.o.b());
            if (t.getTotalScrollRange() == 0 || (n0 = n0(coordinatorLayout)) == null || !j0(t)) {
                return;
            }
            if (!sr.F0(coordinatorLayout)) {
                sr.A1(coordinatorLayout, new b());
            }
            this.s = b0(coordinatorLayout, t, n0);
        }

        private void I0(@x1 CoordinatorLayout coordinatorLayout, @x1 T t, int i, int i2, boolean z) {
            View l0 = l0(t, i);
            boolean z2 = false;
            if (l0 != null) {
                int c2 = ((f) l0.getLayoutParams()).c();
                if ((c2 & 1) != 0) {
                    int d0 = sr.d0(l0);
                    if (i2 <= 0 || (c2 & 12) == 0 ? !((c2 & 2) == 0 || (-i) < (l0.getBottom() - d0) - t.getTopInset()) : (-i) >= (l0.getBottom() - d0) - t.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (t.p()) {
                z2 = t.F(k0(coordinatorLayout));
            }
            boolean C = t.C(z2);
            if (z || (C && F0(coordinatorLayout, t))) {
                t.jumpDrawablesToCurrentState();
            }
        }

        private boolean b0(CoordinatorLayout coordinatorLayout, @x1 T t, @x1 View view) {
            boolean z = false;
            if (U() != (-t.getTotalScrollRange())) {
                c0(coordinatorLayout, t, ls.a.n, false);
                z = true;
            }
            if (U() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        sr.t1(coordinatorLayout, ls.a.o, null, new c(coordinatorLayout, t, view, i));
                        return true;
                    }
                } else {
                    c0(coordinatorLayout, t, ls.a.o, true);
                    return true;
                }
            }
            return z;
        }

        private void c0(CoordinatorLayout coordinatorLayout, @x1 T t, @x1 ls.a aVar, boolean z) {
            sr.t1(coordinatorLayout, aVar, null, new d(t, z));
        }

        private void d0(CoordinatorLayout coordinatorLayout, @x1 T t, int i, float f2) {
            int height;
            int abs = Math.abs(U() - i);
            float abs2 = Math.abs(f2);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            }
            e0(coordinatorLayout, t, i, height);
        }

        private void e0(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int U = U();
            if (U == i) {
                ValueAnimator valueAnimator = this.o;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.o.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.o;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.o = valueAnimator3;
                valueAnimator3.setInterpolator(ha2.e);
                this.o.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.o.setDuration(Math.min(i2, 600));
            this.o.setIntValues(U, i);
            this.o.start();
        }

        private int f0(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        private boolean h0(@x1 CoordinatorLayout coordinatorLayout, @x1 T t, @x1 View view) {
            return t.n() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        private static boolean i0(int i, int i2) {
            return (i & i2) == i2;
        }

        private boolean j0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((f) appBarLayout.getChildAt(i).getLayoutParams()).m != 0) {
                    return true;
                }
            }
            return false;
        }

        @z1
        private View k0(@x1 CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof dr) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @z1
        private static View l0(@x1 AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int m0(@x1 T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                f fVar = (f) childAt.getLayoutParams();
                if (i0(fVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) fVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) fVar).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        @z1
        private View n0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.g) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int q0(@x1 T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                f fVar = (f) childAt.getLayoutParams();
                Interpolator d2 = fVar.d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (d2 != null) {
                    int c2 = fVar.c();
                    if ((c2 & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                        if ((c2 & 2) != 0) {
                            i2 -= sr.d0(childAt);
                        }
                    }
                    if (sr.T(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f2 = i2;
                        return (childAt.getTop() + Math.round(d2.getInterpolation((abs - childAt.getTop()) / f2) * f2)) * Integer.signum(i);
                    }
                }
            }
            return i;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: A0 */
        public void D(CoordinatorLayout coordinatorLayout, @x1 T t, View view, int i) {
            if (this.n == 0 || i == 1) {
                G0(coordinatorLayout, t);
                if (t.p()) {
                    t.C(t.F(view));
                }
            }
            this.q = new WeakReference<>(view);
        }

        public void B0(@z1 f fVar, boolean z) {
            if (this.p == null || z) {
                this.p = fVar;
            }
        }

        @z1
        public f C0(@z1 Parcelable parcelable, @x1 T t) {
            int H = H();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + H;
                if (childAt.getTop() + H <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = au.EMPTY_STATE;
                    }
                    f fVar = new f(parcelable);
                    boolean z = H == 0;
                    fVar.t = z;
                    fVar.s = !z && (-H) >= t.getTotalScrollRange();
                    fVar.u = i;
                    fVar.w = bottom == t.getTopInset() + sr.d0(childAt);
                    fVar.v = bottom / childAt.getHeight();
                    return fVar;
                }
            }
            return null;
        }

        public void D0(@z1 e eVar) {
            this.r = eVar;
        }

        @Override // com.p7700g.p99005.ta2
        /* renamed from: E0 */
        public int Y(@x1 CoordinatorLayout coordinatorLayout, @x1 T t, int i, int i2, int i3) {
            int U = U();
            int i4 = 0;
            if (i2 != 0 && U >= i2 && U <= i3) {
                int e2 = bm.e(i, i2, i3);
                if (U != e2) {
                    int q0 = t.l() ? q0(t, e2) : e2;
                    boolean N = N(q0);
                    int i5 = U - e2;
                    this.m = e2 - q0;
                    if (N) {
                        while (i4 < t.getChildCount()) {
                            f fVar = (f) t.getChildAt(i4).getLayoutParams();
                            d b2 = fVar.b();
                            if (b2 != null && (fVar.c() & 1) != 0) {
                                b2.a(t, t.getChildAt(i4), H());
                            }
                            i4++;
                        }
                    }
                    if (!N && t.l()) {
                        coordinatorLayout.j(t);
                    }
                    t.r(H());
                    I0(coordinatorLayout, t, e2, e2 < U ? -1 : 1, false);
                    i4 = i5;
                }
            } else {
                this.m = 0;
            }
            H0(coordinatorLayout, t);
            return i4;
        }

        @Override // com.p7700g.p99005.ta2
        public int U() {
            return H() + this.m;
        }

        @Override // com.p7700g.p99005.ta2
        /* renamed from: g0 */
        public boolean P(T t) {
            e eVar = this.r;
            if (eVar != null) {
                return eVar.a(t);
            }
            WeakReference<View> weakReference = this.q;
            if (weakReference != null) {
                View view = weakReference.get();
                return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        @Override // com.p7700g.p99005.ta2
        /* renamed from: o0 */
        public int S(@x1 T t) {
            return -t.getDownNestedScrollRange();
        }

        @Override // com.p7700g.p99005.ta2
        /* renamed from: p0 */
        public int T(@x1 T t) {
            return t.getTotalScrollRange();
        }

        @r2
        public boolean r0() {
            ValueAnimator valueAnimator = this.o;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        @Override // com.p7700g.p99005.ta2
        /* renamed from: s0 */
        public void V(@x1 CoordinatorLayout coordinatorLayout, @x1 T t) {
            G0(coordinatorLayout, t);
            if (t.p()) {
                t.C(t.F(k0(coordinatorLayout)));
            }
        }

        @Override // com.p7700g.p99005.va2, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: t0 */
        public boolean m(@x1 CoordinatorLayout coordinatorLayout, @x1 T t, int i) {
            boolean m = super.m(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            f fVar = this.p;
            if (fVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -t.getUpNestedPreScrollRange();
                        if (z) {
                            d0(coordinatorLayout, t, i2, 0.0f);
                        } else {
                            X(coordinatorLayout, t, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            d0(coordinatorLayout, t, 0, 0.0f);
                        } else {
                            X(coordinatorLayout, t, 0);
                        }
                    }
                }
            } else if (fVar.s) {
                X(coordinatorLayout, t, -t.getTotalScrollRange());
            } else if (fVar.t) {
                X(coordinatorLayout, t, 0);
            } else {
                View childAt = t.getChildAt(fVar.u);
                int i3 = -childAt.getBottom();
                X(coordinatorLayout, t, this.p.w ? t.getTopInset() + sr.d0(childAt) + i3 : Math.round(childAt.getHeight() * this.p.v) + i3);
            }
            t.w();
            this.p = null;
            N(bm.e(H(), -t.getTotalScrollRange(), 0));
            I0(coordinatorLayout, t, H(), 0, true);
            t.r(H());
            H0(coordinatorLayout, t);
            return m;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: u0 */
        public boolean n(@x1 CoordinatorLayout coordinatorLayout, @x1 T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) t.getLayoutParams())).height == -2) {
                coordinatorLayout.I(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.n(coordinatorLayout, t, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: v0 */
        public void r(CoordinatorLayout coordinatorLayout, @x1 T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i4 = i6;
                    i5 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = W(coordinatorLayout, t, i2, i4, i5);
                }
            }
            if (t.p()) {
                t.C(t.F(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: w0 */
        public void u(CoordinatorLayout coordinatorLayout, @x1 T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = W(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                H0(coordinatorLayout, t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: x0 */
        public void y(@x1 CoordinatorLayout coordinatorLayout, @x1 T t, Parcelable parcelable) {
            if (parcelable instanceof f) {
                B0((f) parcelable, true);
                super.y(coordinatorLayout, t, this.p.getSuperState());
                return;
            }
            super.y(coordinatorLayout, t, parcelable);
            this.p = null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: y0 */
        public Parcelable z(@x1 CoordinatorLayout coordinatorLayout, @x1 T t) {
            Parcelable z = super.z(coordinatorLayout, t);
            f C0 = C0(z, t);
            return C0 == null ? z : C0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: z0 */
        public boolean B(@x1 CoordinatorLayout coordinatorLayout, @x1 T t, @x1 View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.p() || h0(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.o) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.n = i2;
            return z;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* loaded from: classes2.dex */
        public static class f extends au {
            public static final Parcelable.Creator<f> CREATOR = new a();
            public boolean s;
            public boolean t;
            public int u;
            public float v;
            public boolean w;

            /* loaded from: classes2.dex */
            public class a implements Parcelable.ClassLoaderCreator<f> {
                @Override // android.os.Parcelable.Creator
                @z1
                /* renamed from: a */
                public f createFromParcel(@x1 Parcel parcel) {
                    return new f(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                @x1
                /* renamed from: b */
                public f createFromParcel(@x1 Parcel parcel, ClassLoader classLoader) {
                    return new f(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @x1
                /* renamed from: c */
                public f[] newArray(int i) {
                    return new f[i];
                }
            }

            public f(@x1 Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.s = parcel.readByte() != 0;
                this.t = parcel.readByte() != 0;
                this.u = parcel.readInt();
                this.v = parcel.readFloat();
                this.w = parcel.readByte() != 0;
            }

            @Override // com.p7700g.p99005.au, android.os.Parcelable
            public void writeToParcel(@x1 Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.u);
                parcel.writeFloat(this.v);
                parcel.writeByte(this.w ? (byte) 1 : (byte) 0);
            }

            public f(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* loaded from: classes2.dex */
        public static abstract class a extends BaseBehavior.e<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void A0(CoordinatorLayout coordinatorLayout, @x1 AppBarLayout appBarLayout, View view, int i) {
            super.D(coordinatorLayout, appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void D0(@z1 BaseBehavior.e eVar) {
            super.D0(eVar);
        }

        @Override // com.p7700g.p99005.ta2, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean E(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, @x1 MotionEvent motionEvent) {
            return super.E(coordinatorLayout, view, motionEvent);
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ int G() {
            return super.G();
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ int H() {
            return super.H();
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ boolean I() {
            return super.I();
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ boolean J() {
            return super.J();
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ void L(boolean z) {
            super.L(z);
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ boolean M(int i) {
            return super.M(i);
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ boolean N(int i) {
            return super.N(i);
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ void O(boolean z) {
            super.O(z);
        }

        @Override // com.p7700g.p99005.ta2, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, @x1 MotionEvent motionEvent) {
            return super.l(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean t0(@x1 CoordinatorLayout coordinatorLayout, @x1 AppBarLayout appBarLayout, int i) {
            return super.m(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean u0(@x1 CoordinatorLayout coordinatorLayout, @x1 AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.n(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void v0(CoordinatorLayout coordinatorLayout, @x1 AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.r(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void w0(CoordinatorLayout coordinatorLayout, @x1 AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.u(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void x0(@x1 CoordinatorLayout coordinatorLayout, @x1 AppBarLayout appBarLayout, Parcelable parcelable) {
            super.y(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable y0(@x1 CoordinatorLayout coordinatorLayout, @x1 AppBarLayout appBarLayout) {
            return super.z(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean z0(@x1 CoordinatorLayout coordinatorLayout, @x1 AppBarLayout appBarLayout, @x1 View view, View view2, int i, int i2) {
            return super.B(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends ua2 {
        public ScrollingViewBehavior() {
        }

        private static int Z(@x1 AppBarLayout appBarLayout) {
            CoordinatorLayout.c f = ((CoordinatorLayout.g) appBarLayout.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).U();
            }
            return 0;
        }

        private void a0(@x1 View view, @x1 View view2) {
            CoordinatorLayout.c f = ((CoordinatorLayout.g) view2.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                sr.e1(view, (U() + (((BaseBehavior) f).m + (view2.getBottom() - view.getTop()))) - Q(view2));
            }
        }

        private void b0(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.p()) {
                    appBarLayout.C(appBarLayout.F(view));
                }
            }
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ int G() {
            return super.G();
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ int H() {
            return super.H();
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ boolean I() {
            return super.I();
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ boolean J() {
            return super.J();
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ void L(boolean z) {
            super.L(z);
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ boolean M(int i) {
            return super.M(i);
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ boolean N(int i) {
            return super.N(i);
        }

        @Override // com.p7700g.p99005.va2
        public /* bridge */ /* synthetic */ void O(boolean z) {
            super.O(z);
        }

        @Override // com.p7700g.p99005.ua2
        public float R(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int Z = Z(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + Z > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (Z / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.p7700g.p99005.ua2
        public int T(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.T(view);
        }

        @Override // com.p7700g.p99005.ua2
        @z1
        /* renamed from: Y */
        public AppBarLayout P(@x1 List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, @x1 View view2) {
            a0(view, view2);
            b0(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void j(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, @x1 View view2) {
            if (view2 instanceof AppBarLayout) {
                sr.q1(coordinatorLayout, ls.a.n.b());
                sr.q1(coordinatorLayout, ls.a.o.b());
                sr.A1(coordinatorLayout, null);
            }
        }

        @Override // com.p7700g.p99005.va2, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, int i) {
            return super.m(coordinatorLayout, view, i);
        }

        @Override // com.p7700g.p99005.ua2, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean n(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, int i, int i2, int i3, int i4) {
            return super.n(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean x(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, @x1 Rect rect, boolean z) {
            AppBarLayout P = P(coordinatorLayout.q(view));
            if (P != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    P.x(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ga2.o.Eq);
            W(obtainStyledAttributes.getDimensionPixelSize(ga2.o.Fq, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes2.dex */
    public class a implements jr {
        public a() {
        }

        @Override // com.p7700g.p99005.jr
        public gs a(View view, gs gsVar) {
            return AppBarLayout.this.s(gsVar);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ lh2 s;

        public b(lh2 lh2Var) {
            this.s = lh2Var;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.s.n0(floatValue);
            if (AppBarLayout.this.Q instanceof lh2) {
                ((lh2) AppBarLayout.this.Q).n0(floatValue);
            }
            for (g gVar : AppBarLayout.this.O) {
                gVar.a(floatValue, this.s.D());
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c<T extends AppBarLayout> {
        void a(T t, int i);
    }

    /* loaded from: classes2.dex */
    public static abstract class d {
        public abstract void a(@x1 AppBarLayout appBarLayout, @x1 View view, float f);
    }

    /* loaded from: classes2.dex */
    public static class e extends d {
        private static final float a = 0.3f;
        private final Rect b = new Rect();
        private final Rect c = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.d
        public void a(@x1 AppBarLayout appBarLayout, @x1 View view, float f) {
            b(this.b, appBarLayout, view);
            float abs = this.b.top - Math.abs(f);
            if (abs <= 0.0f) {
                float d = 1.0f - bm.d(Math.abs(abs / this.b.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.b.height() * 0.3f) * (1.0f - (d * d)));
                view.setTranslationY(height);
                view.getDrawingRect(this.c);
                this.c.offset(0, (int) (-height));
                sr.L1(view, this.c);
                return;
            }
            sr.L1(view, null);
            view.setTranslationY(0.0f);
        }
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(@b1 float f, @w0 int i);
    }

    /* loaded from: classes2.dex */
    public interface h extends c<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.c
        void a(AppBarLayout appBarLayout, int i);
    }

    public AppBarLayout(@x1 Context context) {
        this(context, null);
    }

    private boolean A(boolean z) {
        if (this.I != z) {
            this.I = z;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    private boolean E() {
        return this.Q != null && getTopInset() > 0;
    }

    private boolean G() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return (childAt.getVisibility() == 8 || sr.T(childAt)) ? false : true;
        }
        return false;
    }

    private void H(@x1 lh2 lh2Var, boolean z) {
        float dimension = getResources().getDimension(ga2.f.P0);
        float f2 = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, dimension);
        this.N = ofFloat;
        ofFloat.setDuration(getResources().getInteger(ga2.i.c));
        this.N.setInterpolator(ha2.a);
        this.N.addUpdateListener(new b(lh2Var));
        this.N.start();
    }

    private void I() {
        setWillNotDraw(!E());
    }

    private void g() {
        WeakReference<View> weakReference = this.M;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.M = null;
    }

    @z1
    private View h(@z1 View view) {
        int i;
        if (this.M == null && (i = this.L) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.L);
            }
            if (findViewById != null) {
                this.M = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.M;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean m() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((f) getChildAt(i).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void o() {
        Behavior behavior = this.R;
        BaseBehavior.f C0 = (behavior == null || this.A == -1 || this.E != 0) ? null : behavior.C0(au.EMPTY_STATE, this);
        this.A = -1;
        this.B = -1;
        this.C = -1;
        if (C0 != null) {
            this.R.B0(C0, false);
        }
    }

    private void y(boolean z, boolean z2, boolean z3) {
        this.E = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public boolean B(boolean z) {
        return D(z, true);
    }

    public boolean C(boolean z) {
        return D(z, !this.H);
    }

    public boolean D(boolean z, boolean z2) {
        if (!z2 || this.J == z) {
            return false;
        }
        this.J = z;
        refreshDrawableState();
        if (this.K && (getBackground() instanceof lh2)) {
            H((lh2) getBackground(), z);
            return true;
        }
        return true;
    }

    public boolean F(@z1 View view) {
        View h2 = h(view);
        if (h2 != null) {
            view = h2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void c(@x1 g gVar) {
        this.O.add(gVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    public void d(@z1 c cVar) {
        if (this.G == null) {
            this.G = new ArrayList();
        }
        if (cVar == null || this.G.contains(cVar)) {
            return;
        }
        this.G.add(cVar);
    }

    @Override // android.view.View
    public void draw(@x1 Canvas canvas) {
        super.draw(canvas);
        if (E()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.z);
            this.Q.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.Q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public void e(h hVar) {
        d(hVar);
    }

    public void f() {
        this.O.clear();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @x1
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.R = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int d0;
        int i2 = this.B;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = fVar.m;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                if ((i4 & 8) != 0) {
                    d0 = sr.d0(childAt);
                } else if ((i4 & 2) != 0) {
                    d0 = measuredHeight - sr.d0(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && sr.T(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = d0 + i5;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - getTopInset());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.B = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.C;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin + childAt.getMeasuredHeight();
            int i4 = fVar.m;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= sr.d0(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.C = max;
        return max;
    }

    @m1
    public int getLiftOnScrollTargetViewId() {
        return this.L;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int d0 = sr.d0(this);
        if (d0 == 0) {
            int childCount = getChildCount();
            d0 = childCount >= 1 ? sr.d0(getChildAt(childCount - 1)) : 0;
            if (d0 == 0) {
                return getHeight() / 3;
            }
        }
        return (d0 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.E;
    }

    @z1
    public Drawable getStatusBarForeground() {
        return this.Q;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @r2
    public final int getTopInset() {
        gs gsVar = this.F;
        if (gsVar != null) {
            return gsVar.r();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.A;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = fVar.m;
            if ((i4 & 1) == 0) {
                break;
            }
            int i5 = measuredHeight + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin + i3;
            if (i2 == 0 && sr.T(childAt)) {
                i5 -= getTopInset();
            }
            i3 = i5;
            if ((i4 & 2) != 0) {
                i3 -= sr.d0(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.A = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i */
    public f generateDefaultLayoutParams() {
        return new f(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: j */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: k */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new f((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public boolean l() {
        return this.D;
    }

    public boolean n() {
        return getTotalScrollRange() != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mh2.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.P == null) {
            this.P = new int[4];
        }
        int[] iArr = this.P;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.I;
        int i2 = ga2.c.De;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.J) ? ga2.c.Ee : -ga2.c.Ee;
        int i3 = ga2.c.Be;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.J) ? ga2.c.Ae : -ga2.c.Ae;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (sr.T(this) && G()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                sr.e1(getChildAt(childCount), topInset);
            }
        }
        o();
        this.D = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((f) getChildAt(i5).getLayoutParams()).d() != null) {
                this.D = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.Q;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.H) {
            return;
        }
        if (!this.K && !m()) {
            z2 = false;
        }
        A(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && sr.T(this) && G()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = bm.e(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    public boolean p() {
        return this.K;
    }

    public boolean q() {
        return this.J;
    }

    public void r(int i) {
        this.z = i;
        if (!willNotDraw()) {
            sr.m1(this);
        }
        List<c> list = this.G;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                c cVar = this.G.get(i2);
                if (cVar != null) {
                    cVar.a(this, i);
                }
            }
        }
    }

    public gs s(gs gsVar) {
        gs gsVar2 = sr.T(this) ? gsVar : null;
        if (!ep.a(this.F, gsVar2)) {
            this.F = gsVar2;
            I();
            requestLayout();
        }
        return gsVar;
    }

    @Override // android.view.View
    @e2(21)
    public void setElevation(float f2) {
        super.setElevation(f2);
        mh2.d(this, f2);
    }

    public void setExpanded(boolean z) {
        x(z, sr.T0(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.K = z;
    }

    public void setLiftOnScrollTargetViewId(@m1 int i) {
        this.L = i;
        g();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.H = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(@z1 Drawable drawable) {
        Drawable drawable2 = this.Q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.Q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.Q.setState(getDrawableState());
                }
                fk.m(this.Q, sr.Y(this));
                this.Q.setVisible(getVisibility() == 0, false);
                this.Q.setCallback(this);
            }
            I();
            sr.m1(this);
        }
    }

    public void setStatusBarForegroundColor(@w0 int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(@f1 int i) {
        setStatusBarForeground(r3.b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        xa2.b(this, f2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.Q;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public boolean t(@x1 g gVar) {
        return this.O.remove(gVar);
    }

    public void u(@z1 c cVar) {
        List<c> list = this.G;
        if (list == null || cVar == null) {
            return;
        }
        list.remove(cVar);
    }

    public void v(h hVar) {
        u(hVar);
    }

    @Override // android.view.View
    public boolean verifyDrawable(@x1 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.Q;
    }

    public void w() {
        this.E = 0;
    }

    public void x(boolean z, boolean z2) {
        y(z, z2, true);
    }

    public boolean z(boolean z) {
        this.H = true;
        return A(z);
    }

    public AppBarLayout(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.S);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppBarLayout(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = x;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.E = 0;
        this.O = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i3 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            xa2.a(this);
        }
        xa2.c(this, attributeSet, i, i2);
        TypedArray j = cf2.j(context2, attributeSet, ga2.o.r0, i, i2, new int[0]);
        sr.H1(this, j.getDrawable(ga2.o.s0));
        if (getBackground() instanceof ColorDrawable) {
            lh2 lh2Var = new lh2();
            lh2Var.o0(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            lh2Var.Z(context2);
            sr.H1(this, lh2Var);
        }
        int i4 = ga2.o.w0;
        if (j.hasValue(i4)) {
            y(j.getBoolean(i4, false), false, false);
        }
        int i5 = ga2.o.v0;
        if (j.hasValue(i5)) {
            xa2.b(this, j.getDimensionPixelSize(i5, 0));
        }
        if (i3 >= 26) {
            int i6 = ga2.o.u0;
            if (j.hasValue(i6)) {
                setKeyboardNavigationCluster(j.getBoolean(i6, false));
            }
            int i7 = ga2.o.t0;
            if (j.hasValue(i7)) {
                setTouchscreenBlocksFocus(j.getBoolean(i7, false));
            }
        }
        this.K = j.getBoolean(ga2.o.x0, false);
        this.L = j.getResourceId(ga2.o.y0, -1);
        setStatusBarForeground(j.getDrawable(ga2.o.z0));
        j.recycle();
        sr.Z1(this, new a());
    }

    /* loaded from: classes2.dex */
    public static class f extends LinearLayout.LayoutParams {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 4;
        public static final int e = 8;
        public static final int f = 16;
        public static final int g = 32;
        public static final int h = 5;
        public static final int i = 17;
        public static final int j = 10;
        private static final int k = 0;
        private static final int l = 1;
        public int m;
        private d n;
        public Interpolator o;

        @i2({i2.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface a {
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.m = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ga2.o.F0);
            this.m = obtainStyledAttributes.getInt(ga2.o.H0, 0);
            f(a(obtainStyledAttributes.getInt(ga2.o.G0, 0)));
            int i2 = ga2.o.I0;
            if (obtainStyledAttributes.hasValue(i2)) {
                this.o = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        @z1
        private d a(int i2) {
            if (i2 != 1) {
                return null;
            }
            return new e();
        }

        @z1
        public d b() {
            return this.n;
        }

        public int c() {
            return this.m;
        }

        public Interpolator d() {
            return this.o;
        }

        public boolean e() {
            int i2 = this.m;
            return (i2 & 1) == 1 && (i2 & 10) != 0;
        }

        public void f(@z1 d dVar) {
            this.n = dVar;
        }

        public void g(int i2) {
            this.m = i2;
        }

        public void h(Interpolator interpolator) {
            this.o = interpolator;
        }

        public f(int i2, int i3) {
            super(i2, i3);
            this.m = 1;
        }

        public f(int i2, int i3, float f2) {
            super(i2, i3, f2);
            this.m = 1;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.m = 1;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.m = 1;
        }

        @e2(19)
        public f(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.m = 1;
        }

        @e2(19)
        public f(@x1 f fVar) {
            super((LinearLayout.LayoutParams) fVar);
            this.m = 1;
            this.m = fVar.m;
            this.o = fVar.o;
        }
    }
}