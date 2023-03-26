package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.ads.AdError;
import com.p7700g.p99005.bf;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.ie;
import com.p7700g.p99005.yb;
import com.p7700g.p99005.zb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MotionLayout.java */
/* loaded from: classes.dex */
public class ge extends ConstraintLayout implements gr {
    public static final int A0 = 3;
    public static final int B0 = 4;
    public static final int C0 = 5;
    public static final int D0 = 6;
    public static final int E0 = 7;
    public static final String F0 = "MotionLayout";
    private static final boolean G0 = false;
    public static boolean H0 = false;
    public static final int I0 = 0;
    public static final int J0 = 1;
    public static final int K0 = 2;
    public static final int L0 = 50;
    public static final int M0 = 0;
    public static final int N0 = 1;
    public static final int O0 = 2;
    public static final int P0 = 3;
    private static final float Q0 = 1.0E-5f;
    public static final int x0 = 0;
    public static final int y0 = 1;
    public static final int z0 = 2;
    public float A1;
    public float B1;
    public long C1;
    public float D1;
    private boolean E1;
    private ArrayList<de> F1;
    private ArrayList<de> G1;
    private ArrayList<de> H1;
    private CopyOnWriteArrayList<l> I1;
    private int J1;
    private long K1;
    private float L1;
    private int M1;
    private float N1;
    public boolean O1;
    public boolean P1;
    public int Q1;
    public ie R0;
    public int R1;
    public Interpolator S0;
    public int S1;
    public Interpolator T0;
    public int T1;
    public float U0;
    public int U1;
    private int V0;
    public int V1;
    public int W0;
    public float W1;
    private int X0;
    private k9 X1;
    private int Y0;
    private boolean Y1;
    private int Z0;
    private k Z1;
    private boolean a1;
    private Runnable a2;
    public HashMap<View, ce> b1;
    private int[] b2;
    private long c1;
    public int c2;
    private float d1;
    private boolean d2;
    public float e1;
    public int e2;
    public float f1;
    public HashMap<View, ld> f2;
    private long g1;
    private int g2;
    public float h1;
    private int h2;
    private boolean i1;
    private int i2;
    public boolean j1;
    public Rect j2;
    public boolean k1;
    private boolean k2;
    private l l1;
    public m l2;
    private float m1;
    public h m2;
    private float n1;
    private boolean n2;
    public int o1;
    private RectF o2;
    public g p1;
    private View p2;
    private boolean q1;
    private Matrix q2;
    private id r1;
    public ArrayList<Integer> r2;
    private f s1;
    private rd t1;
    public boolean u1;
    public int v1;
    public int w1;
    public int x1;
    public int y1;
    public boolean z1;

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ge.this.Z1.a();
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ge.this.d2 = false;
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ View s;

