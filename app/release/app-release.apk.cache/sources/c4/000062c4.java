package com.p7700g.p99005;

/* compiled from: MultiClassKey.java */
/* loaded from: classes2.dex */
public class w02 {
    private Class<?> a;
    private Class<?> b;
    private Class<?> c;

    public w02() {
    }

    public void a(@x1 Class<?> cls, @x1 Class<?> cls2) {
        b(cls, cls2, null);
    }

    public void b(@x1 Class<?> cls, @x1 Class<?> cls2, @z1 Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w02 w02Var = (w02) obj;
        return this.a.equals(w02Var.a) && this.b.equals(w02Var.b) && z02.d(this.c, w02Var.c);
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class<?> cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder G = wo1.G("MultiClassKey{first=");
        G.append(this.a);
        G.append(", second=");
        G.append(this.b);
        G.append('}');
        return G.toString();
    }

    public w02(@x1 Class<?> cls, @x1 Class<?> cls2) {
        a(cls, cls2);
    }

    public w02(@x1 Class<?> cls, @x1 Class<?> cls2, @z1 Class<?> cls3) {
        b(cls, cls2, cls3);
    }
}