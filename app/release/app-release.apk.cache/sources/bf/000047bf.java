package com.p7700g.p99005;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: CallableReference.java */
/* loaded from: classes3.dex */
public abstract class i15 implements t55, Serializable {
    @tp4(version = "1.1")
    public static final Object s = a.s;
    private transient t55 t;
    @tp4(version = "1.1")
    public final Object u;
    @tp4(version = "1.4")
    private final Class v;
    @tp4(version = "1.4")
    private final String w;
    @tp4(version = "1.4")
    private final String x;
    @tp4(version = "1.4")
    private final boolean y;

    /* compiled from: CallableReference.java */
    @tp4(version = "1.2")
    /* loaded from: classes3.dex */
    public static class a implements Serializable {
        private static final a s = new a();

        private a() {
        }

        private Object g() throws ObjectStreamException {
            return s;
        }
    }

    public i15() {
        this(s);
    }

    @tp4(version = "1.1")
    public t55 D4() {
        t55 t55Var = this.t;
        if (t55Var == null) {
            t55 E4 = E4();
            this.t = E4;
            return E4;
        }
        return t55Var;
    }

    public abstract t55 E4();

    @tp4(version = "1.1")
    public Object F4() {
        return this.u;
    }

    public y55 G4() {
        Class cls = this.v;
        if (cls == null) {
            return null;
        }
        return this.y ? c35.g(cls) : c35.d(cls);
    }

    @tp4(version = "1.1")
    public t55 H4() {
        t55 D4 = D4();
        if (D4 != this) {
            return D4;
        }
        throw new nz4();
    }

    public String I4() {
        return this.x;
    }

    @Override // com.p7700g.p99005.t55
    public List<e65> Y0() {
        return H4().Y0();
    }

    @Override // com.p7700g.p99005.t55
    public Object c1(Map map) {
        return H4().c1(map);
    }

    @Override // com.p7700g.p99005.s55
    public List<Annotation> getAnnotations() {
        return H4().getAnnotations();
    }

    @Override // com.p7700g.p99005.t55
    public String getName() {
        return this.w;
    }

    @Override // com.p7700g.p99005.t55
    @tp4(version = "1.1")
    public n65 getVisibility() {
        return H4().getVisibility();
    }

    @Override // com.p7700g.p99005.t55
    @tp4(version = "1.1")
    public boolean h() {
        return H4().h();
    }

    @Override // com.p7700g.p99005.t55
    @tp4(version = "1.1")
    public boolean isOpen() {
        return H4().isOpen();
    }

    @Override // com.p7700g.p99005.t55
    @tp4(version = "1.1")
    public List<k65> m() {
        return H4().m();
    }

    @Override // com.p7700g.p99005.t55
    public j65 n4() {
        return H4().n4();
    }

    @Override // com.p7700g.p99005.t55
    @tp4(version = "1.1")
    public boolean o() {
        return H4().o();
    }

    @Override // com.p7700g.p99005.t55
    @tp4(version = "1.3")
    public boolean t() {
        return H4().t();
    }

    @Override // com.p7700g.p99005.t55
    public Object y4(Object... objArr) {
        return H4().y4(objArr);
    }

    @tp4(version = "1.1")
    public i15(Object obj) {
        this(obj, null, null, null, false);
    }

    @tp4(version = "1.4")
    public i15(Object obj, Class cls, String str, String str2, boolean z) {
        this.u = obj;
        this.v = cls;
        this.w = str;
        this.x = str2;
        this.y = z;
    }
}