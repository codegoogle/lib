package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.TooltipCompat;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ip;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.ua0;
import com.p7700g.p99005.x2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TabLayout.java */
@ua0.e
/* loaded from: classes3.dex */
public class li2 extends HorizontalScrollView {
    private static final String B = "TabLayout";
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 2;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 3;
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    @b1(unit = 0)
    private static final int t = 72;
    @b1(unit = 0)
    public static final int u = 8;
    @b1(unit = 0)
    private static final int v = 48;
    @b1(unit = 0)
    private static final int w = 56;
    @b1(unit = 0)
    public static final int x = 16;
    private static final int y = -1;
    private static final int z = 300;
    private int A0;
    public PorterDuff.Mode B0;
    public float C0;
    public float D0;
    public final int E0;
    public int F0;
    private final int G0;
    private final int H0;
    private final int I0;
    private int J0;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public boolean O0;
    public boolean P0;
    public int Q0;
    private final ArrayList<i> R;
    public int R0;
    @z1
    private i S;
    public boolean S0;
    @x1
    public final h T;
    private ji2 T0;
    public int U;
    @z1
    private c U0;
    public int V;
    private final ArrayList<c> V0;
    public int W;
    @z1
    private c W0;
    private ValueAnimator X0;
    @z1
    public ua0 Y0;
    @z1
    private ra0 Z0;
    private DataSetObserver a1;
    private m b1;
    private b c1;
    private boolean d1;
    private final ip.a<n> e1;
    public int u0;
    public int v0;
    public ColorStateList w0;
    public ColorStateList x0;
    public ColorStateList y0;
    @x1
    public Drawable z0;
    private static final int s = ga2.n.ie;
    private static final ip.a<i> A = new ip.c(16);

    /* compiled from: TabLayout.java */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            li2.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* compiled from: TabLayout.java */
    /* loaded from: classes3.dex */
    public class b implements ua0.i {
        private boolean a;

        public b() {
        }

        public void a(boolean z) {
            this.a = z;
        }

        @Override // com.p7700g.p99005.ua0.i
        public void d(@x1 ua0 ua0Var, @z1 ra0 ra0Var, @z1 ra0 ra0Var2) {
            li2 li2Var = li2.this;
            if (li2Var.Y0 == ua0Var) {
                li2Var.P(ra0Var2, this.a);
            }
        }
    }

    /* compiled from: TabLayout.java */
    @Deprecated
    /* loaded from: classes3.dex */
    public interface c<T extends i> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    /* compiled from: TabLayout.java */
    /* loaded from: classes3.dex */
    public @interface d {
    }

    /* compiled from: TabLayout.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface e {
    }

    /* compiled from: TabLayout.java */
    /* loaded from: classes3.dex */
    public interface f extends c<i> {
    }

