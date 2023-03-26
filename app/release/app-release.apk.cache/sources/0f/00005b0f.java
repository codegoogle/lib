package com.p7700g.p99005;

/* compiled from: GlideSuppliers.java */
/* loaded from: classes2.dex */
public final class s02 {

    /* compiled from: GlideSuppliers.java */
    /* loaded from: classes2.dex */
    public class a implements b<T> {
        private volatile T a;
        public final /* synthetic */ b b;

        public a(b bVar) {
            this.b = bVar;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        @Override // com.p7700g.p99005.s02.b
        public T get() {
            if (this.a == 0) {
                synchronized (this) {
                    if (this.a == 0) {
                        this.a = x02.d(this.b.get());
                    }
                }
            }
            return this.a;
        }
    }

    /* compiled from: GlideSuppliers.java */
    /* loaded from: classes2.dex */
    public interface b<T> {
        T get();
    }

    private s02() {
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}