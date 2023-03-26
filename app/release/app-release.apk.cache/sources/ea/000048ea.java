package com.p7700g.p99005;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public final class ip {

    /* compiled from: Pools.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        boolean a(@x1 T t);

        @z1
        T b();
    }

    /* compiled from: Pools.java */
    /* loaded from: classes.dex */
    public static class b<T> implements a<T> {
        private final Object[] a;
        private int b;

        public b(int i) {
            if (i > 0) {
                this.a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        private boolean c(@x1 T t) {
            for (int i = 0; i < this.b; i++) {
                if (this.a[i] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.p7700g.p99005.ip.a
        public boolean a(@x1 T t) {
            if (!c(t)) {
                int i = this.b;
                Object[] objArr = this.a;
                if (i < objArr.length) {
                    objArr[i] = t;
                    this.b = i + 1;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Already in the pool!");
        }

        @Override // com.p7700g.p99005.ip.a
        public T b() {
            int i = this.b;
            if (i > 0) {
                int i2 = i - 1;
                Object[] objArr = this.a;
                T t = (T) objArr[i2];
                objArr[i2] = null;
                this.b = i - 1;
                return t;
            }
            return null;
        }
    }

    /* compiled from: Pools.java */
    /* loaded from: classes.dex */
    public static class c<T> extends b<T> {
        private final Object c;

        public c(int i) {
            super(i);
            this.c = new Object();
        }

        @Override // com.p7700g.p99005.ip.b, com.p7700g.p99005.ip.a
        public boolean a(@x1 T t) {
            boolean a;
            synchronized (this.c) {
                a = super.a(t);
            }
            return a;
        }

        @Override // com.p7700g.p99005.ip.b, com.p7700g.p99005.ip.a
        public T b() {
            T t;
            synchronized (this.c) {
                t = (T) super.b();
            }
            return t;
        }
    }

    private ip() {
    }
}