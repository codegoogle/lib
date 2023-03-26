package com.p7700g.p99005;

import android.graphics.Bitmap;
import java.util.NavigableMap;

/* compiled from: SizeStrategy.java */
@e2(19)
/* loaded from: classes2.dex */
public final class ws1 implements ss1 {
    private static final int a = 8;
    private final b b = new b();
    private final os1<a, Bitmap> c = new os1<>();
    private final NavigableMap<Integer, Integer> d = new us1();

    /* compiled from: SizeStrategy.java */
    @r2
    /* loaded from: classes2.dex */
    public static final class a implements ts1 {
        private final b a;
        public int b;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.p7700g.p99005.ts1
        public void a() {
            this.a.c(this);
        }

        public void b(int i) {
            this.b = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public int hashCode() {
            return this.b;
        }

        public String toString() {
            return ws1.h(this.b);
        }
    }

    /* compiled from: SizeStrategy.java */
    @r2
    /* loaded from: classes2.dex */
    public static class b extends ks1<a> {
        @Override // com.p7700g.p99005.ks1
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        public a e(int i) {
            a aVar = (a) super.b();
            aVar.b(i);
            return aVar;
        }
    }

    private void g(Integer num) {
        Integer num2 = (Integer) this.d.get(num);
        if (num2.intValue() == 1) {
            this.d.remove(num);
        } else {
            this.d.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public static String h(int i) {
        return wo1.n("[", i, "]");
    }

    private static String i(Bitmap bitmap) {
        return h(z02.h(bitmap));
    }

    @Override // com.p7700g.p99005.ss1
    public void a(Bitmap bitmap) {
        a e = this.b.e(z02.h(bitmap));
        this.c.d(e, bitmap);
        Integer num = (Integer) this.d.get(Integer.valueOf(e.b));
        this.d.put(Integer.valueOf(e.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.p7700g.p99005.ss1
    @z1
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        int g = z02.g(i, i2, config);
        a e = this.b.e(g);
        Integer ceilingKey = this.d.ceilingKey(Integer.valueOf(g));
        if (ceilingKey != null && ceilingKey.intValue() != g && ceilingKey.intValue() <= g * 8) {
            this.b.c(e);
            e = this.b.e(ceilingKey.intValue());
        }
        Bitmap a2 = this.c.a(e);
        if (a2 != null) {
            a2.reconfigure(i, i2, config);
            g(ceilingKey);
        }
        return a2;
    }

    @Override // com.p7700g.p99005.ss1
    @z1
    public Bitmap c() {
        Bitmap f = this.c.f();
        if (f != null) {
            g(Integer.valueOf(z02.h(f)));
        }
        return f;
    }

    @Override // com.p7700g.p99005.ss1
    public String d(int i, int i2, Bitmap.Config config) {
        return h(z02.g(i, i2, config));
    }

    @Override // com.p7700g.p99005.ss1
    public int e(Bitmap bitmap) {
        return z02.h(bitmap);
    }

    @Override // com.p7700g.p99005.ss1
    public String f(Bitmap bitmap) {
        return i(bitmap);
    }

    public String toString() {
        StringBuilder G = wo1.G("SizeStrategy:\n  ");
        G.append(this.c);
        G.append("\n  SortedSizes");
        G.append(this.d);
        return G.toString();
    }
}