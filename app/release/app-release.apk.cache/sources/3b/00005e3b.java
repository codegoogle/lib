package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.p7700g.p99005.ga2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IndicatorViewController.java */
/* loaded from: classes3.dex */
public final class ti2 {
    private static final int a = 217;
    private static final int b = 167;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private int A;
    @z1
    private ColorStateList B;
    private Typeface C;
    private final Context i;
    @x1
    private final TextInputLayout j;
    private LinearLayout k;
    private int l;
    private FrameLayout m;
    @z1
    private Animator n;
    private final float o;
    private int p;
    private int q;
    @z1
    private CharSequence r;
    private boolean s;
    @z1
    private TextView t;
    @z1
    private CharSequence u;
    private int v;
    @z1
    private ColorStateList w;
    private CharSequence x;
    private boolean y;
    @z1
    private TextView z;

    /* compiled from: IndicatorViewController.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int s;
        public final /* synthetic */ TextView t;
        public final /* synthetic */ int u;
        public final /* synthetic */ TextView v;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.s = i;
            this.t = textView;
            this.u = i2;
            this.v = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ti2.this.p = this.s;
            ti2.this.n = null;
            TextView textView = this.t;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.u == 1 && ti2.this.t != null) {
                    ti2.this.t.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.v;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.v.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.v;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* compiled from: IndicatorViewController.java */
    /* loaded from: classes3.dex */
    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = ti2.this.j.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public ti2(@x1 TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.i = context;
        this.j = textInputLayout;
        this.o = context.getResources().getDimensionPixelSize(ga2.f.K1);
    }

    private boolean B(int i) {
        return (i != 1 || this.t == null || TextUtils.isEmpty(this.r)) ? false : true;
    }

    private boolean C(int i) {
        return (i != 2 || this.z == null || TextUtils.isEmpty(this.x)) ? false : true;
    }

    private void H(int i, int i2) {
        TextView n;
        TextView n2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (n2 = n(i2)) != null) {
            n2.setVisibility(0);
            n2.setAlpha(1.0f);
        }
        if (i != 0 && (n = n(i)) != null) {
            n.setVisibility(4);
            if (i == 1) {
                n.setText((CharSequence) null);
            }
        }
        this.p = i2;
    }

    private void P(@z1 TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void R(@x1 ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean S(@z1 TextView textView, @x1 CharSequence charSequence) {
        return sr.T0(this.j) && this.j.isEnabled() && !(this.q == this.p && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void V(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.n = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.y, this.z, 2, i, i2);
            i(arrayList, this.s, this.t, 1, i, i2);
            ia2.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, n(i), i, n(i2)));
            animatorSet.start();
        } else {
            H(i, i2);
        }
        this.j.I0();
        this.j.N0(z);
        this.j.V0();
    }

    private boolean g() {
        return (this.k == null || this.j.getEditText() == null) ? false : true;
    }

    private void i(@x1 List<Animator> list, boolean z, @z1 TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            list.add(j(textView, i3 == i));
            if (i3 == i) {
                list.add(k(textView));
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(ha2.a);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.o, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(ha2.d);
        return ofFloat;
    }

    @z1
    private TextView n(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.z;
        }
        return this.t;
    }

    private int w(boolean z, @a1 int i, int i2) {
        return z ? this.i.getResources().getDimensionPixelSize(i) : i2;
    }

    public void A() {
        h();
        int i = this.p;
        if (i == 2) {
            this.q = 0;
        }
        V(i, this.q, S(this.z, ""));
    }

    public boolean D(int i) {
        return i == 0 || i == 1;
    }

    public boolean E() {
        return this.s;
    }

    public boolean F() {
        return this.y;
    }

    public void G(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.k == null) {
            return;
        }
        if (D(i) && (frameLayout = this.m) != null) {
            frameLayout.removeView(textView);
        } else {
            this.k.removeView(textView);
        }
        int i2 = this.l - 1;
        this.l = i2;
        R(this.k, i2);
    }

    public void I(@z1 CharSequence charSequence) {
        this.u = charSequence;
        TextView textView = this.t;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void J(boolean z) {
        if (this.s == z) {
            return;
        }
        h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.i);
            this.t = appCompatTextView;
            appCompatTextView.setId(ga2.h.M5);
            this.t.setTextAlignment(5);
            Typeface typeface = this.C;
            if (typeface != null) {
                this.t.setTypeface(typeface);
            }
            K(this.v);
            L(this.w);
            I(this.u);
            this.t.setVisibility(4);
            sr.C1(this.t, 1);
            e(this.t, 0);
        } else {
            z();
            G(this.t, 0);
            this.t = null;
            this.j.I0();
            this.j.V0();
        }
        this.s = z;
    }

    public void K(@m2 int i) {
        this.v = i;
        TextView textView = this.t;
        if (textView != null) {
            this.j.u0(textView, i);
        }
    }

    public void L(@z1 ColorStateList colorStateList) {
        this.w = colorStateList;
        TextView textView = this.t;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void M(@m2 int i) {
        this.A = i;
        TextView textView = this.z;
        if (textView != null) {
            nt.E(textView, i);
        }
    }

    public void N(boolean z) {
        if (this.y == z) {
            return;
        }
        h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.i);
            this.z = appCompatTextView;
            appCompatTextView.setId(ga2.h.N5);
            this.z.setTextAlignment(5);
            Typeface typeface = this.C;
            if (typeface != null) {
                this.z.setTypeface(typeface);
            }
            this.z.setVisibility(4);
            sr.C1(this.z, 1);
            M(this.A);
            O(this.B);
            e(this.z, 1);
            this.z.setAccessibilityDelegate(new b());
        } else {
            A();
            G(this.z, 1);
            this.z = null;
            this.j.I0();
            this.j.V0();
        }
        this.y = z;
    }

    public void O(@z1 ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.z;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void Q(Typeface typeface) {
        if (typeface != this.C) {
            this.C = typeface;
            P(this.t, typeface);
            P(this.z, typeface);
        }
    }

    public void T(CharSequence charSequence) {
        h();
        this.r = charSequence;
        this.t.setText(charSequence);
        int i = this.p;
        if (i != 1) {
            this.q = 1;
        }
        V(i, this.q, S(this.t, charSequence));
    }

    public void U(CharSequence charSequence) {
        h();
        this.x = charSequence;
        this.z.setText(charSequence);
        int i = this.p;
        if (i != 2) {
            this.q = 2;
        }
        V(i, this.q, S(this.z, charSequence));
    }

    public void e(TextView textView, int i) {
        if (this.k == null && this.m == null) {
            LinearLayout linearLayout = new LinearLayout(this.i);
            this.k = linearLayout;
            linearLayout.setOrientation(0);
            this.j.addView(this.k, -1, -2);
            this.m = new FrameLayout(this.i);
            this.k.addView(this.m, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.j.getEditText() != null) {
                f();
            }
        }
        if (D(i)) {
            this.m.setVisibility(0);
            this.m.addView(textView);
        } else {
            this.k.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.k.setVisibility(0);
        this.l++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.j.getEditText();
            boolean i = sg2.i(this.i);
            LinearLayout linearLayout = this.k;
            int i2 = ga2.f.E5;
            sr.c2(linearLayout, w(i, i2, sr.j0(editText)), w(i, ga2.f.F5, this.i.getResources().getDimensionPixelSize(ga2.f.D5)), w(i, i2, sr.i0(editText)), 0);
        }
    }

    public void h() {
        Animator animator = this.n;
        if (animator != null) {
            animator.cancel();
        }
    }

    public boolean l() {
        return B(this.p);
    }

    public boolean m() {
        return B(this.q);
    }

    @z1
    public CharSequence o() {
        return this.u;
    }

    @z1
    public CharSequence p() {
        return this.r;
    }

    @w0
    public int q() {
        TextView textView = this.t;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @z1
    public ColorStateList r() {
        TextView textView = this.t;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence s() {
        return this.x;
    }

    @z1
    public View t() {
        return this.z;
    }

    @z1
    public ColorStateList u() {
        TextView textView = this.z;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @w0
    public int v() {
        TextView textView = this.z;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public boolean x() {
        return C(this.p);
    }

    public boolean y() {
        return C(this.q);
    }

    public void z() {
        this.r = null;
        h();
        if (this.p == 1) {
            if (this.y && !TextUtils.isEmpty(this.x)) {
                this.q = 2;
            } else {
                this.q = 0;
            }
        }
        V(this.p, this.q, S(this.t, ""));
    }
}