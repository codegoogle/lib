package com.p7700g.p99005;

import com.squareup.moshi.Moshi;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qa3<T> {
    @NotNull
    private final Moshi a;
    @NotNull
    private final String b;

    public qa3(T t, @NotNull Type type) {
        c25.p(type, "type");
        Moshi a = rz2.a.a(new Object[0]);
        this.a = a;
        String json = a.adapter(type).toJson(t);
        c25.o(json, "mMoshi.adapter<T>(type).toJson(obj)");
        this.b = json;
    }

    @NotNull
    public final byte[] a() {
        String str = this.b;
        Charset charset = f85.b;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        c25.o(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}