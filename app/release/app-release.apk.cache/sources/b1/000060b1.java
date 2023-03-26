package com.p7700g.p99005;

import android.util.Base64;
import com.p7700g.p99005.du1;
import com.p7700g.p99005.rq1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataUrlLoader.java */
/* loaded from: classes2.dex */
public final class ut1<Model, Data> implements du1<Model, Data> {
    private static final String a = "data:image";
    private static final String b = ";base64";
    private final a<Data> c;

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes2.dex */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes2.dex */
    public static final class b<Data> implements rq1<Data> {
        private final String s;
        private final a<Data> t;
        private Data u;

        public b(String str, a<Data> aVar) {
            this.s = str;
            this.t = aVar;
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public Class<Data> a() {
            return this.t.a();
        }

        @Override // com.p7700g.p99005.rq1
        public void b() {
            try {
                this.t.b(this.u);
            } catch (IOException unused) {
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

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // com.p7700g.p99005.rq1
        public void e(@x1 fp1 fp1Var, @x1 rq1.a<? super Data> aVar) {
            try {
                Data c = this.t.c(this.s);
                this.u = c;
                aVar.f(c);
            } catch (IllegalArgumentException e) {
                aVar.c(e);
            }
        }
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes2.dex */
    public static final class c<Model> implements eu1<Model, InputStream> {
        private final a<InputStream> a = new a();

        /* compiled from: DataUrlLoader.java */
        /* loaded from: classes2.dex */
        public class a implements a<InputStream> {
            public a() {
            }

            @Override // com.p7700g.p99005.ut1.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.p7700g.p99005.ut1.a
            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.p7700g.p99005.ut1.a
            /* renamed from: e */
            public InputStream c(String str) {
                if (str.startsWith(ut1.a)) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(ut1.b)) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<Model, InputStream> c(@x1 hu1 hu1Var) {
            return new ut1(this.a);
        }
    }

    public ut1(a<Data> aVar) {
        this.c = aVar;
    }

    @Override // com.p7700g.p99005.du1
    public boolean a(@x1 Model model) {
        return model.toString().startsWith(a);
    }

    @Override // com.p7700g.p99005.du1
    public du1.a<Data> b(@x1 Model model, int i, int i2, @x1 jq1 jq1Var) {
        return new du1.a<>(new k02(model), new b(model.toString(), this.c));
    }
}