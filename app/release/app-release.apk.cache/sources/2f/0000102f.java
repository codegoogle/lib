package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ch  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0577Ch {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;
    public final byte[] A05 = new byte[10];

    public final void A00() {
        this.A04 = false;
    }

    public final void A01(CL cl, int i, int i2) throws IOException, InterruptedException {
        if (!this.A04) {
            cl.ABZ(this.A05, 0, 10);
            cl.ACa();
            if (C0545As.A06(this.A05) == -1) {
                return;
            }
            this.A04 = true;
            this.A02 = 0;
        }
        if (this.A02 == 0) {
            this.A00 = i;
            this.A01 = 0;
        }
        this.A01 += i2;
    }

    public final void A02(C0576Cg c0576Cg) {
        if (this.A04 && this.A02 > 0) {
            c0576Cg.A0W.ACf(this.A03, this.A00, this.A01, 0, c0576Cg.A0V);
            this.A02 = 0;
        }
    }

    public final void A03(C0576Cg c0576Cg, long j) {
        if (!this.A04) {
            return;
        }
        int i = this.A02;
        this.A02 = i + 1;
        if (i == 0) {
            this.A03 = j;
        }
        if (this.A02 < 16) {
            return;
        }
        c0576Cg.A0W.ACf(this.A03, this.A00, this.A01, 0, c0576Cg.A0V);
        this.A02 = 0;
    }
}