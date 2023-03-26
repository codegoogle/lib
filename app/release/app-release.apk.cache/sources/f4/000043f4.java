package com.p7700g.p99005;

/* compiled from: DoubleCheck.java */
/* loaded from: classes2.dex */
public final class g62<T> implements ol4<T>, u52<T> {
    private static final Object a = new Object();
    public static final /* synthetic */ boolean b = false;
    private volatile ol4<T> c;
    private volatile Object d = a;

    private g62(ol4<T> ol4Var) {
        this.c = ol4Var;
    }

    public static <P extends ol4<T>, T> u52<T> a(P p) {
        if (p instanceof u52) {
            return (u52) p;
        }
        return new g62((ol4) q62.b(p));
    }

    public static <P extends ol4<T>, T> ol4<T> b(P p) {
        q62.b(p);
        return p instanceof g62 ? p : new g62(p);
    }

    public static Object c(Object obj, Object obj2) {
        if (!((obj == a || (obj instanceof p62)) ? false : true) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // com.p7700g.p99005.ol4
    public T get() {
        T t = (T) this.d;
        Object obj = a;
        if (t == obj) {
            synchronized (this) {
                t = this.d;
                if (t == obj) {
                    t = this.c.get();
                    this.d = c(this.d, t);
                    this.c = null;
                }
            }
        }
        return t;
    }
}