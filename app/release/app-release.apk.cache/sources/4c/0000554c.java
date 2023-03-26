package com.p7700g.p99005;

import android.graphics.Color;
import com.p7700g.p99005.pz2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: ColorCutQuantizer.java */
/* loaded from: classes3.dex */
public final class oz2 {
    public static final int a = -3;
    public static final int b = -2;
    public static final int c = -1;
    private static final int d = 5;
    private static final int e = 31;
    private static final Comparator<b> f = new a();
    public final int[] g;
    public final int[] h;
    public final List<pz2.d> i;
    @z1
    public final pz2.c[] j;
    private final float[] k = new float[3];

    /* compiled from: ColorCutQuantizer.java */
    /* loaded from: classes3.dex */
    public class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b lhs, b rhs) {
            return rhs.g() - lhs.g();
        }
    }

    /* compiled from: ColorCutQuantizer.java */
    /* loaded from: classes3.dex */
    public class b {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        public b(int lowerIndex, int upperIndex) {
            this.a = lowerIndex;
            this.b = upperIndex;
            c();
        }

        public final boolean a() {
            return e() > 1;
        }

        public final int b() {
            int f = f();
            oz2 oz2Var = oz2.this;
            int[] iArr = oz2Var.g;
            int[] iArr2 = oz2Var.h;
            oz2.e(iArr, f, this.a, this.b);
            Arrays.sort(iArr, this.a, this.b + 1);
            oz2.e(iArr, f, this.a, this.b);
            int i = this.c / 2;
            int i2 = this.a;
            int i3 = 0;
            while (true) {
                int i4 = this.b;
                if (i2 <= i4) {
                    i3 += iArr2[iArr[i2]];
                    if (i3 >= i) {
                        return Math.min(i4 - 1, i2);
                    }
                    i2++;
                } else {
                    return this.a;
                }
            }
        }

        public final void c() {
            oz2 oz2Var = oz2.this;
            int[] iArr = oz2Var.g;
            int[] iArr2 = oz2Var.h;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = 0;
            for (int i8 = this.a; i8 <= this.b; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int k = oz2.k(i9);
                int j = oz2.j(i9);
                int i10 = oz2.i(i9);
                if (k > i4) {
                    i4 = k;
                }
                if (k < i) {
                    i = k;
                }
                if (j > i5) {
                    i5 = j;
                }
                if (j < i2) {
                    i2 = j;
                }
                if (i10 > i6) {
                    i6 = i10;
                }
                if (i10 < i3) {
                    i3 = i10;
                }
            }
            this.d = i;
            this.e = i4;
            this.f = i2;
            this.g = i5;
            this.h = i3;
            this.i = i6;
            this.c = i7;
        }

        public final pz2.d d() {
            oz2 oz2Var = oz2.this;
            int[] iArr = oz2Var.g;
            int[] iArr2 = oz2Var.h;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.a; i5 <= this.b; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += oz2.k(i6) * i7;
                i3 += oz2.j(i6) * i7;
                i4 += oz2.i(i6) * i7;
            }
            float f = i2;
            return new pz2.d(oz2.b(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
        }

        public final int e() {
            return (this.b + 1) - this.a;
        }

        public final int f() {
            int i = this.e - this.d;
            int i2 = this.g - this.f;
            int i3 = this.i - this.h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        public final int g() {
            return ((this.i - this.h) + 1) * ((this.g - this.f) + 1) * ((this.e - this.d) + 1);
        }

        public final b h() {
            if (a()) {
                int b = b();
                b bVar = new b(b + 1, this.b);
                this.b = b;
                c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    public oz2(int[] pixels, int maxColors, @z1 pz2.c[] filters) {
        this.j = filters;
        int[] iArr = new int[32768];
        this.h = iArr;
        for (int i = 0; i < pixels.length; i++) {
            int g = g(pixels[i]);
            pixels[i] = g;
            iArr[g] = iArr[g] + 1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 32768; i3++) {
            if (iArr[i3] > 0 && l(i3)) {
                iArr[i3] = 0;
            }
            if (iArr[i3] > 0) {
                i2++;
            }
        }
        int[] iArr2 = new int[i2];
        this.g = iArr2;
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr[i5] > 0) {
                iArr2[i4] = i5;
                i4++;
            }
        }
        if (i2 <= maxColors) {
            this.i = new ArrayList();
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = iArr2[i6];
                this.i.add(new pz2.d(a(i7), iArr[i7]));
            }
            return;
        }
        this.i = h(maxColors);
    }

    private static int a(int color) {
        return b(k(color), j(color), i(color));
    }

    public static int b(int r, int g, int b2) {
        return Color.rgb(f(r, 5, 8), f(g, 5, 8), f(b2, 5, 8));
    }

    private List<pz2.d> c(Collection<b> vboxes) {
        ArrayList arrayList = new ArrayList(vboxes.size());
        for (b bVar : vboxes) {
            pz2.d d2 = bVar.d();
            if (!n(d2)) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    public static void e(final int[] a2, final int dimension, final int lower, final int upper) {
        if (dimension == -2) {
            while (lower <= upper) {
                int i = a2[lower];
                a2[lower] = i(i) | (j(i) << 10) | (k(i) << 5);
                lower++;
            }
        } else if (dimension != -1) {
        } else {
            while (lower <= upper) {
                int i2 = a2[lower];
                a2[lower] = k(i2) | (i(i2) << 10) | (j(i2) << 5);
                lower++;
            }
        }
    }

    private static int f(int value, int currentWidth, int targetWidth) {
        return (targetWidth > currentWidth ? value << (targetWidth - currentWidth) : value >> (currentWidth - targetWidth)) & ((1 << targetWidth) - 1);
    }

    private static int g(int color) {
        return f(Color.blue(color), 8, 5) | (f(Color.red(color), 8, 5) << 10) | (f(Color.green(color), 8, 5) << 5);
    }

    private List<pz2.d> h(int maxColors) {
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(maxColors, f);
        priorityQueue.offer(new b(0, this.g.length - 1));
        o(priorityQueue, maxColors);
        return c(priorityQueue);
    }

    public static int i(int color) {
        return color & 31;
    }

    public static int j(int color) {
        return (color >> 5) & 31;
    }

    public static int k(int color) {
        return (color >> 10) & 31;
    }

    private boolean l(int color565) {
        int a2 = a(color565);
        fj.p(a2, this.k);
        return m(a2, this.k);
    }

    private boolean m(int rgb, float[] hsl) {
        pz2.c[] cVarArr = this.j;
        if (cVarArr != null && cVarArr.length > 0) {
            for (pz2.c cVar : cVarArr) {
                if (!cVar.isAllowed(rgb, hsl)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean n(pz2.d color) {
        return m(color.e(), color.c());
    }

    private void o(final PriorityQueue<b> queue, final int maxSize) {
        b poll;
        while (queue.size() < maxSize && (poll = queue.poll()) != null && poll.a()) {
            queue.offer(poll.h());
            queue.offer(poll);
        }
    }

    public List<pz2.d> d() {
        return this.i;
    }
}