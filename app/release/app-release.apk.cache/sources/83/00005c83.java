package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.p7700g.p99005.ds;
import com.p7700g.p99005.fq;
import com.p7700g.p99005.gs;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.nf;
import com.p7700g.p99005.sr;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class sr {
    public static final int A = 1;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 4;
    public static final int E = 8;
    public static final int F = 16;
    public static final int G = 32;
    private static Field I = null;
    private static boolean J = false;
    private static Field K = null;
    private static boolean L = false;
    private static Method M = null;
    private static Method N = null;
    private static boolean O = false;
    private static WeakHashMap<View, String> P = null;
    private static Method R = null;
    private static Field S = null;
    private static ThreadLocal<Rect> U = null;
    private static final String a = "ViewCompat";
    @Deprecated
    public static final int b = 0;
    @Deprecated
    public static final int c = 1;
    @Deprecated
    public static final int d = 2;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    @Deprecated
    public static final int l = 0;
    @Deprecated
    public static final int m = 1;
    @Deprecated
    public static final int n = 2;
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;
    @Deprecated
    public static final int s = 16777215;
    @Deprecated
    public static final int t = -16777216;
    @Deprecated
    public static final int u = 16;
    @Deprecated
    public static final int v = 16777216;
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final int z = 0;
    private static final AtomicInteger H = new AtomicInteger(1);
    private static WeakHashMap<View, yr> Q = null;
    private static boolean T = false;
    private static final int[] V = {nf.e.b, nf.e.c, nf.e.n, nf.e.y, nf.e.B, nf.e.C, nf.e.D, nf.e.E, nf.e.F, nf.e.G, nf.e.d, nf.e.e, nf.e.f, nf.e.g, nf.e.h, nf.e.i, nf.e.j, nf.e.k, nf.e.l, nf.e.m, nf.e.o, nf.e.p, nf.e.q, nf.e.r, nf.e.s, nf.e.t, nf.e.u, nf.e.v, nf.e.w, nf.e.x, nf.e.z, nf.e.A};
    private static final lr W = yp.s;
    private static final e X = new e();

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        public a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // com.p7700g.p99005.sr.f
        @e2(28)
        /* renamed from: i */
        public Boolean d(@x1 View view) {
            return Boolean.valueOf(q.d(view));
        }

        @Override // com.p7700g.p99005.sr.f
        @e2(28)
        /* renamed from: j */
        public void e(@x1 View view, Boolean bool) {
            q.i(view, bool.booleanValue());
        }

        @Override // com.p7700g.p99005.sr.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a0 {
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        public b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // com.p7700g.p99005.sr.f
        @e2(28)
        /* renamed from: i */
        public CharSequence d(View view) {
            return q.b(view);
        }

        @Override // com.p7700g.p99005.sr.f
        @e2(28)
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            q.h(view, charSequence);
        }

        @Override // com.p7700g.p99005.sr.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b0 {
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        public c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // com.p7700g.p99005.sr.f
        @e2(30)
        /* renamed from: i */
        public CharSequence d(View view) {
            return s.a(view);
        }

        @Override // com.p7700g.p99005.sr.f
        @e2(30)
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            s.c(view, charSequence);
        }

        @Override // com.p7700g.p99005.sr.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class c0 {
        private static final ArrayList<WeakReference<View>> a = new ArrayList<>();
        @z1
        private WeakHashMap<View, Boolean> b = null;
        private SparseArray<WeakReference<View>> c = null;
        private WeakReference<KeyEvent> d = null;

        public static c0 a(View view) {
            int i = nf.e.n0;
            c0 c0Var = (c0) view.getTag(i);
            if (c0Var == null) {
                c0 c0Var2 = new c0();
                view.setTag(i, c0Var2);
                return c0Var2;
            }
            return c0Var;
        }

        @z1
        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.c == null) {
                this.c = new SparseArray<>();
            }
            return this.c;
        }

        private boolean e(@x1 View view, @x1 KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(nf.e.o0);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((z) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = a;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.b == null) {
                    this.b = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = a;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.b.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.b.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        public static void h(View view) {
            ArrayList<WeakReference<View>> arrayList = a;
            synchronized (arrayList) {
                Iterator<WeakReference<View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                a.add(new WeakReference<>(view));
            }
        }

        public static void i(View view) {
            synchronized (a) {
                int i = 0;
                while (true) {
                    ArrayList<WeakReference<View>> arrayList = a;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i).get() == view) {
                        arrayList.remove(i);
                        return;
                    }
                    i++;
                }
            }
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c));
                }
            }
            return c != null;
        }

        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.d;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.d = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> d = d();
                if (keyEvent.getAction() == 1 && (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = d.valueAt(indexOfKey);
                    d.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = d.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && sr.N0(view)) {
                        e(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        public d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // com.p7700g.p99005.sr.f
        @e2(28)
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(q.c(view));
        }

        @Override // com.p7700g.p99005.sr.f
        @e2(28)
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            q.g(view, bool.booleanValue());
        }

        @Override // com.p7700g.p99005.sr.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private final WeakHashMap<View, Boolean> s = new WeakHashMap<>();

        @e2(19)
        private void b(View view, boolean z) {
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (z != z2) {
                sr.c1(view, z2 ? 16 : 32);
                this.s.put(view, Boolean.valueOf(z2));
            }
        }

        @e2(19)
        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @e2(19)
        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        @e2(19)
        public void a(View view) {
            this.s.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        @e2(19)
        public void d(View view) {
            this.s.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @e2(19)
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.s.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @e2(19)
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static abstract class f<T> {
        private final int a;
        private final Class<T> b;
        private final int c;
        private final int d;

        public f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T d(View view);

        public abstract void e(View view, T t);

        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (b()) {
                T t = (T) view.getTag(this.a);
                if (this.b.isInstance(t)) {
                    return t;
                }
                return null;
            }
            return null;
        }

        public void g(View view, T t) {
            if (c()) {
                e(view, t);
            } else if (b() && h(f(view), t)) {
                sr.B(view);
                view.setTag(this.a, t);
                sr.c1(view, this.d);
            }
        }

        public boolean h(T t, T t2) {
            return !t2.equals(t);
        }

        public f(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(15)
    /* loaded from: classes.dex */
    public static class g {
        private g() {
        }

        @e1
        public static boolean a(@x1 View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class h {
        private h() {
        }

        @e1
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @e1
        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        @e1
        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        @e1
        public static int d(View view) {
            return view.getMinimumHeight();
        }

        @e1
        public static int e(View view) {
            return view.getMinimumWidth();
        }

        @e1
        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        @e1
        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @e1
        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        @e1
        public static boolean i(View view) {
            return view.hasTransientState();
        }

        @e1
        public static boolean j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        @e1
        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        @e1
        public static void l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        @e1
        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @e1
        public static void n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        @e1
        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @e1
        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        @e1
        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @e1
        public static void r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        @e1
        public static void s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(17)
    /* loaded from: classes.dex */
    public static class i {
        private i() {
        }

        @e1
        public static int a() {
            return View.generateViewId();
        }

        @e1
        public static Display b(@x1 View view) {
            return view.getDisplay();
        }

        @e1
        public static int c(View view) {
            return view.getLabelFor();
        }

        @e1
        public static int d(View view) {
            return view.getLayoutDirection();
        }

        @e1
        public static int e(View view) {
            return view.getPaddingEnd();
        }

        @e1
        public static int f(View view) {
            return view.getPaddingStart();
        }

        @e1
        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        @e1
        public static void h(View view, int i) {
            view.setLabelFor(i);
        }

        @e1
        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @e1
        public static void j(View view, int i) {
            view.setLayoutDirection(i);
        }

        @e1
        public static void k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(18)
    /* loaded from: classes.dex */
    public static class j {
        private j() {
        }

        @e1
        public static Rect a(@x1 View view) {
            return view.getClipBounds();
        }

        @e1
        public static boolean b(@x1 View view) {
            return view.isInLayout();
        }

        @e1
        public static void c(@x1 View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class k {
        private k() {
        }

        @e1
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @e1
        public static boolean b(@x1 View view) {
            return view.isAttachedToWindow();
        }

        @e1
        public static boolean c(@x1 View view) {
            return view.isLaidOut();
        }

        @e1
        public static boolean d(@x1 View view) {
            return view.isLayoutDirectionResolved();
        }

        @e1
        public static void e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        @e1
        public static void f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        @e1
        public static void g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(20)
    /* loaded from: classes.dex */
    public static class l {
        private l() {
        }

        @e1
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @e1
        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @e1
        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class m {

        /* compiled from: ViewCompat.java */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {
            public gs a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ jr c;

            public a(View view, jr jrVar) {
                this.b = view;
                this.c = jrVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                gs L = gs.L(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    m.a(windowInsets, this.b);
                    if (L.equals(this.a)) {
                        return this.c.a(view, L).J();
                    }
                }
                this.a = L;
                gs a = this.c.a(view, L);
                if (i >= 30) {
                    return a.J();
                }
                sr.u1(view);
                return a.J();
            }
        }

        private m() {
        }

        @e1
        public static void a(@x1 WindowInsets windowInsets, @x1 View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(nf.e.p0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @e1
        public static gs b(@x1 View view, @x1 gs gsVar, @x1 Rect rect) {
            WindowInsets J = gsVar.J();
            if (J != null) {
                return gs.L(view.computeSystemWindowInsets(J, rect), view);
            }
            rect.setEmpty();
            return gsVar;
        }

        @e1
        public static boolean c(@x1 View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        @e1
        public static boolean d(@x1 View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        @e1
        public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        @e1
        public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        @e1
        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        @e1
        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        @e1
        public static float i(View view) {
            return view.getElevation();
        }

        @e1
        @z1
        public static gs j(@x1 View view) {
            return gs.a.a(view);
        }

        @e1
        public static String k(View view) {
            return view.getTransitionName();
        }

        @e1
        public static float l(View view) {
            return view.getTranslationZ();
        }

        @e1
        public static float m(@x1 View view) {
            return view.getZ();
        }

        @e1
        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        @e1
        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        @e1
        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        @e1
        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @e1
        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @e1
        public static void s(View view, float f) {
            view.setElevation(f);
        }

        @e1
        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        @e1
        public static void u(@x1 View view, @z1 jr jrVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(nf.e.h0, jrVar);
            }
            if (jrVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(nf.e.p0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, jrVar));
            }
        }

        @e1
        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        @e1
        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        @e1
        public static void x(@x1 View view, float f) {
            view.setZ(f);
        }

        @e1
        public static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        @e1
        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class n {
        private n() {
        }

        @z1
        public static gs a(@x1 View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            gs K = gs.K(rootWindowInsets);
            K.H(K);
            K.d(view.getRootView());
            return K;
        }

        @e1
        public static int b(@x1 View view) {
            return view.getScrollIndicators();
        }

        @e1
        public static void c(@x1 View view, int i) {
            view.setScrollIndicators(i);
        }

        @e1
        public static void d(@x1 View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class o {
        private o() {
        }

        @e1
        public static void a(@x1 View view) {
            view.cancelDragAndDrop();
        }

        @e1
        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @e1
        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @e1
        public static void d(@x1 View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @e1
        public static boolean e(@x1 View view, @z1 ClipData clipData, @x1 View.DragShadowBuilder dragShadowBuilder, @z1 Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        @e1
        public static void f(@x1 View view, @x1 View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class p {
        private p() {
        }

        @e1
        public static void a(@x1 View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        @e1
        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        @e1
        public static int c(@x1 View view) {
            return view.getNextClusterForwardId();
        }

        @e1
        public static boolean d(@x1 View view) {
            return view.hasExplicitFocusable();
        }

        @e1
        public static boolean e(@x1 View view) {
            return view.isFocusedByDefault();
        }

        @e1
        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        @e1
        public static boolean g(@x1 View view) {
            return view.isKeyboardNavigationCluster();
        }

        @e1
        public static View h(@x1 View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        @e1
        public static boolean i(@x1 View view) {
            return view.restoreDefaultFocus();
        }

        @e1
        public static void j(@x1 View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @e1
        public static void k(@x1 View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        @e1
        public static void l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        @e1
        public static void m(@x1 View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        @e1
        public static void n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        @e1
        public static void o(@x1 View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class q {
        private q() {
        }

        @e1
        public static void a(@x1 View view, @x1 final z zVar) {
            int i = nf.e.o0;
            y7 y7Var = (y7) view.getTag(i);
            if (y7Var == null) {
                y7Var = new y7();
                view.setTag(i, y7Var);
            }
            Objects.requireNonNull(zVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: com.p7700g.p99005.dq
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return sr.z.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            y7Var.put(zVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @e1
        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @e1
        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        @e1
        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        @e1
        public static void e(@x1 View view, @x1 z zVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            y7 y7Var = (y7) view.getTag(nf.e.o0);
            if (y7Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) y7Var.get(zVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @e1
        public static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        @e1
        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        @e1
        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @e1
        public static void i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class r {
        private r() {
        }

        @e1
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        @e1
        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @e1
        public static void c(@x1 View view, @x1 Context context, @x1 int[] iArr, @z1 AttributeSet attributeSet, @x1 TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        @e1
        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class s {
        private s() {
        }

        @e1
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        @z1
        public static hs b(@x1 View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return hs.l(windowInsetsController);
            }
            return null;
        }

        @e1
        public static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    @e2(31)
    /* loaded from: classes.dex */
    public static final class t {
        private t() {
        }

        @e1
        @z1
        public static String[] a(@x1 View view) {
            return view.getReceiveContentMimeTypes();
        }

        @e1
        @z1
        public static hq b(@x1 View view, @x1 hq hqVar) {
            ContentInfo l = hqVar.l();
            ContentInfo performReceiveContent = view.performReceiveContent(l);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == l ? hqVar : hq.m(performReceiveContent);
        }

        @e1
        public static void c(@x1 View view, @z1 String[] strArr, @z1 kr krVar) {
            if (krVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new y(krVar));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface u {
    }

    /* compiled from: ViewCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface v {
    }

    /* compiled from: ViewCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface w {
    }

    /* compiled from: ViewCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface x {
    }

    /* compiled from: ViewCompat.java */
    @e2(31)
    /* loaded from: classes.dex */
    public static final class y implements OnReceiveContentListener {
        @x1
        private final kr a;

        public y(@x1 kr krVar) {
            this.a = krVar;
        }

        @Override // android.view.OnReceiveContentListener
        @z1
        public ContentInfo onReceiveContent(@x1 View view, @x1 ContentInfo contentInfo) {
            hq m = hq.m(contentInfo);
            hq a = this.a.a(view, m);
            if (a == null) {
                return null;
            }
            return a == m ? contentInfo : a.l();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public interface z {
        boolean onUnhandledKeyEvent(@x1 View view, @x1 KeyEvent keyEvent);
    }

    public static void A(@x1 View view) {
        B(view);
    }

    @z1
    @Deprecated
    public static hs A0(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return s.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return cs.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void A1(@x1 View view, @z1 fq fqVar) {
        if (fqVar == null && (E(view) instanceof fq.a)) {
            fqVar = new fq();
        }
        view.setAccessibilityDelegate(fqVar == null ? null : fqVar.d());
    }

    public static void A2(@x1 View view, float f2) {
        m.x(view, f2);
    }

    public static void B(@x1 View view) {
        fq D2 = D(view);
        if (D2 == null) {
            D2 = new fq();
        }
        A1(view, D2);
    }

    @Deprecated
    public static int B0(@x1 View view) {
        return h.g(view);
    }

    @q2
    public static void B1(@x1 View view, boolean z2) {
        a().g(view, Boolean.valueOf(z2));
    }

    public static boolean B2(@x1 View view, @z1 ClipData clipData, @x1 View.DragShadowBuilder dragShadowBuilder, @z1 Object obj, int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            return o.e(view, clipData, dragShadowBuilder, obj, i2);
        }
        return view.startDrag(clipData, dragShadowBuilder, obj, i2);
    }

    public static int C() {
        return i.a();
    }

    @Deprecated
    public static float C0(View view) {
        return view.getX();
    }

    public static void C1(@x1 View view, int i2) {
        k.f(view, i2);
    }

    public static boolean C2(@x1 View view, int i2) {
        return m.y(view, i2);
    }

    @z1
    public static fq D(@x1 View view) {
        View.AccessibilityDelegate E2 = E(view);
        if (E2 == null) {
            return null;
        }
        if (E2 instanceof fq.a) {
            return ((fq.a) E2).a;
        }
        return new fq(E2);
    }

    @Deprecated
    public static float D0(View view) {
        return view.getY();
    }

    @q2
    public static void D1(@x1 View view, @z1 CharSequence charSequence) {
        j1().g(view, charSequence);
        if (charSequence != null) {
            X.a(view);
        } else {
            X.d(view);
        }
    }

    public static boolean D2(@x1 View view, int i2, int i3) {
        if (view instanceof br) {
            return ((br) view).e(i2, i3);
        }
        if (i3 == 0) {
            return C2(view, i2);
        }
        return false;
    }

    @z1
    private static View.AccessibilityDelegate E(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r.a(view);
        }
        return F(view);
    }

    public static float E0(@x1 View view) {
        return m.m(view);
    }

    @Deprecated
    public static void E1(View view, boolean z2) {
        view.setActivated(z2);
    }

    private static f<CharSequence> E2() {
        return new c(nf.e.l0, CharSequence.class, 64, 30);
    }

    @z1
    private static View.AccessibilityDelegate F(@x1 View view) {
        if (T) {
            return null;
        }
        if (S == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                S = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                T = true;
                return null;
            }
        }
        try {
            Object obj = S.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            T = true;
            return null;
        }
    }

    public static boolean F0(@x1 View view) {
        return E(view) != null;
    }

    @Deprecated
    public static void F1(View view, @g1(from = 0.0d, to = 1.0d) float f2) {
        view.setAlpha(f2);
    }

    public static void F2(@x1 View view) {
        m.z(view);
    }

    public static int G(@x1 View view) {
        return k.a(view);
    }

    public static boolean G0(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.d(view);
        }
        return view.hasFocusable();
    }

    public static void G1(@x1 View view, @z1 String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.j(view, strArr);
        }
    }

    public static void G2(@x1 View view, int i2) {
        if (view instanceof br) {
            ((br) view).f(i2);
        } else if (i2 == 0) {
            F2(view);
        }
    }

    @z1
    public static ms H(@x1 View view) {
        AccessibilityNodeProvider a2 = h.a(view);
        if (a2 != null) {
            return new ms(a2);
        }
        return null;
    }

    public static boolean H0(@x1 View view) {
        return m.n(view);
    }

    public static void H1(@x1 View view, @z1 Drawable drawable) {
        h.q(view, drawable);
    }

    private static void H2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @q2
    @z1
    public static CharSequence I(@x1 View view) {
        return j1().f(view);
    }

    public static boolean I0(@x1 View view, int i2) {
        if (view instanceof br) {
            ((br) view).d(i2);
            return false;
        } else if (i2 == 0) {
            return H0(view);
        } else {
            return false;
        }
    }

    public static void I1(@x1 View view, @z1 ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        m.q(view, colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z2 = (m.g(view) == null && m.h(view) == null) ? false : true;
            if (background == null || !z2) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    public static void I2(@x1 View view, @x1 View.DragShadowBuilder dragShadowBuilder) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.f(view, dragShadowBuilder);
        }
    }

    private static List<ls.a> J(View view) {
        int i2 = nf.e.d0;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static boolean J0(@x1 View view) {
        return g.a(view);
    }

    public static void J1(@x1 View view, @z1 PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        m.r(view, mode);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z2 = (m.g(view) == null && m.h(view) == null) ? false : true;
            if (background == null || !z2) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    @Deprecated
    public static float K(View view) {
        return view.getAlpha();
    }

    public static boolean K0(@x1 View view) {
        return h.h(view);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void K1(ViewGroup viewGroup, boolean z2) {
        if (R == null) {
            try {
                R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            R.setAccessible(true);
        }
        try {
            R.invoke(viewGroup, Boolean.valueOf(z2));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    private static int L(View view, @x1 CharSequence charSequence) {
        List<ls.a> J2 = J(view);
        for (int i2 = 0; i2 < J2.size(); i2++) {
            if (TextUtils.equals(charSequence, J2.get(i2).c())) {
                return J2.get(i2).b();
            }
        }
        int i3 = 0;
        int i4 = -1;
        while (true) {
            int[] iArr = V;
            if (i3 >= iArr.length || i4 != -1) {
                break;
            }
            int i5 = iArr[i3];
            boolean z2 = true;
            for (int i6 = 0; i6 < J2.size(); i6++) {
                z2 &= J2.get(i6).b() != i5;
            }
            if (z2) {
                i4 = i5;
            }
            i3++;
        }
        return i4;
    }

    public static boolean L0(@x1 View view) {
        return h.i(view);
    }

    public static void L1(@x1 View view, @z1 Rect rect) {
        j.c(view, rect);
    }

    @z1
    public static ColorStateList M(@x1 View view) {
        return m.g(view);
    }

    @q2
    public static boolean M0(@x1 View view) {
        Boolean f2 = a().f(view);
        return f2 != null && f2.booleanValue();
    }

    public static void M1(@x1 View view, float f2) {
        m.s(view, f2);
    }

    @z1
    public static PorterDuff.Mode N(@x1 View view) {
        return m.h(view);
    }

    public static boolean N0(@x1 View view) {
        return k.b(view);
    }

    @Deprecated
    public static void N1(View view, boolean z2) {
        view.setFitsSystemWindows(z2);
    }

    @z1
    public static Rect O(@x1 View view) {
        return j.a(view);
    }

    public static boolean O0(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.e(view);
        }
        return false;
    }

    public static void O1(@x1 View view, boolean z2) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.k(view, z2);
        }
    }

    @z1
    public static Display P(@x1 View view) {
        return i.b(view);
    }

    public static boolean P0(@x1 View view) {
        return m.o(view);
    }

    public static void P1(@x1 View view, boolean z2) {
        h.r(view, z2);
    }

    public static float Q(@x1 View view) {
        return m.i(view);
    }

    public static boolean Q0(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.f(view);
        }
        return true;
    }

    @q2
    public static void Q1(@x1 View view, int i2) {
        h.s(view, i2);
    }

    private static Rect R() {
        if (U == null) {
            U = new ThreadLocal<>();
        }
        Rect rect = U.get();
        if (rect == null) {
            rect = new Rect();
            U.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean R0(@x1 View view) {
        return j.b(view);
    }

    public static void R1(@x1 View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.l(view, i2);
        }
    }

    private static lr S(@x1 View view) {
        if (view instanceof lr) {
            return (lr) view;
        }
        return W;
    }

    public static boolean S0(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.g(view);
        }
        return false;
    }

    public static void S1(@x1 View view, boolean z2) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.m(view, z2);
        }
    }

    public static boolean T(@x1 View view) {
        return h.b(view);
    }

    public static boolean T0(@x1 View view) {
        return k.c(view);
    }

    public static void T1(@x1 View view, @m1 int i2) {
        i.h(view, i2);
    }

    public static int U(@x1 View view) {
        return h.c(view);
    }

    public static boolean U0(@x1 View view) {
        return k.d(view);
    }

    public static void U1(@x1 View view, @z1 Paint paint) {
        i.i(view, paint);
    }

    @SuppressLint({"InlinedApi"})
    public static int V(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.b(view);
        }
        return 0;
    }

    public static boolean V0(@x1 View view) {
        return m.p(view);
    }

    @Deprecated
    public static void V1(View view, int i2, Paint paint) {
        view.setLayerType(i2, paint);
    }

    public static int W(@x1 View view) {
        return i.c(view);
    }

    @Deprecated
    public static boolean W0(View view) {
        return view.isOpaque();
    }

    public static void W1(@x1 View view, int i2) {
        i.j(view, i2);
    }

    @Deprecated
    public static int X(View view) {
        return view.getLayerType();
    }

    public static boolean X0(@x1 View view) {
        return i.g(view);
    }

    public static void X1(@x1 View view, boolean z2) {
        m.t(view, z2);
    }

    public static int Y(@x1 View view) {
        return i.d(view);
    }

    @q2
    public static boolean Y0(@x1 View view) {
        Boolean f2 = z1().f(view);
        return f2 != null && f2.booleanValue();
    }

    public static void Y1(@x1 View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.n(view, i2);
        }
    }

    @z1
    @Deprecated
    public static Matrix Z(View view) {
        return view.getMatrix();
    }

    @Deprecated
    public static void Z0(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void Z1(@x1 View view, @z1 jr jrVar) {
        m.u(view, jrVar);
    }

    private static f<Boolean> a() {
        return new d(nf.e.f0, Boolean.class, 28);
    }

    @Deprecated
    public static int a0(View view) {
        return view.getMeasuredHeightAndState();
    }

    @z1
    public static View a1(@x1 View view, @z1 View view2, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.h(view, view2, i2);
        }
        return null;
    }

    public static void a2(@x1 View view, @z1 String[] strArr, @z1 kr krVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            t.c(view, strArr, krVar);
            return;
        }
        strArr = (strArr == null || strArr.length == 0) ? null : null;
        boolean z2 = false;
        if (krVar != null) {
            jp.b(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (strArr[i2].startsWith(tm4.g)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            StringBuilder G2 = wo1.G("A MIME type set here must not start with *: ");
            G2.append(Arrays.toString(strArr));
            jp.b(!z2, G2.toString());
        }
        view.setTag(nf.e.j0, strArr);
        view.setTag(nf.e.i0, krVar);
    }

    public static int b(@x1 View view, @x1 CharSequence charSequence, @x1 os osVar) {
        int L2 = L(view, charSequence);
        if (L2 != -1) {
            c(view, new ls.a(L2, charSequence, osVar));
        }
        return L2;
    }

    @Deprecated
    public static int b0(View view) {
        return view.getMeasuredState();
    }

    public static /* synthetic */ hq b1(hq hqVar) {
        return hqVar;
    }

    @Deprecated
    public static void b2(View view, int i2) {
        view.setOverScrollMode(i2);
    }

    private static void c(@x1 View view, @x1 ls.a aVar) {
        B(view);
        r1(aVar.b(), view);
        J(view).add(aVar);
        c1(view, 0);
    }

    @Deprecated
    public static int c0(View view) {
        return view.getMeasuredWidthAndState();
    }

    @e2(19)
    public static void c1(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = I(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (G(view) != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z2 ? 32 : 2048);
                k.g(obtain, i2);
                if (z2) {
                    obtain.getText().add(I(view));
                    w2(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(I(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i2);
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass().getSimpleName();
                }
            }
        }
    }

    public static void c2(@x1 View view, @c2 int i2, @c2 int i3, @c2 int i4, @c2 int i5) {
        i.k(view, i2, i3, i4, i5);
    }

    public static void d(@x1 View view, @x1 Collection<View> collection, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.a(view, collection, i2);
        }
    }

    public static int d0(@x1 View view) {
        return h.d(view);
    }

    public static void d1(@x1 View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        Rect R2 = R();
        boolean z2 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            R2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !R2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        l(view, i2);
        if (z2 && R2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(R2);
        }
    }

    @Deprecated
    public static void d2(View view, float f2) {
        view.setPivotX(f2);
    }

    public static void e(@x1 View view, @x1 z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            q.a(view, zVar);
            return;
        }
        int i2 = nf.e.o0;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i2, arrayList);
        }
        arrayList.add(zVar);
        if (arrayList.size() == 1) {
            c0.h(view);
        }
    }

    public static int e0(@x1 View view) {
        return h.e(view);
    }

    public static void e1(@x1 View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        Rect R2 = R();
        boolean z2 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            R2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !R2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m(view, i2);
        if (z2 && R2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(R2);
        }
    }

    @Deprecated
    public static void e2(View view, float f2) {
        view.setPivotY(f2);
    }

    @x1
    public static yr f(@x1 View view) {
        if (Q == null) {
            Q = new WeakHashMap<>();
        }
        yr yrVar = Q.get(view);
        if (yrVar == null) {
            yr yrVar2 = new yr(view);
            Q.put(view, yrVar2);
            return yrVar2;
        }
        return yrVar;
    }

    public static int f0(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.c(view);
        }
        return -1;
    }

    @x1
    public static gs f1(@x1 View view, @x1 gs gsVar) {
        WindowInsets J2 = gsVar.J();
        if (J2 != null) {
            WindowInsets b2 = l.b(view, J2);
            if (!b2.equals(J2)) {
                return gs.L(b2, view);
            }
        }
        return gsVar;
    }

    public static void f2(@x1 View view, @z1 nr nrVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.d(view, (PointerIcon) (nrVar != null ? nrVar.b() : null));
        }
    }

    private static void g() {
        try {
            M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException unused) {
        }
        O = true;
    }

    @z1
    public static String[] g0(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t.a(view);
        }
        return (String[]) view.getTag(nf.e.j0);
    }

    @Deprecated
    public static void g1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void g2(View view, float f2) {
        view.setRotation(f2);
    }

    @Deprecated
    public static boolean h(View view, int i2) {
        return view.canScrollHorizontally(i2);
    }

    @Deprecated
    public static int h0(View view) {
        return view.getOverScrollMode();
    }

    public static void h1(@x1 View view, @x1 ls lsVar) {
        view.onInitializeAccessibilityNodeInfo(lsVar.W1());
    }

    @Deprecated
    public static void h2(View view, float f2) {
        view.setRotationX(f2);
    }

    @Deprecated
    public static boolean i(View view, int i2) {
        return view.canScrollVertically(i2);
    }

    @c2
    public static int i0(@x1 View view) {
        return i.e(view);
    }

    @Deprecated
    public static void i1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void i2(View view, float f2) {
        view.setRotationY(f2);
    }

    public static void j(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.a(view);
        }
    }

    @c2
    public static int j0(@x1 View view) {
        return i.f(view);
    }

    private static f<CharSequence> j1() {
        return new b(nf.e.g0, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static void j2(View view, boolean z2) {
        view.setSaveFromParentEnabled(z2);
    }

    @Deprecated
    public static int k(int i2, int i3) {
        return View.combineMeasuredStates(i2, i3);
    }

    @z1
    public static ViewParent k0(@x1 View view) {
        return h.f(view);
    }

    public static boolean k1(@x1 View view, int i2, @z1 Bundle bundle) {
        return h.j(view, i2, bundle);
    }

    @Deprecated
    public static void k2(View view, float f2) {
        view.setScaleX(f2);
    }

    private static void l(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            H2(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                H2((View) parent);
            }
        }
    }

    @Deprecated
    public static float l0(View view) {
        return view.getPivotX();
    }

    @z1
    public static hq l1(@x1 View view, @x1 hq hqVar) {
        if (Log.isLoggable(a, 3)) {
            String str = "performReceiveContent: " + hqVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]";
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.b(view, hqVar);
        }
        kr krVar = (kr) view.getTag(nf.e.i0);
        if (krVar != null) {
            hq a2 = krVar.a(view, hqVar);
            if (a2 == null) {
                return null;
            }
            return S(view).onReceiveContent(a2);
        }
        return S(view).onReceiveContent(hqVar);
    }

    @Deprecated
    public static void l2(View view, float f2) {
        view.setScaleY(f2);
    }

    private static void m(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            H2(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                H2((View) parent);
            }
        }
    }

    @Deprecated
    public static float m0(View view) {
        return view.getPivotY();
    }

    public static void m1(@x1 View view) {
        h.k(view);
    }

    @q2
    public static void m2(@x1 View view, boolean z2) {
        z1().g(view, Boolean.valueOf(z2));
    }

    @x1
    public static gs n(@x1 View view, @x1 gs gsVar, @x1 Rect rect) {
        return m.b(view, gsVar, rect);
    }

    @z1
    public static gs n0(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return n.a(view);
        }
        return m.j(view);
    }

    public static void n1(@x1 View view, int i2, int i3, int i4, int i5) {
        h.l(view, i2, i3, i4, i5);
    }

    public static void n2(@x1 View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.c(view, i2);
        }
    }

    @x1
    public static gs o(@x1 View view, @x1 gs gsVar) {
        WindowInsets J2 = gsVar.J();
        if (J2 != null) {
            WindowInsets a2 = l.a(view, J2);
            if (!a2.equals(J2)) {
                return gs.L(a2, view);
            }
        }
        return gsVar;
    }

    @Deprecated
    public static float o0(View view) {
        return view.getRotation();
    }

    public static void o1(@x1 View view, @x1 Runnable runnable) {
        h.m(view, runnable);
    }

    public static void o2(@x1 View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i2, i3);
        }
    }

    public static void p(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.b(view);
            return;
        }
        if (!O) {
            g();
        }
        Method method = N;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        view.onFinishTemporaryDetach();
    }

    @Deprecated
    public static float p0(View view) {
        return view.getRotationX();
    }

    @SuppressLint({"LambdaLast"})
    public static void p1(@x1 View view, @x1 Runnable runnable, long j2) {
        h.n(view, runnable, j2);
    }

    @q2
    public static void p2(@x1 View view, @z1 CharSequence charSequence) {
        E2().g(view, charSequence);
    }

    public static boolean q(@x1 View view, float f2, float f3, boolean z2) {
        return m.c(view, f2, f3, z2);
    }

    @Deprecated
    public static float q0(View view) {
        return view.getRotationY();
    }

    public static void q1(@x1 View view, int i2) {
        r1(i2, view);
        c1(view, 0);
    }

    public static void q2(@x1 View view, @x1 List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.d(view, list);
        }
    }

    public static boolean r(@x1 View view, float f2, float f3) {
        return m.d(view, f2, f3);
    }

    @Deprecated
    public static float r0(View view) {
        return view.getScaleX();
    }

    private static void r1(int i2, View view) {
        List<ls.a> J2 = J(view);
        for (int i3 = 0; i3 < J2.size(); i3++) {
            if (J2.get(i3).b() == i2) {
                J2.remove(i3);
                return;
            }
        }
    }

    public static void r2(@x1 View view, @z1 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.o(view, charSequence);
        }
    }

    public static boolean s(@x1 View view, int i2, int i3, @z1 int[] iArr, @z1 int[] iArr2) {
        return m.e(view, i2, i3, iArr, iArr2);
    }

    @Deprecated
    public static float s0(View view) {
        return view.getScaleY();
    }

    public static void s1(@x1 View view, @x1 z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            q.e(view, zVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(nf.e.o0);
        if (arrayList != null) {
            arrayList.remove(zVar);
            if (arrayList.size() == 0) {
                c0.i(view);
            }
        }
    }

    public static void s2(@x1 View view, @z1 String str) {
        m.v(view, str);
    }

    public static boolean t(@x1 View view, int i2, int i3, @z1 int[] iArr, @z1 int[] iArr2, int i4) {
        if (view instanceof br) {
            return ((br) view).b(i2, i3, iArr, iArr2, i4);
        }
        if (i4 == 0) {
            return s(view, i2, i3, iArr, iArr2);
        }
        return false;
    }

    public static int t0(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return n.b(view);
        }
        return 0;
    }

    public static void t1(@x1 View view, @x1 ls.a aVar, @z1 CharSequence charSequence, @z1 os osVar) {
        if (osVar == null && charSequence == null) {
            q1(view, aVar.b());
        } else {
            c(view, aVar.a(charSequence, osVar));
        }
    }

    @Deprecated
    public static void t2(View view, float f2) {
        view.setTranslationX(f2);
    }

    public static void u(@x1 View view, int i2, int i3, int i4, int i5, @z1 int[] iArr, int i6, @x1 int[] iArr2) {
        if (view instanceof cr) {
            ((cr) view).c(i2, i3, i4, i5, iArr, i6, iArr2);
        } else {
            w(view, i2, i3, i4, i5, iArr, i6);
        }
    }

    @q2
    @z1
    public static CharSequence u0(@x1 View view) {
        return E2().f(view);
    }

    public static void u1(@x1 View view) {
        l.c(view);
    }

    @Deprecated
    public static void u2(View view, float f2) {
        view.setTranslationY(f2);
    }

    public static boolean v(@x1 View view, int i2, int i3, int i4, int i5, @z1 int[] iArr) {
        return m.f(view, i2, i3, i4, i5, iArr);
    }

    @x1
    public static List<Rect> v0(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r.b(view);
        }
        return Collections.emptyList();
    }

    @x1
    public static <T extends View> T v1(@x1 View view, @m1 int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) q.f(view, i2);
        }
        T t2 = (T) view.findViewById(i2);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void v2(@x1 View view, float f2) {
        m.w(view, f2);
    }

    public static boolean w(@x1 View view, int i2, int i3, int i4, int i5, @z1 int[] iArr, int i6) {
        if (view instanceof br) {
            return ((br) view).a(i2, i3, i4, i5, iArr, i6);
        }
        if (i6 == 0) {
            return v(view, i2, i3, i4, i5, iArr);
        }
        return false;
    }

    @z1
    public static String w0(@x1 View view) {
        return m.k(view);
    }

    @Deprecated
    public static int w1(int i2, int i3, int i4) {
        return View.resolveSizeAndState(i2, i3, i4);
    }

    private static void w2(View view) {
        if (U(view) == 0) {
            Q1(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (U((View) parent) == 4) {
                Q1(view, 2);
                return;
            }
        }
    }

    public static void x(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.c(view);
            return;
        }
        if (!O) {
            g();
        }
        Method method = M;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        view.onStartTemporaryDetach();
    }

    @Deprecated
    public static float x0(View view) {
        return view.getTranslationX();
    }

    public static boolean x1(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.i(view);
        }
        return view.requestFocus();
    }

    public static void x2(@x1 View view, @z1 ds.b bVar) {
        ds.h(view, bVar);
    }

    @q2
    public static boolean y(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c0.a(view).b(view, keyEvent);
    }

    @Deprecated
    public static float y0(View view) {
        return view.getTranslationY();
    }

    public static void y1(@x1 View view, @x1 @SuppressLint({"ContextFirst"}) Context context, @x1 int[] iArr, @z1 AttributeSet attributeSet, @x1 TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.c(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    @Deprecated
    public static void y2(View view, float f2) {
        view.setX(f2);
    }

    @q2
    public static boolean z(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c0.a(view).f(keyEvent);
    }

    public static float z0(@x1 View view) {
        return m.l(view);
    }

    private static f<Boolean> z1() {
        return new a(nf.e.k0, Boolean.class, 28);
    }

    @Deprecated
    public static void z2(View view, float f2) {
        view.setY(f2);
    }
}