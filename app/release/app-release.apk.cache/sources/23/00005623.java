package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.TooltipCompat;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.x4;

/* compiled from: NavigationBarItemView.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class pf2 extends FrameLayout implements x4.a {
    private static final int s = -1;
    private static final int[] t = {16842912};
    private static final d u = new d(null);
    private static final d v = new e(null);
    private float A;
    private float B;
    private int C;
    private boolean D;
    @z1
    private final FrameLayout E;
    @z1
    private final View F;
    private final ImageView G;
    private final ViewGroup H;
    private final TextView I;
    private final TextView J;
    private int K;
    @z1
    private s4 L;
    @z1
    private ColorStateList M;
    @z1
    private Drawable N;
    @z1
    private Drawable O;
    private ValueAnimator P;
    private d Q;
    private float R;
    private boolean S;
    private int T;
    private int U;
    private boolean V;
    private int W;
    @z1
    private ya2 u0;
    private boolean w;
    private int x;
    private int y;
    private float z;

    /* compiled from: NavigationBarItemView.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (pf2.this.G.getVisibility() == 0) {
                pf2 pf2Var = pf2.this;
                pf2Var.w(pf2Var.G);
            }
        }
    }

    /* compiled from: NavigationBarItemView.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public final /* synthetic */ int s;

        public b(int i) {
            this.s = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            pf2.this.x(this.s);
        }
    }

    /* compiled from: NavigationBarItemView.java */
    /* loaded from: classes3.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float s;

        public c(float f) {
            this.s = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            pf2.this.q(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.s);
        }
    }

    /* compiled from: NavigationBarItemView.java */
    /* loaded from: classes3.dex */
    public static class d {
        private static final float a = 0.4f;
        private static final float b = 1.0f;
        private static final float c = 0.2f;

        private d() {
        }

        public float a(@g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 1.0d) float f2) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            return ha2.b(0.0f, 1.0f, i == 0 ? 0.8f : 0.0f, i == 0 ? 1.0f : 0.2f, f);
        }

        public float b(@g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 1.0d) float f2) {
            return ha2.a(0.4f, 1.0f, f);
        }

        public float c(@g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 1.0d) float f2) {
            return 1.0f;
        }

        public void d(@g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 1.0d) float f2, @x1 View view) {
            view.setScaleX(b(f, f2));
            view.setScaleY(c(f, f2));
            view.setAlpha(a(f, f2));
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: NavigationBarItemView.java */
    /* loaded from: classes3.dex */
    public static class e extends d {
        private e() {
            super(null);
        }

        @Override // com.p7700g.p99005.pf2.d
        public float c(float f, float f2) {
            return b(f, f2);
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    public pf2(@x1 Context context) {
        super(context);
        this.w = false;
        this.K = -1;
        this.Q = u;
        this.R = 0.0f;
        this.S = false;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.E = (FrameLayout) findViewById(ga2.h.E3);
        this.F = findViewById(ga2.h.D3);
        ImageView imageView = (ImageView) findViewById(ga2.h.F3);
        this.G = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(ga2.h.G3);
        this.H = viewGroup;
        TextView textView = (TextView) findViewById(ga2.h.I3);
        this.I = textView;
        TextView textView2 = (TextView) findViewById(ga2.h.H3);
        this.J = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.x = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.y = viewGroup.getPaddingBottom();
        sr.Q1(textView, 2);
        sr.Q1(textView2, 2);
        setFocusable(true);
        i(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.E;
        return frameLayout != null ? frameLayout : this.G;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof pf2) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        ya2 ya2Var = this.u0;
        int minimumHeight = ya2Var != null ? ya2Var.getMinimumHeight() / 2 : 0;
        return this.G.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        ya2 ya2Var = this.u0;
        int minimumWidth = ya2Var == null ? 0 : ya2Var.getMinimumWidth() - this.u0.q();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.G.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    private void i(float f, float f2) {
        this.z = f - f2;
        this.A = (f2 * 1.0f) / f;
        this.B = (f * 1.0f) / f2;
    }

    @z1
    private FrameLayout k(View view) {
        ImageView imageView = this.G;
        if (view == imageView && ab2.a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private boolean l() {
        return this.u0 != null;
    }

    private boolean m() {
        return this.V && this.C == 2;
    }

    private void n(@g1(from = 0.0d, to = 1.0d) float f) {
        if (this.S && this.w && sr.N0(this)) {
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.P = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, f);
            this.P = ofFloat;
            ofFloat.addUpdateListener(new c(f));
            this.P.setInterpolator(of2.e(getContext(), ga2.c.Wb, ha2.b));
            this.P.setDuration(of2.d(getContext(), ga2.c.Mb, getResources().getInteger(ga2.i.F)));
            this.P.start();
            return;
        }
        q(f, f);
    }

    private void o() {
        s4 s4Var = this.L;
        if (s4Var != null) {
            setChecked(s4Var.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(@g1(from = 0.0d, to = 1.0d) float f, float f2) {
        View view = this.F;
        if (view != null) {
            this.Q.d(f, f2, view);
        }
        this.R = f;
    }

    private static void r(TextView textView, @m2 int i) {
        nt.E(textView, i);
        int h = sg2.h(textView.getContext(), i, 0);
        if (h != 0) {
            textView.setTextSize(0, h);
        }
    }

    private static void s(@x1 View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private static void t(@x1 View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private void u(@z1 View view) {
        if (l() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            ab2.d(this.u0, view, k(view));
        }
    }

    private void v(@z1 View view) {
        if (l()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ab2.j(this.u0, view);
            }
            this.u0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(View view) {
        if (l()) {
            ab2.m(this.u0, view, k(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(int i) {
        if (this.F == null) {
            return;
        }
        int min = Math.min(this.T, i - (this.W * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
        layoutParams.height = m() ? min : this.U;
        layoutParams.width = min;
        this.F.setLayoutParams(layoutParams);
    }

    private void y() {
        if (m()) {
            this.Q = v;
        } else {
            this.Q = u;
        }
    }

    private static void z(@x1 View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // com.p7700g.p99005.x4.a
    public void a(boolean z, char c2) {
    }

    @Override // com.p7700g.p99005.x4.a
    public boolean b() {
        return false;
    }

    @Override // com.p7700g.p99005.x4.a
    public boolean c() {
        return true;
    }

    @Override // com.p7700g.p99005.x4.a
    public void d(@x1 s4 s4Var, int i) {
        CharSequence title;
        this.L = s4Var;
        setCheckable(s4Var.isCheckable());
        setChecked(s4Var.isChecked());
        setEnabled(s4Var.isEnabled());
        setIcon(s4Var.getIcon());
        setTitle(s4Var.getTitle());
        setId(s4Var.getItemId());
        if (!TextUtils.isEmpty(s4Var.getContentDescription())) {
            setContentDescription(s4Var.getContentDescription());
        }
        if (!TextUtils.isEmpty(s4Var.getTooltipText())) {
            title = s4Var.getTooltipText();
        } else {
            title = s4Var.getTitle();
        }
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, title);
        }
        setVisibility(s4Var.isVisible() ? 0 : 8);
        this.w = true;
    }

    @z1
    public Drawable getActiveIndicatorDrawable() {
        View view = this.F;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @z1
    public ya2 getBadge() {
        return this.u0;
    }

    @f1
    public int getItemBackgroundResId() {
        return ga2.g.s1;
    }

    @Override // com.p7700g.p99005.x4.a
    @z1
    public s4 getItemData() {
        return this.L;
    }

    @a1
    public int getItemDefaultMarginResId() {
        return ga2.f.p8;
    }

    @s1
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.K;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.H.getLayoutParams();
        return this.H.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.H.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.H.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public void j() {
        p();
        this.L = null;
        this.R = 0.0f;
        this.w = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @x1
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        s4 s4Var = this.L;
        if (s4Var != null && s4Var.isCheckable() && this.L.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, t);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@x1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ya2 ya2Var = this.u0;
        if (ya2Var != null && ya2Var.isVisible()) {
            CharSequence title = this.L.getTitle();
            if (!TextUtils.isEmpty(this.L.getContentDescription())) {
                title = this.L.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.u0.o()));
        }
        ls X1 = ls.X1(accessibilityNodeInfo);
        X1.Z0(ls.c.h(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            X1.X0(false);
            X1.K0(ls.a.f);
        }
        X1.D1(getResources().getString(ga2.m.P));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new b(i));
    }

    public void p() {
        v(this.G);
    }

    public void setActiveIndicatorDrawable(@z1 Drawable drawable) {
        View view = this.F;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.S = z;
        View view = this.F;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.U = i;
        x(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@c2 int i) {
        this.W = i;
        x(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.V = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.T = i;
        x(getWidth());
    }

    public void setBadge(@x1 ya2 ya2Var) {
        if (this.u0 == ya2Var) {
            return;
        }
        if (l() && this.G != null) {
            v(this.G);
        }
        this.u0 = ya2Var;
        ImageView imageView = this.G;
        if (imageView != null) {
            u(imageView);
        }
    }

    @Override // com.p7700g.p99005.x4.a
    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    @Override // com.p7700g.p99005.x4.a
    public void setChecked(boolean z) {
        TextView textView = this.J;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.J;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.I;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.I;
        textView4.setPivotY(textView4.getBaseline());
        n(z ? 1.0f : 0.0f);
        int i = this.C;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    t(getIconOrContainer(), this.x, 49);
                    z(this.H, this.y);
                    this.J.setVisibility(0);
                } else {
                    t(getIconOrContainer(), this.x, 17);
                    z(this.H, 0);
                    this.J.setVisibility(4);
                }
                this.I.setVisibility(4);
            } else if (i == 1) {
                z(this.H, this.y);
                if (z) {
                    t(getIconOrContainer(), (int) (this.x + this.z), 49);
                    s(this.J, 1.0f, 1.0f, 0);
                    TextView textView5 = this.I;
                    float f = this.A;
                    s(textView5, f, f, 4);
                } else {
                    t(getIconOrContainer(), this.x, 49);
                    TextView textView6 = this.J;
                    float f2 = this.B;
                    s(textView6, f2, f2, 4);
                    s(this.I, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                t(getIconOrContainer(), this.x, 17);
                this.J.setVisibility(8);
                this.I.setVisibility(8);
            }
        } else if (this.D) {
            if (z) {
                t(getIconOrContainer(), this.x, 49);
                z(this.H, this.y);
                this.J.setVisibility(0);
            } else {
                t(getIconOrContainer(), this.x, 17);
                z(this.H, 0);
                this.J.setVisibility(4);
            }
            this.I.setVisibility(4);
        } else {
            z(this.H, this.y);
            if (z) {
                t(getIconOrContainer(), (int) (this.x + this.z), 49);
                s(this.J, 1.0f, 1.0f, 0);
                TextView textView7 = this.I;
                float f3 = this.A;
                s(textView7, f3, f3, 4);
            } else {
                t(getIconOrContainer(), this.x, 49);
                TextView textView8 = this.J;
                float f4 = this.B;
                s(textView8, f4, f4, 4);
                s(this.I, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View, com.p7700g.p99005.x4.a
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.I.setEnabled(z);
        this.J.setEnabled(z);
        this.G.setEnabled(z);
        if (z) {
            sr.f2(this, nr.c(getContext(), 1002));
        } else {
            sr.f2(this, null);
        }
    }

    @Override // com.p7700g.p99005.x4.a
    public void setIcon(@z1 Drawable drawable) {
        if (drawable == this.N) {
            return;
        }
        this.N = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = fk.r(drawable).mutate();
            this.O = drawable;
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                fk.o(drawable, colorStateList);
            }
        }
        this.G.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.G.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@z1 ColorStateList colorStateList) {
        Drawable drawable;
        this.M = colorStateList;
        if (this.L == null || (drawable = this.O) == null) {
            return;
        }
        fk.o(drawable, colorStateList);
        this.O.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : gh.i(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.y != i) {
            this.y = i;
            o();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.x != i) {
            this.x = i;
            o();
        }
    }

    public void setItemPosition(int i) {
        this.K = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.C != i) {
            this.C = i;
            y();
            x(getWidth());
            o();
        }
    }

    public void setShifting(boolean z) {
        if (this.D != z) {
            this.D = z;
            o();
        }
    }

    public void setTextAppearanceActive(@m2 int i) {
        r(this.J, i);
        i(this.I.getTextSize(), this.J.getTextSize());
    }

    public void setTextAppearanceInactive(@m2 int i) {
        r(this.I, i);
        i(this.I.getTextSize(), this.J.getTextSize());
    }

    public void setTextColor(@z1 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.I.setTextColor(colorStateList);
            this.J.setTextColor(colorStateList);
        }
    }

    @Override // com.p7700g.p99005.x4.a
    public void setTitle(@z1 CharSequence charSequence) {
        this.I.setText(charSequence);
        this.J.setText(charSequence);
        s4 s4Var = this.L;
        if (s4Var == null || TextUtils.isEmpty(s4Var.getContentDescription())) {
            setContentDescription(charSequence);
        }
        s4 s4Var2 = this.L;
        if (s4Var2 != null && !TextUtils.isEmpty(s4Var2.getTooltipText())) {
            charSequence = this.L.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, charSequence);
        }
    }

    public void setItemBackground(@z1 Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        sr.H1(this, drawable);
    }
}