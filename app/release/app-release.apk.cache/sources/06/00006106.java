package com.p7700g.p99005;

import com.p7700g.p99005.r64;
import com.p7700g.p99005.w14;
import java.util.Iterator;

/* compiled from: MACAddressString.java */
/* loaded from: classes3.dex */
public class v14 implements e14, Comparable<v14> {
    private static final long s = 4;
    private static final w14 t = new w14.b().w();
    public static final v14 u = new v14("");
    public static final v14 v = new v14(n04.A);
    private Boolean A;
    public final w14 w;
    public final String x;
    private a14 y;
    private r64 z;

    public v14(String str) {
        this(str, t);
    }

    public static int c(String str) {
        return r14.n(str);
    }

    private boolean o() throws a14 {
        if (this.A != null) {
            a14 a14Var = this.y;
            if (a14Var == null) {
                return true;
            }
            throw a14Var;
        }
        return false;
    }

    public static Iterator<String> p(String str) {
        return r14.S(str);
    }

    public boolean C0() {
        gl4 a1 = a1();
        return a1 != null && a1.C0();
    }

    @Override // com.p7700g.p99005.e14
    public String E0() {
        gl4 a1 = a1();
        if (a1 != null) {
            return a1.E0();
        }
        return toString();
    }

    public Integer L0() {
        gl4 a1 = a1();
        if (a1 != null) {
            return a1.L0();
        }
        return null;
    }

    public boolean V1() {
        gl4 a1 = a1();
        return a1 != null && a1.V1();
    }

    public void a(gl4 gl4Var) {
        h(gl4Var);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(v14 v14Var) {
        gl4 a1;
        if (this == v14Var) {
            return 0;
        }
        if (n()) {
            if (v14Var.n()) {
                gl4 a12 = a1();
                if (a12 != null && (a1 = v14Var.a1()) != null) {
                    return a12.m4(a1);
                }
                return toString().compareTo(v14Var.toString());
            }
            return 1;
        } else if (v14Var.n()) {
            return -1;
        } else {
            return toString().compareTo(v14Var.toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v14) {
            v14 v14Var = (v14) obj;
            boolean equals = toString().equals(v14Var.toString());
            if (equals && this.w == v14Var.w) {
                return true;
            }
            if (n()) {
                if (v14Var.n()) {
                    gl4 a1 = a1();
                    if (a1 != null) {
                        gl4 a12 = v14Var.a1();
                        if (a12 != null) {
                            return a1.equals(a12);
                        }
                        return false;
                    } else if (v14Var.a1() != null) {
                        return false;
                    } else {
                        return equals;
                    }
                }
            } else if (!v14Var.n()) {
                return equals;
            }
        }
        return false;
    }

    public w14 f() {
        return this.w;
    }

    public l64 g() {
        return z64.E;
    }

    public void h(gl4 gl4Var) {
        this.z = new r64.b(gl4Var);
        this.A = Boolean.TRUE;
    }

    public int hashCode() {
        if (n() && !m()) {
            return a1().hashCode();
        }
        return toString().hashCode();
    }

    public boolean i() {
        gl4 a1 = a1();
        return a1 != null && a1.E3();
    }

    public boolean m() {
        if (n()) {
            try {
                return this.z.a1() == null;
            } catch (t14 unused) {
                return false;
            }
        }
        return false;
    }

    public boolean n() {
        Boolean bool = this.A;
        if (bool == null) {
            try {
                validate();
                return true;
            } catch (a14 unused) {
                return false;
            }
        }
        return bool.booleanValue();
    }

    @Override // com.p7700g.p99005.e14
    /* renamed from: t */
    public gl4 R2() throws a14, t14 {
        validate();
        return this.z.a1();
    }

    @Override // com.p7700g.p99005.e14
    public String toString() {
        return this.x;
    }

    @Override // com.p7700g.p99005.e14
    public void validate() throws a14 {
        if (o()) {
            return;
        }
        synchronized (this) {
            if (o()) {
                return;
            }
            try {
                this.z = g().c(this);
                this.A = Boolean.TRUE;
            } catch (a14 e) {
                this.y = e;
                this.A = Boolean.FALSE;
                throw e;
            }
        }
    }

    public v14(String str, w14 w14Var) {
        if (str == null) {
            this.x = "";
        } else {
            this.x = str.trim();
        }
        this.w = w14Var;
    }

    @Override // com.p7700g.p99005.e14
    public gl4 a1() {
        if (n()) {
            try {
                return this.z.a1();
            } catch (t14 unused) {
                return null;
            }
        }
        return null;
    }

    public v14(gl4 gl4Var) {
        this.w = null;
        this.x = gl4Var.E0();
        h(gl4Var);
    }
}