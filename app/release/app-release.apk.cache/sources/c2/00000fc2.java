package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Af  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0533Af {
    public final long A00;
    public final long A01;
    public static final C0533Af A04 = new C0533Af(0, 0);
    public static final C0533Af A02 = new C0533Af(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C0533Af A06 = new C0533Af(Long.MAX_VALUE, 0);
    public static final C0533Af A05 = new C0533Af(0, Long.MAX_VALUE);
    public static final C0533Af A03 = A04;

    public C0533Af(long j, long j2) {
        I1.A03(j >= 0);
        I1.A03(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0533Af c0533Af = (C0533Af) obj;
        return this.A01 == c0533Af.A01 && this.A00 == c0533Af.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}