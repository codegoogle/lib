package com.p7700g.p99005;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: GsonBuilder.java */
/* loaded from: classes3.dex */
public final class pv2 {
    private Excluder a;
    private fw2 b;
    private ov2 c;
    private final Map<Type, qv2<?>> d;
    private final List<jw2> e;
    private final List<jw2> f;
    private boolean g;
    private String h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private iw2 r;
    private iw2 s;
    private final LinkedList<gw2> t;

    public pv2() {
        this.a = Excluder.t;
        this.b = fw2.s;
        this.c = nv2.s;
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = false;
        this.h = Gson.i;
        this.i = 2;
        this.j = 2;
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = true;
        this.r = Gson.k;
        this.s = Gson.l;
        this.t = new LinkedList<>();
    }

    private void d(String str, int i, int i2, List<jw2> list) {
        jw2 jw2Var;
        jw2 jw2Var2;
        boolean z = jx2.a;
        jw2 jw2Var3 = null;
        if (str != null && !str.trim().isEmpty()) {
            jw2Var = DefaultDateTypeAdapter.b.a.c(str);
            if (z) {
                jw2Var3 = jx2.c.c(str);
                jw2Var2 = jx2.b.c(str);
            }
            jw2Var2 = null;
        } else if (i == 2 || i2 == 2) {
            return;
        } else {
            jw2 b = DefaultDateTypeAdapter.b.a.b(i, i2);
            if (z) {
                jw2Var3 = jx2.c.b(i, i2);
                jw2 b2 = jx2.b.b(i, i2);
                jw2Var = b;
                jw2Var2 = b2;
            } else {
                jw2Var = b;
                jw2Var2 = null;
            }
        }
        list.add(jw2Var);
        if (z) {
            list.add(jw2Var3);
            list.add(jw2Var2);
        }
    }

    public pv2 A(iw2 iw2Var) {
        this.r = iw2Var;
        return this;
    }

    public pv2 B() {
        this.n = true;
        return this;
    }

    public pv2 C(double d) {
        this.a = this.a.y(d);
        return this;
    }

    public pv2 a(lv2 lv2Var) {
        this.a = this.a.u(lv2Var, false, true);
        return this;
    }

    public pv2 b(gw2 gw2Var) {
        Objects.requireNonNull(gw2Var);
        this.t.addFirst(gw2Var);
        return this;
    }

    public pv2 c(lv2 lv2Var) {
        this.a = this.a.u(lv2Var, true, false);
        return this;
    }

    public Gson e() {
        ArrayList arrayList = new ArrayList(this.f.size() + this.e.size() + 3);
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        d(this.h, this.i, this.j, arrayList);
        return new Gson(this.a, this.c, new HashMap(this.d), this.g, this.k, this.o, this.m, this.n, this.p, this.l, this.q, this.b, this.h, this.i, this.j, new ArrayList(this.e), new ArrayList(this.f), arrayList, this.r, this.s, new ArrayList(this.t));
    }

    public pv2 f() {
        this.m = false;
        return this;
    }

    public pv2 g() {
        this.a = this.a.b();
        return this;
    }

    public pv2 h() {
        this.q = false;
        return this;
    }

    public pv2 i() {
        this.k = true;
        return this;
    }

    public pv2 j(int... iArr) {
        this.a = this.a.x(iArr);
        return this;
    }

    public pv2 k() {
        this.a = this.a.g();
        return this;
    }

    public pv2 l() {
        this.o = true;
        return this;
    }

    public pv2 m(Type type, Object obj) {
        boolean z = obj instanceof cw2;
        qw2.a(z || (obj instanceof tv2) || (obj instanceof qv2) || (obj instanceof TypeAdapter));
        if (obj instanceof qv2) {
            this.d.put(type, (qv2) obj);
        }
        if (z || (obj instanceof tv2)) {
            this.e.add(TreeTypeAdapter.c(lx2.c(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            this.e.add(TypeAdapters.a(lx2.c(type), (TypeAdapter) obj));
        }
        return this;
    }

    public pv2 n(jw2 jw2Var) {
        this.e.add(jw2Var);
        return this;
    }

    public pv2 o(Class<?> cls, Object obj) {
        boolean z = obj instanceof cw2;
        qw2.a(z || (obj instanceof tv2) || (obj instanceof TypeAdapter));
        if ((obj instanceof tv2) || z) {
            this.f.add(TreeTypeAdapter.d(cls, obj));
        }
        if (obj instanceof TypeAdapter) {
            this.e.add(TypeAdapters.e(cls, (TypeAdapter) obj));
        }
        return this;
    }

    public pv2 p() {
        this.g = true;
        return this;
    }

    public pv2 q() {
        this.l = true;
        return this;
    }

    public pv2 r(int i) {
        this.i = i;
        this.h = null;
        return this;
    }

    public pv2 s(int i, int i2) {
        this.i = i;
        this.j = i2;
        this.h = null;
        return this;
    }

    public pv2 t(String str) {
        this.h = str;
        return this;
    }

    public pv2 u(lv2... lv2VarArr) {
        for (lv2 lv2Var : lv2VarArr) {
            this.a = this.a.u(lv2Var, true, true);
        }
        return this;
    }

    public pv2 v(nv2 nv2Var) {
        this.c = nv2Var;
        return this;
    }

    public pv2 w(ov2 ov2Var) {
        this.c = ov2Var;
        return this;
    }

    public pv2 x() {
        this.p = true;
        return this;
    }

    public pv2 y(fw2 fw2Var) {
        this.b = fw2Var;
        return this;
    }

    public pv2 z(iw2 iw2Var) {
        this.s = iw2Var;
        return this;
    }

    public pv2(Gson gson) {
        this.a = Excluder.t;
        this.b = fw2.s;
        this.c = nv2.s;
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        this.g = false;
        this.h = Gson.i;
        this.i = 2;
        this.j = 2;
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = true;
        this.r = Gson.k;
        this.s = Gson.l;
        LinkedList<gw2> linkedList = new LinkedList<>();
        this.t = linkedList;
        this.a = gson.t;
        this.c = gson.u;
        hashMap.putAll(gson.v);
        this.g = gson.w;
        this.k = gson.x;
        this.o = gson.y;
        this.m = gson.z;
        this.n = gson.A;
        this.p = gson.B;
        this.l = gson.C;
        this.b = gson.H;
        this.h = gson.E;
        this.i = gson.F;
        this.j = gson.G;
        arrayList.addAll(gson.I);
        arrayList2.addAll(gson.J);
        this.q = gson.D;
        this.r = gson.K;
        this.s = gson.L;
        linkedList.addAll(gson.M);
    }
}