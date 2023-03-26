package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.p7700g.p99005.ga2;
import java.util.ArrayList;

/* compiled from: FloatingActionButtonImplLollipop.java */
@e2(21)
/* loaded from: classes3.dex */
public class de2 extends ce2 {

    /* compiled from: FloatingActionButtonImplLollipop.java */
    /* loaded from: classes3.dex */
    public static class a extends lh2 {
        public a(qh2 qh2Var) {
            super(qh2Var);
        }

        @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public de2(FloatingActionButton floatingActionButton, bh2 bh2Var) {
        super(floatingActionButton, bh2Var);
    }

    @x1
    private Animator m0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.R, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.R, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(ce2.a);
        return animatorSet;
    }

    @Override // com.p7700g.p99005.ce2
    public void A() {
    }

    @Override // com.p7700g.p99005.ce2
    public void C() {
        i0();
    }

    @Override // com.p7700g.p99005.ce2
    public void E(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.R.isEnabled()) {
                this.R.setElevation(this.C);
                if (this.R.isPressed()) {
                    this.R.setTranslationZ(this.E);
                    return;
                } else if (!this.R.isFocused() && !this.R.isHovered()) {
                    this.R.setTranslationZ(0.0f);
                    return;
                } else {
                    this.R.setTranslationZ(this.D);
                    return;
                }
            }
            this.R.setElevation(0.0f);
            this.R.setTranslationZ(0.0f);
        }
    }

    @Override // com.p7700g.p99005.ce2
    public void F(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.R.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(ce2.p, m0(f, f3));
            stateListAnimator.addState(ce2.q, m0(f, f2));
            stateListAnimator.addState(ce2.r, m0(f, f2));
            stateListAnimator.addState(ce2.s, m0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.R, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.R;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.R, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(ce2.a);
            stateListAnimator.addState(ce2.t, animatorSet);
            stateListAnimator.addState(ce2.u, m0(0.0f, 0.0f));
            this.R.setStateListAnimator(stateListAnimator);
        }
        if (c0()) {
            i0();
        }
    }

    @Override // com.p7700g.p99005.ce2
    public boolean N() {
        return false;
    }

    @Override // com.p7700g.p99005.ce2
    public void Y(@z1 ColorStateList colorStateList) {
        Drawable drawable = this.x;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(yg2.d(colorStateList));
        } else {
            super.Y(colorStateList);
        }
    }

    @Override // com.p7700g.p99005.ce2
    public boolean c0() {
        return this.S.b() || !e0();
    }

    @Override // com.p7700g.p99005.ce2
    public void g0() {
    }

    @Override // com.p7700g.p99005.ce2
    @x1
    public lh2 l() {
        return new a((qh2) jp.l(this.v));
    }

    @x1
    public be2 l0(int i, ColorStateList colorStateList) {
        Context context = this.R.getContext();
        be2 be2Var = new be2((qh2) jp.l(this.v));
        be2Var.f(gh.f(context, ga2.e.D0), gh.f(context, ga2.e.C0), gh.f(context, ga2.e.A0), gh.f(context, ga2.e.B0));
        be2Var.e(i);
        be2Var.d(colorStateList);
        return be2Var;
    }

    @Override // com.p7700g.p99005.ce2
    public float n() {
        return this.R.getElevation();
    }

    @Override // com.p7700g.p99005.ce2
    public void s(@x1 Rect rect) {
        if (this.S.b()) {
            super.s(rect);
        } else if (!e0()) {
            int sizeDimension = (this.F - this.R.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // com.p7700g.p99005.ce2
    public void x(ColorStateList colorStateList, @z1 PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        lh2 l = l();
        this.w = l;
        l.setTintList(colorStateList);
        if (mode != null) {
            this.w.setTintMode(mode);
        }
        this.w.Z(this.R.getContext());
        if (i > 0) {
            this.y = l0(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) jp.l(this.y), (Drawable) jp.l(this.w)});
        } else {
            this.y = null;
            drawable = this.w;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(yg2.d(colorStateList2), drawable, null);
        this.x = rippleDrawable;
        this.z = rippleDrawable;
    }
}