package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: EntityDeletionOrUpdateAdapter.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class h40<T> extends l50 {
    public h40(d50 d50Var) {
        super(d50Var);
    }

    @Override // com.p7700g.p99005.l50
    public abstract String d();

    public abstract void g(s60 s60Var, T t);

    public final int h(T t) {
        s60 a = a();
        try {
            g(a, t);
            return a.z0();
        } finally {
            f(a);
        }
    }

    public final int i(Iterable<? extends T> iterable) {
        s60 a = a();
        int i = 0;
        try {
            for (T t : iterable) {
                g(a, t);
                i += a.z0();
            }
            return i;
        } finally {
            f(a);
        }
    }

    public final int j(T[] tArr) {
        s60 a = a();
        try {
            int i = 0;
            for (T t : tArr) {
                g(a, t);
                i += a.z0();
            }
            return i;
        } finally {
            f(a);
        }
    }
}