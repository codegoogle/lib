package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: MutablePair.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class xk0<T> {
    @z1
    public T a;
    @z1
    public T b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof fp) {
            fp fpVar = (fp) obj;
            return a(fpVar.a, this.a) && a(fpVar.b, this.b);
        }
        return false;
    }

    public int hashCode() {
        T t = this.a;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.b;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder G = wo1.G("Pair{");
        G.append(this.a);
        G.append(" ");
        G.append(this.b);
        G.append("}");
        return G.toString();
    }
}