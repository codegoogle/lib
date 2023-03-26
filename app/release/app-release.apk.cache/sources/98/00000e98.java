package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.p7700g.p99005.ax5;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.5b  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC04095b {
    A04(A01(16, 5, 50)),
    A06(A01(27, 5, 29)),
    A05(A01(21, 6, 93));
    
    public static byte[] A01;
    public static String[] A02;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[3].charAt(7) != 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[4] = "tSWii36WTWypzTcQeixtwPDDv3BIvAiF";
            strArr[4] = "tSWii36WTWypzTcQeixtwPDDv3BIvAiF";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 119);
            i4++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-51, -47, -59, -53, -55, Flags.CD, -1, 16, 9, 19, 14, 25, 12, 7, 8, 18, 18, 22, 10, 16, 14, 65, 53, 70, ax5.a, 73, 68, 10, -3, -8, -7, 3};
    }

    public static void A03() {
        A02 = new String[]{"k9IbPcfog7a2vud71ZD1yiSptuKC", "7LgXLJxVBX0dpNGH2cpdo2FqGbwHr2dh", "LRipwKypnEKMqg6PamR7G8YuQckBwe", "JMyIsM6N3mQ5xBBSQQoIEfTakpln9APf", "n5EonvV2d0ynVphuWIfrU3PhJk0DBM6W", "TLMtZWSWcMyBHKhNGVy3rrDPFywR", "JEnYl3ig6b1G3QZnd7pVPdvbWtuLiuax", "SOFQxOre1ZQqrgpFIrPfi6IMKTKD0s"};
    }

    static {
        A03();
        A02();
    }

    EnumC04095b(String str) {
        this.A00 = str;
    }

    @Nullable
    public static EnumC04095b A00(@Nullable String str) {
        EnumC04095b[] values;
        for (EnumC04095b enumC04095b : values()) {
            if (enumC04095b.A00.equals(str)) {
                return enumC04095b;
            }
        }
        return null;
    }
}