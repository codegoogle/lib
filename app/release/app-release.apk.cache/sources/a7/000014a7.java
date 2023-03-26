package com.facebook.ads.redexgen.X;

import android.content.pm.ServiceInfo;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class VT implements InterfaceC04416i {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ C1057Vk A00;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{18, 121, 120, 106, 1, 20};
    }

    public static void A02() {
        A02 = new String[]{"Wdahz1Wjl3dMmMcpJsybmGRAeciA4tMI", "owhKI", "oRwt0jb9EEblUBuGQWVNL6ozc0Rzi0vw", "l56im1aaEdwcDHM5hLD8b", "Eu2PxKSDFU9lAkWHn67wF6yqVh6mLTIL", "0Vvrgp6tuvzAmenwYfecbhGxQfkK1YW3", "HQi", "vUie1Te"};
    }

    public VT(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        ServiceInfo[] serviceInfoArr;
        ServiceInfo[] serviceInfoArr2;
        ServiceInfo[] serviceInfoArr3;
        ServiceInfo[] serviceInfoArr4;
        serviceInfoArr = this.A00.A05;
        if (serviceInfoArr != null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                serviceInfoArr2 = this.A00.A05;
                int i2 = serviceInfoArr2.length;
                if (i >= i2) {
                    AbstractC04566x signalValueTypeDef = this.A00.A09(AnonymousClass76.A08(sb.toString().getBytes(A00(1, 5, 50)), AnonymousClass75.A06));
                    return signalValueTypeDef;
                }
                serviceInfoArr3 = this.A00.A05;
                sb.append(serviceInfoArr3[i].name);
                serviceInfoArr4 = this.A00.A05;
                int i3 = serviceInfoArr4.length;
                if (i != i3 - 1) {
                    sb.append(A00(0, 1, 6));
                }
                i++;
            }
        } else {
            AbstractC04566x A08 = this.A00.A08(EnumC04526t.A07);
            String[] strArr = A02;
            if (strArr[5].charAt(15) != strArr[0].charAt(15)) {
                String[] strArr2 = A02;
                strArr2[2] = "PIV5HCfMNdAm4GWeouxefmFP0XOPfsYa";
                strArr2[4] = "Fq26Ssz9KPDLteFZDGni0zECOafhdUl8";
                return A08;
            }
            throw new RuntimeException();
        }
    }
}