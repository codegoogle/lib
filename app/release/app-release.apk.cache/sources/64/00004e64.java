package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.ge;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TouchResponse.java */
/* loaded from: classes.dex */
public class le {
    private static final String a = "TouchResponse";
    private static final boolean b = false;
    private static final int c = 1000;
    private static final float d = 1.0E-7f;
    private static final float[][] e = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] f = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 3;
    private static final int k = 4;
    private static final int l = 5;
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 3;
    private static final int q = 4;
    private static final int r = 5;
    private static final int s = 6;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 4;
    public static final int w = 0;
    public static final int x = 1;
    private int A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    public float G;
    public float H;
    private int I;
    public boolean J;
    private float K;
    private float L;
    private boolean M;
    private float[] N;
    private int[] O;
    private float P;
    private float Q;
    private final ge R;
    private float S;
    private float T;
    private boolean U;
    private float V;
    private int W;
    private float X;
    private float Y;
    private float Z;
    private float a0;
    private float b0;
    private int c0;
    private int d0;
    private int y;
    private int z;

    /* compiled from: TouchResponse.java */
    /* loaded from: classes.dex */
    public class a implements View.OnTouchListener {
        public a(final le this$0) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* compiled from: TouchResponse.java */
    /* loaded from: classes.dex */
    public class b implements NestedScrollView.c {
        public b(final le this$0) {
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
        }
    }

    public le(Context context, ge layout, XmlPullParser parser) {
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = -1;
        this.J = false;
        this.K = 0.0f;
        this.L = 1.0f;
        this.M = false;
        this.N = new float[2];
        this.O = new int[2];
        this.S = 4.0f;
        this.T = 1.2f;
        this.U = true;
        this.V = 1.0f;
        this.W = 0;
        this.X = 10.0f;
        this.Y = 10.0f;
        this.Z = 1.0f;
        this.a0 = Float.NaN;
        this.b0 = Float.NaN;
        this.c0 = 0;
        this.d0 = 0;
        this.R = layout;
        c(context, Xml.asAttributeSet(parser));
    }

    private void b(TypedArray a2) {
        int indexCount = a2.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = a2.getIndex(i2);
            if (index == ff.m.Qk) {
                this.B = a2.getResourceId(index, this.B);
            } else if (index == ff.m.Rk) {
                int i3 = a2.getInt(index, this.y);
                this.y = i3;
                float[][] fArr = e;
                this.F = fArr[i3][0];
                this.E = fArr[i3][1];
            } else if (index == ff.m.Bk) {
                int i4 = a2.getInt(index, this.z);
                this.z = i4;
                float[][] fArr2 = f;
                if (i4 < fArr2.length) {
                    this.K = fArr2[i4][0];
                    this.L = fArr2[i4][1];
                } else {
                    this.L = Float.NaN;
                    this.K = Float.NaN;
                    this.J = true;
                }
            } else if (index == ff.m.Gk) {
                this.S = a2.getFloat(index, this.S);
            } else if (index == ff.m.Fk) {
                this.T = a2.getFloat(index, this.T);
            } else if (index == ff.m.Hk) {
                this.U = a2.getBoolean(index, this.U);
            } else if (index == ff.m.Ck) {
                this.V = a2.getFloat(index, this.V);
            } else if (index == ff.m.Dk) {
                this.X = a2.getFloat(index, this.X);
            } else if (index == ff.m.Sk) {
                this.C = a2.getResourceId(index, this.C);
            } else if (index == ff.m.Jk) {
                this.A = a2.getInt(index, this.A);
            } else if (index == ff.m.Ik) {
                this.W = a2.getInteger(index, 0);
            } else if (index == ff.m.Ek) {
                this.D = a2.getResourceId(index, 0);
            } else if (index == ff.m.Kk) {
                this.I = a2.getResourceId(index, this.I);
            } else if (index == ff.m.Mk) {
                this.Y = a2.getFloat(index, this.Y);
            } else if (index == ff.m.Nk) {
                this.Z = a2.getFloat(index, this.Z);
            } else if (index == ff.m.Ok) {
                this.a0 = a2.getFloat(index, this.a0);
            } else if (index == ff.m.Pk) {
                this.b0 = a2.getFloat(index, this.b0);
            } else if (index == ff.m.Lk) {
                this.c0 = a2.getInt(index, this.c0);
            } else if (index == ff.m.Ak) {
                this.d0 = a2.getInt(index, this.d0);
            }
        }
    }

    private void c(Context context, AttributeSet attrs) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, ff.m.zk);
        b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public void A(float lastTouchX, float lastTouchY) {
        this.P = lastTouchX;
        this.Q = lastTouchY;
    }

    public void B(float acceleration) {
        this.T = acceleration;
    }

    public void C(float velocity) {
        this.S = velocity;
    }

    public void D(boolean rtl) {
        if (rtl) {
            float[][] fArr = f;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = e;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = e;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = e;
        int i2 = this.y;
        this.F = fArr5[i2][0];
        this.E = fArr5[i2][1];
        int i3 = this.z;
        float[][] fArr6 = f;
        if (i3 >= fArr6.length) {
            return;
        }
        this.K = fArr6[i3][0];
        this.L = fArr6[i3][1];
    }

    public void E(float x2, float y) {
        this.F = x2;
        this.E = y;
    }

    public void F(int touchUpMode) {
        this.A = touchUpMode;
    }

    public void G(float lastTouchX, float lastTouchY) {
        this.P = lastTouchX;
        this.Q = lastTouchY;
        this.M = false;
    }

    public void H() {
        View view;
        int i2 = this.B;
        if (i2 != -1) {
            view = this.R.findViewById(i2);
            if (view == null) {
                qd.i(this.R.getContext(), this.B);
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a(this));
            nestedScrollView.setOnScrollChangeListener(new b(this));
        }
    }

    public float a(float dx, float dy) {
        return (dy * this.L) + (dx * this.K);
    }

    public int d() {
        return this.B;
    }

    public int e() {
        return this.d0;
    }

    public int f() {
        return this.W;
    }

    public RectF g(ViewGroup layout, RectF rect) {
        View findViewById;
        int i2 = this.D;
        if (i2 == -1 || (findViewById = layout.findViewById(i2)) == null) {
            return null;
        }
        rect.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rect;
    }

    public int h() {
        return this.D;
    }

    public float i() {
        return this.T;
    }

    public float j() {
        return this.S;
    }

    public boolean k() {
        return this.U;
    }

    public float l(float dx, float dy) {
        this.R.u0(this.B, this.R.getProgress(), this.F, this.E, this.N);
        float f2 = this.K;
        if (f2 != 0.0f) {
            float[] fArr = this.N;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (dx * f2) / fArr[0];
        }
        float[] fArr2 = this.N;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (dy * this.L) / fArr2[1];
    }

    public int m() {
        return this.c0;
    }

    public float n() {
        return this.Y;
    }

    public float o() {
        return this.Z;
    }

    public float p() {
        return this.a0;
    }

    public float q() {
        return this.b0;
    }

    public RectF r(ViewGroup layout, RectF rect) {
        View findViewById;
        int i2 = this.C;
        if (i2 == -1 || (findViewById = layout.findViewById(i2)) == null) {
            return null;
        }
        rect.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rect;
    }

    public int s() {
        return this.C;
    }

    public boolean t() {
        return this.M;
    }

    public String toString() {
        if (Float.isNaN(this.K)) {
            return td.d;
        }
        return this.K + " , " + this.L;
    }

    public void u(MotionEvent event, ge.i velocityTracker, int currentState, ie motionScene) {
        float f2;
        int i2;
        float f3;
        if (this.J) {
            v(event, velocityTracker, currentState, motionScene);
            return;
        }
        velocityTracker.e(event);
        int action = event.getAction();
        if (action == 0) {
            this.P = event.getRawX();
            this.Q = event.getRawY();
            this.M = false;
        } else if (action == 1) {
            this.M = false;
            velocityTracker.h(1000);
            float g2 = velocityTracker.g();
            float f4 = velocityTracker.f();
            float progress = this.R.getProgress();
            int i3 = this.B;
            if (i3 != -1) {
                this.R.u0(i3, progress, this.F, this.E, this.N);
            } else {
                float min = Math.min(this.R.getWidth(), this.R.getHeight());
                float[] fArr = this.N;
                fArr[1] = this.L * min;
                fArr[0] = min * this.K;
            }
            float f5 = this.K;
            float[] fArr2 = this.N;
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            if (f5 != 0.0f) {
                f2 = g2 / fArr2[0];
            } else {
                f2 = f4 / fArr2[1];
            }
            float f8 = !Float.isNaN(f2) ? (f2 / 3.0f) + progress : progress;
            if (f8 == 0.0f || f8 == 1.0f || (i2 = this.A) == 3) {
                if (0.0f >= f8 || 1.0f <= f8) {
                    this.R.setState(ge.m.FINISHED);
                    return;
                }
                return;
            }
            float f9 = ((double) f8) < 0.5d ? 0.0f : 1.0f;
            if (i2 == 6) {
                if (progress + f2 < 0.0f) {
                    f2 = Math.abs(f2);
                }
                f9 = 1.0f;
            }
            if (this.A == 7) {
                if (progress + f2 > 1.0f) {
                    f2 = -Math.abs(f2);
                }
                f9 = 0.0f;
            }
            this.R.V0(this.A, f9, f2);
            if (0.0f >= progress || 1.0f <= progress) {
                this.R.setState(ge.m.FINISHED);
            }
        } else if (action != 2) {
        } else {
            float rawY = event.getRawY() - this.Q;
            float rawX = event.getRawX() - this.P;
            if (Math.abs((this.L * rawY) + (this.K * rawX)) > this.X || this.M) {
                float progress2 = this.R.getProgress();
                if (!this.M) {
                    this.M = true;
                    this.R.setProgress(progress2);
                }
                int i4 = this.B;
                if (i4 != -1) {
                    this.R.u0(i4, progress2, this.F, this.E, this.N);
                } else {
                    float min2 = Math.min(this.R.getWidth(), this.R.getHeight());
                    float[] fArr3 = this.N;
                    fArr3[1] = this.L * min2;
                    fArr3[0] = min2 * this.K;
                }
                float f10 = this.K;
                float[] fArr4 = this.N;
                if (Math.abs(((this.L * fArr4[1]) + (f10 * fArr4[0])) * this.V) < 0.01d) {
                    float[] fArr5 = this.N;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                if (this.K != 0.0f) {
                    f3 = rawX / this.N[0];
                } else {
                    f3 = rawY / this.N[1];
                }
                float max = Math.max(Math.min(progress2 + f3, 1.0f), 0.0f);
                if (this.A == 6) {
                    max = Math.max(max, 0.01f);
                }
                if (this.A == 7) {
                    max = Math.min(max, 0.99f);
                }
                float progress3 = this.R.getProgress();
                if (max != progress3) {
                    int i5 = (progress3 > 0.0f ? 1 : (progress3 == 0.0f ? 0 : -1));
                    if (i5 == 0 || progress3 == 1.0f) {
                        this.R.n0(i5 == 0);
                    }
                    this.R.setProgress(max);
                    velocityTracker.h(1000);
                    this.R.U0 = this.K != 0.0f ? velocityTracker.g() / this.N[0] : velocityTracker.f() / this.N[1];
                } else {
                    this.R.U0 = 0.0f;
                }
                this.P = event.getRawX();
                this.Q = event.getRawY();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(MotionEvent event, ge.i velocityTracker, int currentState, ie motionScene) {
        float right;
        float f2;
        int top;
        int bottom;
        float rawY;
        int i2;
        float f3;
        int i3;
        float[] fArr;
        View findViewById;
        double atan2;
        float[] fArr2;
        velocityTracker.e(event);
        int action = event.getAction();
        if (action == 0) {
            this.P = event.getRawX();
            this.Q = event.getRawY();
            this.M = false;
        } else if (action != 1) {
            if (action != 2) {
                return;
            }
            event.getRawY();
            event.getRawX();
            float width = this.R.getWidth() / 2.0f;
            float height = this.R.getHeight() / 2.0f;
            int i4 = this.I;
            if (i4 != -1) {
                View findViewById2 = this.R.findViewById(i4);
                this.R.getLocationOnScreen(this.O);
                height = ((findViewById2.getBottom() + findViewById2.getTop()) / 2.0f) + this.O[1];
                width = this.O[0] + ((findViewById2.getRight() + findViewById2.getLeft()) / 2.0f);
            } else {
                int i5 = this.B;
                if (i5 != -1) {
                    if (this.R.findViewById(this.R.y0(i5).k()) != null) {
                        this.R.getLocationOnScreen(this.O);
                        width = this.O[0] + ((findViewById.getRight() + findViewById.getLeft()) / 2.0f);
                        height = this.O[1] + ((findViewById.getBottom() + findViewById.getTop()) / 2.0f);
                    }
                }
            }
            float rawX = event.getRawX() - width;
            float rawY2 = event.getRawY() - height;
            float atan22 = (float) (((Math.atan2(event.getRawY() - height, event.getRawX() - width) - Math.atan2(this.Q - height, this.P - width)) * 180.0d) / 3.141592653589793d);
            if (atan22 > 330.0f) {
                atan22 -= 360.0f;
            } else if (atan22 < -330.0f) {
                atan22 += 360.0f;
            }
            if (Math.abs(atan22) > 0.01d || this.M) {
                float progress = this.R.getProgress();
                if (!this.M) {
                    this.M = true;
                    this.R.setProgress(progress);
                }
                int i6 = this.B;
                if (i6 != -1) {
                    this.R.u0(i6, progress, this.F, this.E, this.N);
                    this.N[1] = (float) Math.toDegrees(fArr2[1]);
                } else {
                    this.N[1] = 360.0f;
                }
                float max = Math.max(Math.min(((atan22 * this.V) / this.N[1]) + progress, 1.0f), 0.0f);
                float progress2 = this.R.getProgress();
                if (max != progress2) {
                    int i7 = (progress2 > 0.0f ? 1 : (progress2 == 0.0f ? 0 : -1));
                    if (i7 == 0 || progress2 == 1.0f) {
                        this.R.n0(i7 == 0);
                    }
                    this.R.setProgress(max);
                    velocityTracker.h(1000);
                    float g2 = velocityTracker.g();
                    double f4 = velocityTracker.f();
                    double d2 = g2;
                    this.R.U0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(f4, d2) - atan2) * Math.hypot(f4, d2)) / Math.hypot(rawX, rawY2)));
                } else {
                    this.R.U0 = 0.0f;
                }
                this.P = event.getRawX();
                this.Q = event.getRawY();
            }
        } else {
            this.M = false;
            velocityTracker.h(16);
            float g3 = velocityTracker.g();
            float f5 = velocityTracker.f();
            float progress3 = this.R.getProgress();
            float width2 = this.R.getWidth() / 2.0f;
            float height2 = this.R.getHeight() / 2.0f;
            int i8 = this.I;
            if (i8 != -1) {
                View findViewById3 = this.R.findViewById(i8);
                this.R.getLocationOnScreen(this.O);
                right = this.O[0] + ((findViewById3.getRight() + findViewById3.getLeft()) / 2.0f);
                f2 = this.O[1];
                top = findViewById3.getTop();
                bottom = findViewById3.getBottom();
            } else {
                int i9 = this.B;
                if (i9 != -1) {
                    View findViewById4 = this.R.findViewById(this.R.y0(i9).k());
                    this.R.getLocationOnScreen(this.O);
                    right = this.O[0] + ((findViewById4.getRight() + findViewById4.getLeft()) / 2.0f);
                    f2 = this.O[1];
                    top = findViewById4.getTop();
                    bottom = findViewById4.getBottom();
                }
                float rawX2 = event.getRawX() - width2;
                double degrees = Math.toDegrees(Math.atan2(event.getRawY() - height2, rawX2));
                i2 = this.B;
                if (i2 == -1) {
                    this.R.u0(i2, progress3, this.F, this.E, this.N);
                    this.N[1] = (float) Math.toDegrees(fArr[1]);
                } else {
                    this.N[1] = 360.0f;
                }
                float degrees2 = ((float) (Math.toDegrees(Math.atan2(f5 + rawY, g3 + rawX2)) - degrees)) * 62.5f;
                f3 = Float.isNaN(degrees2) ? (((degrees2 * 3.0f) * this.V) / this.N[1]) + progress3 : progress3;
                if (f3 != 0.0f || f3 == 1.0f || (i3 = this.A) == 3) {
                    if (0.0f < f3 || 1.0f <= f3) {
                        this.R.setState(ge.m.FINISHED);
                    }
                    return;
                }
                float f6 = (degrees2 * this.V) / this.N[1];
                float f7 = ((double) f3) < 0.5d ? 0.0f : 1.0f;
                if (i3 == 6) {
                    if (progress3 + f6 < 0.0f) {
                        f6 = Math.abs(f6);
                    }
                    f7 = 1.0f;
                }
                if (this.A == 7) {
                    if (progress3 + f6 > 1.0f) {
                        f6 = -Math.abs(f6);
                    }
                    f7 = 0.0f;
                }
                this.R.V0(this.A, f7, f6 * 3.0f);
                if (0.0f >= progress3 || 1.0f <= progress3) {
                    this.R.setState(ge.m.FINISHED);
                    return;
                }
                return;
            }
            height2 = f2 + ((bottom + top) / 2.0f);
            width2 = right;
            float rawX22 = event.getRawX() - width2;
            double degrees3 = Math.toDegrees(Math.atan2(event.getRawY() - height2, rawX22));
            i2 = this.B;
            if (i2 == -1) {
            }
            float degrees22 = ((float) (Math.toDegrees(Math.atan2(f5 + rawY, g3 + rawX22)) - degrees3)) * 62.5f;
            if (Float.isNaN(degrees22)) {
            }
            if (f3 != 0.0f) {
            }
            if (0.0f < f3) {
            }
            this.R.setState(ge.m.FINISHED);
        }
    }

    public void w(float dx, float dy) {
        float f2;
        float progress = this.R.getProgress();
        if (!this.M) {
            this.M = true;
            this.R.setProgress(progress);
        }
        this.R.u0(this.B, progress, this.F, this.E, this.N);
        float f3 = this.K;
        float[] fArr = this.N;
        if (Math.abs((this.L * fArr[1]) + (f3 * fArr[0])) < 0.01d) {
            float[] fArr2 = this.N;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f4 = this.K;
        if (f4 != 0.0f) {
            f2 = (dx * f4) / this.N[0];
        } else {
            f2 = (dy * this.L) / this.N[1];
        }
        float max = Math.max(Math.min(progress + f2, 1.0f), 0.0f);
        if (max != this.R.getProgress()) {
            this.R.setProgress(max);
        }
    }

    public void x(float dx, float dy) {
        float f2;
        this.M = false;
        float progress = this.R.getProgress();
        this.R.u0(this.B, progress, this.F, this.E, this.N);
        float f3 = this.K;
        float[] fArr = this.N;
        float f4 = fArr[0];
        float f5 = this.L;
        float f6 = fArr[1];
        if (f3 != 0.0f) {
            f2 = (dx * f3) / fArr[0];
        } else {
            f2 = (dy * f5) / fArr[1];
        }
        if (!Float.isNaN(f2)) {
            progress += f2 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z = progress != 1.0f;
            int i2 = this.A;
            if ((i2 != 3) && z) {
                this.R.V0(i2, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f2);
            }
        }
    }

    public void y(int id) {
        this.B = id;
    }

    public void z(int autoCompleteMode) {
        this.d0 = autoCompleteMode;
    }

    public le(ge layout, je onSwipe) {
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = -1;
        this.J = false;
        this.K = 0.0f;
        this.L = 1.0f;
        this.M = false;
        this.N = new float[2];
        this.O = new int[2];
        this.S = 4.0f;
        this.T = 1.2f;
        this.U = true;
        this.V = 1.0f;
        this.W = 0;
        this.X = 10.0f;
        this.Y = 10.0f;
        this.Z = 1.0f;
        this.a0 = Float.NaN;
        this.b0 = Float.NaN;
        this.c0 = 0;
        this.d0 = 0;
        this.R = layout;
        this.B = onSwipe.q();
        int r2 = onSwipe.r();
        this.y = r2;
        if (r2 != -1) {
            float[][] fArr = e;
            this.F = fArr[r2][0];
            this.E = fArr[r2][1];
        }
        int b2 = onSwipe.b();
        this.z = b2;
        float[][] fArr2 = f;
        if (b2 < fArr2.length) {
            this.K = fArr2[b2][0];
            this.L = fArr2[b2][1];
        } else {
            this.L = Float.NaN;
            this.K = Float.NaN;
            this.J = true;
        }
        this.S = onSwipe.g();
        this.T = onSwipe.f();
        this.U = onSwipe.h();
        this.V = onSwipe.c();
        this.X = onSwipe.d();
        this.C = onSwipe.s();
        this.A = onSwipe.j();
        this.W = onSwipe.i();
        this.D = onSwipe.e();
        this.I = onSwipe.k();
        this.c0 = onSwipe.l();
        this.Y = onSwipe.m();
        this.Z = onSwipe.n();
        this.a0 = onSwipe.o();
        this.b0 = onSwipe.p();
        this.d0 = onSwipe.a();
    }
}