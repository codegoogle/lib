package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;

/* compiled from: ViewUtils.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class kf2 {

    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ View s;

        public a(View view) {
            this.s = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.s.getContext().getSystemService("input_method")).showSoftInput(this.s, 1);
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    public class b implements e {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ e d;

        public b(boolean z, boolean z2, boolean z3, e eVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = eVar;
        }

        @Override // com.p7700g.p99005.kf2.e
        @x1
        public gs a(View view, @x1 gs gsVar, @x1 f fVar) {
            if (this.a) {
                fVar.d = gsVar.o() + fVar.d;
            }
            boolean k = kf2.k(view);
            if (this.b) {
                if (k) {
                    fVar.c = gsVar.p() + fVar.c;
                } else {
                    fVar.a = gsVar.p() + fVar.a;
                }
            }
            if (this.c) {
                if (k) {
                    fVar.a = gsVar.q() + fVar.a;
                } else {
                    fVar.c = gsVar.q() + fVar.c;
                }
            }
            fVar.a(view);
            e eVar = this.d;
            return eVar != null ? eVar.a(view, gsVar, fVar) : gsVar;
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    public class c implements jr {
        public final /* synthetic */ e a;
        public final /* synthetic */ f b;

        public c(e eVar, f fVar) {
            this.a = eVar;
            this.b = fVar;
        }

        @Override // com.p7700g.p99005.jr
        public gs a(View view, gs gsVar) {
            return this.a.a(view, gsVar, new f(this.b));
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    public class d implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@x1 View view) {
            view.removeOnAttachStateChangeListener(this);
            sr.u1(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    public interface e {
        gs a(View view, gs gsVar, f fVar);
    }

    private kf2() {
    }

    public static void a(@z1 View view, @x1 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void b(@x1 View view, @z1 AttributeSet attributeSet, int i, int i2) {
        c(view, attributeSet, i, i2, null);
    }

    public static void c(@x1 View view, @z1 AttributeSet attributeSet, int i, int i2, @z1 e eVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, ga2.o.Tg, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(ga2.o.Xg, false);
        boolean z2 = obtainStyledAttributes.getBoolean(ga2.o.Yg, false);
        boolean z3 = obtainStyledAttributes.getBoolean(ga2.o.Zg, false);
        obtainStyledAttributes.recycle();
        d(view, new b(z, z2, z3, eVar));
    }

    public static void d(@x1 View view, @x1 e eVar) {
        sr.Z1(view, new c(eVar, new f(sr.j0(view), view.getPaddingTop(), sr.i0(view), view.getPaddingBottom())));
        o(view);
    }

    public static float e(@x1 Context context, @b1(unit = 0) int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    @z1
    public static Integer f(@x1 View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    @z1
    public static ViewGroup g(@z1 View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @z1
    public static jf2 h(@x1 View view) {
        return i(g(view));
    }

    @z1
    public static jf2 i(@z1 View view) {
        if (view == null) {
            return null;
        }
        return new if2(view);
    }

    public static float j(@x1 View view) {
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f2 += sr.Q((View) parent);
        }
        return f2;
    }

    public static boolean k(View view) {
        return sr.Y(view) == 1;
    }

    public static PorterDuff.Mode l(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void m(@z1 View view, @x1 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            n(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void n(@x1 ViewTreeObserver viewTreeObserver, @x1 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void o(@x1 View view) {
        if (sr.N0(view)) {
            sr.u1(view);
        } else {
            view.addOnAttachStateChangeListener(new d());
        }
    }

    public static void p(@x1 View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    public static class f {
        public int a;
        public int b;
        public int c;
        public int d;

        public f(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public void a(View view) {
            sr.c2(view, this.a, this.b, this.c, this.d);
        }

        public f(@x1 f fVar) {
            this.a = fVar.a;
            this.b = fVar.b;
            this.c = fVar.c;
            this.d = fVar.d;
        }
    }
}