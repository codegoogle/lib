package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.bw2;
import com.p7700g.p99005.cw2;
import com.p7700g.p99005.cx2;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.qw2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.sv2;
import com.p7700g.p99005.tv2;
import com.p7700g.p99005.uv2;
import com.p7700g.p99005.yv2;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {
    private final cw2<T> a;
    private final tv2<T> b;
    public final Gson c;
    private final lx2<T> d;
    private final jw2 e;
    private final TreeTypeAdapter<T>.b f = new b();
    private volatile TypeAdapter<T> g;

    /* loaded from: classes3.dex */
    public static final class SingleTypeFactory implements jw2 {
        private final lx2<?> s;
        private final boolean t;
        private final Class<?> u;
        private final cw2<?> v;
        private final tv2<?> w;

        public SingleTypeFactory(Object obj, lx2<?> lx2Var, boolean z, Class<?> cls) {
            cw2<?> cw2Var = obj instanceof cw2 ? (cw2) obj : null;
            this.v = cw2Var;
            tv2<?> tv2Var = obj instanceof tv2 ? (tv2) obj : null;
            this.w = tv2Var;
            qw2.a((cw2Var == null && tv2Var == null) ? false : true);
            this.s = lx2Var;
            this.t = z;
            this.u = cls;
        }

        @Override // com.p7700g.p99005.jw2
        public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
            boolean isAssignableFrom;
            lx2<?> lx2Var2 = this.s;
            if (lx2Var2 != null) {
                isAssignableFrom = lx2Var2.equals(lx2Var) || (this.t && this.s.g() == lx2Var.f());
            } else {
                isAssignableFrom = this.u.isAssignableFrom(lx2Var.f());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(this.v, this.w, gson, lx2Var, this);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public final class b implements bw2, sv2 {
        private b() {
        }

        @Override // com.p7700g.p99005.sv2
        public <R> R a(uv2 uv2Var, Type type) throws yv2 {
            return (R) TreeTypeAdapter.this.c.j(uv2Var, type);
        }

        @Override // com.p7700g.p99005.bw2
        public uv2 b(Object obj, Type type) {
            return TreeTypeAdapter.this.c.H(obj, type);
        }

        @Override // com.p7700g.p99005.bw2
        public uv2 c(Object obj) {
            return TreeTypeAdapter.this.c.G(obj);
        }
    }

    public TreeTypeAdapter(cw2<T> cw2Var, tv2<T> tv2Var, Gson gson, lx2<T> lx2Var, jw2 jw2Var) {
        this.a = cw2Var;
        this.b = tv2Var;
        this.c = gson;
        this.d = lx2Var;
        this.e = jw2Var;
    }

    private TypeAdapter<T> a() {
        TypeAdapter<T> typeAdapter = this.g;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> r = this.c.r(this.e, this.d);
        this.g = r;
        return r;
    }

    public static jw2 b(lx2<?> lx2Var, Object obj) {
        return new SingleTypeFactory(obj, lx2Var, false, null);
    }

    public static jw2 c(lx2<?> lx2Var, Object obj) {
        return new SingleTypeFactory(obj, lx2Var, lx2Var.g() == lx2Var.f(), null);
    }

    public static jw2 d(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.google.gson.TypeAdapter
    public T read(nx2 nx2Var) throws IOException {
        if (this.b == null) {
            return a().read(nx2Var);
        }
        uv2 a2 = cx2.a(nx2Var);
        if (a2.B()) {
            return null;
        }
        return this.b.a(a2, this.d.g(), this.f);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(qx2 qx2Var, T t) throws IOException {
        cw2<T> cw2Var = this.a;
        if (cw2Var == null) {
            a().write(qx2Var, t);
        } else if (t == null) {
            qx2Var.w();
        } else {
            cx2.b(cw2Var.a(t, this.d.g(), this.f), qx2Var);
        }
    }
}