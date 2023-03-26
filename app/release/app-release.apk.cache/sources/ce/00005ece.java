package com.p7700g.p99005;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: FormProvider.java */
@jm4({"application/x-www-form-urlencoded", tm4.h})
@tl4({"application/x-www-form-urlencoded", tm4.h})
/* loaded from: classes3.dex */
public final class tt3 extends mt3<ks3> {
    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return cls == ks3.class;
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return cls == ks3.class;
    }

    @Override // com.p7700g.p99005.in4
    /* renamed from: m */
    public ks3 b(Class<ks3> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        return k(new ks3(), tm4Var, inputStream);
    }

    @Override // com.p7700g.p99005.jn4
    /* renamed from: n */
    public void a(ks3 ks3Var, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        l(ks3Var, tm4Var, outputStream);
    }
}