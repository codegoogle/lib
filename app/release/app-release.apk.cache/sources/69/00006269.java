package com.p7700g.p99005;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.p7700g.p99005.du1;
import com.p7700g.p99005.rq1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileLoader.java */
/* loaded from: classes2.dex */
public class vt1<Data> implements du1<File, Data> {
    private static final String a = "FileLoader";
    private final d<Data> b;

    /* compiled from: FileLoader.java */
    /* loaded from: classes2.dex */
    public static class a<Data> implements eu1<File, Data> {
        private final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // com.p7700g.p99005.eu1
        public final void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public final du1<File, Data> c(@x1 hu1 hu1Var) {
            return new vt1(this.a);
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes2.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        /* loaded from: classes2.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // com.p7700g.p99005.vt1.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.p7700g.p99005.vt1.d
            /* renamed from: d */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // com.p7700g.p99005.vt1.d
            /* renamed from: e */
            public ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes2.dex */
    public static final class c<Data> implements rq1<Data> {
        private final File s;
        private final d<Data> t;
        private Data u;

        public c(File file, d<Data> dVar) {
            this.s = file;
            this.t = dVar;
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public Class<Data> a() {
            return this.t.a();
        }

        @Override // com.p7700g.p99005.rq1
        public void b() {
            Data data = this.u;
            if (data != null) {
                try {
                    this.t.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.p7700g.p99005.rq1
        public void cancel() {
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public aq1 d() {
            return aq1.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.p7700g.p99005.rq1
        public void e(@x1 fp1 fp1Var, @x1 rq1.a<? super Data> aVar) {
            try {
                Data c = this.t.c(this.s);
                this.u = c;
                aVar.f(c);
            } catch (FileNotFoundException e) {
                Log.isLoggable(vt1.a, 3);
                aVar.c(e);
            }
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes2.dex */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes2.dex */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        /* loaded from: classes2.dex */
        public class a implements d<InputStream> {
            @Override // com.p7700g.p99005.vt1.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.p7700g.p99005.vt1.d
            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.p7700g.p99005.vt1.d
            /* renamed from: e */
            public InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public vt1(d<Data> dVar) {
        this.b = dVar;
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: c */
    public du1.a<Data> b(@x1 File file, int i, int i2, @x1 jq1 jq1Var) {
        return new du1.a<>(new k02(file), new c(file, this.b));
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: d */
    public boolean a(@x1 File file) {
        return true;
    }
}