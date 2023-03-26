package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.p7700g.p99005.b1;
import com.p7700g.p99005.di2;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.l2;
import com.p7700g.p99005.w0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes3.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] J;
    private static final int[] K;
    @z1
    private final AccessibilityManager L;
    private boolean M;
    @z1
    private BaseTransientBottomBar.s<Snackbar> N;

    @i2({i2.a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.w {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@z1 Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@z1 Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@z1 ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@z1 PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@z1 View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ View.OnClickListener s;

        public a(View.OnClickListener onClickListener) {
            this.s = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.s.onClick(view);
            Snackbar.this.u(1);
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends BaseTransientBottomBar.s<Snackbar> {
        public static final int f = 0;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;
        public static final int j = 4;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* renamed from: c */
        public void a(Snackbar snackbar, int i2) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* renamed from: d */
        public void b(Snackbar snackbar) {
        }
    }

    static {
        int i = ga2.c.je;
        J = new int[]{i};
        K = new int[]{i, ga2.c.le};
    }

    private Snackbar(@x1 Context context, @x1 ViewGroup viewGroup, @x1 View view, @x1 di2 di2Var) {
        super(context, viewGroup, view, di2Var);
        this.L = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @z1
    private static ViewGroup o0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button p0() {
        return q0().getActionView();
    }

    private SnackbarContentLayout q0() {
        return (SnackbarContentLayout) this.s.getChildAt(0);
    }

    private TextView r0() {
        return q0().getMessageView();
    }

    @Deprecated
    public static boolean s0(@x1 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(J);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    private static boolean t0(@x1 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(K);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    @x1
    public static Snackbar u0(@x1 Context context, @x1 View view, @x1 CharSequence charSequence, int i) {
        return x0(context, view, charSequence, i);
    }

    @x1
    public static Snackbar v0(@x1 View view, @l2 int i, int i2) {
        return w0(view, view.getResources().getText(i), i2);
    }

    @x1
    public static Snackbar w0(@x1 View view, @x1 CharSequence charSequence, int i) {
        return x0(null, view, charSequence, i);
    }

    @x1
    private static Snackbar x0(@z1 Context context, @x1 View view, @x1 CharSequence charSequence, int i) {
        int i2;
        ViewGroup o0 = o0(view);
        if (o0 != null) {
            if (context == null) {
                context = o0.getContext();
            }
            LayoutInflater from = LayoutInflater.from(context);
            if (t0(context)) {
                i2 = ga2.k.C0;
            } else {
                i2 = ga2.k.G;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, o0, false);
            Snackbar snackbar = new Snackbar(context, o0, snackbarContentLayout, snackbarContentLayout);
            snackbar.I0(charSequence);
            snackbar.b0(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int A() {
        int A = super.A();
        if (A == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.L.getRecommendedTimeoutMillis(A, (this.M ? 4 : 0) | 1 | 2);
        } else if (this.M && this.L.isTouchExplorationEnabled()) {
            return -2;
        } else {
            return A;
        }
    }

    @x1
    public Snackbar A0(@w0 int i) {
        p0().setTextColor(i);
        return this;
    }

    @x1
    public Snackbar B0(ColorStateList colorStateList) {
        p0().setTextColor(colorStateList);
        return this;
    }

    @x1
    public Snackbar C0(@w0 int i) {
        return D0(ColorStateList.valueOf(i));
    }

    @x1
    public Snackbar D0(@z1 ColorStateList colorStateList) {
        this.s.setBackgroundTintList(colorStateList);
        return this;
    }

    @x1
    public Snackbar E0(@z1 PorterDuff.Mode mode) {
        this.s.setBackgroundTintMode(mode);
        return this;
    }

    @x1
    @Deprecated
    public Snackbar F0(@z1 b bVar) {
        BaseTransientBottomBar.s<Snackbar> sVar = this.N;
        if (sVar != null) {
            V(sVar);
        }
        if (bVar != null) {
            p(bVar);
        }
        this.N = bVar;
        return this;
    }

    @x1
    public Snackbar G0(@b1 int i) {
        q0().setMaxInlineActionWidth(i);
        return this;
    }

    @x1
    public Snackbar H0(@l2 int i) {
        return I0(z().getText(i));
    }

    @x1
    public Snackbar I0(@x1 CharSequence charSequence) {
        r0().setText(charSequence);
        return this;
    }

    @x1
    public Snackbar J0(@w0 int i) {
        r0().setTextColor(i);
        return this;
    }

    @x1
    public Snackbar K0(ColorStateList colorStateList) {
        r0().setTextColor(colorStateList);
        return this;
    }

    @x1
    public Snackbar L0(int i) {
        r0().setMaxLines(i);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean M() {
        return super.M();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void g0() {
        super.g0();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void t() {
        super.t();
    }

    @x1
    public Snackbar y0(@l2 int i, View.OnClickListener onClickListener) {
        return z0(z().getText(i), onClickListener);
    }

    @x1
    public Snackbar z0(@z1 CharSequence charSequence, @z1 View.OnClickListener onClickListener) {
        Button p0 = p0();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.M = true;
            p0.setVisibility(0);
            p0.setText(charSequence);
            p0.setOnClickListener(new a(onClickListener));
        } else {
            p0.setVisibility(8);
            p0.setOnClickListener(null);
            this.M = false;
        }
        return this;
    }
}