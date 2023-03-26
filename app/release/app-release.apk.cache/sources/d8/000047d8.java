package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: EntityInsertionAdapter.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class i40<T> extends l50 {
    public i40(d50 d50Var) {
        super(d50Var);
    }

    public abstract void g(s60 s60Var, T t);

    public final void h(Iterable<? extends T> iterable) {
        s60 a = a();
        try {
            for (T t : iterable) {
                g(a, t);
                a.R1();
            }
        } finally {
            f(a);
        }
    }

    public final void i(T t) {
        s60 a = a();
        try {
            g(a, t);
            a.R1();
        } finally {
            f(a);
        }
    }

    public final void j(T[] tArr) {
        s60 a = a();
        try {
            for (T t : tArr) {
                g(a, t);
                a.R1();
            }
        } finally {
            f(a);
        }
    }

    public final long k(T t) {
        s60 a = a();
        try {
            g(a, t);
            return a.R1();
        } finally {
            f(a);
        }
    }

    public final long[] l(Collection<? extends T> collection) {
        s60 a = a();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (T t : collection) {
                g(a, t);
                jArr[i] = a.R1();
                i++;
            }
            return jArr;
        } finally {
            f(a);
        }
    }

    public final long[] m(T[] tArr) {
        s60 a = a();
        try {
            long[] jArr = new long[tArr.length];
            int i = 0;
            for (T t : tArr) {
                g(a, t);
                jArr[i] = a.R1();
                i++;
            }
            return jArr;
        } finally {
            f(a);
        }
    }

    public final Long[] n(Collection<? extends T> collection) {
        s60 a = a();
        try {
            Long[] lArr = new Long[collection.size()];
            int i = 0;
            for (T t : collection) {
                g(a, t);
                lArr[i] = Long.valueOf(a.R1());
                i++;
            }
            return lArr;
        } finally {
            f(a);
        }
    }

    public final Long[] o(T[] tArr) {
        s60 a = a();
        try {
            Long[] lArr = new Long[tArr.length];
            int i = 0;
            for (T t : tArr) {
                g(a, t);
                lArr[i] = Long.valueOf(a.R1());
                i++;
            }
            return lArr;
        } finally {
            f(a);
        }
    }

    public final List<Long> p(Collection<? extends T> collection) {
        s60 a = a();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            int i = 0;
            for (T t : collection) {
                g(a, t);
                arrayList.add(i, Long.valueOf(a.R1()));
                i++;
            }
            return arrayList;
        } finally {
            f(a);
        }
    }

    public final List<Long> q(T[] tArr) {
        s60 a = a();
        try {
            ArrayList arrayList = new ArrayList(tArr.length);
            int i = 0;
            for (T t : tArr) {
                g(a, t);
                arrayList.add(i, Long.valueOf(a.R1()));
                i++;
            }
            return arrayList;
        } finally {
            f(a);
        }
    }
}