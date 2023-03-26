package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.rw2;
import com.p7700g.p99005.sw2;
import com.p7700g.p99005.yw2;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class CollectionTypeAdapterFactory implements jw2 {
    private final sw2 s;

    /* loaded from: classes3.dex */
    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        private final TypeAdapter<E> a;
        private final yw2<? extends Collection<E>> b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, yw2<? extends Collection<E>> yw2Var) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.b = yw2Var;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Collection<E> read(nx2 nx2Var) throws IOException {
            if (nx2Var.Y() == px2.NULL) {
                nx2Var.P();
                return null;
            }
            Collection<E> a = this.b.a();
            nx2Var.a();
            while (nx2Var.q()) {
                a.add(this.a.read(nx2Var));
            }
            nx2Var.h();
            return a;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(qx2 qx2Var, Collection<E> collection) throws IOException {
            if (collection == null) {
                qx2Var.w();
                return;
            }
            qx2Var.d();
            for (E e : collection) {
                this.a.write(qx2Var, e);
            }
            qx2Var.h();
        }
    }

    public CollectionTypeAdapterFactory(sw2 sw2Var) {
        this.s = sw2Var;
    }

    @Override // com.p7700g.p99005.jw2
    public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
        Type g = lx2Var.g();
        Class<? super T> f = lx2Var.f();
        if (Collection.class.isAssignableFrom(f)) {
            Type h = rw2.h(g, f);
            return new Adapter(gson, h, gson.p(lx2.c(h)), this.s.a(lx2Var));
        }
        return null;
    }
}