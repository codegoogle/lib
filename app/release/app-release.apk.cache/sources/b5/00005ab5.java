package com.p7700g.p99005;

import com.p7700g.p99005.du1;
import com.p7700g.p99005.rq1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteArrayLoader.java */
/* loaded from: classes2.dex */
public class rt1<Data> implements du1<byte[], Data> {
    private final b<Data> a;

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes2.dex */
    public static class a implements eu1<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: com.p7700g.p99005.rt1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0239a implements b<ByteBuffer> {
            public C0239a() {
            }

            @Override // com.p7700g.p99005.rt1.b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // com.p7700g.p99005.rt1.b
            /* renamed from: c */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<byte[], ByteBuffer> c(@x1 hu1 hu1Var) {
            return new rt1(new C0239a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes2.dex */
    public interface b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes2.dex */
    public static class c<Data> implements rq1<Data> {
        private final byte[] s;
        private final b<Data> t;

        public c(byte[] bArr, b<Data> bVar) {
            this.s = bArr;
            this.t = bVar;
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public Class<Data> a() {
            return this.t.a();
        }

        @Override // com.p7700g.p99005.rq1
        public void b() {
        }

        @Override // com.p7700g.p99005.rq1
        public void cancel() {
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public aq1 d() {
            return aq1.LOCAL;
        }

        @Override // com.p7700g.p99005.rq1
        public void e(@x1 fp1 fp1Var, @x1 rq1.a<? super Data> aVar) {
            aVar.f((Data) this.t.b(this.s));
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes2.dex */
    public static class d implements eu1<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* loaded from: classes2.dex */
        public class a implements b<InputStream> {
            public a() {
            }

            @Override // com.p7700g.p99005.rt1.b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.p7700g.p99005.rt1.b
            /* renamed from: c */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<byte[], InputStream> c(@x1 hu1 hu1Var) {
            return new rt1(new a());
        }
    }

    public rt1(b<Data> bVar) {
        this.a = bVar;
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: c */
    public du1.a<Data> b(@x1 byte[] bArr, int i, int i2, @x1 jq1 jq1Var) {
        return new du1.a<>(new k02(bArr), new c(bArr, this.a));
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: d */
    public boolean a(@x1 byte[] bArr) {
        return true;
    }
}