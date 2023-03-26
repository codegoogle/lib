package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* renamed from: com.facebook.ads.redexgen.X.Iy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0742Iy implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ J3 A01;

    public RunnableC0742Iy(J3 j3, Format format) {
        this.A01 = j3;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J4 j4;
        if (KU.A02(this)) {
            return;
        }
        try {
            j4 = this.A01.A01;
            j4.ABJ(this.A00);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}