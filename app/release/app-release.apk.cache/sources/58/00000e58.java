package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.qi4;

/* renamed from: com.facebook.ads.redexgen.X.4Z  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4Z {
    public static String[] A05;
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    static {
        A01();
    }

    public static void A01() {
        A05 = new String[]{"IS69BmVCyt3r7rCL06vW", "i2lfi3JYyaWanuhNA9EoVixSZwQkBGPJ", "IP2snh2DbdtJP84nmUNUnat", "M7qM02aMAAjP0VsgCoHzcI67snq6Xoz6", "g2Y2aWNGMjfm3AzRUQfTQ", "z59QBS9AE5GFtdBn17xV89BNaNN5ntVX", "icRlwMXc031dCVyQa9g0z", "JdVLDxEugZkBcdzJI35N90WET0E7DRJI"};
    }

    private final int A00(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        if (i == i2) {
            return 2;
        }
        return 4;
    }

    public final void A02() {
        this.A00 = 0;
    }

    public final void A03(int i) {
        this.A00 |= i;
    }

    public final void A04(int i, int i2, int i3, int i4) {
        this.A04 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = i4;
    }

    public final boolean A05() {
        int i = this.A00;
        if ((i & 7) == 0 || (i & (A00(this.A02, this.A04) << 0)) != 0) {
            int i2 = this.A00;
            int i3 = i2 & 112;
            String[] strArr = A05;
            if (strArr[5].charAt(13) != strArr[7].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "xw0gZhFc6GA1WyK2bJob";
            strArr2[0] = "xw0gZhFc6GA1WyK2bJob";
            if (i3 == 0 || (i2 & (A00(this.A02, this.A03) << 4)) != 0) {
                int i4 = this.A00;
                if ((i4 & qi4.h.j) == 0 || (i4 & (A00(this.A01, this.A04) << 8)) != 0) {
                    int i5 = this.A00;
                    return (i5 & 28672) == 0 || (i5 & (A00(this.A01, this.A03) << 12)) != 0;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}