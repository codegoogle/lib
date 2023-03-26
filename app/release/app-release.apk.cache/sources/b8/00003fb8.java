package com.p7700g.p99005;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* compiled from: GsonRequestBodyConverter.java */
/* loaded from: classes4.dex */
public final class e06<T> implements lz5<T, ir5> {
    private static final br5 a = br5.h("application/json; charset=UTF-8");
    private static final Charset b = Charset.forName("UTF-8");
    private final Gson c;
    private final TypeAdapter<T> d;

    public e06(Gson gson, TypeAdapter<T> typeAdapter) {
        this.c = gson;
        this.d = typeAdapter;
    }

    @Override // com.p7700g.p99005.lz5
    /* renamed from: b */
    public ir5 a(T t) throws IOException {
        sv5 sv5Var = new sv5();
        qx2 w = this.c.w(new OutputStreamWriter(sv5Var.S1(), b));
        this.d.write(w, t);
        w.close();
        return ir5.g(a, sv5Var.f1());
    }
}