package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public class UJ implements InterfaceC04416i {
    public static byte[] A01;
    public final /* synthetic */ US A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 30, Flags.CD, 30, 31, 25};
    }

    public UJ(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        return this.A00.A0B(A00(0, 6, 26), 1);
    }
}