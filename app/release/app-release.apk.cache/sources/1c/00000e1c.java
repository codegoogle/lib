package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3a  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03573a {
    public static byte[] A04;
    public static String[] A05;
    public int A00;
    public int A01;
    public int A02;
    public Object A03;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-77, -9, -63, -34, 37, -20, -62, -62, -35, -4, 18, 21, 21, 20, -21, 82, 91, 4, -1, 85, 80};
    }

    public static void A03() {
        A05 = new String[]{"QuaalhDpDah20LX2wxgS6m2LJMNg0MsY", "Kv65PDKGzQbP8opzJD3T0Bs4qFkMuEvW", "yAGu2U2W7yMlSo0lcdd0QNLvUGBJ2w5m", "aJo4Pz0hsbQrFibFt4ypJbnLPuINPYvA", "18JvwLOKolmi3RAuIpcsWcjyGiEhXJWG", "AlJwV0uWjEUfV5LlQyKVHG51mucaZZJu", "um2uWSM0iR5xPcbZFnmwGsQ9sHGc90", "QpR6AGAR"};
    }

    public C03573a(int i, int i2, int i3, Object obj) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = obj;
    }

    private final String A00() {
        int i = this.A00;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        String[] strArr = A05;
                        if (strArr[4].charAt(8) != strArr[0].charAt(8)) {
                            String[] strArr2 = A05;
                            strArr2[1] = "xbTSMp8fvBEENljIQe5QRmpFAlAe0spq";
                            strArr2[1] = "xbTSMp8fvBEENljIQe5QRmpFAlAe0spq";
                            return A01(6, 2, 16);
                        }
                        throw new RuntimeException();
                    }
                    return A01(15, 2, 114);
                }
                return A01(19, 2, 109);
            }
            return A01(17, 2, 31);
        }
        return A01(10, 3, 62);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C03573a c03573a = (C03573a) obj;
        int i = this.A00;
        if (i != c03573a.A00) {
            return false;
        }
        if (i == 8 && Math.abs(this.A01 - this.A02) == 1 && this.A01 == c03573a.A02 && this.A02 == c03573a.A01) {
            return true;
        }
        if (this.A01 != c03573a.A01 || this.A02 != c03573a.A02) {
            return false;
        }
        Object obj2 = this.A03;
        if (obj2 != null) {
            if (!obj2.equals(c03573a.A03)) {
                return false;
            }
        } else {
            Object obj3 = c03573a.A03;
            if (A05[2].charAt(7) == 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "4VD3xUS92qaUHk8jcTCUJI3HU1kIkp";
            strArr[6] = "4VD3xUS92qaUHk8jcTCUJI3HU1kIkp";
            if (obj3 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int result = this.A01;
        return (((this.A00 * 31) + this.A02) * 31) + result;
    }

    public final String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + A01(8, 1, 15) + A00() + A01(3, 3, 63) + this.A02 + A01(13, 2, 62) + this.A01 + A01(0, 3, 20) + this.A03 + A01(9, 1, 44);
    }
}