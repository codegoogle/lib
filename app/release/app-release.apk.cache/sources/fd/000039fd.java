package com.p7700g.p99005;

import android.util.Log;
import com.p7700g.p99005.ip;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FactoryPools.java */
/* loaded from: classes2.dex */
public final class b12 {
    private static final String a = "FactoryPools";
    private static final int b = 20;
    private static final g<Object> c = new a();

    /* compiled from: FactoryPools.java */
    /* loaded from: classes2.dex */
    public class a implements g<Object> {
        @Override // com.p7700g.p99005.b12.g
        public void a(@x1 Object obj) {
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes2.dex */
    public class b implements d<List<T>> {
        @Override // com.p7700g.p99005.b12.d
        @x1
        /* renamed from: a */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes2.dex */
    public class c implements g<List<T>> {
        @Override // com.p7700g.p99005.b12.g
        /* renamed from: b */
        public void a(@x1 List<T> list) {
            list.clear();
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes2.dex */
    public interface d<T> {
        T create();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes2.dex */
    public static final class e<T> implements ip.a<T> {
        private final d<T> a;
        private final g<T> b;
        private final ip.a<T> c;

        public e(@x1 ip.a<T> aVar, @x1 d<T> dVar, @x1 g<T> gVar) {
            this.c = aVar;
            this.a = dVar;
            this.b = gVar;
        }

        @Override // com.p7700g.p99005.ip.a
        public boolean a(@x1 T t) {
            if (t instanceof f) {
                ((f) t).b().b(true);
            }
            this.b.a(t);
            return this.c.a(t);
        }

        @Override // com.p7700g.p99005.ip.a
        public T b() {
            T b = this.c.b();
            if (b == null) {
                b = this.a.create();
                if (Log.isLoggable(b12.a, 2)) {
                    StringBuilder G = wo1.G("Created new ");
                    G.append(b.getClass());
                    G.toString();
                }
            }
            if (b instanceof f) {
                ((f) b).b().b(false);
            }
            return b;
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes2.dex */
    public interface f {
        @x1
        d12 b();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes2.dex */
    public interface g<T> {
        void a(@x1 T t);
    }

    private b12() {
    }

    @x1
    private static <T extends f> ip.a<T> a(@x1 ip.a<T> aVar, @x1 d<T> dVar) {
        return b(aVar, dVar, c());
    }

    @x1
    private static <T> ip.a<T> b(@x1 ip.a<T> aVar, @x1 d<T> dVar, @x1 g<T> gVar) {
        return new e(aVar, dVar, gVar);
    }

    @x1
    private static <T> g<T> c() {
        return (g<T>) c;
    }

    @x1
    public static <T extends f> ip.a<T> d(int i, @x1 d<T> dVar) {
        return a(new ip.b(i), dVar);
    }

    @x1
    public static <T extends f> ip.a<T> e(int i, @x1 d<T> dVar) {
        return a(new ip.c(i), dVar);
    }

    @x1
    public static <T> ip.a<List<T>> f() {
        return g(20);
    }

    @x1
    public static <T> ip.a<List<T>> g(int i) {
        return b(new ip.c(i), new b(), new c());
    }
}