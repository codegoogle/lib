package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class YF implements CW {
    @Override // com.facebook.ads.redexgen.X.CW
    public final void A5A(Format format) {
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final int ACd(CL cl, int i, boolean z) throws IOException, InterruptedException {
        int ADD = cl.ADD(i);
        if (ADD == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return ADD;
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final void ACe(IQ iq, int i) {
        iq.A0a(i);
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final void ACf(long j, int i, int i2, int i3, CV cv) {
    }
}