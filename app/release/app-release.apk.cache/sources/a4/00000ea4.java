package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04215o {
    @Nullable
    public static InterfaceC04225p A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-24, -21, -12, -23, -18, -13, -25, -8, -15};
    }

    public static void A03() {
        A03 = new String[]{"dhICO", "mxKq80OLCiD", "i2W9TrIDW1srZxkJxV7foM0MgZvVXbWR", "HI2hESQONWq4EaTE0poPF0OJaSIxJaLc", "DAl184VBvvXhRHJ82dj3bqQv5TXH8TG3", "HKaWDYwPLWKyKiUqhpuc4RGInXEUU", "cSOfcLeIkAX6sPpwLxmVuA24IrFfyR3p", "KnRyMDjzSPNAoacBq98iQYDM8U9nlYJB"};
    }

    static {
        A03();
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C04215o.class) {
            if (A00 == null) {
                return;
            }
            C04858j c04858j = new C04858j(A00.ACT());
            c04858j.A03(1);
            C1081Wi sdkContext = C8G.A00();
            if (sdkContext != null) {
                sdkContext.A04().A82(A00(0, 9, 109), 3401, c04858j);
            }
            InterfaceC04225p interfaceC04225p = A00;
            if (A03[1].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "kDYng9EYBsgXNgOEIL1h1gMPzmVJxAMa";
            strArr[6] = "TYxT1mxIdvKOfg1hbfM6O4XMHE5Nitia";
            interfaceC04225p.reset();
        }
    }

    public static void A04(long j) {
        if (j > 0) {
            A00 = new TN();
            new Thread(j) { // from class: com.facebook.ads.redexgen.X.5q
                public final long A00;

                {
                    this.A00 = j;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    if (KU.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (InterruptedException unused) {
                            }
                            C04215o.A01();
                        } catch (Throwable th) {
                            KU.A00(th, this);
                            return;
                        }
                    }
                }
            };
        }
    }
}