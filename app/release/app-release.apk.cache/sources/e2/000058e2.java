package com.p7700g.p99005;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.logging.Logger;

/* compiled from: EntityHolderReader.java */
/* loaded from: classes3.dex */
public final class qt3 implements in4<Object> {
    private static final Logger a = Logger.getLogger(qt3.class.getName());
    private final zx3 b;

    public qt3(@om4 zx3 zx3Var) {
        this.b = zx3Var;
    }

    @Override // com.p7700g.p99005.in4
    public Object b(Class<Object> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = !inputStream.markSupported() ? new BufferedInputStream(inputStream, ix3.d) : inputStream;
        bufferedInputStream.mark(1);
        if (bufferedInputStream.read() == -1) {
            return new cv3();
        }
        bufferedInputStream.reset();
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        boolean z = type2 instanceof Class;
        Class cls2 = z ? (Class) type2 : (Class) ((ParameterizedType) type2).getRawType();
        Class cls3 = z ? cls2 : type2;
        in4 b = this.b.b(cls2, cls3, annotationArr, tm4Var);
        if (b != null) {
            return new cv3(b.b(cls2, cls3, annotationArr, tm4Var, um4Var, bufferedInputStream));
        }
        Logger logger = a;
        logger.severe("A message body reader for the type, " + cls + ", could not be found");
        throw new lm4();
    }

    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        if (cls == cv3.class && (type instanceof ParameterizedType)) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            return (type2 instanceof Class) || (type2 instanceof ParameterizedType);
        }
        return false;
    }
}