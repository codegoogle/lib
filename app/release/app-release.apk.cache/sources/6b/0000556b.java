package com.p7700g.p99005;

import android.content.Context;
import com.google.android.gms.ads.AdSize;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class p22 {
    public static final int a = -1;
    public static final int b = -2;
    public static final int c = 32;
    public static final int d = 50;
    public static final int e = 90;
    @x1
    public static final p22 f = new p22(-1, -2, "mb");
    @x1
    public static final p22 g = new p22(320, 50, "mb");
    @x1
    public static final p22 h = new p22(300, 250, "as");
    @x1
    public static final p22 i = new p22(468, 60, "as");
    @x1
    public static final p22 j = new p22(728, 90, "as");
    @x1
    public static final p22 k = new p22(160, 600, "as");
    private final AdSize l;

    public p22(int i2, int i3) {
        this(new AdSize(i2, i3));
    }

    public p22(@x1 AdSize adSize) {
        this.l = adSize;
    }

    @z1
    public p22 a(@x1 p22... p22VarArr) {
        int d2;
        int b2;
        p22 p22Var = null;
        if (p22VarArr == null) {
            return null;
        }
        int d3 = d();
        int b3 = b();
        float f2 = 0.0f;
        for (p22 p22Var2 : p22VarArr) {
            if (i(p22Var2.d(), p22Var2.b())) {
                float f3 = (d2 * b2) / (d3 * b3);
                if (f3 > 1.0f) {
                    f3 = 1.0f / f3;
                }
                if (f3 > f2) {
                    p22Var = p22Var2;
                    f2 = f3;
                }
            }
        }
        return p22Var;
    }

    public int b() {
        return this.l.getHeight();
    }

    public int c(@x1 Context context) {
        return this.l.getHeightInPixels(context);
    }

    public int d() {
        return this.l.getWidth();
    }

    public int e(@x1 Context context) {
        return this.l.getWidthInPixels(context);
    }

    public boolean equals(@x1 Object obj) {
        if (obj instanceof p22) {
            return this.l.equals(((p22) obj).l);
        }
        return false;
    }

    public boolean f() {
        return this.l.isAutoHeight();
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return this.l.isFullWidth();
    }

    public int hashCode() {
        return this.l.hashCode();
    }

    public boolean i(int i2, int i3) {
        int d2 = d();
        int b2 = b();
        float f2 = i2;
        float f3 = d2;
        if (f2 > f3 * 1.25f || f2 < f3 * 0.8f) {
            return false;
        }
        float f4 = i3;
        float f5 = b2;
        return f4 <= 1.25f * f5 && f4 >= f5 * 0.8f;
    }

    @x1
    public String toString() {
        return this.l.toString();
    }

    private p22(int i2, int i3, String str) {
        this(new AdSize(i2, i3));
    }
}