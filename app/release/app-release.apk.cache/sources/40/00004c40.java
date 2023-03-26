package com.p7700g.p99005;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewSpline.java */
/* loaded from: classes.dex */
public abstract class kd extends s9 {
    private static final String g = "ViewSpline";

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class a extends kd {
        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            view.setAlpha(a(t));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class b extends kd {
        public String h;
        public SparseArray<we> i;
        public float[] j;

        public b(String attribute, SparseArray<we> attrList) {
            this.h = attribute.split(",")[1];
            this.i = attrList;
        }

        @Override // com.p7700g.p99005.s9
        public void g(int position, float value) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // com.p7700g.p99005.s9
        public void j(int curveType) {
            int size = this.i.size();
            int p = this.i.valueAt(0).p();
            double[] dArr = new double[size];
            this.j = new float[p];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, p);
            for (int i = 0; i < size; i++) {
                dArr[i] = this.i.keyAt(i) * 0.01d;
                this.i.valueAt(i).l(this.j);
                int i2 = 0;
                while (true) {
                    float[] fArr = this.j;
                    if (i2 < fArr.length) {
                        dArr2[i][i2] = fArr[i2];
                        i2++;
                    }
                }
            }
            this.b = f9.a(curveType, dArr, dArr2);
        }

        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            this.b.e(t, this.j);
            hd.b(this.i.valueAt(0), view, this.j);
        }

        public void n(int position, we value) {
            this.i.append(position, value);
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class c extends kd {
        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            view.setElevation(a(t));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class d extends kd {
        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
        }

        public void n(View view, float t, double dx, double dy) {
            view.setRotation(a(t) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class e extends kd {
        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            view.setPivotX(a(t));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class f extends kd {
        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            view.setPivotY(a(t));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class g extends kd {
        public boolean h = false;

        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            if (view instanceof ge) {
                ((ge) view).setProgress(a(t));
            } else if (this.h) {
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.h = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(t)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class h extends kd {
        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            view.setRotation(a(t));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class i extends kd {
        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            view.setRotationX(a(t));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class j extends kd {
        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            view.setRotationY(a(t));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class k extends kd {
        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            view.setScaleX(a(t));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class l extends kd {
        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            view.setScaleY(a(t));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class m extends kd {
        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            view.setTranslationX(a(t));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class n extends kd {
        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            view.setTranslationY(a(t));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class o extends kd {
        @Override // com.p7700g.p99005.kd
        public void m(View view, float t) {
            view.setTranslationZ(a(t));
        }
    }

    public static kd k(String str, SparseArray<we> attrList) {
        return new b(str, attrList);
    }

    public static kd l(String str) {
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
            case -797520672:
                if (str.equals(td.o)) {
                    c2 = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals(td.g)) {
                    c2 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals(td.h)) {
                    c2 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals(td.d)) {
                    c2 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c2 = 15;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new m();
            case 3:
                return new n();
            case 4:
                return new o();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case '\b':
                return new a();
            case '\t':
                return new e();
            case '\n':
                return new f();
            case 11:
                return new h();
            case '\f':
                return new c();
            case '\r':
                return new d();
            case 14:
                return new a();
            case 15:
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float t);
}