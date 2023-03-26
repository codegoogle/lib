package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public class V2 implements InterfaceC04416i {
    public final /* synthetic */ V7 A00;

    public V2(V7 v7) {
        this.A00 = v7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        return this.A00.A0D(new HashMap<String, Integer>() { // from class: com.facebook.ads.redexgen.X.6b
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{123, -13};
            }

            {
                put(A00(1, 1, 109), Integer.valueOf(V2.this.A00.A01.widthPixels));
                put(A00(0, 1, 4), Integer.valueOf(V2.this.A00.A01.heightPixels));
            }
        });
    }
}