package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.ha2;
import com.p7700g.p99005.ia2;
import com.p7700g.p99005.ja2;
import com.p7700g.p99005.ka2;
import com.p7700g.p99005.la2;
import com.p7700g.p99005.lj2;
import com.p7700g.p99005.mj2;
import com.p7700g.p99005.nf2;
import com.p7700g.p99005.oa2;
import com.p7700g.p99005.pa2;
import com.p7700g.p99005.pb2;
import com.p7700g.p99005.qa2;
import com.p7700g.p99005.sb2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.t0;
import com.p7700g.p99005.vb2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final Rect f;
    private final RectF g;
    private final RectF h;
    private final int[] i;
    private float j;
    private float k;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean s;
        public final /* synthetic */ View t;
        public final /* synthetic */ View u;

        public a(boolean z, View view, View view2) {
            this.s = z;
            this.t = view;
            this.u = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.s) {
                return;
            }
            this.t.setVisibility(4);
            this.u.setAlpha(1.0f);
            this.u.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.s) {
                this.t.setVisibility(0);
                this.u.setAlpha(0.0f);
                this.u.setVisibility(4);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View s;

        public b(View view) {
            this.s = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.s.invalidate();
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ vb2 s;
        public final /* synthetic */ Drawable t;

        public c(vb2 vb2Var, Drawable drawable) {
            this.s = vb2Var;
            this.t = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.s.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.s.setCircularRevealOverlayDrawable(this.t);
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ vb2 s;

        public d(vb2 vb2Var) {
            this.s = vb2Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            vb2.e revealInfo = this.s.getRevealInfo();
            revealInfo.d = Float.MAX_VALUE;
            this.s.setRevealInfo(revealInfo);
        }
    }

    /* loaded from: classes3.dex */
    public static class e {
        @z1
        public oa2 a;
        public qa2 b;
    }

    public FabTransformationBehavior() {
        this.f = new Rect();
        this.g = new RectF();
        this.h = new RectF();
        this.i = new int[2];
    }

    @z1
    private ViewGroup N(@x1 View view) {
        View findViewById = view.findViewById(ga2.h.p3);
        if (findViewById != null) {
            return i0(findViewById);
        }
        if (!(view instanceof mj2) && !(view instanceof lj2)) {
            return i0(view);
        }
        return i0(((ViewGroup) view).getChildAt(0));
    }

    private void O(@x1 View view, @x1 e eVar, @x1 pa2 pa2Var, @x1 pa2 pa2Var2, float f, float f2, float f3, float f4, @x1 RectF rectF) {
        float V = V(eVar, pa2Var, f, f3);
        float V2 = V(eVar, pa2Var2, f2, f4);
        Rect rect = this.f;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.g;
        rectF2.set(rect);
        RectF rectF3 = this.h;
        W(view, rectF3);
        rectF3.offset(V, V2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void P(@x1 View view, @x1 RectF rectF) {
        W(view, rectF);
        rectF.offset(this.j, this.k);
    }

    @x1
    private Pair<pa2, pa2> Q(float f, float f2, boolean z, @x1 e eVar) {
        pa2 h;
        pa2 h2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            h = eVar.a.h("translationXLinear");
            h2 = eVar.a.h("translationYLinear");
        } else if ((z && f2 < 0.0f) || (!z && i > 0)) {
            h = eVar.a.h("translationXCurveUpwards");
            h2 = eVar.a.h("translationYCurveUpwards");
        } else {
            h = eVar.a.h("translationXCurveDownwards");
            h2 = eVar.a.h("translationYCurveDownwards");
        }
        return new Pair<>(h, h2);
    }

    private float R(@x1 View view, @x1 View view2, @x1 qa2 qa2Var) {
        RectF rectF = this.g;
        RectF rectF2 = this.h;
        P(view, rectF);
        W(view2, rectF2);
        rectF2.offset(-T(view, view2, qa2Var), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float S(@x1 View view, @x1 View view2, @x1 qa2 qa2Var) {
        RectF rectF = this.g;
        RectF rectF2 = this.h;
        P(view, rectF);
        W(view2, rectF2);
        rectF2.offset(0.0f, -U(view, view2, qa2Var));
        return rectF.centerY() - rectF2.top;
    }

    private float T(@x1 View view, @x1 View view2, @x1 qa2 qa2Var) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.g;
        RectF rectF2 = this.h;
        P(view, rectF);
        W(view2, rectF2);
        int i = qa2Var.a & 7;
        if (i == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i == 5) {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        } else {
            f = 0.0f;
            return f + qa2Var.b;
        }
        f = centerX - centerX2;
        return f + qa2Var.b;
    }

    private float U(@x1 View view, @x1 View view2, @x1 qa2 qa2Var) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.g;
        RectF rectF2 = this.h;
        P(view, rectF);
        W(view2, rectF2);
        int i = qa2Var.a & 112;
        if (i == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i == 80) {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        } else {
            f = 0.0f;
            return f + qa2Var.c;
        }
        f = centerY - centerY2;
        return f + qa2Var.c;
    }

    private float V(@x1 e eVar, @x1 pa2 pa2Var, float f, float f2) {
        long c2 = pa2Var.c();
        long d2 = pa2Var.d();
        pa2 h = eVar.a.h("expansion");
        long c3 = h.c();
        return ha2.a(f, f2, pa2Var.e().getInterpolation(((float) (((h.d() + c3) + 17) - c2)) / ((float) d2)));
    }

    private void W(@x1 View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.i;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void X(View view, View view2, boolean z, boolean z2, @x1 e eVar, @x1 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup N;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof vb2) && sb2.e == 0) || (N = N(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    ka2.a.set(N, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(N, ka2.a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(N, ka2.a, 0.0f);
            }
            eVar.a.h("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    private void Y(@x1 View view, View view2, boolean z, boolean z2, @x1 e eVar, @x1 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof vb2) {
            vb2 vb2Var = (vb2) view2;
            int g0 = g0(view);
            int i = 16777215 & g0;
            if (z) {
                if (!z2) {
                    vb2Var.setCircularRevealScrimColor(g0);
                }
                ofInt = ObjectAnimator.ofInt(vb2Var, vb2.d.a, i);
            } else {
                ofInt = ObjectAnimator.ofInt(vb2Var, vb2.d.a, g0);
            }
            ofInt.setEvaluator(ja2.b());
            eVar.a.h("color").a(ofInt);
            list.add(ofInt);
        }
    }

    private void Z(@x1 View view, @x1 View view2, boolean z, @x1 e eVar, @x1 List<Animator> list) {
        float T = T(view, view2, eVar.b);
        float U = U(view, view2, eVar.b);
        Pair<pa2, pa2> Q = Q(T, U, z, eVar);
        pa2 pa2Var = (pa2) Q.first;
        pa2 pa2Var2 = (pa2) Q.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            T = this.j;
        }
        fArr[0] = T;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            U = this.k;
        }
        fArr2[0] = U;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        pa2Var.a(ofFloat);
        pa2Var2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void a0(View view, @x1 View view2, boolean z, boolean z2, @x1 e eVar, @x1 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float Q = sr.Q(view2) - sr.Q(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-Q);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -Q);
        }
        eVar.a.h("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    private void b0(@x1 View view, View view2, boolean z, boolean z2, @x1 e eVar, float f, float f2, @x1 List<Animator> list, @x1 List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof vb2) {
            vb2 vb2Var = (vb2) view2;
            float R = R(view, view2, eVar.b);
            float S = S(view, view2, eVar.b);
            ((FloatingActionButton) view).k(this.f);
            float width = this.f.width() / 2.0f;
            pa2 h = eVar.a.h("expansion");
            if (z) {
                if (!z2) {
                    vb2Var.setRevealInfo(new vb2.e(R, S, width));
                }
                if (z2) {
                    width = vb2Var.getRevealInfo().d;
                }
                animator = pb2.a(vb2Var, R, S, nf2.b(R, S, 0.0f, 0.0f, f, f2));
                animator.addListener(new d(vb2Var));
                e0(view2, h.c(), (int) R, (int) S, width, list);
            } else {
                float f3 = vb2Var.getRevealInfo().d;
                Animator a2 = pb2.a(vb2Var, R, S, width);
                int i = (int) R;
                int i2 = (int) S;
                e0(view2, h.c(), i, i2, f3, list);
                d0(view2, h.c(), h.d(), eVar.a.i(), i, i2, width, list);
                animator = a2;
            }
            h.a(animator);
            list.add(animator);
            list2.add(pb2.c(vb2Var));
        }
    }

    private void c0(View view, View view2, boolean z, boolean z2, @x1 e eVar, @x1 List<Animator> list, @x1 List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof vb2) && (view instanceof ImageView)) {
            vb2 vb2Var = (vb2) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, la2.a, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, la2.a, 255);
            }
            ofInt.addUpdateListener(new b(view2));
            eVar.a.h("iconFade").a(ofInt);
            list.add(ofInt);
            list2.add(new c(vb2Var, drawable));
        }
    }

    private void d0(View view, long j, long j2, long j3, int i, int i2, float f, @x1 List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    private void e0(View view, long j, int i, int i2, float f, @x1 List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private void f0(@x1 View view, @x1 View view2, boolean z, boolean z2, @x1 e eVar, @x1 List<Animator> list, List<Animator.AnimatorListener> list2, @x1 RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float T = T(view, view2, eVar.b);
        float U = U(view, view2, eVar.b);
        Pair<pa2, pa2> Q = Q(T, U, z, eVar);
        pa2 pa2Var = (pa2) Q.first;
        pa2 pa2Var2 = (pa2) Q.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-T);
                view2.setTranslationY(-U);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            O(view2, eVar, pa2Var, pa2Var2, -T, -U, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -T);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -U);
        }
        pa2Var.a(ofFloat);
        pa2Var2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private int g0(@x1 View view) {
        ColorStateList M = sr.M(view);
        if (M != null) {
            return M.getColorForState(view.getDrawableState(), M.getDefaultColor());
        }
        return 0;
    }

    @z1
    private ViewGroup i0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @x1
    public AnimatorSet M(@x1 View view, @x1 View view2, boolean z, boolean z2) {
        e h0 = h0(view2.getContext(), z);
        if (z) {
            this.j = view.getTranslationX();
            this.k = view.getTranslationY();
        }
        List<Animator> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        a0(view, view2, z, z2, h0, arrayList, arrayList2);
        RectF rectF = this.g;
        f0(view, view2, z, z2, h0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        Z(view, view2, z, h0, arrayList);
        c0(view, view2, z, z2, h0, arrayList, arrayList2);
        b0(view, view2, z, z2, h0, width, height, arrayList, arrayList2);
        Y(view, view2, z, z2, h0, arrayList, arrayList2);
        X(view, view2, z, z2, h0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        ia2.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @t0
    public boolean f(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, @x1 View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @t0
    public void h(@x1 CoordinatorLayout.g gVar) {
        if (gVar.h == 0) {
            gVar.h = 80;
        }
    }

    public abstract e h0(Context context, boolean z);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new Rect();
        this.g = new RectF();
        this.h = new RectF();
        this.i = new int[2];
    }
}