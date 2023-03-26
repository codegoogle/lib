package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.8S  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C8S {
    public static byte[] A01;
    public static String[] A02;
    public final C8O A00;

    static {
        A05();
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 59);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{121, -127, 123, -104, 123, -102, -86, -48, -36, bx.l7, -41, -86, -44, Flags.CD, -4, -7, 6, -7, -44, -108, -118, 126, -126, -111, -124, g15.b, -109, -124, 95, -109, g15.b, -127, -117, -124, 95, -95, -81, -84, -83, 125, -79, -98, -97, -87, -94, 125, -90, -93, 125, -94, -75, -90, -80, -79, -80, 125, -8, -22, -15, -22, -24, -7, -59};
    }

    public static void A05() {
        A02 = new String[]{"HVKZvR5UTjStDLOL9o4rPessbKuh0O7V", "lcBs6IulTDBXs0xMNwr7074HBb5CT680", "pp9", "08Pk9qbigTz1ItVQ0hAeiWjKqsV0Kke0", "IZPR1WSW", "qkmVdqnPN26Te8aFuQlNVKOt05q5LyYY", "adXBxD3OrJvPB32QQ8w", "pvdflY6bA4nr3ZgRZtp7kAtC3Qj6GBkc"};
    }

    public abstract String A07();

    public abstract C8M[] A0B();

    public C8S(C8O c8o) {
        this.A00 = c8o;
    }

    private String A00() {
        C8M[] A0B = A0B();
        if (A0B.length < 1) {
            if (A02[4].length() != 8) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "NTtbWHu0RetWI6yxki67w6X3knWPKgwD";
            strArr[1] = "wg0AU135P1OwlpIQrYrtBV6UQnwqkPhP";
            return null;
        }
        String A012 = A01(0, 0, 31);
        for (int i = 0; i < A0B.length - 1; i++) {
            A012 = A012 + A0B[i].A02() + A01(20, 2, 35);
        }
        return A012 + A0B[A0B.length - 1].A02();
    }

    public static String A02(String str, C8M[] c8mArr) {
        StringBuilder sb = new StringBuilder(A01(56, 7, 106));
        for (int i = 0; i < c8mArr.length - 1; i++) {
            sb.append(c8mArr[i].A01);
            if (A02[2].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[4] = "CXWyM2Ol";
            strArr[4] = "CXWyM2Ol";
            sb.append(A01(20, 2, 35));
        }
        sb.append(c8mArr[c8mArr.length - 1].A01);
        sb.append(A01(6, 6, 79));
        sb.append(str);
        return sb.toString();
    }

    public static String A03(String str, C8M[] c8mArr, C8M c8m) {
        return A02(str, c8mArr) + A01(12, 7, 121) + c8m.A01 + A01(2, 4, 32);
    }

    public final SQLiteDatabase A06() {
        return this.A00.A0F();
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 4) + A07() + A01(0, 2, 30) + A00() + A01(19, 1, 48));
    }

    public final void A09(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 34) + A07());
    }

    public final boolean A0A() {
        return A06().delete(A07(), null, null) > 0;
    }
}