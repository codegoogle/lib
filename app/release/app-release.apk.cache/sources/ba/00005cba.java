package com.p7700g.p99005;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: FormMultivaluedMapProvider.java */
@jm4({"application/x-www-form-urlencoded"})
@tl4({"application/x-www-form-urlencoded"})
/* loaded from: classes3.dex */
public final class st3 extends mt3<um4<String, String>> {
    private final Type b = ((ParameterizedType) st3.class.getGenericSuperclass()).getActualTypeArguments()[0];

    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return cls == um4.class && (cls == type || this.b.equals(type));
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return um4.class.isAssignableFrom(cls);
    }

    @Override // com.p7700g.p99005.in4
    /* renamed from: m */
    public um4<String, String> b(Class<um4<String, String>> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        return k(new fx3(), tm4Var, inputStream);
    }

    @Override // com.p7700g.p99005.jn4
    /* renamed from: n */
    public void a(um4<String, String> um4Var, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var2, OutputStream outputStream) throws IOException {
        l(um4Var, tm4Var, outputStream);
    }
}