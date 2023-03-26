package com.p7700g.p99005;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewOscillator.java */
/* loaded from: classes.dex */
public abstract class jd extends l9 {
    private static final String i = "ViewOscillator";

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class a extends jd {
        @Override // com.p7700g.p99005.jd
        public void m(View view, float t) {
            view.setAlpha(a(t));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class b extends jd {
        public float[] j = new float[1];
        public we k;

        @Override // com.p7700g.p99005.l9
        public void e(Object custom) {
            this.k = (we) custom;
        }

        @Override // com.p7700g.p99005.jd
        public void m(View view, float t) {
            this.j[0] = a(t);
            hd.b(this.k, view, this.j);
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class c extends jd {
        @Override // com.p7700g.p99005.jd
        public void m(View view, float t) {
            view.setElevation(a(t));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class d extends jd {
        @Override // com.p7700g.p99005.jd
        public void m(View view, float t) {
        }

        public void n(View view, float t, double dx, double dy) {
            view.setRotation(a(t) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class e extends jd {
        public boolean j = false;

        @Override // com.p7700g.p99005.jd
        public void m(View view, float t) {
            if (view instanceof ge) {
                ((ge) view).setProgress(a(t));
            } else if (this.j) {
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.j = true;
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

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class f extends jd {
        @Override // com.p7700g.p99005.jd
        public void m(View view, float t) {
            view.setRotation(a(t));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class g extends jd {
        @Override // com.p7700g.p99005.jd
        public void m(View view, float t) {
            view.setRotationX(a(t));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class h extends jd {
        @Override // com.p7700g.p99005.jd
        public void m(View view, float t) {
            view.setRotationY(a(t));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class i extends jd {
        @Override // com.p7700g.p99005.jd
        public void m(View view, float t) {
            view.setScaleX(a(t));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class j extends jd {
        @Override // com.p7700g.p99005.jd
        public void m(View view, float t) {
            view.setScaleY(a(t));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class k extends jd {
        @Override // com.p7700g.p99005.jd
        public void m(View view, float t) {
            view.setTranslationX(a(t));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class l extends jd {
        @Override // com.p7700g.p99005.jd
        public void m(View view, float t) {
            view.setTranslationY(a(t));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class m extends jd {
        @Override // com.p7700g.p99005.jd
        public void m(View view, float t) {
            view.setTranslationZ(a(t));
        }
    }

    public static jd l(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
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
            case -40300674:
                if (str.equals(td.d)) {
                    c2 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c2 = '\r';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                return new e();
            case 6:
                return new i();
            case 7:
                return new j();
            case '\b':
                return new a();
            case '\t':
                return new f();
            case '\n':
                return new c();
            case 11:
                return new d();
            case '\f':
                return new a();
            case '\r':
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float t);
}