    /* compiled from: TabLayout.java */
    /* loaded from: classes3.dex */
    public class g extends DataSetObserver {
        public g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            li2.this.F();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            li2.this.F();
        }
    }

    /* compiled from: TabLayout.java */
    /* loaded from: classes3.dex */
    public class h extends LinearLayout {
        public ValueAnimator s;
        public int t;
        public float u;
        private int v;

        /* compiled from: TabLayout.java */
        /* loaded from: classes3.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ View s;
            public final /* synthetic */ View t;

            public a(View view, View view2) {
                this.s = view;
                this.t = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
                h.this.i(this.s, this.t, valueAnimator.getAnimatedFraction());
            }
        }

        /* compiled from: TabLayout.java */
        /* loaded from: classes3.dex */
        public class b extends AnimatorListenerAdapter {
            public final /* synthetic */ int s;

            public b(int i) {
                this.s = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                h.this.t = this.s;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                h.this.t = this.s;
            }
        }

        public h(Context context) {
            super(context);
            this.t = -1;
            this.v = -1;
            setWillNotDraw(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            View childAt = getChildAt(this.t);
            ji2 ji2Var = li2.this.T0;
            li2 li2Var = li2.this;
            ji2Var.c(li2Var, childAt, li2Var.z0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                ji2 ji2Var = li2.this.T0;
                li2 li2Var = li2.this;
                ji2Var.d(li2Var, view, view2, f, li2Var.z0);
            } else {
                Drawable drawable = li2.this.z0;
                drawable.setBounds(-1, drawable.getBounds().top, -1, li2.this.z0.getBounds().bottom);
            }
            sr.m1(this);
        }

        private void j(boolean z, int i, int i2) {
            View childAt = getChildAt(this.t);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                f();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.s = valueAnimator;
                valueAnimator.setInterpolator(ha2.b);
                valueAnimator.setDuration(i2);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new b(i));
                valueAnimator.start();
                return;
            }
            this.s.removeAllUpdateListeners();
            this.s.addUpdateListener(aVar);
        }

        public void c(int i, int i2) {
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.s.cancel();
            }
            j(true, i, i2);
        }

        public boolean d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(@x1 Canvas canvas) {
            int height = li2.this.z0.getBounds().height();
            if (height < 0) {
                height = li2.this.z0.getIntrinsicHeight();
            }
            int i = li2.this.M0;
            int i2 = 0;
            if (i == 0) {
                i2 = getHeight() - height;
                height = getHeight();
            } else if (i == 1) {
                i2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i != 2) {
                height = i != 3 ? 0 : getHeight();
            }
            if (li2.this.z0.getBounds().width() > 0) {
                Rect bounds = li2.this.z0.getBounds();
                li2.this.z0.setBounds(bounds.left, i2, bounds.right, height);
                li2 li2Var = li2.this;
                Drawable drawable = li2Var.z0;
                if (li2Var.A0 != 0) {
                    drawable = fk.r(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(li2.this.A0, PorterDuff.Mode.SRC_IN);
                    } else {
                        fk.n(drawable, li2.this.A0);
                    }
                } else if (Build.VERSION.SDK_INT == 21) {
                    drawable.setColorFilter(null);
                } else {
                    fk.o(drawable, null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        public float e() {
            return this.t + this.u;
        }

        public void g(int i, float f) {
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.s.cancel();
            }
            this.t = i;
            this.u = f;
            i(getChildAt(i), getChildAt(this.t + 1), this.u);
        }

        public void h(int i) {
            Rect bounds = li2.this.z0.getBounds();
            li2.this.z0.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                j(false, this.t, -1);
            } else {
                f();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            li2 li2Var = li2.this;
            boolean z = true;
            if (li2Var.K0 == 1 || li2Var.N0 == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) kf2.e(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    li2 li2Var2 = li2.this;
                    li2Var2.K0 = 0;
                    li2Var2.X(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.v == i) {
                return;
            }
            requestLayout();
            this.v = i;
        }
    }

    /* compiled from: TabLayout.java */
    /* loaded from: classes3.dex */
    public static class i {
        public static final int a = -1;
        @z1
        private Object b;
        @z1
        private Drawable c;
        @z1
        private CharSequence d;
        @z1
        private CharSequence e;
        @z1
        private View g;
        @z1
        public li2 i;
        @x1
        public n j;
        private int f = -1;
        @d
        private int h = 1;
        private int k = -1;

        @x1
        public i A(@d int i) {
            this.h = i;
            li2 li2Var = this.i;
            if (li2Var.K0 == 1 || li2Var.N0 == 2) {
                li2Var.X(true);
            }
            E();
            if (ab2.a && this.j.o() && this.j.w.isVisible()) {
                this.j.invalidate();
            }
            return this;
        }

        @x1
        public i B(@z1 Object obj) {
            this.b = obj;
            return this;
        }

        @x1
        public i C(@l2 int i) {
            li2 li2Var = this.i;
            if (li2Var != null) {
                return D(li2Var.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @x1
        public i D(@z1 CharSequence charSequence) {
            if (TextUtils.isEmpty(this.e) && !TextUtils.isEmpty(charSequence)) {
                this.j.setContentDescription(charSequence);
            }
            this.d = charSequence;
            E();
            return this;
        }

        public void E() {
            n nVar = this.j;
            if (nVar != null) {
                nVar.x();
            }
        }

        @z1
        public ya2 e() {
            return this.j.getBadge();
        }

        @z1
        public CharSequence f() {
            n nVar = this.j;
            if (nVar == null) {
                return null;
            }
            return nVar.getContentDescription();
        }

        @z1
        public View g() {
            return this.g;
        }

        @z1
        public Drawable h() {
            return this.c;
        }

        public int i() {
            return this.k;
        }

        @x1
        public ya2 j() {
            return this.j.getOrCreateBadge();
        }

        public int k() {
            return this.f;
        }

        @d
        public int l() {
            return this.h;
        }

        @z1
        public Object m() {
            return this.b;
        }

        @z1
        public CharSequence n() {
            return this.d;
        }

        public boolean o() {
            li2 li2Var = this.i;
            if (li2Var != null) {
                int selectedTabPosition = li2Var.getSelectedTabPosition();
                return selectedTabPosition != -1 && selectedTabPosition == this.f;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void p() {
            this.j.r();
        }

        public void q() {
            this.i = null;
            this.j = null;
            this.b = null;
            this.c = null;
            this.k = -1;
            this.d = null;
            this.e = null;
            this.f = -1;
            this.g = null;
        }

        public void r() {
            li2 li2Var = this.i;
            if (li2Var != null) {
                li2Var.N(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @x1
        public i s(@l2 int i) {
            li2 li2Var = this.i;
            if (li2Var != null) {
                return t(li2Var.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @x1
        public i t(@z1 CharSequence charSequence) {
            this.e = charSequence;
            E();
            return this;
        }

        @x1
        public i u(@s1 int i) {
            return v(LayoutInflater.from(this.j.getContext()).inflate(i, (ViewGroup) this.j, false));
        }

        @x1
        public i v(@z1 View view) {
            this.g = view;
            E();
            return this;
        }

        @x1
        public i w(@f1 int i) {
            li2 li2Var = this.i;
            if (li2Var != null) {
                return x(r3.b(li2Var.getContext(), i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @x1
        public i x(@z1 Drawable drawable) {
            this.c = drawable;
            li2 li2Var = this.i;
            if (li2Var.K0 == 1 || li2Var.N0 == 2) {
                li2Var.X(true);
            }
            E();
            if (ab2.a && this.j.o() && this.j.w.isVisible()) {
                this.j.invalidate();
            }
            return this;
        }

        @x1
        public i y(int i) {
            this.k = i;
            n nVar = this.j;
            if (nVar != null) {
                nVar.setId(i);
            }
            return this;
        }

        public void z(int i) {
            this.f = i;
        }
    }

    /* compiled from: TabLayout.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface j {
    }

    /* compiled from: TabLayout.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface k {
    }

    /* compiled from: TabLayout.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface l {
    }

    /* compiled from: TabLayout.java */
    /* loaded from: classes3.dex */
    public static class m implements ua0.j {
        @x1
        private final WeakReference<li2> a;
        private int b;
        private int c;

        public m(li2 li2Var) {
            this.a = new WeakReference<>(li2Var);
        }

        @Override // com.p7700g.p99005.ua0.j
        public void a(int i, float f, int i2) {
            li2 li2Var = this.a.get();
            if (li2Var != null) {
                int i3 = this.c;
                boolean z = false;
                li2Var.R(i, f, i3 != 2 || this.b == 1, (i3 == 2 && this.b == 0) ? true : true);
            }
        }

        @Override // com.p7700g.p99005.ua0.j
        public void b(int i) {
            this.b = this.c;
            this.c = i;
        }

        @Override // com.p7700g.p99005.ua0.j
        public void c(int i) {
            li2 li2Var = this.a.get();
            if (li2Var == null || li2Var.getSelectedTabPosition() == i || i >= li2Var.getTabCount()) {
                return;
            }
            int i2 = this.c;
            li2Var.O(li2Var.z(i), i2 == 0 || (i2 == 2 && this.b == 0));
        }

        public void d() {
            this.c = 0;
            this.b = 0;
        }
    }

    /* compiled from: TabLayout.java */
    /* loaded from: classes3.dex */
    public final class n extends LinearLayout {
        @z1
        private Drawable A;
        private int B;
        private i s;
        private TextView t;
        private ImageView u;
        @z1
        private View v;
        @z1
        private ya2 w;
        @z1
        private View x;
        @z1
        private TextView y;
        @z1
        private ImageView z;

        /* compiled from: TabLayout.java */
        /* loaded from: classes3.dex */
        public class a implements View.OnLayoutChangeListener {
            public final /* synthetic */ View a;

            public a(View view) {
                this.a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.a.getVisibility() == 0) {
                    n.this.w(this.a);
                }
            }
        }

        public n(@x1 Context context) {
            super(context);
            this.B = 2;
            y(context);
            sr.c2(this, li2.this.U, li2.this.V, li2.this.W, li2.this.u0);
            setGravity(17);
            setOrientation(!li2.this.O0 ? 1 : 0);
            setClickable(true);
            sr.f2(this, nr.c(getContext(), 1002));
        }

        private void A(@z1 TextView textView, @z1 ImageView imageView) {
            i iVar = this.s;
            Drawable mutate = (iVar == null || iVar.h() == null) ? null : fk.r(this.s.h()).mutate();
            if (mutate != null) {
                fk.o(mutate, li2.this.x0);
                PorterDuff.Mode mode = li2.this.B0;
                if (mode != null) {
                    fk.p(mutate, mode);
                }
            }
            i iVar2 = this.s;
            CharSequence n = iVar2 != null ? iVar2.n() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(n);
            if (textView != null) {
                if (z) {
                    textView.setText(n);
                    if (this.s.h == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int e = (z && imageView.getVisibility() == 0) ? (int) kf2.e(getContext(), 8) : 0;
                if (li2.this.O0) {
                    if (e != sq.b(marginLayoutParams)) {
                        sq.g(marginLayoutParams, e);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (e != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = e;
                    sq.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            i iVar3 = this.s;
            CharSequence charSequence = iVar3 != null ? iVar3.e : null;
            if (Build.VERSION.SDK_INT > 23) {
                if (!z) {
                    n = charSequence;
                }
                TooltipCompat.setTooltipText(this, n);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @z1
        public ya2 getBadge() {
            return this.w;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @x1
        public ya2 getOrCreateBadge() {
            if (this.w == null) {
                this.w = ya2.d(getContext());
            }
            v();
            ya2 ya2Var = this.w;
            if (ya2Var != null) {
                return ya2Var;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private void i(@z1 View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float j(@x1 Layout layout, int i, float f) {
            return (f / layout.getPaint().getTextSize()) * layout.getLineWidth(i);
        }

        private void k(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        @x1
        private FrameLayout l() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(@x1 Canvas canvas) {
            Drawable drawable = this.A;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.A.draw(canvas);
            }
        }

        @z1
        private FrameLayout n(@x1 View view) {
            if ((view == this.u || view == this.t) && ab2.a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o() {
            return this.w != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void p() {
            FrameLayout frameLayout;
            if (ab2.a) {
                frameLayout = l();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(ga2.k.H, (ViewGroup) frameLayout, false);
            this.u = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void q() {
            FrameLayout frameLayout;
            if (ab2.a) {
                frameLayout = l();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(ga2.k.I, (ViewGroup) frameLayout, false);
            this.t = textView;
            frameLayout.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r() {
            if (this.v != null) {
                u();
            }
            this.w = null;
        }

        private void t(@z1 View view) {
            if (o() && view != null) {
                k(false);
                ab2.d(this.w, view, n(view));
                this.v = view;
            }
        }

        private void u() {
            if (o()) {
                k(true);
                View view = this.v;
                if (view != null) {
                    ab2.j(this.w, view);
                    this.v = null;
                }
            }
        }

        private void v() {
            i iVar;
            i iVar2;
            if (o()) {
                if (this.x != null) {
                    u();
                } else if (this.u != null && (iVar2 = this.s) != null && iVar2.h() != null) {
                    View view = this.v;
                    ImageView imageView = this.u;
                    if (view != imageView) {
                        u();
                        t(this.u);
                        return;
                    }
                    w(imageView);
                } else if (this.t != null && (iVar = this.s) != null && iVar.l() == 1) {
                    View view2 = this.v;
                    TextView textView = this.t;
                    if (view2 != textView) {
                        u();
                        t(this.t);
                        return;
                    }
                    w(textView);
                } else {
                    u();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(@x1 View view) {
            if (o() && view == this.v) {
                ab2.m(this.w, view, n(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void y(Context context) {
            int i = li2.this.E0;
            if (i != 0) {
                Drawable b = r3.b(context, i);
                this.A = b;
                if (b != null && b.isStateful()) {
                    this.A.setState(getDrawableState());
                }
            } else {
                this.A = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (li2.this.y0 != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a2 = yg2.a(li2.this.y0);
                boolean z = li2.this.S0;
                if (z) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(a2, gradientDrawable, z ? null : gradientDrawable2);
            }
            sr.H1(this, gradientDrawable);
            li2.this.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.A;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.A.setState(drawableState);
            }
            if (z) {
                invalidate();
                li2.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.t, this.u, this.x};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        public int getContentWidth() {
            View[] viewArr = {this.t, this.u, this.x};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        @z1
        public i getTab() {
            return this.s;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@x1 AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            ya2 ya2Var = this.w;
            if (ya2Var != null && ya2Var.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.w.o()));
            }
            ls X1 = ls.X1(accessibilityNodeInfo);
            X1.Z0(ls.c.h(0, 1, this.s.k(), 1, false, isSelected()));
            if (isSelected()) {
                X1.X0(false);
                X1.K0(ls.a.f);
            }
            X1.D1(getResources().getString(ga2.m.P));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = li2.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(li2.this.F0, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.t != null) {
                float f = li2.this.C0;
                int i3 = this.B;
                ImageView imageView = this.u;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.t;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = li2.this.D0;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.t.getTextSize();
                int lineCount = this.t.getLineCount();
                int k = nt.k(this.t);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (k >= 0 && i3 != k)) {
                    if (li2.this.N0 == 1 && i4 > 0 && lineCount == 1 && ((layout = this.t.getLayout()) == null || j(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.t.setTextSize(0, f);
                        this.t.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.s != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.s.r();
                return true;
            }
            return performClick;
        }

        public void s() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.t;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.u;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.x;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@z1 i iVar) {
            if (iVar != this.s) {
                this.s = iVar;
                x();
            }
        }

        public final void x() {
            i iVar = this.s;
            View g = iVar != null ? iVar.g() : null;
            if (g != null) {
                ViewParent parent = g.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(g);
                    }
                    addView(g);
                }
                this.x = g;
                TextView textView = this.t;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.u;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.u.setImageDrawable(null);
                }
                TextView textView2 = (TextView) g.findViewById(16908308);
                this.y = textView2;
                if (textView2 != null) {
                    this.B = nt.k(textView2);
                }
                this.z = (ImageView) g.findViewById(16908294);
            } else {
                View view = this.x;
                if (view != null) {
                    removeView(view);
                    this.x = null;
                }
                this.y = null;
                this.z = null;
            }
            if (this.x == null) {
                if (this.u == null) {
                    p();
                }
                if (this.t == null) {
                    q();
                    this.B = nt.k(this.t);
                }
                nt.E(this.t, li2.this.v0);
                ColorStateList colorStateList = li2.this.w0;
                if (colorStateList != null) {
                    this.t.setTextColor(colorStateList);
                }
                A(this.t, this.u);
                v();
                i(this.u);
                i(this.t);
            } else {
                TextView textView3 = this.y;
                if (textView3 != null || this.z != null) {
                    A(textView3, this.z);
                }
            }
            if (iVar != null && !TextUtils.isEmpty(iVar.e)) {
                setContentDescription(iVar.e);
            }
            setSelected(iVar != null && iVar.o());
        }

        public final void z() {
            setOrientation(!li2.this.O0 ? 1 : 0);
            TextView textView = this.y;
            if (textView == null && this.z == null) {
                A(this.t, this.u);
            } else {
                A(textView, this.z);
            }
        }
    }

    /* compiled from: TabLayout.java */
    /* loaded from: classes3.dex */
    public static class o implements f {
        private final ua0 a;

        public o(ua0 ua0Var) {
            this.a = ua0Var;
        }

        @Override // com.p7700g.p99005.li2.c
        public void a(i iVar) {
        }

        @Override // com.p7700g.p99005.li2.c
        public void b(@x1 i iVar) {
            this.a.setCurrentItem(iVar.k());
        }

        @Override // com.p7700g.p99005.li2.c
        public void c(i iVar) {
        }
    }

    public li2(@x1 Context context) {
        this(context, null);
    }

    private boolean C() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void M(int i2) {
        n nVar = (n) this.T.getChildAt(i2);
        this.T.removeViewAt(i2);
        if (nVar != null) {
            nVar.s();
            this.e1.a(nVar);
        }
        requestLayout();
    }

    private void U(@z1 ua0 ua0Var, boolean z2, boolean z3) {
        ua0 ua0Var2 = this.Y0;
        if (ua0Var2 != null) {
            m mVar = this.b1;
            if (mVar != null) {
                ua0Var2.O(mVar);
            }
            b bVar = this.c1;
            if (bVar != null) {
                this.Y0.N(bVar);
            }
        }
        c cVar = this.W0;
        if (cVar != null) {
            I(cVar);
            this.W0 = null;
        }
        if (ua0Var != null) {
            this.Y0 = ua0Var;
            if (this.b1 == null) {
                this.b1 = new m(this);
            }
            this.b1.d();
            ua0Var.c(this.b1);
            o oVar = new o(ua0Var);
            this.W0 = oVar;
            c(oVar);
            ra0 adapter = ua0Var.getAdapter();
            if (adapter != null) {
                P(adapter, z2);
            }
            if (this.c1 == null) {
                this.c1 = new b();
            }
            this.c1.a(z2);
            ua0Var.b(this.c1);
            Q(ua0Var.getCurrentItem(), 0.0f, true);
        } else {
            this.Y0 = null;
            P(null, false);
        }
        this.d1 = z3;
    }

    private void V() {
        int size = this.R.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.R.get(i2).E();
        }
    }

    private void W(@x1 LinearLayout.LayoutParams layoutParams) {
        if (this.N0 == 1 && this.K0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    @b1(unit = 0)
    private int getDefaultHeight() {
        int size = this.R.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                i iVar = this.R.get(i2);
                if (iVar != null && iVar.h() != null && !TextUtils.isEmpty(iVar.n())) {
                    z2 = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!z2 || this.O0) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.G0;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.N0;
        if (i3 == 0 || i3 == 2) {
            return this.I0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.T.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void i(@x1 ki2 ki2Var) {
        i E2 = E();
        CharSequence charSequence = ki2Var.s;
        if (charSequence != null) {
            E2.D(charSequence);
        }
        Drawable drawable = ki2Var.t;
        if (drawable != null) {
            E2.x(drawable);
        }
        int i2 = ki2Var.u;
        if (i2 != 0) {
            E2.u(i2);
        }
        if (!TextUtils.isEmpty(ki2Var.getContentDescription())) {
            E2.t(ki2Var.getContentDescription());
        }
        e(E2);
    }

    private void j(@x1 i iVar) {
        n nVar = iVar.j;
        nVar.setSelected(false);
        nVar.setActivated(false);
        this.T.addView(nVar, iVar.k(), s());
    }

    private void k(View view) {
        if (view instanceof ki2) {
            i((ki2) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void l(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() != null && sr.T0(this) && !this.T.d()) {
            int scrollX = getScrollX();
            int o2 = o(i2, 0.0f);
            if (scrollX != o2) {
                y();
                this.X0.setIntValues(scrollX, o2);
                this.X0.start();
            }
            this.T.c(i2, this.L0);
            return;
        }
        Q(i2, 0.0f, true);
    }

    private void m(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                this.T.setGravity(1);
                return;
            } else if (i2 != 2) {
                return;
            }
        }
        this.T.setGravity(nq.b);
    }

    private void n() {
        int i2 = this.N0;
        sr.c2(this.T, (i2 == 0 || i2 == 2) ? Math.max(0, this.J0 - this.U) : 0, 0, 0, 0);
        int i3 = this.N0;
        if (i3 == 0) {
            m(this.K0);
        } else if (i3 == 1 || i3 == 2) {
            int i4 = this.K0;
            this.T.setGravity(1);
        }
        X(true);
    }

    private int o(int i2, float f2) {
        View childAt;
        int i3 = this.N0;
        if ((i3 == 0 || i3 == 2) && (childAt = this.T.getChildAt(i2)) != null) {
            int i4 = i2 + 1;
            View childAt2 = i4 < this.T.getChildCount() ? this.T.getChildAt(i4) : null;
            int width = childAt.getWidth();
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
            int i5 = (int) ((width + width2) * 0.5f * f2);
            return sr.Y(this) == 0 ? left + i5 : left - i5;
        }
        return 0;
    }

    private void q(@x1 i iVar, int i2) {
        iVar.z(i2);
        this.R.add(i2, iVar);
        int size = this.R.size();
        while (true) {
            i2++;
            if (i2 >= size) {
                return;
            }
            this.R.get(i2).z(i2);
        }
    }

    @x1
    private static ColorStateList r(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    @x1
    private LinearLayout.LayoutParams s() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        W(layoutParams);
        return layoutParams;
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.T.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.T.getChildAt(i3);
                boolean z2 = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z2 = false;
                }
                childAt.setActivated(z2);
                i3++;
            }
        }
    }

    @x1
    private n u(@x1 i iVar) {
        ip.a<n> aVar = this.e1;
        n b2 = aVar != null ? aVar.b() : null;
        if (b2 == null) {
            b2 = new n(getContext());
        }
        b2.setTab(iVar);
        b2.setFocusable(true);
        b2.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(iVar.e)) {
            b2.setContentDescription(iVar.d);
        } else {
            b2.setContentDescription(iVar.e);
        }
        return b2;
    }

    private void v(@x1 i iVar) {
        for (int size = this.V0.size() - 1; size >= 0; size--) {
            this.V0.get(size).a(iVar);
        }
    }

    private void w(@x1 i iVar) {
        for (int size = this.V0.size() - 1; size >= 0; size--) {
            this.V0.get(size).b(iVar);
        }
    }

    private void x(@x1 i iVar) {
        for (int size = this.V0.size() - 1; size >= 0; size--) {
            this.V0.get(size).c(iVar);
        }
    }

    private void y() {
        if (this.X0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.X0 = valueAnimator;
            valueAnimator.setInterpolator(ha2.b);
            this.X0.setDuration(this.L0);
            this.X0.addUpdateListener(new a());
        }
    }

    public boolean A() {
        return this.S0;
    }

    public boolean B() {
        return this.O0;
    }

    public boolean D() {
        return this.P0;
    }

    @x1
    public i E() {
        i t2 = t();
        t2.i = this;
        t2.j = u(t2);
        if (t2.k != -1) {
            t2.j.setId(t2.k);
        }
        return t2;
    }

    public void F() {
        int currentItem;
        H();
        ra0 ra0Var = this.Z0;
        if (ra0Var != null) {
            int e2 = ra0Var.e();
            for (int i2 = 0; i2 < e2; i2++) {
                h(E().D(this.Z0.g(i2)), false);
            }
            ua0 ua0Var = this.Y0;
            if (ua0Var == null || e2 <= 0 || (currentItem = ua0Var.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            N(z(currentItem));
        }
    }

    public boolean G(i iVar) {
        return A.a(iVar);
    }

    public void H() {
        for (int childCount = this.T.getChildCount() - 1; childCount >= 0; childCount--) {
            M(childCount);
        }
        Iterator<i> it = this.R.iterator();
        while (it.hasNext()) {
            i next = it.next();
            it.remove();
            next.q();
            G(next);
        }
        this.S = null;
    }

    @Deprecated
    public void I(@z1 c cVar) {
        this.V0.remove(cVar);
    }

    public void J(@x1 f fVar) {
        I(fVar);
    }

    public void K(@x1 i iVar) {
        if (iVar.i == this) {
            L(iVar.k());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void L(int i2) {
        i iVar = this.S;
        int k2 = iVar != null ? iVar.k() : 0;
        M(i2);
        i remove = this.R.remove(i2);
        if (remove != null) {
            remove.q();
            G(remove);
        }
        int size = this.R.size();
        for (int i3 = i2; i3 < size; i3++) {
            this.R.get(i3).z(i3);
        }
        if (k2 == i2) {
            N(this.R.isEmpty() ? null : this.R.get(Math.max(0, i2 - 1)));
        }
    }

    public void N(@z1 i iVar) {
        O(iVar, true);
    }

    public void O(@z1 i iVar, boolean z2) {
        i iVar2 = this.S;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                v(iVar);
                l(iVar.k());
                return;
            }
            return;
        }
        int k2 = iVar != null ? iVar.k() : -1;
        if (z2) {
            if ((iVar2 == null || iVar2.k() == -1) && k2 != -1) {
                Q(k2, 0.0f, true);
            } else {
                l(k2);
            }
            if (k2 != -1) {
                setSelectedTabView(k2);
            }
        }
        this.S = iVar;
        if (iVar2 != null) {
            x(iVar2);
        }
        if (iVar != null) {
            w(iVar);
        }
    }

    public void P(@z1 ra0 ra0Var, boolean z2) {
        DataSetObserver dataSetObserver;
        ra0 ra0Var2 = this.Z0;
        if (ra0Var2 != null && (dataSetObserver = this.a1) != null) {
            ra0Var2.u(dataSetObserver);
        }
        this.Z0 = ra0Var;
        if (z2 && ra0Var != null) {
            if (this.a1 == null) {
                this.a1 = new g();
            }
            ra0Var.m(this.a1);
        }
        F();
    }

    public void Q(int i2, float f2, boolean z2) {
        R(i2, f2, z2, true);
    }

    public void R(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(i2 + f2);
        if (round < 0 || round >= this.T.getChildCount()) {
            return;
        }
        if (z3) {
            this.T.g(i2, f2);
        }
        ValueAnimator valueAnimator = this.X0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.X0.cancel();
        }
        scrollTo(i2 < 0 ? 0 : o(i2, f2), 0);
        if (z2) {
            setSelectedTabView(round);
        }
    }

    public void S(int i2, int i3) {
        setTabTextColors(r(i2, i3));
    }

    public void T(@z1 ua0 ua0Var, boolean z2) {
        U(ua0Var, z2, false);
    }

    public void X(boolean z2) {
        for (int i2 = 0; i2 < this.T.getChildCount(); i2++) {
            View childAt = this.T.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            W((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        k(view);
    }

    @Deprecated
    public void c(@z1 c cVar) {
        if (this.V0.contains(cVar)) {
            return;
        }
        this.V0.add(cVar);
    }

    public void d(@x1 f fVar) {
        c(fVar);
    }

    public void e(@x1 i iVar) {
        h(iVar, this.R.isEmpty());
    }

    public void f(@x1 i iVar, int i2) {
        g(iVar, i2, this.R.isEmpty());
    }

    public void g(@x1 i iVar, int i2, boolean z2) {
        if (iVar.i == this) {
            q(iVar, i2);
            j(iVar);
            if (z2) {
                iVar.r();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public int getSelectedTabPosition() {
        i iVar = this.S;
        if (iVar != null) {
            return iVar.k();
        }
        return -1;
    }

    public int getTabCount() {
        return this.R.size();
    }

    public int getTabGravity() {
        return this.K0;
    }

    @z1
    public ColorStateList getTabIconTint() {
        return this.x0;
    }

    public int getTabIndicatorAnimationMode() {
        return this.R0;
    }

    public int getTabIndicatorGravity() {
        return this.M0;
    }

    public int getTabMaxWidth() {
        return this.F0;
    }

    public int getTabMode() {
        return this.N0;
    }

    @z1
    public ColorStateList getTabRippleColor() {
        return this.y0;
    }

    @x1
    public Drawable getTabSelectedIndicator() {
        return this.z0;
    }

    @z1
    public ColorStateList getTabTextColors() {
        return this.w0;
    }

    public void h(@x1 i iVar, boolean z2) {
        g(iVar, this.R.size(), z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mh2.e(this);
        if (this.Y0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ua0) {
                U((ua0) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d1) {
            setupWithViewPager(null);
            this.d1 = false;
        }
    }

    @Override // android.view.View
    public void onDraw(@x1 Canvas canvas) {
        for (int i2 = 0; i2 < this.T.getChildCount(); i2++) {
            View childAt = this.T.getChildAt(i2);
            if (childAt instanceof n) {
                ((n) childAt).m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@x1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ls.X1(accessibilityNodeInfo).Y0(ls.b.f(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return C() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        int round = Math.round(kf2.e(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i3);
        boolean z2 = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i4 = this.H0;
            if (i4 <= 0) {
                i4 = (int) (size - kf2.e(getContext(), 56));
            }
            this.F0 = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() != 1) {
            return;
        }
        View childAt = getChildAt(0);
        int i5 = this.N0;
        if (i5 != 0) {
            if (i5 != 1) {
            }
            if (z2) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || C()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void p() {
        this.V0.clear();
    }

    @Override // android.view.View
    @e2(21)
    public void setElevation(float f2) {
        super.setElevation(f2);
        mh2.d(this, f2);
    }

    public void setInlineLabel(boolean z2) {
        if (this.O0 != z2) {
            this.O0 = z2;
            for (int i2 = 0; i2 < this.T.getChildCount(); i2++) {
                View childAt = this.T.getChildAt(i2);
                if (childAt instanceof n) {
                    ((n) childAt).z();
                }
            }
            n();
        }
    }

    public void setInlineLabelResource(@s0 int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(@z1 f fVar) {
        setOnTabSelectedListener((c) fVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        y();
        this.X0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@z1 Drawable drawable) {
        if (this.z0 != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.z0 = drawable;
            int i2 = this.Q0;
            if (i2 == -1) {
                i2 = drawable.getIntrinsicHeight();
            }
            this.T.h(i2);
        }
    }

    public void setSelectedTabIndicatorColor(@w0 int i2) {
        this.A0 = i2;
        X(false);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.M0 != i2) {
            this.M0 = i2;
            sr.m1(this.T);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.Q0 = i2;
        this.T.h(i2);
    }

    public void setTabGravity(int i2) {
        if (this.K0 != i2) {
            this.K0 = i2;
            n();
        }
    }

    public void setTabIconTint(@z1 ColorStateList colorStateList) {
        if (this.x0 != colorStateList) {
            this.x0 = colorStateList;
            V();
        }
    }

    public void setTabIconTintResource(@y0 int i2) {
        setTabIconTint(r3.a(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.R0 = i2;
        if (i2 == 0) {
            this.T0 = new ji2();
        } else if (i2 == 1) {
            this.T0 = new hi2();
        } else if (i2 == 2) {
            this.T0 = new ii2();
        } else {
            throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.P0 = z2;
        this.T.f();
        sr.m1(this.T);
    }

    public void setTabMode(int i2) {
        if (i2 != this.N0) {
            this.N0 = i2;
            n();
        }
    }

    public void setTabRippleColor(@z1 ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            for (int i2 = 0; i2 < this.T.getChildCount(); i2++) {
                View childAt = this.T.getChildAt(i2);
                if (childAt instanceof n) {
                    ((n) childAt).y(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@y0 int i2) {
        setTabRippleColor(r3.a(getContext(), i2));
    }

    public void setTabTextColors(@z1 ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            this.w0 = colorStateList;
            V();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@z1 ra0 ra0Var) {
        P(ra0Var, false);
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.S0 != z2) {
            this.S0 = z2;
            for (int i2 = 0; i2 < this.T.getChildCount(); i2++) {
                View childAt = this.T.getChildAt(i2);
                if (childAt instanceof n) {
                    ((n) childAt).y(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@s0 int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(@z1 ua0 ua0Var) {
        T(ua0Var, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public i t() {
        i b2 = A.b();
        return b2 == null ? new i() : b2;
    }

    @z1
    public i z(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.R.get(i2);
    }

    public li2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.Bf);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        k(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@z1 c cVar) {
        c cVar2 = this.U0;
        if (cVar2 != null) {
            I(cVar2);
        }
        this.U0 = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public li2(@x1 Context context, @z1 AttributeSet attributeSet, int i2) {
        super(yi2.c(context, attributeSet, i2, r4), attributeSet, i2);
        int i3 = s;
        this.R = new ArrayList<>();
        this.z0 = new GradientDrawable();
        this.A0 = 0;
        this.F0 = Integer.MAX_VALUE;
        this.Q0 = -1;
        this.V0 = new ArrayList<>();
        this.e1 = new ip.b(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        h hVar = new h(context2);
        this.T = hVar;
        super.addView(hVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = ga2.o.Us;
        int i4 = ga2.o.st;
        TypedArray j2 = cf2.j(context2, attributeSet, iArr, i2, i3, i4);
        if (getBackground() instanceof ColorDrawable) {
            lh2 lh2Var = new lh2();
            lh2Var.o0(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            lh2Var.Z(context2);
            lh2Var.n0(sr.Q(this));
            sr.H1(this, lh2Var);
        }
        setSelectedTabIndicator(sg2.e(context2, j2, ga2.o.at));
        setSelectedTabIndicatorColor(j2.getColor(ga2.o.dt, 0));
        hVar.h(j2.getDimensionPixelSize(ga2.o.gt, -1));
        setSelectedTabIndicatorGravity(j2.getInt(ga2.o.ft, 0));
        setTabIndicatorAnimationMode(j2.getInt(ga2.o.ct, 0));
        setTabIndicatorFullWidth(j2.getBoolean(ga2.o.et, true));
        int dimensionPixelSize = j2.getDimensionPixelSize(ga2.o.lt, 0);
        this.u0 = dimensionPixelSize;
        this.W = dimensionPixelSize;
        this.V = dimensionPixelSize;
        this.U = dimensionPixelSize;
        this.U = j2.getDimensionPixelSize(ga2.o.ot, dimensionPixelSize);
        this.V = j2.getDimensionPixelSize(ga2.o.pt, this.V);
        this.W = j2.getDimensionPixelSize(ga2.o.nt, this.W);
        this.u0 = j2.getDimensionPixelSize(ga2.o.mt, this.u0);
        int resourceId = j2.getResourceId(i4, ga2.n.F7);
        this.v0 = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, x2.m.O5);
        try {
            this.C0 = obtainStyledAttributes.getDimensionPixelSize(x2.m.P5, 0);
            this.w0 = sg2.a(context2, obtainStyledAttributes, x2.m.S5);
            obtainStyledAttributes.recycle();
            int i5 = ga2.o.tt;
            if (j2.hasValue(i5)) {
                this.w0 = sg2.a(context2, j2, i5);
            }
            int i6 = ga2.o.rt;
            if (j2.hasValue(i6)) {
                this.w0 = r(this.w0.getDefaultColor(), j2.getColor(i6, 0));
            }
            this.x0 = sg2.a(context2, j2, ga2.o.Ys);
            this.B0 = kf2.l(j2.getInt(ga2.o.Zs, -1), null);
            this.y0 = sg2.a(context2, j2, ga2.o.qt);
            this.L0 = j2.getInt(ga2.o.bt, z);
            this.G0 = j2.getDimensionPixelSize(ga2.o.jt, -1);
            this.H0 = j2.getDimensionPixelSize(ga2.o.it, -1);
            this.E0 = j2.getResourceId(ga2.o.Vs, 0);
            this.J0 = j2.getDimensionPixelSize(ga2.o.Ws, 0);
            this.N0 = j2.getInt(ga2.o.kt, 1);
            this.K0 = j2.getInt(ga2.o.Xs, 0);
            this.O0 = j2.getBoolean(ga2.o.ht, false);
            this.S0 = j2.getBoolean(ga2.o.ut, false);
            j2.recycle();
            Resources resources = getResources();
            this.D0 = resources.getDimensionPixelSize(ga2.f.J1);
            this.I0 = resources.getDimensionPixelSize(ga2.f.H1);
            n();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        k(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        k(view);
    }

    public void setSelectedTabIndicator(@f1 int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(r3.b(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}