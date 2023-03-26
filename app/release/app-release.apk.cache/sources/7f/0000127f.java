package com.facebook.ads.redexgen.X;

import android.view.View;
import com.p7700g.p99005.bx;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class MV implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1106Xh A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-27, -38, -25, -37, -28, -25, -30, -72, -23, -42, -72, bx.j7, -34, -40, -32};
    }

    public MV(C1106Xh c1106Xh) {
        this.A00 = c1106Xh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        M6 m6;
        if (KU.A02(this)) {
            return;
        }
        try {
            m6 = this.A00.A04;
            m6.A3s(A00(0, 15, 9));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}