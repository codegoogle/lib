package com.p7700g.p99005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: ReaderProvider.java */
@jm4({"text/plain", tm4.h})
@tl4({"text/plain", tm4.h})
/* loaded from: classes3.dex */
public final class xt3 extends av3<Reader> {
    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return Reader.class == cls;
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return Reader.class.isAssignableFrom(cls);
    }

    @Override // com.p7700g.p99005.in4
    /* renamed from: k */
    public Reader b(Class<Reader> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        return new BufferedReader(new InputStreamReader(inputStream, av3.f(tm4Var)));
    }

    @Override // com.p7700g.p99005.jn4
    /* renamed from: l */
    public void a(Reader reader, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, av3.f(tm4Var));
            av3.i(reader, outputStreamWriter);
            outputStreamWriter.flush();
        } finally {
            reader.close();
        }
    }
}