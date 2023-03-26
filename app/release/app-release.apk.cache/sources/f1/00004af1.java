package com.p7700g.p99005;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: MessageBodyWriter.java */
/* loaded from: classes3.dex */
public interface jn4<T> {
    void a(T t, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException, lm4;

    long d(T t, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var);

    boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var);
}