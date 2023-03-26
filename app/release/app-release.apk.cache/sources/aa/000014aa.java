package com.facebook.ads.redexgen.X;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class VW implements InterfaceC04416i {
    public static byte[] A01;
    public final /* synthetic */ C1057Vk A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{123, -71, -72, -86, -111, -100};
    }

    public VW(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        strArr = this.A00.A06;
        if (strArr != null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                strArr2 = this.A00.A06;
                int i2 = strArr2.length;
                if (i >= i2) {
                    AbstractC04566x signalValueTypeDef = this.A00.A09(AnonymousClass76.A08(sb.toString().getBytes(A00(1, 5, 16)), AnonymousClass75.A06));
                    return signalValueTypeDef;
                }
                strArr3 = this.A00.A06;
                sb.append(strArr3[i]);
                strArr4 = this.A00.A06;
                int i3 = strArr4.length;
                if (i != i3 - 1) {
                    sb.append(A00(0, 1, 29));
                }
                i++;
            }
        } else {
            return this.A00.A08(EnumC04526t.A07);
        }
    }
}