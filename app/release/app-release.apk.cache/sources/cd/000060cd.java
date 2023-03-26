package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: HardwareConfigState.java */
/* loaded from: classes2.dex */
public final class uv1 {
    private static final String a = "HardwareConfig";
    public static final boolean b;
    public static final boolean c;
    @r2
    public static final int d = 128;
    private static final int e = 0;
    private static final File f;
    private static final int g = 50;
    private static final int h = 700;
    private static final int i = 20000;
    public static final int j = -1;
    private static volatile uv1 k;
    private static volatile int l;
    private final int n;
    private final int o;
    @k1("this")
    private int p;
    @k1("this")
    private boolean q = true;
    private final AtomicBoolean r = new AtomicBoolean(false);
    private final boolean m = h();

    static {
        int i2 = Build.VERSION.SDK_INT;
        b = i2 < 29;
        c = i2 >= 26;
        f = new File("/proc/self/fd");
        l = -1;
    }

    @r2
    public uv1() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.n = i;
            this.o = 0;
            return;
        }
        this.n = 700;
        this.o = 128;
    }

    private boolean b() {
        return b && !this.r.get();
    }

    public static uv1 d() {
        if (k == null) {
            synchronized (uv1.class) {
                if (k == null) {
                    k = new uv1();
                }
            }
        }
        return k;
    }

    private int e() {
        if (l != -1) {
            return l;
        }
        return this.n;
    }

    private synchronized boolean f() {
        boolean z = true;
        int i2 = this.p + 1;
        this.p = i2;
        if (i2 >= 50) {
            this.p = 0;
            if (f.list().length >= e()) {
                z = false;
            }
            this.q = z;
            if (!z) {
                Log.isLoggable(ov1.a, 5);
            }
        }
        return this.q;
    }

    private static boolean h() {
        return (i() || j()) ? false : true;
    }

    private static boolean i() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String str : Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play")) {
            if (Build.MODEL.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean j() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    public boolean a() {
        z02.b();
        return !this.r.get();
    }

    public void c() {
        z02.b();
        this.r.set(false);
    }

    public boolean g(int i2, int i3, boolean z, boolean z2) {
        if (!z) {
            Log.isLoggable(a, 2);
            return false;
        } else if (!this.m) {
            Log.isLoggable(a, 2);
            return false;
        } else if (!c) {
            Log.isLoggable(a, 2);
            return false;
        } else if (b()) {
            Log.isLoggable(a, 2);
            return false;
        } else if (z2) {
            Log.isLoggable(a, 2);
            return false;
        } else {
            int i4 = this.o;
            if (i2 < i4) {
                Log.isLoggable(a, 2);
                return false;
            } else if (i3 < i4) {
                Log.isLoggable(a, 2);
                return false;
            } else if (f()) {
                return true;
            } else {
                Log.isLoggable(a, 2);
                return false;
            }
        }
    }

    @TargetApi(26)
    public boolean k(int i2, int i3, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean g2 = g(i2, i3, z, z2);
        if (g2) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return g2;
    }

    public void l() {
        z02.b();
        this.r.set(true);
    }
}