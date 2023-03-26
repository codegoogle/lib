package com.p7700g.p99005;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: InputStreamProvider.java */
@jm4({tm4.x, tm4.h})
@tl4({tm4.x, tm4.h})
/* loaded from: classes3.dex */
public final class vt3 extends av3<InputStream> {
    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return InputStream.class == cls;
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return InputStream.class.isAssignableFrom(cls);
    }

    @Override // com.p7700g.p99005.av3, com.p7700g.p99005.jn4
    /* renamed from: k */
    public long d(InputStream inputStream, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        return -1L;
    }

    @Override // com.p7700g.p99005.in4
    /* renamed from: l */
    public InputStream b(Class<InputStream> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        return inputStream;
    }

    @Override // com.p7700g.p99005.jn4
    /* renamed from: m */
    public void a(InputStream inputStream, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        try {
            av3.h(inputStream, outputStream);
        } finally {
            inputStream.close();
        }
    }
}