package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.List;

/* compiled from: TranscoderRegistry.java */
/* loaded from: classes2.dex */
public class ix1 {
    private final List<a<?, ?>> a = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    /* loaded from: classes2.dex */
    public static final class a<Z, R> {
        public final Class<Z> a;
        public final Class<R> b;
        public final hx1<Z, R> c;

        public a(@x1 Class<Z> cls, @x1 Class<R> cls2, @x1 hx1<Z, R> hx1Var) {
            this.a = cls;
            this.b = cls2;
            this.c = hx1Var;
        }

        public boolean a(@x1 Class<?> cls, @x1 Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    @x1
    public synchronized <Z, R> hx1<Z, R> a(@x1 Class<Z> cls, @x1 Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return jx1.b();
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2)) {
                return (hx1<Z, R>) aVar.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @x1
    public synchronized <Z, R> List<Class<R>> b(@x1 Class<Z> cls, @x1 Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(@x1 Class<Z> cls, @x1 Class<R> cls2, @x1 hx1<Z, R> hx1Var) {
        this.a.add(new a<>(cls, cls2, hx1Var));
    }
}