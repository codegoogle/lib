package com.p7700g.p99005;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: StringProvider.java */
@jm4({"text/plain", tm4.h})
@tl4({"text/plain", tm4.h})
/* loaded from: classes3.dex */
public final class bu3 extends av3<String> {
    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return cls == String.class;
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return cls == String.class;
    }

    @Override // com.p7700g.p99005.in4
    /* renamed from: k */
    public String b(Class<String> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        return av3.g(inputStream, tm4Var);
    }

    @Override // com.p7700g.p99005.jn4
    /* renamed from: l */
    public void a(String str, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        av3.j(str, outputStream, tm4Var);
    }
}