package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
import com.p7700g.p99005.i2;

/* compiled from: PointerIconCompat.java */
/* loaded from: classes.dex */
public final class nr {
    public static final int a = 0;
    public static final int b = 1000;
    public static final int c = 1001;
    public static final int d = 1002;
    public static final int e = 1003;
    public static final int f = 1004;
    public static final int g = 1006;
    public static final int h = 1007;
    public static final int i = 1008;
    public static final int j = 1009;
    public static final int k = 1010;
    public static final int l = 1011;
    public static final int m = 1012;
    public static final int n = 1013;
    public static final int o = 1014;
    public static final int p = 1015;
    public static final int q = 1016;
    public static final int r = 1017;
    public static final int s = 1018;
    public static final int t = 1019;
    public static final int u = 1020;
    public static final int v = 1021;
    public static final int w = 1000;
    private final PointerIcon x;

    /* compiled from: PointerIconCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static PointerIcon a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        @e1
        public static PointerIcon b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        @e1
        public static PointerIcon c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    private nr(PointerIcon pointerIcon) {
        this.x = pointerIcon;
    }

    @x1
    public static nr a(@x1 Bitmap bitmap, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new nr(a.a(bitmap, f2, f3));
        }
        return new nr(null);
    }

    @x1
    public static nr c(@x1 Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new nr(a.b(context, i2));
        }
        return new nr(null);
    }

    @x1
    public static nr d(@x1 Resources resources, int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new nr(a.c(resources, i2));
        }
        return new nr(null);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public Object b() {
        return this.x;
    }
}