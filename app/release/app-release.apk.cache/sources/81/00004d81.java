package com.p7700g.p99005;

import com.p7700g.p99005.ym4;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: ResponseBuilderImpl.java */
/* loaded from: classes3.dex */
public final class kw3 extends ym4.a {
    private ym4.c a;
    private dt3 b;
    private Object c;
    private Type d;

    public kw3() {
        this.a = ym4.b.NO_CONTENT;
    }

    private void C() {
        this.a = ym4.b.NO_CONTENT;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    private boolean D(String str, String str2) {
        return (str == null || str.equalsIgnoreCase(str2)) ? false : true;
    }

    private boolean E(Locale locale, Locale locale2) {
        return (locale == null || locale.equals(locale2)) ? false : true;
    }

    private boolean F(tm4 tm4Var, tm4 tm4Var2) {
        return (tm4Var == null || tm4Var.equals(tm4Var2)) ? false : true;
    }

    private void w(StringBuilder sb, boolean z, String str) {
        if (z) {
            if (sb.length() > 0) {
                sb.append(e14.f0);
            }
            sb.append(str);
        }
    }

    private dt3 z() {
        if (this.b == null) {
            this.b = new dt3();
        }
        return this.b;
    }

    public ym4.a A(String str, Object obj, boolean z) {
        if (obj == null) {
            z().remove(str);
        } else if (z) {
            z().c(str, obj);
        } else {
            z().d(str, obj);
        }
        return this;
    }

    public ym4.a B(String str, Object obj) {
        return A(str, obj, true);
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4 a() {
        lw3 lw3Var = new lw3(this.a, z(), this.c, this.d);
        C();
        return lw3Var;
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a b(nm4 nm4Var) {
        B(sm4.f, nm4Var);
        return this;
    }

    @Override // com.p7700g.p99005.ym4.a
    /* renamed from: c */
    public ym4.a clone() {
        return new kw3(this);
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a d(URI uri) {
        B(sm4.j, uri);
        return this;
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a e(vm4... vm4VarArr) {
        if (vm4VarArr != null) {
            for (vm4 vm4Var : vm4VarArr) {
                h(sm4.z, vm4Var);
            }
        } else {
            h(sm4.z, null);
        }
        return this;
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a f(Object obj) {
        this.c = obj;
        this.d = obj != null ? obj.getClass() : null;
        return this;
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a g(Date date) {
        B(sm4.n, date);
        return this;
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a h(String str, Object obj) {
        return A(str, obj, false);
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a i(String str) {
        B(sm4.h, str);
        return this;
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a j(Locale locale) {
        B(sm4.h, locale);
        return this;
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a k(Date date) {
        B(sm4.t, date);
        return this;
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a l(URI uri) {
        B("Location", uri);
        return this;
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a n(int i) {
        return p(lw3.y(i));
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a p(ym4.c cVar) {
        if (cVar != null) {
            this.a = cVar;
            return this;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a q(String str) {
        return r(str == null ? null : new qm4(str));
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a r(qm4 qm4Var) {
        B(sm4.m, qm4Var);
        return this;
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a s(String str) {
        return t(str == null ? null : tm4.h(str));
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a t(tm4 tm4Var) {
        B("Content-Type", tm4Var);
        return this;
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a u(en4 en4Var) {
        if (en4Var == null) {
            t(null);
            i(null);
            x(null);
            return this;
        }
        t(en4Var.d());
        j(en4Var.c());
        x(en4Var.b());
        return this;
    }

    @Override // com.p7700g.p99005.ym4.a
    public ym4.a v(List<en4> list) {
        if (list == null) {
            h(sm4.w, null);
            return this;
        } else if (list.isEmpty()) {
            return this;
        } else {
            tm4 d = list.get(0).d();
            Locale c = list.get(0).c();
            String b = list.get(0).b();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (en4 en4Var : list) {
                boolean z4 = true;
                z |= !z && F(en4Var.d(), d);
                z2 |= !z2 && E(en4Var.c(), c);
                if (z3 || !D(en4Var.b(), b)) {
                    z4 = false;
                }
                z3 |= z4;
            }
            StringBuilder sb = new StringBuilder();
            w(sb, z, sm4.a);
            w(sb, z2, sm4.d);
            w(sb, z3, sm4.c);
            if (sb.length() > 0) {
                h(sm4.w, sb.toString());
            }
            return this;
        }
    }

    public ym4.a x(String str) {
        B("Content-Encoding", str);
        return this;
    }

    public ym4.a y(Object obj, Type type) {
        this.c = obj;
        this.d = type;
        return this;
    }

    private kw3(kw3 kw3Var) {
        this.a = ym4.b.NO_CONTENT;
        this.a = kw3Var.a;
        this.c = kw3Var.c;
        if (kw3Var.b != null) {
            this.b = new dt3(kw3Var.b);
        } else {
            this.b = null;
        }
        this.d = kw3Var.d;
    }
}