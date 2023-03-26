package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public final class BA {
    @Nullable
    public final Handler A00;
    @Nullable
    public final BB A01;

    public BA(@Nullable Handler handler, @Nullable BB bb) {
        this.A00 = bb != null ? (Handler) I1.A01(handler) : null;
        this.A01 = bb;
    }

    public final void A01(int i) {
        if (this.A01 != null) {
            this.A00.post(new B9(this, i));
        }
    }

    public final void A02(int i, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new B7(this, i, j, j2));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new B6(this, format));
        }
    }

    public final void A04(C0557Be c0557Be) {
        if (this.A01 != null) {
            this.A00.post(new B8(this, c0557Be));
        }
    }

    public final void A05(C0557Be c0557Be) {
        if (this.A01 != null) {
            this.A00.post(new B4(this, c0557Be));
        }
    }

    public final void A06(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new B5(this, str, j, j2));
        }
    }
}