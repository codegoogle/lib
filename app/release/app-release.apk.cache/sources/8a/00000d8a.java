package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.1C  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1C implements Serializable {
    public static final long serialVersionUID = -268645651038092386L;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    @Nullable
    public final C1S A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public C1C(C1B c1b) {
        int i;
        boolean z;
        String str;
        int i2;
        int i3;
        C1S c1s;
        int i4;
        this.A08 = c1b.A08;
        this.A05 = c1b.A05;
        this.A03 = c1b.A03;
        i = c1b.A04;
        this.A04 = i;
        this.A0A = c1b.A0A;
        z = c1b.A09;
        this.A09 = z;
        str = c1b.A07;
        this.A07 = str;
        i2 = c1b.A01;
        this.A01 = i2;
        i3 = c1b.A00;
        this.A00 = i3;
        c1s = c1b.A06;
        this.A06 = c1s;
        i4 = c1b.A02;
        this.A02 = i4;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final int A02() {
        return this.A02;
    }

    public final int A03() {
        return this.A03;
    }

    public final int A04() {
        return this.A04;
    }

    public final long A05() {
        return this.A05;
    }

    @Nullable
    public final C1S A06() {
        return this.A06;
    }

    public final String A07() {
        return this.A07;
    }

    public final String A08() {
        return this.A08;
    }

    public final boolean A09() {
        return this.A09;
    }
}