package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.77  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass77 {
    public Handler A00;

    public AnonymousClass77(Looper looper) {
        this.A00 = new Handler(looper);
    }

    public final void A00(AnonymousClass78 anonymousClass78) {
        this.A00.post(anonymousClass78);
    }

    public final void A01(AnonymousClass78 anonymousClass78) {
        this.A00.removeCallbacks(anonymousClass78);
    }

    public final boolean A02(AnonymousClass78 anonymousClass78, long j) {
        return this.A00.postDelayed(anonymousClass78, j);
    }
}