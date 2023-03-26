package com.p7700g.p99005;

import android.util.Log;
import com.p7700g.p99005.du1;
import com.p7700g.p99005.rq1;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferFileLoader.java */
/* loaded from: classes2.dex */
public class tt1 implements du1<File, ByteBuffer> {
    private static final String a = "ByteBufferFileLoader";

    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: classes2.dex */
    public static final class a implements rq1<ByteBuffer> {
        private final File s;

        public a(File file) {
            this.s = file;
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
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
        public void e(@x1 fp1 fp1Var, @x1 rq1.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(l02.a(this.s));
            } catch (IOException e) {
                Log.isLoggable(tt1.a, 3);
                aVar.c(e);
            }
        }
    }

    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: classes2.dex */
    public static class b implements eu1<File, ByteBuffer> {
        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<File, ByteBuffer> c(@x1 hu1 hu1Var) {
            return new tt1();
        }
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: c */
    public du1.a<ByteBuffer> b(@x1 File file, int i, int i2, @x1 jq1 jq1Var) {
        return new du1.a<>(new k02(file), new a(file));
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: d */
    public boolean a(@x1 File file) {
        return true;
    }
}