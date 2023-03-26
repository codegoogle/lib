package com.p7700g.p99005;

/* compiled from: Pair.java */
/* loaded from: classes.dex */
public class fp<F, S> {
    public final F a;
    public final S b;

    public fp(F f, S s) {
        this.a = f;
        this.b = s;
    }

    @x1
    public static <A, B> fp<A, B> a(A a, B b) {
        return new fp<>(a, b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof fp) {
            fp fpVar = (fp) obj;
            return ep.a(fpVar.a, this.a) && ep.a(fpVar.b, this.b);
        }
        return false;
    }

    public int hashCode() {
        F f = this.a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("Pair{");
        G.append(this.a);
        G.append(" ");
        G.append(this.b);
        G.append("}");
        return G.toString();
    }
}