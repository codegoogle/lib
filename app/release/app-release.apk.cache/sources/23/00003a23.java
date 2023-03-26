package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.o20;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public class b30 extends RecyclerView.n implements RecyclerView.q {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 16;
    public static final int f = 32;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 2;
    public static final int k = 4;
    public static final int l = 8;
    private static final String m = "ItemTouchHelper";
    private static final boolean n = false;
    private static final int o = -1;
    public static final int p = 8;
    private static final int q = 255;
    public static final int r = 65280;
    public static final int s = 16711680;
    private static final int t = 1000;
    private float A;
    public float B;
    public float C;
    private float D;
    private float E;
    @x1
    public f G;
    public int I;
    private int K;
    public RecyclerView L;
    public VelocityTracker N;
    private List<RecyclerView.f0> O;
    private List<Integer> P;
    public mq T;
    private g U;
    private Rect W;
    private long X;
    public float x;
    public float y;
    private float z;
    public final List<View> u = new ArrayList();
    private final float[] v = new float[2];
    public RecyclerView.f0 w = null;
    public int F = -1;
    private int H = 0;
    public List<h> J = new ArrayList();
    public final Runnable M = new a();
    private RecyclerView.j Q = null;
    public View R = null;
    public int S = -1;
    private final RecyclerView.s V = new b();

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b30 b30Var = b30.this;
            if (b30Var.w == null || !b30Var.E()) {
                return;
            }
            b30 b30Var2 = b30.this;
            RecyclerView.f0 f0Var = b30Var2.w;
            if (f0Var != null) {
                b30Var2.z(f0Var);
            }
            b30 b30Var3 = b30.this;
            b30Var3.L.removeCallbacks(b30Var3.M);
            sr.o1(b30.this.L, this);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class b implements RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(@x1 RecyclerView recyclerView, @x1 MotionEvent motionEvent) {
            b30.this.T.b(motionEvent);
            VelocityTracker velocityTracker = b30.this.N;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (b30.this.F == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(b30.this.F);
            if (findPointerIndex >= 0) {
                b30.this.o(actionMasked, motionEvent, findPointerIndex);
            }
            b30 b30Var = b30.this;
            RecyclerView.f0 f0Var = b30Var.w;
            if (f0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        b30Var.M(motionEvent, b30Var.I, findPointerIndex);
                        b30.this.z(f0Var);
                        b30 b30Var2 = b30.this;
                        b30Var2.L.removeCallbacks(b30Var2.M);
                        b30.this.M.run();
                        b30.this.L.invalidate();
                        return;
                    }
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    b30 b30Var3 = b30.this;
                    if (pointerId == b30Var3.F) {
                        b30Var3.F = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        b30 b30Var4 = b30.this;
                        b30Var4.M(motionEvent, b30Var4.I, actionIndex);
                        return;
                    }
                    return;
                } else {
                    VelocityTracker velocityTracker2 = b30Var.N;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                }
            }
            b30.this.F(null, 0);
            b30.this.F = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean c(@x1 RecyclerView recyclerView, @x1 MotionEvent motionEvent) {
            int findPointerIndex;
            h s;
            b30.this.T.b(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                b30.this.F = motionEvent.getPointerId(0);
                b30.this.x = motionEvent.getX();
                b30.this.y = motionEvent.getY();
                b30.this.A();
                b30 b30Var = b30.this;
                if (b30Var.w == null && (s = b30Var.s(motionEvent)) != null) {
                    b30 b30Var2 = b30.this;
                    b30Var2.x -= s.B;
                    b30Var2.y -= s.C;
                    b30Var2.r(s.w, true);
                    if (b30.this.u.remove(s.w.p)) {
                        b30 b30Var3 = b30.this;
                        b30Var3.G.c(b30Var3.L, s.w);
                    }
                    b30.this.F(s.w, s.x);
                    b30 b30Var4 = b30.this;
                    b30Var4.M(motionEvent, b30Var4.I, 0);
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i = b30.this.F;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    b30.this.o(actionMasked, motionEvent, findPointerIndex);
                }
            } else {
                b30 b30Var5 = b30.this;
                b30Var5.F = -1;
                b30Var5.F(null, 0);
            }
            VelocityTracker velocityTracker = b30.this.N;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return b30.this.w != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void e(boolean z) {
            if (z) {
                b30.this.F(null, 0);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class c extends h {
        public final /* synthetic */ int G;
        public final /* synthetic */ RecyclerView.f0 H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.f0 f0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.f0 f0Var2) {
            super(f0Var, i, i2, f, f2, f3, f4);
            this.G = i3;
            this.H = f0Var2;
        }

        @Override // com.p7700g.p99005.b30.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.D) {
                return;
            }
            if (this.G <= 0) {
                b30 b30Var = b30.this;
                b30Var.G.c(b30Var.L, this.H);
            } else {
                b30.this.u.add(this.H.p);
                this.A = true;
                int i = this.G;
                if (i > 0) {
                    b30.this.B(this, i);
                }
            }
            b30 b30Var2 = b30.this;
            View view = b30Var2.R;
            View view2 = this.H.p;
            if (view == view2) {
                b30Var2.D(view2);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public final /* synthetic */ h s;
        public final /* synthetic */ int t;

        public d(h hVar, int i) {
            this.s = hVar;
            this.t = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = b30.this.L;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            h hVar = this.s;
            if (hVar.D || hVar.w.j() == -1) {
                return;
            }
            RecyclerView.l itemAnimator = b30.this.L.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.r(null)) && !b30.this.x()) {
                b30.this.G.D(this.s.w, this.t);
            } else {
                b30.this.L.post(this);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class e implements RecyclerView.j {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public int a(int i, int i2) {
            b30 b30Var = b30.this;
            View view = b30Var.R;
            if (view == null) {
                return i2;
            }
            int i3 = b30Var.S;
            if (i3 == -1) {
                i3 = b30Var.L.indexOfChild(view);
                b30.this.S = i3;
            }
            return i2 == i + (-1) ? i3 : i2 < i3 ? i2 : i2 + 1;
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static abstract class f {
        public static final int a = 200;
        public static final int b = 250;
        public static final int c = 3158064;
        private static final int d = 789516;
        private static final Interpolator e = new a();
        private static final Interpolator f = new b();
        private static final long g = 2000;
        private int h = -1;

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        public static class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        public static class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int e(int i, int i2) {
            int i3;
            int i4 = i & d;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & d) << 2;
            }
            return i5 | i3;
        }

        @x1
        public static c30 i() {
            return d30.a;
        }

        private int j(RecyclerView recyclerView) {
            if (this.h == -1) {
                this.h = recyclerView.getResources().getDimensionPixelSize(o20.c.k);
            }
            return this.h;
        }

        public static int u(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int v(int i, int i2) {
            int u = u(0, i2 | i);
            return u(2, i) | u(1, i2) | u;
        }

        public abstract boolean A(@x1 RecyclerView recyclerView, @x1 RecyclerView.f0 f0Var, @x1 RecyclerView.f0 f0Var2);

        public void B(@x1 RecyclerView recyclerView, @x1 RecyclerView.f0 f0Var, int i, @x1 RecyclerView.f0 f0Var2, int i2, int i3, int i4) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j) layoutManager).b(f0Var.p, f0Var2.p, i3, i4);
                return;
            }
            if (layoutManager.n()) {
                if (layoutManager.Y(f0Var2.p) <= recyclerView.getPaddingLeft()) {
                    recyclerView.B1(i2);
                }
                if (layoutManager.b0(f0Var2.p) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.B1(i2);
                }
            }
            if (layoutManager.o()) {
                if (layoutManager.c0(f0Var2.p) <= recyclerView.getPaddingTop()) {
                    recyclerView.B1(i2);
                }
                if (layoutManager.W(f0Var2.p) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.B1(i2);
                }
            }
        }

        public void C(@z1 RecyclerView.f0 f0Var, int i) {
            if (f0Var != null) {
                d30.a.b(f0Var.p);
            }
        }

        public abstract void D(@x1 RecyclerView.f0 f0Var, int i);

        public boolean a(@x1 RecyclerView recyclerView, @x1 RecyclerView.f0 f0Var, @x1 RecyclerView.f0 f0Var2) {
            return true;
        }

        public RecyclerView.f0 b(@x1 RecyclerView.f0 f0Var, @x1 List<RecyclerView.f0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = f0Var.p.getWidth() + i;
            int height = f0Var.p.getHeight() + i2;
            int left2 = i - f0Var.p.getLeft();
            int top2 = i2 - f0Var.p.getTop();
            int size = list.size();
            RecyclerView.f0 f0Var2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.f0 f0Var3 = list.get(i4);
                if (left2 > 0 && (right = f0Var3.p.getRight() - width) < 0 && f0Var3.p.getRight() > f0Var.p.getRight() && (abs4 = Math.abs(right)) > i3) {
                    f0Var2 = f0Var3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = f0Var3.p.getLeft() - i) > 0 && f0Var3.p.getLeft() < f0Var.p.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    f0Var2 = f0Var3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = f0Var3.p.getTop() - i2) > 0 && f0Var3.p.getTop() < f0Var.p.getTop() && (abs2 = Math.abs(top)) > i3) {
                    f0Var2 = f0Var3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = f0Var3.p.getBottom() - height) < 0 && f0Var3.p.getBottom() > f0Var.p.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    f0Var2 = f0Var3;
                    i3 = abs;
                }
            }
            return f0Var2;
        }

        public void c(@x1 RecyclerView recyclerView, @x1 RecyclerView.f0 f0Var) {
            d30.a.a(f0Var.p);
        }

        public int d(int i, int i2) {
            int i3;
            int i4 = i & c;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & c) >> 2;
            }
            return i5 | i3;
        }

        public final int f(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            return d(l(recyclerView, f0Var), sr.Y(recyclerView));
        }

        public long g(@x1 RecyclerView recyclerView, int i, float f2, float f3) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200L : 250L;
            } else if (i == 8) {
                return itemAnimator.o();
            } else {
                return itemAnimator.p();
            }
        }

        public int h() {
            return 0;
        }

        public float k(@x1 RecyclerView.f0 f0Var) {
            return 0.5f;
        }

        public abstract int l(@x1 RecyclerView recyclerView, @x1 RecyclerView.f0 f0Var);

        public float m(float f2) {
            return f2;
        }

        public float n(@x1 RecyclerView.f0 f0Var) {
            return 0.5f;
        }

        public float o(float f2) {
            return f2;
        }

        public boolean p(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            return (f(recyclerView, f0Var) & b30.s) != 0;
        }

        public boolean q(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            return (f(recyclerView, f0Var) & 65280) != 0;
        }

        public int r(@x1 RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int interpolation = (int) (e.getInterpolation(j <= g ? ((float) j) / 2000.0f : 1.0f) * ((int) (f.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * j(recyclerView))));
            return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
        }

        public boolean s() {
            return true;
        }

        public boolean t() {
            return true;
        }

        public void w(@x1 Canvas canvas, @x1 RecyclerView recyclerView, @x1 RecyclerView.f0 f0Var, float f2, float f3, int i, boolean z) {
            d30.a.d(canvas, recyclerView, f0Var.p, f2, f3, i, z);
        }

        public void x(@x1 Canvas canvas, @x1 RecyclerView recyclerView, RecyclerView.f0 f0Var, float f2, float f3, int i, boolean z) {
            d30.a.c(canvas, recyclerView, f0Var.p, f2, f3, i, z);
        }

        public void y(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, List<h> list, int i, float f2, float f3) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = list.get(i2);
                hVar.e();
                int save = canvas.save();
                w(canvas, recyclerView, hVar.w, hVar.B, hVar.C, hVar.x, false);
                canvas.restoreToCount(save);
            }
            if (f0Var != null) {
                int save2 = canvas.save();
                w(canvas, recyclerView, f0Var, f2, f3, i, true);
                canvas.restoreToCount(save2);
            }
        }

        public void z(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, List<h> list, int i, float f2, float f3) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = list.get(i2);
                int save = canvas.save();
                x(canvas, recyclerView, hVar.w, hVar.B, hVar.C, hVar.x, false);
                canvas.restoreToCount(save);
            }
            if (f0Var != null) {
                int save2 = canvas.save();
                x(canvas, recyclerView, f0Var, f2, f3, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                h hVar2 = list.get(i3);
                boolean z2 = hVar2.E;
                if (z2 && !hVar2.A) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class g extends GestureDetector.SimpleOnGestureListener {
        private boolean a = true;

        public g() {
        }

        public void a() {
            this.a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View t;
            RecyclerView.f0 r0;
            if (!this.a || (t = b30.this.t(motionEvent)) == null || (r0 = b30.this.L.r0(t)) == null) {
                return;
            }
            b30 b30Var = b30.this;
            if (b30Var.G.p(b30Var.L, r0)) {
                int pointerId = motionEvent.getPointerId(0);
                int i = b30.this.F;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    b30 b30Var2 = b30.this;
                    b30Var2.x = x;
                    b30Var2.y = y;
                    b30Var2.C = 0.0f;
                    b30Var2.B = 0.0f;
                    if (b30Var2.G.t()) {
                        b30.this.F(r0, 2);
                    }
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static class h implements Animator.AnimatorListener {
        public boolean A;
        public float B;
        public float C;
        public boolean D = false;
        public boolean E = false;
        private float F;
        public final float s;
        public final float t;
        public final float u;
        public final float v;
        public final RecyclerView.f0 w;
        public final int x;
        private final ValueAnimator y;
        public final int z;

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        public h(RecyclerView.f0 f0Var, int i, int i2, float f, float f2, float f3, float f4) {
            this.x = i2;
            this.z = i;
            this.w = f0Var;
            this.s = f;
            this.t = f2;
            this.u = f3;
            this.v = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(f0Var.p);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.y.cancel();
        }

        public void b(long j) {
            this.y.setDuration(j);
        }

        public void c(float f) {
            this.F = f;
        }

        public void d() {
            this.w.H(false);
            this.y.start();
        }

        public void e() {
            float f = this.s;
            float f2 = this.u;
            if (f == f2) {
                this.B = this.w.p.getTranslationX();
            } else {
                this.B = wo1.a(f2, f, this.F, f);
            }
            float f3 = this.t;
            float f4 = this.v;
            if (f3 == f4) {
                this.C = this.w.p.getTranslationY();
            } else {
                this.C = wo1.a(f4, f3, this.F, f3);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.E) {
                this.w.H(true);
            }
            this.E = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static abstract class i extends f {
        private int i;
        private int j;

        public i(int i, int i2) {
            this.i = i2;
            this.j = i;
        }

        public int E(@x1 RecyclerView recyclerView, @x1 RecyclerView.f0 f0Var) {
            return this.j;
        }

        public int F(@x1 RecyclerView recyclerView, @x1 RecyclerView.f0 f0Var) {
            return this.i;
        }

        public void G(int i) {
            this.j = i;
        }

        public void H(int i) {
            this.i = i;
        }

        @Override // com.p7700g.p99005.b30.f
        public int l(@x1 RecyclerView recyclerView, @x1 RecyclerView.f0 f0Var) {
            return f.v(E(recyclerView, f0Var), F(recyclerView, f0Var));
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public interface j {
        void b(@x1 View view, @x1 View view2, int i, int i2);
    }

    public b30(@x1 f fVar) {
        this.G = fVar;
    }

    private void C() {
        VelocityTracker velocityTracker = this.N;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.N = null;
        }
    }

    private void G() {
        this.K = ViewConfiguration.get(this.L.getContext()).getScaledTouchSlop();
        this.L.m(this);
        this.L.p(this.V);
        this.L.o(this);
        I();
    }

    private void I() {
        this.U = new g();
        this.T = new mq(this.L.getContext(), this.U);
    }

    private void K() {
        g gVar = this.U;
        if (gVar != null) {
            gVar.a();
            this.U = null;
        }
        if (this.T != null) {
            this.T = null;
        }
    }

    private int L(RecyclerView.f0 f0Var) {
        if (this.H == 2) {
            return 0;
        }
        int l2 = this.G.l(this.L, f0Var);
        int d2 = (this.G.d(l2, sr.Y(this.L)) & 65280) >> 8;
        if (d2 == 0) {
            return 0;
        }
        int i2 = (l2 & 65280) >> 8;
        if (Math.abs(this.B) > Math.abs(this.C)) {
            int n2 = n(f0Var, d2);
            if (n2 > 0) {
                return (i2 & n2) == 0 ? f.e(n2, sr.Y(this.L)) : n2;
            }
            int p2 = p(f0Var, d2);
            if (p2 > 0) {
                return p2;
            }
        } else {
            int p3 = p(f0Var, d2);
            if (p3 > 0) {
                return p3;
            }
            int n3 = n(f0Var, d2);
            if (n3 > 0) {
                return (i2 & n3) == 0 ? f.e(n3, sr.Y(this.L)) : n3;
            }
        }
        return 0;
    }

    private void l() {
    }

    private int n(RecyclerView.f0 f0Var, int i2) {
        if ((i2 & 12) != 0) {
            int i3 = this.B > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.N;
            if (velocityTracker != null && this.F > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.G.o(this.A));
                float xVelocity = this.N.getXVelocity(this.F);
                float yVelocity = this.N.getYVelocity(this.F);
                int i4 = xVelocity <= 0.0f ? 4 : 8;
                float abs = Math.abs(xVelocity);
                if ((i4 & i2) != 0 && i3 == i4 && abs >= this.G.m(this.z) && abs > Math.abs(yVelocity)) {
                    return i4;
                }
            }
            float n2 = this.G.n(f0Var) * this.L.getWidth();
            if ((i2 & i3) == 0 || Math.abs(this.B) <= n2) {
                return 0;
            }
            return i3;
        }
        return 0;
    }

    private int p(RecyclerView.f0 f0Var, int i2) {
        if ((i2 & 3) != 0) {
            int i3 = this.C > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.N;
            if (velocityTracker != null && this.F > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.G.o(this.A));
                float xVelocity = this.N.getXVelocity(this.F);
                float yVelocity = this.N.getYVelocity(this.F);
                int i4 = yVelocity <= 0.0f ? 1 : 2;
                float abs = Math.abs(yVelocity);
                if ((i4 & i2) != 0 && i4 == i3 && abs >= this.G.m(this.z) && abs > Math.abs(xVelocity)) {
                    return i4;
                }
            }
            float n2 = this.G.n(f0Var) * this.L.getHeight();
            if ((i2 & i3) == 0 || Math.abs(this.C) <= n2) {
                return 0;
            }
            return i3;
        }
        return 0;
    }

    private void q() {
        this.L.o1(this);
        this.L.r1(this.V);
        this.L.q1(this);
        for (int size = this.J.size() - 1; size >= 0; size--) {
            this.G.c(this.L, this.J.get(0).w);
        }
        this.J.clear();
        this.R = null;
        this.S = -1;
        C();
        K();
    }

    private List<RecyclerView.f0> u(RecyclerView.f0 f0Var) {
        RecyclerView.f0 f0Var2 = f0Var;
        List<RecyclerView.f0> list = this.O;
        if (list == null) {
            this.O = new ArrayList();
            this.P = new ArrayList();
        } else {
            list.clear();
            this.P.clear();
        }
        int h2 = this.G.h();
        int round = Math.round(this.D + this.B) - h2;
        int round2 = Math.round(this.E + this.C) - h2;
        int i2 = h2 * 2;
        int width = f0Var2.p.getWidth() + round + i2;
        int height = f0Var2.p.getHeight() + round2 + i2;
        int i3 = (round + width) / 2;
        int i4 = (round2 + height) / 2;
        RecyclerView.o layoutManager = this.L.getLayoutManager();
        int Q = layoutManager.Q();
        int i5 = 0;
        while (i5 < Q) {
            View P = layoutManager.P(i5);
            if (P != f0Var2.p && P.getBottom() >= round2 && P.getTop() <= height && P.getRight() >= round && P.getLeft() <= width) {
                RecyclerView.f0 r0 = this.L.r0(P);
                if (this.G.a(this.L, this.w, r0)) {
                    int abs = Math.abs(i3 - ((P.getRight() + P.getLeft()) / 2));
                    int abs2 = Math.abs(i4 - ((P.getBottom() + P.getTop()) / 2));
                    int i6 = (abs2 * abs2) + (abs * abs);
                    int size = this.O.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size && i6 > this.P.get(i8).intValue(); i8++) {
                        i7++;
                    }
                    this.O.add(i7, r0);
                    this.P.add(i7, Integer.valueOf(i6));
                }
            }
            i5++;
            f0Var2 = f0Var;
        }
        return this.O;
    }

    private RecyclerView.f0 v(MotionEvent motionEvent) {
        View t2;
        RecyclerView.o layoutManager = this.L.getLayoutManager();
        int i2 = this.F;
        if (i2 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.x);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.y);
        int i3 = this.K;
        if (abs >= i3 || abs2 >= i3) {
            if (abs <= abs2 || !layoutManager.n()) {
                if ((abs2 <= abs || !layoutManager.o()) && (t2 = t(motionEvent)) != null) {
                    return this.L.r0(t2);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    private void w(float[] fArr) {
        if ((this.I & 12) != 0) {
            fArr[0] = (this.D + this.B) - this.w.p.getLeft();
        } else {
            fArr[0] = this.w.p.getTranslationX();
        }
        if ((this.I & 3) != 0) {
            fArr[1] = (this.E + this.C) - this.w.p.getTop();
        } else {
            fArr[1] = this.w.p.getTranslationY();
        }
    }

    private static boolean y(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    public void A() {
        VelocityTracker velocityTracker = this.N;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.N = VelocityTracker.obtain();
    }

    public void B(h hVar, int i2) {
        this.L.post(new d(hVar, i2));
    }

    public void D(View view) {
        if (view == this.R) {
            this.R = null;
            if (this.Q != null) {
                this.L.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean E() {
        int i2;
        int i3;
        int i4;
        if (this.w == null) {
            this.X = Long.MIN_VALUE;
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.X;
        long j3 = j2 == Long.MIN_VALUE ? 0L : currentTimeMillis - j2;
        RecyclerView.o layoutManager = this.L.getLayoutManager();
        if (this.W == null) {
            this.W = new Rect();
        }
        layoutManager.m(this.w.p, this.W);
        if (layoutManager.n()) {
            int i5 = (int) (this.D + this.B);
            int paddingLeft = (i5 - this.W.left) - this.L.getPaddingLeft();
            float f2 = this.B;
            if ((f2 < 0.0f && paddingLeft < 0) || (f2 > 0.0f && (paddingLeft = ((this.w.p.getWidth() + i5) + this.W.right) - (this.L.getWidth() - this.L.getPaddingRight())) > 0)) {
                i2 = paddingLeft;
                if (layoutManager.o()) {
                    int i6 = (int) (this.E + this.C);
                    int paddingTop = (i6 - this.W.top) - this.L.getPaddingTop();
                    float f3 = this.C;
                    if ((f3 < 0.0f && paddingTop < 0) || (f3 > 0.0f && (paddingTop = ((this.w.p.getHeight() + i6) + this.W.bottom) - (this.L.getHeight() - this.L.getPaddingBottom())) > 0)) {
                        i3 = paddingTop;
                        if (i2 != 0) {
                            i2 = this.G.r(this.L, this.w.p.getWidth(), i2, this.L.getWidth(), j3);
                        }
                        int i7 = i2;
                        if (i3 != 0) {
                            i4 = i7;
                            i3 = this.G.r(this.L, this.w.p.getHeight(), i3, this.L.getHeight(), j3);
                        } else {
                            i4 = i7;
                        }
                        if (i4 != 0 && i3 == 0) {
                            this.X = Long.MIN_VALUE;
                            return false;
                        }
                        if (this.X == Long.MIN_VALUE) {
                            this.X = currentTimeMillis;
                        }
                        this.L.scrollBy(i4, i3);
                        return true;
                    }
                }
                i3 = 0;
                if (i2 != 0) {
                }
                int i72 = i2;
                if (i3 != 0) {
                }
                if (i4 != 0) {
                }
                if (this.X == Long.MIN_VALUE) {
                }
                this.L.scrollBy(i4, i3);
                return true;
            }
        }
        i2 = 0;
        if (layoutManager.o()) {
        }
        i3 = 0;
        if (i2 != 0) {
        }
        int i722 = i2;
        if (i3 != 0) {
        }
        if (i4 != 0) {
        }
        if (this.X == Long.MIN_VALUE) {
        }
        this.L.scrollBy(i4, i3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F(@z1 RecyclerView.f0 f0Var, int i2) {
        boolean z;
        ViewParent parent;
        float signum;
        float f2;
        if (f0Var == this.w && i2 == this.H) {
            return;
        }
        this.X = Long.MIN_VALUE;
        int i3 = this.H;
        r(f0Var, true);
        this.H = i2;
        if (i2 == 2) {
            if (f0Var != null) {
                this.R = f0Var.p;
                l();
            } else {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
        }
        int i4 = (1 << ((i2 * 8) + 8)) - 1;
        RecyclerView.f0 f0Var2 = this.w;
        if (f0Var2 != null) {
            if (f0Var2.p.getParent() != null) {
                int L = i3 == 2 ? 0 : L(f0Var2);
                C();
                if (L != 1 && L != 2) {
                    f2 = (L == 4 || L == 8 || L == 16 || L == 32) ? Math.signum(this.B) * this.L.getWidth() : 0.0f;
                    signum = 0.0f;
                } else {
                    signum = Math.signum(this.C) * this.L.getHeight();
                    f2 = 0.0f;
                }
                int i5 = i3 == 2 ? 8 : L > 0 ? 2 : 4;
                w(this.v);
                float[] fArr = this.v;
                float f3 = fArr[0];
                float f4 = fArr[1];
                c cVar = new c(f0Var2, i5, i3, f3, f4, f2, signum, L, f0Var2);
                cVar.b(this.G.g(this.L, i5, f2 - f3, signum - f4));
                this.J.add(cVar);
                cVar.d();
                z = true;
            } else {
                D(f0Var2.p);
                this.G.c(this.L, f0Var2);
                z = false;
            }
            this.w = null;
        } else {
            z = false;
        }
        if (f0Var != null) {
            this.I = (this.G.f(this.L, f0Var) & i4) >> (this.H * 8);
            this.D = f0Var.p.getLeft();
            this.E = f0Var.p.getTop();
            this.w = f0Var;
            if (i2 == 2) {
                f0Var.p.performHapticFeedback(0);
                parent = this.L.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(this.w != null);
                }
                if (!z) {
                    this.L.getLayoutManager().O1();
                }
                this.G.C(this.w, this.H);
                this.L.invalidate();
            }
        }
        parent = this.L.getParent();
        if (parent != null) {
        }
        if (!z) {
        }
        this.G.C(this.w, this.H);
        this.L.invalidate();
    }

    public void H(@x1 RecyclerView.f0 f0Var) {
        if (this.G.p(this.L, f0Var) && f0Var.p.getParent() == this.L) {
            A();
            this.C = 0.0f;
            this.B = 0.0f;
            F(f0Var, 2);
        }
    }

    public void J(@x1 RecyclerView.f0 f0Var) {
        if (this.G.q(this.L, f0Var) && f0Var.p.getParent() == this.L) {
            A();
            this.C = 0.0f;
            this.B = 0.0f;
            F(f0Var, 1);
        }
    }

    public void M(MotionEvent motionEvent, int i2, int i3) {
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float f2 = x - this.x;
        this.B = f2;
        this.C = y - this.y;
        if ((i2 & 4) == 0) {
            this.B = Math.max(0.0f, f2);
        }
        if ((i2 & 8) == 0) {
            this.B = Math.min(0.0f, this.B);
        }
        if ((i2 & 1) == 0) {
            this.C = Math.max(0.0f, this.C);
        }
        if ((i2 & 2) == 0) {
            this.C = Math.min(0.0f, this.C);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b(@x1 View view) {
        D(view);
        RecyclerView.f0 r0 = this.L.r0(view);
        if (r0 == null) {
            return;
        }
        RecyclerView.f0 f0Var = this.w;
        if (f0Var != null && r0 == f0Var) {
            F(null, 0);
            return;
        }
        r(r0, false);
        if (this.u.remove(r0.p)) {
            this.G.c(this.L, r0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d(@x1 View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        float f2;
        float f3;
        this.S = -1;
        if (this.w != null) {
            w(this.v);
            float[] fArr = this.v;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.G.y(canvas, recyclerView, this.w, this.J, this.H, f2, f3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        float f2;
        float f3;
        if (this.w != null) {
            w(this.v);
            float[] fArr = this.v;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.G.z(canvas, recyclerView, this.w, this.J, this.H, f2, f3);
    }

    public void m(@z1 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.L;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            q();
        }
        this.L = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.z = resources.getDimension(o20.c.m);
            this.A = resources.getDimension(o20.c.l);
            G();
        }
    }

    public void o(int i2, MotionEvent motionEvent, int i3) {
        RecyclerView.f0 v;
        int f2;
        if (this.w != null || i2 != 2 || this.H == 2 || !this.G.s() || this.L.getScrollState() == 1 || (v = v(motionEvent)) == null || (f2 = (this.G.f(this.L, v) & 65280) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float f3 = x - this.x;
        float f4 = y - this.y;
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        int i4 = this.K;
        if (abs >= i4 || abs2 >= i4) {
            if (abs > abs2) {
                if (f3 < 0.0f && (f2 & 4) == 0) {
                    return;
                }
                if (f3 > 0.0f && (f2 & 8) == 0) {
                    return;
                }
            } else if (f4 < 0.0f && (f2 & 1) == 0) {
                return;
            } else {
                if (f4 > 0.0f && (f2 & 2) == 0) {
                    return;
                }
            }
            this.C = 0.0f;
            this.B = 0.0f;
            this.F = motionEvent.getPointerId(0);
            F(v, 1);
        }
    }

    public void r(RecyclerView.f0 f0Var, boolean z) {
        for (int size = this.J.size() - 1; size >= 0; size--) {
            h hVar = this.J.get(size);
            if (hVar.w == f0Var) {
                hVar.D |= z;
                if (!hVar.E) {
                    hVar.a();
                }
                this.J.remove(size);
                return;
            }
        }
    }

    public h s(MotionEvent motionEvent) {
        if (this.J.isEmpty()) {
            return null;
        }
        View t2 = t(motionEvent);
        for (int size = this.J.size() - 1; size >= 0; size--) {
            h hVar = this.J.get(size);
            if (hVar.w.p == t2) {
                return hVar;
            }
        }
        return null;
    }

    public View t(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.f0 f0Var = this.w;
        if (f0Var != null) {
            View view = f0Var.p;
            if (y(view, x, y, this.D + this.B, this.E + this.C)) {
                return view;
            }
        }
        for (int size = this.J.size() - 1; size >= 0; size--) {
            h hVar = this.J.get(size);
            View view2 = hVar.w.p;
            if (y(view2, x, y, hVar.B, hVar.C)) {
                return view2;
            }
        }
        return this.L.Y(x, y);
    }

    public boolean x() {
        int size = this.J.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.J.get(i2).E) {
                return true;
            }
        }
        return false;
    }

    public void z(RecyclerView.f0 f0Var) {
        if (!this.L.isLayoutRequested() && this.H == 2) {
            float k2 = this.G.k(f0Var);
            int i2 = (int) (this.D + this.B);
            int i3 = (int) (this.E + this.C);
            if (Math.abs(i3 - f0Var.p.getTop()) >= f0Var.p.getHeight() * k2 || Math.abs(i2 - f0Var.p.getLeft()) >= f0Var.p.getWidth() * k2) {
                List<RecyclerView.f0> u = u(f0Var);
                if (u.size() == 0) {
                    return;
                }
                RecyclerView.f0 b2 = this.G.b(f0Var, u, i2, i3);
                if (b2 == null) {
                    this.O.clear();
                    this.P.clear();
                    return;
                }
                int j2 = b2.j();
                int j3 = f0Var.j();
                if (this.G.A(this.L, f0Var, b2)) {
                    this.G.B(this.L, f0Var, j3, b2, j2, i2, i3);
                }
            }
        }
    }
}