package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6n  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC04466n {
    A04(0),
    A05(100);
    
    public static byte[] A01;
    public static final Map<Integer, EnumC04466n> A02;
    public int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-98, -97, -96, -101, -81, -90, -82, -104, -103, -105, -104};
    }

    static {
        EnumC04466n[] values;
        A02();
        A02 = new HashMap();
        for (EnumC04466n enumC04466n : values()) {
            A02.put(Integer.valueOf(enumC04466n.A00), enumC04466n);
        }
    }

    EnumC04466n(int i) {
        this.A00 = i;
    }

    public static EnumC04466n A00(int i) {
        EnumC04466n enumC04466n = A02.get(Integer.valueOf(i));
        return enumC04466n == null ? A04 : enumC04466n;
    }
}