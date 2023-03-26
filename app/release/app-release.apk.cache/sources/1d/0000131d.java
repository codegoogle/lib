package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.g15;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum P4 {
    A05,
    A04,
    A03;
    
    public static byte[] A00;
    public static String[] A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 53);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{66, 69, 64, 65, 91, 75, 81, 80, 91, 75, 74, 91, 84, 72, 69, 93, 101, 98, 122, g15.c, 101, 110, 96, 105, 5, 26, 0, 26, 17, 31, 22};
    }

    public static void A02() {
        A01 = new String[]{"7GN8MrenydislHWBBPReIB", "P5", "QDtKUFo4Pv7jZ7qumv108KMzWf6HrSMn", "iim9AI0VqZedzbhMlrV0qDo4YMl61NlV", "LtGcJkDv8PpKzGxu4pknm0pyAahoAI9h", "Z7tecEc8tS2JrzNmQM0R9CjEnjCb6ksC", "JuvL09EyJViLP4nPFPxPBzJM00GhcqAu", "kQTCJlS50BSCbahTVqCDmy8LW1L9RVvG"};
    }

    static {
        A02();
        A01();
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static P4[] valuesCustom() {
        Object clone = values().clone();
        String[] strArr = A01;
        if (strArr[1].length() != strArr[0].length()) {
            String[] strArr2 = A01;
            strArr2[3] = "fXviZ9AMoZT5h2KBZwjslTMVyIobOTux";
            strArr2[3] = "fXviZ9AMoZT5h2KBZwjslTMVyIobOTux";
            return (P4[]) clone;
        }
        throw new RuntimeException();
    }
}