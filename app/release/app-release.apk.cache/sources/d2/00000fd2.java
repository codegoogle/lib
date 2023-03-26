package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Av  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0548Av {
    public static final C0548Av A04 = new C0547Au().A00();
    public AudioAttributes A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C0548Av(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    @TargetApi(21)
    public final AudioAttributes A00() {
        if (this.A00 == null) {
            this.A00 = new AudioAttributes.Builder().setContentType(this.A01).setFlags(this.A02).setUsage(this.A03).build();
        }
        return this.A00;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0548Av c0548Av = (C0548Av) obj;
        return this.A01 == c0548Av.A01 && this.A02 == c0548Av.A02 && this.A03 == c0548Av.A03;
    }

    public final int hashCode() {
        int result = this.A02;
        return (((((17 * 31) + this.A01) * 31) + result) * 31) + this.A03;
    }
}