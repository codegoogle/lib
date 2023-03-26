package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.p7700g.p99005.eu;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: SlidingPaneLayout.java */
/* loaded from: classes.dex */
public class k60 extends ViewGroup {
    private static final String s = "SlidingPaneLayout";
    private static final int t = 32;
    private static final int u = -858993460;
    private static final int v = 400;
    private final int A;
    private boolean B;
    public View C;
    public float D;
    private float E;
    public int F;
    public boolean G;
    private int H;
    private float I;
    private float J;
    private e K;
    public final eu L;
    public boolean M;
    private boolean N;
    private final Rect O;
    public final ArrayList<b> P;
    private Method Q;
    private Field R;
    private boolean S;
    private int w;
    private int x;
    private Drawable y;
    private Drawable z;

    /* compiled from: SlidingPaneLayout.java */
    /* loaded from: classes.dex */
    public class a extends fq {
        private final Rect d = new Rect();

        public a() {
        }

        private void n(ls lsVar, ls lsVar2) {
            Rect rect = this.d;
            lsVar2.s(rect);
            lsVar.R0(rect);
            lsVar2.t(rect);
            lsVar.S0(rect);
            lsVar.V1(lsVar2.B0());
            lsVar.x1(lsVar2.N());
            lsVar.W0(lsVar2.w());
            lsVar.a1(lsVar2.A());
            lsVar.g1(lsVar2.o0());
            lsVar.X0(lsVar2.j0());
            lsVar.i1(lsVar2.p0());
            lsVar.j1(lsVar2.q0());
            lsVar.O0(lsVar2.g0());
            lsVar.G1(lsVar2.y0());
            lsVar.t1(lsVar2.t0());
            lsVar.a(lsVar2.p());
            lsVar.v1(lsVar2.L());
        }

