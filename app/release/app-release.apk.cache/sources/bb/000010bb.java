package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class F1 extends R5 {
    public static byte[] A02;
    public static String[] A03;
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {14, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, 61, 58, 52, 2, -24, -14, -17, -12, -15};
        if (A03[0].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "z2LBMWL3UZ6mgEOfq1wT6wdWGhdUBaxY";
        strArr[2] = "LNV6u0tAGiEAXpu6l5ZCQkq7c5KJBKxy";
        A02 = bArr;
    }

    public static void A02() {
        A03 = new String[]{"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", "", "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
    }

    static {
        A02();
        A01();
        A04 = F1.class.getSimpleName();
    }

    public F1(C1080Wh c1080Wh, JE je, String str, Uri uri, Map<String, String> map, C02930m c02930m, boolean z) {
        super(c1080Wh, je, str, c02930m, z);
        this.A00 = uri;
        this.A01 = map;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02860f
    @Nullable
    public final EnumC02850e A0A() {
        try {
            Kw.A09(new Kw(), ((AbstractC02860f) this).A00, Uri.parse(this.A00.getQueryParameter(A00(25, 4, 35))), this.A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            return EnumC02850e.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.R5
    public final void A0E() {
        EnumC02850e enumC02850e = null;
        if (((R5) this).A01) {
            enumC02850e = A0A();
        }
        A0F(this.A01, enumC02850e);
    }
}