package com.p7700g.p99005;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: ByteArrayProvider.java */
@jm4({tm4.x, tm4.h})
@tl4({tm4.x, tm4.h})
/* loaded from: classes3.dex */
public final class nt3 extends av3<byte[]> {
    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return cls == byte[].class;
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return cls == byte[].class;
    }

    @Override // com.p7700g.p99005.av3, com.p7700g.p99005.jn4
    /* renamed from: k */
    public long d(byte[] bArr, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return bArr.length;
    }

    @Override // com.p7700g.p99005.in4
    /* renamed from: l */
    public byte[] b(Class<byte[]> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        av3.h(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean m(Class cls) {
        return cls == byte[].class;
    }

    @Override // com.p7700g.p99005.jn4
    /* renamed from: n */
    public void a(byte[] bArr, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        outputStream.write(bArr);
    }
}