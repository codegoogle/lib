package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.0h  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC02880h {
    A03,
    A02,
    A04;
    
    public static byte[] A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{37, 34, ax5.a, 56, 45, 32, 32, 41, 40, 37, 36, 37, 46, 101, 100, g15.c, 116, 98, 101, 120, g15.c, 106, 103, 103, 110, 111};
    }

    static {
        A02();
    }

    public static EnumC02880h A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return A03;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            return A03;
        }
    }
}