package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Am  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0539Am {
    public final int A00;
    public final FG A01;

    public C0539Am(int i, FG fg) {
        this.A00 = i;
        this.A01 = fg;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0539Am c0539Am = (C0539Am) obj;
        return this.A00 == c0539Am.A00 && this.A01.equals(c0539Am.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}