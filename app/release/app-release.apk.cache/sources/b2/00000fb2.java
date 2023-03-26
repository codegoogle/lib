package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class AP {
    public static final AP A04 = new AP(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public AP(float f) {
        this(f, 1.0f, false);
    }

    public AP(float f, float f2, boolean z) {
        I1.A03(f > 0.0f);
        I1.A03(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = z;
        this.A03 = Math.round(1000.0f * f);
    }

    public final long A00(long j) {
        return this.A03 * j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AP ap = (AP) obj;
        return this.A01 == ap.A01 && this.A00 == ap.A00 && this.A02 == ap.A02;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A00);
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + result) * 31) + (this.A02 ? 1 : 0);
    }
}