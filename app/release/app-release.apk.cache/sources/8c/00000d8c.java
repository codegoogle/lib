package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C1E {
    A04(A01(23, 14, 75)),
    A05(A01(37, 9, 104));
    
    public static byte[] A01;
    public static String[] A02;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            String[] strArr = A02;
            if (strArr[2].charAt(20) != strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "UwpbEbRNl9IMKeiJ6uSiSZky6ATbVFhh";
            strArr2[5] = "UwpbEbRNl9IMKeiJ6uSiSZky6ATbVFhh";
            copyOfRange[i4] = (byte) (i5 - 74);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-9, 3, 2, 8, -7, 12, 8, 9, -11, 0, 19, -11, 4, 4, -68, -83, -77, -79, -53, -68, -69, -65, -64, -8, 4, 3, 9, -6, 13, 9, 10, -10, 1, -12, -10, 5, 5, 34, 19, 25, 23, 17, 34, 33, 37, 38};
    }

    public static void A03() {
        A02 = new String[]{"v4tKPq3EceuOa5aRsmEiNo1tTprRM6C7", "qa", "1kYj9up9VehuFRcMC7DoHBWV3d6qFcAR", "n4EmHEljxnoAajVVWWaJOomXezwQRR5a", "Whp7rDnlG0MZIiYb9hz51Us4d", "ClcFd5qXD5uybBDL74sHW5rS4sS0N915", "9cSwTyNVqh919HIV87XGH350eC38CJiy", "s6hJEW9RZJJCohfrBHr3vXwOzcsb3wCa"};
    }

    static {
        A03();
        A02();
    }

    C1E(String str) {
        this.A00 = str;
    }

    public static C1E A00(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 883765328) {
            if (hashCode == 1434358835 && str.equals(A01(23, 14, 75))) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals(A01(37, 9, 104))) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            return A05;
        }
        return A04;
    }
}