package com.p7700g.p99005;

/* compiled from: AddressSegment.java */
/* loaded from: classes3.dex */
public final /* synthetic */ class w04 {
    public static boolean c(x04 _this, int i) {
        int B1 = _this.B1();
        int A0 = _this.A0();
        if (i < 0 || i >= A0) {
            throw new IndexOutOfBoundsException();
        }
        return ((1 << (A0 - (i + 1))) & B1) != 0;
    }

    public static boolean g(x04 _this, int i) {
        int B1 = _this.B1();
        int A0 = _this.A0();
        if (i < 0 || i >= A0) {
            throw new IndexOutOfBoundsException();
        }
        return ((1 << i) & B1) != 0;
    }
}