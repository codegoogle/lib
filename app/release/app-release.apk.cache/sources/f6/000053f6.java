package com.p7700g.p99005;

/* compiled from: CustomAttribute.java */
/* loaded from: classes.dex */
public class o8 {
    private static final String a = "TransitionLayout";
    private boolean b;
    public String c;
    private b d;
    private int e;
    private float f;
    private String g;
    public boolean h;
    private int i;

    /* compiled from: CustomAttribute.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            b.values();
            int[] iArr = new int[8];
            a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: CustomAttribute.java */
    /* loaded from: classes.dex */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public o8(String str, b bVar) {
        this.b = false;
        this.c = str;
        this.d = bVar;
    }

    private static int a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static int f(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int i = (int) f4;
        float f5 = f4 - i;
        float f6 = f3 * 255.0f;
        int a2 = (int) wo1.a(1.0f, f2, f6, 0.5f);
        int i2 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i3 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i4 = (int) (f6 + 0.5f);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return 0;
                            }
                            return ((i4 << 16) + (a2 << 8) + i2) | sr.t;
                        }
                        return ((i3 << 16) + (a2 << 8) + i4) | sr.t;
                    }
                    return ((a2 << 16) + (i2 << 8) + i4) | sr.t;
                }
                return ((a2 << 16) + (i4 << 8) + i3) | sr.t;
            }
            return ((i2 << 16) + (i4 << 8) + a2) | sr.t;
        }
        return ((i4 << 16) + (i3 << 8) + a2) | sr.t;
    }

    public boolean b(o8 o8Var) {
        b bVar;
        if (o8Var == null || (bVar = this.d) != o8Var.d) {
            return false;
        }
        switch (bVar.ordinal()) {
            case 0:
            case 7:
                return this.e == o8Var.e;
            case 1:
                return this.f == o8Var.f;
            case 2:
            case 3:
                return this.i == o8Var.i;
            case 4:
                return this.e == o8Var.e;
            case 5:
                return this.h == o8Var.h;
            case 6:
                return this.f == o8Var.f;
            default:
                return false;
        }
    }

    public b c() {
        return this.d;
    }

    public float d() {
        switch (this.d.ordinal()) {
            case 0:
                return this.e;
            case 1:
                return this.f;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.h ? 1.0f : 0.0f;
            case 6:
                return this.f;
            default:
                return Float.NaN;
        }
    }

    public void e(float[] fArr) {
        switch (this.d.ordinal()) {
            case 0:
                fArr[0] = this.e;
                return;
            case 1:
                fArr[0] = this.f;
                return;
            case 2:
            case 3:
                int i = this.i;
                float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.h ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f;
                return;
            default:
                return;
        }
    }

    public boolean g() {
        int ordinal = this.d.ordinal();
        return (ordinal == 4 || ordinal == 5 || ordinal == 7) ? false : true;
    }

    public int h() {
        int ordinal = this.d.ordinal();
        return (ordinal == 2 || ordinal == 3) ? 4 : 1;
    }

    public void i(int i) {
        this.i = i;
    }

    public void j(float f) {
        this.f = f;
    }

    public void k(int i) {
        this.e = i;
    }

    public void l(String str) {
        this.g = str;
    }

    public void m(Object obj) {
        switch (this.d.ordinal()) {
            case 0:
            case 7:
                this.e = ((Integer) obj).intValue();
                return;
            case 1:
                this.f = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.i = ((Integer) obj).intValue();
                return;
            case 4:
                this.g = (String) obj;
                return;
            case 5:
                this.h = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public void n(float[] fArr) {
        switch (this.d.ordinal()) {
            case 0:
            case 7:
                this.e = (int) fArr[0];
                return;
            case 1:
                this.f = fArr[0];
                return;
            case 2:
            case 3:
                int f = f(fArr[0], fArr[1], fArr[2]);
                this.i = f;
                this.i = (a((int) (fArr[3] * 255.0f)) << 24) | (f & sr.s);
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                this.h = ((double) fArr[0]) > 0.5d;
                return;
            case 6:
                this.f = fArr[0];
                return;
            default:
                return;
        }
    }

    public o8(String str, b bVar, Object obj, boolean z) {
        this.b = false;
        this.c = str;
        this.d = bVar;
        this.b = z;
        m(obj);
    }

    public o8(o8 o8Var, Object obj) {
        this.b = false;
        this.c = o8Var.c;
        this.d = o8Var.d;
        m(obj);
    }
}