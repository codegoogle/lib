package com.p7700g.p99005;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

/* compiled from: AbstractMessageReaderWriterProvider.java */
/* loaded from: classes3.dex */
public abstract class av3<T> implements in4<T>, jn4<T> {
    public static final Charset a = ix3.a;

    public static final Charset f(tm4 tm4Var) {
        return ix3.b(tm4Var);
    }

    public static final String g(InputStream inputStream, tm4 tm4Var) throws IOException {
        return ix3.c(inputStream, tm4Var);
    }

    public static final void h(InputStream inputStream, OutputStream outputStream) throws IOException {
        ix3.e(inputStream, outputStream);
    }

    public static final void i(Reader reader, Writer writer) throws IOException {
        ix3.f(reader, writer);
    }

    public static final void j(String str, OutputStream outputStream, tm4 tm4Var) throws IOException {
        ix3.g(str, outputStream, tm4Var);
    }

    @Override // com.p7700g.p99005.jn4
    public long d(T t, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return -1L;
    }
}