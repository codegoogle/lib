package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import com.p7700g.p99005.g15;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class R7 extends AbstractC02860f {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 115, 123, 126, 119, 118, 50, -122, -127, 50, -127, -126, 119, g15.b, 50, 126, 123, g15.b, 125, 50, -121, -124, 126, 76, 50, -89, -102, -103, -98, -89, -102, -104, -87, -106, -104, -87, -98, -92, -93, -113, 117};
    }

    static {
        A01();
        A02 = R7.class.getSimpleName();
    }

    public R7(C1080Wh c1080Wh, JE je, String str, Uri uri) {
        super(c1080Wh, je, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02860f
    public final void A0D() {
        try {
            Log.w(A00(25, 16, 84), this.A00.toString());
            Kw.A09(new Kw(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 17) + this.A00.toString();
        }
    }
}