package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Palette.java */
/* loaded from: classes3.dex */
public final class pz2 {
    public static final int a = 12544;
    public static final int b = 16;
    public static final float c = 3.0f;
    public static final float d = 4.5f;
    public static final c e = new a();
    private final List<d> f;
    private final List<qz2> g;
    private final SparseBooleanArray i = new SparseBooleanArray();
    private final y7<qz2, d> h = new y7<>();
    @z1
    private final d j = a();

    /* compiled from: Palette.java */
    /* loaded from: classes3.dex */
    public class a implements c {
        private static final float a = 0.05f;
        private static final float b = 0.95f;

        private boolean a(float[] hslColor) {
            return hslColor[2] <= a;
        }

        private boolean b(float[] hslColor) {
            return hslColor[0] >= 10.0f && hslColor[0] <= 37.0f && hslColor[1] <= 0.82f;
        }

        private boolean c(float[] hslColor) {
            return hslColor[2] >= b;
        }

        @Override // com.p7700g.p99005.pz2.c
        public boolean isAllowed(int rgb, float[] hsl) {
            return (c(hsl) || a(hsl) || b(hsl)) ? false : true;
        }
    }

    /* compiled from: Palette.java */
    /* loaded from: classes3.dex */
    public static final class b {
        @z1
        private final List<d> a;
        @z1
        private final Bitmap b;
        private final List<qz2> c;
        private final List<c> d;

        public b(@x1 Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.d = arrayList2;
            if (!bitmap.isRecycled()) {
                arrayList2.add(pz2.e);
                this.b = bitmap;
                this.a = null;
                arrayList.add(qz2.a);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        private int[] b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            return iArr;
        }

        private Bitmap c(final Bitmap bitmap) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            double sqrt = height > 12544 ? Math.sqrt(12544 / height) : -1.0d;
            return sqrt <= zg2.s ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * sqrt), (int) Math.ceil(bitmap.getHeight() * sqrt), false);
        }

        @x1
        public pz2 a() {
            List<d> list;
            c[] cVarArr;
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                Bitmap c = c(bitmap);
                int[] b = b(c);
                if (this.d.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list2 = this.d;
                    cVarArr = (c[]) list2.toArray(new c[list2.size()]);
                }
                oz2 oz2Var = new oz2(b, 16, cVarArr);
                if (c != this.b) {
                    c.recycle();
                }
                list = oz2Var.d();
            } else {
                list = this.a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            pz2 pz2Var = new pz2(list, this.c);
            pz2Var.c();
            return pz2Var;
        }
    }

    /* compiled from: Palette.java */
    /* loaded from: classes3.dex */
    public interface c {
        boolean isAllowed(@w0 int rgb, @x1 float[] hsl);
    }

    /* compiled from: Palette.java */
    /* loaded from: classes3.dex */
    public static final class d {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private boolean f;
        private int g;
        private int h;
        @z1
        private float[] i;

        public d(@w0 int color, int population) {
            this.a = Color.red(color);
            this.b = Color.green(color);
            this.c = Color.blue(color);
            this.d = color;
            this.e = population;
        }

        private void a() {
            int B;
            int B2;
            if (this.f) {
                return;
            }
            int n = fj.n(-1, this.d, 4.5f);
            int n2 = fj.n(-1, this.d, 3.0f);
            if (n != -1 && n2 != -1) {
                this.h = fj.B(-1, n);
                this.g = fj.B(-1, n2);
                this.f = true;
                return;
            }
            int n3 = fj.n(sr.t, this.d, 4.5f);
            int n4 = fj.n(sr.t, this.d, 3.0f);
            if (n3 != -1 && n4 != -1) {
                this.h = fj.B(sr.t, n3);
                this.g = fj.B(sr.t, n4);
                this.f = true;
                return;
            }
            if (n != -1) {
                B = fj.B(-1, n);
            } else {
                B = fj.B(sr.t, n3);
            }
            this.h = B;
            if (n2 != -1) {
                B2 = fj.B(-1, n2);
            } else {
                B2 = fj.B(sr.t, n4);
            }
            this.g = B2;
            this.f = true;
        }

        @w0
        public int b() {
            a();
            return this.h;
        }

        @x1
        public float[] c() {
            if (this.i == null) {
                this.i = new float[3];
            }
            fj.d(this.a, this.b, this.c, this.i);
            return this.i;
        }

        public int d() {
            return this.e;
        }

        @w0
        public int e() {
            return this.d;
        }

        public boolean equals(@z1 Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || d.class != o.getClass()) {
                return false;
            }
            d dVar = (d) o;
            return this.e == dVar.e && this.d == dVar.d;
        }

        @w0
        public int f() {
            a();
            return this.g;
        }

        public int hashCode() {
            return (this.d * 31) + this.e;
        }

        @x1
        public String toString() {
            return d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + f14.v + " [HSL: " + Arrays.toString(c()) + f14.v + " [Population: " + this.e + f14.v + " [Title Text: #" + Integer.toHexString(f()) + f14.v + " [Body Text: #" + Integer.toHexString(b()) + f14.v;
        }
    }

    public pz2(List<d> swatches, List<qz2> targets) {
        this.f = swatches;
        this.g = targets;
    }

    @z1
    private d a() {
        int size = this.f.size();
        int i = Integer.MIN_VALUE;
        d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = this.f.get(i2);
            if (dVar2.d() > i) {
                i = dVar2.d();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    @x1
    public static b b(@x1 Bitmap bitmap) {
        return new b(bitmap);
    }

    private float d(d swatch, qz2 target) {
        float[] c2 = swatch.c();
        d dVar = this.j;
        int d2 = dVar != null ? dVar.d() : 1;
        return (target.g() > 0.0f ? (1.0f - Math.abs(c2[1] - target.i())) * target.g() : 0.0f) + (target.a() > 0.0f ? (1.0f - Math.abs(c2[2] - target.h())) * target.a() : 0.0f) + (target.f() > 0.0f ? (swatch.d() / d2) * target.f() : 0.0f);
    }

    @z1
    private d e(final qz2 target) {
        d g = g(target);
        if (g != null && target.j()) {
            this.i.append(g.e(), true);
        }
        return g;
    }

    @z1
    private d g(final qz2 target) {
        int size = this.f.size();
        float f = 0.0f;
        d dVar = null;
        for (int i = 0; i < size; i++) {
            d dVar2 = this.f.get(i);
            if (j(dVar2, target)) {
                float d2 = d(dVar2, target);
                if (dVar == null || d2 > f) {
                    dVar = dVar2;
                    f = d2;
                }
            }
        }
        return dVar;
    }

    private boolean j(final d swatch, final qz2 target) {
        float[] c2 = swatch.c();
        return c2[1] >= target.e() && c2[1] <= target.c() && c2[2] >= target.d() && c2[2] <= target.b() && !this.i.get(swatch.e());
    }

    public void c() {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            qz2 qz2Var = this.g.get(i);
            qz2Var.k();
            this.h.put(qz2Var, e(qz2Var));
        }
        this.i.clear();
    }

    @w0
    public int f(@w0 int defaultColor) {
        d dVar = this.j;
        return dVar != null ? dVar.e() : defaultColor;
    }

    @z1
    public d h(@x1 final qz2 target) {
        return this.h.get(target);
    }

    @z1
    public d i() {
        return h(qz2.a);
    }
}