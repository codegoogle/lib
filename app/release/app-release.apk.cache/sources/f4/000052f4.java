package com.p7700g.p99005;

/* compiled from: ByteArrayAdapter.java */
/* loaded from: classes2.dex */
public final class ns1 implements hs1<byte[]> {
    private static final String a = "ByteArrayPool";

    @Override // com.p7700g.p99005.hs1
    public int a() {
        return 1;
    }

    @Override // com.p7700g.p99005.hs1
    /* renamed from: c */
    public int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.p7700g.p99005.hs1
    /* renamed from: d */
    public byte[] newArray(int i) {
        return new byte[i];
    }

    @Override // com.p7700g.p99005.hs1
    public String getTag() {
        return a;
    }
}