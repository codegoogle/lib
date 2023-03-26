package com.p7700g.p99005;

/* compiled from: DownsampleStrategy.java */
/* loaded from: classes2.dex */
public abstract class nv1 {
    public static final nv1 a = new a();
    public static final nv1 b = new b();
    public static final nv1 c = new e();
    public static final nv1 d = new c();
    public static final nv1 e;
    public static final nv1 f;
    public static final nv1 g;
    public static final iq1<nv1> h;
    public static final boolean i;

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes2.dex */
    public static class a extends nv1 {
        @Override // com.p7700g.p99005.nv1
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // com.p7700g.p99005.nv1
        public float b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes2.dex */
    public static class b extends nv1 {
        @Override // com.p7700g.p99005.nv1
        public g a(int i, int i2, int i3, int i4) {
            return g.MEMORY;
        }

        @Override // com.p7700g.p99005.nv1
        public float b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            return 1.0f / (max << (max >= ceil ? 0 : 1));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes2.dex */
    public static class c extends nv1 {
        @Override // com.p7700g.p99005.nv1
        public g a(int i, int i2, int i3, int i4) {
            if (b(i, i2, i3, i4) == 1.0f) {
                return g.QUALITY;
            }
            return nv1.c.a(i, i2, i3, i4);
        }

        @Override // com.p7700g.p99005.nv1
        public float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, nv1.c.b(i, i2, i3, i4));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes2.dex */
    public static class d extends nv1 {
        @Override // com.p7700g.p99005.nv1
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // com.p7700g.p99005.nv1
        public float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes2.dex */
    public static class e extends nv1 {
        @Override // com.p7700g.p99005.nv1
        public g a(int i, int i2, int i3, int i4) {
            if (nv1.i) {
                return g.QUALITY;
            }
            return g.MEMORY;
        }

        @Override // com.p7700g.p99005.nv1
        public float b(int i, int i2, int i3, int i4) {
            if (nv1.i) {
                return Math.min(i3 / i, i4 / i2);
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes2.dex */
    public static class f extends nv1 {
        @Override // com.p7700g.p99005.nv1
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // com.p7700g.p99005.nv1
        public float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes2.dex */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        e = dVar;
        f = new f();
        g = dVar;
        h = iq1.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        i = true;
    }

    public abstract g a(int i2, int i3, int i4, int i5);

    public abstract float b(int i2, int i3, int i4, int i5);
}