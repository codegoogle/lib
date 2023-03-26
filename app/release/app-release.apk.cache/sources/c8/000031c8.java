package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p7700g.p99005.au;
import com.p7700g.p99005.bm;
import com.p7700g.p99005.c2;
import com.p7700g.p99005.eu;
import com.p7700g.p99005.g1;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.gs;
import com.p7700g.p99005.hj;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.kf2;
import com.p7700g.p99005.l2;
import com.p7700g.p99005.lh2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.os;
import com.p7700g.p99005.qh2;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.sg2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zg2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = -1;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 4;
    public static final int k = 8;
    public static final int l = -1;
    public static final int m = 0;
    private static final String n = "BottomSheetBehavior";
    private static final int o = 500;
    private static final float p = 0.5f;
    private static final float q = 0.1f;
    private static final int r = 500;
    private static final int s = -1;
    private static final int t = ga2.n.ce;
    private int A;
    private int B;
    private lh2 C;
    @z1
    private ColorStateList D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private int P;
    private int Q;
    private qh2 R;
    private boolean S;
    private final BottomSheetBehavior<V>.k T;
    @z1
    private ValueAnimator U;
    public int V;
    public int W;
    public int X;
    public float Y;
    public int Z;
    public float a0;
    public boolean b0;
    private boolean c0;
    private boolean d0;
    public int e0;
    public int f0;
    @z1
    public eu g0;
    private boolean h0;
    private int i0;
    private boolean j0;
    private int k0;
    public int l0;
    public int m0;
    @z1
    public WeakReference<V> n0;
    @z1
    public WeakReference<View> o0;
    @x1
    private final ArrayList<f> p0;
    @z1
    private VelocityTracker q0;
    public int r0;
    private int s0;
    public boolean t0;
    private int u;
    @z1
    private Map<View, Integer> u0;
    private boolean v;
    private int v0;
    private boolean w;
    private final eu.c w0;
    private float x;
    private int y;
    private boolean z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public final /* synthetic */ View s;
        public final /* synthetic */ int t;

        public a(View view, int i) {
            this.s = view;
            this.t = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.f1(this.s, this.t, false);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.C != null) {
                BottomSheetBehavior.this.C.p0(floatValue);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements kf2.e {
        public final /* synthetic */ boolean a;

        public c(boolean z) {
            this.a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        @Override // com.p7700g.p99005.kf2.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public gs a(View view, gs gsVar, kf2.f fVar) {
            boolean z;
            hj f = gsVar.f(gs.m.i());
            hj f2 = gsVar.f(gs.m.f());
            BottomSheetBehavior.this.Q = f.c;
            boolean k = kf2.k(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.I) {
                BottomSheetBehavior.this.P = gsVar.o();
                paddingBottom = fVar.d + BottomSheetBehavior.this.P;
            }
            if (BottomSheetBehavior.this.J) {
                paddingLeft = (k ? fVar.c : fVar.a) + f.b;
            }
            if (BottomSheetBehavior.this.K) {
                paddingRight = (k ? fVar.a : fVar.c) + f.d;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z2 = true;
            if (BottomSheetBehavior.this.M) {
                int i = marginLayoutParams.leftMargin;
                int i2 = f.b;
                if (i != i2) {
                    marginLayoutParams.leftMargin = i2;
                    z = true;
                    if (BottomSheetBehavior.this.N) {
                        int i3 = marginLayoutParams.rightMargin;
                        int i4 = f.d;
                        if (i3 != i4) {
                            marginLayoutParams.rightMargin = i4;
                            z = true;
                        }
                    }
                    if (BottomSheetBehavior.this.O) {
                        int i5 = marginLayoutParams.topMargin;
                        int i6 = f.c;
                        if (i5 != i6) {
                            marginLayoutParams.topMargin = i6;
                            if (z2) {
                                view.setLayoutParams(marginLayoutParams);
                            }
                            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                            if (this.a) {
                                BottomSheetBehavior.this.G = f2.e;
                            }
                            if (!BottomSheetBehavior.this.I || this.a) {
                                BottomSheetBehavior.this.j1(false);
                            }
                            return gsVar;
                        }
                    }
                    z2 = z;
                    if (z2) {
                    }
                    view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                    if (this.a) {
                    }
                    if (!BottomSheetBehavior.this.I) {
                    }
                    BottomSheetBehavior.this.j1(false);
                    return gsVar;
                }
            }
            z = false;
            if (BottomSheetBehavior.this.N) {
            }
            if (BottomSheetBehavior.this.O) {
            }
            z2 = z;
            if (z2) {
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.a) {
            }
            if (!BottomSheetBehavior.this.I) {
            }
            BottomSheetBehavior.this.j1(false);
            return gsVar;
        }
    }

    /* loaded from: classes2.dex */
    public class d extends eu.c {
        private long a;

        public d() {
        }

        private boolean n(@x1 View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.k0() + bottomSheetBehavior.m0) / 2;
        }

        @Override // com.p7700g.p99005.eu.c
        public int a(@x1 View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // com.p7700g.p99005.eu.c
        public int b(@x1 View view, int i, int i2) {
            int k0 = BottomSheetBehavior.this.k0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bm.e(i, k0, bottomSheetBehavior.b0 ? bottomSheetBehavior.m0 : bottomSheetBehavior.Z);
        }

        @Override // com.p7700g.p99005.eu.c
        public int e(@x1 View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.b0) {
                return bottomSheetBehavior.m0;
            }
            return bottomSheetBehavior.Z;
        }

        @Override // com.p7700g.p99005.eu.c
        public void j(int i) {
            if (i == 1 && BottomSheetBehavior.this.d0) {
                BottomSheetBehavior.this.X0(1);
            }
        }

        @Override // com.p7700g.p99005.eu.c
        public void k(@x1 View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.g0(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
            if (r11.a1(r4, (r10 * 100.0f) / r11.m0) != false) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
            if (r10 > r8.b.X) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
            if (java.lang.Math.abs(r9.getTop() - r8.b.k0()) < java.lang.Math.abs(r9.getTop() - r8.b.X)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
            if (r8.b.d1() == false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
            if (java.lang.Math.abs(r10 - r8.b.W) < java.lang.Math.abs(r10 - r8.b.Z)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
            if (r8.b.d1() != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0122, code lost:
            if (r8.b.d1() == false) goto L6;
         */
        @Override // com.p7700g.p99005.eu.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void l(@x1 View view, float f, float f2) {
            int i = 6;
            if (f2 < 0.0f) {
                if (!BottomSheetBehavior.this.v) {
                    int top = view.getTop();
                    long currentTimeMillis = System.currentTimeMillis() - this.a;
                    if (BottomSheetBehavior.this.d1()) {
                        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    }
                }
                i = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.b0 && bottomSheetBehavior2.c1(view, f2)) {
                    if ((Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) && !n(view)) {
                        if (!BottomSheetBehavior.this.v) {
                        }
                        i = 3;
                    } else {
                        i = 5;
                    }
                } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                    if (!BottomSheetBehavior.this.v) {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.X) < Math.abs(top2 - BottomSheetBehavior.this.Z)) {
                        }
                    }
                    i = 4;
                } else {
                    int top3 = view.getTop();
                    if (!BottomSheetBehavior.this.v) {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i2 = bottomSheetBehavior3.X;
                        if (top3 < i2) {
                            if (top3 >= Math.abs(top3 - bottomSheetBehavior3.Z)) {
                            }
                            i = 3;
                        } else {
                            if (Math.abs(top3 - i2) < Math.abs(top3 - BottomSheetBehavior.this.Z)) {
                            }
                            i = 4;
                        }
                    }
                }
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.f1(view, i, bottomSheetBehavior4.e1());
        }

        @Override // com.p7700g.p99005.eu.c
        public boolean m(@x1 View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.e0;
            if (i2 == 1 || bottomSheetBehavior.t0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.r0 == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.o0;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.n0;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* loaded from: classes2.dex */
    public class e implements os {
        public final /* synthetic */ int a;

        public e(int i) {
            this.a = i;
        }

        @Override // com.p7700g.p99005.os
        public boolean a(@x1 View view, @z1 os.a aVar) {
            BottomSheetBehavior.this.W0(this.a);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class f {
        public void a(@x1 View view) {
        }

        public abstract void b(@x1 View view, float f);

        public abstract void c(@x1 View view, int i);
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface g {
    }

    /* loaded from: classes2.dex */
    public static class h extends au {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public final int s;
        public int t;
        public boolean u;
        public boolean v;
        public boolean w;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            @z1
            /* renamed from: a */
            public h createFromParcel(@x1 Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @x1
            /* renamed from: b */
            public h createFromParcel(@x1 Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: c */
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        public h(@x1 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // com.p7700g.p99005.au, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t);
            parcel.writeInt(this.u ? 1 : 0);
            parcel.writeInt(this.v ? 1 : 0);
            parcel.writeInt(this.w ? 1 : 0);
        }

        public h(@x1 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.s = parcel.readInt();
            this.t = parcel.readInt();
            this.u = parcel.readInt() == 1;
            this.v = parcel.readInt() == 1;
            this.w = parcel.readInt() == 1;
        }

        public h(Parcelable parcelable, @x1 BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.s = bottomSheetBehavior.e0;
            this.t = ((BottomSheetBehavior) bottomSheetBehavior).y;
            this.u = ((BottomSheetBehavior) bottomSheetBehavior).v;
            this.v = bottomSheetBehavior.b0;
            this.w = ((BottomSheetBehavior) bottomSheetBehavior).c0;
        }

        @Deprecated
        public h(Parcelable parcelable, int i) {
            super(parcelable);
            this.s = i;
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface i {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface j {
    }

    public BottomSheetBehavior() {
        this.u = 0;
        this.v = true;
        this.w = false;
        this.E = -1;
        this.F = -1;
        this.T = new k(this, null);
        this.Y = 0.5f;
        this.a0 = -1.0f;
        this.d0 = true;
        this.e0 = 4;
        this.f0 = 4;
        this.p0 = new ArrayList<>();
        this.v0 = -1;
        this.w0 = new d();
    }

    private boolean B0(V v) {
        ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && sr.N0(v);
    }

    private void E0(V v, ls.a aVar, int i2) {
        sr.t1(v, aVar, null, c0(i2));
    }

    private void F0() {
        this.r0 = -1;
        VelocityTracker velocityTracker = this.q0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.q0 = null;
        }
    }

    private void G0(@x1 h hVar) {
        int i2 = this.u;
        if (i2 == 0) {
            return;
        }
        if (i2 == -1 || (i2 & 1) == 1) {
            this.y = hVar.t;
        }
        if (i2 == -1 || (i2 & 2) == 2) {
            this.v = hVar.u;
        }
        if (i2 == -1 || (i2 & 4) == 4) {
            this.b0 = hVar.v;
        }
        if (i2 == -1 || (i2 & 8) == 8) {
            this.c0 = hVar.w;
        }
    }

    private void H0(V v, Runnable runnable) {
        if (B0(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private int X(V v, @l2 int i2, int i3) {
        return sr.b(v, v.getResources().getString(i2), c0(i3));
    }

    private void Z() {
        int b0 = b0();
        if (this.v) {
            this.Z = Math.max(this.m0 - b0, this.W);
        } else {
            this.Z = this.m0 - b0;
        }
    }

    private void Z0(@x1 View view) {
        boolean z = (Build.VERSION.SDK_INT < 29 || z0() || this.z) ? false : true;
        if (this.I || this.J || this.K || this.M || this.N || this.O || z) {
            kf2.d(view, new c(z));
        }
    }

    private void a0() {
        this.X = (int) ((1.0f - this.Y) * this.m0);
    }

    private int b0() {
        int i2;
        if (this.z) {
            return Math.min(Math.max(this.A, this.m0 - ((this.l0 * 9) / 16)), this.k0) + this.P;
        }
        if (!this.H && !this.I && (i2 = this.G) > 0) {
            return Math.max(this.y, i2 + this.B);
        }
        return this.y + this.P;
    }

    private boolean b1() {
        return this.g0 != null && (this.d0 || this.e0 == 1);
    }

    private os c0(int i2) {
        return new e(i2);
    }

    private void d0(@x1 Context context) {
        if (this.R == null) {
            return;
        }
        lh2 lh2Var = new lh2(this.R);
        this.C = lh2Var;
        lh2Var.Z(context);
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            this.C.o0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.C.setTint(typedValue.data);
    }

    private void e0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.U = ofFloat;
        ofFloat.setDuration(500L);
        this.U.addUpdateListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(View view, int i2, boolean z) {
        int v0 = v0(i2);
        eu euVar = this.g0;
        if (euVar != null && (!z ? !euVar.X(view, view.getLeft(), v0) : !euVar.V(view.getLeft(), v0))) {
            X0(2);
            h1(i2);
            this.T.c(i2);
            return;
        }
        X0(i2);
    }

    private void g1() {
        V v;
        WeakReference<V> weakReference = this.n0;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        sr.q1(v, 524288);
        sr.q1(v, 262144);
        sr.q1(v, 1048576);
        int i2 = this.v0;
        if (i2 != -1) {
            sr.q1(v, i2);
        }
        if (!this.v && this.e0 != 6) {
            this.v0 = X(v, ga2.m.D, 6);
        }
        if (this.b0 && this.e0 != 5) {
            E0(v, ls.a.v, 5);
        }
        int i3 = this.e0;
        if (i3 == 3) {
            E0(v, ls.a.u, this.v ? 4 : 6);
        } else if (i3 == 4) {
            E0(v, ls.a.t, this.v ? 3 : 6);
        } else if (i3 != 6) {
        } else {
            E0(v, ls.a.u, 4);
            E0(v, ls.a.t, 3);
        }
    }

    private void h1(int i2) {
        ValueAnimator valueAnimator;
        if (i2 == 2) {
            return;
        }
        boolean z = i2 == 3;
        if (this.S != z) {
            this.S = z;
            if (this.C == null || (valueAnimator = this.U) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.U.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.U.setFloatValues(1.0f - f2, f2);
            this.U.start();
        }
    }

    @x1
    public static <V extends View> BottomSheetBehavior<V> i0(@x1 V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c f2 = ((CoordinatorLayout.g) layoutParams).f();
            if (f2 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f2;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private void i1(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.n0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.u0 != null) {
                    return;
                }
                this.u0 = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.n0.get()) {
                    if (z) {
                        this.u0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.w) {
                            sr.Q1(childAt, 4);
                        }
                    } else if (this.w && (map = this.u0) != null && map.containsKey(childAt)) {
                        sr.Q1(childAt, this.u0.get(childAt).intValue());
                    }
                }
            }
            if (!z) {
                this.u0 = null;
            } else if (this.w) {
                this.n0.get().sendAccessibilityEvent(8);
            }
        }
    }

    private int j0(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i4 = Math.min(size, i4);
            }
            return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(boolean z) {
        V v;
        if (this.n0 != null) {
            Z();
            if (this.e0 != 4 || (v = this.n0.get()) == null) {
                return;
            }
            if (z) {
                W0(4);
            } else {
                v.requestLayout();
            }
        }
    }

    private int v0(int i2) {
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return this.X;
                    }
                    throw new IllegalArgumentException(wo1.l("Invalid state to get top offset: ", i2));
                }
                return this.m0;
            }
            return this.Z;
        }
        return k0();
    }

    private float w0() {
        VelocityTracker velocityTracker = this.q0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.x);
        return this.q0.getYVelocity(this.r0);
    }

    public boolean A0() {
        return this.b0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean B(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, @x1 View view2, int i2, int i3) {
        this.i0 = 0;
        this.j0 = false;
        return (i2 & 2) != 0;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean C0() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        if (r4.getTop() <= r2.X) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.W) < java.lang.Math.abs(r3 - r2.Z)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (d1() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.Z)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.X) < java.lang.Math.abs(r3 - r2.Z)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        r0 = 6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, int i2) {
        WeakReference<View> weakReference;
        int i3 = 3;
        if (v.getTop() == k0()) {
            X0(3);
        } else if (!C0() || ((weakReference = this.o0) != null && view == weakReference.get() && this.j0)) {
            if (this.i0 > 0) {
                if (!this.v) {
                }
                f1(v, i3, false);
                this.j0 = false;
            }
            if (this.b0 && c1(v, w0())) {
                i3 = 5;
            } else if (this.i0 == 0) {
                int top = v.getTop();
                if (!this.v) {
                    int i4 = this.X;
                    if (top < i4) {
                        if (top >= Math.abs(top - this.Z)) {
                        }
                    }
                }
            } else {
                if (!this.v) {
                    int top2 = v.getTop();
                }
                i3 = 4;
            }
            f1(v, i3, false);
            this.j0 = false;
        }
    }

    public void D0(@x1 f fVar) {
        this.p0.remove(fVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 MotionEvent motionEvent) {
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.e0 == 1 && actionMasked == 0) {
                return true;
            }
            if (b1()) {
                this.g0.M(motionEvent);
            }
            if (actionMasked == 0) {
                F0();
            }
            if (this.q0 == null) {
                this.q0 = VelocityTracker.obtain();
            }
            this.q0.addMovement(motionEvent);
            if (b1() && actionMasked == 2 && !this.h0 && Math.abs(this.s0 - motionEvent.getY()) > this.g0.E()) {
                this.g0.d(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.h0;
        }
        return false;
    }

    @Deprecated
    public void I0(f fVar) {
        this.p0.clear();
        if (fVar != null) {
            this.p0.add(fVar);
        }
    }

    public void J0(boolean z) {
        this.d0 = z;
    }

    public void K0(int i2) {
        if (i2 >= 0) {
            this.V = i2;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void L0(boolean z) {
        if (this.v == z) {
            return;
        }
        this.v = z;
        if (this.n0 != null) {
            Z();
        }
        X0((this.v && this.e0 == 6) ? 3 : this.e0);
        g1();
    }

    public void M0(boolean z) {
        this.H = z;
    }

    public void N0(@g1(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f2) {
        if (f2 > 0.0f && f2 < 1.0f) {
            this.Y = f2;
            if (this.n0 != null) {
                a0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void O0(boolean z) {
        if (this.b0 != z) {
            this.b0 = z;
            if (!z && this.e0 == 5) {
                W0(4);
            }
            g1();
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void P0(boolean z) {
        this.b0 = z;
    }

    public void Q0(@c2 int i2) {
        this.F = i2;
    }

    public void R0(@c2 int i2) {
        this.E = i2;
    }

    public void S0(int i2) {
        T0(i2, false);
    }

    public final void T0(int i2, boolean z) {
        boolean z2 = true;
        if (i2 == -1) {
            if (!this.z) {
                this.z = true;
            }
            z2 = false;
        } else {
            if (this.z || this.y != i2) {
                this.z = false;
                this.y = Math.max(0, i2);
            }
            z2 = false;
        }
        if (z2) {
            j1(z);
        }
    }

    public void U0(int i2) {
        this.u = i2;
    }

    public void V0(boolean z) {
        this.c0 = z;
    }

    public void W0(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (this.b0 || i2 != 5) {
                int i3 = (i2 == 6 && this.v && v0(i2) <= this.W) ? 3 : i2;
                WeakReference<V> weakReference = this.n0;
                if (weakReference != null && weakReference.get() != null) {
                    V v = this.n0.get();
                    H0(v, new a(v, i3));
                    return;
                }
                X0(i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(wo1.C(wo1.G("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
    }

    public void X0(int i2) {
        V v;
        if (this.e0 == i2) {
            return;
        }
        this.e0 = i2;
        if (i2 == 4 || i2 == 3 || i2 == 6 || (this.b0 && i2 == 5)) {
            this.f0 = i2;
        }
        WeakReference<V> weakReference = this.n0;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            i1(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            i1(false);
        }
        h1(i2);
        for (int i3 = 0; i3 < this.p0.size(); i3++) {
            this.p0.get(i3).c(v, i2);
        }
        g1();
    }

    public void Y(@x1 f fVar) {
        if (this.p0.contains(fVar)) {
            return;
        }
        this.p0.add(fVar);
    }

    public void Y0(boolean z) {
        this.w = z;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean a1(long j2, @g1(from = 0.0d, to = 100.0d) float f2) {
        return false;
    }

    public boolean c1(@x1 View view, float f2) {
        if (this.c0) {
            return true;
        }
        if (view.getTop() < this.Z) {
            return false;
        }
        return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.Z)) / ((float) b0()) > 0.5f;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean d1() {
        return false;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean e1() {
        return true;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @r2
    public void f0() {
        this.U = null;
    }

    public void g0(int i2) {
        float f2;
        float f3;
        V v = this.n0.get();
        if (v == null || this.p0.isEmpty()) {
            return;
        }
        int i3 = this.Z;
        if (i2 <= i3 && i3 != k0()) {
            int i4 = this.Z;
            f2 = i4 - i2;
            f3 = i4 - k0();
        } else {
            int i5 = this.Z;
            f2 = i5 - i2;
            f3 = this.m0 - i5;
        }
        float f4 = f2 / f3;
        for (int i6 = 0; i6 < this.p0.size(); i6++) {
            this.p0.get(i6).b(v, f4);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void h(@x1 CoordinatorLayout.g gVar) {
        super.h(gVar);
        this.n0 = null;
        this.g0 = null;
    }

    @r2
    @z1
    public View h0(View view) {
        if (sr.V0(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View h0 = h0(viewGroup.getChildAt(i2));
                if (h0 != null) {
                    return h0;
                }
            }
            return null;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k() {
        super.k();
        this.n0 = null;
        this.g0 = null;
    }

    public int k0() {
        if (this.v) {
            return this.W;
        }
        return Math.max(this.V, this.L ? 0 : this.Q);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 MotionEvent motionEvent) {
        eu euVar;
        if (v.isShown() && this.d0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                F0();
            }
            if (this.q0 == null) {
                this.q0 = VelocityTracker.obtain();
            }
            this.q0.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.s0 = (int) motionEvent.getY();
                if (this.e0 != 2) {
                    WeakReference<View> weakReference = this.o0;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (view != null && coordinatorLayout.A(view, x, this.s0)) {
                        this.r0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.t0 = true;
                    }
                }
                this.h0 = this.r0 == -1 && !coordinatorLayout.A(v, x, this.s0);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.t0 = false;
                this.r0 = -1;
                if (this.h0) {
                    this.h0 = false;
                    return false;
                }
            }
            if (this.h0 || (euVar = this.g0) == null || !euVar.W(motionEvent)) {
                WeakReference<View> weakReference2 = this.o0;
                View view2 = weakReference2 != null ? weakReference2.get() : null;
                return (actionMasked != 2 || view2 == null || this.h0 || this.e0 == 1 || coordinatorLayout.A(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.g0 == null || Math.abs(((float) this.s0) - motionEvent.getY()) <= ((float) this.g0.E())) ? false : true;
            }
            return true;
        }
        this.h0 = true;
        return false;
    }

    @g1(from = zg2.s, to = 1.0d)
    public float l0() {
        return this.Y;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, int i2) {
        if (sr.T(coordinatorLayout) && !sr.T(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.n0 == null) {
            this.A = coordinatorLayout.getResources().getDimensionPixelSize(ga2.f.e1);
            Z0(v);
            this.n0 = new WeakReference<>(v);
            lh2 lh2Var = this.C;
            if (lh2Var != null) {
                sr.H1(v, lh2Var);
                lh2 lh2Var2 = this.C;
                float f2 = this.a0;
                if (f2 == -1.0f) {
                    f2 = sr.Q(v);
                }
                lh2Var2.n0(f2);
                boolean z = this.e0 == 3;
                this.S = z;
                this.C.p0(z ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    sr.I1(v, colorStateList);
                }
            }
            g1();
            if (sr.U(v) == 0) {
                sr.Q1(v, 1);
            }
        }
        if (this.g0 == null) {
            this.g0 = eu.q(coordinatorLayout, this.w0);
        }
        int top = v.getTop();
        coordinatorLayout.H(v, i2);
        this.l0 = coordinatorLayout.getWidth();
        this.m0 = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.k0 = height;
        int i3 = this.m0;
        int i4 = i3 - height;
        int i5 = this.Q;
        if (i4 < i5) {
            if (this.L) {
                this.k0 = i3;
            } else {
                this.k0 = i3 - i5;
            }
        }
        this.W = Math.max(0, i3 - this.k0);
        a0();
        Z();
        int i6 = this.e0;
        if (i6 == 3) {
            sr.e1(v, k0());
        } else if (i6 == 6) {
            sr.e1(v, this.X);
        } else if (this.b0 && i6 == 5) {
            sr.e1(v, this.m0);
        } else if (i6 == 4) {
            sr.e1(v, this.Z);
        } else if (i6 == 1 || i6 == 2) {
            sr.e1(v, top - v.getTop());
        }
        this.o0 = new WeakReference<>(h0(v));
        for (int i7 = 0; i7 < this.p0.size(); i7++) {
            this.p0.get(i7).a(v);
        }
        return true;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public int m0() {
        return this.f0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean n(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(j0(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.E, marginLayoutParams.width), j0(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, this.F, marginLayoutParams.height));
        return true;
    }

    public lh2 n0() {
        return this.C;
    }

    @c2
    public int o0() {
        return this.F;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, float f2, float f3) {
        WeakReference<View> weakReference;
        if (C0() && (weakReference = this.o0) != null && view == weakReference.get()) {
            return this.e0 != 3 || super.p(coordinatorLayout, v, view, f2, f3);
        }
        return false;
    }

    @c2
    public int p0() {
        return this.E;
    }

    public int q0() {
        if (this.z) {
            return -1;
        }
        return this.y;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, int i2, int i3, @x1 int[] iArr, int i4) {
        if (i4 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.o0;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!C0() || view == view2) {
            int top = v.getTop();
            int i5 = top - i3;
            if (i3 > 0) {
                if (i5 < k0()) {
                    iArr[1] = top - k0();
                    sr.e1(v, -iArr[1]);
                    X0(3);
                } else if (!this.d0) {
                    return;
                } else {
                    iArr[1] = i3;
                    sr.e1(v, -i3);
                    X0(1);
                }
            } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.Z;
                if (i5 > i6 && !this.b0) {
                    iArr[1] = top - i6;
                    sr.e1(v, -iArr[1]);
                    X0(4);
                } else if (!this.d0) {
                    return;
                } else {
                    iArr[1] = i3;
                    sr.e1(v, -i3);
                    X0(1);
                }
            }
            g0(v.getTop());
            this.i0 = i3;
            this.j0 = true;
        }
    }

    @r2
    public int r0() {
        return this.A;
    }

    public int s0() {
        return this.u;
    }

    public boolean t0() {
        return this.c0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, int i2, int i3, int i4, int i5, int i6, @x1 int[] iArr) {
    }

    public int u0() {
        return this.e0;
    }

    public boolean x0() {
        return this.d0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void y(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.y(coordinatorLayout, v, hVar.getSuperState());
        G0(hVar);
        int i2 = hVar.s;
        if (i2 != 1 && i2 != 2) {
            this.e0 = i2;
            this.f0 = i2;
            return;
        }
        this.e0 = 4;
        this.f0 = 4;
    }

    public boolean y0() {
        return this.v;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @x1
    public Parcelable z(@x1 CoordinatorLayout coordinatorLayout, @x1 V v) {
        return new h(super.z(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    public boolean z0() {
        return this.H;
    }

    /* loaded from: classes2.dex */
    public class k {
        private int a;
        private boolean b;
        private final Runnable c;

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.b = false;
                eu euVar = BottomSheetBehavior.this.g0;
                if (euVar != null && euVar.o(true)) {
                    k kVar = k.this;
                    kVar.c(kVar.a);
                    return;
                }
                k kVar2 = k.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.e0 == 2) {
                    bottomSheetBehavior.X0(kVar2.a);
                }
            }
        }

        private k() {
            this.c = new a();
        }

        public void c(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.n0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            sr.o1(BottomSheetBehavior.this.n0.get(), this.c);
            this.b = true;
        }

        public /* synthetic */ k(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public BottomSheetBehavior(@x1 Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        this.u = 0;
        this.v = true;
        this.w = false;
        this.E = -1;
        this.F = -1;
        this.T = new k(this, null);
        this.Y = 0.5f;
        this.a0 = -1.0f;
        this.d0 = true;
        this.e0 = 4;
        this.f0 = 4;
        this.p0 = new ArrayList<>();
        this.v0 = -1;
        this.w0 = new d();
        this.B = context.getResources().getDimensionPixelSize(ga2.f.n8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ga2.o.J4);
        int i3 = ga2.o.N4;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.D = sg2.a(context, obtainStyledAttributes, i3);
        }
        if (obtainStyledAttributes.hasValue(ga2.o.e5)) {
            this.R = qh2.e(context, attributeSet, ga2.c.R0, t).m();
        }
        d0(context);
        e0();
        this.a0 = obtainStyledAttributes.getDimension(ga2.o.M4, -1.0f);
        int i4 = ga2.o.K4;
        if (obtainStyledAttributes.hasValue(i4)) {
            R0(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = ga2.o.L4;
        if (obtainStyledAttributes.hasValue(i5)) {
            Q0(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        int i6 = ga2.o.T4;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i6);
        if (peekValue != null && (i2 = peekValue.data) == -1) {
            S0(i2);
        } else {
            S0(obtainStyledAttributes.getDimensionPixelSize(i6, -1));
        }
        O0(obtainStyledAttributes.getBoolean(ga2.o.S4, false));
        M0(obtainStyledAttributes.getBoolean(ga2.o.W4, false));
        L0(obtainStyledAttributes.getBoolean(ga2.o.Q4, true));
        V0(obtainStyledAttributes.getBoolean(ga2.o.V4, false));
        J0(obtainStyledAttributes.getBoolean(ga2.o.O4, true));
        U0(obtainStyledAttributes.getInt(ga2.o.U4, 0));
        N0(obtainStyledAttributes.getFloat(ga2.o.R4, 0.5f));
        int i7 = ga2.o.P4;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i7);
        if (peekValue2 != null && peekValue2.type == 16) {
            K0(peekValue2.data);
        } else {
            K0(obtainStyledAttributes.getDimensionPixelOffset(i7, 0));
        }
        this.I = obtainStyledAttributes.getBoolean(ga2.o.a5, false);
        this.J = obtainStyledAttributes.getBoolean(ga2.o.b5, false);
        this.K = obtainStyledAttributes.getBoolean(ga2.o.c5, false);
        this.L = obtainStyledAttributes.getBoolean(ga2.o.d5, true);
        this.M = obtainStyledAttributes.getBoolean(ga2.o.X4, false);
        this.N = obtainStyledAttributes.getBoolean(ga2.o.Y4, false);
        this.O = obtainStyledAttributes.getBoolean(ga2.o.Z4, false);
        obtainStyledAttributes.recycle();
        this.x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}