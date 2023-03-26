package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseMotionStrategy.java */
/* loaded from: classes3.dex */
public abstract class ae2 implements ee2 {
    private final Context a;
    @x1
    private final ExtendedFloatingActionButton b;
    private final ArrayList<Animator.AnimatorListener> c = new ArrayList<>();
    private final zd2 d;
    @z1
    private oa2 e;
    @z1
    private oa2 f;

    /* compiled from: BaseMotionStrategy.java */
    /* loaded from: classes3.dex */
    public class a extends Property<ExtendedFloatingActionButton, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(ha2.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.H0.getColorForState(extendedFloatingActionButton.getDrawableState(), ae2.this.b.H0.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.H0.getColorForState(extendedFloatingActionButton.getDrawableState(), ae2.this.b.H0.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (ha2.a(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.V(extendedFloatingActionButton.H0);
            } else {
                extendedFloatingActionButton.V(valueOf);
            }
        }
    }

    public ae2(@x1 ExtendedFloatingActionButton extendedFloatingActionButton, zd2 zd2Var) {
        this.b = extendedFloatingActionButton;
        this.a = extendedFloatingActionButton.getContext();
        this.d = zd2Var;
    }

    @Override // com.p7700g.p99005.ee2
    @t0
    public void a() {
        this.d.b();
    }

    @Override // com.p7700g.p99005.ee2
    public final oa2 b() {
        oa2 oa2Var = this.f;
        if (oa2Var != null) {
            return oa2Var;
        }
        if (this.e == null) {
            this.e = oa2.d(this.a, c());
        }
        return (oa2) jp.l(this.e);
    }

    @Override // com.p7700g.p99005.ee2
    @z1
    public oa2 e() {
        return this.f;
    }

    @Override // com.p7700g.p99005.ee2
    public final void g(@x1 Animator.AnimatorListener animatorListener) {
        this.c.remove(animatorListener);
    }

    @Override // com.p7700g.p99005.ee2
    public final void h(@x1 Animator.AnimatorListener animatorListener) {
        this.c.add(animatorListener);
    }

    @Override // com.p7700g.p99005.ee2
    @t0
    public void i() {
        this.d.b();
    }

    @Override // com.p7700g.p99005.ee2
    public final void j(@z1 oa2 oa2Var) {
        this.f = oa2Var;
    }

    @Override // com.p7700g.p99005.ee2
    public AnimatorSet k() {
        return o(b());
    }

    @Override // com.p7700g.p99005.ee2
    @x1
    public final List<Animator.AnimatorListener> l() {
        return this.c;
    }

    @x1
    public AnimatorSet o(@x1 oa2 oa2Var) {
        ArrayList arrayList = new ArrayList();
        if (oa2Var.j("opacity")) {
            arrayList.add(oa2Var.f("opacity", this.b, View.ALPHA));
        }
        if (oa2Var.j("scale")) {
            arrayList.add(oa2Var.f("scale", this.b, View.SCALE_Y));
            arrayList.add(oa2Var.f("scale", this.b, View.SCALE_X));
        }
        if (oa2Var.j("width")) {
            arrayList.add(oa2Var.f("width", this.b, ExtendedFloatingActionButton.T));
        }
        if (oa2Var.j("height")) {
            arrayList.add(oa2Var.f("height", this.b, ExtendedFloatingActionButton.U));
        }
        if (oa2Var.j("paddingStart")) {
            arrayList.add(oa2Var.f("paddingStart", this.b, ExtendedFloatingActionButton.V));
        }
        if (oa2Var.j("paddingEnd")) {
            arrayList.add(oa2Var.f("paddingEnd", this.b, ExtendedFloatingActionButton.W));
        }
        if (oa2Var.j("labelOpacity")) {
            arrayList.add(oa2Var.f("labelOpacity", this.b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ia2.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.p7700g.p99005.ee2
    @t0
    public void onAnimationStart(Animator animator) {
        this.d.c(animator);
    }
}