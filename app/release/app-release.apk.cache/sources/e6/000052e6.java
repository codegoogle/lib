package com.p7700g.p99005;

import com.p7700g.p99005.du1;
import com.p7700g.p99005.hp1;
import com.p7700g.p99005.or1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DecodeHelper.java */
/* loaded from: classes2.dex */
public final class nr1<Transcode> {
    private final List<du1.a<?>> a = new ArrayList();
    private final List<gq1> b = new ArrayList();
    private ap1 c;
    private Object d;
    private int e;
    private int f;
    private Class<?> g;
    private or1.e h;
    private jq1 i;
    private Map<Class<?>, nq1<?>> j;
    private Class<Transcode> k;
    private boolean l;
    private boolean m;
    private gq1 n;
    private fp1 o;
    private qr1 p;
    private boolean q;
    private boolean r;

    public void a() {
        this.c = null;
        this.d = null;
        this.n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.b.clear();
        this.m = false;
    }

    public is1 b() {
        return this.c.b();
    }

    public List<gq1> c() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List<du1.a<?>> g = g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                du1.a<?> aVar = g.get(i);
                if (!this.b.contains(aVar.a)) {
                    this.b.add(aVar.a);
                }
                for (int i2 = 0; i2 < aVar.b.size(); i2++) {
                    if (!this.b.contains(aVar.b.get(i2))) {
                        this.b.add(aVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    public xs1 d() {
        return this.h.a();
    }

    public qr1 e() {
        return this.p;
    }

    public int f() {
        return this.f;
    }

    public List<du1.a<?>> g() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List i = this.c.i().i(this.d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                du1.a<?> b = ((du1) i.get(i2)).b(this.d, this.e, this.f, this.i);
                if (b != null) {
                    this.a.add(b);
                }
            }
        }
        return this.a;
    }

    public <Data> as1<Data, ?, Transcode> h(Class<Data> cls) {
        return this.c.i().h(cls, this.g, this.k);
    }

    public Class<?> i() {
        return this.d.getClass();
    }

    public List<du1<File, ?>> j(File file) throws hp1.c {
        return this.c.i().i(file);
    }

    public jq1 k() {
        return this.i;
    }

    public fp1 l() {
        return this.o;
    }

    public List<Class<?>> m() {
        return this.c.i().j(this.d.getClass(), this.g, this.k);
    }

    public <Z> mq1<Z> n(cs1<Z> cs1Var) {
        return this.c.i().k(cs1Var);
    }

    public <T> sq1<T> o(T t) {
        return this.c.i().l(t);
    }

    public gq1 p() {
        return this.n;
    }

    public <X> dq1<X> q(X x) throws hp1.e {
        return this.c.i().m(x);
    }

    public Class<?> r() {
        return (Class<Transcode>) this.k;
    }

    public <Z> nq1<Z> s(Class<Z> cls) {
        nq1<Z> nq1Var = (nq1<Z>) this.j.get(cls);
        if (nq1Var == null) {
            Iterator<Map.Entry<Class<?>, nq1<?>>> it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, nq1<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    nq1Var = (nq1<Z>) next.getValue();
                    break;
                }
            }
        }
        if (nq1Var == null) {
            if (this.j.isEmpty() && this.q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return xu1.c();
        }
        return nq1Var;
    }

    public int t() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean u(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <R> void v(ap1 ap1Var, Object obj, gq1 gq1Var, int i, int i2, qr1 qr1Var, Class<?> cls, Class<R> cls2, fp1 fp1Var, jq1 jq1Var, Map<Class<?>, nq1<?>> map, boolean z, boolean z2, or1.e eVar) {
        this.c = ap1Var;
        this.d = obj;
        this.n = gq1Var;
        this.e = i;
        this.f = i2;
        this.p = qr1Var;
        this.g = cls;
        this.h = eVar;
        this.k = cls2;
        this.o = fp1Var;
        this.i = jq1Var;
        this.j = map;
        this.q = z;
        this.r = z2;
    }

    public boolean w(cs1<?> cs1Var) {
        return this.c.i().n(cs1Var);
    }

    public boolean x() {
        return this.r;
    }

    public boolean y(gq1 gq1Var) {
        List<du1.a<?>> g = g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).a.equals(gq1Var)) {
                return true;
            }
        }
        return false;
    }
}