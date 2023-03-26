package com.p7700g.p99005;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: FileProvider.java */
@jm4({tm4.x, tm4.h})
@tl4({tm4.x, tm4.h})
/* loaded from: classes3.dex */
public final class rt3 extends av3<File> {
    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return File.class == cls;
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return File.class.isAssignableFrom(cls);
    }

    @Override // com.p7700g.p99005.av3, com.p7700g.p99005.jn4
    /* renamed from: k */
    public long d(File file, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return file.length();
    }

    @Override // com.p7700g.p99005.in4
    /* renamed from: l */
    public File b(Class<File> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        File createTempFile = File.createTempFile("rep", "tmp");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(createTempFile));
        try {
            av3.h(inputStream, bufferedOutputStream);
            return createTempFile;
        } finally {
            bufferedOutputStream.close();
        }
    }

    @Override // com.p7700g.p99005.jn4
    /* renamed from: m */
    public void a(File file, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), ix3.d);
        try {
            av3.h(bufferedInputStream, outputStream);
        } finally {
            bufferedInputStream.close();
        }
    }
}