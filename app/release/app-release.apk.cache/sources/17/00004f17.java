package com.p7700g.p99005;

import android.annotation.SuppressLint;
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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: SliderPager.java */
/* loaded from: classes3.dex */
public class lr3 extends ViewGroup {
    private static final int A = 400;
    private static final int E = -1;
    private static final int F = 2;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 2;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int s = 250;
    private static final String t = "SliderPager";
    private static final boolean u = false;
    private static final boolean v = false;
    private static final int w = 1;
    private static final int x = 600;
    private static final int y = 25;
    private static final int z = 16;
    private float A0;
    private float B0;
    private int C0;
    private int D0;
    private boolean E0;
    private boolean F0;
    private boolean G0;
    private int H0;
    private boolean I0;
    private boolean J0;
    private int K0;
    private int L0;
    private int M0;
    private int N;
    private float N0;
    private final ArrayList<f> O;
    private float O0;
    private final f P;
    private float P0;
    private final Rect Q;
    private float Q0;
    public ra0 R;
    private int R0;
    public int S;
    private VelocityTracker S0;
    private int T;
    private int T0;
    private Parcelable U;
    private int U0;
    private ClassLoader V;
    private int V0;
    private Scroller W;
    private int W0;
    private boolean X0;
    private long Y0;
    private EdgeEffect Z0;
    private EdgeEffect a1;
    private boolean b1;
    private boolean c1;
    private boolean d1;
    private int e1;
    private List<j> f1;
    private j g1;
    private j h1;
    private List<i> i1;
    private l j1;
    private int k1;
    private int l1;
    private ArrayList<View> m1;
    private final Runnable n1;
    private int o1;
    private boolean u0;
    private m v0;
    private int w0;
    private Drawable x0;
    private int y0;
    private int z0;
    public static final int[] B = {16842931};
    private static final Comparator<f> C = new a();
    private static final Interpolator D = new b();
    private static final p J = new p();

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
    public class a implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.b - fVar2.b;
        }
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
    public class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            lr3.this.setScrollState(0);
            lr3.this.K();
        }
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
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
            int childCount = lr3.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                gs o = sr.o(lr3.this.getChildAt(i), f1);
                rect.left = Math.min(o.p(), rect.left);
                rect.top = Math.min(o.r(), rect.top);
                rect.right = Math.min(o.q(), rect.right);
                rect.bottom = Math.min(o.o(), rect.bottom);
            }
            return f1.D(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* compiled from: SliderPager.java */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes3.dex */
    public @interface e {
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
    public static class f {
        public Object a;
        public int b;
        public boolean c;
        public float d;
        public float e;
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
    public class h extends fq {
        public h() {
        }

        private boolean n() {
            ra0 ra0Var = lr3.this.R;
            return ra0Var != null && ra0Var.e() > 1;
        }

        @Override // com.p7700g.p99005.fq
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            ra0 ra0Var;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(lr3.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (ra0Var = lr3.this.R) == null) {
                return;
            }
            accessibilityEvent.setItemCount(ra0Var.e());
            accessibilityEvent.setFromIndex(lr3.this.S);
            accessibilityEvent.setToIndex(lr3.this.S);
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            super.g(view, lsVar);
            lsVar.W0(lr3.class.getName());
            lsVar.F1(n());
            if (lr3.this.canScrollHorizontally(1)) {
                lsVar.a(4096);
            }
            if (lr3.this.canScrollHorizontally(-1)) {
                lsVar.a(8192);
            }
        }

        @Override // com.p7700g.p99005.fq
        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i == 8192 && lr3.this.canScrollHorizontally(-1)) {
                    lr3 lr3Var = lr3.this;
                    lr3Var.setCurrentItem(lr3Var.S - 1);
                    return true;
                }
                return false;
            } else if (lr3.this.canScrollHorizontally(1)) {
                lr3 lr3Var2 = lr3.this;
                lr3Var2.setCurrentItem(lr3Var2.S + 1);
                return true;
            } else {
                return false;
            }
        }
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
    public interface i {
        void e(@x1 lr3 lr3Var, @z1 ra0 ra0Var, @z1 ra0 ra0Var2);
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
    public interface j {
        void a(int i, float f, @c2 int i2);

        void b(int i);

        void c(int i);
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
    public interface l {
        void a(@x1 View view, float f);
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
    public class m extends DataSetObserver {
        public m() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            lr3.this.k();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            lr3.this.k();
        }
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
    public static class n extends au {
        public static final Parcelable.Creator<n> CREATOR = new a();
        public int s;
        public Parcelable t;
        public ClassLoader u;

        /* compiled from: SliderPager.java */
        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<n> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public n[] newArray(int i) {
                return new n[i];
            }
        }

        public n(@x1 Parcelable parcelable) {
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

        public n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.s = parcel.readInt();
            this.t = parcel.readParcelable(classLoader);
            this.u = classLoader;
        }
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
    public static class o implements j {
        @Override // com.p7700g.p99005.lr3.j
        public void a(int i, float f, int i2) {
        }

        @Override // com.p7700g.p99005.lr3.j
        public void b(int i) {
        }

        @Override // com.p7700g.p99005.lr3.j
        public void c(int i) {
        }
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
    public static class p implements Comparator<View> {
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

    public lr3(@x1 Context context) {
        super(context);
        this.O = new ArrayList<>();
        this.P = new f();
        this.Q = new Rect();
        this.T = -1;
        this.U = null;
        this.V = null;
        this.A0 = -3.4028235E38f;
        this.B0 = Float.MAX_VALUE;
        this.H0 = 1;
        this.R0 = -1;
        this.b1 = true;
        this.c1 = false;
        this.n1 = new c();
        this.o1 = 0;
        A();
    }

    private static boolean B(@x1 View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean D(float f2, float f3) {
        return (f2 < ((float) this.L0) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.L0)) && f3 < 0.0f);
    }

    private void F(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.N0 = motionEvent.getX(i2);
            this.R0 = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.S0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean I(int i2) {
        if (this.O.size() == 0) {
            if (this.b1) {
                return false;
            }
            this.d1 = false;
            E(0, 0.0f, 0);
            if (this.d1) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f y2 = y();
        int clientWidth = getClientWidth();
        int i3 = this.w0;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = y2.b;
        float f3 = ((i2 / f2) - y2.e) / (y2.d + (i3 / f2));
        this.d1 = false;
        E(i5, f3, (int) (i4 * f3));
        if (this.d1) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean J(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.N0 - f2;
        this.N0 = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.A0 * clientWidth;
        float f5 = this.B0 * clientWidth;
        boolean z4 = false;
        f fVar = this.O.get(0);
        ArrayList<f> arrayList = this.O;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.b != 0) {
            f4 = fVar.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (fVar2.b != this.R.e() - 1) {
            f5 = fVar2.e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.Z0.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.a1.onPull(Math.abs(scrollX - f5) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.N0 = (scrollX - i2) + this.N0;
        scrollTo(i2, getScrollY());
        I(i2);
        return z4;
    }

    private void M(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.O.isEmpty()) {
            if (!this.W.isFinished()) {
                this.W.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        f z2 = z(this.S);
        int min = (int) ((z2 != null ? Math.min(z2.e, this.B0) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            j(false);
            scrollTo(min, getScrollY());
        }
    }

    private void N() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private void Q(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private boolean R() {
        this.R0 = -1;
        r();
        this.Z0.onRelease();
        this.a1.onRelease();
        return this.Z0.isFinished() || this.a1.isFinished();
    }

    private void S(int i2, boolean z2, int i3, boolean z3) {
        int i4;
        f z4 = z(i2);
        if (z4 != null) {
            i4 = (int) (Math.max(this.A0, Math.min(z4.e, this.B0)) * getClientWidth());
        } else {
            i4 = 0;
        }
        if (z2) {
            b0(i4, 0, i3);
            if (z3) {
                d0(i2);
                return;
            }
            return;
        }
        if (z3) {
            d0(i2);
        }
        j(false);
        scrollTo(i4, 0);
        I(i4);
    }

    private void c0() {
        if (this.l1 != 0) {
            ArrayList<View> arrayList = this.m1;
            if (arrayList == null) {
                this.m1 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.m1.add(getChildAt(i2));
            }
            Collections.sort(this.m1, J);
        }
    }

    private void d0(int i2) {
        for (j jVar : this.f1) {
            if (jVar != null) {
                ra0 ra0Var = this.R;
                if (ra0Var instanceof ir3) {
                    jVar.c(((ir3) ra0Var).y(i2));
                } else {
                    jVar.c(i2);
                }
            }
        }
        j jVar2 = this.h1;
        if (jVar2 != null) {
            jVar2.c(i2);
        }
    }

    private void g(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int e2 = this.R.e();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.w0 / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.b;
            int i6 = fVar.b;
            if (i5 < i6) {
                float f3 = fVar2.e + fVar2.d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= fVar.b && i8 < this.O.size()) {
                    f fVar5 = this.O.get(i8);
                    while (true) {
                        fVar4 = fVar5;
                        if (i7 <= fVar4.b || i8 >= this.O.size() - 1) {
                            break;
                        }
                        i8++;
                        fVar5 = this.O.get(i8);
                    }
                    while (i7 < fVar4.b) {
                        f3 += this.R.h(i7) + f2;
                        i7++;
                    }
                    fVar4.e = f3;
                    f3 += fVar4.d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.O.size() - 1;
                float f4 = fVar2.e;
                while (true) {
                    i5--;
                    if (i5 < fVar.b || size < 0) {
                        break;
                    }
                    f fVar6 = this.O.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i5 >= fVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.O.get(size);
                    }
                    while (i5 > fVar3.b) {
                        f4 -= this.R.h(i5) + f2;
                        i5--;
                    }
                    f4 -= fVar3.d + f2;
                    fVar3.e = f4;
                }
            }
        }
        int size2 = this.O.size();
        float f5 = fVar.e;
        int i9 = fVar.b;
        int i10 = i9 - 1;
        this.A0 = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = e2 - 1;
        this.B0 = i9 == i11 ? (fVar.d + f5) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar7 = this.O.get(i12);
            while (true) {
                i4 = fVar7.b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.R.h(i10) + f2;
                i10--;
            }
            f5 -= fVar7.d + f2;
            fVar7.e = f5;
            if (i4 == 0) {
                this.A0 = f5;
            }
            i12--;
            i10--;
        }
        float f6 = fVar.e + fVar.d + f2;
        int i13 = fVar.b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar8 = this.O.get(i14);
            while (true) {
                i3 = fVar8.b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.R.h(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.B0 = (fVar8.d + f6) - 1.0f;
            }
            fVar8.e = f6;
            f6 += fVar8.d + f2;
            i14++;
            i13++;
        }
        this.c1 = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void j(boolean z2) {
        boolean z3 = this.o1 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.W.isFinished()) {
                this.W.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.W.getCurrX();
                int currY = this.W.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        I(currX);
                    }
                }
            }
        }
        this.G0 = false;
        for (int i2 = 0; i2 < this.O.size(); i2++) {
            f fVar = this.O.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z2) {
                sr.o1(this, this.n1);
            } else {
                this.n1.run();
            }
        }
    }

    private int l(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.V0 || Math.abs(i3) <= this.T0) {
            i2 += (int) (f2 + (i2 >= this.S ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.O.size() > 0) {
            ArrayList<f> arrayList = this.O;
            return Math.max(this.O.get(0).b, Math.min(i2, arrayList.get(arrayList.size() - 1).b));
        }
        return i2;
    }

    private void m(int i2, float f2, int i3) {
        j jVar = this.g1;
        if (jVar != null) {
            jVar.a(i2, f2, i3);
        }
        List<j> list = this.f1;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.f1.get(i4);
                if (jVar2 != null) {
                    jVar2.a(i2, f2, i3);
                }
            }
        }
        j jVar3 = this.h1;
        if (jVar3 != null) {
            jVar3.a(i2, f2, i3);
        }
    }

    private void n(int i2) {
        j jVar = this.g1;
        if (jVar != null) {
            jVar.c(i2);
        }
        List<j> list = this.f1;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.f1.get(i3);
                if (jVar2 != null) {
                    jVar2.c(i2);
                }
            }
        }
        j jVar3 = this.h1;
        if (jVar3 != null) {
            jVar3.c(i2);
        }
    }

    private void o(int i2) {
        j jVar = this.g1;
        if (jVar != null) {
            jVar.b(i2);
        }
        List<j> list = this.f1;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.f1.get(i3);
                if (jVar2 != null) {
                    jVar2.b(i2);
                }
            }
        }
        j jVar3 = this.h1;
        if (jVar3 != null) {
            jVar3.b(i2);
        }
    }

    private void q(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z2 ? this.k1 : 0, null);
        }
    }

    private void r() {
        this.I0 = false;
        this.J0 = false;
        VelocityTracker velocityTracker = this.S0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.S0 = null;
        }
    }

    private void setAdapterViewPagerObserver(m mVar) {
        try {
            Method declaredMethod = ra0.class.getDeclaredMethod("r", DataSetObserver.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.R, mVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.F0 != z2) {
            this.F0 = z2;
        }
    }

    private Rect v(Rect rect, View view) {
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

    private f y() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.w0 / clientWidth : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.O.size()) {
            f fVar2 = this.O.get(i4);
            if (!z2 && fVar2.b != (i2 = i3 + 1)) {
                fVar2 = this.P;
                fVar2.e = f2 + f4 + f3;
                fVar2.b = i2;
                fVar2.d = this.R.h(i2);
                i4--;
            }
            f2 = fVar2.e;
            float f5 = fVar2.d + f2 + f3;
            if (!z2 && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i4 == this.O.size() - 1) {
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

    public void A() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.W = new k(context, 250, D);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.M0 = viewConfiguration.getScaledPagingTouchSlop();
        this.T0 = (int) (400.0f * f2);
        this.U0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Z0 = new EdgeEffect(context);
        this.a1 = new EdgeEffect(context);
        this.V0 = (int) (25.0f * f2);
        this.W0 = (int) (2.0f * f2);
        this.K0 = (int) (f2 * 16.0f);
        sr.A1(this, new h());
        if (sr.U(this) == 0) {
            sr.Q1(this, 1);
        }
        sr.Z1(this, new d());
    }

    public boolean C() {
        return this.X0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    @t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(int i2, float f2, int i3) {
        int max;
        int i4;
        int left;
        if (this.e1 > 0) {
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
        m(i2, f2, i3);
        if (this.j1 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((g) childAt2.getLayoutParams()).a) {
                    this.j1.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.d1 = true;
    }

    public boolean G() {
        int i2 = this.S;
        if (i2 > 0) {
            T(i2 - 1, true);
            return true;
        }
        return false;
    }

    public boolean H() {
        ra0 ra0Var = this.R;
        if (ra0Var == null || this.S >= ra0Var.e() - 1) {
            return false;
        }
        T(this.S + 1, true);
        return true;
    }

    public void K() {
        L(this.S);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r5 == r6) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void L(int i2) {
        f fVar;
        String hexString;
        f fVar2;
        f x2;
        int i3 = this.S;
        if (i3 != i2) {
            fVar = z(i3);
            this.S = i2;
        } else {
            fVar = null;
        }
        if (this.R == null) {
            c0();
        } else if (this.G0) {
            c0();
        } else if (getWindowToken() != null) {
            this.R.t(this);
            int i4 = this.H0;
            int max = Math.max(0, this.S - i4);
            int e2 = this.R.e();
            int min = Math.min(e2 - 1, this.S + i4);
            if (e2 == this.N) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.O.size()) {
                        break;
                    }
                    fVar2 = this.O.get(i5);
                    int i6 = fVar2.b;
                    int i7 = this.S;
                    if (i6 < i7) {
                        i5++;
                    }
                }
                fVar2 = null;
                if (fVar2 == null && e2 > 0) {
                    fVar2 = b(this.S, i5);
                }
                if (fVar2 != null) {
                    int i8 = i5 - 1;
                    f fVar3 = i8 >= 0 ? this.O.get(i8) : null;
                    int clientWidth = getClientWidth();
                    float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - fVar2.d) + (getPaddingLeft() / clientWidth);
                    float f2 = 0.0f;
                    for (int i9 = this.S - 1; i9 >= 0; i9--) {
                        if (f2 < paddingLeft || i9 >= max) {
                            if (fVar3 != null && i9 == fVar3.b) {
                                f2 += fVar3.d;
                                i8--;
                                if (i8 >= 0) {
                                    fVar3 = this.O.get(i8);
                                }
                                fVar3 = null;
                            } else {
                                f2 += b(i9, i8 + 1).d;
                                i5++;
                                if (i8 >= 0) {
                                    fVar3 = this.O.get(i8);
                                }
                                fVar3 = null;
                            }
                        } else if (fVar3 == null) {
                            break;
                        } else if (i9 == fVar3.b && !fVar3.c) {
                            this.O.remove(i8);
                            this.R.b(this, i9, fVar3.a);
                            i8--;
                            i5--;
                            if (i8 >= 0) {
                                fVar3 = this.O.get(i8);
                            }
                            fVar3 = null;
                        }
                    }
                    float f3 = fVar2.d;
                    int i10 = i5 + 1;
                    if (f3 < 2.0f) {
                        f fVar4 = i10 < this.O.size() ? this.O.get(i10) : null;
                        float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                        int i11 = this.S;
                        while (true) {
                            i11++;
                            if (i11 >= e2) {
                                break;
                            } else if (f3 < paddingRight || i11 <= min) {
                                if (fVar4 != null && i11 == fVar4.b) {
                                    f3 += fVar4.d;
                                    i10++;
                                    if (i10 < this.O.size()) {
                                        fVar4 = this.O.get(i10);
                                    }
                                } else {
                                    f b2 = b(i11, i10);
                                    i10++;
                                    f3 += b2.d;
                                    fVar4 = i10 < this.O.size() ? this.O.get(i10) : null;
                                }
                            } else if (fVar4 == null) {
                                break;
                            } else if (i11 == fVar4.b && !fVar4.c) {
                                this.O.remove(i10);
                                this.R.b(this, i11, fVar4.a);
                                if (i10 < this.O.size()) {
                                    fVar4 = this.O.get(i10);
                                }
                            }
                        }
                    }
                    g(fVar2, i5, fVar);
                    this.R.q(this, this.S, fVar2.a);
                }
                this.R.d(this);
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    g gVar = (g) childAt.getLayoutParams();
                    gVar.f = i12;
                    if (!gVar.a && gVar.c == 0.0f && (x2 = x(childAt)) != null) {
                        gVar.c = x2.d;
                        gVar.e = x2.b;
                    }
                }
                c0();
                if (hasFocus()) {
                    View findFocus = findFocus();
                    f w2 = findFocus != null ? w(findFocus) : null;
                    if (w2 == null || w2.b != this.S) {
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt2 = getChildAt(i13);
                            f x3 = x(childAt2);
                            if (x3 != null && x3.b == this.S && childAt2.requestFocus(2)) {
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
            G2.append(this.N);
            G2.append(", found: ");
            G2.append(e2);
            G2.append(" Pager id: ");
            G2.append(hexString);
            G2.append(" Pager class: ");
            G2.append(getClass());
            G2.append(" Problematic adapter: ");
            G2.append(this.R.getClass());
            throw new IllegalStateException(G2.toString());
        }
    }

    public void O(@x1 i iVar) {
        List<i> list = this.i1;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void P(@x1 j jVar) {
        List<j> list = this.f1;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public void T(int i2, boolean z2) {
        ra0 ra0Var = this.R;
        if (ra0Var instanceof ir3) {
            i2 = ((ir3) ra0Var).v(i2);
        }
        this.G0 = false;
        U(i2, z2, false);
    }

    public void U(int i2, boolean z2, boolean z3) {
        V(i2, z2, z3, 0);
    }

    public void V(int i2, boolean z2, boolean z3, int i3) {
        ra0 ra0Var = this.R;
        if (ra0Var != null && ra0Var.e() > 0) {
            if (!z3 && this.S == i2 && this.O.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.R.e()) {
                i2 = this.R.e() - 1;
            }
            int i4 = this.H0;
            int i5 = this.S;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.O.size(); i6++) {
                    this.O.get(i6).c = true;
                }
            }
            boolean z4 = this.S != i2;
            if (this.b1) {
                this.S = i2;
                d0(i2);
                requestLayout();
                return;
            }
            L(i2);
            S(i2, z2, i3, z4);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public j W(j jVar) {
        j jVar2 = this.h1;
        this.h1 = jVar;
        return jVar2;
    }

    public void X(boolean z2, @z1 l lVar) {
        Y(z2, lVar, 2);
    }

    public void Y(boolean z2, @z1 l lVar, int i2) {
        boolean z3 = lVar != null;
        boolean z4 = z3 != (this.j1 != null);
        this.j1 = lVar;
        setChildrenDrawingOrderEnabled(z3);
        if (z3) {
            this.l1 = z2 ? 2 : 1;
            this.k1 = i2;
        } else {
            this.l1 = 0;
        }
        if (z4) {
            K();
        }
    }

    public void Z(int i2, Interpolator interpolator) {
        if (interpolator != null) {
            this.W = new k(getContext(), i2, interpolator);
        } else {
            this.W = new k(getContext(), i2);
        }
    }

    public void a0(int i2, int i3) {
        b0(i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f x2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (x2 = x(childAt)) != null && x2.b == this.S) {
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
        f x2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (x2 = x(childAt)) != null && x2.b == this.S) {
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
        boolean B2 = gVar.a | B(view);
        gVar.a = B2;
        if (!this.E0) {
            super.addView(view, i2, layoutParams);
        } else if (!B2) {
            gVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public f b(int i2, int i3) {
        f fVar = new f();
        fVar.b = i2;
        fVar.a = this.R.j(this, i2);
        fVar.d = this.R.h(i2);
        if (i3 >= 0 && i3 < this.O.size()) {
            this.O.add(i3, fVar);
        } else {
            this.O.add(fVar);
        }
        return fVar;
    }

    public void b0(int i2, int i3, int i4) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.W;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.u0 ? this.W.getCurrX() : this.W.getStartX();
            this.W.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            j(false);
            K();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float p2 = (p(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3) + f3;
        int abs2 = Math.abs(i4);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(p2 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i6) / ((this.R.h(this.S) * f2) + this.w0)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.u0 = false;
        this.W.startScroll(i5, scrollY, i6, i7, min);
        sr.m1(this);
    }

    public void c(@x1 i iVar) {
        if (this.i1 == null) {
            this.i1 = new ArrayList();
        }
        this.i1.add(iVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.R == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.A0)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.B0));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.u0 = true;
        if (!this.W.isFinished() && this.W.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.W.getCurrX();
            int currY = this.W.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!I(currX)) {
                    this.W.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            sr.m1(this);
            return;
        }
        j(true);
    }

    public void d(@x1 j jVar) {
        if (this.f1 == null) {
            this.f1 = new ArrayList();
        }
        this.f1.add(jVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f x2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (x2 = x(childAt)) != null && x2.b == this.S && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        if (overScrollMode != 0 && (overScrollMode != 1 || (ra0Var = this.R) == null || ra0Var.e() <= 1)) {
            this.Z0.finish();
            this.a1.finish();
        } else {
            if (!this.Z0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.A0 * width);
                this.Z0.setSize(height, width);
                z2 = false | this.Z0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.a1.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.B0 + 1.0f)) * width2);
                this.a1.setSize(height2, width2);
                z2 |= this.a1.draw(canvas);
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
        Drawable drawable = this.x0;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(int i2) {
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
                    int i3 = v(this.Q, findNextFocus).left;
                    int i4 = v(this.Q, findFocus).left;
                    if (findFocus != null && i3 >= i4) {
                        requestFocus = G();
                    } else {
                        requestFocus = findNextFocus.requestFocus();
                    }
                } else if (i2 == 66) {
                    int i5 = v(this.Q, findNextFocus).left;
                    int i6 = v(this.Q, findFocus).left;
                    if (findFocus != null && i5 <= i6) {
                        requestFocus = H();
                    } else {
                        requestFocus = findNextFocus.requestFocus();
                    }
                }
                z3 = requestFocus;
            } else if (i2 != 17 || i2 == 1) {
                z3 = G();
            } else if (i2 == 66 || i2 == 2) {
                z3 = H();
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
        z3 = G();
        if (z3) {
        }
        return z3;
    }

    public boolean f() {
        if (this.I0) {
            return false;
        }
        this.X0 = true;
        setScrollState(1);
        this.N0 = 0.0f;
        this.P0 = 0.0f;
        VelocityTracker velocityTracker = this.S0;
        if (velocityTracker == null) {
            this.S0 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.S0.addMovement(obtain);
        obtain.recycle();
        this.Y0 = uptimeMillis;
        return true;
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
        return this.R;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.l1 == 2) {
            i3 = (i2 - 1) - i3;
        }
        ArrayList<View> arrayList = this.m1;
        if (arrayList == null || arrayList.size() != getChildCount()) {
            c0();
        }
        return ((g) this.m1.get(i3).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        ra0 ra0Var = this.R;
        if ((ra0Var instanceof ir3) && ((ir3) ra0Var).x() > 0) {
            return ((ir3) this.R).y(this.S);
        }
        return this.S;
    }

    public int getOffscreenPageLimit() {
        return this.H0;
    }

    public int getPageMargin() {
        return this.w0;
    }

    public boolean h(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && h(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    public void i() {
        List<j> list = this.f1;
        if (list != null) {
            list.clear();
        }
    }

    public void k() {
        int e2 = this.R.e();
        this.N = e2;
        boolean z2 = this.O.size() < (this.H0 * 2) + 1 && this.O.size() < e2;
        int i2 = this.S;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.O.size()) {
            f fVar = this.O.get(i3);
            int f2 = this.R.f(fVar.a);
            if (f2 != -1) {
                if (f2 == -2) {
                    this.O.remove(i3);
                    i3--;
                    if (!z3) {
                        this.R.t(this);
                        z3 = true;
                    }
                    this.R.b(this, fVar.b, fVar.a);
                    int i4 = this.S;
                    if (i4 == fVar.b) {
                        i2 = Math.max(0, Math.min(i4, e2 - 1));
                    }
                } else {
                    int i5 = fVar.b;
                    if (i5 != f2) {
                        if (i5 == this.S) {
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
            this.R.d(this);
        }
        Collections.sort(this.O, C);
        if (z2) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                g gVar = (g) getChildAt(i6).getLayoutParams();
                if (!gVar.a) {
                    gVar.c = 0.0f;
                }
            }
            U(i2, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.n1);
        Scroller scroller = this.W;
        if (scroller != null && !scroller.isFinished()) {
            this.W.abortAnimation();
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
        if (this.w0 <= 0 || this.x0 == null || this.O.size() <= 0 || this.R == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f4 = this.w0 / width2;
        int i3 = 0;
        f fVar = this.O.get(0);
        float f5 = fVar.e;
        int size = this.O.size();
        int i4 = fVar.b;
        int i5 = this.O.get(size - 1).b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = this.O.get(i3);
            }
            if (i4 == i2) {
                float f6 = fVar.e;
                float f7 = fVar.d;
                f2 = (f6 + f7) * width2;
                f5 = f6 + f7 + f4;
            } else {
                float h2 = this.R.h(i4);
                f2 = (f5 + h2) * width2;
                f5 = h2 + f4 + f5;
            }
            if (this.w0 + f2 > scrollX) {
                f3 = f4;
                this.x0.setBounds(Math.round(f2), this.y0, Math.round(this.w0 + f2), this.z0);
                this.x0.draw(canvas);
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
        try {
            int action = motionEvent.getAction() & 255;
            if (action != 3 && action != 1) {
                if (action != 0) {
                    if (this.I0) {
                        return true;
                    }
                    if (this.J0) {
                        return false;
                    }
                }
                if (action == 0) {
                    float x2 = motionEvent.getX();
                    this.P0 = x2;
                    this.N0 = x2;
                    float y2 = motionEvent.getY();
                    this.Q0 = y2;
                    this.O0 = y2;
                    this.R0 = motionEvent.getPointerId(0);
                    this.J0 = false;
                    this.u0 = true;
                    this.W.computeScrollOffset();
                    if (this.o1 == 2 && Math.abs(this.W.getFinalX() - this.W.getCurrX()) > this.W0) {
                        this.W.abortAnimation();
                        this.G0 = false;
                        K();
                        this.I0 = true;
                        Q(true);
                        setScrollState(1);
                    } else {
                        j(false);
                        this.I0 = false;
                    }
                } else if (action == 2) {
                    int i2 = this.R0;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        float x3 = motionEvent.getX(findPointerIndex);
                        float f2 = x3 - this.N0;
                        float abs = Math.abs(f2);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y3 - this.Q0);
                        int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                        if (i3 != 0 && !D(this.N0, f2) && h(this, false, (int) f2, (int) x3, (int) y3)) {
                            this.N0 = x3;
                            this.O0 = y3;
                            this.J0 = true;
                            return false;
                        }
                        int i4 = this.M0;
                        if (abs > i4 && abs * 0.5f > abs2) {
                            this.I0 = true;
                            Q(true);
                            setScrollState(1);
                            this.N0 = i3 > 0 ? this.P0 + this.M0 : this.P0 - this.M0;
                            this.O0 = y3;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i4) {
                            this.J0 = true;
                        }
                        if (this.I0 && J(x3)) {
                            sr.m1(this);
                        }
                    }
                } else if (action == 6) {
                    F(motionEvent);
                }
                if (this.S0 == null) {
                    this.S0 = VelocityTracker.obtain();
                }
                this.S0.addMovement(motionEvent);
                return this.I0;
            }
            R();
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        f x2;
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
                if (!gVar2.a && (x2 = x(childAt2)) != null) {
                    float f2 = i18;
                    int i20 = ((int) (x2.e * f2)) + paddingLeft;
                    if (gVar2.d) {
                        gVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * gVar2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i9 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i20, paddingTop, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.y0 = paddingTop;
        this.z0 = i9 - paddingBottom;
        this.e1 = i10;
        if (this.b1) {
            z3 = false;
            S(this.S, false, 0, false);
        } else {
            z3 = false;
        }
        this.b1 = z3;
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
        this.L0 = Math.min(measuredWidth / 10, this.K0);
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
        this.C0 = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.D0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.E0 = true;
        K();
        this.E0 = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.c), 1073741824), this.D0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f x2;
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
            if (childAt.getVisibility() == 0 && (x2 = x(childAt)) != null && x2.b == this.S && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        ra0 ra0Var = this.R;
        if (ra0Var != null) {
            ra0Var.n(nVar.t, nVar.u);
            U(nVar.s, false, true);
            return;
        }
        this.T = nVar.s;
        this.U = nVar.t;
        this.V = nVar.u;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.s = this.S;
        ra0 ra0Var = this.R;
        if (ra0Var != null) {
            nVar.t = ra0Var.o();
        }
        return nVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.w0;
            M(i2, i4, i6, i6);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ra0 ra0Var;
        if (this.X0) {
            return true;
        }
        boolean z2 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (ra0Var = this.R) == null || ra0Var.e() == 0) {
            return false;
        }
        if (this.S0 == null) {
            this.S0 = VelocityTracker.obtain();
        }
        this.S0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.W.abortAnimation();
            this.G0 = false;
            K();
            float x2 = motionEvent.getX();
            this.P0 = x2;
            this.N0 = x2;
            float y2 = motionEvent.getY();
            this.Q0 = y2;
            this.O0 = y2;
            this.R0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.I0) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.R0);
                    if (findPointerIndex == -1) {
                        z2 = R();
                    } else {
                        float x3 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x3 - this.N0);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y3 - this.O0);
                        if (abs > this.M0 && abs > abs2) {
                            this.I0 = true;
                            Q(true);
                            float f2 = this.P0;
                            this.N0 = x3 - f2 > 0.0f ? f2 + this.M0 : f2 - this.M0;
                            this.O0 = y3;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.I0) {
                    z2 = false | J(motionEvent.getX(motionEvent.findPointerIndex(this.R0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.N0 = motionEvent.getX(actionIndex);
                    this.R0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    F(motionEvent);
                    this.N0 = motionEvent.getX(motionEvent.findPointerIndex(this.R0));
                }
            } else if (this.I0) {
                S(this.S, true, 0, false);
                z2 = R();
            }
        } else if (this.I0) {
            VelocityTracker velocityTracker = this.S0;
            velocityTracker.computeCurrentVelocity(1000, this.U0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.R0);
            this.G0 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f y4 = y();
            float f3 = clientWidth;
            V(l(y4.b, ((scrollX / f3) - y4.e) / (y4.d + (this.w0 / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.R0)) - this.P0)), true, true, xVelocity);
            z2 = R();
        }
        if (z2) {
            sr.m1(this);
        }
        return true;
    }

    public float p(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.E0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void s() {
        if (this.X0) {
            if (this.R != null) {
                VelocityTracker velocityTracker = this.S0;
                velocityTracker.computeCurrentVelocity(1000, this.U0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.R0);
                this.G0 = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                f y2 = y();
                V(l(y2.b, ((scrollX / clientWidth) - y2.e) / y2.d, xVelocity, (int) (this.N0 - this.P0)), true, true, xVelocity);
            }
            r();
            this.X0 = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public void setAdapter(ra0 ra0Var) {
        if (this.R != null) {
            setAdapterViewPagerObserver(null);
            this.R.t(this);
            for (int i2 = 0; i2 < this.O.size(); i2++) {
                f fVar = this.O.get(i2);
                this.R.b(this, fVar.b, fVar.a);
            }
            this.R.d(this);
            this.O.clear();
            N();
            this.S = 0;
            scrollTo(0, 0);
        }
        ra0 ra0Var2 = this.R;
        this.R = ra0Var;
        this.N = 0;
        if (ra0Var != null) {
            if (this.v0 == null) {
                this.v0 = new m();
            }
            setAdapterViewPagerObserver(this.v0);
            try {
                this.R.m(this.v0);
            } catch (Exception unused) {
            }
            this.G0 = false;
            boolean z2 = this.b1;
            this.b1 = true;
            this.N = this.R.e();
            if (this.T >= 0) {
                this.R.n(this.U, this.V);
                U(this.T, false, true);
                this.T = -1;
                this.U = null;
                this.V = null;
            } else if (!z2) {
                K();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.i1;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.i1.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.i1.get(i3).e(this, ra0Var2, ra0Var);
        }
    }

    public void setCurrentItem(int i2) {
        this.G0 = false;
        T(i2, !this.b1);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            i2 = 1;
        }
        if (i2 != this.H0) {
            this.H0 = i2;
            K();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.g1 = jVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.w0;
        this.w0 = i2;
        int width = getWidth();
        M(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(@z1 Drawable drawable) {
        this.x0 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollDuration(int i2) {
        Z(i2, null);
    }

    public void setScrollState(int i2) {
        if (this.o1 == i2) {
            return;
        }
        this.o1 = i2;
        if (this.j1 != null) {
            q(i2 != 0);
        }
        o(i2);
    }

    public boolean t(@x1 KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return G();
                }
                return e(17);
            } else if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return H();
                }
                return e(66);
            } else if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return e(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return e(1);
                }
            }
        }
        return false;
    }

    public void u(float f2) {
        ArrayList<f> arrayList;
        if (this.X0) {
            if (this.R == null) {
                return;
            }
            this.N0 += f2;
            float scrollX = getScrollX() - f2;
            float clientWidth = getClientWidth();
            float f3 = this.A0 * clientWidth;
            float f4 = this.B0 * clientWidth;
            f fVar = this.O.get(0);
            f fVar2 = this.O.get(arrayList.size() - 1);
            if (fVar.b != 0) {
                f3 = fVar.e * clientWidth;
            }
            if (fVar2.b != this.R.e() - 1) {
                f4 = fVar2.e * clientWidth;
            }
            if (scrollX < f3) {
                scrollX = f3;
            } else if (scrollX > f4) {
                scrollX = f4;
            }
            int i2 = (int) scrollX;
            this.N0 = (scrollX - i2) + this.N0;
            scrollTo(i2, getScrollY());
            I(i2);
            MotionEvent obtain = MotionEvent.obtain(this.Y0, SystemClock.uptimeMillis(), 2, this.N0, 0.0f, 0);
            this.S0.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.x0;
    }

    public f w(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return x(view);
            }
        }
    }

    public f x(View view) {
        for (int i2 = 0; i2 < this.O.size(); i2++) {
            f fVar = this.O.get(i2);
            if (this.R.k(view, fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public f z(int i2) {
        for (int i3 = 0; i3 < this.O.size(); i3++) {
            f fVar = this.O.get(i3);
            if (fVar.b == i2) {
                return fVar;
            }
        }
        return null;
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lr3.B);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* compiled from: SliderPager.java */
    /* loaded from: classes3.dex */
    public class k extends Scroller {
        private int a;

        public k(Context context, int i) {
            super(context, lr3.D);
            this.a = i;
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, this.a);
        }

        public k(Context context, int i, Interpolator interpolator) {
            super(context, interpolator);
            this.a = i;
        }
    }

    public void setPageMarginDrawable(@f1 int i2) {
        setPageMarginDrawable(gh.i(getContext(), i2));
    }

    public lr3(@x1 Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O = new ArrayList<>();
        this.P = new f();
        this.Q = new Rect();
        this.T = -1;
        this.U = null;
        this.V = null;
        this.A0 = -3.4028235E38f;
        this.B0 = Float.MAX_VALUE;
        this.H0 = 1;
        this.R0 = -1;
        this.b1 = true;
        this.c1 = false;
        this.n1 = new c();
        this.o1 = 0;
        A();
    }
}