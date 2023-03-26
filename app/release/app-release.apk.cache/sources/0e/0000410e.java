package com.p7700g.p99005;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public class eu {
    private static final String a = "ViewDragHelper";
    public static final int b = -1;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 8;
    public static final int j = 15;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 3;
    private static final int n = 20;
    private static final int o = 256;
    private static final int p = 600;
    private static final Interpolator q = new a();
    private int[] A;
    private int B;
    private VelocityTracker C;
    private float D;
    private float E;
    private int F;
    private final int G;
    private int H;
    private OverScroller I;
    private final c J;
    private View K;
    private boolean L;
    private final ViewGroup M;
    private int r;
    private int s;
    private float[] u;
    private float[] v;
    private float[] w;
    private float[] x;
    private int[] y;
    private int[] z;
    private int t = -1;
    private final Runnable N = new b();

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            eu.this.R(0);
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public int a(@x1 View view, int i, int i2) {
            return 0;
        }

        public int b(@x1 View view, int i, int i2) {
            return 0;
        }

        public int c(int i) {
            return i;
        }

        public int d(@x1 View view) {
            return 0;
        }

        public int e(@x1 View view) {
            return 0;
        }

        public void f(int i, int i2) {
        }

        public boolean g(int i) {
            return false;
        }

        public void h(int i, int i2) {
        }

        public void i(@x1 View view, int i) {
        }

        public void j(int i) {
        }

        public void k(@x1 View view, int i, int i2, @c2 int i3, @c2 int i4) {
        }

        public void l(@x1 View view, float f, float f2) {
        }

        public abstract boolean m(@x1 View view, int i);
    }

    private eu(@x1 Context context, @x1 ViewGroup viewGroup, @x1 c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar != null) {
            this.M = viewGroup;
            this.J = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.G = i2;
            this.F = i2;
            this.s = viewConfiguration.getScaledTouchSlop();
            this.D = viewConfiguration.getScaledMaximumFlingVelocity();
            this.E = viewConfiguration.getScaledMinimumFlingVelocity();
            this.I = new OverScroller(context, q);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    private int C(int i2, int i3) {
        int i4 = i2 < this.M.getLeft() + this.F ? 1 : 0;
        if (i3 < this.M.getTop() + this.F) {
            i4 |= 4;
        }
        if (i2 > this.M.getRight() - this.F) {
            i4 |= 2;
        }
        return i3 > this.M.getBottom() - this.F ? i4 | 8 : i4;
    }

    private boolean K(int i2) {
        return J(i2);
    }

    private void N() {
        this.C.computeCurrentVelocity(1000, this.D);
        r(i(this.C.getXVelocity(this.t), this.E, this.D), i(this.C.getYVelocity(this.t), this.E, this.D));
    }

    private void O(float f2, float f3, int i2) {
        int i3 = e(f2, f3, i2, 1) ? 1 : 0;
        if (e(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (e(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (e(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.z;
            iArr[i2] = iArr[i2] | i3;
            this.J.f(i3, i2);
        }
    }

    private void P(float f2, float f3, int i2) {
        u(i2);
        float[] fArr = this.u;
        this.w[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.v;
        this.x[i2] = f3;
        fArr2[i2] = f3;
        this.y[i2] = C((int) f2, (int) f3);
        this.B |= 1 << i2;
    }

    private void Q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (K(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.w[pointerId] = x;
                this.x[pointerId] = y;
            }
        }
    }

    private boolean e(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.y[i2] & i3) != i3 || (this.H & i3) == 0 || (this.A[i2] & i3) == i3 || (this.z[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.s;
        if (abs > i4 || abs2 > i4) {
            if (abs >= abs2 * 0.5f || !this.J.g(i3)) {
                return (this.z[i2] & i3) == 0 && abs > ((float) this.s);
            }
            int[] iArr = this.A;
            iArr[i2] = iArr[i2] | i3;
            return false;
        }
        return false;
    }

    private boolean h(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.J.d(view) > 0;
        boolean z2 = this.J.e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.s) : z2 && Math.abs(f3) > ((float) this.s);
        }
        float f4 = f3 * f3;
        int i2 = this.s;
        return f4 + (f2 * f2) > ((float) (i2 * i2));
    }

    private float i(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private int j(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    private void k() {
        float[] fArr = this.u;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.v, 0.0f);
        Arrays.fill(this.w, 0.0f);
        Arrays.fill(this.x, 0.0f);
        Arrays.fill(this.y, 0);
        Arrays.fill(this.z, 0);
        Arrays.fill(this.A, 0);
        this.B = 0;
    }

    private void l(int i2) {
        if (this.u == null || !J(i2)) {
            return;
        }
        this.u[i2] = 0.0f;
        this.v[i2] = 0.0f;
        this.w[i2] = 0.0f;
        this.x[i2] = 0.0f;
        this.y[i2] = 0;
        this.z[i2] = 0;
        this.A[i2] = 0;
        this.B = (~(1 << i2)) & this.B;
    }

    private int m(int i2, int i3, int i4) {
        int abs;
        if (i2 == 0) {
            return 0;
        }
        int width = this.M.getWidth();
        float f2 = width / 2;
        float s = (s(Math.min(1.0f, Math.abs(i2) / width)) * f2) + f2;
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(s / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private int n(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int j2 = j(i4, (int) this.E, (int) this.D);
        int j3 = j(i5, (int) this.E, (int) this.D);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(j2);
        int abs4 = Math.abs(j3);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (j2 != 0) {
            f2 = abs3;
            f3 = i6;
        } else {
            f2 = abs;
            f3 = i7;
        }
        float f6 = f2 / f3;
        if (j3 != 0) {
            f4 = abs4;
            f5 = i6;
        } else {
            f4 = abs2;
            f5 = i7;
        }
        return (int) ((m(i3, j3, this.J.e(view)) * (f4 / f5)) + (m(i2, j2, this.J.d(view)) * f6));
    }

    public static eu p(@x1 ViewGroup viewGroup, float f2, @x1 c cVar) {
        eu q2 = q(viewGroup, cVar);
        q2.s = (int) ((1.0f / f2) * q2.s);
        return q2;
    }

    public static eu q(@x1 ViewGroup viewGroup, @x1 c cVar) {
        return new eu(viewGroup.getContext(), viewGroup, cVar);
    }

    private void r(float f2, float f3) {
        this.L = true;
        this.J.l(this.K, f2, f3);
        this.L = false;
        if (this.r == 1) {
            R(0);
        }
    }

    private float s(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    private void t(int i2, int i3, int i4, int i5) {
        int left = this.K.getLeft();
        int top = this.K.getTop();
        if (i4 != 0) {
            i2 = this.J.a(this.K, i2, i4);
            sr.d1(this.K, i2 - left);
        }
        int i6 = i2;
        if (i5 != 0) {
            i3 = this.J.b(this.K, i3, i5);
            sr.e1(this.K, i3 - top);
        }
        int i7 = i3;
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.J.k(this.K, i6, i7, i6 - left, i7 - top);
    }

    private void u(int i2) {
        float[] fArr = this.u;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.v;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.w;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.x;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.y;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.z;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.A;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.u = fArr2;
            this.v = fArr3;
            this.w = fArr4;
            this.x = fArr5;
            this.y = iArr;
            this.z = iArr2;
            this.A = iArr3;
        }
    }

    private boolean x(int i2, int i3, int i4, int i5) {
        int left = this.K.getLeft();
        int top = this.K.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.I.abortAnimation();
            R(0);
            return false;
        }
        this.I.startScroll(left, top, i6, i7, n(this.K, i6, i7, i4, i5));
        R(2);
        return true;
    }

    @c2
    public int A() {
        return this.G;
    }

    @c2
    public int B() {
        return this.F;
    }

    public float D() {
        return this.E;
    }

    @c2
    public int E() {
        return this.s;
    }

    public int F() {
        return this.r;
    }

    public boolean G(int i2, int i3) {
        return L(this.K, i2, i3);
    }

    public boolean H(int i2) {
        int length = this.y.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (I(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean I(int i2, int i3) {
        return J(i3) && (i2 & this.y[i3]) != 0;
    }

    public boolean J(int i2) {
        return ((1 << i2) & this.B) != 0;
    }

    public boolean L(@z1 View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public void M(@x1 MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.C == null) {
            this.C = VelocityTracker.obtain();
        }
        this.C.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View v = v((int) x, (int) y);
            P(x, y, pointerId);
            Y(v, pointerId);
            int i4 = this.y[pointerId];
            int i5 = this.H;
            if ((i4 & i5) != 0) {
                this.J.h(i4 & i5, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.r == 1) {
                N();
            }
            c();
        } else if (actionMasked == 2) {
            if (this.r == 1) {
                if (K(this.t)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.t);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.w;
                    int i6 = this.t;
                    int i7 = (int) (x2 - fArr[i6]);
                    int i8 = (int) (y2 - this.x[i6]);
                    t(this.K.getLeft() + i7, this.K.getTop() + i8, i7, i8);
                    Q(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i3 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i3);
                if (K(pointerId2)) {
                    float x3 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f2 = x3 - this.u[pointerId2];
                    float f3 = y3 - this.v[pointerId2];
                    O(f2, f3, pointerId2);
                    if (this.r != 1) {
                        View v2 = v((int) x3, (int) y3);
                        if (h(v2, f2, f3) && Y(v2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            Q(motionEvent);
        } else if (actionMasked == 3) {
            if (this.r == 1) {
                r(0.0f, 0.0f);
            }
            c();
        } else if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            P(x4, y4, pointerId3);
            if (this.r == 0) {
                Y(v((int) x4, (int) y4), pointerId3);
                int i9 = this.y[pointerId3];
                int i10 = this.H;
                if ((i9 & i10) != 0) {
                    this.J.h(i9 & i10, pointerId3);
                }
            } else if (G((int) x4, (int) y4)) {
                Y(this.K, pointerId3);
            }
        } else if (actionMasked != 6) {
        } else {
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            if (this.r == 1 && pointerId4 == this.t) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i3 >= pointerCount2) {
                        i2 = -1;
                        break;
                    }
                    int pointerId5 = motionEvent.getPointerId(i3);
                    if (pointerId5 != this.t) {
                        View v3 = v((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                        View view = this.K;
                        if (v3 == view && Y(view, pointerId5)) {
                            i2 = this.t;
                            break;
                        }
                    }
                    i3++;
                }
                if (i2 == -1) {
                    N();
                }
            }
            l(pointerId4);
        }
    }

    public void R(int i2) {
        this.M.removeCallbacks(this.N);
        if (this.r != i2) {
            this.r = i2;
            this.J.j(i2);
            if (this.r == 0) {
                this.K = null;
            }
        }
    }

    public void S(@p1(from = 0) @c2 int i2) {
        this.F = i2;
    }

    public void T(int i2) {
        this.H = i2;
    }

    public void U(float f2) {
        this.E = f2;
    }

    public boolean V(int i2, int i3) {
        if (this.L) {
            return x(i2, i3, (int) this.C.getXVelocity(this.t), (int) this.C.getYVelocity(this.t));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean W(@x1 MotionEvent motionEvent) {
        boolean z;
        View v;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.C == null) {
            this.C = VelocityTracker.obtain();
        }
        this.C.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            P(x, y, pointerId);
                            int i2 = this.r;
                            if (i2 == 0) {
                                int i3 = this.y[pointerId];
                                int i4 = this.H;
                                if ((i3 & i4) != 0) {
                                    this.J.h(i3 & i4, pointerId);
                                }
                            } else if (i2 == 2 && (v = v((int) x, (int) y)) == this.K) {
                                Y(v, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            l(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.u != null && this.v != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i5 = 0; i5 < pointerCount; i5++) {
                        int pointerId2 = motionEvent.getPointerId(i5);
                        if (K(pointerId2)) {
                            float x2 = motionEvent.getX(i5);
                            float y2 = motionEvent.getY(i5);
                            float f2 = x2 - this.u[pointerId2];
                            float f3 = y2 - this.v[pointerId2];
                            View v2 = v((int) x2, (int) y2);
                            boolean z2 = v2 != null && h(v2, f2, f3);
                            if (z2) {
                                int left = v2.getLeft();
                                int i6 = (int) f2;
                                int a2 = this.J.a(v2, left + i6, i6);
                                int top = v2.getTop();
                                int i7 = (int) f3;
                                int b2 = this.J.b(v2, top + i7, i7);
                                int d2 = this.J.d(v2);
                                int e2 = this.J.e(v2);
                                if (d2 != 0) {
                                    if (d2 > 0) {
                                    }
                                }
                                if (e2 == 0) {
                                    break;
                                } else if (e2 > 0 && b2 == top) {
                                    break;
                                }
                            }
                            O(f2, f3, pointerId2);
                            if (this.r != 1) {
                                if (z2 && Y(v2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    Q(motionEvent);
                }
                z = false;
            }
            c();
            z = false;
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            z = false;
            int pointerId3 = motionEvent.getPointerId(0);
            P(x3, y3, pointerId3);
            View v3 = v((int) x3, (int) y3);
            if (v3 == this.K && this.r == 2) {
                Y(v3, pointerId3);
            }
            int i8 = this.y[pointerId3];
            int i9 = this.H;
            if ((i8 & i9) != 0) {
                this.J.h(i8 & i9, pointerId3);
            }
        }
        if (this.r == 1) {
            return true;
        }
        return z;
    }

    public boolean X(@x1 View view, int i2, int i3) {
        this.K = view;
        this.t = -1;
        boolean x = x(i2, i3, 0, 0);
        if (!x && this.r == 0 && this.K != null) {
            this.K = null;
        }
        return x;
    }

    public boolean Y(View view, int i2) {
        if (view == this.K && this.t == i2) {
            return true;
        }
        if (view == null || !this.J.m(view, i2)) {
            return false;
        }
        this.t = i2;
        d(view, i2);
        return true;
    }

    public void a() {
        c();
        if (this.r == 2) {
            int currX = this.I.getCurrX();
            int currY = this.I.getCurrY();
            this.I.abortAnimation();
            int currX2 = this.I.getCurrX();
            int currY2 = this.I.getCurrY();
            this.J.k(this.K, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        R(0);
    }

    public boolean b(@x1 View view, boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i7 = i4 + scrollX;
                if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && (i6 = i5 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom() && b(childAt, true, i2, i3, i7 - childAt.getLeft(), i6 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && (view.canScrollHorizontally(-i2) || view.canScrollVertically(-i3));
    }

    public void c() {
        this.t = -1;
        k();
        VelocityTracker velocityTracker = this.C;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.C = null;
        }
    }

    public void d(@x1 View view, int i2) {
        if (view.getParent() == this.M) {
            this.K = view;
            this.t = i2;
            this.J.i(view, i2);
            R(1);
            return;
        }
        StringBuilder G = wo1.G("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        G.append(this.M);
        G.append(")");
        throw new IllegalArgumentException(G.toString());
    }

    public boolean f(int i2) {
        int length = this.u.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (g(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i2, int i3) {
        if (J(i3)) {
            boolean z = (i2 & 1) == 1;
            boolean z2 = (i2 & 2) == 2;
            float f2 = this.w[i3] - this.u[i3];
            float f3 = this.x[i3] - this.v[i3];
            if (!z || !z2) {
                return z ? Math.abs(f2) > ((float) this.s) : z2 && Math.abs(f3) > ((float) this.s);
            }
            float f4 = f3 * f3;
            int i4 = this.s;
            return f4 + (f2 * f2) > ((float) (i4 * i4));
        }
        return false;
    }

    public boolean o(boolean z) {
        if (this.r == 2) {
            boolean computeScrollOffset = this.I.computeScrollOffset();
            int currX = this.I.getCurrX();
            int currY = this.I.getCurrY();
            int left = currX - this.K.getLeft();
            int top = currY - this.K.getTop();
            if (left != 0) {
                sr.d1(this.K, left);
            }
            if (top != 0) {
                sr.e1(this.K, top);
            }
            if (left != 0 || top != 0) {
                this.J.k(this.K, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.I.getFinalX() && currY == this.I.getFinalY()) {
                this.I.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.M.post(this.N);
                } else {
                    R(0);
                }
            }
        }
        return this.r == 2;
    }

    @z1
    public View v(int i2, int i3) {
        for (int childCount = this.M.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.M.getChildAt(this.J.c(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void w(int i2, int i3, int i4, int i5) {
        if (this.L) {
            this.I.fling(this.K.getLeft(), this.K.getTop(), (int) this.C.getXVelocity(this.t), (int) this.C.getYVelocity(this.t), i2, i4, i3, i5);
            R(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }

    public int y() {
        return this.t;
    }

    @z1
    public View z() {
        return this.K;
    }
}