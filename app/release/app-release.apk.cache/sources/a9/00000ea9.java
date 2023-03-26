package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.p7700g.p99005.bx;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5t  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04265t {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{45, 59, 16, bx.W5, 55, 59, 61, 46, 60, 43, 39, 37, 102, 46, 41, 43, 45, bx.W5, 39, 39, 35, 102, 41, 44, 59, 102, 33, 38, 60, 45, 58, 38, 41, 36, 102, bx.W5, 60, 45, 48, 60, 58, 41, 59};
    }

    public static SharedPreferences A00(C8H c8h) {
        return c8h.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(9, 34, 105), c8h), 0);
    }

    @Nullable
    public final String A03(C8H c8h) {
        return A00(c8h).getString(A01(0, 9, 110), null);
    }

    public final void A04(C8H c8h, String str) {
        A00(c8h).edit().putString(A01(0, 9, 110), str).apply();
    }
}