package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.animation.Interpolator;
import com.p7700g.p99005.ax5;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4Q  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4Q {
    public static byte[] A07;
    public static String[] A08;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Interpolator A05;
    public boolean A06;

    static {
        A03();
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 35);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{111, 64, 6, 95, 73, 83, 6, 86, 84, 73, 80, 79, 66, 67, 6, 71, 72, 6, 79, 72, 82, 67, 84, 86, 73, 74, 71, 82, 73, 84, 10, 6, 95, 73, 83, 6, 75, 83, 85, 82, 6, 85, 67, 82, 6, 71, 6, 86, 73, 85, 79, 82, 79, 80, 67, 6, 66, 83, 84, 71, 82, 79, 73, 72, 8, ax5.a, 57, 35, 57, 54, ax5.a, 40, 12, 51, ax5.a, 45, 30, 46, ax5.a, 34, 33, 33, 109, 41, 56, ax5.a, 44, 57, 36, 34, 35, 109, 32, 56, 62, 57, 109, 47, 40, 109, 44, 109, 61, 34, 62, 36, 57, 36, 59, 40, 109, 35, 56, 32, 47, 40, ax5.a, 102, 88, 90, 90, 65, 93, 21, 102, 86, 71, 90, 89, 89, 21, 84, 86, 65, 92, 90, 91, 21, 92, 70, 21, 87, 80, 92, 91, 82, 21, 64, 69, 81, 84, 65, 80, 81, 21, 65, 90, 90, 21, 83, 71, 80, 68, 64, 80, 91, 65, 89, 76, 27, 21, 120, 84, 94, 80, 21, 70, 64, 71, 80, 21, 76, 90, 64, 21, 84, 71, 80, 21, 91, 90, 65, 21, 86, 93, 84, 91, 82, 92, 91, 82, 21, 92, 65, 21, 64, 91, 89, 80, 70, 70, 21, 91, 80, 86, 80, 70, 70, 84, 71, 76};
    }

    public static void A03() {
        A08 = new String[]{"mhxsSpCIE", "HPHd8ajTElCt4xjey", "7Zb31Oi", "DD", "BNYok10xEf4gIs6uNCWHihSbJqoYG9kt", "IDmLc2m45tKSy5LkWISCl9o5476O0eoP", "nkkzGeiOD1wUj3jYejs7CProiVmlcOmv", "T15Acsoxou"};
    }

    public C4Q(int i, int i2) {
        this(i, i2, Integer.MIN_VALUE, null);
    }

    public C4Q(int i, int i2, int i3, Interpolator interpolator) {
        this.A04 = -1;
        this.A06 = false;
        this.A00 = 0;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A05 = interpolator;
    }

    private void A01() {
        if (this.A05 == null || this.A01 >= 1) {
            if (this.A01 >= 1) {
                return;
            }
            throw new IllegalStateException(A00(76, 41, 110));
        }
        throw new IllegalStateException(A00(0, 64, 5));
    }

    public final void A04(int i) {
        this.A04 = i;
    }

    public final void A05(int i, int i2, int i3, Interpolator interpolator) {
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A05 = interpolator;
        this.A06 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r4 == Integer.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        r7.A08.A0B(r6.A02, r6.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
        if (r4 == Integer.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
        r7.A08.A0C(r6.A02, r6.A03, r6.A01);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A06(ES es) {
        if (this.A04 >= 0) {
            int i = this.A04;
            this.A04 = -1;
            es.A1T(i);
            this.A06 = false;
            return;
        }
        boolean z = this.A06;
        String[] strArr = A08;
        if (strArr[0].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[2] = "212KLvw";
        strArr2[1] = "ScHRjLy9POjuhpXgs";
        if (z) {
            A01();
            if (this.A05 == null) {
                int i2 = this.A01;
                if (A08[5].charAt(7) != 'm') {
                    String[] strArr3 = A08;
                    strArr3[6] = "zRXbG2Pg2WQl47tw6BDwFwXd2KU4dPOe";
                    strArr3[4] = "nOulwAzWUzM6mtcilc92MTdFBYoxfopf";
                } else {
                    String[] strArr4 = A08;
                    strArr4[0] = "ZgMLwAgsg";
                    strArr4[7] = "4bf8d9ADjt";
                }
            } else {
                es.A08.A0D(this.A02, this.A03, this.A01, this.A05);
            }
            this.A00++;
            if (this.A00 > 10) {
                Log.e(A00(64, 12, 121), A00(117, 104, 22));
            }
            this.A06 = false;
            return;
        }
        this.A00 = 0;
    }

    public final boolean A07() {
        return this.A04 >= 0;
    }
}