        @Override // com.p7700g.p99005.fq
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(k60.class.getName());
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            ls F0 = ls.F0(lsVar);
            super.g(view, F0);
            n(lsVar, F0);
            F0.I0();
            lsVar.W0(k60.class.getName());
            lsVar.I1(view);
            ViewParent k0 = sr.k0(view);
            if (k0 instanceof View) {
                lsVar.z1((View) k0);
            }
            int childCount = k60.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = k60.this.getChildAt(i);
                if (!o(childAt) && childAt.getVisibility() == 0) {
                    sr.Q1(childAt, 1);
                    lsVar.c(childAt);
                }
            }
        }

        @Override // com.p7700g.p99005.fq
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (o(view)) {
                return false;
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        public boolean o(View view) {
            return k60.this.j(view);
        }
    }

    /* compiled from: SlidingPaneLayout.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final View s;

        public b(View view) {
            this.s = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.s.getParent() == k60.this) {
                this.s.setLayerType(0, null);
                k60.this.i(this.s);
            }
            k60.this.P.remove(this);
        }
    }

    /* compiled from: SlidingPaneLayout.java */
    /* loaded from: classes.dex */
    public class c extends eu.c {
        public c() {
        }

        @Override // com.p7700g.p99005.eu.c
        public int a(View view, int i, int i2) {
            d dVar = (d) k60.this.C.getLayoutParams();
            if (k60.this.k()) {
                int width = k60.this.getWidth() - (k60.this.C.getWidth() + (k60.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
                return Math.max(Math.min(i, width), width - k60.this.F);
            }
            int paddingLeft = k60.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
            return Math.min(Math.max(i, paddingLeft), k60.this.F + paddingLeft);
        }

        @Override // com.p7700g.p99005.eu.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.p7700g.p99005.eu.c
        public int d(View view) {
            return k60.this.F;
        }

        @Override // com.p7700g.p99005.eu.c
        public void f(int i, int i2) {
            k60 k60Var = k60.this;
            k60Var.L.d(k60Var.C, i2);
        }

        @Override // com.p7700g.p99005.eu.c
        public void i(View view, int i) {
            k60.this.r();
        }

        @Override // com.p7700g.p99005.eu.c
        public void j(int i) {
            if (k60.this.L.F() == 0) {
                k60 k60Var = k60.this;
                if (k60Var.D == 0.0f) {
                    k60Var.v(k60Var.C);
                    k60 k60Var2 = k60.this;
                    k60Var2.f(k60Var2.C);
                    k60.this.M = false;
                    return;
                }
                k60Var.g(k60Var.C);
                k60.this.M = true;
            }
        }

        @Override // com.p7700g.p99005.eu.c
        public void k(View view, int i, int i2, int i3, int i4) {
            k60.this.n(i);
            k60.this.invalidate();
        }

        @Override // com.p7700g.p99005.eu.c
        public void l(View view, float f, float f2) {
            int paddingLeft;
            d dVar = (d) view.getLayoutParams();
            if (k60.this.k()) {
                int paddingRight = k60.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                if (f < 0.0f || (f == 0.0f && k60.this.D > 0.5f)) {
                    paddingRight += k60.this.F;
                }
                paddingLeft = (k60.this.getWidth() - paddingRight) - k60.this.C.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + k60.this.getPaddingLeft();
                int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i > 0 || (i == 0 && k60.this.D > 0.5f)) {
                    paddingLeft += k60.this.F;
                }
            }
            k60.this.L.V(paddingLeft, view.getTop());
            k60.this.invalidate();
        }

        @Override // com.p7700g.p99005.eu.c
        public boolean m(View view, int i) {
            if (k60.this.G) {
                return false;
            }
            return ((d) view.getLayoutParams()).c;
        }
    }

    /* compiled from: SlidingPaneLayout.java */
    /* loaded from: classes.dex */
    public interface e {
        void a(@x1 View view, float f);

        void b(@x1 View view);

        void c(@x1 View view);
    }

    /* compiled from: SlidingPaneLayout.java */
    /* loaded from: classes.dex */
    public static class f extends au {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public boolean s;

        /* compiled from: SlidingPaneLayout.java */
        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // com.p7700g.p99005.au, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.s ? 1 : 0);
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.s = parcel.readInt() != 0;
        }
    }

    /* compiled from: SlidingPaneLayout.java */
    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // com.p7700g.p99005.k60.e
        public void a(View view, float f) {
        }

        @Override // com.p7700g.p99005.k60.e
        public void b(View view) {
        }

        @Override // com.p7700g.p99005.k60.e
        public void c(View view) {
        }
    }

    public k60(@x1 Context context) {
        this(context, null);
    }

    private boolean d(View view, int i) {
        if (this.N || u(0.0f, i)) {
            this.M = false;
            return true;
        }
        return false;
    }

    private void e(View view, float f2, int i) {
        d dVar = (d) view.getLayoutParams();
        if (f2 > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f2)) << 24) | (i & sr.s);
            if (dVar.e == null) {
                dVar.e = new Paint();
            }
            dVar.e.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, dVar.e);
            }
            i(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = dVar.e;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            b bVar = new b(view);
            this.P.add(bVar);
            sr.o1(this, bVar);
        }
    }

    private boolean p(View view, int i) {
        if (this.N || u(1.0f, i)) {
            this.M = true;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void q(float f2) {
        boolean z;
        int childCount;
        boolean k = k();
        d dVar = (d) this.C.getLayoutParams();
        if (dVar.d) {
            if ((k ? ((ViewGroup.MarginLayoutParams) dVar).rightMargin : ((ViewGroup.MarginLayoutParams) dVar).leftMargin) <= 0) {
                z = true;
                childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt != this.C) {
                        int i2 = this.H;
                        this.E = f2;
                        int i3 = ((int) ((1.0f - this.E) * i2)) - ((int) ((1.0f - f2) * i2));
                        if (k) {
                            i3 = -i3;
                        }
                        childAt.offsetLeftAndRight(i3);
                        if (z) {
                            float f3 = this.E;
                            e(childAt, k ? f3 - 1.0f : 1.0f - f3, this.x);
                        }
                    }
                }
            }
        }
        z = false;
        childCount = getChildCount();
        while (i < childCount) {
        }
    }

    private static boolean w(View view) {
        return view.isOpaque();
    }

    public boolean a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z) {
            if (view.canScrollHorizontally(k() ? i : -i)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean b() {
        return this.B;
    }

    public boolean c() {
        return d(this.C, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.L.o(true)) {
            if (!this.B) {
                this.L.a();
            } else {
                sr.m1(this);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        int i2;
        super.draw(canvas);
        if (k()) {
            drawable = this.z;
        } else {
            drawable = this.y;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (k()) {
            i2 = childAt.getRight();
            i = intrinsicWidth + i2;
        } else {
            int left = childAt.getLeft();
            int i3 = left - intrinsicWidth;
            i = left;
            i2 = i3;
        }
        drawable.setBounds(i2, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        d dVar = (d) view.getLayoutParams();
        int save = canvas.save();
        if (this.B && !dVar.c && this.C != null) {
            canvas.getClipBounds(this.O);
            if (k()) {
                Rect rect = this.O;
                rect.left = Math.max(rect.left, this.C.getRight());
            } else {
                Rect rect2 = this.O;
                rect2.right = Math.min(rect2.right, this.C.getLeft());
            }
            canvas.clipRect(this.O);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public void f(View view) {
        e eVar = this.K;
        if (eVar != null) {
            eVar.c(view);
        }
        sendAccessibilityEvent(32);
    }

    public void g(View view) {
        e eVar = this.K;
        if (eVar != null) {
            eVar.b(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    @w0
    public int getCoveredFadeColor() {
        return this.x;
    }

    @c2
    public int getParallaxDistance() {
        return this.H;
    }

    @w0
    public int getSliderFadeColor() {
        return this.w;
    }

    public void h(View view) {
        e eVar = this.K;
        if (eVar != null) {
            eVar.a(view, this.D);
        }
    }

    public void i(View view) {
        sr.U1(view, ((d) view.getLayoutParams()).e);
    }

    public boolean j(View view) {
        if (view == null) {
            return false;
        }
        return this.B && ((d) view.getLayoutParams()).d && this.D > 0.0f;
    }

    public boolean k() {
        return sr.Y(this) == 1;
    }

    public boolean l() {
        return !this.B || this.D == 1.0f;
    }

    public boolean m() {
        return this.B;
    }

    public void n(int i) {
        if (this.C == null) {
            this.D = 0.0f;
            return;
        }
        boolean k = k();
        d dVar = (d) this.C.getLayoutParams();
        int width = this.C.getWidth();
        if (k) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = (i - ((k ? getPaddingRight() : getPaddingLeft()) + (k ? ((ViewGroup.MarginLayoutParams) dVar).rightMargin : ((ViewGroup.MarginLayoutParams) dVar).leftMargin))) / this.F;
        this.D = paddingRight;
        if (this.H != 0) {
            q(paddingRight);
        }
        if (dVar.d) {
            e(this.C, this.D, this.w);
        }
        h(this.C);
    }

    public boolean o() {
        return p(this.C, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N = true;
        int size = this.P.size();
        for (int i = 0; i < size; i++) {
            this.P.get(i).run();
        }
        this.P.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.B && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.M = !this.L.L(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.B || (this.G && actionMasked != 0)) {
            this.L.c();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.L.c();
            return false;
        } else {
            if (actionMasked == 0) {
                this.G = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.I = x;
                this.J = y;
                if (this.L.L(this.C, (int) x, (int) y) && j(this.C)) {
                    z = true;
                    return this.L.W(motionEvent) || z;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.I);
                float abs2 = Math.abs(y2 - this.J);
                if (abs > this.L.E() && abs2 > abs) {
                    this.L.c();
                    this.G = true;
                    return false;
                }
            }
            z = false;
            if (this.L.W(motionEvent)) {
                return true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean k = k();
        if (k) {
            this.L.T(2);
        } else {
            this.L.T(1);
        }
        int i10 = i3 - i;
        int paddingRight = k ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = k ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.N) {
            this.D = (this.B && this.M) ? 1.0f : 0.0f;
        }
        int i11 = paddingRight;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (dVar.c) {
                    int i13 = i10 - paddingLeft;
                    int min = (Math.min(paddingRight, i13 - this.A) - i11) - (((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    this.F = min;
                    int i14 = k ? ((ViewGroup.MarginLayoutParams) dVar).rightMargin : ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    dVar.d = (measuredWidth / 2) + ((i11 + i14) + min) > i13;
                    int i15 = (int) (min * this.D);
                    i5 = i14 + i15 + i11;
                    this.D = i15 / min;
                    i6 = 0;
                } else if (!this.B || (i7 = this.H) == 0) {
                    i5 = paddingRight;
                    i6 = 0;
                } else {
                    i6 = (int) ((1.0f - this.D) * i7);
                    i5 = paddingRight;
                }
                if (k) {
                    i9 = (i10 - i5) + i6;
                    i8 = i9 - measuredWidth;
                } else {
                    i8 = i5 - i6;
                    i9 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                i11 = i5;
                paddingRight = childAt.getWidth() + paddingRight;
            }
        }
        if (this.N) {
            if (this.B) {
                if (this.H != 0) {
                    q(this.D);
                }
                if (((d) this.C.getLayoutParams()).d) {
                    e(this.C, this.D, this.w);
                }
            } else {
                for (int i16 = 0; i16 < childCount; i16++) {
                    e(getChildAt(i16), 0.0f, this.w);
                }
            }
            v(this.C);
        }
        this.N = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int i3;
        int i4;
        int makeMeasureSpec;
        int i5;
        int i6;
        int makeMeasureSpec2;
        float f2;
        int i7;
        int makeMeasureSpec3;
        int makeMeasureSpec4;
        int i8;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
            if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z = false;
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = 0;
        } else if (mode2 != 1073741824) {
            i3 = 0;
            paddingTop = 0;
        } else {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = i3;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.C = null;
        int i9 = paddingLeft;
        int i10 = 0;
        boolean z2 = false;
        float f3 = 0.0f;
        while (true) {
            i4 = 8;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            d dVar = (d) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                dVar.d = z;
            } else {
                float f4 = dVar.b;
                if (f4 > 0.0f) {
                    f3 += f4;
                    if (((ViewGroup.MarginLayoutParams) dVar).width == 0) {
                    }
                }
                int i11 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                int i12 = ((ViewGroup.MarginLayoutParams) dVar).width;
                if (i12 == -2) {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i11, Integer.MIN_VALUE);
                    f2 = f3;
                    i7 = Integer.MIN_VALUE;
                } else {
                    f2 = f3;
                    i7 = Integer.MIN_VALUE;
                    if (i12 == -1) {
                        makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i11, 1073741824);
                    } else {
                        makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                    }
                }
                int i13 = ((ViewGroup.MarginLayoutParams) dVar).height;
                if (i13 == -2) {
                    i8 = View.MeasureSpec.makeMeasureSpec(paddingTop, i7);
                } else {
                    if (i13 == -1) {
                        makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                    } else {
                        makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    }
                    i8 = makeMeasureSpec4;
                }
                childAt.measure(makeMeasureSpec3, i8);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == i7 && measuredHeight > i3) {
                    i3 = Math.min(measuredHeight, paddingTop);
                }
                i9 -= measuredWidth;
                boolean z3 = i9 < 0;
                dVar.c = z3;
                z2 |= z3;
                if (z3) {
                    this.C = childAt;
                }
                f3 = f2;
            }
            i10++;
            z = false;
        }
        if (z2 || f3 > 0.0f) {
            int i14 = paddingLeft - this.A;
            int i15 = 0;
            while (i15 < childCount) {
                View childAt2 = getChildAt(i15);
                if (childAt2.getVisibility() != i4) {
                    d dVar2 = (d) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i4) {
                        boolean z4 = ((ViewGroup.MarginLayoutParams) dVar2).width == 0 && dVar2.b > 0.0f;
                        int measuredWidth2 = z4 ? 0 : childAt2.getMeasuredWidth();
                        if (z2 && childAt2 != this.C) {
                            if (((ViewGroup.MarginLayoutParams) dVar2).width < 0 && (measuredWidth2 > i14 || dVar2.b > 0.0f)) {
                                if (z4) {
                                    int i16 = ((ViewGroup.MarginLayoutParams) dVar2).height;
                                    if (i16 == -2) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                        i6 = 1073741824;
                                    } else if (i16 == -1) {
                                        i6 = 1073741824;
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                    } else {
                                        i6 = 1073741824;
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                                    }
                                } else {
                                    i6 = 1073741824;
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, i6), makeMeasureSpec2);
                            }
                        } else if (dVar2.b > 0.0f) {
                            if (((ViewGroup.MarginLayoutParams) dVar2).width == 0) {
                                int i17 = ((ViewGroup.MarginLayoutParams) dVar2).height;
                                if (i17 == -2) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                } else if (i17 == -1) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                                }
                            } else {
                                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            if (z2) {
                                int i18 = paddingLeft - (((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin);
                                i5 = i14;
                                int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                                if (measuredWidth2 != i18) {
                                    childAt2.measure(makeMeasureSpec5, makeMeasureSpec);
                                }
                                i15++;
                                i14 = i5;
                                i4 = 8;
                            } else {
                                i5 = i14;
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2 + ((int) ((dVar2.b * Math.max(0, i9)) / f3)), 1073741824), makeMeasureSpec);
                                i15++;
                                i14 = i5;
                                i4 = 8;
                            }
                        }
                    }
                }
                i5 = i14;
                i15++;
                i14 = i5;
                i4 = 8;
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i3);
        this.B = z2;
        if (this.L.F() == 0 || z2) {
            return;
        }
        this.L.a();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.s) {
            o();
        } else {
            c();
        }
        this.M = fVar.s;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.s = m() ? l() : this.M;
        return fVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.N = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.B) {
            return super.onTouchEvent(motionEvent);
        }
        this.L.M(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 && j(this.C)) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float f2 = x - this.I;
                float f3 = y - this.J;
                int E = this.L.E();
                if ((f3 * f3) + (f2 * f2) < E * E && this.L.L(this.C, (int) x, (int) y)) {
                    d(this.C, 0);
                }
            }
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.I = x2;
            this.J = y2;
        }
        return true;
    }

    public void r() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.B) {
            return;
        }
        this.M = view == this.C;
    }

    @Deprecated
    public void s() {
        c();
    }

    public void setCoveredFadeColor(@w0 int i) {
        this.x = i;
    }

    public void setPanelSlideListener(@z1 e eVar) {
        this.K = eVar;
    }

    public void setParallaxDistance(@c2 int i) {
        this.H = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@z1 Drawable drawable) {
        this.y = drawable;
    }

    public void setShadowDrawableRight(@z1 Drawable drawable) {
        this.z = drawable;
    }

    @Deprecated
    public void setShadowResource(@f1 int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(gh.i(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(gh.i(getContext(), i));
    }

    public void setSliderFadeColor(@w0 int i) {
        this.w = i;
    }

    @Deprecated
    public void t() {
        o();
    }

    public boolean u(float f2, int i) {
        int paddingLeft;
        if (this.B) {
            boolean k = k();
            d dVar = (d) this.C.getLayoutParams();
            if (k) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                int width = this.C.getWidth();
                paddingLeft = (int) (getWidth() - (((f2 * this.F) + paddingRight) + width));
            } else {
                paddingLeft = (int) ((f2 * this.F) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin);
            }
            eu euVar = this.L;
            View view = this.C;
            if (euVar.X(view, paddingLeft, view.getTop())) {
                r();
                sr.m1(this);
                return true;
            }
            return false;
        }
        return false;
    }

    public void v(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        boolean z;
        View view2 = view;
        boolean k = k();
        int width = k ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = k ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !w(view)) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i = view.getLeft();
            i2 = view.getRight();
            i3 = view.getTop();
            i4 = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount && (childAt = getChildAt(i5)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = k;
            } else {
                z = k;
                childAt.setVisibility((Math.max(k ? paddingLeft : width, childAt.getLeft()) < i || Math.max(paddingTop, childAt.getTop()) < i3 || Math.min(k ? width : paddingLeft, childAt.getRight()) > i2 || Math.min(height, childAt.getBottom()) > i4) ? 0 : 4);
            }
            i5++;
            view2 = view;
            k = z;
        }
    }

    /* compiled from: SlidingPaneLayout.java */
    /* loaded from: classes.dex */
    public static class d extends ViewGroup.MarginLayoutParams {
        private static final int[] a = {16843137};
        public float b;
        public boolean c;
        public boolean d;
        public Paint e;

        public d() {
            super(-1, -1);
            this.b = 0.0f;
        }

        public d(int i, int i2) {
            super(i, i2);
            this.b = 0.0f;
        }

        public d(@x1 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0.0f;
        }

        public d(@x1 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0.0f;
        }

        public d(@x1 d dVar) {
            super((ViewGroup.MarginLayoutParams) dVar);
            this.b = 0.0f;
            this.b = dVar.b;
        }

        public d(@x1 Context context, @z1 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
            this.b = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public k60(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public k60(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = u;
        this.N = true;
        this.O = new Rect();
        this.P = new ArrayList<>();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.A = (int) ((32.0f * f2) + 0.5f);
        setWillNotDraw(false);
        sr.A1(this, new a());
        sr.Q1(this, 1);
        eu p = eu.p(this, 0.5f, new c());
        this.L = p;
        p.U(f2 * 400.0f);
    }
}