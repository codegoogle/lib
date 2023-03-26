package com.p7700g.p99005;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: MessageBodyReader.java */
/* loaded from: classes3.dex */
public interface in4<T> {
    T b(Class<T> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException, lm4;

    boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var);
}