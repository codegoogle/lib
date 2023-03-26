package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.os;
import com.p7700g.p99005.va0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class fb0 extends ViewGroup {
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = -1;
    public static boolean y = true;
    private final Rect A;
    private za0 B;
    public int C;
    public boolean D;
    private RecyclerView.i E;
    private LinearLayoutManager F;
    private int G;
    private Parcelable H;
    public RecyclerView I;
    private m30 J;
    public eb0 K;
    private za0 L;
    private bb0 M;
    private db0 N;
    private RecyclerView.l O;
    private boolean P;
    private boolean Q;
    private int R;
    public e S;
    private final Rect z;

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public class a extends g {
        public a() {
            super(null);
        }

        @Override // com.p7700g.p99005.fb0.g, androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            fb0 fb0Var = fb0.this;
            fb0Var.D = true;
            fb0Var.K.n();
        }
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public class b extends j {
        public b() {
        }

        @Override // com.p7700g.p99005.fb0.j
        public void a(int i) {
            if (i == 0) {
                fb0.this.y();
            }
        }

        @Override // com.p7700g.p99005.fb0.j
        public void c(int i) {
            fb0 fb0Var = fb0.this;
            if (fb0Var.C != i) {
                fb0Var.C = i;
                fb0Var.S.q();
            }
        }
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public class c extends j {
        public c() {
        }

        @Override // com.p7700g.p99005.fb0.j
        public void c(int i) {
            fb0.this.clearFocus();
            if (fb0.this.hasFocus()) {
                fb0.this.I.requestFocus(2);
            }
        }
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public class d implements RecyclerView.q {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void b(@x1 View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void d(@x1 View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) pVar).width != -1 || ((ViewGroup.MarginLayoutParams) pVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int i) {
            return false;
        }

        public boolean c(int i, Bundle bundle) {
            return false;
        }

        public boolean d() {
            return false;
        }

        public void e(@z1 RecyclerView.g<?> gVar) {
        }

        public void f(@z1 RecyclerView.g<?> gVar) {
        }

        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        public void h(@x1 za0 za0Var, @x1 RecyclerView recyclerView) {
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void j(@x1 ls lsVar) {
        }

        public boolean k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public void m() {
        }

        public CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        public void o(@x1 AccessibilityEvent accessibilityEvent) {
        }

        public void p() {
        }

        public void q() {
        }

        public void r() {
        }

        public void s() {
        }

        public /* synthetic */ e(fb0 fb0Var, a aVar) {
            this();
        }
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public class f extends e {
        public f() {
            super(fb0.this, null);
        }

        @Override // com.p7700g.p99005.fb0.e
        public boolean b(int i) {
            return (i == 8192 || i == 4096) && !fb0.this.l();
        }

        @Override // com.p7700g.p99005.fb0.e
        public boolean d() {
            return true;
        }

        @Override // com.p7700g.p99005.fb0.e
        public void j(@x1 ls lsVar) {
            if (fb0.this.l()) {
                return;
            }
            lsVar.K0(ls.a.o);
            lsVar.K0(ls.a.n);
            lsVar.F1(false);
        }

        @Override // com.p7700g.p99005.fb0.e
        public boolean k(int i) {
            if (b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // com.p7700g.p99005.fb0.e
        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public static abstract class g extends RecyclerView.i {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2, @z1 Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2, int i3) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            a();
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public class h extends LinearLayoutManager {
        public h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean M1(@x1 RecyclerView recyclerView, @x1 View view, @x1 Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void e1(@x1 RecyclerView.w wVar, @x1 RecyclerView.c0 c0Var, @x1 ls lsVar) {
            super.e1(wVar, c0Var, lsVar);
            fb0.this.S.j(lsVar);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void k2(@x1 RecyclerView.c0 c0Var, @x1 int[] iArr) {
            int offscreenPageLimit = fb0.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.k2(c0Var, iArr);
                return;
            }
            int pageSize = fb0.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean y1(@x1 RecyclerView.w wVar, @x1 RecyclerView.c0 c0Var, int i, @z1 Bundle bundle) {
            if (fb0.this.S.b(i)) {
                return fb0.this.S.k(i);
            }
            return super.y1(wVar, c0Var, i, bundle);
        }
    }

    /* compiled from: ViewPager2.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @p1(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface i {
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public static abstract class j {
        public void a(int i) {
        }

        public void b(int i, float f, @c2 int i2) {
        }

        public void c(int i) {
        }
    }

    /* compiled from: ViewPager2.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface k {
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public class l extends e {
        private final os b;
        private final os c;
        private RecyclerView.i d;

        /* compiled from: ViewPager2.java */
        /* loaded from: classes.dex */
        public class a implements os {
            public a() {
            }

            @Override // com.p7700g.p99005.os
            public boolean a(@x1 View view, @z1 os.a aVar) {
                l.this.v(((fb0) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* compiled from: ViewPager2.java */
        /* loaded from: classes.dex */
        public class b implements os {
            public b() {
            }

            @Override // com.p7700g.p99005.os
            public boolean a(@x1 View view, @z1 os.a aVar) {
                l.this.v(((fb0) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* compiled from: ViewPager2.java */
        /* loaded from: classes.dex */
        public class c extends g {
            public c() {
                super(null);
            }

            @Override // com.p7700g.p99005.fb0.g, androidx.recyclerview.widget.RecyclerView.i
            public void a() {
                l.this.w();
            }
        }

        public l() {
            super(fb0.this, null);
            this.b = new a();
            this.c = new b();
        }

        private void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (fb0.this.getAdapter() == null) {
                i = 0;
            } else if (fb0.this.getOrientation() == 1) {
                i = fb0.this.getAdapter().e();
            } else {
                i2 = fb0.this.getAdapter().e();
                i = 0;
                ls.X1(accessibilityNodeInfo).Y0(ls.b.f(i, i2, false, 0));
            }
            i2 = 0;
            ls.X1(accessibilityNodeInfo).Y0(ls.b.f(i, i2, false, 0));
        }

        private void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int e;
            RecyclerView.g adapter = fb0.this.getAdapter();
            if (adapter == null || (e = adapter.e()) == 0 || !fb0.this.l()) {
                return;
            }
            if (fb0.this.C > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (fb0.this.C < e - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        @Override // com.p7700g.p99005.fb0.e
        public boolean a() {
            return true;
        }

        @Override // com.p7700g.p99005.fb0.e
        public boolean c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // com.p7700g.p99005.fb0.e
        public void e(@z1 RecyclerView.g<?> gVar) {
            w();
            if (gVar != null) {
                gVar.C(this.d);
            }
        }

        @Override // com.p7700g.p99005.fb0.e
        public void f(@z1 RecyclerView.g<?> gVar) {
            if (gVar != null) {
                gVar.E(this.d);
            }
        }

        @Override // com.p7700g.p99005.fb0.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // com.p7700g.p99005.fb0.e
        public void h(@x1 za0 za0Var, @x1 RecyclerView recyclerView) {
            sr.Q1(recyclerView, 2);
            this.d = new c();
            if (sr.U(fb0.this) == 0) {
                sr.Q1(fb0.this, 1);
            }
        }

        @Override // com.p7700g.p99005.fb0.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            u(accessibilityNodeInfo);
        }

        @Override // com.p7700g.p99005.fb0.e
        public boolean l(int i, Bundle bundle) {
            int currentItem;
            if (c(i, bundle)) {
                if (i == 8192) {
                    currentItem = fb0.this.getCurrentItem() - 1;
                } else {
                    currentItem = fb0.this.getCurrentItem() + 1;
                }
                v(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // com.p7700g.p99005.fb0.e
        public void m() {
            w();
        }

        @Override // com.p7700g.p99005.fb0.e
        public void o(@x1 AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(fb0.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // com.p7700g.p99005.fb0.e
        public void p() {
            w();
        }

        @Override // com.p7700g.p99005.fb0.e
        public void q() {
            w();
        }

        @Override // com.p7700g.p99005.fb0.e
        public void r() {
            w();
        }

        @Override // com.p7700g.p99005.fb0.e
        public void s() {
            w();
        }

        public void v(int i) {
            if (fb0.this.l()) {
                fb0.this.t(i, true);
            }
        }

        public void w() {
            int e;
            fb0 fb0Var = fb0.this;
            sr.q1(fb0Var, 16908360);
            sr.q1(fb0Var, 16908361);
            sr.q1(fb0Var, 16908358);
            sr.q1(fb0Var, 16908359);
            if (fb0.this.getAdapter() == null || (e = fb0.this.getAdapter().e()) == 0 || !fb0.this.l()) {
                return;
            }
            if (fb0.this.getOrientation() == 0) {
                boolean k = fb0.this.k();
                int i = k ? 16908360 : 16908361;
                int i2 = k ? 16908361 : 16908360;
                if (fb0.this.C < e - 1) {
                    sr.t1(fb0Var, new ls.a(i, null), null, this.b);
                }
                if (fb0.this.C > 0) {
                    sr.t1(fb0Var, new ls.a(i2, null), null, this.c);
                    return;
                }
                return;
            }
            if (fb0.this.C < e - 1) {
                sr.t1(fb0Var, new ls.a(16908359, null), null, this.b);
            }
            if (fb0.this.C > 0) {
                sr.t1(fb0Var, new ls.a(16908358, null), null, this.c);
            }
        }
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public interface m {
        void a(@x1 View view, float f);
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public class n extends m30 {
        public n() {
        }

        @Override // com.p7700g.p99005.m30, com.p7700g.p99005.q30
        @z1
        public View h(RecyclerView.o oVar) {
            if (fb0.this.j()) {
                return null;
            }
            return super.h(oVar);
        }
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public class o extends RecyclerView {
        public o(@x1 Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @e2(23)
        public CharSequence getAccessibilityClassName() {
            if (fb0.this.S.d()) {
                return fb0.this.S.n();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@x1 AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(fb0.this.C);
            accessibilityEvent.setToIndex(fb0.this.C);
            fb0.this.S.o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return fb0.this.l() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return fb0.this.l() && super.onTouchEvent(motionEvent);
        }
    }

    /* compiled from: ViewPager2.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface q {
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public static class r implements Runnable {
        private final int s;
        private final RecyclerView t;

        public r(int i, RecyclerView recyclerView) {
            this.s = i;
            this.t = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.t.J1(this.s);
        }
    }

    public fb0(@x1 Context context) {
        super(context);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new za0(3);
        this.D = false;
        this.E = new a();
        this.G = -1;
        this.O = null;
        this.P = false;
        this.Q = true;
        this.R = -1;
        h(context, null);
    }

    private RecyclerView.q e() {
        return new d();
    }

    private void h(Context context, AttributeSet attributeSet) {
        this.S = y ? new l() : new f();
        o oVar = new o(context);
        this.I = oVar;
        oVar.setId(sr.C());
        this.I.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.F = hVar;
        this.I.setLayoutManager(hVar);
        this.I.setScrollingTouchSlop(1);
        u(context, attributeSet);
        this.I.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.I.o(e());
        eb0 eb0Var = new eb0(this);
        this.K = eb0Var;
        this.M = new bb0(this, eb0Var, this.I);
        n nVar = new n();
        this.J = nVar;
        nVar.b(this.I);
        this.I.q(this.K);
        za0 za0Var = new za0(3);
        this.L = za0Var;
        this.K.r(za0Var);
        b bVar = new b();
        c cVar = new c();
        this.L.d(bVar);
        this.L.d(cVar);
        this.S.h(this.L, this.I);
        this.L.d(this.B);
        db0 db0Var = new db0(this.F);
        this.N = db0Var;
        this.L.d(db0Var);
        RecyclerView recyclerView = this.I;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void m(@z1 RecyclerView.g<?> gVar) {
        if (gVar != null) {
            gVar.C(this.E);
        }
    }

    private void r() {
        RecyclerView.g adapter;
        if (this.G == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.H;
        if (parcelable != null) {
            if (adapter instanceof xa0) {
                ((xa0) adapter).b(parcelable);
            }
            this.H = null;
        }
        int max = Math.max(0, Math.min(this.G, adapter.e() - 1));
        this.C = max;
        this.G = -1;
        this.I.B1(max);
        this.S.m();
    }

    private void u(Context context, AttributeSet attributeSet) {
        int[] iArr = va0.j.c0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(va0.j.d0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void w(@z1 RecyclerView.g<?> gVar) {
        if (gVar != null) {
            gVar.E(this.E);
        }
    }

    public void a(@x1 RecyclerView.n nVar) {
        this.I.m(nVar);
    }

    public void b(@x1 RecyclerView.n nVar, int i2) {
        this.I.n(nVar, i2);
    }

    public boolean c() {
        return this.M.b();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return this.I.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        return this.I.canScrollVertically(i2);
    }

    public boolean d() {
        return this.M.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof p) {
            int i2 = ((p) parcelable).s;
            sparseArray.put(this.I.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        r();
    }

    public boolean f(@c2 @SuppressLint({"SupportAnnotationUsage"}) float f2) {
        return this.M.e(f2);
    }

    @x1
    public RecyclerView.n g(int i2) {
        return this.I.y0(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    @e2(23)
    public CharSequence getAccessibilityClassName() {
        if (this.S.a()) {
            return this.S.g();
        }
        return super.getAccessibilityClassName();
    }

    @z1
    public RecyclerView.g getAdapter() {
        return this.I.getAdapter();
    }

    public int getCurrentItem() {
        return this.C;
    }

    public int getItemDecorationCount() {
        return this.I.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.R;
    }

    public int getOrientation() {
        return this.F.Q2();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.I;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.K.h();
    }

    public void i() {
        this.I.I0();
    }

    public boolean j() {
        return this.M.f();
    }

    public boolean k() {
        return this.F.i0() == 1;
    }

    public boolean l() {
        return this.Q;
    }

    public void n(@x1 j jVar) {
        this.B.d(jVar);
    }

    public void o(@x1 RecyclerView.n nVar) {
        this.I.o1(nVar);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.S.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.I.getMeasuredWidth();
        int measuredHeight = this.I.getMeasuredHeight();
        this.z.left = getPaddingLeft();
        this.z.right = (i4 - i2) - getPaddingRight();
        this.z.top = getPaddingTop();
        this.z.bottom = (i5 - i3) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.z, this.A);
        RecyclerView recyclerView = this.I;
        Rect rect = this.A;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.D) {
            y();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        measureChild(this.I, i2, i3);
        int measuredWidth = this.I.getMeasuredWidth();
        int measuredHeight = this.I.getMeasuredHeight();
        int measuredState = this.I.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, measuredState), ViewGroup.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.getSuperState());
        this.G = pVar.t;
        this.H = pVar.u;
    }

    @Override // android.view.View
    @z1
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.s = this.I.getId();
        int i2 = this.G;
        if (i2 == -1) {
            i2 = this.C;
        }
        pVar.t = i2;
        Parcelable parcelable = this.H;
        if (parcelable != null) {
            pVar.u = parcelable;
        } else {
            RecyclerView.g adapter = this.I.getAdapter();
            if (adapter instanceof xa0) {
                pVar.u = ((xa0) adapter).a();
            }
        }
        return pVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(fb0.class.getSimpleName() + " does not support direct child views");
    }

    public void p(int i2) {
        this.I.p1(i2);
    }

    @Override // android.view.View
    @e2(16)
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        if (this.S.c(i2, bundle)) {
            return this.S.l(i2, bundle);
        }
        return super.performAccessibilityAction(i2, bundle);
    }

    public void q() {
        if (this.N.d() == null) {
            return;
        }
        double g2 = this.K.g();
        int i2 = (int) g2;
        float f2 = (float) (g2 - i2);
        this.N.b(i2, f2, Math.round(getPageSize() * f2));
    }

    public void s(int i2, boolean z) {
        if (!j()) {
            t(i2, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public void setAdapter(@z1 RecyclerView.g gVar) {
        RecyclerView.g adapter = this.I.getAdapter();
        this.S.f(adapter);
        w(adapter);
        this.I.setAdapter(gVar);
        this.C = 0;
        r();
        this.S.e(gVar);
        m(gVar);
    }

    public void setCurrentItem(int i2) {
        s(i2, true);
    }

    @Override // android.view.View
    @e2(17)
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.S.p();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.R = i2;
        this.I.requestLayout();
    }

    public void setOrientation(int i2) {
        this.F.j3(i2);
        this.S.r();
    }

    public void setPageTransformer(@z1 m mVar) {
        if (mVar != null) {
            if (!this.P) {
                this.O = this.I.getItemAnimator();
                this.P = true;
            }
            this.I.setItemAnimator(null);
        } else if (this.P) {
            this.I.setItemAnimator(this.O);
            this.O = null;
            this.P = false;
        }
        if (mVar == this.N.d()) {
            return;
        }
        this.N.e(mVar);
        q();
    }

    public void setUserInputEnabled(boolean z) {
        this.Q = z;
        this.S.s();
    }

    public void t(int i2, boolean z) {
        RecyclerView.g adapter = getAdapter();
        if (adapter == null) {
            if (this.G != -1) {
                this.G = Math.max(i2, 0);
            }
        } else if (adapter.e() <= 0) {
        } else {
            int min = Math.min(Math.max(i2, 0), adapter.e() - 1);
            if (min == this.C && this.K.k()) {
                return;
            }
            int i3 = this.C;
            if (min == i3 && z) {
                return;
            }
            double d2 = i3;
            this.C = min;
            this.S.q();
            if (!this.K.k()) {
                d2 = this.K.g();
            }
            this.K.p(min, z);
            if (!z) {
                this.I.B1(min);
                return;
            }
            double d3 = min;
            if (Math.abs(d3 - d2) > 3.0d) {
                this.I.B1(d3 > d2 ? min - 3 : min + 3);
                RecyclerView recyclerView = this.I;
                recyclerView.post(new r(min, recyclerView));
                return;
            }
            this.I.J1(min);
        }
    }

    public void v() {
        View h2 = this.J.h(this.F);
        if (h2 == null) {
            return;
        }
        int[] c2 = this.J.c(this.F, h2);
        if (c2[0] == 0 && c2[1] == 0) {
            return;
        }
        this.I.F1(c2[0], c2[1]);
    }

    public void x(@x1 j jVar) {
        this.B.e(jVar);
    }

    public void y() {
        m30 m30Var = this.J;
        if (m30Var != null) {
            View h2 = m30Var.h(this.F);
            if (h2 == null) {
                return;
            }
            int s0 = this.F.s0(h2);
            if (s0 != this.C && getScrollState() == 0) {
                this.L.c(s0);
            }
            this.D = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* compiled from: ViewPager2.java */
    /* loaded from: classes.dex */
    public static class p extends View.BaseSavedState {
        public static final Parcelable.Creator<p> CREATOR = new a();
        public int s;
        public int t;
        public Parcelable u;

        /* compiled from: ViewPager2.java */
        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public p createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new p(parcel, classLoader) : new p(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public p[] newArray(int i) {
                return new p[i];
            }
        }

        @e2(24)
        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            c(parcel, classLoader);
        }

        private void c(Parcel parcel, ClassLoader classLoader) {
            this.s = parcel.readInt();
            this.t = parcel.readInt();
            this.u = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t);
            parcel.writeParcelable(this.u, i);
        }

        public p(Parcel parcel) {
            super(parcel);
            c(parcel, null);
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public fb0(@x1 Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new za0(3);
        this.D = false;
        this.E = new a();
        this.G = -1;
        this.O = null;
        this.P = false;
        this.Q = true;
        this.R = -1;
        h(context, attributeSet);
    }

    public fb0(@x1 Context context, @z1 AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new za0(3);
        this.D = false;
        this.E = new a();
        this.G = -1;
        this.O = null;
        this.P = false;
        this.Q = true;
        this.R = -1;
        h(context, attributeSet);
    }

    @e2(21)
    public fb0(@x1 Context context, @z1 AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new za0(3);
        this.D = false;
        this.E = new a();
        this.G = -1;
        this.O = null;
        this.P = false;
        this.Q = true;
        this.R = -1;
        h(context, attributeSet);
    }
}