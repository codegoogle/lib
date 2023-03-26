package com.p7700g.p99005;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.activation.DataSource;

/* compiled from: DataSourceProvider.java */
@jm4({tm4.x, tm4.h})
@tl4({tm4.x, tm4.h})
/* loaded from: classes3.dex */
public class ot3 extends av3<DataSource> {

    /* compiled from: DataSourceProvider.java */
    /* loaded from: classes3.dex */
    public static class a implements DataSource {
        private byte[] a;
        private int b;
        private String c;
        private String d = "";

        /* compiled from: DataSourceProvider.java */
        /* renamed from: com.p7700g.p99005.ot3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0224a extends ByteArrayOutputStream {
            public byte[] a() {
                return ((ByteArrayOutputStream) this).buf;
            }

            public int getCount() {
                return ((ByteArrayOutputStream) this).count;
            }
        }

        public a(InputStream inputStream, String str) throws IOException {
            this.b = -1;
            C0224a c0224a = new C0224a();
            ix3.e(inputStream, c0224a);
            this.a = c0224a.a();
            int count = c0224a.getCount();
            this.b = count;
            if (this.a.length - count > 262144) {
                byte[] byteArray = c0224a.toByteArray();
                this.a = byteArray;
                this.b = byteArray.length;
            }
            this.c = str;
        }

        public String a() {
            return this.c;
        }

        public InputStream b() throws IOException {
            byte[] bArr = this.a;
            if (bArr != null) {
                if (this.b < 0) {
                    this.b = bArr.length;
                }
                return new ByteArrayInputStream(this.a, 0, this.b);
            }
            throw new IOException("no data");
        }

        public String c() {
            return this.d;
        }

        public OutputStream d() throws IOException {
            throw new IOException("cannot do this");
        }

        public void e(String str) {
            this.d = str;
        }
    }

    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return DataSource.class == cls;
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return DataSource.class.isAssignableFrom(cls);
    }

    @Override // com.p7700g.p99005.in4
    /* renamed from: k */
    public DataSource b(Class<DataSource> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        return new a(inputStream, tm4Var == null ? null : tm4Var.toString());
    }

    @Override // com.p7700g.p99005.jn4
    /* renamed from: l */
    public void a(DataSource dataSource, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        InputStream inputStream = dataSource.getInputStream();
        try {
            av3.h(inputStream, outputStream);
        } finally {
            inputStream.close();
        }
    }
}