package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.p7700g.p99005.cf2;
import com.p7700g.p99005.di2;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.ei2;
import com.p7700g.p99005.fk;
import com.p7700g.p99005.fq;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.gs;
import com.p7700g.p99005.ha2;
import com.p7700g.p99005.ho5;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.jr;
import com.p7700g.p99005.kc2;
import com.p7700g.p99005.kf2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.m1;
import com.p7700g.p99005.p1;
import com.p7700g.p99005.s1;
import com.p7700g.p99005.sg2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yi2;
import com.p7700g.p99005.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = -2;
    public static final int d = -1;
    public static final int e = 0;
    public static final int f = 250;
    public static final int g = 180;
    private static final int h = 150;
    private static final int i = 75;
    private static final float j = 0.8f;
    public static final int l = 0;
    public static final int m = 1;
    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private List<s<B>> F;
    private Behavior G;
    @z1
    private final AccessibilityManager H;
    @x1
    public ei2.b I;
    @x1
    private final ViewGroup q;
    private final Context r;
    @x1
    public final w s;
    @x1
    private final di2 t;
    private int u;
    private boolean v;
    @z1
    private q w;
    private boolean x;
    @e2(29)
    private final Runnable y;
    private int z;
    private static final boolean n = false;
    private static final int[] o = {ga2.c.ke};
    private static final String p = BaseTransientBottomBar.class.getSimpleName();
    @x1
    public static final Handler k = new Handler(Looper.getMainLooper(), new h());

    /* loaded from: classes3.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        @x1
        private final t t = new t(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void V(@x1 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.t.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean G(View view) {
            return this.t.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, @x1 MotionEvent motionEvent) {
            this.t.b(coordinatorLayout, view, motionEvent);
            return super.l(coordinatorLayout, view, motionEvent);
        }
    }

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int s;

        public a(int i) {
            this.s = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S(this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.s.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.s.setScaleX(floatValue);
            BaseTransientBottomBar.this.s.setScaleY(floatValue);
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.t.a(70, 180);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        private int s;
        public final /* synthetic */ int t;

        public e(int i) {
            this.t = i;
            this.s = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.n) {
                sr.e1(BaseTransientBottomBar.this.s, intValue - this.s);
            } else {
                BaseTransientBottomBar.this.s.setTranslationY(intValue);
            }
            this.s = intValue;
        }
    }

    /* loaded from: classes3.dex */
    public class f extends AnimatorListenerAdapter {
        public final /* synthetic */ int s;

        public f(int i) {
            this.s = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S(this.s);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.t.b(0, 180);
        }
    }

    /* loaded from: classes3.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        private int s = 0;

        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.n) {
                sr.e1(BaseTransientBottomBar.this.s, intValue - this.s);
            } else {
                BaseTransientBottomBar.this.s.setTranslationY(intValue);
            }
            this.s = intValue;
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@x1 Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).h0();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).J(message.arg1);
                return true;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int D;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.s == null || baseTransientBottomBar.r == null || (D = (BaseTransientBottomBar.this.D() - BaseTransientBottomBar.this.H()) + ((int) BaseTransientBottomBar.this.s.getTranslationY())) >= BaseTransientBottomBar.this.C) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.s.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                String unused = BaseTransientBottomBar.p;
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (BaseTransientBottomBar.this.C - D) + marginLayoutParams.bottomMargin;
            BaseTransientBottomBar.this.s.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    public class j implements jr {
        public j() {
        }

        @Override // com.p7700g.p99005.jr
        @x1
        public gs a(View view, @x1 gs gsVar) {
            BaseTransientBottomBar.this.z = gsVar.o();
            BaseTransientBottomBar.this.A = gsVar.p();
            BaseTransientBottomBar.this.B = gsVar.q();
            BaseTransientBottomBar.this.n0();
            return gsVar;
        }
    }

    /* loaded from: classes3.dex */
    public class k extends fq {
        public k() {
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, @x1 ls lsVar) {
            super.g(view, lsVar);
            lsVar.a(1048576);
            lsVar.d1(true);
        }

        @Override // com.p7700g.p99005.fq
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BaseTransientBottomBar.this.t();
                return true;
            }
            return super.j(view, i, bundle);
        }
    }

    /* loaded from: classes3.dex */
    public class l implements ei2.b {
        public l() {
        }

        @Override // com.p7700g.p99005.ei2.b
        public void a(int i) {
            Handler handler = BaseTransientBottomBar.k;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // com.p7700g.p99005.ei2.b
        public void show() {
            Handler handler = BaseTransientBottomBar.k;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* loaded from: classes3.dex */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.S(3);
        }
    }

    /* loaded from: classes3.dex */
    public class n implements SwipeDismissBehavior.c {
        public n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(@x1 View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.u(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i) {
            if (i == 0) {
                ei2.c().l(BaseTransientBottomBar.this.I);
            } else if (i == 1 || i == 2) {
                ei2.c().k(BaseTransientBottomBar.this.I);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = BaseTransientBottomBar.this.s;
            if (wVar == null) {
                return;
            }
            if (wVar.getParent() != null) {
                BaseTransientBottomBar.this.s.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.s.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.j0();
            } else {
                BaseTransientBottomBar.this.l0();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class p extends AnimatorListenerAdapter {
        public p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T();
        }
    }

    /* loaded from: classes3.dex */
    public static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        @x1
        private final WeakReference<BaseTransientBottomBar> s;
        @x1
        private final WeakReference<View> t;

        private q(@x1 BaseTransientBottomBar baseTransientBottomBar, @x1 View view) {
            this.s = new WeakReference<>(baseTransientBottomBar);
            this.t = new WeakReference<>(view);
        }

        public static q a(@x1 BaseTransientBottomBar baseTransientBottomBar, @x1 View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (sr.N0(view)) {
                kf2.a(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        private boolean d() {
            if (this.s.get() == null) {
                c();
                return true;
            }
            return false;
        }

        @z1
        public View b() {
            return this.t.get();
        }

        public void c() {
            if (this.t.get() != null) {
                this.t.get().removeOnAttachStateChangeListener(this);
                kf2.m(this.t.get(), this);
            }
            this.t.clear();
            this.s.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d() || !this.s.get().x) {
                return;
            }
            this.s.get().U();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            kf2.a(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            kf2.m(view, this);
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface r {
    }

    /* loaded from: classes3.dex */
    public static abstract class s<B> {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;

        @i2({i2.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface a {
        }

        public void a(B b2, int i) {
        }

        public void b(B b2) {
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static class t {
        private ei2.b a;

        public t(@x1 SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.R(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.S(0);
        }

        public boolean a(View view) {
            return view instanceof w;
        }

        public void b(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, @x1 MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.A(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    ei2.c().k(this.a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                ei2.c().l(this.a);
            }
        }

        public void c(@x1 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar.I;
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface u extends di2 {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @p1(from = ho5.e)
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface v {
    }

    @i2({i2.a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static class w extends FrameLayout {
        private static final View.OnTouchListener s = new a();
        private PorterDuff.Mode A;
        @z1
        private Rect B;
        private boolean C;
        @z1
        private BaseTransientBottomBar<?> t;
        private int u;
        private final float v;
        private final float w;
        private final int x;
        private final int y;
        private ColorStateList z;

        /* loaded from: classes3.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public w(@x1 Context context) {
            this(context, null);
        }

        @x1
        private Drawable d() {
            float dimension = getResources().getDimension(ga2.f.h9);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(kc2.o(this, ga2.c.o3, ga2.c.Z2, getBackgroundOverlayColorAlpha()));
            if (this.z != null) {
                Drawable r = fk.r(gradientDrawable);
                fk.o(r, this.z);
                return r;
            }
            return fk.r(gradientDrawable);
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.B = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.t = baseTransientBottomBar;
        }

        public void c(ViewGroup viewGroup) {
            this.C = true;
            viewGroup.addView(this);
            this.C = false;
        }

        public float getActionTextColorAlpha() {
            return this.w;
        }

        public int getAnimationMode() {
            return this.u;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.v;
        }

        public int getMaxInlineActionWidth() {
            return this.y;
        }

        public int getMaxWidth() {
            return this.x;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.t;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.P();
            }
            sr.u1(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.t;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.Q();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.t;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.R();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.x > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.x;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setAnimationMode(int i) {
            this.u = i;
        }

        @Override // android.view.View
        public void setBackground(@z1 Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@z1 Drawable drawable) {
            if (drawable != null && this.z != null) {
                drawable = fk.r(drawable.mutate());
                fk.o(drawable, this.z);
                fk.p(drawable, this.A);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@z1 ColorStateList colorStateList) {
            this.z = colorStateList;
            if (getBackground() != null) {
                Drawable r = fk.r(getBackground().mutate());
                fk.o(r, colorStateList);
                fk.p(r, this.A);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@z1 PorterDuff.Mode mode) {
            this.A = mode;
            if (getBackground() != null) {
                Drawable r = fk.r(getBackground().mutate());
                fk.p(r, mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.C || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.t;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.n0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@z1 View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : s);
            super.setOnClickListener(onClickListener);
        }

        public w(@x1 Context context, AttributeSet attributeSet) {
            super(yi2.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ga2.o.Wr);
            int i = ga2.o.ds;
            if (obtainStyledAttributes.hasValue(i)) {
                sr.M1(this, obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.u = obtainStyledAttributes.getInt(ga2.o.Zr, 0);
            this.v = obtainStyledAttributes.getFloat(ga2.o.as, 1.0f);
            setBackgroundTintList(sg2.a(context2, obtainStyledAttributes, ga2.o.bs));
            setBackgroundTintMode(kf2.l(obtainStyledAttributes.getInt(ga2.o.cs, -1), PorterDuff.Mode.SRC_IN));
            this.w = obtainStyledAttributes.getFloat(ga2.o.Yr, 1.0f);
            this.x = obtainStyledAttributes.getDimensionPixelSize(ga2.o.Xr, -1);
            this.y = obtainStyledAttributes.getDimensionPixelSize(ga2.o.es, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(s);
            setFocusable(true);
            if (getBackground() == null) {
                sr.H1(this, d());
            }
        }
    }

    public BaseTransientBottomBar(@x1 ViewGroup viewGroup, @x1 View view, @x1 di2 di2Var) {
        this(viewGroup.getContext(), viewGroup, view, di2Var);
    }

    private ValueAnimator C(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(ha2.d);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @e2(17)
    public int D() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.r.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private int F() {
        int height = this.s.getHeight();
        ViewGroup.LayoutParams layoutParams = this.s.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H() {
        int[] iArr = new int[2];
        this.s.getLocationOnScreen(iArr);
        return this.s.getHeight() + iArr[1];
    }

    private boolean O() {
        ViewGroup.LayoutParams layoutParams = this.s.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        this.D = s();
        n0();
    }

    private void d0(CoordinatorLayout.g gVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.G;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = B();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).V(this);
        }
        swipeDismissBehavior.P(new n());
        gVar.q(swipeDismissBehavior);
        if (w() == null) {
            gVar.g = 80;
        }
    }

    private boolean f0() {
        return this.C > 0 && !this.v && O();
    }

    private void i0() {
        if (e0()) {
            q();
            return;
        }
        if (this.s.getParent() != null) {
            this.s.setVisibility(0);
        }
        T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        ValueAnimator v2 = v(0.0f, 1.0f);
        ValueAnimator C = C(j, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(v2, C);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void k0(int i2) {
        ValueAnimator v2 = v(1.0f, 0.0f);
        v2.setDuration(75L);
        v2.addListener(new a(i2));
        v2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        int F = F();
        if (n) {
            sr.e1(this.s, F);
        } else {
            this.s.setTranslationY(F);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(F, 0);
        valueAnimator.setInterpolator(ha2.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(F));
        valueAnimator.start();
    }

    private void m0(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, F());
        valueAnimator.setInterpolator(ha2.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new f(i2));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        ViewGroup.LayoutParams layoutParams = this.s.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.s.B == null || this.s.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = this.s.B.bottom + (w() != null ? this.D : this.z);
        marginLayoutParams.leftMargin = this.s.B.left + this.A;
        marginLayoutParams.rightMargin = this.s.B.right + this.B;
        marginLayoutParams.topMargin = this.s.B.top;
        this.s.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || !f0()) {
            return;
        }
        this.s.removeCallbacks(this.y);
        this.s.post(this.y);
    }

    private void r(int i2) {
        if (this.s.getAnimationMode() == 1) {
            k0(i2);
        } else {
            m0(i2);
        }
    }

    private int s() {
        if (w() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        w().getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.q.getLocationOnScreen(iArr2);
        return (this.q.getHeight() + iArr2[1]) - i2;
    }

    private ValueAnimator v(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(ha2.a);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    public int A() {
        return this.u;
    }

    @x1
    public SwipeDismissBehavior<? extends View> B() {
        return new Behavior();
    }

    @s1
    public int E() {
        return I() ? ga2.k.B0 : ga2.k.F;
    }

    @x1
    public View G() {
        return this.s;
    }

    public boolean I() {
        TypedArray obtainStyledAttributes = this.r.obtainStyledAttributes(o);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public final void J(int i2) {
        if (e0() && this.s.getVisibility() == 0) {
            r(i2);
        } else {
            S(i2);
        }
    }

    public boolean K() {
        return this.x;
    }

    public boolean L() {
        return this.v;
    }

    public boolean M() {
        return ei2.c().e(this.I);
    }

    public boolean N() {
        return ei2.c().f(this.I);
    }

    public void P() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.s.getRootWindowInsets()) == null) {
            return;
        }
        this.C = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        n0();
    }

    public void Q() {
        if (N()) {
            k.post(new m());
        }
    }

    public void R() {
        if (this.E) {
            i0();
            this.E = false;
        }
    }

    public void S(int i2) {
        ei2.c().i(this.I);
        List<s<B>> list = this.F;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.F.get(size).a(this, i2);
            }
        }
        ViewParent parent = this.s.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.s);
        }
    }

    public void T() {
        ei2.c().j(this.I);
        List<s<B>> list = this.F;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.F.get(size).b(this);
            }
        }
    }

    @x1
    public B V(@z1 s<B> sVar) {
        List<s<B>> list;
        if (sVar == null || (list = this.F) == null) {
            return this;
        }
        list.remove(sVar);
        return this;
    }

    @x1
    public B W(@m1 int i2) {
        View findViewById = this.q.findViewById(i2);
        if (findViewById != null) {
            return X(findViewById);
        }
        throw new IllegalArgumentException(wo1.l("Unable to find anchor view with id: ", i2));
    }

    @x1
    public B X(@z1 View view) {
        q qVar = this.w;
        if (qVar != null) {
            qVar.c();
        }
        this.w = view == null ? null : q.a(this, view);
        return this;
    }

    public void Y(boolean z) {
        this.x = z;
    }

    @x1
    public B Z(int i2) {
        this.s.setAnimationMode(i2);
        return this;
    }

    @x1
    public B a0(Behavior behavior) {
        this.G = behavior;
        return this;
    }

    @x1
    public B b0(int i2) {
        this.u = i2;
        return this;
    }

    @x1
    public B c0(boolean z) {
        this.v = z;
        return this;
    }

    public boolean e0() {
        AccessibilityManager accessibilityManager = this.H;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void g0() {
        ei2.c().n(A(), this.I);
    }

    public final void h0() {
        if (this.s.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.s.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                d0((CoordinatorLayout.g) layoutParams);
            }
            this.s.c(this.q);
            U();
            this.s.setVisibility(4);
        }
        if (sr.T0(this.s)) {
            i0();
        } else {
            this.E = true;
        }
    }

    @x1
    public B p(@z1 s<B> sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.F == null) {
            this.F = new ArrayList();
        }
        this.F.add(sVar);
        return this;
    }

    public void q() {
        this.s.post(new o());
    }

    public void t() {
        u(3);
    }

    public void u(int i2) {
        ei2.c().b(this.I, i2);
    }

    @z1
    public View w() {
        q qVar = this.w;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int x() {
        return this.s.getAnimationMode();
    }

    public Behavior y() {
        return this.G;
    }

    @x1
    public Context z() {
        return this.r;
    }

    public BaseTransientBottomBar(@x1 Context context, @x1 ViewGroup viewGroup, @x1 View view, @x1 di2 di2Var) {
        this.x = false;
        this.y = new i();
        this.I = new l();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (di2Var != null) {
            this.q = viewGroup;
            this.t = di2Var;
            this.r = context;
            cf2.a(context);
            w wVar = (w) LayoutInflater.from(context).inflate(E(), viewGroup, false);
            this.s = wVar;
            wVar.setBaseTransientBottomBar(this);
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.c(wVar.getActionTextColorAlpha());
                snackbarContentLayout.setMaxInlineActionWidth(wVar.getMaxInlineActionWidth());
            }
            wVar.addView(view);
            sr.C1(wVar, 1);
            sr.Q1(wVar, 1);
            sr.N1(wVar, true);
            sr.Z1(wVar, new j());
            sr.A1(wVar, new k());
            this.H = (AccessibilityManager) context.getSystemService("accessibility");
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }
}