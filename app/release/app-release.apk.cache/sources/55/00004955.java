package com.p7700g.p99005;

import com.p7700g.p99005.sq1;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder.java */
/* loaded from: classes2.dex */
public class iw1 implements sq1<ByteBuffer> {
    private final ByteBuffer a;

    /* compiled from: ByteBufferRewinder.java */
    /* loaded from: classes2.dex */
    public static class a implements sq1.a<ByteBuffer> {
        @Override // com.p7700g.p99005.sq1.a
        @x1
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.p7700g.p99005.sq1.a
        @x1
        /* renamed from: c */
        public sq1<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new iw1(byteBuffer);
        }
    }

    public iw1(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // com.p7700g.p99005.sq1
    public void b() {
    }

    @Override // com.p7700g.p99005.sq1
    @x1
    /* renamed from: c */
    public ByteBuffer a() {
        this.a.position(0);
        return this.a;
    }
}