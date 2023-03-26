package com.p7700g.p99005;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* compiled from: GsonResponseBodyConverter.java */
/* loaded from: classes4.dex */
public final class f06<T> implements lz5<kr5, T> {
    private final Gson a;
    private final TypeAdapter<T> b;

    public f06(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // com.p7700g.p99005.lz5
    /* renamed from: b */
    public T a(kr5 kr5Var) throws IOException {
        nx2 v = this.a.v(kr5Var.e());
        try {
            T read = this.b.read(v);
            if (v.Y() == px2.END_DOCUMENT) {
                return read;
            }
            throw new vv2("JSON document was not fully consumed.");
        } finally {
            kr5Var.close();
        }
    }
}