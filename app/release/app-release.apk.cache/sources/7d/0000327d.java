package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.cw2;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.sw2;
import com.p7700g.p99005.tv2;
import com.p7700g.p99005.wo1;

/* loaded from: classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements jw2 {
    private final sw2 s;

    public JsonAdapterAnnotationTypeAdapterFactory(sw2 sw2Var) {
        this.s = sw2Var;
    }

    public TypeAdapter<?> a(sw2 sw2Var, Gson gson, lx2<?> lx2Var, lw2 lw2Var) {
        TypeAdapter<?> treeTypeAdapter;
        Object a = sw2Var.a(lx2.b(lw2Var.value())).a();
        if (a instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) a;
        } else if (a instanceof jw2) {
            treeTypeAdapter = ((jw2) a).create(gson, lx2Var);
        } else {
            boolean z = a instanceof cw2;
            if (!z && !(a instanceof tv2)) {
                StringBuilder G = wo1.G("Invalid attempt to bind an instance of ");
                G.append(a.getClass().getName());
                G.append(" as a @JsonAdapter for ");
                G.append(lx2Var.toString());
                G.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(G.toString());
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z ? (cw2) a : null, a instanceof tv2 ? (tv2) a : null, gson, lx2Var, null);
        }
        return (treeTypeAdapter == null || !lw2Var.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }

    @Override // com.p7700g.p99005.jw2
    public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
        lw2 lw2Var = (lw2) lx2Var.f().getAnnotation(lw2.class);
        if (lw2Var == null) {
            return null;
        }
        return (TypeAdapter<T>) a(this.s, gson, lx2Var, lw2Var);
    }
}