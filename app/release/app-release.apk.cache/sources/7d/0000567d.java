package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.p7700g.p99005.qk0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TextLayer.java */
/* loaded from: classes.dex */
public class pm0 extends im0 {
    private final StringBuilder H;
    private final RectF I;
    private final Matrix J;
    private final Paint K;
    private final Paint L;
    private final Map<sk0, List<zi0>> M;
    private final v7<String> N;
    private final hk0 O;
    private final hi0 P;
    private final ei0 Q;
    @z1
    private tj0<Integer, Integer> R;
    @z1
    private tj0<Integer, Integer> S;
    @z1
    private tj0<Integer, Integer> T;
    @z1
    private tj0<Integer, Integer> U;
    @z1
    private tj0<Float, Float> V;
    @z1
    private tj0<Float, Float> W;
    @z1
    private tj0<Float, Float> X;
    @z1
    private tj0<Float, Float> Y;
    @z1
    private tj0<Float, Float> Z;
    @z1
    private tj0<Typeface, Typeface> a0;

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public class a extends Paint {
        public a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public class b extends Paint {
        public b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            qk0.a.values();
            int[] iArr = new int[3];
            a = iArr;
            try {
                iArr[qk0.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[qk0.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[qk0.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public pm0(hi0 hi0Var, lm0 lm0Var) {
        super(hi0Var, lm0Var);
        zk0 zk0Var;
        zk0 zk0Var2;
        yk0 yk0Var;
        yk0 yk0Var2;
        this.H = new StringBuilder(2);
        this.I = new RectF();
        this.J = new Matrix();
        this.K = new a(1);
        this.L = new b(1);
        this.M = new HashMap();
        this.N = new v7<>();
        this.P = hi0Var;
        this.Q = lm0Var.b();
        hk0 a2 = lm0Var.s().a();
        this.O = a2;
        a2.a(this);
        f(a2);
        il0 t = lm0Var.t();
        if (t != null && (yk0Var2 = t.a) != null) {
            tj0<Integer, Integer> a3 = yk0Var2.a();
            this.R = a3;
            a3.a(this);
            f(this.R);
        }
        if (t != null && (yk0Var = t.b) != null) {
            tj0<Integer, Integer> a4 = yk0Var.a();
            this.T = a4;
            a4.a(this);
            f(this.T);
        }
        if (t != null && (zk0Var2 = t.c) != null) {
            tj0<Float, Float> a5 = zk0Var2.a();
            this.V = a5;
            a5.a(this);
            f(this.V);
        }
        if (t == null || (zk0Var = t.d) == null) {
            return;
        }
        tj0<Float, Float> a6 = zk0Var.a();
        this.X = a6;
        a6.a(this);
        f(this.X);
    }

    private void O(qk0.a aVar, Canvas canvas, float f) {
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            canvas.translate(-f, 0.0f);
        } else if (ordinal != 2) {
        } else {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    private String P(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!c0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.N.d(j)) {
            return this.N.h(j);
        }
        this.H.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.H.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.H.toString();
        this.N.u(j, sb);
        return sb;
    }

    private void Q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void R(sk0 sk0Var, Matrix matrix, float f, qk0 qk0Var, Canvas canvas) {
        List<zi0> Y = Y(sk0Var);
        for (int i = 0; i < Y.size(); i++) {
            Path path = Y.get(i).getPath();
            path.computeBounds(this.I, false);
            this.J.set(matrix);
            this.J.preTranslate(0.0f, cp0.e() * (-qk0Var.g));
            this.J.preScale(f, f);
            path.transform(this.J);
            if (qk0Var.k) {
                U(path, this.K, canvas);
                U(path, this.L, canvas);
            } else {
                U(path, this.L, canvas);
                U(path, this.K, canvas);
            }
        }
    }

    private void S(String str, qk0 qk0Var, Canvas canvas) {
        if (qk0Var.k) {
            Q(str, this.K, canvas);
            Q(str, this.L, canvas);
            return;
        }
        Q(str, this.L, canvas);
        Q(str, this.K, canvas);
    }

    private void T(String str, qk0 qk0Var, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String P = P(str, i);
            i += P.length();
            S(P, qk0Var, canvas);
            canvas.translate(this.K.measureText(P) + f, 0.0f);
        }
    }

    private void U(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void V(String str, qk0 qk0Var, Matrix matrix, rk0 rk0Var, Canvas canvas, float f, float f2) {
        float floatValue;
        for (int i = 0; i < str.length(); i++) {
            sk0 h = this.Q.c().h(sk0.c(str.charAt(i), rk0Var.b(), rk0Var.d()));
            if (h != null) {
                R(h, matrix, f2, qk0Var, canvas);
                float e = cp0.e() * ((float) h.b()) * f2 * f;
                float f3 = qk0Var.e / 10.0f;
                tj0<Float, Float> tj0Var = this.Y;
                if (tj0Var != null) {
                    floatValue = tj0Var.h().floatValue();
                } else {
                    tj0<Float, Float> tj0Var2 = this.X;
                    if (tj0Var2 != null) {
                        floatValue = tj0Var2.h().floatValue();
                    }
                    canvas.translate((f3 * f) + e, 0.0f);
                }
                f3 += floatValue;
                canvas.translate((f3 * f) + e, 0.0f);
            }
        }
    }

    private void W(qk0 qk0Var, Matrix matrix, rk0 rk0Var, Canvas canvas) {
        float f;
        tj0<Float, Float> tj0Var = this.Z;
        if (tj0Var != null) {
            f = tj0Var.h().floatValue();
        } else {
            f = qk0Var.c;
        }
        float f2 = f / 100.0f;
        float g = cp0.g(matrix);
        String str = qk0Var.a;
        float e = cp0.e() * qk0Var.f;
        List<String> a0 = a0(str);
        int size = a0.size();
        for (int i = 0; i < size; i++) {
            String str2 = a0.get(i);
            float Z = Z(str2, rk0Var, f2, g);
            canvas.save();
            O(qk0Var.d, canvas, Z);
            canvas.translate(0.0f, (i * e) - (((size - 1) * e) / 2.0f));
            V(str2, qk0Var, matrix, rk0Var, canvas, g, f2);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[LOOP:0: B:20:0x0091->B:21:0x0093, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void X(qk0 qk0Var, rk0 rk0Var, Canvas canvas) {
        float f;
        float floatValue;
        int size;
        int i;
        Typeface b0 = b0(rk0Var);
        if (b0 == null) {
            return;
        }
        String str = qk0Var.a;
        ui0 S = this.P.S();
        if (S != null) {
            str = S.c(getName(), str);
        }
        this.K.setTypeface(b0);
        tj0<Float, Float> tj0Var = this.Z;
        if (tj0Var != null) {
            f = tj0Var.h().floatValue();
        } else {
            f = qk0Var.c;
        }
        this.K.setTextSize(cp0.e() * f);
        this.L.setTypeface(this.K.getTypeface());
        this.L.setTextSize(this.K.getTextSize());
        float e = cp0.e() * qk0Var.f;
        float f2 = qk0Var.e / 10.0f;
        tj0<Float, Float> tj0Var2 = this.Y;
        if (tj0Var2 != null) {
            floatValue = tj0Var2.h().floatValue();
        } else {
            tj0<Float, Float> tj0Var3 = this.X;
            if (tj0Var3 != null) {
                floatValue = tj0Var3.h().floatValue();
            }
            float e2 = ((cp0.e() * f2) * f) / 100.0f;
            List<String> a0 = a0(str);
            size = a0.size();
            for (i = 0; i < size; i++) {
                String str2 = a0.get(i);
                float length = ((str2.length() - 1) * e2) + this.L.measureText(str2);
                canvas.save();
                O(qk0Var.d, canvas, length);
                canvas.translate(0.0f, (i * e) - (((size - 1) * e) / 2.0f));
                T(str2, qk0Var, canvas, e2);
                canvas.restore();
            }
        }
        f2 += floatValue;
        float e22 = ((cp0.e() * f2) * f) / 100.0f;
        List<String> a02 = a0(str);
        size = a02.size();
        while (i < size) {
        }
    }

    private List<zi0> Y(sk0 sk0Var) {
        if (this.M.containsKey(sk0Var)) {
            return this.M.get(sk0Var);
        }
        List<cm0> a2 = sk0Var.a();
        int size = a2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new zi0(this.P, this, a2.get(i)));
        }
        this.M.put(sk0Var, arrayList);
        return arrayList;
    }

    private float Z(String str, rk0 rk0Var, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            sk0 h = this.Q.c().h(sk0.c(str.charAt(i), rk0Var.b(), rk0Var.d()));
            if (h != null) {
                f3 = (float) ((h.b() * f * cp0.e() * f2) + f3);
            }
        }
        return f3;
    }

    private List<String> a0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @z1
    private Typeface b0(rk0 rk0Var) {
        Typeface h;
        tj0<Typeface, Typeface> tj0Var = this.a0;
        if (tj0Var == null || (h = tj0Var.h()) == null) {
            Typeface T = this.P.T(rk0Var.b(), rk0Var.d());
            return T != null ? T : rk0Var.e();
        }
        return h;
    }

    private boolean c0(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    @Override // com.p7700g.p99005.im0, com.p7700g.p99005.aj0
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.Q.b().width(), this.Q.b().height());
    }

    @Override // com.p7700g.p99005.im0, com.p7700g.p99005.uk0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        super.h(t, np0Var);
        if (t == mi0.a) {
            tj0<Integer, Integer> tj0Var = this.S;
            if (tj0Var != null) {
                G(tj0Var);
            }
            if (np0Var == null) {
                this.S = null;
                return;
            }
            jk0 jk0Var = new jk0(np0Var);
            this.S = jk0Var;
            jk0Var.a(this);
            f(this.S);
        } else if (t == mi0.b) {
            tj0<Integer, Integer> tj0Var2 = this.U;
            if (tj0Var2 != null) {
                G(tj0Var2);
            }
            if (np0Var == null) {
                this.U = null;
                return;
            }
            jk0 jk0Var2 = new jk0(np0Var);
            this.U = jk0Var2;
            jk0Var2.a(this);
            f(this.U);
        } else if (t == mi0.s) {
            tj0<Float, Float> tj0Var3 = this.W;
            if (tj0Var3 != null) {
                G(tj0Var3);
            }
            if (np0Var == null) {
                this.W = null;
                return;
            }
            jk0 jk0Var3 = new jk0(np0Var);
            this.W = jk0Var3;
            jk0Var3.a(this);
            f(this.W);
        } else if (t == mi0.t) {
            tj0<Float, Float> tj0Var4 = this.Y;
            if (tj0Var4 != null) {
                G(tj0Var4);
            }
            if (np0Var == null) {
                this.Y = null;
                return;
            }
            jk0 jk0Var4 = new jk0(np0Var);
            this.Y = jk0Var4;
            jk0Var4.a(this);
            f(this.Y);
        } else if (t == mi0.F) {
            tj0<Float, Float> tj0Var5 = this.Z;
            if (tj0Var5 != null) {
                G(tj0Var5);
            }
            if (np0Var == null) {
                this.Z = null;
                return;
            }
            jk0 jk0Var5 = new jk0(np0Var);
            this.Z = jk0Var5;
            jk0Var5.a(this);
            f(this.Z);
        } else if (t == mi0.M) {
            tj0<Typeface, Typeface> tj0Var6 = this.a0;
            if (tj0Var6 != null) {
                G(tj0Var6);
            }
            if (np0Var == null) {
                this.a0 = null;
                return;
            }
            jk0 jk0Var6 = new jk0(np0Var);
            this.a0 = jk0Var6;
            jk0Var6.a(this);
            f(this.a0);
        } else if (t == mi0.O) {
            this.O.q(np0Var);
        }
    }

    @Override // com.p7700g.p99005.im0
    public void s(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.P.x1()) {
            canvas.concat(matrix);
        }
        qk0 h = this.O.h();
        rk0 rk0Var = this.Q.g().get(h.b);
        if (rk0Var == null) {
            canvas.restore();
            return;
        }
        tj0<Integer, Integer> tj0Var = this.S;
        if (tj0Var != null) {
            this.K.setColor(tj0Var.h().intValue());
        } else {
            tj0<Integer, Integer> tj0Var2 = this.R;
            if (tj0Var2 != null) {
                this.K.setColor(tj0Var2.h().intValue());
            } else {
                this.K.setColor(h.h);
            }
        }
        tj0<Integer, Integer> tj0Var3 = this.U;
        if (tj0Var3 != null) {
            this.L.setColor(tj0Var3.h().intValue());
        } else {
            tj0<Integer, Integer> tj0Var4 = this.T;
            if (tj0Var4 != null) {
                this.L.setColor(tj0Var4.h().intValue());
            } else {
                this.L.setColor(h.i);
            }
        }
        int intValue = ((this.B.h() == null ? 100 : this.B.h().h().intValue()) * 255) / 100;
        this.K.setAlpha(intValue);
        this.L.setAlpha(intValue);
        tj0<Float, Float> tj0Var5 = this.W;
        if (tj0Var5 != null) {
            this.L.setStrokeWidth(tj0Var5.h().floatValue());
        } else {
            tj0<Float, Float> tj0Var6 = this.V;
            if (tj0Var6 != null) {
                this.L.setStrokeWidth(tj0Var6.h().floatValue());
            } else {
                this.L.setStrokeWidth(cp0.e() * h.j * cp0.g(matrix));
            }
        }
        if (this.P.x1()) {
            W(h, matrix, rk0Var, canvas);
        } else {
            X(h, rk0Var, canvas);
        }
        canvas.restore();
    }
}