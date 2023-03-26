package com.p7700g.p99005;

/* compiled from: StringIgnoreCaseKeyComparator.java */
/* loaded from: classes3.dex */
public class kx3 implements bx3<String> {
    public static final kx3 s = new kx3();

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(String str, String str2) {
        return str.compareToIgnoreCase(str2);
    }

    @Override // com.p7700g.p99005.bx3
    /* renamed from: b */
    public boolean e(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    @Override // com.p7700g.p99005.bx3
    /* renamed from: d */
    public int c(String str) {
        return str.toLowerCase().hashCode();
    }
}