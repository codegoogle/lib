package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.4d  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03854d {
    public static C2Q<C03854d> A03 = new SA(20);
    public int A00;
    @Nullable
    public C4A A01;
    @Nullable
    public C4A A02;

    public static C03854d A00() {
        C03854d record = A03.A2P();
        return record == null ? new C03854d() : record;
    }

    public static void A01() {
        do {
        } while (A03.A2P() != null);
    }

    public static void A02(C03854d c03854d) {
        c03854d.A00 = 0;
        c03854d.A02 = null;
        c03854d.A01 = null;
        A03.ACG(c03854d);
    }
}