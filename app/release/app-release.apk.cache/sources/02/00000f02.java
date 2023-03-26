package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.yg1;
import java.util.Arrays;
import org.json.JSONObject;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.7K  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7K {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-120, -90, -88, -83, -86, 101, -87, -82, -72, -80, 101, -85, -90, -82, -79, -70, -73, -86, 115, -63, -33, bx.j7, -26, -29, -98, -30, -25, -15, -23, -98, -15, -13, bx.j7, bx.j7, -29, -15, -15, -84, -63, -33, bx.j7, -26, -29, -98, -30, -19, -11, -20, -22, -19, -33, -30, -98, -28, -33, -25, -22, -13, -16, -29, -84, -127, -97, -95, -90, -93, 94, -90, -89, -78, 108, -72, -42, -40, -35, -38, -107, -30, -34, -24, -24, -93, -83, -80, -85, -81, -66, -79, -83, -64, -75, -62, -79, -85, -65, -75, -58, -79, -85, -82, -59, -64, -79, -65, -55, -52, -57, -53, -38, -51, -55, -36, -47, -34, -51, -57, -36, bx.j7, -40, -51, -95, -92, -97, -90, -81, -78, -83, -95, -76, -97, -76, -71, -80, -91, 21, 24, 19, 38, 25, 37, 41, 25, 39, 40, 19, 29, 24, -79, -60, -60, -75, -67, -64, -60, -78, -80, -78, -73, -76, 24, 22, 24, 29, 26, 20, 24, 36, 35, 41, 26, 45, 41, -50, -55, -47, -44, -35, -38, -51, -57, -38, -51, -55, -37, -41, -42, 22, 26, 14, 20, 18, Flags.CD, 14, 0, 3, -2, 19, 8, 12, 4, 5, 2, -4};
    }

    static {
        A01();
        A09 = C7K.class.getSimpleName();
        A05 = C04848i.A0d;
        A06 = C04848i.A0h;
        A02 = C04848i.A0a;
        A01 = C04848i.A0Z;
        A03 = C04848i.A0b;
        A00 = C04848i.A0X;
        A04 = C04848i.A0c;
        A07 = C04848i.A0i;
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A02(C8H c8h, C7A c7a, int i, String str, long j) {
        if (!A06(c8h)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), c7a.A00);
            jSONObject.put(A00(WKSRecord.Service.INGRES_NET, 13, 118), c7a.A01);
            if (j > 0) {
                jSONObject.put(A00(191, 9, 97), LW.A06(System.currentTimeMillis() - j));
            }
            C04858j c04858j = new C04858j(str);
            c04858j.A05(jSONObject);
            c04858j.A03(1);
            c8h.A04().A83(A00(154, 5, 17), i, c04858j);
        } catch (Throwable th) {
            c8h.A04().A3S(th);
        }
    }

    public static void A03(C8H c8h, C7E c7e, String str, int i, @Nullable String str2, @Nullable Integer num, @Nullable Long l) {
        if (A06(c8h)) {
            A05(c8h, c7e.A05, c7e.A06, c7e.A07, A00(yg1.G, 5, 111), str, i, str2, num, l, null);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A04(C8H c8h, C7J c7j, boolean z) {
        if (!A06(c8h)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), c7j.A00);
            jSONObject.put(A00(WKSRecord.Service.INGRES_NET, 13, 118), c7j.A03);
            jSONObject.put(A00(104, 16, 42), c7j.A02);
            jSONObject.put(A00(159, 13, 119), c7j.A01);
            if (J8.A1I(c8h)) {
                jSONObject.put(A00(200, 3, 82), c7j.A04);
            }
            String A002 = z ? A00(61, 10, 0) : A00(71, 11, 55);
            int i = z ? A05 : A06;
            C04858j c04858j = new C04858j(A002);
            c04858j.A05(jSONObject);
            c04858j.A03(1);
            c8h.A04().A83(A00(154, 5, 17), i, c04858j);
        } catch (Throwable th) {
            c8h.A04().A3S(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A05(C8H c8h, String str, String str2, String str3, String str4, String str5, int i, @Nullable String str6, @Nullable Integer num, @Nullable Long l, @Nullable Integer num2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), str);
            jSONObject.put(A00(WKSRecord.Service.INGRES_NET, 13, 118), str2);
            jSONObject.put(A00(104, 16, 42), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 42), str6);
            }
            if (num != null) {
                jSONObject.put(A00(82, 22, 14), String.valueOf(num));
            }
            if (l != null) {
                jSONObject.put(A00(191, 9, 97), String.valueOf(l));
            }
            if (num2 != null) {
                jSONObject.put(A00(147, 7, 18), String.valueOf(num2));
            }
            jSONObject.put(A00(159, 13, 119), str5);
            if (J8.A1I(c8h)) {
                jSONObject.put(A00(200, 3, 82), str3);
            }
            String A002 = A00(19, 19, 64);
            if (i == A03) {
                A002 = A00(38, 23, 64);
            } else if (i == A01) {
                A002 = A00(0, 19, 7);
            }
            C04858j c04858j = new C04858j(A002);
            c04858j.A05(jSONObject);
            c04858j.A03(1);
            c8h.A04().A83(A00(154, 5, 17), i, c04858j);
        } catch (Throwable th) {
            c8h.A04().A3S(th);
        }
    }

    public static boolean A06(C8H c8h) {
        int A062;
        if (c8h.A03().A7X()) {
            A062 = 1;
        } else {
            A062 = J9.A06(c8h);
        }
        if (A062 == 0) {
            return false;
        }
        return A062 <= 0 || c8h.A05().A00() <= 1.0d / ((double) A062);
    }
}