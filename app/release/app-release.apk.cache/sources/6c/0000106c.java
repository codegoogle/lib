package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Dg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0602Dg {
    public final int A00;
    public final long A01;

    public C0602Dg(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C0602Dg A00(CL cl, IQ iq) throws IOException, InterruptedException {
        cl.ABZ(iq.A00, 0, 8);
        iq.A0Z(0);
        int id = iq.A09();
        return new C0602Dg(id, iq.A0L());
    }
}