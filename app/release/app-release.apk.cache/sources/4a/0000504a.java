package com.p7700g.p99005;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewTimeCycle.java */
/* loaded from: classes.dex */
public abstract class md extends x9 {
    private static final String p = "ViewTimeCycle";

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class a extends md {
        @Override // com.p7700g.p99005.md
        public boolean j(View view, float t, long time, k9 cache) {
            view.setAlpha(g(t, time, view, cache));
            return this.m;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class b extends md {
        public String q;
        public SparseArray<we> r;
        public SparseArray<float[]> s = new SparseArray<>();
        public float[] t;
        public float[] u;

        public b(String attribute, SparseArray<we> attrList) {
            this.q = attribute.split(",")[1];
            this.r = attrList;
        }

        @Override // com.p7700g.p99005.x9
        public void c(int position, float value, float period, int shape, float offset) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // com.p7700g.p99005.x9
        public void f(int curveType) {
            int size = this.r.size();
            int p = this.r.valueAt(0).p();
            double[] dArr = new double[size];
            int i = p + 2;
            this.t = new float[i];
            this.u = new float[p];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, i);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.r.keyAt(i2);
                float[] valueAt = this.s.valueAt(i2);
                dArr[i2] = keyAt * 0.01d;
                this.r.valueAt(i2).l(this.t);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.t;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
                dArr2[i2][p] = valueAt[0];
                dArr2[i2][p + 1] = valueAt[1];
            }
            this.f = f9.a(curveType, dArr, dArr2);
        }

        @Override // com.p7700g.p99005.md
        public boolean j(View view, float t, long time, k9 cache) {
            this.f.e(t, this.t);
            float[] fArr = this.t;
            float f = fArr[fArr.length - 2];
            float f2 = fArr[fArr.length - 1];
            long j = time - this.n;
            if (Float.isNaN(this.o)) {
                float a = cache.a(view, this.q, 0);
                this.o = a;
                if (Float.isNaN(a)) {
                    this.o = 0.0f;
                }
            }
            float f3 = (float) ((((j * 1.0E-9d) * f) + this.o) % 1.0d);
            this.o = f3;
            this.n = time;
            float a2 = a(f3);
            this.m = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.u;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.m;
                float[] fArr3 = this.t;
                this.m = z | (((double) fArr3[i]) != zg2.s);
                fArr2[i] = (fArr3[i] * a2) + f2;
                i++;
            }
            hd.b(this.r.valueAt(0), view, this.u);
            if (f != 0.0f) {
                this.m = true;
            }
            return this.m;
        }

        public void k(int position, we value, float period, int shape, float offset) {
            this.r.append(position, value);
            this.s.append(position, new float[]{period, offset});
            this.g = Math.max(this.g, shape);
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class c extends md {
        @Override // com.p7700g.p99005.md
        public boolean j(View view, float t, long time, k9 cache) {
            view.setElevation(g(t, time, view, cache));
            return this.m;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class d extends md {
        @Override // com.p7700g.p99005.md
        public boolean j(View view, float t, long time, k9 cache) {
            return this.m;
        }

        public boolean k(View view, k9 cache, float t, long time, double dx, double dy) {
            view.setRotation(g(t, time, view, cache) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
            return this.m;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class e extends md {
        public boolean q = false;

        @Override // com.p7700g.p99005.md
        public boolean j(View view, float t, long time, k9 cache) {
            if (view instanceof ge) {
                ((ge) view).setProgress(g(t, time, view, cache));
            } else if (this.q) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.q = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(g(t, time, view, cache)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.m;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class f extends md {
        @Override // com.p7700g.p99005.md
        public boolean j(View view, float t, long time, k9 cache) {
            view.setRotation(g(t, time, view, cache));
            return this.m;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class g extends md {
        @Override // com.p7700g.p99005.md
        public boolean j(View view, float t, long time, k9 cache) {
            view.setRotationX(g(t, time, view, cache));
            return this.m;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class h extends md {
        @Override // com.p7700g.p99005.md
        public boolean j(View view, float t, long time, k9 cache) {
            view.setRotationY(g(t, time, view, cache));
            return this.m;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class i extends md {
        @Override // com.p7700g.p99005.md
        public boolean j(View view, float t, long time, k9 cache) {
            view.setScaleX(g(t, time, view, cache));
            return this.m;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class j extends md {
        @Override // com.p7700g.p99005.md
        public boolean j(View view, float t, long time, k9 cache) {
            view.setScaleY(g(t, time, view, cache));
            return this.m;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class k extends md {
        @Override // com.p7700g.p99005.md
        public boolean j(View view, float t, long time, k9 cache) {
            view.setTranslationX(g(t, time, view, cache));
            return this.m;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class l extends md {
        @Override // com.p7700g.p99005.md
        public boolean j(View view, float t, long time, k9 cache) {
            view.setTranslationY(g(t, time, view, cache));
            return this.m;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class m extends md {
        @Override // com.p7700g.p99005.md
        public boolean j(View view, float t, long time, k9 cache) {
            view.setTranslationZ(g(t, time, view, cache));
            return this.m;
        }
    }

    public static md h(String str, SparseArray<we> attrList) {
        return new b(str, attrList);
    }

    public static md i(String str, long currentTime) {
        md gVar;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c2 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(td.d)) {
                    c2 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 11;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                gVar = new g();
                break;
            case 1:
                gVar = new h();
                break;
            case 2:
                gVar = new k();
                break;
            case 3:
                gVar = new l();
                break;
            case 4:
                gVar = new m();
                break;
            case 5:
                gVar = new e();
                break;
            case 6:
                gVar = new i();
                break;
            case 7:
                gVar = new j();
                break;
            case '\b':
                gVar = new f();
                break;
            case '\t':
                gVar = new c();
                break;
            case '\n':
                gVar = new d();
                break;
            case 11:
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.d(currentTime);
        return gVar;
    }

    public float g(float pos, long time, View view, k9 cache) {
        this.f.e(pos, this.l);
        float[] fArr = this.l;
        float f2 = fArr[1];
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i2 == 0) {
            this.m = false;
            return fArr[2];
        }
        if (Float.isNaN(this.o)) {
            float a2 = cache.a(view, this.k, 0);
            this.o = a2;
            if (Float.isNaN(a2)) {
                this.o = 0.0f;
            }
        }
        float f3 = (float) (((((time - this.n) * 1.0E-9d) * f2) + this.o) % 1.0d);
        this.o = f3;
        cache.b(view, this.k, 0, f3);
        this.n = time;
        float f4 = this.l[0];
        float a3 = (a(this.o) * f4) + this.l[2];
        this.m = (f4 == 0.0f && i2 == 0) ? false : true;
        return a3;
    }

    public abstract boolean j(View view, float t, long time, k9 cache);
}