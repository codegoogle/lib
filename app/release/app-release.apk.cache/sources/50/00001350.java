package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.Pt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0913Pt {
    public static byte[] A07;
    public InterfaceC0904Pk A05;
    public int A04 = 60000;
    public int A03 = 100;
    public int A00 = 10000;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{49, 29, 4, 21, 17, 9, 17, 92, 14, 25, 8, 14, 21, 25, 15, 92, 17, 9, 15, 8, 92, 30, 25, 92, 30, 25, 8, Flags.CD, 25, 25, 18, 92, 77, 92, 29, 18, 24, 92, 77, 68};
    }

    public final C0913Pt A02(int i) {
        this.A00 = i;
        return this;
    }

    public final C0913Pt A03(int i) {
        if (i >= 1 && i <= 18) {
            this.A01 = i;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 56));
    }

    public final C0913Pt A04(int i) {
        this.A02 = i;
        return this;
    }

    public final C0913Pt A05(int i) {
        this.A03 = i;
        return this;
    }

    public final C0913Pt A06(int i) {
        this.A04 = i;
        return this;
    }

    public final C0913Pt A07(InterfaceC0904Pk interfaceC0904Pk) {
        this.A05 = interfaceC0904Pk;
        return this;
    }

    public final C0913Pt A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final C0914Pu A09() {
        return new C0914Pu(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}