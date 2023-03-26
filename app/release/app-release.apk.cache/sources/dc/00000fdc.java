package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public class B6 implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ BA A01;

    public B6(BA ba, Format format) {
        this.A01 = ba;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BB bb;
        if (KU.A02(this)) {
            return;
        }
        try {
            bb = this.A01.A01;
            bb.A8x(this.A00);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}