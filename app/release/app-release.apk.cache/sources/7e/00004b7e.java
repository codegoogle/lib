package com.p7700g.p99005;

/* compiled from: BytesResource.java */
/* loaded from: classes2.dex */
public class jw1 implements cs1<byte[]> {
    private final byte[] s;

    public jw1(byte[] bArr) {
        this.s = (byte[]) x02.d(bArr);
    }

    @Override // com.p7700g.p99005.cs1
    public void a() {
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    /* renamed from: b */
    public byte[] get() {
        return this.s;
    }

    @Override // com.p7700g.p99005.cs1
    public int c() {
        return this.s.length;
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    public Class<byte[]> d() {
        return byte[].class;
    }
}