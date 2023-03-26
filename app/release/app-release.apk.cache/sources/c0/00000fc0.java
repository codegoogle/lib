package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ad  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0531Ad {
    public static final C0531Ad A01 = new C0531Ad(0);
    public final int A00;

    public C0531Ad(int i) {
        this.A00 = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.A00 == ((C0531Ad) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }
}