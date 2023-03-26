package com.p7700g.p99005;

import com.bumptech.glide.load.ImageHeaderParser;
import com.p7700g.p99005.ip;
import com.p7700g.p99005.sq1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: Registry.java */
/* loaded from: classes2.dex */
public class hp1 {
    public static final String a = "Animation";
    @Deprecated
    public static final String b = "Animation";
    public static final String c = "Bitmap";
    public static final String d = "BitmapDrawable";
    private static final String e = "legacy_prepend_all";
    private static final String f = "legacy_append";
    private final fu1 g;
    private final ly1 h;
    private final py1 i;
    private final qy1 j;
    private final tq1 k;
    private final ix1 l;
    private final my1 m;
    private final oy1 n = new oy1();
    private final ny1 o = new ny1();
    private final ip.a<List<Throwable>> p;

    /* compiled from: Registry.java */
    /* loaded from: classes2.dex */
    public static class a extends RuntimeException {
        public a(@x1 String str) {
            super(str);
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: classes2.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: classes2.dex */
    public static class c extends a {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(@x1 Object obj) {
            super(r0.toString());
            StringBuilder G = wo1.G("Failed to find any ModelLoaders registered for model class: ");
            G.append(obj.getClass());
        }

        public <M> c(@x1 M m, @x1 List<du1<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public c(@x1 Class<?> cls, @x1 Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: classes2.dex */
    public static class d extends a {
        public d(@x1 Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: classes2.dex */
    public static class e extends a {
        public e(@x1 Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public hp1() {
        ip.a<List<Throwable>> f2 = b12.f();
        this.p = f2;
        this.g = new fu1(f2);
        this.h = new ly1();
        this.i = new py1();
        this.j = new qy1();
        this.k = new tq1();
        this.l = new ix1();
        this.m = new my1();
        z(Arrays.asList("Animation", c, d));
    }

    @x1
    private <Data, TResource, Transcode> List<pr1<Data, TResource, Transcode>> f(@x1 Class<Data> cls, @x1 Class<TResource> cls2, @x1 Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.i.d(cls, cls2)) {
            for (Class cls5 : this.l.b(cls4, cls3)) {
                arrayList.add(new pr1(cls, cls4, cls5, this.i.b(cls, cls4), this.l.a(cls4, cls5), this.p));
            }
        }
        return arrayList;
    }

    @x1
    public <Data> hp1 a(@x1 Class<Data> cls, @x1 dq1<Data> dq1Var) {
        this.h.a(cls, dq1Var);
        return this;
    }

    @x1
    public <TResource> hp1 b(@x1 Class<TResource> cls, @x1 mq1<TResource> mq1Var) {
        this.j.a(cls, mq1Var);
        return this;
    }

    @x1
    public <Data, TResource> hp1 c(@x1 Class<Data> cls, @x1 Class<TResource> cls2, @x1 lq1<Data, TResource> lq1Var) {
        e(f, cls, cls2, lq1Var);
        return this;
    }

    @x1
    public <Model, Data> hp1 d(@x1 Class<Model> cls, @x1 Class<Data> cls2, @x1 eu1<Model, Data> eu1Var) {
        this.g.a(cls, cls2, eu1Var);
        return this;
    }

    @x1
    public <Data, TResource> hp1 e(@x1 String str, @x1 Class<Data> cls, @x1 Class<TResource> cls2, @x1 lq1<Data, TResource> lq1Var) {
        this.i.a(str, lq1Var, cls, cls2);
        return this;
    }

    @x1
    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b2 = this.m.b();
        if (b2.isEmpty()) {
            throw new b();
        }
        return b2;
    }

    @z1
    public <Data, TResource, Transcode> as1<Data, TResource, Transcode> h(@x1 Class<Data> cls, @x1 Class<TResource> cls2, @x1 Class<Transcode> cls3) {
        as1<Data, TResource, Transcode> a2 = this.o.a(cls, cls2, cls3);
        if (this.o.c(a2)) {
            return null;
        }
        if (a2 == null) {
            List<pr1<Data, TResource, Transcode>> f2 = f(cls, cls2, cls3);
            a2 = f2.isEmpty() ? null : new as1<>(cls, cls2, cls3, f2, this.p);
            this.o.d(cls, cls2, cls3, a2);
        }
        return a2;
    }

    @x1
    public <Model> List<du1<Model, ?>> i(@x1 Model model) {
        return this.g.e(model);
    }

    @x1
    public <Model, TResource, Transcode> List<Class<?>> j(@x1 Class<Model> cls, @x1 Class<TResource> cls2, @x1 Class<Transcode> cls3) {
        List<Class<?>> b2 = this.n.b(cls, cls2, cls3);
        ArrayList arrayList = b2;
        if (b2 == null) {
            ArrayList arrayList2 = new ArrayList();
            for (Class<?> cls4 : this.g.d(cls)) {
                for (Class cls5 : this.i.d(cls4, cls2)) {
                    if (!this.l.b(cls5, cls3).isEmpty() && !arrayList2.contains(cls5)) {
                        arrayList2.add(cls5);
                    }
                }
            }
            this.n.c(cls, cls2, cls3, Collections.unmodifiableList(arrayList2));
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @x1
    public <X> mq1<X> k(@x1 cs1<X> cs1Var) throws d {
        mq1<X> b2 = this.j.b(cs1Var.d());
        if (b2 != null) {
            return b2;
        }
        throw new d(cs1Var.d());
    }

    @x1
    public <X> sq1<X> l(@x1 X x) {
        return this.k.a(x);
    }

    @x1
    public <X> dq1<X> m(@x1 X x) throws e {
        dq1<X> b2 = this.h.b(x.getClass());
        if (b2 != null) {
            return b2;
        }
        throw new e(x.getClass());
    }

    public boolean n(@x1 cs1<?> cs1Var) {
        return this.j.b(cs1Var.d()) != null;
    }

    @x1
    public <Data> hp1 o(@x1 Class<Data> cls, @x1 dq1<Data> dq1Var) {
        this.h.c(cls, dq1Var);
        return this;
    }

    @x1
    public <TResource> hp1 p(@x1 Class<TResource> cls, @x1 mq1<TResource> mq1Var) {
        this.j.c(cls, mq1Var);
        return this;
    }

    @x1
    public <Data, TResource> hp1 q(@x1 Class<Data> cls, @x1 Class<TResource> cls2, @x1 lq1<Data, TResource> lq1Var) {
        s(e, cls, cls2, lq1Var);
        return this;
    }

    @x1
    public <Model, Data> hp1 r(@x1 Class<Model> cls, @x1 Class<Data> cls2, @x1 eu1<Model, Data> eu1Var) {
        this.g.g(cls, cls2, eu1Var);
        return this;
    }

    @x1
    public <Data, TResource> hp1 s(@x1 String str, @x1 Class<Data> cls, @x1 Class<TResource> cls2, @x1 lq1<Data, TResource> lq1Var) {
        this.i.e(str, lq1Var, cls, cls2);
        return this;
    }

    @x1
    public hp1 t(@x1 ImageHeaderParser imageHeaderParser) {
        this.m.a(imageHeaderParser);
        return this;
    }

    @x1
    public hp1 u(@x1 sq1.a<?> aVar) {
        this.k.b(aVar);
        return this;
    }

    @x1
    @Deprecated
    public <Data> hp1 v(@x1 Class<Data> cls, @x1 dq1<Data> dq1Var) {
        return a(cls, dq1Var);
    }

    @x1
    @Deprecated
    public <TResource> hp1 w(@x1 Class<TResource> cls, @x1 mq1<TResource> mq1Var) {
        return b(cls, mq1Var);
    }

    @x1
    public <TResource, Transcode> hp1 x(@x1 Class<TResource> cls, @x1 Class<Transcode> cls2, @x1 hx1<TResource, Transcode> hx1Var) {
        this.l.c(cls, cls2, hx1Var);
        return this;
    }

    @x1
    public <Model, Data> hp1 y(@x1 Class<Model> cls, @x1 Class<Data> cls2, @x1 eu1<? extends Model, ? extends Data> eu1Var) {
        this.g.i(cls, cls2, eu1Var);
        return this;
    }

    @x1
    public final hp1 z(@x1 List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(e);
        for (String str : list) {
            arrayList.add(str);
        }
        arrayList.add(f);
        this.i.f(arrayList);
        return this;
    }
}