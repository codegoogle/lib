package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: classes2.dex */
public class py1 {
    private final List<String> a = new ArrayList();
    private final Map<String, List<a<?, ?>>> b = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    /* loaded from: classes2.dex */
    public static class a<T, R> {
        private final Class<T> a;
        public final Class<R> b;
        public final lq1<T, R> c;

        public a(@x1 Class<T> cls, @x1 Class<R> cls2, lq1<T, R> lq1Var) {
            this.a = cls;
            this.b = cls2;
            this.c = lq1Var;
        }

        public boolean a(@x1 Class<?> cls, @x1 Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    @x1
    private synchronized List<a<?, ?>> c(@x1 String str) {
        List<a<?, ?>> list;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        list = this.b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> void a(@x1 String str, @x1 lq1<T, R> lq1Var, @x1 Class<T> cls, @x1 Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, lq1Var));
    }

    @x1
    public synchronized <T, R> List<lq1<T, R>> b(@x1 Class<T> cls, @x1 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a<?, ?>> list = this.b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.c);
                    }
                }
            }
        }
        return arrayList;
    }

    @x1
    public synchronized <T, R> List<Class<R>> d(@x1 Class<T> cls, @x1 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a<?, ?>> list = this.b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void e(@x1 String str, @x1 lq1<T, R> lq1Var, @x1 Class<T> cls, @x1 Class<R> cls2) {
        c(str).add(0, new a<>(cls, cls2, lq1Var));
    }

    public synchronized void f(@x1 List<String> list) {
        ArrayList arrayList = new ArrayList(this.a);
        this.a.clear();
        for (String str : list) {
            this.a.add(str);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!list.contains(str2)) {
                this.a.add(str2);
            }
        }
    }
}