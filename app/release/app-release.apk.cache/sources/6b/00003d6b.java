package com.p7700g.p99005;

import java.util.Queue;

/* compiled from: ModelCache.java */
/* loaded from: classes2.dex */
public class cu1<A, B> {
    private static final int a = 250;
    private final u02<b<A>, B> b;

    /* compiled from: ModelCache.java */
    /* loaded from: classes2.dex */
    public class a extends u02<b<A>, B> {
        public a(long j) {
            super(j);
        }

        @Override // com.p7700g.p99005.u02
        /* renamed from: r */
        public void n(@x1 b<A> bVar, @z1 B b) {
            bVar.c();
        }
    }

    /* compiled from: ModelCache.java */
    @r2
    /* loaded from: classes2.dex */
    public static final class b<A> {
        private static final Queue<b<?>> a = z02.f(0);
        private int b;
        private int c;
        private A d;

        private b() {
        }

        public static <A> b<A> a(A a2, int i, int i2) {
            b<A> bVar;
            Queue<b<?>> queue = a;
            synchronized (queue) {
                bVar = (b<A>) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a2, i, i2);
            return bVar;
        }

        private void b(A a2, int i, int i2) {
            this.d = a2;
            this.c = i;
            this.b = i2;
        }

        public void c() {
            Queue<b<?>> queue = a;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.c == bVar.c && this.b == bVar.b && this.d.equals(bVar.d);
            }
            return false;
        }

        public int hashCode() {
            return this.d.hashCode() + (((this.b * 31) + this.c) * 31);
        }
    }

    public cu1() {
        this(250L);
    }

    public void a() {
        this.b.d();
    }

    @z1
    public B b(A a2, int i, int i2) {
        b<A> a3 = b.a(a2, i, i2);
        B k = this.b.k(a3);
        a3.c();
        return k;
    }

    public void c(A a2, int i, int i2, B b2) {
        this.b.o(b.a(a2, i, i2), b2);
    }

    public cu1(long j) {
        this.b = new a(j);
    }
}