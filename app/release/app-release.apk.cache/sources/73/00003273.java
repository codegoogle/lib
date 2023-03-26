package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.rw2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {
    public static final jw2 a = new jw2() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.p7700g.p99005.jw2
        public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
            Type g = lx2Var.g();
            if ((g instanceof GenericArrayType) || ((g instanceof Class) && ((Class) g).isArray())) {
                Type g2 = rw2.g(g);
                return new ArrayTypeAdapter(gson, gson.p(lx2.c(g2)), rw2.k(g2));
            }
            return null;
        }
    };
    private final Class<E> b;
    private final TypeAdapter<E> c;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.c = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.b = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(nx2 nx2Var) throws IOException {
        if (nx2Var.Y() == px2.NULL) {
            nx2Var.P();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        nx2Var.a();
        while (nx2Var.q()) {
            arrayList.add(this.c.read(nx2Var));
        }
        nx2Var.h();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public void write(qx2 qx2Var, Object obj) throws IOException {
        if (obj == null) {
            qx2Var.w();
            return;
        }
        qx2Var.d();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.write(qx2Var, Array.get(obj, i));
        }
        qx2Var.h();
    }
}