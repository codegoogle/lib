package com.p7700g.p99005;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: StreamingOutputProvider.java */
@jm4({tm4.x, tm4.h})
/* loaded from: classes3.dex */
public final class au3 implements jn4<an4> {
    @Override // com.p7700g.p99005.jn4
    /* renamed from: b */
    public long d(an4 an4Var, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return -1L;
    }

    @Override // com.p7700g.p99005.jn4
    /* renamed from: c */
    public void a(an4 an4Var, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        an4Var.a(outputStream);
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return an4.class.isAssignableFrom(cls);
    }
}