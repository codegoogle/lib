package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* compiled from: MessageBodyWorkers.java */
/* loaded from: classes3.dex */
public interface zx3 {
    <T> jn4<T> a(Class<T> cls, Type type, Annotation[] annotationArr, tm4 tm4Var);

    <T> in4<T> b(Class<T> cls, Type type, Annotation[] annotationArr, tm4 tm4Var);

    Map<tm4, List<jn4>> c(tm4 tm4Var);

    <T> tm4 d(Class<T> cls, Type type, Annotation[] annotationArr, List<tm4> list);

    <T> List<tm4> e(Class<T> cls, Type type, Annotation[] annotationArr);

    String f(Map<tm4, List<jn4>> map);

    String g(Map<tm4, List<in4>> map);

    Map<tm4, List<in4>> h(tm4 tm4Var);
}