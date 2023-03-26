package com.p7700g.p99005;

import com.p7700g.p99005.sq1;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamRewinder.java */
/* loaded from: classes2.dex */
public final class yq1 implements sq1<InputStream> {
    private static final int a = 5242880;
    private final zv1 b;

    /* compiled from: InputStreamRewinder.java */
    /* loaded from: classes2.dex */
    public static final class a implements sq1.a<InputStream> {
        private final is1 a;

        public a(is1 is1Var) {
            this.a = is1Var;
        }

        @Override // com.p7700g.p99005.sq1.a
        @x1
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.p7700g.p99005.sq1.a
        @x1
        /* renamed from: c */
        public sq1<InputStream> b(InputStream inputStream) {
            return new yq1(inputStream, this.a);
        }
    }

    public yq1(InputStream inputStream, is1 is1Var) {
        zv1 zv1Var = new zv1(inputStream, is1Var);
        this.b = zv1Var;
        zv1Var.mark(a);
    }

    @Override // com.p7700g.p99005.sq1
    public void b() {
        this.b.release();
    }

    public void c() {
        this.b.b();
    }

    @Override // com.p7700g.p99005.sq1
    @x1
    /* renamed from: d */
    public InputStream a() throws IOException {
        this.b.reset();
        return this.b;
    }
}