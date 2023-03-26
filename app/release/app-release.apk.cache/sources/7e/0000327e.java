package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.aw2;
import com.p7700g.p99005.cx2;
import com.p7700g.p99005.ew2;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.pg1;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.rw2;
import com.p7700g.p99005.sw2;
import com.p7700g.p99005.uv2;
import com.p7700g.p99005.vw2;
import com.p7700g.p99005.yw2;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements jw2 {
    private final sw2 s;
    public final boolean t;

    /* loaded from: classes3.dex */
    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {
        private final TypeAdapter<K> a;
        private final TypeAdapter<V> b;
        private final yw2<? extends Map<K, V>> c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, yw2<? extends Map<K, V>> yw2Var) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.c = yw2Var;
        }

        private String a(uv2 uv2Var) {
            if (uv2Var.D()) {
                aw2 p = uv2Var.p();
                if (p.I()) {
                    return String.valueOf(p.u());
                }
                if (p.G()) {
                    return Boolean.toString(p.d());
                }
                if (p.J()) {
                    return p.y();
                }
                throw new AssertionError();
            } else if (uv2Var.B()) {
                return pg1.d;
            } else {
                throw new AssertionError();
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public Map<K, V> read(nx2 nx2Var) throws IOException {
            px2 Y = nx2Var.Y();
            if (Y == px2.NULL) {
                nx2Var.P();
                return null;
            }
            Map<K, V> a = this.c.a();
            if (Y == px2.BEGIN_ARRAY) {
                nx2Var.a();
                while (nx2Var.q()) {
                    nx2Var.a();
                    K read = this.a.read(nx2Var);
                    if (a.put(read, this.b.read(nx2Var)) == null) {
                        nx2Var.h();
                    } else {
                        throw new ew2("duplicate key: " + read);
                    }
                }
                nx2Var.h();
            } else {
                nx2Var.b();
                while (nx2Var.q()) {
                    vw2.a.a(nx2Var);
                    K read2 = this.a.read(nx2Var);
                    if (a.put(read2, this.b.read(nx2Var)) != null) {
                        throw new ew2("duplicate key: " + read2);
                    }
                }
                nx2Var.j();
            }
            return a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void write(qx2 qx2Var, Map<K, V> map) throws IOException {
            if (map == null) {
                qx2Var.w();
            } else if (!MapTypeAdapterFactory.this.t) {
                qx2Var.e();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    qx2Var.s(String.valueOf(entry.getKey()));
                    this.b.write(qx2Var, entry.getValue());
                }
                qx2Var.j();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    uv2 jsonTree = this.a.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    z |= jsonTree.A() || jsonTree.C();
                }
                if (z) {
                    qx2Var.d();
                    int size = arrayList.size();
                    while (i < size) {
                        qx2Var.d();
                        cx2.b((uv2) arrayList.get(i), qx2Var);
                        this.b.write(qx2Var, arrayList2.get(i));
                        qx2Var.h();
                        i++;
                    }
                    qx2Var.h();
                    return;
                }
                qx2Var.e();
                int size2 = arrayList.size();
                while (i < size2) {
                    qx2Var.s(a((uv2) arrayList.get(i)));
                    this.b.write(qx2Var, arrayList2.get(i));
                    i++;
                }
                qx2Var.j();
            }
        }
    }

    public MapTypeAdapterFactory(sw2 sw2Var, boolean z) {
        this.s = sw2Var;
        this.t = z;
    }

    private TypeAdapter<?> a(Gson gson, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return gson.p(lx2.c(type));
        }
        return TypeAdapters.f;
    }

    @Override // com.p7700g.p99005.jw2
    public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
        Type g = lx2Var.g();
        Class<? super T> f = lx2Var.f();
        if (Map.class.isAssignableFrom(f)) {
            Type[] j = rw2.j(g, f);
            return new Adapter(gson, j[0], a(gson, j[0]), j[1], gson.p(lx2.c(j[1])), this.s.a(lx2Var));
        }
        return null;
    }
}