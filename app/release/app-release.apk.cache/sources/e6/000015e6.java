package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ag  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1215ag implements IS<String> {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-51, bx.l7, -46, -47, 14, -1, 18, 14, -60, -75, -56, -60, g15.c, -58, -60, -60, -87, -98, -99};
    }

    public static void A02() {
        A01 = new String[]{"u8G08HFxhQG7mlQK0N08J24LskAFk0Fz", "MT2vKhidsLEKISovOxHKhqO4VFEbCdVt", "JUZDuoVTBw7gjm", "iOPubIquN8qe", "0M6TS0Q", "HZwTTDt8MowEsM3lUInYTfNVGUxvh7Fx", "C1UIBnl28yc1uc0E2ccxntR095C7RYBw", "f1f0cNh4gPGC00wb8Jrm0MnwGgNgR"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.IS
    /* renamed from: A03 */
    public final boolean A4y(String str) {
        String A0M = C0726Ig.A0M(str);
        if (!TextUtils.isEmpty(A0M)) {
            if (A01[7].length() == 5) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "QIxKUOjxUFjuFXd3UTFt4bedwIhosxNy";
            strArr[0] = "KyBHe82bx80nGeQY27WRdJvWIWXouYTm";
            if ((!A0M.contains(A00(4, 4, 113)) || A0M.contains(A00(8, 8, 39))) && !A0M.contains(A00(0, 4, 60)) && !A0M.contains(A00(16, 3, 8))) {
                return true;
            }
        }
        return false;
    }
}