package com.p7700g.p99005;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public final class k8 {
    private static final boolean a = false;

    /* compiled from: Pools.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        boolean a(T t);

        T b();

        void c(T[] tArr, int i);
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

        private boolean d(T t) {
            for (int i = 0; i < this.b; i++) {
                if (this.a[i] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.p7700g.p99005.k8.a
        public boolean a(T t) {
            int i = this.b;
            Object[] objArr = this.a;
            if (i < objArr.length) {
                objArr[i] = t;
                this.b = i + 1;
                return true;
            }
            return false;
        }

        @Override // com.p7700g.p99005.k8.a
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

        @Override // com.p7700g.p99005.k8.a
        public void c(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.b;
                Object[] objArr = this.a;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.b = i3 + 1;
                }
            }
        }
    }

    private k8() {
    }
}