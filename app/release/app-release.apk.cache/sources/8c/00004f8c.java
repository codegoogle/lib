package com.p7700g.p99005;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: Converter.java */
/* loaded from: classes4.dex */
public interface lz5<F, T> {

    /* compiled from: Converter.java */
    /* loaded from: classes4.dex */
    public static abstract class a {
        public static Type a(int i, ParameterizedType parameterizedType) {
            return c06.g(i, parameterizedType);
        }

        public static Class<?> b(Type type) {
            return c06.h(type);
        }

        @Nullable
        public lz5<?, ir5> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, yz5 yz5Var) {
            return null;
        }

        @Nullable
        public lz5<kr5, ?> d(Type type, Annotation[] annotationArr, yz5 yz5Var) {
            return null;
        }

        @Nullable
        public lz5<?, String> e(Type type, Annotation[] annotationArr, yz5 yz5Var) {
            return null;
        }
    }

    @Nullable
    T a(F f) throws IOException;
}