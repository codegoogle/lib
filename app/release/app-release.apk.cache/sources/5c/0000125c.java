package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Lv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0812Lv {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{100, -105, -126, -124, -113, -109, -120, -114, -115, ax5.a, -120, -115, ax5.a, -110, -126, -111, -124, -124, -115, ax5.a, -120, -115, -109, -124, -111, g15.b, -126, -109, -120, -107, -124, ax5.a, -126, -121, -124, -126, -118, 75, ax5.a, g15.b, -110, -110, -108, -116, -120, -115, -122, ax5.a, -120, -115, -109, -124, -111, g15.b, -126, -109, -120, -107, -124, 77, -103, -104, -96, -114, -101, -46, -55, -45, -53, bx.l7};
    }

    static {
        A01();
        A01 = C0812Lv.class.getSimpleName();
    }

    public static boolean A02(C1080Wh c1080Wh) {
        return A03(c1080Wh) && C0813Lw.A04(c1080Wh);
    }

    public static boolean A03(C1080Wh c1080Wh) {
        if (c1080Wh == null) {
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) c1080Wh.getSystemService(A00(60, 5, 18));
            if (Build.VERSION.SDK_INT >= 20) {
                return powerManager.isInteractive();
            }
            return powerManager.isScreenOn();
        } catch (Exception e) {
            Log.e(A01, A00(0, 60, 8), e);
            c1080Wh.A04().A82(A00(65, 5, 73), C04848i.A24, new C04858j(e));
            return true;
        }
    }
}