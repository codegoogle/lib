package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.View;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class MG {
    public static byte[] A00;
    public static String[] A01;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].charAt(18) != strArr[4].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "NODd4hgwoPsa2k2MnOsaUDtymSUydbAu";
            strArr2[3] = "NODd4hgwoPsa2k2MnOsaUDtymSUydbAu";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{61, 57, 58, 14, 31, 18, 30, 21, 24, 30, 53, 30, 15, 12, 20, 9, 16, 9, 46, 38, 35, 111, 59, 32, 111, 61, bx.W5, 33, 43, bx.W5, 61, 111, 1, 46, 59, 38, 57, bx.W5, 111, 59, bx.W5, 34, ax5.a, 35, 46, 59, bx.W5, 97, 111, 10, 34, ax5.a, 59, 54, 111, 14, 33, 43, 61, 32, 38, 43, 111, 25, 38, bx.W5, 56, 111, 56, 38, 35, 35, 111, 45, bx.W5, 111, 61, bx.W5, 59, 58, 61, 33, bx.W5, 43, 97, 52, 59, 46, 51, 44, ax5.a, 5, 46, ax5.a, 55, bx.W5, 54, 59, 46, ax5.a};
    }

    public static void A03() {
        A01 = new String[]{"Ja1bzDC4XO6MJovALms6", "IsGiV6tW8eEZvxsgDHoXbhWPQfEYRFJe", "F2wXUvOdg1ErZ5Wo6Cgjufn4T4zC8kyY", "0BOYk9mrV7ZAWg7WZWP8YYSS1bLPwSw8", "ohe2pYr3qvUc9pGZYOoHj0caDSEXBlEt", "i3VOTigCB6pNI1", "51BdPbZeK1jUSv1wKhHS", "aZfUmaE3Xil8RoSsFIMTsgdGf"};
    }

    public static View A00(C1080Wh c1080Wh, Throwable th) {
        A04(c1080Wh, th);
        return new View(c1080Wh);
    }

    public static void A04(C1080Wh c1080Wh, Throwable th) {
        c1080Wh.A04().A82(A01(85, 15, 44), C04848i.A1b, new C04858j(th));
        Log.e(A01(0, 17, 13), A01(17, 68, 57), th);
    }
}