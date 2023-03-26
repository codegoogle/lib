package com.p7700g.p99005;

import android.os.Bundle;
import com.anchorfree.sdk.exceptions.InvalidTransportException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: SwitchableTransport.java */
/* loaded from: classes2.dex */
public class an1 extends hn1 {
    @x1
    private static final kj1 t = kj1.b("SwitchableTransport");
    @z1
    public hn1 A = null;
    @x1
    private Map<String, hn1> B = new HashMap();
    @x1
    private final po1 u;
    @x1
    private final o51 v;
    @x1
    private final td1 w;
    @x1
    private final td1 x;
    @x1
    private final pa1 y;
    @x1
    private h51 z;

    public an1(@x1 pa1 pa1Var, @x1 h51 h51Var, @x1 o51 o51Var, @x1 po1 po1Var, @x1 td1 td1Var, @x1 td1 td1Var2) {
        this.y = pa1Var;
        this.z = h51Var;
        this.u = po1Var;
        this.v = o51Var;
        this.w = td1Var;
        this.x = td1Var2;
    }

    private void E(@x1 j51 j51Var) {
        hn1 hn1Var = this.B.get(j51Var.d());
        this.A = hn1Var;
        if (hn1Var == null) {
            hn1 c = this.y.c(j51Var.e().g(), this.w, this.x, this.u);
            this.A = c;
            if (c != null) {
                this.B.put(j51Var.d(), this.A);
            }
        }
    }

    @Override // com.p7700g.p99005.hn1
    public void A(@x1 fo1 fo1Var, @x1 ln1 ln1Var) throws gc1 {
        E(this.z.p(fo1Var));
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            hn1Var.A(fo1Var, ln1Var);
            return;
        }
        throw new InvalidTransportException();
    }

    @Override // com.p7700g.p99005.hn1
    public void B() {
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            hn1Var.B();
        }
    }

    @Override // com.p7700g.p99005.hn1
    public void C(@x1 fo1 fo1Var) {
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            hn1Var.C(fo1Var);
        }
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public String D() {
        hn1 hn1Var = this.A;
        return hn1Var != null ? hn1Var.D() : "";
    }

    @Override // com.p7700g.p99005.hn1
    public void j() {
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            hn1Var.j();
        }
    }

    @Override // com.p7700g.p99005.hn1
    public void k(@x1 jn1 jn1Var) {
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            hn1Var.k(jn1Var);
        }
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public lm1 l() {
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            return hn1Var.l();
        }
        return lm1.g();
    }

    @Override // com.p7700g.p99005.hn1
    public int m(@x1 String str) {
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            return hn1Var.m(str);
        }
        return 0;
    }

    @Override // com.p7700g.p99005.hn1
    public int n() {
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            return hn1Var.n();
        }
        return 0;
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public String o() {
        hn1 hn1Var = this.A;
        return hn1Var != null ? hn1Var.o() : "";
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public List<ld1> p() {
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            return hn1Var.p();
        }
        return Collections.emptyList();
    }

    @Override // com.p7700g.p99005.hn1
    public boolean q() {
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            return hn1Var.q();
        }
        return false;
    }

    @Override // com.p7700g.p99005.hn1
    public void v(int i, @x1 Bundle bundle) {
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            hn1Var.v(i, bundle);
        }
    }

    @Override // com.p7700g.p99005.hn1
    public void w(@x1 Bundle bundle) {
        try {
            g51 h = this.z.h(bundle);
            dq0<List<j51>> s0 = this.v.s0();
            s0.Y();
            List<j51> F = s0.F();
            if (F != null) {
                for (j51 j51Var : F) {
                    if (j51Var.d().equals(h.e().getTransport())) {
                        E(j51Var);
                        hn1 hn1Var = this.A;
                        if (hn1Var != null) {
                            hn1Var.w(bundle);
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            t.f(th);
        }
    }

    @Override // com.p7700g.p99005.hn1
    public void x(@x1 jn1 jn1Var) {
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            hn1Var.x(jn1Var);
        }
    }

    @Override // com.p7700g.p99005.hn1
    public void y() {
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            hn1Var.y();
        }
    }

    @Override // com.p7700g.p99005.hn1
    public void z(@x1 String str, @x1 String str2) {
        hn1 hn1Var = this.A;
        if (hn1Var != null) {
            hn1Var.z(str, str2);
        }
    }
}