        public c(final ge this$0, final View val$target) {
            this.s = val$target;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.setNestedScrollingEnabled(true);
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ge.this.Z1.a();
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            m.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                iArr[m.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[m.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[m.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[m.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class f extends fe {
        public float a = 0.0f;
        public float b = 0.0f;
        public float c;

        public f() {
        }

        @Override // com.p7700g.p99005.fe
        public float a() {
            return ge.this.U0;
        }

        public void b(float velocity, float position, float maxAcceleration) {
            this.a = velocity;
            this.b = position;
            this.c = maxAcceleration;
        }

        @Override // com.p7700g.p99005.fe, android.animation.TimeInterpolator
        public float getInterpolation(float time) {
            float f = this.a;
            if (f > 0.0f) {
                float f2 = this.c;
                if (f / f2 < time) {
                    time = f / f2;
                }
                ge.this.U0 = f - (f2 * time);
                return ((f * time) - (((f2 * time) * time) / 2.0f)) + this.b;
            }
            float f3 = this.c;
            if ((-f) / f3 < time) {
                time = (-f) / f3;
            }
            ge.this.U0 = (f3 * time) + f;
            return (((f3 * time) * time) / 2.0f) + (f * time) + this.b;
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class g {
        private static final int a = 16;
        public float[] b;
        public int[] c;
        public float[] d;
        public Path e;
        public Paint f;
        public Paint g;
        public Paint h;
        public Paint i;
        public Paint j;
        private float[] k;
        public DashPathEffect q;
        public int r;
        public int u;
        public final int l = -21965;
        public final int m = -2067046;
        public final int n = -13391360;
        public final int o = 1996488704;
        public final int p = 10;
        public Rect s = new Rect();
        public boolean t = false;

        public g() {
            this.u = 1;
            Paint paint = new Paint();
            this.f = paint;
            paint.setAntiAlias(true);
            this.f.setColor(-21965);
            this.f.setStrokeWidth(2.0f);
            this.f.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.g = paint2;
            paint2.setAntiAlias(true);
            this.g.setColor(-2067046);
            this.g.setStrokeWidth(2.0f);
            this.g.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.h = paint3;
            paint3.setAntiAlias(true);
            this.h.setColor(-13391360);
            this.h.setStrokeWidth(2.0f);
            this.h.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.i = paint4;
            paint4.setAntiAlias(true);
            this.i.setColor(-13391360);
            this.i.setTextSize(ge.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.k = new float[8];
            Paint paint5 = new Paint();
            this.j = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.q = dashPathEffect;
            this.h.setPathEffect(dashPathEffect);
            this.d = new float[100];
            this.c = new int[50];
            if (this.t) {
                this.f.setStrokeWidth(8.0f);
                this.j.setStrokeWidth(8.0f);
                this.g.setStrokeWidth(8.0f);
                this.u = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.b, this.f);
        }

        private void d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.r; i++) {
                int[] iArr = this.c;
                if (iArr[i] == 1) {
                    z = true;
                }
                if (iArr[i] == 0) {
                    z2 = true;
                }
            }
            if (z) {
                g(canvas);
            }
            if (z2) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.b;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.h);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.h);
        }

        private void f(Canvas canvas, float x, float y) {
            float[] fArr = this.b;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            float min = Math.min(f, f3);
            float max = Math.max(f2, f4);
            float min2 = x - Math.min(f, f3);
            float max2 = Math.max(f2, f4) - y;
            StringBuilder G = wo1.G("");
            G.append(((int) (((min2 * 100.0f) / Math.abs(f3 - f)) + 0.5d)) / 100.0f);
            String sb = G.toString();
            m(sb, this.i);
            canvas.drawText(sb, ((min2 / 2.0f) - (this.s.width() / 2)) + min, y - 20.0f, this.i);
            canvas.drawLine(x, y, Math.min(f, f3), y, this.h);
            StringBuilder G2 = wo1.G("");
            G2.append(((int) (((max2 * 100.0f) / Math.abs(f4 - f2)) + 0.5d)) / 100.0f);
            String sb2 = G2.toString();
            m(sb2, this.i);
            canvas.drawText(sb2, x + 5.0f, max - ((max2 / 2.0f) - (this.s.height() / 2)), this.i);
            canvas.drawLine(x, y, x, Math.max(f2, f4), this.h);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.b;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.h);
        }

        private void h(Canvas canvas, float x, float y) {
            float[] fArr = this.b;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f - f3, f2 - f4);
            float f5 = f3 - f;
            float f6 = f4 - f2;
            float f7 = (((y - f2) * f6) + ((x - f) * f5)) / (hypot * hypot);
            float f8 = f + (f5 * f7);
            float f9 = f2 + (f7 * f6);
            Path path = new Path();
            path.moveTo(x, y);
            path.lineTo(f8, f9);
            float hypot2 = (float) Math.hypot(f8 - x, f9 - y);
            StringBuilder G = wo1.G("");
            G.append(((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            String sb = G.toString();
            m(sb, this.i);
            canvas.drawTextOnPath(sb, path, (hypot2 / 2.0f) - (this.s.width() / 2), -20.0f, this.i);
            canvas.drawLine(x, y, f8, f9, this.h);
        }

        private void i(Canvas canvas, float x, float y, int viewWidth, int viewHeight) {
            StringBuilder G = wo1.G("");
            G.append(((int) ((((x - (viewWidth / 2)) * 100.0f) / (ge.this.getWidth() - viewWidth)) + 0.5d)) / 100.0f);
            String sb = G.toString();
            m(sb, this.i);
            canvas.drawText(sb, ((x / 2.0f) - (this.s.width() / 2)) + 0.0f, y - 20.0f, this.i);
            canvas.drawLine(x, y, Math.min(0.0f, 1.0f), y, this.h);
            StringBuilder G2 = wo1.G("");
            G2.append(((int) ((((y - (viewHeight / 2)) * 100.0f) / (ge.this.getHeight() - viewHeight)) + 0.5d)) / 100.0f);
            String sb2 = G2.toString();
            m(sb2, this.i);
            canvas.drawText(sb2, x + 5.0f, 0.0f - ((y / 2.0f) - (this.s.height() / 2)), this.i);
            canvas.drawLine(x, y, x, Math.max(0.0f, 1.0f), this.h);
        }

        private void j(Canvas canvas, ce motionController) {
            this.e.reset();
            for (int i = 0; i <= 50; i++) {
                motionController.g(i / 50, this.k, 0);
                Path path = this.e;
                float[] fArr = this.k;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.e;
                float[] fArr2 = this.k;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.e;
                float[] fArr3 = this.k;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.e;
                float[] fArr4 = this.k;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.e.close();
            }
            this.f.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.e, this.f);
            canvas.translate(-2.0f, -2.0f);
            this.f.setColor(tk.c);
            canvas.drawPath(this.e, this.f);
        }

        private void k(Canvas canvas, int mode, int keyFrames, ce motionController) {
            int i;
            int i2;
            float f;
            float f2;
            View view = motionController.C;
            if (view != null) {
                i = view.getWidth();
                i2 = motionController.C.getHeight();
            } else {
                i = 0;
                i2 = 0;
            }
            for (int i3 = 1; i3 < keyFrames - 1; i3++) {
                if (mode != 4 || this.c[i3 - 1] != 0) {
                    float[] fArr = this.d;
                    int i4 = i3 * 2;
                    float f3 = fArr[i4];
                    float f4 = fArr[i4 + 1];
                    this.e.reset();
                    this.e.moveTo(f3, f4 + 10.0f);
                    this.e.lineTo(f3 + 10.0f, f4);
                    this.e.lineTo(f3, f4 - 10.0f);
                    this.e.lineTo(f3 - 10.0f, f4);
                    this.e.close();
                    int i5 = i3 - 1;
                    motionController.w(i5);
                    if (mode == 4) {
                        int[] iArr = this.c;
                        if (iArr[i5] == 1) {
                            h(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i5] == 0) {
                            f(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i5] == 2) {
                            f = f4;
                            f2 = f3;
                            i(canvas, f3 - 0.0f, f4 - 0.0f, i, i2);
                            canvas.drawPath(this.e, this.j);
                        }
                        f = f4;
                        f2 = f3;
                        canvas.drawPath(this.e, this.j);
                    } else {
                        f = f4;
                        f2 = f3;
                    }
                    if (mode == 2) {
                        h(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (mode == 3) {
                        f(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (mode == 6) {
                        i(canvas, f2 - 0.0f, f - 0.0f, i, i2);
                    }
                    canvas.drawPath(this.e, this.j);
                }
            }
            float[] fArr2 = this.b;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.g);
                float[] fArr3 = this.b;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.g);
            }
        }

        private void l(Canvas canvas, float x1, float y1, float x2, float y2) {
            canvas.drawRect(x1, y1, x2, y2, this.h);
            canvas.drawLine(x1, y1, x2, y2, this.h);
        }

        public void a(Canvas canvas, HashMap<View, ce> frameArrayList, int duration, int debugPath) {
            if (frameArrayList == null || frameArrayList.size() == 0) {
                return;
            }
            canvas.save();
            if (!ge.this.isInEditMode() && (debugPath & 1) == 2) {
                String str = ge.this.getContext().getResources().getResourceName(ge.this.X0) + ":" + ge.this.getProgress();
                canvas.drawText(str, 10.0f, ge.this.getHeight() - 30, this.i);
                canvas.drawText(str, 11.0f, ge.this.getHeight() - 29, this.f);
            }
            for (ce ceVar : frameArrayList.values()) {
                int q = ceVar.q();
                if (debugPath > 0 && q == 0) {
                    q = 1;
                }
                if (q != 0) {
                    this.r = ceVar.e(this.d, this.c);
                    if (q >= 1) {
                        int i = duration / 16;
                        float[] fArr = this.b;
                        if (fArr == null || fArr.length != i * 2) {
                            this.b = new float[i * 2];
                            this.e = new Path();
                        }
                        int i2 = this.u;
                        canvas.translate(i2, i2);
                        this.f.setColor(1996488704);
                        this.j.setColor(1996488704);
                        this.g.setColor(1996488704);
                        this.h.setColor(1996488704);
                        ceVar.f(this.b, i);
                        b(canvas, q, this.r, ceVar);
                        this.f.setColor(-21965);
                        this.g.setColor(-2067046);
                        this.j.setColor(-2067046);
                        this.h.setColor(-13391360);
                        int i3 = this.u;
                        canvas.translate(-i3, -i3);
                        b(canvas, q, this.r, ceVar);
                        if (q == 5) {
                            j(canvas, ceVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int mode, int keyFrames, ce motionController) {
            if (mode == 4) {
                d(canvas);
            }
            if (mode == 2) {
                g(canvas);
            }
            if (mode == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, mode, keyFrames, motionController);
        }

        public void m(String text, Paint paint) {
            paint.getTextBounds(text, 0, text.length(), this.s);
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class h {
        public ac a = new ac();
        public ac b = new ac();
        public af c = null;
        public af d = null;
        public int e;
        public int f;

        public h() {
        }

        private void b(int widthMeasureSpec, int heightMeasureSpec) {
            int optimizationLevel = ge.this.getOptimizationLevel();
            ge geVar = ge.this;
            if (geVar.W0 == geVar.getStartState()) {
                ge geVar2 = ge.this;
                ac acVar = this.b;
                af afVar = this.d;
                geVar2.v(acVar, optimizationLevel, (afVar == null || afVar.S1 == 0) ? widthMeasureSpec : heightMeasureSpec, (afVar == null || afVar.S1 == 0) ? heightMeasureSpec : widthMeasureSpec);
                af afVar2 = this.c;
                if (afVar2 != null) {
                    ge geVar3 = ge.this;
                    ac acVar2 = this.a;
                    int i = afVar2.S1;
                    int i2 = i == 0 ? widthMeasureSpec : heightMeasureSpec;
                    if (i == 0) {
                        widthMeasureSpec = heightMeasureSpec;
                    }
                    geVar3.v(acVar2, optimizationLevel, i2, widthMeasureSpec);
                    return;
                }
                return;
            }
            af afVar3 = this.c;
            if (afVar3 != null) {
                ge geVar4 = ge.this;
                ac acVar3 = this.a;
                int i3 = afVar3.S1;
                geVar4.v(acVar3, optimizationLevel, i3 == 0 ? widthMeasureSpec : heightMeasureSpec, i3 == 0 ? heightMeasureSpec : widthMeasureSpec);
            }
            ge geVar5 = ge.this;
            ac acVar4 = this.b;
            af afVar4 = this.d;
            int i4 = (afVar4 == null || afVar4.S1 == 0) ? widthMeasureSpec : heightMeasureSpec;
            if (afVar4 == null || afVar4.S1 == 0) {
                widthMeasureSpec = heightMeasureSpec;
            }
            geVar5.v(acVar4, optimizationLevel, i4, widthMeasureSpec);
        }

        @SuppressLint({"LogConditional"})
        private void d(String title, ac c) {
            StringBuilder L = wo1.L(title, " ");
            L.append(qd.k((View) c.w()));
            String sb = L.toString();
            String str = sb + "  ========= " + c;
            int size = c.l2().size();
            for (int i = 0; i < size; i++) {
                String str2 = sb + "[" + i + "] ";
                zb zbVar = c.l2().get(i);
                StringBuilder G = wo1.G("");
                G.append(zbVar.x0.h != null ? "T" : "_");
                StringBuilder G2 = wo1.G(G.toString());
                G2.append(zbVar.z0.h != null ? AFHydra.EV_BYTECOUNT : "_");
                StringBuilder G3 = wo1.G(G2.toString());
                G3.append(zbVar.w0.h != null ? "L" : "_");
                StringBuilder G4 = wo1.G(G3.toString());
                G4.append(zbVar.y0.h != null ? "R" : "_");
                String sb2 = G4.toString();
                View view = (View) zbVar.w();
                String k = qd.k(view);
                if (view instanceof TextView) {
                    StringBuilder L2 = wo1.L(k, "(");
                    L2.append((Object) ((TextView) view).getText());
                    L2.append(")");
                    k = L2.toString();
                }
                String str3 = str2 + g54.A + k + " " + zbVar + " " + sb2;
            }
        }

        @SuppressLint({"LogConditional"})
        private void e(String str, ConstraintLayout.b params) {
            StringBuilder G = wo1.G(" ");
            G.append(params.R != -1 ? "SS" : "__");
            StringBuilder G2 = wo1.G(G.toString());
            G2.append(params.Q != -1 ? "|SE" : "|__");
            StringBuilder G3 = wo1.G(G2.toString());
            G3.append(params.S != -1 ? "|ES" : "|__");
            StringBuilder G4 = wo1.G(G3.toString());
            G4.append(params.T != -1 ? "|EE" : "|__");
            StringBuilder G5 = wo1.G(G4.toString());
            G5.append(params.C != -1 ? "|LL" : "|__");
            StringBuilder G6 = wo1.G(G5.toString());
            G6.append(params.D != -1 ? "|LR" : "|__");
            StringBuilder G7 = wo1.G(G6.toString());
            G7.append(params.E != -1 ? "|RL" : "|__");
            StringBuilder G8 = wo1.G(G7.toString());
            G8.append(params.F != -1 ? "|RR" : "|__");
            StringBuilder G9 = wo1.G(G8.toString());
            G9.append(params.G != -1 ? "|TT" : "|__");
            StringBuilder G10 = wo1.G(G9.toString());
            G10.append(params.H != -1 ? "|TB" : "|__");
            StringBuilder G11 = wo1.G(G10.toString());
            G11.append(params.I != -1 ? "|BT" : "|__");
            StringBuilder G12 = wo1.G(G11.toString());
            G12.append(params.J != -1 ? "|BB" : "|__");
            G12.toString();
        }

        @SuppressLint({"LogConditional"})
        private void f(String str, zb child) {
            String str2;
            String str3;
            String str4;
            StringBuilder G = wo1.G(" ");
            yb ybVar = child.x0.h;
            String str5 = AFHydra.EV_BYTECOUNT;
            String str6 = "__";
            if (ybVar != null) {
                StringBuilder G2 = wo1.G("T");
                G2.append(child.x0.h.g == yb.b.TOP ? "T" : AFHydra.EV_BYTECOUNT);
                str2 = G2.toString();
            } else {
                str2 = "__";
            }
            G.append(str2);
            StringBuilder G3 = wo1.G(G.toString());
            if (child.z0.h != null) {
                StringBuilder G4 = wo1.G(AFHydra.EV_BYTECOUNT);
                if (child.z0.h.g == yb.b.TOP) {
                    str5 = "T";
                }
                G4.append(str5);
                str3 = G4.toString();
            } else {
                str3 = "__";
            }
            G3.append(str3);
            StringBuilder G5 = wo1.G(G3.toString());
            if (child.w0.h != null) {
                StringBuilder G6 = wo1.G("L");
                G6.append(child.w0.h.g == yb.b.LEFT ? "L" : "R");
                str4 = G6.toString();
            } else {
                str4 = "__";
            }
            G5.append(str4);
            StringBuilder G7 = wo1.G(G5.toString());
            if (child.y0.h != null) {
                StringBuilder G8 = wo1.G("R");
                G8.append(child.y0.h.g == yb.b.LEFT ? "L" : "R");
                str6 = G8.toString();
            }
            G7.append(str6);
            String str7 = str + G7.toString() + " ---  " + child;
        }

        private void m(ac base, af cSet) {
            SparseArray<zb> sparseArray = new SparseArray<>();
            bf.a aVar = new bf.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, base);
            sparseArray.put(ge.this.getId(), base);
            if (cSet != null && cSet.S1 != 0) {
                ge geVar = ge.this;
                geVar.v(this.b, geVar.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(ge.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(ge.this.getWidth(), 1073741824));
            }
            Iterator<zb> it = base.l2().iterator();
            while (it.hasNext()) {
                zb next = it.next();
                next.f1(true);
                sparseArray.put(((View) next.w()).getId(), next);
            }
            Iterator<zb> it2 = base.l2().iterator();
            while (it2.hasNext()) {
                zb next2 = it2.next();
                View view = (View) next2.w();
                cSet.u(view.getId(), aVar);
                next2.c2(cSet.u0(view.getId()));
                next2.y1(cSet.n0(view.getId()));
                if (view instanceof xe) {
                    cSet.s((xe) view, next2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).I();
                    }
                }
                aVar.resolveLayoutDirection(ge.this.getLayoutDirection());
                ge.this.h(false, view, next2, aVar, sparseArray);
                if (cSet.t0(view.getId()) == 1) {
                    next2.b2(view.getVisibility());
                } else {
                    next2.b2(cSet.s0(view.getId()));
                }
            }
            Iterator<zb> it3 = base.l2().iterator();
            while (it3.hasNext()) {
                zb next3 = it3.next();
                if (next3 instanceof ic) {
                    dc dcVar = (dc) next3;
                    ((xe) next3.w()).G(base, dcVar, sparseArray);
                    ((ic) dcVar).n2();
                }
            }
        }

        public void a() {
            int childCount = ge.this.getChildCount();
            ge.this.b1.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i = 0; i < childCount; i++) {
                View childAt = ge.this.getChildAt(i);
                ce ceVar = new ce(childAt);
                int id = childAt.getId();
                iArr[i] = id;
                sparseArray.put(id, ceVar);
                ge.this.b1.put(childAt, ceVar);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = ge.this.getChildAt(i2);
                ce ceVar2 = ge.this.b1.get(childAt2);
                if (ceVar2 != null) {
                    if (this.c == null) {
                        if (ge.this.d2) {
                            ld ldVar = ge.this.f2.get(childAt2);
                            ge geVar = ge.this;
                            ceVar2.X(ldVar, childAt2, geVar.e2, geVar.g2, ge.this.h2);
                        }
                    } else {
                        zb g = g(this.a, childAt2);
                        if (g != null) {
                            ceVar2.W(ge.this.U0(g), this.c, ge.this.getWidth(), ge.this.getHeight());
                        } else if (ge.this.o1 != 0) {
                            qd.g();
                            qd.k(childAt2);
                            childAt2.getClass().getName();
                        }
                    }
                    if (this.d != null) {
                        zb g2 = g(this.b, childAt2);
                        if (g2 != null) {
                            ceVar2.T(ge.this.U0(g2), this.d, ge.this.getWidth(), ge.this.getHeight());
                        } else if (ge.this.o1 != 0) {
                            qd.g();
                            qd.k(childAt2);
                            childAt2.getClass().getName();
                        }
                    }
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                ce ceVar3 = (ce) sparseArray.get(iArr[i3]);
                int k = ceVar3.k();
                if (k != -1) {
                    ceVar3.b0((ce) sparseArray.get(k));
                }
            }
        }

        public void c(ac src, ac dest) {
            zb zbVar;
            ArrayList<zb> l2 = src.l2();
            HashMap<zb, zb> hashMap = new HashMap<>();
            hashMap.put(src, dest);
            dest.l2().clear();
            dest.n(src, hashMap);
            Iterator<zb> it = l2.iterator();
            while (it.hasNext()) {
                zb next = it.next();
                if (next instanceof vb) {
                    zbVar = new vb();
                } else if (next instanceof cc) {
                    zbVar = new cc();
                } else if (next instanceof bc) {
                    zbVar = new bc();
                } else if (next instanceof gc) {
                    zbVar = new gc();
                } else if (next instanceof dc) {
                    zbVar = new ec();
                } else {
                    zbVar = new zb();
                }
                dest.b(zbVar);
                hashMap.put(next, zbVar);
            }
            Iterator<zb> it2 = l2.iterator();
            while (it2.hasNext()) {
                zb next2 = it2.next();
                hashMap.get(next2).n(next2, hashMap);
            }
        }

        public zb g(ac container, View view) {
            if (container.w() == view) {
                return container;
            }
            ArrayList<zb> l2 = container.l2();
            int size = l2.size();
            for (int i = 0; i < size; i++) {
                zb zbVar = l2.get(i);
                if (zbVar.w() == view) {
                    return zbVar;
                }
            }
            return null;
        }

        public void h(ac baseLayout, af start, af end) {
            this.c = start;
            this.d = end;
            this.a = new ac();
            this.b = new ac();
            this.a.U2(ge.this.D.G2());
            this.b.U2(ge.this.D.G2());
            this.a.p2();
            this.b.p2();
            c(ge.this.D, this.a);
            c(ge.this.D, this.b);
            if (ge.this.f1 > 0.5d) {
                if (start != null) {
                    m(this.a, start);
                }
                m(this.b, end);
            } else {
                m(this.b, end);
                if (start != null) {
                    m(this.a, start);
                }
            }
            this.a.Y2(ge.this.q());
            this.a.a3();
            this.b.Y2(ge.this.q());
            this.b.a3();
            ViewGroup.LayoutParams layoutParams = ge.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    ac acVar = this.a;
                    zb.b bVar = zb.b.WRAP_CONTENT;
                    acVar.D1(bVar);
                    this.b.D1(bVar);
                }
                if (layoutParams.height == -2) {
                    ac acVar2 = this.a;
                    zb.b bVar2 = zb.b.WRAP_CONTENT;
                    acVar2.Y1(bVar2);
                    this.b.Y1(bVar2);
                }
            }
        }

        public boolean i(int startId, int endId) {
            return (startId == this.e && endId == this.f) ? false : true;
        }

        public void j(int widthMeasureSpec, int heightMeasureSpec) {
            int mode = View.MeasureSpec.getMode(widthMeasureSpec);
            int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
            ge geVar = ge.this;
            geVar.U1 = mode;
            geVar.V1 = mode2;
            geVar.getOptimizationLevel();
            b(widthMeasureSpec, heightMeasureSpec);
            if (((ge.this.getParent() instanceof ge) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                b(widthMeasureSpec, heightMeasureSpec);
                ge.this.Q1 = this.a.m0();
                ge.this.R1 = this.a.D();
                ge.this.S1 = this.b.m0();
                ge.this.T1 = this.b.D();
                ge geVar2 = ge.this;
                geVar2.P1 = (geVar2.Q1 == geVar2.S1 && geVar2.R1 == geVar2.T1) ? false : true;
            }
            ge geVar3 = ge.this;
            int i = geVar3.Q1;
            int i2 = geVar3.R1;
            int i3 = geVar3.U1;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                i = (int) ((geVar3.W1 * (geVar3.S1 - i)) + i);
            }
            int i4 = i;
            int i5 = geVar3.V1;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i2 = (int) ((geVar3.W1 * (geVar3.T1 - i2)) + i2);
            }
            ge.this.u(widthMeasureSpec, heightMeasureSpec, i4, i2, this.a.P2() || this.b.P2(), this.a.N2() || this.b.N2());
        }

        public void k() {
            j(ge.this.Y0, ge.this.Z0);
            ge.this.T0();
        }

        public void l(int startId, int endId) {
            this.e = startId;
            this.f = endId;
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public interface i {
        void a();

        void b(int units, float maxVelocity);

        float c(int id);

        void clear();

        float d(int id);

        void e(MotionEvent event);

        float f();

        float g();

        void h(int units);
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public static class j implements i {
        private static j a = new j();
        public VelocityTracker b;

        private j() {
        }

        public static j i() {
            a.b = VelocityTracker.obtain();
            return a;
        }

        @Override // com.p7700g.p99005.ge.i
        public void a() {
            VelocityTracker velocityTracker = this.b;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.b = null;
            }
        }

        @Override // com.p7700g.p99005.ge.i
        public void b(int units, float maxVelocity) {
            VelocityTracker velocityTracker = this.b;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(units, maxVelocity);
            }
        }

        @Override // com.p7700g.p99005.ge.i
        public float c(int id) {
            VelocityTracker velocityTracker = this.b;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(id);
            }
            return 0.0f;
        }

        @Override // com.p7700g.p99005.ge.i
        public void clear() {
            VelocityTracker velocityTracker = this.b;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // com.p7700g.p99005.ge.i
        public float d(int id) {
            if (this.b != null) {
                return d(id);
            }
            return 0.0f;
        }

        @Override // com.p7700g.p99005.ge.i
        public void e(MotionEvent event) {
            VelocityTracker velocityTracker = this.b;
            if (velocityTracker != null) {
                velocityTracker.addMovement(event);
            }
        }

        @Override // com.p7700g.p99005.ge.i
        public float f() {
            VelocityTracker velocityTracker = this.b;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // com.p7700g.p99005.ge.i
        public float g() {
            VelocityTracker velocityTracker = this.b;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // com.p7700g.p99005.ge.i
        public void h(int units) {
            VelocityTracker velocityTracker = this.b;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(units);
            }
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class k {
        public float a = Float.NaN;
        public float b = Float.NaN;
        public int c = -1;
        public int d = -1;
        public final String e = "motion.progress";
        public final String f = "motion.velocity";
        public final String g = "motion.StartState";
        public final String h = "motion.EndState";

        public k() {
        }

        public void a() {
            int i = this.c;
            if (i != -1 || this.d != -1) {
                if (i == -1) {
                    ge.this.a1(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        ge.this.z(i, -1, -1);
                    } else {
                        ge.this.S0(i, i2);
                    }
                }
                ge.this.setState(m.SETUP);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.a)) {
                    return;
                }
                ge.this.setProgress(this.a);
                return;
            }
            ge.this.R0(this.a, this.b);
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.a);
            bundle.putFloat("motion.velocity", this.b);
            bundle.putInt("motion.StartState", this.c);
            bundle.putInt("motion.EndState", this.d);
            return bundle;
        }

        public void c() {
            this.d = ge.this.X0;
            this.c = ge.this.V0;
            this.b = ge.this.getVelocity();
            this.a = ge.this.getProgress();
        }

        public void d(int endState) {
            this.d = endState;
        }

        public void e(float progress) {
            this.a = progress;
        }

        public void f(int startState) {
            this.c = startState;
        }

        public void g(Bundle bundle) {
            this.a = bundle.getFloat("motion.progress");
            this.b = bundle.getFloat("motion.velocity");
            this.c = bundle.getInt("motion.StartState");
            this.d = bundle.getInt("motion.EndState");
        }

        public void h(float mVelocity) {
            this.b = mVelocity;
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public interface l {
        void a(ge motionLayout, int startId, int endId, float progress);

        void c(ge motionLayout, int startId, int endId);

        void d(ge motionLayout, int triggerId, boolean positive, float progress);

        void k(ge motionLayout, int currentId);
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public enum m {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public ge(@x1 Context context) {
        super(context);
        this.T0 = null;
        this.U0 = 0.0f;
        this.V0 = -1;
        this.W0 = -1;
        this.X0 = -1;
        this.Y0 = 0;
        this.Z0 = 0;
        this.a1 = true;
        this.b1 = new HashMap<>();
        this.c1 = 0L;
        this.d1 = 1.0f;
        this.e1 = 0.0f;
        this.f1 = 0.0f;
        this.h1 = 0.0f;
        this.j1 = false;
        this.k1 = false;
        this.o1 = 0;
        this.q1 = false;
        this.r1 = new id();
        this.s1 = new f();
        this.u1 = true;
        this.z1 = false;
        this.E1 = false;
        this.F1 = null;
        this.G1 = null;
        this.H1 = null;
        this.I1 = null;
        this.J1 = 0;
        this.K1 = -1L;
        this.L1 = 0.0f;
        this.M1 = 0;
        this.N1 = 0.0f;
        this.O1 = false;
        this.P1 = false;
        this.X1 = new k9();
        this.Y1 = false;
        this.a2 = null;
        this.b2 = null;
        this.c2 = 0;
        this.d2 = false;
        this.e2 = 0;
        this.f2 = new HashMap<>();
        this.j2 = new Rect();
        this.k2 = false;
        this.l2 = m.UNDEFINED;
        this.m2 = new h();
        this.n2 = false;
        this.o2 = new RectF();
        this.p2 = null;
        this.q2 = null;
        this.r2 = new ArrayList<>();
        C0(null);
    }

    private boolean B0(float x, float y, View view, MotionEvent event) {
        boolean z;
        View childAt;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (B0((childAt.getLeft() + x) - view.getScrollX(), (childAt.getTop() + y) - view.getScrollY(), viewGroup.getChildAt(childCount), event)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            this.o2.set(x, y, (view.getRight() + x) - view.getLeft(), (view.getBottom() + y) - view.getTop());
            if ((event.getAction() != 0 || this.o2.contains(event.getX(), event.getY())) && d0(view, event, -x, -y)) {
                return true;
            }
        }
        return z;
    }

    private void C0(AttributeSet attrs) {
        ie ieVar;
        H0 = isInEditMode();
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.ik);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == ff.m.lk) {
                    this.R0 = new ie(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == ff.m.kk) {
                    this.W0 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == ff.m.nk) {
                    this.h1 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.j1 = true;
                } else if (index == ff.m.jk) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == ff.m.ok) {
                    if (this.o1 == 0) {
                        this.o1 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == ff.m.mk) {
                    this.o1 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            ie ieVar2 = this.R0;
            if (!z) {
                this.R0 = null;
            }
        }
        if (this.o1 != 0) {
            e0();
        }
        if (this.W0 != -1 || (ieVar = this.R0) == null) {
            return;
        }
        this.W0 = ieVar.N();
        this.V0 = this.R0.N();
        this.X0 = this.R0.u();
    }

    private void L0() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if (this.l1 == null && ((copyOnWriteArrayList = this.I1) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.O1 = false;
        Iterator<Integer> it = this.r2.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            l lVar = this.l1;
            if (lVar != null) {
                lVar.k(this, next.intValue());
            }
            CopyOnWriteArrayList<l> copyOnWriteArrayList2 = this.I1;
            if (copyOnWriteArrayList2 != null) {
                Iterator<l> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().k(this, next.intValue());
                }
            }
        }
        this.r2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0() {
        int childCount = getChildCount();
        this.m2.a();
        boolean z = true;
        this.j1 = true;
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            sparseArray.put(childAt.getId(), this.b1.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int m2 = this.R0.m();
        if (m2 != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                ce ceVar = this.b1.get(getChildAt(i4));
                if (ceVar != null) {
                    ceVar.U(m2);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.b1.size()];
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            ce ceVar2 = this.b1.get(getChildAt(i6));
            if (ceVar2.k() != -1) {
                sparseBooleanArray.put(ceVar2.k(), true);
                iArr[i5] = ceVar2.k();
                i5++;
            }
        }
        if (this.H1 != null) {
            for (int i7 = 0; i7 < i5; i7++) {
                ce ceVar3 = this.b1.get(findViewById(iArr[i7]));
                if (ceVar3 != null) {
                    this.R0.z(ceVar3);
                }
            }
            Iterator<de> it = this.H1.iterator();
            while (it.hasNext()) {
                it.next().g(this, this.b1);
            }
            for (int i8 = 0; i8 < i5; i8++) {
                ce ceVar4 = this.b1.get(findViewById(iArr[i8]));
                if (ceVar4 != null) {
                    ceVar4.a0(width, height, this.d1, getNanoTime());
                }
            }
        } else {
            for (int i9 = 0; i9 < i5; i9++) {
                ce ceVar5 = this.b1.get(findViewById(iArr[i9]));
                if (ceVar5 != null) {
                    this.R0.z(ceVar5);
                    ceVar5.a0(width, height, this.d1, getNanoTime());
                }
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            ce ceVar6 = this.b1.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && ceVar6 != null) {
                this.R0.z(ceVar6);
                ceVar6.a0(width, height, this.d1, getNanoTime());
            }
        }
        float M = this.R0.M();
        if (M != 0.0f) {
            boolean z2 = ((double) M) < zg2.s;
            float abs = Math.abs(M);
            float f2 = -3.4028235E38f;
            float f3 = Float.MAX_VALUE;
            int i11 = 0;
            float f4 = Float.MAX_VALUE;
            float f5 = -3.4028235E38f;
            while (true) {
                if (i11 >= childCount) {
                    z = false;
                    break;
                }
                ce ceVar7 = this.b1.get(getChildAt(i11));
                if (!Float.isNaN(ceVar7.N)) {
                    break;
                }
                float t = ceVar7.t();
                float u = ceVar7.u();
                float f6 = z2 ? u - t : u + t;
                f4 = Math.min(f4, f6);
                f5 = Math.max(f5, f6);
                i11++;
            }
            if (!z) {
                while (i2 < childCount) {
                    ce ceVar8 = this.b1.get(getChildAt(i2));
                    float t2 = ceVar8.t();
                    float u2 = ceVar8.u();
                    float f7 = z2 ? u2 - t2 : u2 + t2;
                    ceVar8.P = 1.0f / (1.0f - abs);
                    ceVar8.O = abs - (((f7 - f4) * abs) / (f5 - f4));
                    i2++;
                }
                return;
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                ce ceVar9 = this.b1.get(getChildAt(i12));
                if (!Float.isNaN(ceVar9.N)) {
                    f3 = Math.min(f3, ceVar9.N);
                    f2 = Math.max(f2, ceVar9.N);
                }
            }
            while (i2 < childCount) {
                ce ceVar10 = this.b1.get(getChildAt(i2));
                if (!Float.isNaN(ceVar10.N)) {
                    ceVar10.P = 1.0f / (1.0f - abs);
                    if (z2) {
                        ceVar10.O = abs - (((f2 - ceVar10.N) / (f2 - f3)) * abs);
                    } else {
                        ceVar10.O = abs - (((ceVar10.N - f3) * abs) / (f2 - f3));
                    }
                }
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect U0(zb cw) {
        this.j2.top = cw.p0();
        this.j2.left = cw.o0();
        Rect rect = this.j2;
        int m0 = cw.m0();
        Rect rect2 = this.j2;
        rect.right = m0 + rect2.left;
        int D = cw.D();
        Rect rect3 = this.j2;
        rect2.bottom = D + rect3.top;
        return rect3;
    }

    private boolean d0(View view, MotionEvent event, float offsetX, float offsetY) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            event.offsetLocation(offsetX, offsetY);
            boolean onTouchEvent = view.onTouchEvent(event);
            event.offsetLocation(-offsetX, -offsetY);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(event);
        obtain.offsetLocation(offsetX, offsetY);
        if (this.q2 == null) {
            this.q2 = new Matrix();
        }
        matrix.invert(this.q2);
        obtain.transform(this.q2);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    private void e0() {
        ie ieVar = this.R0;
        if (ieVar == null) {
            return;
        }
        int N = ieVar.N();
        ie ieVar2 = this.R0;
        f0(N, ieVar2.o(ieVar2.N()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<ie.b> it = this.R0.s().iterator();
        while (it.hasNext()) {
            ie.b next = it.next();
            ie.b bVar = this.R0.E;
            g0(next);
            int I = next.I();
            int B = next.B();
            qd.i(getContext(), I);
            qd.i(getContext(), B);
            sparseIntArray.get(I);
            sparseIntArray2.get(B);
            sparseIntArray.put(I, B);
            sparseIntArray2.put(B, I);
            this.R0.o(I);
            this.R0.o(B);
        }
    }

    private void f0(int csetId, af set) {
        qd.i(getContext(), csetId);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                childAt.getClass().getName();
            }
            if (set.k0(id) == null) {
                qd.k(childAt);
            }
        }
        int[] o0 = set.o0();
        for (int i3 = 0; i3 < o0.length; i3++) {
            int i4 = o0[i3];
            qd.i(getContext(), i4);
            findViewById(o0[i3]);
            set.n0(i4);
            set.u0(i4);
        }
    }

    private void g0(ie.b transition) {
        transition.I();
        transition.B();
    }

    private void i0() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            ce ceVar = this.b1.get(childAt);
            if (ceVar != null) {
                ceVar.V(childAt);
            }
        }
    }

    private static boolean i1(float velocity, float position, float maxAcceleration) {
        if (velocity > 0.0f) {
            float f2 = velocity / maxAcceleration;
            return ((velocity * f2) - (((maxAcceleration * f2) * f2) / 2.0f)) + position > 1.0f;
        }
        float f3 = (-velocity) / maxAcceleration;
        return ((((maxAcceleration * f3) * f3) / 2.0f) + (velocity * f3)) + position < 0.0f;
    }

    @SuppressLint({"LogConditional"})
    private void j0() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            qd.g();
            qd.k(this);
            qd.i(getContext(), this.W0);
            qd.k(childAt);
            childAt.getLeft();
            childAt.getTop();
        }
    }

    private void p0() {
        boolean z;
        float signum = Math.signum(this.h1 - this.f1);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.S0;
        float f2 = this.f1 + (!(interpolator instanceof id) ? ((((float) (nanoTime - this.g1)) * signum) * 1.0E-9f) / this.d1 : 0.0f);
        if (this.i1) {
            f2 = this.h1;
        }
        int i2 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i2 <= 0 || f2 < this.h1) && (signum > 0.0f || f2 > this.h1)) {
            z = false;
        } else {
            f2 = this.h1;
            z = true;
        }
        if (interpolator != null && !z) {
            if (this.q1) {
                f2 = interpolator.getInterpolation(((float) (nanoTime - this.c1)) * 1.0E-9f);
            } else {
                f2 = interpolator.getInterpolation(f2);
            }
        }
        if ((i2 > 0 && f2 >= this.h1) || (signum <= 0.0f && f2 <= this.h1)) {
            f2 = this.h1;
        }
        this.W1 = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.T0;
        if (interpolator2 != null) {
            f2 = interpolator2.getInterpolation(f2);
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            ce ceVar = this.b1.get(childAt);
            if (ceVar != null) {
                ceVar.L(childAt, f2, nanoTime2, this.X1);
            }
        }
        if (this.P1) {
            requestLayout();
        }
    }

    private void q0() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if ((this.l1 == null && ((copyOnWriteArrayList = this.I1) == null || copyOnWriteArrayList.isEmpty())) || this.N1 == this.e1) {
            return;
        }
        if (this.M1 != -1) {
            l lVar = this.l1;
            if (lVar != null) {
                lVar.c(this, this.V0, this.X0);
            }
            CopyOnWriteArrayList<l> copyOnWriteArrayList2 = this.I1;
            if (copyOnWriteArrayList2 != null) {
                Iterator<l> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().c(this, this.V0, this.X0);
                }
            }
            this.O1 = true;
        }
        this.M1 = -1;
        float f2 = this.e1;
        this.N1 = f2;
        l lVar2 = this.l1;
        if (lVar2 != null) {
            lVar2.a(this, this.V0, this.X0, f2);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList3 = this.I1;
        if (copyOnWriteArrayList3 != null) {
            Iterator<l> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, this.V0, this.X0, this.e1);
            }
        }
        this.O1 = true;
    }

    private void s0(ge motionLayout, int mBeginState, int mEndState) {
        l lVar = this.l1;
        if (lVar != null) {
            lVar.c(this, mBeginState, mEndState);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.I1;
        if (copyOnWriteArrayList != null) {
            Iterator<l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().c(motionLayout, mBeginState, mEndState);
            }
        }
    }

    public void A0(View view, float posOnViewX, float posOnViewY, float[] returnVelocity, int type) {
        float f2;
        float f3 = this.U0;
        float f4 = this.f1;
        if (this.S0 != null) {
            float signum = Math.signum(this.h1 - f4);
            float interpolation = this.S0.getInterpolation(this.f1 + Q0);
            float interpolation2 = this.S0.getInterpolation(this.f1);
            f3 = (((interpolation - interpolation2) / Q0) * signum) / this.d1;
            f2 = interpolation2;
        } else {
            f2 = f4;
        }
        Interpolator interpolator = this.S0;
        if (interpolator instanceof fe) {
            f3 = ((fe) interpolator).a();
        }
        ce ceVar = this.b1.get(view);
        if ((type & 1) == 0) {
            ceVar.C(f2, view.getWidth(), view.getHeight(), posOnViewX, posOnViewY, returnVelocity);
        } else {
            ceVar.p(f2, posOnViewX, posOnViewY, returnVelocity);
        }
        if (type < 2) {
            returnVelocity[0] = returnVelocity[0] * f3;
            returnVelocity[1] = returnVelocity[1] * f3;
        }
    }

    public boolean D0() {
        return this.k2;
    }

    public boolean E0() {
        return this.d2;
    }

    public boolean F0() {
        return this.a1;
    }

    public boolean G0(int viewTransitionId) {
        ie ieVar = this.R0;
        if (ieVar != null) {
            return ieVar.U(viewTransitionId);
        }
        return false;
    }

    public void H0(int id) {
        if (!isAttachedToWindow()) {
            this.W0 = id;
        }
        if (this.V0 == id) {
            setProgress(0.0f);
        } else if (this.X0 == id) {
            setProgress(1.0f);
        } else {
            S0(id, id);
        }
    }

    public int I0(String id) {
        ie ieVar = this.R0;
        if (ieVar == null) {
            return 0;
        }
        return ieVar.W(id);
    }

    public i J0() {
        return j.i();
    }

    public void K0() {
        ie ieVar = this.R0;
        if (ieVar == null) {
            return;
        }
        if (ieVar.i(this, this.W0)) {
            requestLayout();
            return;
        }
        int i2 = this.W0;
        if (i2 != -1) {
            this.R0.f(this, i2);
        }
        if (this.R0.r0()) {
            this.R0.p0();
        }
    }

    @Deprecated
    public void M0() {
        N0();
    }

    public void N0() {
        this.m2.k();
        invalidate();
    }

    public boolean O0(l listener) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.I1;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(listener);
    }

    @e2(api = 17)
    public void P0(int id, int duration) {
        this.d2 = true;
        this.g2 = getWidth();
        this.h2 = getHeight();
        int rotation = getDisplay().getRotation();
        this.e2 = (rotation + 1) % 4 <= (this.i2 + 1) % 4 ? 2 : 1;
        this.i2 = rotation;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            ld ldVar = this.f2.get(childAt);
            if (ldVar == null) {
                ldVar = new ld();
                this.f2.put(childAt, ldVar);
            }
            ldVar.a(childAt);
        }
        this.V0 = -1;
        this.X0 = id;
        this.R0.n0(-1, id);
        this.m2.h(this.D, null, this.R0.o(this.X0));
        this.e1 = 0.0f;
        this.f1 = 0.0f;
        invalidate();
        Y0(new b());
        if (duration > 0) {
            this.d1 = duration / 1000.0f;
        }
    }

    public void Q0(int id) {
        if (getCurrentState() == -1) {
            a1(id);
            return;
        }
        int[] iArr = this.b2;
        if (iArr == null) {
            this.b2 = new int[4];
        } else if (iArr.length <= this.c2) {
            this.b2 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.b2;
        int i2 = this.c2;
        this.c2 = i2 + 1;
        iArr2[i2] = id;
    }

    public void R0(float pos, float velocity) {
        if (!isAttachedToWindow()) {
            if (this.Z1 == null) {
                this.Z1 = new k();
            }
            this.Z1.e(pos);
            this.Z1.h(velocity);
            return;
        }
        setProgress(pos);
        setState(m.MOVING);
        this.U0 = velocity;
        int i2 = (velocity > 0.0f ? 1 : (velocity == 0.0f ? 0 : -1));
        if (i2 != 0) {
            b0(i2 <= 0 ? 0.0f : 1.0f);
        } else if (pos == 0.0f || pos == 1.0f) {
        } else {
            b0(pos <= 0.5f ? 0.0f : 1.0f);
        }
    }

    public void S0(int beginId, int endId) {
        if (!isAttachedToWindow()) {
            if (this.Z1 == null) {
                this.Z1 = new k();
            }
            this.Z1.f(beginId);
            this.Z1.d(endId);
            return;
        }
        ie ieVar = this.R0;
        if (ieVar != null) {
            this.V0 = beginId;
            this.X0 = endId;
            ieVar.n0(beginId, endId);
            this.m2.h(this.D, this.R0.o(beginId), this.R0.o(endId));
            N0();
            this.f1 = 0.0f;
            Z0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r10 != 7) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void V0(int touchUpMode, float position, float currentVelocity) {
        if (this.R0 == null || this.f1 == position) {
            return;
        }
        this.q1 = true;
        this.c1 = getNanoTime();
        this.d1 = this.R0.t() / 1000.0f;
        this.h1 = position;
        this.j1 = true;
        if (touchUpMode != 0 && touchUpMode != 1 && touchUpMode != 2) {
            if (touchUpMode == 4) {
                this.s1.b(currentVelocity, this.f1, this.R0.B());
                this.S0 = this.s1;
            } else if (touchUpMode != 5) {
                if (touchUpMode != 6) {
                }
            } else if (i1(currentVelocity, this.f1, this.R0.B())) {
                this.s1.b(currentVelocity, this.f1, this.R0.B());
                this.S0 = this.s1;
            } else {
                this.r1.b(this.f1, position, currentVelocity, this.d1, this.R0.B(), this.R0.C());
                this.U0 = 0.0f;
                int i2 = this.W0;
                this.h1 = position;
                this.W0 = i2;
                this.S0 = this.r1;
            }
            this.i1 = false;
            this.c1 = getNanoTime();
            invalidate();
        }
        if (touchUpMode == 1 || touchUpMode == 7) {
            position = 0.0f;
        } else if (touchUpMode == 2 || touchUpMode == 6) {
            position = 1.0f;
        }
        if (this.R0.n() == 0) {
            this.r1.b(this.f1, position, currentVelocity, this.d1, this.R0.B(), this.R0.C());
        } else {
            this.r1.f(this.f1, position, currentVelocity, this.R0.J(), this.R0.K(), this.R0.I(), this.R0.L(), this.R0.H());
        }
        int i3 = this.W0;
        this.h1 = position;
        this.W0 = i3;
        this.S0 = this.r1;
        this.i1 = false;
        this.c1 = getNanoTime();
        invalidate();
    }

    public void W0(float position, float currentVelocity) {
        if (this.R0 == null || this.f1 == position) {
            return;
        }
        this.q1 = true;
        this.c1 = getNanoTime();
        this.d1 = this.R0.t() / 1000.0f;
        this.h1 = position;
        this.j1 = true;
        this.r1.f(this.f1, position, currentVelocity, this.R0.J(), this.R0.K(), this.R0.I(), this.R0.L(), this.R0.H());
        int i2 = this.W0;
        this.h1 = position;
        this.W0 = i2;
        this.S0 = this.r1;
        this.i1 = false;
        this.c1 = getNanoTime();
        invalidate();
    }

    public void X0() {
        b0(1.0f);
        this.a2 = null;
    }

    public void Y0(Runnable onComplete) {
        b0(1.0f);
        this.a2 = onComplete;
    }

    public void Z0() {
        b0(0.0f);
    }

    public void a0(l listener) {
        if (this.I1 == null) {
            this.I1 = new CopyOnWriteArrayList<>();
        }
        this.I1.add(listener);
    }

    public void a1(int id) {
        if (!isAttachedToWindow()) {
            if (this.Z1 == null) {
                this.Z1 = new k();
            }
            this.Z1.d(id);
            return;
        }
        c1(id, -1, -1);
    }

    public void b0(float position) {
        ie ieVar = this.R0;
        if (ieVar == null) {
            return;
        }
        float f2 = this.f1;
        float f3 = this.e1;
        if (f2 != f3 && this.i1) {
            this.f1 = f3;
        }
        float f4 = this.f1;
        if (f4 == position) {
            return;
        }
        this.q1 = false;
        this.h1 = position;
        this.d1 = ieVar.t() / 1000.0f;
        setProgress(this.h1);
        this.S0 = null;
        this.T0 = this.R0.x();
        this.i1 = false;
        this.c1 = getNanoTime();
        this.j1 = true;
        this.e1 = f4;
        this.f1 = f4;
        invalidate();
    }

    public void b1(int id, int duration) {
        if (!isAttachedToWindow()) {
            if (this.Z1 == null) {
                this.Z1 = new k();
            }
            this.Z1.d(id);
            return;
        }
        d1(id, -1, -1, duration);
    }

    public boolean c0(int viewTransitionId, ce motionController) {
        ie ieVar = this.R0;
        if (ieVar != null) {
            return ieVar.h(viewTransitionId, motionController);
        }
        return false;
    }

    public void c1(int id, int screenWidth, int screenHeight) {
        d1(id, screenWidth, screenHeight, -1);
    }

    public void d1(int id, int screenWidth, int screenHeight, int duration) {
        Cif cif;
        int a2;
        ie ieVar = this.R0;
        if (ieVar != null && (cif = ieVar.D) != null && (a2 = cif.a(this.W0, id, screenWidth, screenHeight)) != -1) {
            id = a2;
        }
        int i2 = this.W0;
        if (i2 == id) {
            return;
        }
        if (this.V0 == id) {
            b0(0.0f);
            if (duration > 0) {
                this.d1 = duration / 1000.0f;
            }
        } else if (this.X0 == id) {
            b0(1.0f);
            if (duration > 0) {
                this.d1 = duration / 1000.0f;
            }
        } else {
            this.X0 = id;
            if (i2 != -1) {
                S0(i2, id);
                b0(1.0f);
                this.f1 = 0.0f;
                X0();
                if (duration > 0) {
                    this.d1 = duration / 1000.0f;
                    return;
                }
                return;
            }
            this.q1 = false;
            this.h1 = 1.0f;
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.g1 = getNanoTime();
            this.c1 = getNanoTime();
            this.i1 = false;
            this.S0 = null;
            if (duration == -1) {
                this.d1 = this.R0.t() / 1000.0f;
            }
            this.V0 = -1;
            this.R0.n0(-1, this.X0);
            SparseArray sparseArray = new SparseArray();
            if (duration == 0) {
                this.d1 = this.R0.t() / 1000.0f;
            } else if (duration > 0) {
                this.d1 = duration / 1000.0f;
            }
            int childCount = getChildCount();
            this.b1.clear();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                this.b1.put(childAt, new ce(childAt));
                sparseArray.put(childAt.getId(), this.b1.get(childAt));
            }
            this.j1 = true;
            this.m2.h(this.D, null, this.R0.o(id));
            N0();
            this.m2.a();
            i0();
            int width = getWidth();
            int height = getHeight();
            if (this.H1 != null) {
                for (int i4 = 0; i4 < childCount; i4++) {
                    ce ceVar = this.b1.get(getChildAt(i4));
                    if (ceVar != null) {
                        this.R0.z(ceVar);
                    }
                }
                Iterator<de> it = this.H1.iterator();
                while (it.hasNext()) {
                    it.next().g(this, this.b1);
                }
                for (int i5 = 0; i5 < childCount; i5++) {
                    ce ceVar2 = this.b1.get(getChildAt(i5));
                    if (ceVar2 != null) {
                        ceVar2.a0(width, height, this.d1, getNanoTime());
                    }
                }
            } else {
                for (int i6 = 0; i6 < childCount; i6++) {
                    ce ceVar3 = this.b1.get(getChildAt(i6));
                    if (ceVar3 != null) {
                        this.R0.z(ceVar3);
                        ceVar3.a0(width, height, this.d1, getNanoTime());
                    }
                }
            }
            float M = this.R0.M();
            if (M != 0.0f) {
                float f2 = Float.MAX_VALUE;
                float f3 = -3.4028235E38f;
                for (int i7 = 0; i7 < childCount; i7++) {
                    ce ceVar4 = this.b1.get(getChildAt(i7));
                    float u = ceVar4.u() + ceVar4.t();
                    f2 = Math.min(f2, u);
                    f3 = Math.max(f3, u);
                }
                for (int i8 = 0; i8 < childCount; i8++) {
                    ce ceVar5 = this.b1.get(getChildAt(i8));
                    float t = ceVar5.t();
                    float u2 = ceVar5.u();
                    ceVar5.P = 1.0f / (1.0f - M);
                    ceVar5.O = M - ((((t + u2) - f2) * M) / (f3 - f2));
                }
            }
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.j1 = true;
            invalidate();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        long j2;
        pe peVar;
        ArrayList<de> arrayList = this.H1;
        if (arrayList != null) {
            Iterator<de> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().h(canvas);
            }
        }
        o0(false);
        ie ieVar = this.R0;
        if (ieVar != null && (peVar = ieVar.U) != null) {
            peVar.d();
        }
        super.dispatchDraw(canvas);
        if (this.R0 == null) {
            return;
        }
        if ((this.o1 & 1) == 1 && !isInEditMode()) {
            this.J1++;
            long nanoTime = getNanoTime();
            long j3 = this.K1;
            if (j3 != -1) {
                if (nanoTime - j3 > 200000000) {
                    this.L1 = ((int) ((this.J1 / (((float) j2) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.J1 = 0;
                    this.K1 = nanoTime;
                }
            } else {
                this.K1 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder G = wo1.G(this.L1 + " fps " + qd.l(this, this.V0) + " -> ");
            G.append(qd.l(this, this.X0));
            G.append(" (progress: ");
            G.append(((float) ((int) (getProgress() * 1000.0f))) / 10.0f);
            G.append(" ) state=");
            int i2 = this.W0;
            G.append(i2 == -1 ? AdError.UNDEFINED_DOMAIN : qd.l(this, i2));
            String sb = G.toString();
            paint.setColor(sr.t);
            canvas.drawText(sb, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb, 10.0f, getHeight() - 30, paint);
        }
        if (this.o1 > 1) {
            if (this.p1 == null) {
                this.p1 = new g();
            }
            this.p1.a(canvas, this.b1, this.R0.t(), this.o1);
        }
        ArrayList<de> arrayList2 = this.H1;
        if (arrayList2 != null) {
            Iterator<de> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().i(canvas);
            }
        }
    }

    public void e1() {
        this.m2.h(this.D, this.R0.o(this.V0), this.R0.o(this.X0));
        N0();
    }

    public void f1(int stateId, af set) {
        ie ieVar = this.R0;
        if (ieVar != null) {
            ieVar.j0(stateId, set);
        }
        e1();
        if (this.W0 == stateId) {
            set.r(this);
        }
    }

    public void g1(int stateId, af set, int duration) {
        if (this.R0 != null && this.W0 == stateId) {
            int i2 = ff.g.N3;
            f1(i2, v0(stateId));
            z(i2, -1, -1);
            f1(stateId, set);
            ie.b bVar = new ie.b(-1, this.R0, i2, stateId);
            bVar.O(duration);
            setTransition(bVar);
            X0();
        }
    }

    public int[] getConstraintSetIds() {
        ie ieVar = this.R0;
        if (ieVar == null) {
            return null;
        }
        return ieVar.r();
    }

    public int getCurrentState() {
        return this.W0;
    }

    public ArrayList<ie.b> getDefinedTransitions() {
        ie ieVar = this.R0;
        if (ieVar == null) {
            return null;
        }
        return ieVar.s();
    }

    public rd getDesignTool() {
        if (this.t1 == null) {
            this.t1 = new rd(this);
        }
        return this.t1;
    }

    public int getEndState() {
        return this.X0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f1;
    }

    public ie getScene() {
        return this.R0;
    }

    public int getStartState() {
        return this.V0;
    }

    public float getTargetPosition() {
        return this.h1;
    }

    public Bundle getTransitionState() {
        if (this.Z1 == null) {
            this.Z1 = new k();
        }
        this.Z1.c();
        return this.Z1.b();
    }

    public long getTransitionTimeMs() {
        ie ieVar = this.R0;
        if (ieVar != null) {
            this.d1 = ieVar.t() / 1000.0f;
        }
        return this.d1 * 1000.0f;
    }

    public float getVelocity() {
        return this.U0;
    }

    public af h0(int id) {
        ie ieVar = this.R0;
        if (ieVar == null) {
            return null;
        }
        af o = ieVar.o(id);
        af afVar = new af();
        afVar.I(o);
        return afVar;
    }

    public void h1(int viewTransitionId, View... view) {
        ie ieVar = this.R0;
        if (ieVar != null) {
            ieVar.t0(viewTransitionId, view);
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public void k0(boolean disable) {
        ie ieVar = this.R0;
        if (ieVar == null) {
            return;
        }
        ieVar.k(disable);
    }

    public void l0(int transitionID, boolean enable) {
        ie.b z02 = z0(transitionID);
        if (enable) {
            z02.Q(true);
            return;
        }
        ie ieVar = this.R0;
        if (z02 == ieVar.E) {
            Iterator<ie.b> it = ieVar.Q(this.W0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ie.b next = it.next();
                if (next.K()) {
                    this.R0.E = next;
                    break;
                }
            }
        }
        z02.Q(false);
    }

    public void m0(int viewTransitionId, boolean enable) {
        ie ieVar = this.R0;
        if (ieVar != null) {
            ieVar.l(viewTransitionId, enable);
        }
    }

    public void n0(boolean start) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ce ceVar = this.b1.get(getChildAt(i2));
            if (ceVar != null) {
                ceVar.i(start);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o0(boolean force) {
        boolean z;
        char c2;
        int childCount;
        Interpolator interpolator;
        int i2;
        int i3;
        boolean z2;
        if (this.g1 == -1) {
            this.g1 = getNanoTime();
        }
        float f2 = this.f1;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.W0 = -1;
        }
        boolean z3 = false;
        if (this.E1 || (this.j1 && (force || this.h1 != f2))) {
            float signum = Math.signum(this.h1 - f2);
            long nanoTime = getNanoTime();
            Interpolator interpolator2 = this.S0;
            float f3 = !(interpolator2 instanceof fe) ? ((((float) (nanoTime - this.g1)) * signum) * 1.0E-9f) / this.d1 : 0.0f;
            float f4 = this.f1 + f3;
            if (this.i1) {
                f4 = this.h1;
            }
            int i4 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i4 <= 0 || f4 < this.h1) && (signum > 0.0f || f4 > this.h1)) {
                z = false;
            } else {
                f4 = this.h1;
                this.j1 = false;
                z = true;
            }
            this.f1 = f4;
            this.e1 = f4;
            this.g1 = nanoTime;
            if (interpolator2 != null && !z) {
                if (this.q1) {
                    float interpolation = interpolator2.getInterpolation(((float) (nanoTime - this.c1)) * 1.0E-9f);
                    Interpolator interpolator3 = this.S0;
                    id idVar = this.r1;
                    if (interpolator3 == idVar) {
                        c2 = idVar.e() ? (char) 2 : (char) 1;
                    } else {
                        c2 = 0;
                    }
                    this.f1 = interpolation;
                    this.g1 = nanoTime;
                    Interpolator interpolator4 = this.S0;
                    if (interpolator4 instanceof fe) {
                        float a2 = ((fe) interpolator4).a();
                        this.U0 = a2;
                        if (Math.abs(a2) * this.d1 <= Q0 && c2 == 2) {
                            this.j1 = false;
                        }
                        if (a2 > 0.0f && interpolation >= 1.0f) {
                            this.f1 = 1.0f;
                            this.j1 = false;
                            interpolation = 1.0f;
                        }
                        if (a2 < 0.0f && interpolation <= 0.0f) {
                            this.f1 = 0.0f;
                            this.j1 = false;
                            f4 = 0.0f;
                            if (Math.abs(this.U0) > Q0) {
                                setState(m.MOVING);
                            }
                            if (c2 != 1) {
                                if ((i4 > 0 && f4 >= this.h1) || (signum <= 0.0f && f4 <= this.h1)) {
                                    f4 = this.h1;
                                    this.j1 = false;
                                }
                                if (f4 >= 1.0f || f4 <= 0.0f) {
                                    this.j1 = false;
                                    setState(m.FINISHED);
                                }
                            }
                            childCount = getChildCount();
                            this.E1 = false;
                            long nanoTime2 = getNanoTime();
                            this.W1 = f4;
                            Interpolator interpolator5 = this.T0;
                            float interpolation2 = interpolator5 == null ? f4 : interpolator5.getInterpolation(f4);
                            interpolator = this.T0;
                            if (interpolator != null) {
                                float interpolation3 = interpolator.getInterpolation((signum / this.d1) + f4);
                                this.U0 = interpolation3;
                                this.U0 = interpolation3 - this.T0.getInterpolation(f4);
                            }
                            for (i2 = 0; i2 < childCount; i2++) {
                                View childAt = getChildAt(i2);
                                ce ceVar = this.b1.get(childAt);
                                if (ceVar != null) {
                                    this.E1 = ceVar.L(childAt, interpolation2, nanoTime2, this.X1) | this.E1;
                                }
                            }
                            boolean z4 = (i4 <= 0 && f4 >= this.h1) || (signum <= 0.0f && f4 <= this.h1);
                            if (!this.E1 && !this.j1 && z4) {
                                setState(m.FINISHED);
                            }
                            if (this.P1) {
                                requestLayout();
                            }
                            this.E1 = (!z4) | this.E1;
                            if (f4 <= 0.0f && (i3 = this.V0) != -1 && this.W0 != i3) {
                                this.W0 = i3;
                                this.R0.o(i3).p(this);
                                setState(m.FINISHED);
                                z3 = true;
                            }
                            if (f4 >= 1.0d) {
                                int i5 = this.W0;
                                int i6 = this.X0;
                                if (i5 != i6) {
                                    this.W0 = i6;
                                    this.R0.o(i6).p(this);
                                    setState(m.FINISHED);
                                    z3 = true;
                                }
                            }
                            if (!this.E1 || this.j1) {
                                invalidate();
                            } else if ((i4 > 0 && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f)) {
                                setState(m.FINISHED);
                            }
                            if (!this.E1 && !this.j1 && ((i4 > 0 && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f))) {
                                K0();
                            }
                        }
                    }
                    f4 = interpolation;
                    if (Math.abs(this.U0) > Q0) {
                    }
                    if (c2 != 1) {
                    }
                    childCount = getChildCount();
                    this.E1 = false;
                    long nanoTime22 = getNanoTime();
                    this.W1 = f4;
                    Interpolator interpolator52 = this.T0;
                    if (interpolator52 == null) {
                    }
                    interpolator = this.T0;
                    if (interpolator != null) {
                    }
                    while (i2 < childCount) {
                    }
                    if (i4 <= 0) {
                    }
                    if (!this.E1) {
                        setState(m.FINISHED);
                    }
                    if (this.P1) {
                    }
                    this.E1 = (!z4) | this.E1;
                    if (f4 <= 0.0f) {
                        this.W0 = i3;
                        this.R0.o(i3).p(this);
                        setState(m.FINISHED);
                        z3 = true;
                    }
                    if (f4 >= 1.0d) {
                    }
                    if (this.E1) {
                    }
                    invalidate();
                    if (!this.E1) {
                        K0();
                    }
                } else {
                    float interpolation4 = interpolator2.getInterpolation(f4);
                    Interpolator interpolator6 = this.S0;
                    if (interpolator6 instanceof fe) {
                        this.U0 = ((fe) interpolator6).a();
                    } else {
                        this.U0 = ((interpolator6.getInterpolation(f4 + f3) - interpolation4) * signum) / f3;
                    }
                    f4 = interpolation4;
                }
            } else {
                this.U0 = f3;
            }
            c2 = 0;
            if (Math.abs(this.U0) > Q0) {
            }
            if (c2 != 1) {
            }
            childCount = getChildCount();
            this.E1 = false;
            long nanoTime222 = getNanoTime();
            this.W1 = f4;
            Interpolator interpolator522 = this.T0;
            if (interpolator522 == null) {
            }
            interpolator = this.T0;
            if (interpolator != null) {
            }
            while (i2 < childCount) {
            }
            if (i4 <= 0) {
            }
            if (!this.E1) {
            }
            if (this.P1) {
            }
            this.E1 = (!z4) | this.E1;
            if (f4 <= 0.0f) {
            }
            if (f4 >= 1.0d) {
            }
            if (this.E1) {
            }
            invalidate();
            if (!this.E1) {
            }
        }
        float f5 = this.f1;
        if (f5 >= 1.0f) {
            int i7 = this.W0;
            int i8 = this.X0;
            z2 = i7 == i8 ? z3 : true;
            this.W0 = i8;
        } else {
            if (f5 <= 0.0f) {
                int i9 = this.W0;
                int i10 = this.V0;
                z2 = i9 == i10 ? z3 : true;
                this.W0 = i10;
            }
            this.n2 |= z3;
            if (z3 && !this.Y1) {
                requestLayout();
            }
            this.e1 = this.f1;
        }
        z3 = z2;
        this.n2 |= z3;
        if (z3) {
            requestLayout();
        }
        this.e1 = this.f1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ie.b bVar;
        int i2;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.i2 = display.getRotation();
        }
        ie ieVar = this.R0;
        if (ieVar != null && (i2 = this.W0) != -1) {
            af o = ieVar.o(i2);
            this.R0.h0(this);
            ArrayList<de> arrayList = this.H1;
            if (arrayList != null) {
                Iterator<de> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().b(this);
                }
            }
            if (o != null) {
                o.r(this);
            }
            this.V0 = this.W0;
        }
        K0();
        k kVar = this.Z1;
        if (kVar != null) {
            if (this.k2) {
                post(new d());
                return;
            } else {
                kVar.a();
                return;
            }
        }
        ie ieVar2 = this.R0;
        if (ieVar2 == null || (bVar = ieVar2.E) == null || bVar.z() != 4) {
            return;
        }
        X0();
        setState(m.SETUP);
        setState(m.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        le J;
        int s;
        RectF r;
        ie ieVar = this.R0;
        if (ieVar != null && this.a1) {
            pe peVar = ieVar.U;
            if (peVar != null) {
                peVar.l(event);
            }
            ie.b bVar = this.R0.E;
            if (bVar != null && bVar.K() && (J = bVar.J()) != null && ((event.getAction() != 0 || (r = J.r(this, new RectF())) == null || r.contains(event.getX(), event.getY())) && (s = J.s()) != -1)) {
                View view = this.p2;
                if (view == null || view.getId() != s) {
                    this.p2 = findViewById(s);
                }
                View view2 = this.p2;
                if (view2 != null) {
                    this.o2.set(view2.getLeft(), this.p2.getTop(), this.p2.getRight(), this.p2.getBottom());
                    if (this.o2.contains(event.getX(), event.getY()) && !B0(this.p2.getLeft(), this.p2.getTop(), this.p2, event)) {
                        return onTouchEvent(event);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.Y1 = true;
        try {
            if (this.R0 == null) {
                super.onLayout(changed, left, top, right, bottom);
                return;
            }
            int i2 = right - left;
            int i3 = bottom - top;
            if (this.x1 != i2 || this.y1 != i3) {
                N0();
                o0(true);
            }
            this.x1 = i2;
            this.y1 = i3;
            this.v1 = i2;
            this.w1 = i3;
        } finally {
            this.Y1 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.R0 == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        boolean z = false;
        boolean z2 = (this.Y0 == widthMeasureSpec && this.Z0 == heightMeasureSpec) ? false : true;
        if (this.n2) {
            this.n2 = false;
            K0();
            L0();
            z2 = true;
        }
        if (this.I) {
            z2 = true;
        }
        this.Y0 = widthMeasureSpec;
        this.Z0 = heightMeasureSpec;
        int N = this.R0.N();
        int u = this.R0.u();
        if ((z2 || this.m2.i(N, u)) && this.V0 != -1) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            this.m2.h(this.D, this.R0.o(N), this.R0.o(u));
            this.m2.k();
            this.m2.l(N, u);
        } else {
            if (z2) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
            z = true;
        }
        if (this.P1 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int m0 = this.D.m0() + getPaddingRight() + getPaddingLeft();
            int D = this.D.D() + paddingBottom;
            int i2 = this.U1;
            if (i2 == Integer.MIN_VALUE || i2 == 0) {
                int i3 = this.Q1;
                m0 = (int) ((this.W1 * (this.S1 - i3)) + i3);
                requestLayout();
            }
            int i4 = this.V1;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.R1;
                D = (int) ((this.W1 * (this.T1 - i5)) + i5);
                requestLayout();
            }
            setMeasuredDimension(m0, D);
        }
        p0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public boolean onNestedFling(@x1 View target, float velocityX, float velocityY, boolean consumed) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public boolean onNestedPreFling(@x1 View target, float velocityX, float velocityY) {
        return false;
    }

    @Override // com.p7700g.p99005.fr
    public void onNestedPreScroll(@x1 View target, int dx, int dy, @x1 int[] consumed, int type) {
        ie.b bVar;
        le J;
        int s;
        ie ieVar = this.R0;
        if (ieVar == null || (bVar = ieVar.E) == null || !bVar.K()) {
            return;
        }
        int i2 = -1;
        if (!bVar.K() || (J = bVar.J()) == null || (s = J.s()) == -1 || target.getId() == s) {
            if (ieVar.D()) {
                le J2 = bVar.J();
                if (J2 != null && (J2.f() & 4) != 0) {
                    i2 = dy;
                }
                float f2 = this.e1;
                if ((f2 == 1.0f || f2 == 0.0f) && target.canScrollVertically(i2)) {
                    return;
                }
            }
            if (bVar.J() != null && (bVar.J().f() & 1) != 0) {
                float F = ieVar.F(dx, dy);
                float f3 = this.f1;
                if ((f3 <= 0.0f && F < 0.0f) || (f3 >= 1.0f && F > 0.0f)) {
                    target.setNestedScrollingEnabled(false);
                    target.post(new c(this, target));
                    return;
                }
            }
            float f4 = this.e1;
            long nanoTime = getNanoTime();
            float f5 = dx;
            this.A1 = f5;
            float f6 = dy;
            this.B1 = f6;
            this.D1 = (float) ((nanoTime - this.C1) * 1.0E-9d);
            this.C1 = nanoTime;
            ieVar.d0(f5, f6);
            if (f4 != this.e1) {
                consumed[0] = dx;
                consumed[1] = dy;
            }
            o0(false);
            if (consumed[0] == 0 && consumed[1] == 0) {
                return;
            }
            this.z1 = true;
        }
    }

    @Override // com.p7700g.p99005.fr
    public void onNestedScroll(@x1 View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
    }

    @Override // com.p7700g.p99005.gr
    public void onNestedScroll(@x1 View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (this.z1 || dxConsumed != 0 || dyConsumed != 0) {
            consumed[0] = consumed[0] + dxUnconsumed;
            consumed[1] = consumed[1] + dyUnconsumed;
        }
        this.z1 = false;
    }

    @Override // com.p7700g.p99005.fr
    public void onNestedScrollAccepted(@x1 View child, @x1 View target, int axes, int type) {
        this.C1 = getNanoTime();
        this.D1 = 0.0f;
        this.A1 = 0.0f;
        this.B1 = 0.0f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        ie ieVar = this.R0;
        if (ieVar != null) {
            ieVar.m0(q());
        }
    }

    @Override // com.p7700g.p99005.fr
    public boolean onStartNestedScroll(@x1 View child, @x1 View target, int axes, int type) {
        ie.b bVar;
        ie ieVar = this.R0;
        return (ieVar == null || (bVar = ieVar.E) == null || bVar.J() == null || (this.R0.E.J().f() & 2) != 0) ? false : true;
    }

    @Override // com.p7700g.p99005.fr
    public void onStopNestedScroll(@x1 View target, int type) {
        ie ieVar = this.R0;
        if (ieVar != null) {
            float f2 = this.D1;
            if (f2 == 0.0f) {
                return;
            }
            ieVar.e0(this.A1 / f2, this.B1 / f2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        ie ieVar = this.R0;
        if (ieVar != null && this.a1 && ieVar.r0()) {
            ie.b bVar = this.R0.E;
            if (bVar != null && !bVar.K()) {
                return super.onTouchEvent(event);
            }
            this.R0.f0(event, getCurrentState(), this);
            if (this.R0.E.L(4)) {
                return this.R0.E.J().t();
            }
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof de) {
            de deVar = (de) view;
            if (this.I1 == null) {
                this.I1 = new CopyOnWriteArrayList<>();
            }
            this.I1.add(deVar);
            if (deVar.e()) {
                if (this.F1 == null) {
                    this.F1 = new ArrayList<>();
                }
                this.F1.add(deVar);
            }
            if (deVar.f()) {
                if (this.G1 == null) {
                    this.G1 = new ArrayList<>();
                }
                this.G1.add(deVar);
            }
            if (deVar.j()) {
                if (this.H1 == null) {
                    this.H1 = new ArrayList<>();
                }
                this.H1.add(deVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<de> arrayList = this.F1;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<de> arrayList2 = this.G1;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void r(int motionScene) {
        ie.b bVar;
        if (motionScene != 0) {
            try {
                ie ieVar = new ie(getContext(), this, motionScene);
                this.R0 = ieVar;
                if (this.W0 == -1 && ieVar != null) {
                    this.W0 = ieVar.N();
                    this.V0 = this.R0.N();
                    this.X0 = this.R0.u();
                }
                if (isAttachedToWindow()) {
                    try {
                        Display display = getDisplay();
                        this.i2 = display == null ? 0 : display.getRotation();
                        ie ieVar2 = this.R0;
                        if (ieVar2 != null) {
                            af o = ieVar2.o(this.W0);
                            this.R0.h0(this);
                            ArrayList<de> arrayList = this.H1;
                            if (arrayList != null) {
                                Iterator<de> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    it.next().b(this);
                                }
                            }
                            if (o != null) {
                                o.r(this);
                            }
                            this.V0 = this.W0;
                        }
                        K0();
                        k kVar = this.Z1;
                        if (kVar != null) {
                            if (this.k2) {
                                post(new a());
                                return;
                            } else {
                                kVar.a();
                                return;
                            }
                        }
                        ie ieVar3 = this.R0;
                        if (ieVar3 == null || (bVar = ieVar3.E) == null || bVar.z() != 4) {
                            return;
                        }
                        X0();
                        setState(m.SETUP);
                        setState(m.MOVING);
                        return;
                    } catch (Exception e2) {
                        throw new IllegalArgumentException("unable to parse MotionScene file", e2);
                    }
                }
                this.R0 = null;
                return;
            } catch (Exception e3) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e3);
            }
        }
        this.R0 = null;
    }

    public void r0() {
        int i2;
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if ((this.l1 != null || ((copyOnWriteArrayList = this.I1) != null && !copyOnWriteArrayList.isEmpty())) && this.M1 == -1) {
            this.M1 = this.W0;
            if (this.r2.isEmpty()) {
                i2 = -1;
            } else {
                ArrayList<Integer> arrayList = this.r2;
                i2 = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i3 = this.W0;
            if (i2 != i3 && i3 != -1) {
                this.r2.add(Integer.valueOf(i3));
            }
        }
        L0();
        Runnable runnable = this.a2;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.b2;
        if (iArr == null || this.c2 <= 0) {
            return;
        }
        a1(iArr[0]);
        int[] iArr2 = this.b2;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.c2--;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        ie ieVar;
        ie.b bVar;
        if (!this.P1 && this.W0 == -1 && (ieVar = this.R0) != null && (bVar = ieVar.E) != null) {
            int E = bVar.E();
            if (E == 0) {
                return;
            }
            if (E == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    this.b1.get(getChildAt(i2)).P();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int debugMode) {
        this.o1 = debugMode;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean delayedApply) {
        this.k2 = delayedApply;
    }

    public void setInteractionEnabled(boolean enabled) {
        this.a1 = enabled;
    }

    public void setInterpolatedProgress(float pos) {
        if (this.R0 != null) {
            setState(m.MOVING);
            Interpolator x = this.R0.x();
            if (x != null) {
                setProgress(x.getInterpolation(pos));
                return;
            }
        }
        setProgress(pos);
    }

    public void setOnHide(float progress) {
        ArrayList<de> arrayList = this.G1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.G1.get(i2).setProgress(progress);
            }
        }
    }

    public void setOnShow(float progress) {
        ArrayList<de> arrayList = this.F1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.F1.get(i2).setProgress(progress);
            }
        }
    }

    public void setProgress(float pos) {
        int i2 = (pos > 0.0f ? 1 : (pos == 0.0f ? 0 : -1));
        if (i2 >= 0) {
            int i3 = (pos > 1.0f ? 1 : (pos == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.Z1 == null) {
                this.Z1 = new k();
            }
            this.Z1.e(pos);
            return;
        }
        if (i2 <= 0) {
            if (this.f1 == 1.0f && this.W0 == this.X0) {
                setState(m.MOVING);
            }
            this.W0 = this.V0;
            if (this.f1 == 0.0f) {
                setState(m.FINISHED);
            }
        } else if (pos >= 1.0f) {
            if (this.f1 == 0.0f && this.W0 == this.V0) {
                setState(m.MOVING);
            }
            this.W0 = this.X0;
            if (this.f1 == 1.0f) {
                setState(m.FINISHED);
            }
        } else {
            this.W0 = -1;
            setState(m.MOVING);
        }
        if (this.R0 == null) {
            return;
        }
        this.i1 = true;
        this.h1 = pos;
        this.e1 = pos;
        this.g1 = -1L;
        this.c1 = -1L;
        this.S0 = null;
        this.j1 = true;
        invalidate();
    }

    public void setScene(ie scene) {
        this.R0 = scene;
        scene.m0(q());
        N0();
    }

    public void setStartState(int beginId) {
        if (!isAttachedToWindow()) {
            if (this.Z1 == null) {
                this.Z1 = new k();
            }
            this.Z1.f(beginId);
            this.Z1.d(beginId);
            return;
        }
        this.W0 = beginId;
    }

    public void setState(m newState) {
        m mVar = m.FINISHED;
        if (newState == mVar && this.W0 == -1) {
            return;
        }
        m mVar2 = this.l2;
        this.l2 = newState;
        m mVar3 = m.MOVING;
        if (mVar2 == mVar3 && newState == mVar3) {
            q0();
        }
        int ordinal = mVar2.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 && newState == mVar) {
                r0();
                return;
            }
            return;
        }
        if (newState == mVar3) {
            q0();
        }
        if (newState == mVar) {
            r0();
        }
    }

    public void setTransition(int transitionId) {
        if (this.R0 != null) {
            ie.b z02 = z0(transitionId);
            this.V0 = z02.I();
            this.X0 = z02.B();
            if (!isAttachedToWindow()) {
                if (this.Z1 == null) {
                    this.Z1 = new k();
                }
                this.Z1.f(this.V0);
                this.Z1.d(this.X0);
                return;
            }
            float f2 = Float.NaN;
            int i2 = this.W0;
            if (i2 == this.V0) {
                f2 = 0.0f;
            } else if (i2 == this.X0) {
                f2 = 1.0f;
            }
            this.R0.o0(z02);
            this.m2.h(this.D, this.R0.o(this.V0), this.R0.o(this.X0));
            N0();
            if (this.f1 != f2) {
                if (f2 == 0.0f) {
                    n0(true);
                    this.R0.o(this.V0).r(this);
                } else if (f2 == 1.0f) {
                    n0(false);
                    this.R0.o(this.X0).r(this);
                }
            }
            this.f1 = Float.isNaN(f2) ? 0.0f : f2;
            if (Float.isNaN(f2)) {
                qd.g();
                Z0();
                return;
            }
            setProgress(f2);
        }
    }

    public void setTransitionDuration(int milliseconds) {
        ie ieVar = this.R0;
        if (ieVar == null) {
            return;
        }
        ieVar.k0(milliseconds);
    }

    public void setTransitionListener(l listener) {
        this.l1 = listener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.Z1 == null) {
            this.Z1 = new k();
        }
        this.Z1.g(bundle);
        if (isAttachedToWindow()) {
            this.Z1.a();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void t(int id) {
        this.L = null;
    }

    public void t0(int triggerId, boolean positive, float progress) {
        l lVar = this.l1;
        if (lVar != null) {
            lVar.d(this, triggerId, positive, progress);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.I1;
        if (copyOnWriteArrayList != null) {
            Iterator<l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().d(this, triggerId, positive, progress);
            }
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return qd.i(context, this.V0) + "->" + qd.i(context, this.X0) + " (pos:" + this.f1 + " Dpos/Dt:" + this.U0;
    }

    public void u0(int mTouchAnchorId, float pos, float locationX, float locationY, float[] mAnchorDpDt) {
        HashMap<View, ce> hashMap = this.b1;
        View n = n(mTouchAnchorId);
        ce ceVar = hashMap.get(n);
        if (ceVar != null) {
            ceVar.p(pos, locationX, locationY, mAnchorDpDt);
            float y = n.getY();
            int i2 = ((pos - this.m1) > 0.0f ? 1 : ((pos - this.m1) == 0.0f ? 0 : -1));
            this.m1 = pos;
            this.n1 = y;
        } else if (n == null) {
            String str = "" + mTouchAnchorId;
        } else {
            n.getContext().getResources().getResourceName(mTouchAnchorId);
        }
    }

    public af v0(int id) {
        ie ieVar = this.R0;
        if (ieVar == null) {
            return null;
        }
        return ieVar.o(id);
    }

    public String w0(int id) {
        ie ieVar = this.R0;
        if (ieVar == null) {
            return null;
        }
        return ieVar.X(id);
    }

    public void x0(boolean showPaths) {
        this.o1 = showPaths ? 2 : 1;
        invalidate();
    }

    public ce y0(int mTouchAnchorId) {
        return this.b1.get(findViewById(mTouchAnchorId));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void z(int id, int screenWidth, int screenHeight) {
        setState(m.SETUP);
        this.W0 = id;
        this.V0 = -1;
        this.X0 = -1;
        ye yeVar = this.L;
        if (yeVar != null) {
            yeVar.e(id, screenWidth, screenHeight);
            return;
        }
        ie ieVar = this.R0;
        if (ieVar != null) {
            ieVar.o(id).r(this);
        }
    }

    public ie.b z0(int id) {
        return this.R0.O(id);
    }

    public void setTransition(ie.b transition) {
        this.R0.o0(transition);
        setState(m.SETUP);
        if (this.W0 == this.R0.u()) {
            this.f1 = 1.0f;
            this.e1 = 1.0f;
            this.h1 = 1.0f;
        } else {
            this.f1 = 0.0f;
            this.e1 = 0.0f;
            this.h1 = 0.0f;
        }
        this.g1 = transition.L(1) ? -1L : getNanoTime();
        int N = this.R0.N();
        int u = this.R0.u();
        if (N == this.V0 && u == this.X0) {
            return;
        }
        this.V0 = N;
        this.X0 = u;
        this.R0.n0(N, u);
        this.m2.h(this.D, this.R0.o(this.V0), this.R0.o(this.X0));
        this.m2.l(this.V0, this.X0);
        this.m2.k();
        N0();
    }

    public ge(@x1 Context context, @z1 AttributeSet attrs) {
        super(context, attrs);
        this.T0 = null;
        this.U0 = 0.0f;
        this.V0 = -1;
        this.W0 = -1;
        this.X0 = -1;
        this.Y0 = 0;
        this.Z0 = 0;
        this.a1 = true;
        this.b1 = new HashMap<>();
        this.c1 = 0L;
        this.d1 = 1.0f;
        this.e1 = 0.0f;
        this.f1 = 0.0f;
        this.h1 = 0.0f;
        this.j1 = false;
        this.k1 = false;
        this.o1 = 0;
        this.q1 = false;
        this.r1 = new id();
        this.s1 = new f();
        this.u1 = true;
        this.z1 = false;
        this.E1 = false;
        this.F1 = null;
        this.G1 = null;
        this.H1 = null;
        this.I1 = null;
        this.J1 = 0;
        this.K1 = -1L;
        this.L1 = 0.0f;
        this.M1 = 0;
        this.N1 = 0.0f;
        this.O1 = false;
        this.P1 = false;
        this.X1 = new k9();
        this.Y1 = false;
        this.a2 = null;
        this.b2 = null;
        this.c2 = 0;
        this.d2 = false;
        this.e2 = 0;
        this.f2 = new HashMap<>();
        this.j2 = new Rect();
        this.k2 = false;
        this.l2 = m.UNDEFINED;
        this.m2 = new h();
        this.n2 = false;
        this.o2 = new RectF();
        this.p2 = null;
        this.q2 = null;
        this.r2 = new ArrayList<>();
        C0(attrs);
    }

    public ge(@x1 Context context, @z1 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.T0 = null;
        this.U0 = 0.0f;
        this.V0 = -1;
        this.W0 = -1;
        this.X0 = -1;
        this.Y0 = 0;
        this.Z0 = 0;
        this.a1 = true;
        this.b1 = new HashMap<>();
        this.c1 = 0L;
        this.d1 = 1.0f;
        this.e1 = 0.0f;
        this.f1 = 0.0f;
        this.h1 = 0.0f;
        this.j1 = false;
        this.k1 = false;
        this.o1 = 0;
        this.q1 = false;
        this.r1 = new id();
        this.s1 = new f();
        this.u1 = true;
        this.z1 = false;
        this.E1 = false;
        this.F1 = null;
        this.G1 = null;
        this.H1 = null;
        this.I1 = null;
        this.J1 = 0;
        this.K1 = -1L;
        this.L1 = 0.0f;
        this.M1 = 0;
        this.N1 = 0.0f;
        this.O1 = false;
        this.P1 = false;
        this.X1 = new k9();
        this.Y1 = false;
        this.a2 = null;
        this.b2 = null;
        this.c2 = 0;
        this.d2 = false;
        this.e2 = 0;
        this.f2 = new HashMap<>();
        this.j2 = new Rect();
        this.k2 = false;
        this.l2 = m.UNDEFINED;
        this.m2 = new h();
        this.n2 = false;
        this.o2 = new RectF();
        this.p2 = null;
        this.q2 = null;
        this.r2 = new ArrayList<>();
        C0(attrs);
    }
}