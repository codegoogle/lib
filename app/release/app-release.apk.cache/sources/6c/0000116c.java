package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.p7700g.p99005.bx;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0716Hw {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-40, -21, -30, -46, -33, -40, bx.j7, -10, 9, 0, -16, 3, -10, -11, -6, 3};
    }

    public static long A00(InterfaceC0715Hv interfaceC0715Hv) {
        return interfaceC0715Hv.A5D(A02(0, 7, 27), -1L);
    }

    @Nullable
    public static Uri A01(InterfaceC0715Hv interfaceC0715Hv) {
        String A5E = interfaceC0715Hv.A5E(A02(7, 9, 57), null);
        if (A5E == null) {
            return null;
        }
        return Uri.parse(A5E);
    }

    public static void A04(C0717Hx c0717Hx) {
        c0717Hx.A02(A02(7, 9, 57));
    }

    public static void A05(C0717Hx c0717Hx, long j) {
        c0717Hx.A03(A02(0, 7, 27), j);
    }

    public static void A06(C0717Hx c0717Hx, Uri uri) {
        c0717Hx.A04(A02(7, 9, 57), uri.toString());
    }
}