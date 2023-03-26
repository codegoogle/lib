package com.p7700g.p99005;

/* compiled from: AddressSegmentSeries.java */
/* loaded from: classes3.dex */
public final /* synthetic */ class y04 {
    public static boolean c(z04 _this, int i) {
        int u2 = _this.u2();
        return ((1 << (u2 - ((i % u2) + 1))) & _this.D0(i / u2).B1()) != 0;
    }

    public static boolean g(z04 _this, int i) {
        return _this.f1(_this.A0() - (i + 1));
    }
}