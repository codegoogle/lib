package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: RequestBuilder.java */
/* loaded from: classes2.dex */
public class ip1<TranscodeType> extends ry1<ip1<TranscodeType>> implements Cloneable, ep1<ip1<TranscodeType>> {
    public static final zy1 H0 = new zy1().B(qr1.c).O0(fp1.LOW).W0(true);
    private final Context I0;
    private final jp1 J0;
    private final Class<TranscodeType> K0;
    private final yo1 L0;
    private final ap1 M0;
    @x1
    private kp1<?, ? super TranscodeType> N0;
    @z1
    private Object O0;
    @z1
    private List<yy1<TranscodeType>> P0;
    @z1
    private ip1<TranscodeType> Q0;
    @z1
    private ip1<TranscodeType> R0;
    @z1
    private Float S0;
    private boolean T0;
    private boolean U0;
    private boolean V0;

    /* compiled from: RequestBuilder.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            fp1.values();
            int[] iArr = new int[4];
            b = iArr;
            try {
                iArr[fp1.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[fp1.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[fp1.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[fp1.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public ip1(@x1 yo1 yo1Var, jp1 jp1Var, Class<TranscodeType> cls, Context context) {
        this.T0 = true;
        this.L0 = yo1Var;
        this.J0 = jp1Var;
        this.K0 = cls;
        this.I0 = context;
        this.N0 = jp1Var.E(cls);
        this.M0 = yo1Var.k();
        y1(jp1Var.C());
        b(jp1Var.D());
    }

    private <Y extends sz1<TranscodeType>> Y B1(@x1 Y y, @z1 yy1<TranscodeType> yy1Var, ry1<?> ry1Var, Executor executor) {
        x02.d(y);
        if (this.U0) {
            vy1 n1 = n1(y, yy1Var, ry1Var, executor);
            vy1 m = y.m();
            if (n1.d(m) && !F1(ry1Var, m)) {
                if (!((vy1) x02.d(m)).isRunning()) {
                    m.h();
                }
                return y;
            }
            this.J0.z(y);
            y.j(n1);
            this.J0.Y(y, n1);
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    private boolean F1(ry1<?> ry1Var, vy1 vy1Var) {
        return !ry1Var.o0() && vy1Var.j();
    }

    @x1
    private ip1<TranscodeType> S1(@z1 Object obj) {
        if (l0()) {
            return x().S1(obj);
        }
        this.O0 = obj;
        this.U0 = true;
        return S0();
    }

    private vy1 U1(Object obj, sz1<TranscodeType> sz1Var, yy1<TranscodeType> yy1Var, ry1<?> ry1Var, wy1 wy1Var, kp1<?, ? super TranscodeType> kp1Var, fp1 fp1Var, int i, int i2, Executor executor) {
        Context context = this.I0;
        ap1 ap1Var = this.M0;
        return bz1.y(context, ap1Var, obj, this.O0, this.K0, ry1Var, i, i2, fp1Var, sz1Var, yy1Var, this.P0, wy1Var, ap1Var.f(), kp1Var.c(), executor);
    }

    private vy1 n1(sz1<TranscodeType> sz1Var, @z1 yy1<TranscodeType> yy1Var, ry1<?> ry1Var, Executor executor) {
        return o1(new Object(), sz1Var, yy1Var, null, this.N0, ry1Var.d0(), ry1Var.a0(), ry1Var.Z(), ry1Var, executor);
    }

    private vy1 o1(Object obj, sz1<TranscodeType> sz1Var, @z1 yy1<TranscodeType> yy1Var, @z1 wy1 wy1Var, kp1<?, ? super TranscodeType> kp1Var, fp1 fp1Var, int i, int i2, ry1<?> ry1Var, Executor executor) {
        sy1 sy1Var;
        sy1 sy1Var2;
        if (this.R0 != null) {
            sy1Var2 = new sy1(obj, wy1Var);
            sy1Var = sy1Var2;
        } else {
            sy1Var = null;
            sy1Var2 = wy1Var;
        }
        vy1 p1 = p1(obj, sz1Var, yy1Var, sy1Var2, kp1Var, fp1Var, i, i2, ry1Var, executor);
        if (sy1Var == null) {
            return p1;
        }
        int a0 = this.R0.a0();
        int Z = this.R0.Z();
        if (z02.w(i, i2) && !this.R0.z0()) {
            a0 = ry1Var.a0();
            Z = ry1Var.Z();
        }
        ip1<TranscodeType> ip1Var = this.R0;
        sy1 sy1Var3 = sy1Var;
        sy1Var3.p(p1, ip1Var.o1(obj, sz1Var, yy1Var, sy1Var3, ip1Var.N0, ip1Var.d0(), a0, Z, this.R0, executor));
        return sy1Var3;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.p7700g.p99005.ry1] */
    private vy1 p1(Object obj, sz1<TranscodeType> sz1Var, yy1<TranscodeType> yy1Var, @z1 wy1 wy1Var, kp1<?, ? super TranscodeType> kp1Var, fp1 fp1Var, int i, int i2, ry1<?> ry1Var, Executor executor) {
        fp1 x1;
        ip1<TranscodeType> ip1Var = this.Q0;
        if (ip1Var != null) {
            if (!this.V0) {
                kp1<?, ? super TranscodeType> kp1Var2 = ip1Var.T0 ? kp1Var : ip1Var.N0;
                if (ip1Var.p0()) {
                    x1 = this.Q0.d0();
                } else {
                    x1 = x1(fp1Var);
                }
                fp1 fp1Var2 = x1;
                int a0 = this.Q0.a0();
                int Z = this.Q0.Z();
                if (z02.w(i, i2) && !this.Q0.z0()) {
                    a0 = ry1Var.a0();
                    Z = ry1Var.Z();
                }
                cz1 cz1Var = new cz1(obj, wy1Var);
                vy1 U1 = U1(obj, sz1Var, yy1Var, ry1Var, cz1Var, kp1Var, fp1Var, i, i2, executor);
                this.V0 = true;
                ip1<TranscodeType> ip1Var2 = this.Q0;
                vy1 o1 = ip1Var2.o1(obj, sz1Var, yy1Var, cz1Var, kp1Var2, fp1Var2, a0, Z, ip1Var2, executor);
                this.V0 = false;
                cz1Var.o(U1, o1);
                return cz1Var;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.S0 != null) {
            cz1 cz1Var2 = new cz1(obj, wy1Var);
            cz1Var2.o(U1(obj, sz1Var, yy1Var, ry1Var, cz1Var2, kp1Var, fp1Var, i, i2, executor), U1(obj, sz1Var, yy1Var, ry1Var.clone().V0(this.S0.floatValue()), cz1Var2, kp1Var, x1(fp1Var), i, i2, executor));
            return cz1Var2;
        } else {
            return U1(obj, sz1Var, yy1Var, ry1Var, wy1Var, kp1Var, fp1Var, i, i2, executor);
        }
    }

    private ip1<TranscodeType> r1() {
        return x().u1(null).a2(null);
    }

    @x1
    private fp1 x1(@x1 fp1 fp1Var) {
        int ordinal = fp1Var.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return fp1.IMMEDIATE;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return fp1.NORMAL;
            }
            StringBuilder G = wo1.G("unknown priority: ");
            G.append(d0());
            throw new IllegalArgumentException(G.toString());
        }
        return fp1.HIGH;
    }

    @SuppressLint({"CheckResult"})
    private void y1(List<yy1<Object>> list) {
        for (yy1<Object> yy1Var : list) {
            l1(yy1Var);
        }
    }

    @x1
    public <Y extends sz1<TranscodeType>> Y A1(@x1 Y y) {
        return (Y) C1(y, null, q02.b());
    }

    @x1
    public <Y extends sz1<TranscodeType>> Y C1(@x1 Y y, @z1 yy1<TranscodeType> yy1Var, Executor executor) {
        return (Y) B1(y, yy1Var, this, executor);
    }

    @x1
    public uz1<ImageView, TranscodeType> E1(@x1 ImageView imageView) {
        ry1<?> ry1Var;
        z02.b();
        x02.d(imageView);
        if (!y0() && u0() && imageView.getScaleType() != null) {
            switch (a.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    ry1Var = x().C0();
                    break;
                case 2:
                    ry1Var = x().D0();
                    break;
                case 3:
                case 4:
                case 5:
                    ry1Var = x().F0();
                    break;
                case 6:
                    ry1Var = x().D0();
                    break;
            }
            return (uz1) B1(this.M0.a(imageView, this.K0), null, ry1Var, q02.b());
        }
        ry1Var = this;
        return (uz1) B1(this.M0.a(imageView, this.K0), null, ry1Var, q02.b());
    }

    @x1
    @u0
    public ip1<TranscodeType> G1(@z1 yy1<TranscodeType> yy1Var) {
        if (l0()) {
            return x().G1(yy1Var);
        }
        this.P0 = null;
        return l1(yy1Var);
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: H1 */
    public ip1<TranscodeType> i(@z1 Bitmap bitmap) {
        return S1(bitmap).b(zy1.q1(qr1.b));
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: I1 */
    public ip1<TranscodeType> h(@z1 Drawable drawable) {
        return S1(drawable).b(zy1.q1(qr1.b));
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: L1 */
    public ip1<TranscodeType> e(@z1 Uri uri) {
        return S1(uri);
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: M1 */
    public ip1<TranscodeType> g(@z1 File file) {
        return S1(file);
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: N1 */
    public ip1<TranscodeType> o(@f1 @z1 @d2 Integer num) {
        return S1(num).b(zy1.I1(g02.c(this.I0)));
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: O1 */
    public ip1<TranscodeType> n(@z1 Object obj) {
        return S1(obj);
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: P1 */
    public ip1<TranscodeType> a(@z1 String str) {
        return S1(str);
    }

    @Override // com.p7700g.p99005.ep1
    @u0
    @Deprecated
    /* renamed from: Q1 */
    public ip1<TranscodeType> d(@z1 URL url) {
        return S1(url);
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: R1 */
    public ip1<TranscodeType> f(@z1 byte[] bArr) {
        ip1<TranscodeType> S1 = S1(bArr);
        if (!S1.m0()) {
            S1 = S1.b(zy1.q1(qr1.b));
        }
        return !S1.t0() ? S1.b(zy1.M1(true)) : S1;
    }

    @x1
    public sz1<TranscodeType> V1() {
        return W1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @x1
    public sz1<TranscodeType> W1(int i, int i2) {
        return A1(pz1.d(this.J0, i, i2));
    }

    @x1
    public uy1<TranscodeType> X1() {
        return Y1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @x1
    public uy1<TranscodeType> Y1(int i, int i2) {
        xy1 xy1Var = new xy1(i, i2);
        return (uy1) C1(xy1Var, xy1Var, q02.a());
    }

    @x1
    @u0
    @Deprecated
    public ip1<TranscodeType> Z1(float f) {
        if (l0()) {
            return x().Z1(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.S0 = Float.valueOf(f);
            return S0();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    @x1
    @u0
    public ip1<TranscodeType> a2(@z1 ip1<TranscodeType> ip1Var) {
        if (l0()) {
            return x().a2(ip1Var);
        }
        this.Q0 = ip1Var;
        return S0();
    }

    @x1
    @u0
    public ip1<TranscodeType> b2(@z1 List<ip1<TranscodeType>> list) {
        ip1<TranscodeType> ip1Var = null;
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ip1<TranscodeType> ip1Var2 = list.get(size);
                if (ip1Var2 != null) {
                    ip1Var = ip1Var == null ? ip1Var2 : ip1Var2.a2(ip1Var);
                }
            }
            return a2(ip1Var);
        }
        return a2(null);
    }

    @x1
    @u0
    public ip1<TranscodeType> c2(@z1 ip1<TranscodeType>... ip1VarArr) {
        if (ip1VarArr != null && ip1VarArr.length != 0) {
            return b2(Arrays.asList(ip1VarArr));
        }
        return a2(null);
    }

    @x1
    @u0
    public ip1<TranscodeType> d2(@x1 kp1<?, ? super TranscodeType> kp1Var) {
        if (l0()) {
            return x().d2(kp1Var);
        }
        this.N0 = (kp1) x02.d(kp1Var);
        this.T0 = false;
        return S0();
    }

    @x1
    @u0
    public ip1<TranscodeType> l1(@z1 yy1<TranscodeType> yy1Var) {
        if (l0()) {
            return x().l1(yy1Var);
        }
        if (yy1Var != null) {
            if (this.P0 == null) {
                this.P0 = new ArrayList();
            }
            this.P0.add(yy1Var);
        }
        return S0();
    }

    @Override // com.p7700g.p99005.ry1
    @x1
    @u0
    /* renamed from: m1 */
    public ip1<TranscodeType> b(@x1 ry1<?> ry1Var) {
        x02.d(ry1Var);
        return (ip1) super.b(ry1Var);
    }

    @Override // com.p7700g.p99005.ry1
    @u0
    /* renamed from: q1 */
    public ip1<TranscodeType> x() {
        ip1<TranscodeType> ip1Var = (ip1) super.clone();
        ip1Var.N0 = (kp1<?, ? super TranscodeType>) ip1Var.N0.clone();
        if (ip1Var.P0 != null) {
            ip1Var.P0 = new ArrayList(ip1Var.P0);
        }
        ip1<TranscodeType> ip1Var2 = ip1Var.Q0;
        if (ip1Var2 != null) {
            ip1Var.Q0 = ip1Var2.x();
        }
        ip1<TranscodeType> ip1Var3 = ip1Var.R0;
        if (ip1Var3 != null) {
            ip1Var.R0 = ip1Var3.x();
        }
        return ip1Var;
    }

    @u0
    @Deprecated
    public uy1<File> s1(int i, int i2) {
        return w1().Y1(i, i2);
    }

    @u0
    @Deprecated
    public <Y extends sz1<File>> Y t1(@x1 Y y) {
        return (Y) w1().A1(y);
    }

    @x1
    public ip1<TranscodeType> u1(@z1 ip1<TranscodeType> ip1Var) {
        if (l0()) {
            return x().u1(ip1Var);
        }
        this.R0 = ip1Var;
        return S0();
    }

    @x1
    @u0
    public ip1<TranscodeType> v1(Object obj) {
        if (obj == null) {
            return u1(null);
        }
        return u1(r1().n(obj));
    }

    @x1
    @u0
    public ip1<File> w1() {
        return new ip1(File.class, this).b(H0);
    }

    @Deprecated
    public uy1<TranscodeType> z1(int i, int i2) {
        return Y1(i, i2);
    }

    @SuppressLint({"CheckResult"})
    public ip1(Class<TranscodeType> cls, ip1<?> ip1Var) {
        this(ip1Var.L0, ip1Var.J0, cls, ip1Var.I0);
        this.O0 = ip1Var.O0;
        this.U0 = ip1Var.U0;
        b(ip1Var);
    }
}