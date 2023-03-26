package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.ax5;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BD extends Exception {
    public static byte[] A01;
    public final int A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 15, 3, 124, 112, 19, ax5.a, 62, 54, 57, 55, 120, 110, 90, 75, 70, 64, 123, 93, 78, 76, 68, 15, 70, 65, 70, 91, 15, 73, 78, 70, 67, 74, 75, 21, 15};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BD(int i, int i2, int i3, int i4) {
        super(r3.toString());
        StringBuilder sb = new StringBuilder();
        sb.append(A00(12, 24, 79));
        sb.append(i);
        sb.append(A00(3, 9, 48));
        sb.append(i2);
        String A00 = A00(1, 2, 67);
        sb.append(A00);
        sb.append(i3);
        sb.append(A00);
        sb.append(i4);
        sb.append(A00(0, 1, 96));
        this.A00 = i;
    }
}