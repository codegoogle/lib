package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0p  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02960p {
    public static byte[] A04;
    public static String[] A05;
    public boolean A00;
    public final C1080Wh A01;
    public final AbstractC02970q A02;
    public final C0901Ph A03;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
            String[] strArr = A05;
            if (strArr[7].charAt(19) == strArr[3].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ralyQsFIfJjHchT6ijaCYOn7xcrh9SYP";
            strArr2[0] = "lf1tsTh5P7IODA8hmkOKCVUdKtrYifbk";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-126, -90, -87, -85, -98, -84, -84, -94, -88, -89, 89, -91, -88, -96, -96, -98, -99};
    }

    public static void A02() {
        A05 = new String[]{"OqcLT37Xtir4oyEfNmT1h4Rk4YkQZZDY", "Uwe5RI", "pL0dXLjcEL0YvPTfwlaTsWSX1DbaAkE5", "xtw7OOYBvYdKgcW8WzcZrKA0PDZy4bwg", "f918FI", "0rYE8aKdqB5alUcDRGHr7byWf0zxjLED", "HJdrWZ0hD1uhwEG", "W2AWehjS6wPr2mpVEIqcODXDVwSDQEbA"};
    }

    public abstract void A07(Map<String, String> map);

    public AbstractC02960p(C1080Wh c1080Wh, AbstractC02970q abstractC02970q, C0901Ph c0901Ph) {
        this.A01 = c1080Wh;
        this.A02 = abstractC02970q;
        this.A03 = c0901Ph;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        AbstractC02970q abstractC02970q = this.A02;
        if (abstractC02970q != null) {
            abstractC02970q.A01();
        }
        A07(new NU().A04(this.A03).A06());
        this.A00 = true;
        C0790Kz.A02(this.A01, A00(0, 17, 20));
        AbstractC02970q abstractC02970q2 = this.A02;
    }
}