package com.p7700g.p99005;

import java.util.List;

/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes.dex */
public class hk0 extends zj0<qk0> {

    /* compiled from: TextKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public class a extends np0<qk0> {
        public final /* synthetic */ fp0 d;
        public final /* synthetic */ np0 e;
        public final /* synthetic */ qk0 f;

        public a(fp0 fp0Var, np0 np0Var, qk0 qk0Var) {
            this.d = fp0Var;
            this.e = np0Var;
            this.f = qk0Var;
        }

        @Override // com.p7700g.p99005.np0
        /* renamed from: e */
        public qk0 a(fp0<qk0> fp0Var) {
            this.d.h(fp0Var.f(), fp0Var.a(), fp0Var.g().a, fp0Var.b().a, fp0Var.d(), fp0Var.c(), fp0Var.e());
            String str = (String) this.e.a(this.d);
            qk0 b = fp0Var.c() == 1.0f ? fp0Var.b() : fp0Var.g();
            this.f.a(str, b.b, b.c, b.d, b.e, b.f, b.g, b.h, b.i, b.j, b.k);
            return this.f;
        }
    }

    public hk0(List<ep0<qk0>> list) {
        super(list);
    }

    @Override // com.p7700g.p99005.tj0
    /* renamed from: p */
    public qk0 i(ep0<qk0> ep0Var, float f) {
        qk0 qk0Var;
        np0<A> np0Var = this.e;
        if (np0Var == 0) {
            if (f == 1.0f && (qk0Var = ep0Var.e) != null) {
                return qk0Var;
            }
            return ep0Var.d;
        }
        float f2 = ep0Var.i;
        Float f3 = ep0Var.j;
        float floatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        qk0 qk0Var2 = ep0Var.d;
        qk0 qk0Var3 = qk0Var2;
        qk0 qk0Var4 = ep0Var.e;
        return (qk0) np0Var.b(f2, floatValue, qk0Var3, qk0Var4 == null ? qk0Var2 : qk0Var4, f, d(), f());
    }

    public void q(np0<String> np0Var) {
        super.n(new a(new fp0(), np0Var, new qk0()));
    }
}