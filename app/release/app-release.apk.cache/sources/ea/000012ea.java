package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class OF {
    @Nullable
    public String A02;
    @Nullable
    public String A03;
    public final C1G A04;
    public final C1Q A05;
    public final C1080Wh A06;
    public C1H A01 = C1H.A01(null);
    public int A00 = 1000;

    public OF(C1080Wh c1080Wh, C1G c1g, C1Q c1q) {
        this.A06 = c1080Wh;
        this.A04 = c1g;
        this.A05 = c1q;
    }

    public static /* synthetic */ int A00(OF of) {
        return of.A00;
    }

    public static /* synthetic */ C1G A01(OF of) {
        return of.A04;
    }

    public static /* synthetic */ C1H A02(OF of) {
        return of.A01;
    }

    public static /* synthetic */ C1Q A03(OF of) {
        return of.A05;
    }

    public static /* synthetic */ C1080Wh A04(OF of) {
        return of.A06;
    }

    public static /* synthetic */ String A05(OF of) {
        return of.A03;
    }

    public static /* synthetic */ String A06(OF of) {
        return of.A02;
    }

    public final OF A07(int i) {
        this.A00 = i;
        return this;
    }

    public final OF A08(C1H c1h) {
        this.A01 = c1h;
        return this;
    }

    public final OF A09(String str) {
        this.A02 = str;
        return this;
    }

    public final OF A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final OH A0B() {
        return new OH(this, null);
    }
}