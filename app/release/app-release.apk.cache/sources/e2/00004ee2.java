package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: Providers.java */
/* loaded from: classes3.dex */
public interface ln4 {
    <T> jn4<T> a(Class<T> cls, Type type, Annotation[] annotationArr, tm4 tm4Var);

    <T> in4<T> b(Class<T> cls, Type type, Annotation[] annotationArr, tm4 tm4Var);

    <T> fn4<T> c(Class<T> cls, tm4 tm4Var);

    <T extends Throwable> gn4<T> d(Class<T> cls);
}