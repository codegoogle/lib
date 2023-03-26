package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public final class J3 {
    @Nullable
    public final Handler A00;
    @Nullable
    public final J4 A01;

    public J3(@Nullable Handler handler, @Nullable J4 j4) {
        this.A00 = j4 != null ? (Handler) I1.A01(handler) : null;
        this.A01 = j4;
    }

    public final void A01(int i, int i2, int i3, float f) {
        if (this.A01 != null) {
            this.A00.post(new J0(this, i, i2, i3, f));
        }
    }

    public final void A02(int i, long j) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0743Iz(this, i, j));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new J1(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0742Iy(this, format));
        }
    }

    public final void A05(C0557Be c0557Be) {
        if (this.A01 != null) {
            this.A00.post(new J2(this, c0557Be));
        }
    }

    public final void A06(C0557Be c0557Be) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0740Iw(this, c0557Be));
        }
    }

    public final void A07(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0741Ix(this, str, j, j2));
        }
    }
}