package com.p7700g.p99005;

import com.p7700g.p99005.j14;
import java.io.Serializable;

/* compiled from: ParsedHostIdentifierStringQualifier.java */
/* loaded from: classes3.dex */
public class v64 implements Serializable {
    private static final long s = 4;
    private Integer t;
    private final Integer u;
    private final CharSequence v;
    private w64 w;
    private j14 x;
    private final CharSequence y;

    public v64() {
        this(null, null, null, null, null);
    }

    private static Integer b(int i) {
        return t64.a(i);
    }

    private static Integer c(int i) {
        return t64.a(i);
    }

    private void p(v64 v64Var) {
        w64 w64Var = v64Var.w;
        if (w64Var != null) {
            this.w = w64Var;
        }
    }

    private void u(v64 v64Var) {
        Integer num = v64Var.t;
        if (num != null) {
            this.t = num;
        }
    }

    public Integer K3() {
        return this.t;
    }

    public Integer f() {
        j14 g;
        Integer K3 = K3();
        return (K3 != null || (g = g()) == null) ? K3 : g.E3(true);
    }

    public j14 g() {
        j14 j14Var = this.x;
        if (j14Var != null) {
            return j14Var;
        }
        w64 w64Var = this.w;
        if (w64Var != null) {
            return w64Var.d5();
        }
        return null;
    }

    public Integer h() {
        return this.u;
    }

    public CharSequence i() {
        return this.v;
    }

    public CharSequence m() {
        return this.y;
    }

    public j14.b n(s14 s14Var) {
        Integer num = this.t;
        if (num != null) {
            if (num.intValue() <= j14.x3(j14.b.IPV4) || s14Var.o().G) {
                return null;
            }
            return j14.b.IPV6;
        }
        w64 w64Var = this.w;
        if (w64Var != null) {
            if (w64Var.v2()) {
                return j14.b.IPV6;
            }
            if (this.w.o3()) {
                return j14.b.IPV4;
            }
            return null;
        } else if (this.y != null) {
            return j14.b.IPV6;
        } else {
            return null;
        }
    }

    public void o(v64 v64Var) {
        Integer num = this.t;
        if (num == null) {
            this.t = v64Var.t;
        } else if (v64Var.t != null) {
            this.t = b(Math.min(num.intValue(), v64Var.t.intValue()));
        }
        if (this.w == null) {
            this.w = v64Var.w;
        } else if (v64Var.w != null) {
            this.x = g().V4(v64Var.g());
        }
    }

    public void t(v64 v64Var) {
        u(v64Var);
        p(v64Var);
    }

    public String toString() {
        StringBuilder G = wo1.G("network prefix length: ");
        G.append(this.t);
        G.append(" mask: ");
        G.append(this.w);
        G.append(" zone: ");
        G.append((Object) this.y);
        G.append(" port: ");
        G.append(this.u);
        G.append(" service: ");
        G.append((Object) this.v);
        return G.toString();
    }

    public v64(CharSequence charSequence) {
        this(null, null, charSequence, null, null);
    }

    public v64(CharSequence charSequence, int i) {
        this(null, null, charSequence, c(i), null);
    }

    public v64(Integer num, CharSequence charSequence) {
        this(num, null, charSequence, null, null);
    }

    public v64(w64 w64Var, CharSequence charSequence) {
        this(null, w64Var, charSequence, null, null);
    }

    public v64(CharSequence charSequence, CharSequence charSequence2) {
        this(null, null, charSequence, null, charSequence2);
        if (charSequence != null && charSequence2 != null) {
            throw new IllegalArgumentException();
        }
    }

    private v64(Integer num, w64 w64Var, CharSequence charSequence, Integer num2, CharSequence charSequence2) {
        this.t = num;
        this.w = w64Var;
        this.y = charSequence;
        this.u = num2;
        this.v = charSequence2;
    }
}