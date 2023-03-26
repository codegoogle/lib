package com.p7700g.p99005;

import com.google.gson.Gson;
import com.p7700g.p99005.lz5;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: GsonConverterFactory.java */
/* loaded from: classes4.dex */
public final class d06 extends lz5.a {
    private final Gson a;

    private d06(Gson gson) {
        this.a = gson;
    }

    public static d06 f() {
        return g(new Gson());
    }

    public static d06 g(Gson gson) {
        Objects.requireNonNull(gson, "gson == null");
        return new d06(gson);
    }

    @Override // com.p7700g.p99005.lz5.a
    public lz5<?, ir5> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, yz5 yz5Var) {
        return new e06(this.a, this.a.p(lx2.c(type)));
    }

    @Override // com.p7700g.p99005.lz5.a
    public lz5<kr5, ?> d(Type type, Annotation[] annotationArr, yz5 yz5Var) {
        return new f06(this.a, this.a.p(lx2.c(type)));
    }
}