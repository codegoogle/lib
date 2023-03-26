package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.Jp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0758Jp {
    A06,
    A02,
    A03,
    A04,
    A05;
    
    public static byte[] A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{14, 13, 26, 26, 17, 30, 8, 13, 19, 4, 17, 18, 19, 8, 19, 8, 0, Flags.CD, -58, -71, -52, -63, -50, -67, -18, bx.j7, -13, -35, -18, -32, bx.j7, -32, -5, -14, -27, -32, bx.j7, -21, -34, -41, -44, -41, -40, -32, -41};
    }

    static {
        A02();
    }

    public static EnumC0758Jp A00(EnumC0760Js enumC0760Js) {
        switch (enumC0760Js) {
            case A06:
                return A04;
            case A0A:
            case A0B:
            case A0C:
            case A09:
                return A02;
            case A0D:
            case A0G:
            case A0E:
            case A0F:
                return A03;
            case A07:
                return A05;
            default:
                return A06;
        }
    }

    public final AdPlacementType A03() {
        int i = C0757Jo.A00[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return AdPlacementType.UNKNOWN;
                    }
                    return AdPlacementType.REWARDED_VIDEO;
                }
                return AdPlacementType.NATIVE;
            }
            return AdPlacementType.BANNER;
        }
        return AdPlacementType.INTERSTITIAL;
    }
}