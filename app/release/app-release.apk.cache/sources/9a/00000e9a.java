package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.5d  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04115d {
    public final long A00;
    public final EnumC04105c A01;
    public final String A02;
    public final boolean A03;

    public C04115d(String str, boolean z, EnumC04105c enumC04105c) {
        this(str, z, enumC04105c, System.currentTimeMillis());
    }

    public C04115d(String str, boolean z, EnumC04105c enumC04105c, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC04105c;
        this.A00 = j;
    }

    public static C04115d A00() {
        return new C04115d("", true, EnumC04105c.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC04105c A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}