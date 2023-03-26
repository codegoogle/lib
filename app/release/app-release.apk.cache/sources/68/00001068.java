package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Dc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0598Dc {
    public final int A00;
    public final String A01;
    public final List<C0597Db> A02;
    public final byte[] A03;

    public C0598Dc(int i, String str, List<C0597Db> list, byte[] bArr) {
        List<C0597Db> unmodifiableList;
        this.A00 = i;
        this.A01 = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A03 = bArr;
    }
}