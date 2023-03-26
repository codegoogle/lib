package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class X6 implements InterfaceC0776Ki {
    public static byte[] A01;
    public final /* synthetic */ C1081Wi A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{68, 64, 67, 119, 102, 107, 103, 108, 97, 103, 76, 103, 118, 117, 109, 112, 105, 15, 52, ax5.a, 34, bx.W5, ax5.a, 57, 46, ax5.a, 62, 122, ax5.a, 40, 40, 53, 40, 116, 121, 104, 123, 105, 114, 69, 105, 114, 115, g15.c, 118, 126};
    }

    public X6(C1081Wi c1081Wi) {
        this.A00 = c1081Wi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0776Ki
    public final void A7t(int i, Throwable th) {
        Log.e(A00(0, 17, 13), A00(17, 17, 85), th);
        this.A00.A04().A82(A00(34, 12, 21), i, new C04858j(th));
    }
}