package com.p7700g.p99005;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: NetworkCallback.java */
/* loaded from: classes.dex */
public class ts0<T> implements hr0<mr0> {
    @x1
    private static final kj1 b = kj1.b("NetworkCallback");
    @x1
    private static final Set<String> c = new HashSet(Arrays.asList(it0.a, it0.b));
    private final st0 d;
    private final hr0<T> e;
    private final Class<T> f;

    public ts0(st0 st0Var, Class<T> cls, hr0<T> hr0Var) {
        this.d = st0Var;
        this.e = hr0Var;
        this.f = cls;
    }

    @Override // com.p7700g.p99005.hr0
    public void a(au0 au0Var) {
        b.f(au0Var);
        this.e.a(au0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.hr0
    /* renamed from: c */
    public void b(dr0 dr0Var, mr0 mr0Var) {
        String f = mr0Var.f();
        try {
            et0 et0Var = (et0) this.d.a(f, et0.class);
            if (c.contains(et0Var.e())) {
                this.e.b(dr0Var, this.d.a(f, this.f));
            } else {
                a(au0.a(dr0Var, mr0Var.g(), et0Var));
            }
        } catch (Exception e) {
            b.f(e);
            a(au0.b(dr0Var, e, f));
        }
    }
}