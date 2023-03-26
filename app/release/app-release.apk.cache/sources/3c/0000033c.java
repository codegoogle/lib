package com.anchorfree.sdk.fireshield;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.aw2;
import com.p7700g.p99005.cx2;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.uv2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xv2;
import com.p7700g.p99005.yv2;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class RuntimeTypeAdapterFactory<T> implements jw2 {
    private final Class<?> baseType;
    private final boolean maintainType;
    private final String typeFieldName;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();

    private RuntimeTypeAdapterFactory(Class<?> cls, String str, boolean z) {
        if (str != null && cls != null) {
            this.baseType = cls;
            this.typeFieldName = str;
            this.maintainType = z;
            return;
        }
        throw null;
    }

    @x1
    public static <T> RuntimeTypeAdapterFactory<T> of(@x1 Class<T> cls, @x1 String str, boolean z) {
        return new RuntimeTypeAdapterFactory<>(cls, str, z);
    }

    @Override // com.p7700g.p99005.jw2
    @z1
    public <R> TypeAdapter<R> create(@x1 Gson gson, @x1 lx2<R> lx2Var) {
        if (lx2Var.f() != this.baseType) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            TypeAdapter<T> r = gson.r(this, lx2.b(entry.getValue()));
            linkedHashMap.put(entry.getKey(), r);
            linkedHashMap2.put(entry.getValue(), r);
        }
        return new TypeAdapter<R>() { // from class: com.anchorfree.sdk.fireshield.RuntimeTypeAdapterFactory.1
            /* JADX WARN: Type inference failed for: r4v4, types: [R, java.lang.Object] */
            @Override // com.google.gson.TypeAdapter
            public R read(nx2 nx2Var) {
                uv2 a = cx2.a(nx2Var);
                uv2 N = RuntimeTypeAdapterFactory.this.maintainType ? a.o().N(RuntimeTypeAdapterFactory.this.typeFieldName) : a.o().T(RuntimeTypeAdapterFactory.this.typeFieldName);
                if (N == null) {
                    StringBuilder G = wo1.G("cannot deserialize ");
                    G.append(RuntimeTypeAdapterFactory.this.baseType);
                    G.append(" because it does not define a field named ");
                    G.append(RuntimeTypeAdapterFactory.this.typeFieldName);
                    throw new yv2(G.toString());
                }
                String y = N.y();
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap.get(y);
                if (typeAdapter == null) {
                    StringBuilder G2 = wo1.G("cannot deserialize ");
                    G2.append(RuntimeTypeAdapterFactory.this.baseType);
                    G2.append(" subtype named ");
                    G2.append(y);
                    G2.append("; did you forget to register a subtype?");
                    throw new yv2(G2.toString());
                }
                return typeAdapter.fromJsonTree(a);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(qx2 qx2Var, R r2) throws IOException {
                Class<?> cls = r2.getClass();
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls);
                if (typeAdapter != null) {
                    xv2 o = typeAdapter.toJsonTree(r2).o();
                    if (RuntimeTypeAdapterFactory.this.maintainType) {
                        cx2.b(o, qx2Var);
                        return;
                    }
                    xv2 xv2Var = new xv2();
                    if (!o.R(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                        xv2Var.E(RuntimeTypeAdapterFactory.this.typeFieldName, new aw2((String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls)));
                        for (Map.Entry<String, uv2> entry2 : o.M()) {
                            xv2Var.E(entry2.getKey(), entry2.getValue());
                        }
                        cx2.b(xv2Var, qx2Var);
                        return;
                    }
                    StringBuilder G = wo1.G("cannot serialize ");
                    G.append(cls.getName());
                    G.append(" because it already defines a field named ");
                    G.append(RuntimeTypeAdapterFactory.this.typeFieldName);
                    throw new yv2(G.toString());
                }
                StringBuilder G2 = wo1.G("cannot serialize ");
                G2.append(cls.getName());
                G2.append("; did you forget to register a subtype?");
                throw new yv2(G2.toString());
            }
        }.nullSafe();
    }

    @x1
    public RuntimeTypeAdapterFactory<T> registerSubtype(@z1 Class<? extends T> cls, @z1 String str) {
        if (cls != null && str != null) {
            if (!this.subtypeToLabel.containsKey(cls) && !this.labelToSubtype.containsKey(str)) {
                this.labelToSubtype.put(str, cls);
                this.subtypeToLabel.put(cls, str);
                return this;
            }
            throw new IllegalArgumentException("types and labels must be unique");
        }
        throw null;
    }

    @x1
    public static <T> RuntimeTypeAdapterFactory<T> of(@x1 Class<T> cls, @x1 String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str, false);
    }

    @x1
    public static <T> RuntimeTypeAdapterFactory<T> of(@x1 Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type", false);
    }

    @x1
    public RuntimeTypeAdapterFactory<T> registerSubtype(@x1 Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}