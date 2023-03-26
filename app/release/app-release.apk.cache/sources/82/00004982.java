package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: CallAdapter.java */
/* loaded from: classes4.dex */
public interface iz5<R, T> {

    /* compiled from: CallAdapter.java */
    /* loaded from: classes4.dex */
    public static abstract class a {
        public static Type b(int i, ParameterizedType parameterizedType) {
            return c06.g(i, parameterizedType);
        }

        public static Class<?> c(Type type) {
            return c06.h(type);
        }

        @Nullable
        public abstract iz5<?, ?> a(Type type, Annotation[] annotationArr, yz5 yz5Var);
    }

    Type a();

    T b(hz5<R> hz5Var);
}