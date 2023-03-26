package com.p7700g.p99005;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* compiled from: TileList.java */
/* loaded from: classes.dex */
public class u30<T> {
    public final int a;
    private final SparseArray<a<T>> b = new SparseArray<>(10);
    public a<T> c;

    /* compiled from: TileList.java */
    /* loaded from: classes.dex */
    public static class a<T> {
        public final T[] a;
        public int b;
        public int c;
        public a<T> d;

        public a(Class<T> cls, int i) {
            this.a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
        }

        public boolean a(int i) {
            int i2 = this.b;
            return i2 <= i && i < i2 + this.c;
        }

        public T b(int i) {
            return this.a[i - this.b];
        }
    }

    public u30(int i) {
        this.a = i;
    }

    public a<T> a(a<T> aVar) {
        int indexOfKey = this.b.indexOfKey(aVar.b);
        if (indexOfKey < 0) {
            this.b.put(aVar.b, aVar);
            return null;
        }
        a<T> valueAt = this.b.valueAt(indexOfKey);
        this.b.setValueAt(indexOfKey, aVar);
        if (this.c == valueAt) {
            this.c = aVar;
        }
        return valueAt;
    }

    public void b() {
        this.b.clear();
    }

    public a<T> c(int i) {
        return this.b.valueAt(i);
    }

    public T d(int i) {
        a<T> aVar = this.c;
        if (aVar == null || !aVar.a(i)) {
            int indexOfKey = this.b.indexOfKey(i - (i % this.a));
            if (indexOfKey < 0) {
                return null;
            }
            this.c = this.b.valueAt(indexOfKey);
        }
        return this.c.b(i);
    }

    public a<T> e(int i) {
        a<T> aVar = this.b.get(i);
        if (this.c == aVar) {
            this.c = null;
        }
        this.b.delete(i);
        return aVar;
    }

    public int f() {
        return this.b.size();
    }
}