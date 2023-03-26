package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1i  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03151i {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            strArr2[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            byte b = (byte) ((copyOfRange[i4] - i3) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr3 = A01;
            strArr3[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr3[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            copyOfRange[i4] = b;
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    public static void A02() {
        A01 = new String[]{"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};
    }

    public static void A03(C1080Wh c1080Wh, AnonymousClass16 anonymousClass16, boolean z, InterfaceC03131g interfaceC03131g) {
        if (!J8.A1A(c1080Wh)) {
            C7H c7h = new C7H(c1080Wh);
            C1S playableAdData = anonymousClass16.A0M().A0E().A06();
            JL funnelLoggingHandler = new JL(anonymousClass16.A0Q(), c1080Wh.A06());
            c7h.A0X(funnelLoggingHandler);
            if (playableAdData == null) {
                interfaceC03131g.AAR(AdError.CACHE_ERROR);
                return;
            }
            C7G c7g = new C7G(playableAdData.A0F(), anonymousClass16.A0U(), anonymousClass16.A0T());
            c7g.A04 = true;
            if (J8.A17(c1080Wh)) {
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "84TqyqDRqUmJCVM8";
                strArr[0] = "84TqyqDRqUmJCVM8";
                c7g.A03 = A00(0, 5, 22);
            }
            int i = C03121f.A00[playableAdData.A0A().ordinal()];
            if (i == 1 || i == 2) {
                c7h.A0T(c7g);
            }
            c7h.A0R(new C7E(anonymousClass16.A0O().A01(), -1, -1, anonymousClass16.A0U(), anonymousClass16.A0T()));
            c7h.A0R(new C7E(playableAdData.A0E(), -1, -1, anonymousClass16.A0U(), anonymousClass16.A0T()));
            c7h.A0Q(new RW(c1080Wh, interfaceC03131g, c7h, playableAdData, z, null), new C7A(anonymousClass16.A0U(), anonymousClass16.A0T()));
            return;
        }
        interfaceC03131g.AAS();
    }
}