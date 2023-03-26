package com.p7700g.p99005;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import com.p7700g.p99005.qh2;

/* compiled from: TransitionUtils.java */
@e2(21)
/* loaded from: classes3.dex */
public class el2 {
    public static final int a = -1;
    @q0
    public static final int b = 0;
    private static final int c = 0;
    private static final int d = 1;
    private static final RectF e = new RectF();

    /* compiled from: TransitionUtils.java */
    /* loaded from: classes3.dex */
    public class a implements qh2.c {
        public final /* synthetic */ RectF a;

        public a(RectF rectF) {
            this.a = rectF;
        }

        @Override // com.p7700g.p99005.qh2.c
        @x1
        public fh2 a(@x1 fh2 fh2Var) {
            return fh2Var instanceof oh2 ? fh2Var : new oh2(fh2Var.a(this.a) / this.a.height());
        }
    }

    /* compiled from: TransitionUtils.java */
    /* loaded from: classes3.dex */
    public class b implements d {
        public final /* synthetic */ RectF a;
        public final /* synthetic */ RectF b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;

        public b(RectF rectF, RectF rectF2, float f, float f2, float f3) {
            this.a = rectF;
            this.b = rectF2;
            this.c = f;
            this.d = f2;
            this.e = f3;
        }

        @Override // com.p7700g.p99005.el2.d
        @x1
        public fh2 a(@x1 fh2 fh2Var, @x1 fh2 fh2Var2) {
            return new ch2(el2.l(fh2Var.a(this.a), fh2Var2.a(this.b), this.c, this.d, this.e));
        }
    }

    /* compiled from: TransitionUtils.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a(Canvas canvas);
    }

    /* compiled from: TransitionUtils.java */
    /* loaded from: classes3.dex */
    public interface d {
        @x1
        fh2 a(@x1 fh2 fh2Var, @x1 fh2 fh2Var2);
    }

    private el2() {
    }

    public static float a(@x1 RectF rectF) {
        return rectF.height() * rectF.width();
    }

    public static qh2 b(qh2 qh2Var, RectF rectF) {
        return qh2Var.y(new a(rectF));
    }

    public static Shader c(@w0 int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    @x1
    public static <T> T d(@z1 T t, @x1 T t2) {
        return t != null ? t : t2;
    }

    public static View e(View view, @m1 int i) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(wo1.t(resourceName, " is not a valid ancestor"));
    }

    public static View f(View view, @m1 int i) {
        View findViewById = view.findViewById(i);
        return findViewById != null ? findViewById : e(view, i);
    }

    public static RectF g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    public static RectF h(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static Rect i(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean j(qh2 qh2Var, RectF rectF) {
        return (qh2Var.r().a(rectF) == 0.0f && qh2Var.t().a(rectF) == 0.0f && qh2Var.l().a(rectF) == 0.0f && qh2Var.j().a(rectF) == 0.0f) ? false : true;
    }

    public static float k(float f, float f2, float f3) {
        return wo1.a(f2, f, f3, f);
    }

    public static float l(float f, float f2, @g1(from = 0.0d, to = 1.0d) float f3, @g1(from = 0.0d, to = 1.0d) float f4, @g1(from = 0.0d, to = 1.0d) float f5) {
        return m(f, f2, f3, f4, f5, false);
    }

    public static float m(float f, float f2, @g1(from = 0.0d, to = 1.0d) float f3, @g1(from = 0.0d, to = 1.0d) float f4, @g1(from = 0.0d) float f5, boolean z) {
        if (!z || (f5 >= 0.0f && f5 <= 1.0f)) {
            return f5 < f3 ? f : f5 > f4 ? f2 : k(f, f2, (f5 - f3) / (f4 - f3));
        }
        return k(f, f2, f5);
    }

    public static int n(int i, int i2, @g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 1.0d) float f2, @g1(from = 0.0d, to = 1.0d) float f3) {
        return f3 < f ? i : f3 > f2 ? i2 : (int) k(i, i2, (f3 - f) / (f2 - f));
    }

    public static qh2 o(qh2 qh2Var, qh2 qh2Var2, RectF rectF, RectF rectF2, @g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 1.0d) float f2, @g1(from = 0.0d, to = 1.0d) float f3) {
        return f3 < f ? qh2Var : f3 > f2 ? qh2Var2 : x(qh2Var, qh2Var2, rectF, new b(rectF, rectF2, f, f2, f3));
    }

    public static void p(TransitionSet transitionSet, @z1 Transition transition) {
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
    }

    public static boolean q(Transition transition, Context context, @q0 int i) {
        int d2;
        if (i == 0 || transition.getDuration() != -1 || (d2 = of2.d(context, i, -1)) == -1) {
            return false;
        }
        transition.setDuration(d2);
        return true;
    }

    public static boolean r(Transition transition, Context context, @q0 int i, TimeInterpolator timeInterpolator) {
        if (i == 0 || transition.getInterpolator() != null) {
            return false;
        }
        transition.setInterpolator(of2.e(context, i, timeInterpolator));
        return true;
    }

    public static boolean s(Transition transition, Context context, @q0 int i) {
        PathMotion u;
        if (i == 0 || (u = u(context, i)) == null) {
            return false;
        }
        transition.setPathMotion(u);
        return true;
    }

    public static void t(TransitionSet transitionSet, @z1 Transition transition) {
        if (transition != null) {
            transitionSet.removeTransition(transition);
        }
    }

    @z1
    public static PathMotion u(Context context, @q0 int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            int i2 = typedValue.type;
            if (i2 != 16) {
                if (i2 == 3) {
                    return new PatternPathMotion(mj.e(String.valueOf(typedValue.string)));
                }
                throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
            }
            int i3 = typedValue.data;
            if (i3 == 0) {
                return null;
            }
            if (i3 == 1) {
                return new tk2();
            }
            throw new IllegalArgumentException(wo1.l("Invalid motion path type: ", i3));
        }
        return null;
    }

    private static int v(Canvas canvas, Rect rect, int i) {
        RectF rectF = e;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    public static void w(Canvas canvas, Rect rect, float f, float f2, float f3, int i, c cVar) {
        if (i <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        if (i < 255) {
            v(canvas, rect, i);
        }
        cVar.a(canvas);
        canvas.restoreToCount(save);
    }

    public static qh2 x(qh2 qh2Var, qh2 qh2Var2, RectF rectF, d dVar) {
        return (j(qh2Var, rectF) ? qh2Var : qh2Var2).v().L(dVar.a(qh2Var.r(), qh2Var2.r())).Q(dVar.a(qh2Var.t(), qh2Var2.t())).y(dVar.a(qh2Var.j(), qh2Var2.j())).D(dVar.a(qh2Var.l(), qh2Var2.l())).m();
    }
}