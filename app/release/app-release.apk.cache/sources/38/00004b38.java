package com.p7700g.p99005;

import android.graphics.Bitmap;

/* compiled from: AttributeStrategy.java */
/* loaded from: classes2.dex */
public class js1 implements ss1 {
    private final b a = new b();
    private final os1<a, Bitmap> b = new os1<>();

    /* compiled from: AttributeStrategy.java */
    @r2
    /* loaded from: classes2.dex */
    public static class a implements ts1 {
        private final b a;
        private int b;
        private int c;
        private Bitmap.Config d;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.p7700g.p99005.ts1
        public void a() {
            this.a.c(this);
        }

        public void b(int i, int i2, Bitmap.Config config) {
            this.b = i;
            this.c = i2;
            this.d = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.b * 31) + this.c) * 31;
            Bitmap.Config config = this.d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return js1.g(this.b, this.c, this.d);
        }
    }

    /* compiled from: AttributeStrategy.java */
    @r2
    /* loaded from: classes2.dex */
    public static class b extends ks1<a> {
        @Override // com.p7700g.p99005.ks1
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        public a e(int i, int i2, Bitmap.Config config) {
            a b = b();
            b.b(i, i2, config);
            return b;
        }
    }

    public static String g(int i, int i2, Bitmap.Config config) {
        StringBuilder J = wo1.J("[", i, "x", i2, "], ");
        J.append(config);
        return J.toString();
    }

    private static String h(Bitmap bitmap) {
        return g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.p7700g.p99005.ss1
    public void a(Bitmap bitmap) {
        this.b.d(this.a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.p7700g.p99005.ss1
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        return this.b.a(this.a.e(i, i2, config));
    }

    @Override // com.p7700g.p99005.ss1
    public Bitmap c() {
        return this.b.f();
    }

    @Override // com.p7700g.p99005.ss1
    public String d(int i, int i2, Bitmap.Config config) {
        return g(i, i2, config);
    }

    @Override // com.p7700g.p99005.ss1
    public int e(Bitmap bitmap) {
        return z02.h(bitmap);
    }

    @Override // com.p7700g.p99005.ss1
    public String f(Bitmap bitmap) {
        return h(bitmap);
    }

    public String toString() {
        StringBuilder G = wo1.G("AttributeStrategy:\n  ");
        G.append(this.b);
        return G.toString();
    }
}