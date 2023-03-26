package com.p7700g.p99005;

import com.p7700g.p99005.en4;
import com.p7700g.p99005.mn4;
import com.p7700g.p99005.ym4;
import java.net.URI;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: AbstractRuntimeDelegate.java */
/* loaded from: classes3.dex */
public abstract class fw3 extends mn4 {
    private final Set<yx3> e = new HashSet();
    private final Map<Class<?>, mn4.a> f = new WeakHashMap();

    public fw3() {
        Iterator it = py3.u(yx3.class, true).iterator();
        while (it.hasNext()) {
            this.e.add((yx3) it.next());
        }
        this.f.put(qm4.class, i(qm4.class));
        this.f.put(tm4.class, i(tm4.class));
        this.f.put(nm4.class, i(nm4.class));
        this.f.put(vm4.class, i(vm4.class));
        this.f.put(pm4.class, i(pm4.class));
        this.f.put(URI.class, i(URI.class));
        this.f.put(Date.class, i(Date.class));
        this.f.put(String.class, i(String.class));
    }

    private <T> mn4.a<T> i(Class<T> cls) {
        for (yx3 yx3Var : this.e) {
            if (yx3Var.c(cls)) {
                return yx3Var;
            }
        }
        return null;
    }

    @Override // com.p7700g.p99005.mn4
    public <T> mn4.a<T> b(Class<T> cls) {
        if (cls != null) {
            mn4.a<T> aVar = this.f.get(cls);
            return aVar != null ? aVar : i(cls);
        }
        throw new IllegalArgumentException("type parameter cannot be null");
    }

    @Override // com.p7700g.p99005.mn4
    public ym4.a c() {
        return new kw3();
    }

    @Override // com.p7700g.p99005.mn4
    public bn4 d() {
        return new ls3();
    }

    @Override // com.p7700g.p99005.mn4
    public en4.a e() {
        return new mw3();
    }
}