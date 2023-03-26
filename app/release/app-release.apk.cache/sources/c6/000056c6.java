package com.p7700g.p99005;

/* compiled from: IntegerArrayAdapter.java */
/* loaded from: classes2.dex */
public final class ps1 implements hs1<int[]> {
    private static final String a = "IntegerArrayPool";

    @Override // com.p7700g.p99005.hs1
    public int a() {
        return 4;
    }

    @Override // com.p7700g.p99005.hs1
    /* renamed from: c */
    public int b(int[] iArr) {
        return iArr.length;
    }

    @Override // com.p7700g.p99005.hs1
    /* renamed from: d */
    public int[] newArray(int i) {
        return new int[i];
    }

    @Override // com.p7700g.p99005.hs1
    public String getTag() {
        return a;
    }
}