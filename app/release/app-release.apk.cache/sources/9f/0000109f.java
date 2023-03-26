package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import com.p7700g.p99005.bx;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class EZ implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C0628Ei A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-73, bx.l7, -22, -33, -27, -28, -106, -36, -33, -30, -37, -106, -30, -27, -41, -38, -33, -28, -35, -106, -36, -41, -33, -30, -37, -38, -92, -66, -23, -15, -24, -26, -23, -37, -34, -57, -37, -24, -37, bx.j7, -33, -20};
    }

    public EZ(C0628Ei c0628Ei) {
        this.A00 = c0628Ei;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EO eo;
        DownloadAction.Deserializer[] deserializerArr;
        Handler handler;
        if (KU.A02(this)) {
            return;
        }
        try {
            eo = this.A00.A09;
            deserializerArr = this.A00.A0E;
            DownloadAction[] A04 = eo.A04(deserializerArr);
            handler = this.A00.A07;
            handler.post(new EY(this, A04));
        }
    }
}