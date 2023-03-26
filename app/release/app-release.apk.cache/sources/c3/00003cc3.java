package com.p7700g.p99005;

import android.content.Context;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.i2;
import java.io.File;

/* compiled from: L.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class ci0 {
    public static boolean a = false;
    public static final String b = "LOTTIE";
    private static final int c = 20;
    private static boolean d = false;
    private static String[] e;
    private static long[] f;
    private static int g;
    private static int h;
    private static wm0 i;
    private static vm0 j;
    private static volatile ym0 k;
    private static volatile xm0 l;

    /* compiled from: L.java */
    /* loaded from: classes.dex */
    public class a implements vm0 {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.p7700g.p99005.vm0
        @x1
        public File a() {
            return new File(this.a.getCacheDir(), "lottie_network_cache");
        }
    }

    private ci0() {
    }

    public static void a(String str) {
        if (d) {
            int i2 = g;
            if (i2 == 20) {
                h++;
                return;
            }
            e[i2] = str;
            f[i2] = System.nanoTime();
            in.b(str);
            g++;
        }
    }

    public static float b(String str) {
        int i2 = h;
        if (i2 > 0) {
            h = i2 - 1;
            return 0.0f;
        } else if (d) {
            int i3 = g - 1;
            g = i3;
            if (i3 != -1) {
                if (str.equals(e[i3])) {
                    in.d();
                    return ((float) (System.nanoTime() - f[g])) / 1000000.0f;
                }
                throw new IllegalStateException(wo1.C(wo1.M("Unbalanced trace call ", str, ". Expected "), e[g], CryptoConstants.ALIAS_SEPARATOR));
            }
            throw new IllegalStateException("Can't end trace section. There are none.");
        } else {
            return 0.0f;
        }
    }

    @x1
    public static xm0 c(@x1 Context context) {
        Context applicationContext = context.getApplicationContext();
        xm0 xm0Var = l;
        if (xm0Var == null) {
            synchronized (xm0.class) {
                xm0Var = l;
                if (xm0Var == null) {
                    vm0 vm0Var = j;
                    if (vm0Var == null) {
                        vm0Var = new a(applicationContext);
                    }
                    xm0Var = new xm0(vm0Var);
                    l = xm0Var;
                }
            }
        }
        return xm0Var;
    }

    @x1
    public static ym0 d(@x1 Context context) {
        ym0 ym0Var = k;
        if (ym0Var == null) {
            synchronized (ym0.class) {
                ym0Var = k;
                if (ym0Var == null) {
                    xm0 c2 = c(context);
                    wm0 wm0Var = i;
                    if (wm0Var == null) {
                        wm0Var = new sm0();
                    }
                    ym0Var = new ym0(c2, wm0Var);
                    k = ym0Var;
                }
            }
        }
        return ym0Var;
    }

    public static void e(vm0 vm0Var) {
        j = vm0Var;
    }

    public static void f(wm0 wm0Var) {
        i = wm0Var;
    }

    public static void g(boolean z) {
        if (d == z) {
            return;
        }
        d = z;
        if (z) {
            e = new String[20];
            f = new long[20];
        }
    }
}