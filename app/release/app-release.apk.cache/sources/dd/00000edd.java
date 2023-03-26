package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.g15;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6j  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC04426j {
    A04(0),
    A07(1024),
    A05(2048),
    A06(4096);
    
    public static byte[] A01;
    public static final Map<Integer, EnumC04426j> A02;
    public int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-104, -101, -92, -97, -99, -92, -75, -97, -99, -92, -91, -88, -101, 120, 105, 122, 105, 118, 119, 113, 108, g15.c, 110, 123, 113, 124, 122, -116, g15.b, 110, 122, 125, 121, 114, -91, -89, -91, -94, -101, -107, -101, -95, -89, -91};
    }

    static {
        EnumC04426j[] values;
        A02();
        A02 = new HashMap();
        for (EnumC04426j enumC04426j : values()) {
            A02.put(Integer.valueOf(enumC04426j.A00), enumC04426j);
        }
    }

    EnumC04426j(int i) {
        this.A00 = i;
    }

    public static EnumC04426j A00(int i) {
        EnumC04426j enumC04426j = A02.get(Integer.valueOf(i));
        return enumC04426j == null ? A04 : enumC04426j;
    }

    public final int A03() {
        return this.A00;
    }
}