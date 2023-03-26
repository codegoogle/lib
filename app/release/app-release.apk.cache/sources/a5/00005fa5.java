package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: ViewPager.java */
/* loaded from: classes.dex */
public class ua0 extends ViewGroup {
    private static final int D = -1;
    private static final int E = 2;
    private static final int F = 0;
    private static final int G = 1;
    private static final int H = 2;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    private static final String s = "ViewPager";
    private static final boolean t = false;
    private static final boolean u = false;
    private static final int v = 1;
    private static final int w = 600;
    private static final int x = 25;
    private static final int y = 16;
    private static final int z = 400;
    private float A0;
    private int B0;
    private int C0;
    private boolean D0;
    private boolean E0;
    private boolean F0;
    private int G0;
    private boolean H0;
    private boolean I0;
    private int J0;
    private int K0;
    private int L0;
    private int M;
    private float M0;
    private final ArrayList<f> N;
    private float N0;
    private final f O;
    private float O0;
    private final Rect P;
    private float P0;
    public ra0 Q;
    private int Q0;
    public int R;
    private VelocityTracker R0;
    private int S;
    private int S0;
    private Parcelable T;
    private int T0;
    private ClassLoader U;
    private int U0;
    private Scroller V;
    private int V0;
    private boolean W;
    private boolean W0;
    private long X0;
    private EdgeEffect Y0;
    private EdgeEffect Z0;
    private boolean a1;
    private boolean b1;
    private boolean c1;
    private int d1;
    private List<j> e1;
    private j f1;
    private j g1;
    private List<i> h1;
    private k i1;
    private int j1;
    private int k1;
    private ArrayList<View> l1;
    private final Runnable m1;
    private int n1;
    private l u0;
    private int v0;
    private Drawable w0;
    private int x0;
    private int y0;
    private float z0;
    public static final int[] A = {16842931};
    private static final Comparator<f> B = new a();
    private static final Interpolator C = new b();
    private static final o I = new o();

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.b - fVar2.b;
        }
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ua0.this.setScrollState(0);
            ua0.this.J();
        }
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public class d implements jr {
        private final Rect a = new Rect();

        public d() {
        }

        @Override // com.p7700g.p99005.jr
        public gs a(View view, gs gsVar) {
            gs f1 = sr.f1(view, gsVar);
            if (f1.A()) {
                return f1;
            }
            Rect rect = this.a;
            rect.left = f1.p();
            rect.top = f1.r();
            rect.right = f1.q();
            rect.bottom = f1.o();
            int childCount = ua0.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                gs o = sr.o(ua0.this.getChildAt(i), f1);
                rect.left = Math.min(o.p(), rect.left);
                rect.top = Math.min(o.r(), rect.top);
                rect.right = Math.min(o.q(), rect.right);
                rect.bottom = Math.min(o.o(), rect.bottom);
            }
            return f1.D(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* compiled from: ViewPager.java */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class f {
        public Object a;
        public int b;
        public boolean c;
        public float d;
        public float e;
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public class h extends fq {
        public h() {
        }

        private boolean n() {
            ra0 ra0Var = ua0.this.Q;
            return ra0Var != null && ra0Var.e() > 1;
        }

        @Override // com.p7700g.p99005.fq
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            ra0 ra0Var;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ua0.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (ra0Var = ua0.this.Q) == null) {
                return;
            }
            accessibilityEvent.setItemCount(ra0Var.e());
            accessibilityEvent.setFromIndex(ua0.this.R);
            accessibilityEvent.setToIndex(ua0.this.R);
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            super.g(view, lsVar);
            lsVar.W0(ua0.class.getName());
            lsVar.F1(n());
            if (ua0.this.canScrollHorizontally(1)) {
                lsVar.a(4096);
            }
            if (ua0.this.canScrollHorizontally(-1)) {
                lsVar.a(8192);
            }
        }

        @Override // com.p7700g.p99005.fq
        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i == 8192 && ua0.this.canScrollHorizontally(-1)) {
                    ua0 ua0Var = ua0.this;
                    ua0Var.setCurrentItem(ua0Var.R - 1);
                    return true;
                }
                return false;
            } else if (ua0.this.canScrollHorizontally(1)) {
                ua0 ua0Var2 = ua0.this;
                ua0Var2.setCurrentItem(ua0Var2.R + 1);
                return true;
            } else {
                return false;
            }
        }
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public interface i {
        void d(@x1 ua0 ua0Var, @z1 ra0 ra0Var, @z1 ra0 ra0Var2);
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public interface j {
        void a(int i, float f, @c2 int i2);

        void b(int i);

        void c(int i);
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public interface k {
        void a(@x1 View view, float f);
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public class l extends DataSetObserver {
        public l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ua0.this.j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ua0.this.j();
        }
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class m extends au {
        public static final Parcelable.Creator<m> CREATOR = new a();
        public int s;
        public Parcelable t;
        public ClassLoader u;

        /* compiled from: ViewPager.java */
        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<m> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public m[] newArray(int i) {
                return new m[i];
            }
        }

        public m(@x1 Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder G = wo1.G("FragmentPager.SavedState{");
            G.append(Integer.toHexString(System.identityHashCode(this)));
            G.append(" position=");
            return wo1.z(G, this.s, "}");
        }

        @Override // com.p7700g.p99005.au, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.s);
            parcel.writeParcelable(this.t, i);
        }

        public m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.s = parcel.readInt();
            this.t = parcel.readParcelable(classLoader);
            this.u = classLoader;
        }
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class n implements j {
        @Override // com.p7700g.p99005.ua0.j
        public void a(int i, float f, int i2) {
        }

        @Override // com.p7700g.p99005.ua0.j
        public void b(int i) {
        }

        @Override // com.p7700g.p99005.ua0.j
        public void c(int i) {
        }
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class o implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.a;
            if (z != gVar2.a) {
                return z ? 1 : -1;
            }
            return gVar.e - gVar2.e;
        }
    }

    public ua0(@x1 Context context) {
        super(context);
        this.N = new ArrayList<>();
        this.O = new f();
        this.P = new Rect();
        this.S = -1;
        this.T = null;
        this.U = null;
        this.z0 = -3.4028235E38f;
        this.A0 = Float.MAX_VALUE;
        this.G0 = 1;
        this.Q0 = -1;
        this.a1 = true;
        this.b1 = false;
        this.m1 = new c();
        this.n1 = 0;
        z();
    }

    private static boolean A(@x1 View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean C(float f2, float f3) {
        return (f2 < ((float) this.K0) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.K0)) && f3 < 0.0f);
    }

    private void E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Q0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.M0 = motionEvent.getX(i2);
            this.Q0 = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.R0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean H(int i2) {
        if (this.N.size() == 0) {
            if (this.a1) {
                return false;
            }
            this.c1 = false;
            D(0, 0.0f, 0);
            if (this.c1) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f x2 = x();
        int clientWidth = getClientWidth();
        int i3 = this.v0;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = x2.b;
        float f3 = ((i2 / f2) - x2.e) / (x2.d + (i3 / f2));
        this.c1 = false;
        D(i5, f3, (int) (i4 * f3));
        if (this.c1) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean I(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.M0 - f2;
        this.M0 = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.z0 * clientWidth;
        float f5 = this.A0 * clientWidth;
        boolean z4 = false;
        f fVar = this.N.get(0);
        ArrayList<f> arrayList = this.N;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.b != 0) {
            f4 = fVar.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (fVar2.b != this.Q.e() - 1) {
            f5 = fVar2.e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.Y0.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.Z0.onPull(Math.abs(scrollX - f5) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.M0 = (scrollX - i2) + this.M0;
        scrollTo(i2, getScrollY());
        H(i2);
        return z4;
    }

    private void L(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.N.isEmpty()) {
            if (!this.V.isFinished()) {
                this.V.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        f y2 = y(this.R);
        int min = (int) ((y2 != null ? Math.min(y2.e, this.A0) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            i(false);
            scrollTo(min, getScrollY());
        }
    }

    private void M() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private void P(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private boolean Q() {
        this.Q0 = -1;
        q();
        this.Y0.onRelease();
        this.Z0.onRelease();
        return this.Y0.isFinished() || this.Z0.isFinished();
    }

    private void R(int i2, boolean z2, int i3, boolean z3) {
        int i4;
        f y2 = y(i2);
        if (y2 != null) {
            i4 = (int) (Math.max(this.z0, Math.min(y2.e, this.A0)) * getClientWidth());
        } else {
            i4 = 0;
        }
        if (z2) {
            Z(i4, 0, i3);
            if (z3) {
                m(i2);
                return;
            }
            return;
        }
        if (z3) {
            m(i2);
        }
        i(false);
        scrollTo(i4, 0);
        H(i4);
    }

    private void a0() {
        if (this.k1 != 0) {
            ArrayList<View> arrayList = this.l1;
            if (arrayList == null) {
                this.l1 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.l1.add(getChildAt(i2));
            }
            Collections.sort(this.l1, I);
        }
    }

    private void f(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int e2 = this.Q.e();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.v0 / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.b;
            int i6 = fVar.b;
            if (i5 < i6) {
                float f3 = fVar2.e + fVar2.d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= fVar.b && i8 < this.N.size()) {
                    f fVar5 = this.N.get(i8);
                    while (true) {
                        fVar4 = fVar5;
                        if (i7 <= fVar4.b || i8 >= this.N.size() - 1) {
                            break;
                        }
                        i8++;
                        fVar5 = this.N.get(i8);
                    }
                    while (i7 < fVar4.b) {
                        f3 += this.Q.h(i7) + f2;
                        i7++;
                    }
                    fVar4.e = f3;
                    f3 += fVar4.d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.N.size() - 1;
                float f4 = fVar2.e;
                while (true) {
                    i5--;
                    if (i5 < fVar.b || size < 0) {
                        break;
                    }
                    f fVar6 = this.N.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i5 >= fVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.N.get(size);
                    }
                    while (i5 > fVar3.b) {
                        f4 -= this.Q.h(i5) + f2;
                        i5--;
                    }
                    f4 -= fVar3.d + f2;
                    fVar3.e = f4;
                }
            }
        }
        int size2 = this.N.size();
        float f5 = fVar.e;
        int i9 = fVar.b;
        int i10 = i9 - 1;
        this.z0 = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = e2 - 1;
        this.A0 = i9 == i11 ? (fVar.d + f5) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar7 = this.N.get(i12);
            while (true) {
                i4 = fVar7.b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.Q.h(i10) + f2;
                i10--;
            }
            f5 -= fVar7.d + f2;
            fVar7.e = f5;
            if (i4 == 0) {
                this.z0 = f5;
            }
            i12--;
            i10--;
        }
        float f6 = fVar.e + fVar.d + f2;
        int i13 = fVar.b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar8 = this.N.get(i14);
            while (true) {
                i3 = fVar8.b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.Q.h(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.A0 = (fVar8.d + f6) - 1.0f;
            }
            fVar8.e = f6;
            f6 += fVar8.d + f2;
            i14++;
            i13++;
        }
        this.b1 = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void i(boolean z2) {
        boolean z3 = this.n1 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.V.isFinished()) {
                this.V.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.V.getCurrX();
                int currY = this.V.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        H(currX);
                    }
                }
            }
        }
        this.F0 = false;
        for (int i2 = 0; i2 < this.N.size(); i2++) {
            f fVar = this.N.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z2) {
                sr.o1(this, this.m1);
            } else {
                this.m1.run();
            }
        }
    }

    private int k(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.U0 || Math.abs(i3) <= this.S0) {
            i2 += (int) (f2 + (i2 >= this.R ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.N.size() > 0) {
            ArrayList<f> arrayList = this.N;
            return Math.max(this.N.get(0).b, Math.min(i2, arrayList.get(arrayList.size() - 1).b));
        }
        return i2;
    }

    private void l(int i2, float f2, int i3) {
        j jVar = this.f1;
        if (jVar != null) {
            jVar.a(i2, f2, i3);
        }
        List<j> list = this.e1;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.e1.get(i4);
                if (jVar2 != null) {
                    jVar2.a(i2, f2, i3);
                }
            }
        }
        j jVar3 = this.g1;
        if (jVar3 != null) {
            jVar3.a(i2, f2, i3);
        }
    }

    private void m(int i2) {
        j jVar = this.f1;
        if (jVar != null) {
            jVar.c(i2);
        }
        List<j> list = this.e1;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.e1.get(i3);
                if (jVar2 != null) {
                    jVar2.c(i2);
                }
            }
        }
        j jVar3 = this.g1;
        if (jVar3 != null) {
            jVar3.c(i2);
        }
    }

    private void n(int i2) {
        j jVar = this.f1;
        if (jVar != null) {
            jVar.b(i2);
        }
        List<j> list = this.e1;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.e1.get(i3);
                if (jVar2 != null) {
                    jVar2.b(i2);
                }
            }
        }
        j jVar3 = this.g1;
        if (jVar3 != null) {
            jVar3.b(i2);
        }
    }

    private void p(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z2 ? this.j1 : 0, null);
        }
    }

    private void q() {
        this.H0 = false;
        this.I0 = false;
        VelocityTracker velocityTracker = this.R0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.R0 = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.E0 != z2) {
            this.E0 = z2;
        }
    }

    private Rect u(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f x() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.v0 / clientWidth : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.N.size()) {
            f fVar2 = this.N.get(i4);
            if (!z2 && fVar2.b != (i2 = i3 + 1)) {
                fVar2 = this.O;
                fVar2.e = f2 + f4 + f3;
                fVar2.b = i2;
                fVar2.d = this.Q.h(i2);
                i4--;
            }
            f2 = fVar2.e;
            float f5 = fVar2.d + f2 + f3;
            if (!z2 && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i4 == this.N.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.b;
            f4 = fVar2.d;
            i4++;
            fVar = fVar2;
            z2 = false;
        }
        return fVar;
    }

    public boolean B() {
        return this.W0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    @t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(int i2, float f2, int i3) {
        int max;
        int i4;
        int left;
        if (this.d1 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.a) {
                    int i6 = gVar.b & 7;
                    if (i6 == 1) {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i6 == 3) {
                            i4 = childAt.getWidth() + paddingLeft;
                        } else if (i6 != 5) {
                            i4 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i4;
                    }
                    int i7 = max;
                    i4 = paddingLeft;
                    paddingLeft = i7;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i4;
                }
            }
        }
        l(i2, f2, i3);
        if (this.i1 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((g) childAt2.getLayoutParams()).a) {
                    this.i1.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.c1 = true;
    }

    public boolean F() {
        int i2 = this.R;
        if (i2 > 0) {
            S(i2 - 1, true);
            return true;
        }
        return false;
    }

    public boolean G() {
        ra0 ra0Var = this.Q;
        if (ra0Var == null || this.R >= ra0Var.e() - 1) {
            return false;
        }
        S(this.R + 1, true);
        return true;
    }

    public void J() {
        K(this.R);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r5 == r6) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void K(int i2) {
        f fVar;
        String hexString;
        f fVar2;
        f w2;
        int i3 = this.R;
        if (i3 != i2) {
            fVar = y(i3);
            this.R = i2;
        } else {
            fVar = null;
        }
        if (this.Q == null) {
            a0();
        } else if (this.F0) {
            a0();
        } else if (getWindowToken() != null) {
            this.Q.t(this);
            int i4 = this.G0;
            int max = Math.max(0, this.R - i4);
            int e2 = this.Q.e();
            int min = Math.min(e2 - 1, this.R + i4);
            if (e2 == this.M) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.N.size()) {
                        break;
                    }
                    fVar2 = this.N.get(i5);
                    int i6 = fVar2.b;
                    int i7 = this.R;
                    if (i6 < i7) {
                        i5++;
                    }
                }
                fVar2 = null;
                if (fVar2 == null && e2 > 0) {
                    fVar2 = a(this.R, i5);
                }
                if (fVar2 != null) {
                    int i8 = i5 - 1;
                    f fVar3 = i8 >= 0 ? this.N.get(i8) : null;
                    int clientWidth = getClientWidth();
                    float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - fVar2.d) + (getPaddingLeft() / clientWidth);
                    float f2 = 0.0f;
                    for (int i9 = this.R - 1; i9 >= 0; i9--) {
                        if (f2 < paddingLeft || i9 >= max) {
                            if (fVar3 != null && i9 == fVar3.b) {
                                f2 += fVar3.d;
                                i8--;
                                if (i8 >= 0) {
                                    fVar3 = this.N.get(i8);
                                }
                                fVar3 = null;
                            } else {
                                f2 += a(i9, i8 + 1).d;
                                i5++;
                                if (i8 >= 0) {
                                    fVar3 = this.N.get(i8);
                                }
                                fVar3 = null;
                            }
                        } else if (fVar3 == null) {
                            break;
                        } else if (i9 == fVar3.b && !fVar3.c) {
                            this.N.remove(i8);
                            this.Q.b(this, i9, fVar3.a);
                            i8--;
                            i5--;
                            if (i8 >= 0) {
                                fVar3 = this.N.get(i8);
                            }
                            fVar3 = null;
                        }
                    }
                    float f3 = fVar2.d;
                    int i10 = i5 + 1;
                    if (f3 < 2.0f) {
                        f fVar4 = i10 < this.N.size() ? this.N.get(i10) : null;
                        float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                        int i11 = this.R;
                        while (true) {
                            i11++;
                            if (i11 >= e2) {
                                break;
                            } else if (f3 < paddingRight || i11 <= min) {
                                if (fVar4 != null && i11 == fVar4.b) {
                                    f3 += fVar4.d;
                                    i10++;
                                    if (i10 < this.N.size()) {
                                        fVar4 = this.N.get(i10);
                                    }
                                } else {
                                    f a2 = a(i11, i10);
                                    i10++;
                                    f3 += a2.d;
                                    fVar4 = i10 < this.N.size() ? this.N.get(i10) : null;
                                }
                            } else if (fVar4 == null) {
                                break;
                            } else if (i11 == fVar4.b && !fVar4.c) {
                                this.N.remove(i10);
                                this.Q.b(this, i11, fVar4.a);
                                if (i10 < this.N.size()) {
                                    fVar4 = this.N.get(i10);
                                }
                            }
                        }
                    }
                    f(fVar2, i5, fVar);
                    this.Q.q(this, this.R, fVar2.a);
                }
                this.Q.d(this);
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    g gVar = (g) childAt.getLayoutParams();
                    gVar.f = i12;
                    if (!gVar.a && gVar.c == 0.0f && (w2 = w(childAt)) != null) {
                        gVar.c = w2.d;
                        gVar.e = w2.b;
                    }
                }
                a0();
                if (hasFocus()) {
                    View findFocus = findFocus();
                    f v2 = findFocus != null ? v(findFocus) : null;
                    if (v2 == null || v2.b != this.R) {
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt2 = getChildAt(i13);
                            f w3 = w(childAt2);
                            if (w3 != null && w3.b == this.R && childAt2.requestFocus(2)) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder G2 = wo1.G("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            G2.append(this.M);
            G2.append(", found: ");
            G2.append(e2);
            G2.append(" Pager id: ");
            G2.append(hexString);
            G2.append(" Pager class: ");
            G2.append(getClass());
            G2.append(" Problematic adapter: ");
            G2.append(this.Q.getClass());
            throw new IllegalStateException(G2.toString());
        }
    }

    public void N(@x1 i iVar) {
        List<i> list = this.h1;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void O(@x1 j jVar) {
        List<j> list = this.e1;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public void S(int i2, boolean z2) {
        this.F0 = false;
        T(i2, z2, false);
    }

    public void T(int i2, boolean z2, boolean z3) {
        U(i2, z2, z3, 0);
    }

    public void U(int i2, boolean z2, boolean z3, int i3) {
        ra0 ra0Var = this.Q;
        if (ra0Var != null && ra0Var.e() > 0) {
            if (!z3 && this.R == i2 && this.N.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.Q.e()) {
                i2 = this.Q.e() - 1;
            }
            int i4 = this.G0;
            int i5 = this.R;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.N.size(); i6++) {
                    this.N.get(i6).c = true;
                }
            }
            boolean z4 = this.R != i2;
            if (this.a1) {
                this.R = i2;
                if (z4) {
                    m(i2);
                }
                requestLayout();
                return;
            }
            K(i2);
            R(i2, z2, i3, z4);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public j V(j jVar) {
        j jVar2 = this.g1;
        this.g1 = jVar;
        return jVar2;
    }

    public void W(boolean z2, @z1 k kVar) {
        X(z2, kVar, 2);
    }

    public void X(boolean z2, @z1 k kVar, int i2) {
        boolean z3 = kVar != null;
        boolean z4 = z3 != (this.i1 != null);
        this.i1 = kVar;
        setChildrenDrawingOrderEnabled(z3);
        if (z3) {
            this.k1 = z2 ? 2 : 1;
            this.j1 = i2;
        } else {
            this.k1 = 0;
        }
        if (z4) {
            J();
        }
    }

    public void Y(int i2, int i3) {
        Z(i2, i3, 0);
    }

    public void Z(int i2, int i3, int i4) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.V;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.W ? this.V.getCurrX() : this.V.getStartX();
            this.V.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            i(false);
            J();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float o2 = (o(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3) + f3;
        int abs2 = Math.abs(i4);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(o2 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i6) / ((this.Q.h(this.R) * f2) + this.v0)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.W = false;
        this.V.startScroll(i5, scrollY, i6, i7, min);
        sr.m1(this);
    }

    public f a(int i2, int i3) {
        f fVar = new f();
        fVar.b = i2;
        fVar.a = this.Q.j(this, i2);
        fVar.d = this.Q.h(i2);
        if (i3 >= 0 && i3 < this.N.size()) {
            this.N.add(i3, fVar);
        } else {
            this.N.add(fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f w2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (w2 = w(childAt)) != null && w2.b == this.R) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f w2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (w2 = w(childAt)) != null && w2.b == this.R) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean A2 = gVar.a | A(view);
        gVar.a = A2;
        if (!this.D0) {
            super.addView(view, i2, layoutParams);
        } else if (!A2) {
            gVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void b(@x1 i iVar) {
        if (this.h1 == null) {
            this.h1 = new ArrayList();
        }
        this.h1.add(iVar);
    }

    public void c(@x1 j jVar) {
        if (this.e1 == null) {
            this.e1 = new ArrayList();
        }
        this.e1.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.Q == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.z0)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.A0));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.W = true;
        if (!this.V.isFinished() && this.V.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.V.getCurrX();
            int currY = this.V.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!H(currX)) {
                    this.V.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            sr.m1(this);
            return;
        }
        i(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(int i2) {
        boolean z2;
        View findNextFocus;
        boolean requestFocus;
        View findFocus = findFocus();
        boolean z3 = false;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z2 = false;
                        break;
                    } else if (parent == this) {
                        z2 = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    sb.toString();
                }
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
            if (findNextFocus == null && findNextFocus != findFocus) {
                if (i2 == 17) {
                    int i3 = u(this.P, findNextFocus).left;
                    int i4 = u(this.P, findFocus).left;
                    if (findFocus != null && i3 >= i4) {
                        requestFocus = F();
                    } else {
                        requestFocus = findNextFocus.requestFocus();
                    }
                } else if (i2 == 66) {
                    int i5 = u(this.P, findNextFocus).left;
                    int i6 = u(this.P, findFocus).left;
                    if (findFocus != null && i5 <= i6) {
                        requestFocus = G();
                    } else {
                        requestFocus = findNextFocus.requestFocus();
                    }
                }
                z3 = requestFocus;
            } else if (i2 != 17 || i2 == 1) {
                z3 = F();
            } else if (i2 == 66 || i2 == 2) {
                z3 = G();
            }
            if (z3) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
            }
            return z3;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        if (findNextFocus == null) {
        }
        if (i2 != 17) {
        }
        z3 = F();
        if (z3) {
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f w2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (w2 = w(childAt)) != null && w2.b == this.R && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        ra0 ra0Var;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (ra0Var = this.Q) == null || ra0Var.e() <= 1)) {
            this.Y0.finish();
            this.Z0.finish();
        } else {
            if (!this.Y0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.z0 * width);
                this.Y0.setSize(height, width);
                z2 = false | this.Y0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.Z0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.A0 + 1.0f)) * width2);
                this.Z0.setSize(height2, width2);
                z2 |= this.Z0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z2) {
            sr.m1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.w0;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean e() {
        if (this.H0) {
            return false;
        }
        this.W0 = true;
        setScrollState(1);
        this.M0 = 0.0f;
        this.O0 = 0.0f;
        VelocityTracker velocityTracker = this.R0;
        if (velocityTracker == null) {
            this.R0 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.R0.addMovement(obtain);
        obtain.recycle();
        this.X0 = uptimeMillis;
        return true;
    }

    public boolean g(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && g(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @z1
    public ra0 getAdapter() {
        return this.Q;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.k1 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) this.l1.get(i3).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.R;
    }

    public int getOffscreenPageLimit() {
        return this.G0;
    }

    public int getPageMargin() {
        return this.v0;
    }

    public void h() {
        List<j> list = this.e1;
        if (list != null) {
            list.clear();
        }
    }

    public void j() {
        int e2 = this.Q.e();
        this.M = e2;
        boolean z2 = this.N.size() < (this.G0 * 2) + 1 && this.N.size() < e2;
        int i2 = this.R;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.N.size()) {
            f fVar = this.N.get(i3);
            int f2 = this.Q.f(fVar.a);
            if (f2 != -1) {
                if (f2 == -2) {
                    this.N.remove(i3);
                    i3--;
                    if (!z3) {
                        this.Q.t(this);
                        z3 = true;
                    }
                    this.Q.b(this, fVar.b, fVar.a);
                    int i4 = this.R;
                    if (i4 == fVar.b) {
                        i2 = Math.max(0, Math.min(i4, e2 - 1));
                    }
                } else {
                    int i5 = fVar.b;
                    if (i5 != f2) {
                        if (i5 == this.R) {
                            i2 = f2;
                        }
                        fVar.b = f2;
                    }
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.Q.d(this);
        }
        Collections.sort(this.N, B);
        if (z2) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                g gVar = (g) getChildAt(i6).getLayoutParams();
                if (!gVar.a) {
                    gVar.c = 0.0f;
                }
            }
            T(i2, false, true);
            requestLayout();
        }
    }

    public float o(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.m1);
        Scroller scroller = this.V;
        if (scroller != null && !scroller.isFinished()) {
            this.V.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.v0 <= 0 || this.w0 == null || this.N.size() <= 0 || this.Q == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f4 = this.v0 / width2;
        int i3 = 0;
        f fVar = this.N.get(0);
        float f5 = fVar.e;
        int size = this.N.size();
        int i4 = fVar.b;
        int i5 = this.N.get(size - 1).b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = this.N.get(i3);
            }
            if (i4 == i2) {
                float f6 = fVar.e;
                float f7 = fVar.d;
                f2 = (f6 + f7) * width2;
                f5 = f6 + f7 + f4;
            } else {
                float h2 = this.Q.h(i4);
                f2 = (f5 + h2) * width2;
                f5 = h2 + f4 + f5;
            }
            if (this.v0 + f2 > scrollX) {
                f3 = f4;
                this.w0.setBounds(Math.round(f2), this.x0, Math.round(this.v0 + f2), this.y0);
                this.w0.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + width) {
                return;
            }
            i4++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.H0) {
                    return true;
                }
                if (this.I0) {
                    return false;
                }
            }
            if (action == 0) {
                float x2 = motionEvent.getX();
                this.O0 = x2;
                this.M0 = x2;
                float y2 = motionEvent.getY();
                this.P0 = y2;
                this.N0 = y2;
                this.Q0 = motionEvent.getPointerId(0);
                this.I0 = false;
                this.W = true;
                this.V.computeScrollOffset();
                if (this.n1 == 2 && Math.abs(this.V.getFinalX() - this.V.getCurrX()) > this.V0) {
                    this.V.abortAnimation();
                    this.F0 = false;
                    J();
                    this.H0 = true;
                    P(true);
                    setScrollState(1);
                } else {
                    i(false);
                    this.H0 = false;
                }
            } else if (action == 2) {
                int i2 = this.Q0;
                if (i2 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float f2 = x3 - this.M0;
                    float abs = Math.abs(f2);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y3 - this.P0);
                    int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                    if (i3 != 0 && !C(this.M0, f2) && g(this, false, (int) f2, (int) x3, (int) y3)) {
                        this.M0 = x3;
                        this.N0 = y3;
                        this.I0 = true;
                        return false;
                    }
                    int i4 = this.L0;
                    if (abs > i4 && abs * 0.5f > abs2) {
                        this.H0 = true;
                        P(true);
                        setScrollState(1);
                        float f3 = this.O0;
                        float f4 = this.L0;
                        this.M0 = i3 > 0 ? f3 + f4 : f3 - f4;
                        this.N0 = y3;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > i4) {
                        this.I0 = true;
                    }
                    if (this.H0 && I(x3)) {
                        sr.m1(this);
                    }
                }
            } else if (action == 6) {
                E(motionEvent);
            }
            if (this.R0 == null) {
                this.R0 = VelocityTracker.obtain();
            }
            this.R0.addMovement(motionEvent);
            return this.H0;
        }
        Q();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        f w2;
        int max;
        int i6;
        int max2;
        int i7;
        int childCount = getChildCount();
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.a) {
                    int i12 = gVar.b;
                    int i13 = i12 & 7;
                    int i14 = i12 & 112;
                    if (i13 == 1) {
                        max = Math.max((i8 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i13 == 3) {
                            i6 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            i6 = paddingLeft;
                        } else {
                            max = (i8 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i14 != 16) {
                            max2 = Math.max((i9 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        } else {
                            if (i14 == 48) {
                                i7 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i14 != 80) {
                                i7 = paddingTop;
                            } else {
                                max2 = (i9 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i15 = paddingLeft + scrollX;
                            childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + paddingTop);
                            i10++;
                            paddingTop = i7;
                            paddingLeft = i6;
                        }
                        int i16 = max2;
                        i7 = paddingTop;
                        paddingTop = i16;
                        int i152 = paddingLeft + scrollX;
                        childAt.layout(i152, paddingTop, childAt.getMeasuredWidth() + i152, childAt.getMeasuredHeight() + paddingTop);
                        i10++;
                        paddingTop = i7;
                        paddingLeft = i6;
                    }
                    int i17 = max;
                    i6 = paddingLeft;
                    paddingLeft = i17;
                    if (i14 != 16) {
                    }
                    int i162 = max2;
                    i7 = paddingTop;
                    paddingTop = i162;
                    int i1522 = paddingLeft + scrollX;
                    childAt.layout(i1522, paddingTop, childAt.getMeasuredWidth() + i1522, childAt.getMeasuredHeight() + paddingTop);
                    i10++;
                    paddingTop = i7;
                    paddingLeft = i6;
                }
            }
        }
        int i18 = (i8 - paddingLeft) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.a && (w2 = w(childAt2)) != null) {
                    float f2 = i18;
                    int i20 = ((int) (w2.e * f2)) + paddingLeft;
                    if (gVar2.d) {
                        gVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * gVar2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i9 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i20, paddingTop, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.x0 = paddingTop;
        this.y0 = i9 - paddingBottom;
        this.d1 = i10;
        if (this.a1) {
            z3 = false;
            R(this.R, false, 0, false);
        } else {
            z3 = false;
        }
        this.a1 = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        g gVar;
        g gVar2;
        int i4;
        int i5;
        int i6;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i2), ViewGroup.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.K0 = Math.min(measuredWidth / 10, this.J0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z2 = true;
            int i8 = 1073741824;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.a) {
                int i9 = gVar2.b;
                int i10 = i9 & 7;
                int i11 = i9 & 112;
                boolean z3 = i11 == 48 || i11 == 80;
                if (i10 != 3 && i10 != 5) {
                    z2 = false;
                }
                int i12 = Integer.MIN_VALUE;
                if (z3) {
                    i12 = 1073741824;
                } else if (z2) {
                    i4 = 1073741824;
                    i5 = ((ViewGroup.LayoutParams) gVar2).width;
                    if (i5 == -2) {
                        if (i5 == -1) {
                            i5 = paddingLeft;
                        }
                        i12 = 1073741824;
                    } else {
                        i5 = paddingLeft;
                    }
                    i6 = ((ViewGroup.LayoutParams) gVar2).height;
                    if (i6 != -2) {
                        i6 = measuredHeight;
                        i8 = i4;
                    } else if (i6 == -1) {
                        i6 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, i12), View.MeasureSpec.makeMeasureSpec(i6, i8));
                    if (!z3) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z2) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i4 = Integer.MIN_VALUE;
                i5 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i5 == -2) {
                }
                i6 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i6 != -2) {
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, i12), View.MeasureSpec.makeMeasureSpec(i6, i8));
                if (!z3) {
                }
            }
            i7++;
        }
        this.B0 = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.C0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.D0 = true;
        J();
        this.D0 = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.c), 1073741824), this.C0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f w2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (w2 = w(childAt)) != null && w2.b == this.R && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        ra0 ra0Var = this.Q;
        if (ra0Var != null) {
            ra0Var.n(mVar.t, mVar.u);
            T(mVar.s, false, true);
            return;
        }
        this.S = mVar.s;
        this.T = mVar.t;
        this.U = mVar.u;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.s = this.R;
        ra0 ra0Var = this.Q;
        if (ra0Var != null) {
            mVar.t = ra0Var.o();
        }
        return mVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.v0;
            L(i2, i4, i6, i6);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ra0 ra0Var;
        if (this.W0) {
            return true;
        }
        boolean z2 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (ra0Var = this.Q) == null || ra0Var.e() == 0) {
            return false;
        }
        if (this.R0 == null) {
            this.R0 = VelocityTracker.obtain();
        }
        this.R0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.V.abortAnimation();
            this.F0 = false;
            J();
            float x2 = motionEvent.getX();
            this.O0 = x2;
            this.M0 = x2;
            float y2 = motionEvent.getY();
            this.P0 = y2;
            this.N0 = y2;
            this.Q0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.H0) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.Q0);
                    if (findPointerIndex == -1) {
                        z2 = Q();
                    } else {
                        float x3 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x3 - this.M0);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y3 - this.N0);
                        if (abs > this.L0 && abs > abs2) {
                            this.H0 = true;
                            P(true);
                            float f2 = this.O0;
                            this.M0 = x3 - f2 > 0.0f ? f2 + this.L0 : f2 - this.L0;
                            this.N0 = y3;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.H0) {
                    z2 = false | I(motionEvent.getX(motionEvent.findPointerIndex(this.Q0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.M0 = motionEvent.getX(actionIndex);
                    this.Q0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    E(motionEvent);
                    this.M0 = motionEvent.getX(motionEvent.findPointerIndex(this.Q0));
                }
            } else if (this.H0) {
                R(this.R, true, 0, false);
                z2 = Q();
            }
        } else if (this.H0) {
            VelocityTracker velocityTracker = this.R0;
            velocityTracker.computeCurrentVelocity(1000, this.T0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.Q0);
            this.F0 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f x4 = x();
            float f3 = clientWidth;
            U(k(x4.b, ((scrollX / f3) - x4.e) / (x4.d + (this.v0 / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.Q0)) - this.O0)), true, true, xVelocity);
            z2 = Q();
        }
        if (z2) {
            sr.m1(this);
        }
        return true;
    }

    public void r() {
        if (this.W0) {
            if (this.Q != null) {
                VelocityTracker velocityTracker = this.R0;
                velocityTracker.computeCurrentVelocity(1000, this.T0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.Q0);
                this.F0 = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                f x2 = x();
                U(k(x2.b, ((scrollX / clientWidth) - x2.e) / x2.d, xVelocity, (int) (this.M0 - this.O0)), true, true, xVelocity);
            }
            q();
            this.W0 = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.D0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public boolean s(@x1 KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return F();
                }
                return d(17);
            } else if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return G();
                }
                return d(66);
            } else if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return d(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return d(1);
                }
            }
        }
        return false;
    }

    public void setAdapter(@z1 ra0 ra0Var) {
        ra0 ra0Var2 = this.Q;
        if (ra0Var2 != null) {
            ra0Var2.r(null);
            this.Q.t(this);
            for (int i2 = 0; i2 < this.N.size(); i2++) {
                f fVar = this.N.get(i2);
                this.Q.b(this, fVar.b, fVar.a);
            }
            this.Q.d(this);
            this.N.clear();
            M();
            this.R = 0;
            scrollTo(0, 0);
        }
        ra0 ra0Var3 = this.Q;
        this.Q = ra0Var;
        this.M = 0;
        if (ra0Var != null) {
            if (this.u0 == null) {
                this.u0 = new l();
            }
            this.Q.r(this.u0);
            this.F0 = false;
            boolean z2 = this.a1;
            this.a1 = true;
            this.M = this.Q.e();
            if (this.S >= 0) {
                this.Q.n(this.T, this.U);
                T(this.S, false, true);
                this.S = -1;
                this.T = null;
                this.U = null;
            } else if (!z2) {
                J();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.h1;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.h1.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.h1.get(i3).d(this, ra0Var3, ra0Var);
        }
    }

    public void setCurrentItem(int i2) {
        this.F0 = false;
        T(i2, !this.a1, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            i2 = 1;
        }
        if (i2 != this.G0) {
            this.G0 = i2;
            J();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f1 = jVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.v0;
        this.v0 = i2;
        int width = getWidth();
        L(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(@z1 Drawable drawable) {
        this.w0 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.n1 == i2) {
            return;
        }
        this.n1 = i2;
        if (this.i1 != null) {
            p(i2 != 0);
        }
        n(i2);
    }

    public void t(float f2) {
        ArrayList<f> arrayList;
        if (this.W0) {
            if (this.Q == null) {
                return;
            }
            this.M0 += f2;
            float scrollX = getScrollX() - f2;
            float clientWidth = getClientWidth();
            float f3 = this.z0 * clientWidth;
            float f4 = this.A0 * clientWidth;
            f fVar = this.N.get(0);
            f fVar2 = this.N.get(arrayList.size() - 1);
            if (fVar.b != 0) {
                f3 = fVar.e * clientWidth;
            }
            if (fVar2.b != this.Q.e() - 1) {
                f4 = fVar2.e * clientWidth;
            }
            if (scrollX < f3) {
                scrollX = f3;
            } else if (scrollX > f4) {
                scrollX = f4;
            }
            int i2 = (int) scrollX;
            this.M0 = (scrollX - i2) + this.M0;
            scrollTo(i2, getScrollY());
            H(i2);
            MotionEvent obtain = MotionEvent.obtain(this.X0, SystemClock.uptimeMillis(), 2, this.M0, 0.0f, 0);
            this.R0.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public f v(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return w(view);
            }
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w0;
    }

    public f w(View view) {
        for (int i2 = 0; i2 < this.N.size(); i2++) {
            f fVar = this.N.get(i2);
            if (this.Q.k(view, fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public f y(int i2) {
        for (int i3 = 0; i3 < this.N.size(); i3++) {
            f fVar = this.N.get(i3);
            if (fVar.b == i2) {
                return fVar;
            }
        }
        return null;
    }

    public void z() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.V = new Scroller(context, C);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.L0 = viewConfiguration.getScaledPagingTouchSlop();
        this.S0 = (int) (400.0f * f2);
        this.T0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Y0 = new EdgeEffect(context);
        this.Z0 = new EdgeEffect(context);
        this.U0 = (int) (25.0f * f2);
        this.V0 = (int) (2.0f * f2);
        this.J0 = (int) (f2 * 16.0f);
        sr.A1(this, new h());
        if (sr.U(this) == 0) {
            sr.Q1(this, 1);
        }
        sr.Z1(this, new d());
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class g extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        public float c;
        public boolean d;
        public int e;
        public int f;

        public g() {
            super(-1, -1);
            this.c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ua0.A);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(@f1 int i2) {
        setPageMarginDrawable(gh.i(getContext(), i2));
    }

    public ua0(@x1 Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N = new ArrayList<>();
        this.O = new f();
        this.P = new Rect();
        this.S = -1;
        this.T = null;
        this.U = null;
        this.z0 = -3.4028235E38f;
        this.A0 = Float.MAX_VALUE;
        this.G0 = 1;
        this.Q0 = -1;
        this.a1 = true;
        this.b1 = false;
        this.m1 = new c();
        this.n1 = 0;
        z();
    }
}