package com.p7700g.p99005;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: MessageBodyFactory.java */
/* loaded from: classes3.dex */
public class iw3 implements zx3 {
    public static final bx3<tm4> a = new a();
    private final tv3 b;
    private final boolean c;
    private Map<tm4, List<in4>> d;
    private Map<tm4, List<jn4>> e;
    private List<d> f;
    private Map<tm4, List<in4>> g;
    private Map<tm4, List<jn4>> h;
    private List<d> i;

    /* compiled from: MessageBodyFactory.java */
    /* loaded from: classes3.dex */
    public static class a implements bx3<tm4> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(tm4 tm4Var, tm4 tm4Var2) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override // com.p7700g.p99005.bx3
        /* renamed from: b */
        public boolean e(tm4 tm4Var, tm4 tm4Var2) {
            return tm4Var.d().equalsIgnoreCase(tm4Var2.d()) && tm4Var.c().equalsIgnoreCase(tm4Var2.c());
        }

        @Override // com.p7700g.p99005.bx3
        /* renamed from: d */
        public int c(tm4 tm4Var) {
            return tm4Var.c().toLowerCase().hashCode() + tm4Var.d().toLowerCase().hashCode();
        }
    }

    /* compiled from: MessageBodyFactory.java */
    /* loaded from: classes3.dex */
    public class b implements Comparator<d> {
        public final /* synthetic */ c s;

        public b(c cVar) {
            this.s = cVar;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return this.s.compare(dVar.a, dVar2.a);
        }
    }

    /* compiled from: MessageBodyFactory.java */
    /* loaded from: classes3.dex */
    public static class c<T> implements Comparator<T> {
        private final Class<T> s;
        private final Map<Class, Integer> t = new HashMap();

        public c(Class cls) {
            this.s = cls;
        }

        public int a(T t) {
            Integer num = this.t.get(t.getClass());
            if (num != null) {
                return num.intValue();
            }
            Class[] s = jv3.s(jv3.j(t.getClass(), this.s));
            Integer num2 = 0;
            for (Class cls = s != null ? s[0] : null; cls != null && cls != Object.class; cls = cls.getSuperclass()) {
                num2 = Integer.valueOf(num2.intValue() + 1);
            }
            this.t.put(t.getClass(), num2);
            return num2.intValue();
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return a(t2) - a(t);
        }
    }

    /* compiled from: MessageBodyFactory.java */
    /* loaded from: classes3.dex */
    public static class d {
        public final jn4 a;
        public final List<tm4> b;

        public d(jn4 jn4Var, List<tm4> list) {
            this.a = jn4Var;
            this.b = list;
        }
    }

    public iw3(tv3 tv3Var, boolean z) {
        this.b = tv3Var;
        this.c = z;
    }

    private <T> in4<T> i(Class<T> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, Map<tm4, List<in4>> map) {
        in4<T> in4Var;
        if (tm4Var != null) {
            in4Var = k(cls, type, annotationArr, tm4Var, tm4Var, map);
            if (in4Var == null) {
                in4Var = k(cls, type, annotationArr, tm4Var, ct3.i(tm4Var), map);
            }
        } else {
            in4Var = null;
        }
        return in4Var == null ? k(cls, type, annotationArr, tm4Var, ct3.h, map) : in4Var;
    }

    private <T> in4<T> j(Class<T> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, tm4 tm4Var2) {
        in4<T> k;
        return (this.g.isEmpty() || (k = k(cls, type, annotationArr, tm4Var, tm4Var2, this.g)) == null) ? k(cls, type, annotationArr, tm4Var, tm4Var2, this.d) : k;
    }

    private <T> in4<T> k(Class<T> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, tm4 tm4Var2, Map<tm4, List<in4>> map) {
        List<in4> list = map.get(tm4Var2);
        if (list == null) {
            return null;
        }
        for (in4<T> in4Var : list) {
            if (in4Var.c(cls, type, annotationArr, tm4Var)) {
                return in4Var;
            }
        }
        return null;
    }

    private <T> jn4<T> l(Class<T> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, Map<tm4, List<jn4>> map) {
        jn4<T> jn4Var;
        if (tm4Var != null) {
            jn4Var = m(cls, type, annotationArr, tm4Var, tm4Var, map);
            if (jn4Var == null) {
                jn4Var = m(cls, type, annotationArr, tm4Var, ct3.i(tm4Var), map);
            }
        } else {
            jn4Var = null;
        }
        return jn4Var == null ? m(cls, type, annotationArr, tm4Var, ct3.h, map) : jn4Var;
    }

    private <T> jn4<T> m(Class<T> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, tm4 tm4Var2, Map<tm4, List<jn4>> map) {
        List<jn4> list = map.get(tm4Var2);
        if (list == null) {
            return null;
        }
        for (jn4<T> jn4Var : list) {
            if (jn4Var.e(cls, type, annotationArr, tm4Var)) {
                return jn4Var;
            }
        }
        return null;
    }

    private <T> void n(Map<tm4, List<T>> map, T t, tm4 tm4Var) {
        if (!map.containsKey(tm4Var)) {
            map.put(tm4Var, new ArrayList());
        }
        map.get(tm4Var).add(t);
    }

    private <T> void o(tm4 tm4Var, Map<tm4, List<T>> map, Map<tm4, List<T>> map2) {
        List<T> list = map.get(tm4Var);
        if (list != null) {
            map2.put(tm4Var, Collections.unmodifiableList(list));
        }
    }

    private <T> void p(tm4 tm4Var, Map<tm4, List<T>> map, Map<tm4, List<T>> map2) {
        if (tm4Var.g()) {
            o(tm4Var, map, map2);
        } else if (tm4Var.f()) {
            o(tm4Var, map, map2);
            o(ct3.h, map, map2);
        } else {
            o(tm4Var, map, map2);
            o(ct3.i(tm4Var), map, map2);
            o(ct3.h, map, map2);
        }
    }

    private void r() {
        bx3<tm4> bx3Var = a;
        this.g = new cx3(bx3Var);
        cx3 cx3Var = new cx3(bx3Var);
        this.d = cx3Var;
        if (this.c) {
            s(cx3Var, this.b.n(in4.class));
            return;
        }
        s(this.g, this.b.l(in4.class));
        s(this.d, this.b.r(in4.class));
    }

    private void s(Map<tm4, List<in4>> map, Set<in4> set) {
        for (in4 in4Var : set) {
            for (tm4 tm4Var : ct3.c((tl4) in4Var.getClass().getAnnotation(tl4.class))) {
                n(map, in4Var, tm4Var);
            }
        }
        c cVar = new c(in4.class);
        for (Map.Entry<tm4, List<in4>> entry : map.entrySet()) {
            Collections.sort(entry.getValue(), cVar);
        }
    }

    private void t() {
        bx3<tm4> bx3Var = a;
        this.h = new cx3(bx3Var);
        this.i = new ArrayList();
        this.e = new cx3(bx3Var);
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        if (this.c) {
            u(this.e, arrayList, this.b.n(jn4.class));
            return;
        }
        u(this.h, this.i, this.b.l(jn4.class));
        u(this.e, this.f, this.b.r(jn4.class));
    }

    private void u(Map<tm4, List<jn4>> map, List<d> list, Set<jn4> set) {
        for (jn4 jn4Var : set) {
            List<tm4> d2 = ct3.d((jm4) jn4Var.getClass().getAnnotation(jm4.class));
            for (tm4 tm4Var : d2) {
                n(map, jn4Var, tm4Var);
            }
            list.add(new d(jn4Var, d2));
        }
        c cVar = new c(jn4.class);
        for (Map.Entry<tm4, List<jn4>> entry : map.entrySet()) {
            Collections.sort(entry.getValue(), cVar);
        }
        Collections.sort(list, new b(cVar));
    }

    private <T> String v(Map<tm4, List<T>> map) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        for (Map.Entry<tm4, List<T>> entry : map.entrySet()) {
            printWriter.append((CharSequence) entry.getKey().toString()).println(" ->");
            for (T t : entry.getValue()) {
                printWriter.append((CharSequence) g54.A).println(t.getClass().getName());
            }
        }
        printWriter.flush();
        return stringWriter.toString();
    }

    @Override // com.p7700g.p99005.zx3
    public <T> jn4<T> a(Class<T> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        jn4<T> l;
        return (this.h.isEmpty() || (l = l(cls, type, annotationArr, tm4Var, this.h)) == null) ? l(cls, type, annotationArr, tm4Var, this.e) : l;
    }

    @Override // com.p7700g.p99005.zx3
    public <T> in4<T> b(Class<T> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        in4<T> i;
        return (this.g.isEmpty() || (i = i(cls, type, annotationArr, tm4Var, this.g)) == null) ? i(cls, type, annotationArr, tm4Var, this.d) : i;
    }

    @Override // com.p7700g.p99005.zx3
    public Map<tm4, List<jn4>> c(tm4 tm4Var) {
        dx3 dx3Var = new dx3(a);
        if (!this.h.isEmpty()) {
            p(tm4Var, this.h, dx3Var);
        }
        p(tm4Var, this.e, dx3Var);
        return dx3Var;
    }

    @Override // com.p7700g.p99005.zx3
    public <T> tm4 d(Class<T> cls, Type type, Annotation[] annotationArr, List<tm4> list) {
        for (tm4 tm4Var : list) {
            for (d dVar : this.i) {
                for (tm4 tm4Var2 : dVar.b) {
                    if (tm4Var2.e(tm4Var) && dVar.a.e(cls, type, annotationArr, tm4Var)) {
                        return ct3.k(tm4Var2, tm4Var);
                    }
                }
            }
            for (d dVar2 : this.f) {
                for (tm4 tm4Var3 : dVar2.b) {
                    if (tm4Var3.e(tm4Var) && dVar2.a.e(cls, type, annotationArr, tm4Var)) {
                        return ct3.k(tm4Var3, tm4Var);
                    }
                }
            }
        }
        return null;
    }

    @Override // com.p7700g.p99005.zx3
    public <T> List<tm4> e(Class<T> cls, Type type, Annotation[] annotationArr) {
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.i) {
            if (dVar.a.e(cls, type, annotationArr, tm4.y)) {
                arrayList.addAll(dVar.b);
            }
        }
        for (d dVar2 : this.f) {
            if (dVar2.a.e(cls, type, annotationArr, tm4.y)) {
                arrayList.addAll(dVar2.b);
            }
        }
        Collections.sort(arrayList, ct3.f);
        return arrayList;
    }

    @Override // com.p7700g.p99005.zx3
    public String f(Map<tm4, List<jn4>> map) {
        return v(map);
    }

    @Override // com.p7700g.p99005.zx3
    public String g(Map<tm4, List<in4>> map) {
        return v(map);
    }

    @Override // com.p7700g.p99005.zx3
    public Map<tm4, List<in4>> h(tm4 tm4Var) {
        dx3 dx3Var = new dx3(a);
        if (!this.g.isEmpty()) {
            p(tm4Var, this.g, dx3Var);
        }
        p(tm4Var, this.d, dx3Var);
        return dx3Var;
    }

    public void q() {
        r();
        t();
    }
}