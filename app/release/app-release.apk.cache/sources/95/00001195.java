package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Ib  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0721Ib {
    public static String[] A07;
    public static final Comparator<C0720Ia> A08;
    public static final Comparator<C0720Ia> A09;
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C0720Ia[] A06 = new C0720Ia[5];
    public final ArrayList<C0720Ia> A05 = new ArrayList<>();
    public int A00 = -1;

    public static void A02() {
        A07 = new String[]{"v8bLZp59B3s5kjImuBjcCmNW", "l5XLQfXbQh6R34DBcL2a2gRDiWiOWq7j", "cKC0Gfnr6KNVk9zoAEVguSpqajRxhGsy", "4MzGZFDG0CqgMdioIrH5vwyzFGAbThRu", "MvXRt7wPeDxEfDCDFesb3zWoJZhNCkxf", "mCnVL7G0HMRU3KziMebPW175T1XCPvkW", "oyPZ3wFE5cpoHVmJFEQQrP2WxUjSMaR1", "eOuchRPwSpgwlWmZThUBhEapR1FbTYXS"};
    }

    static {
        A02();
        A08 = new IY();
        A09 = new IZ();
    }

    public C0721Ib(int i) {
        this.A04 = i;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    public final float A03(float f) {
        A01();
        float f2 = this.A03 * f;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList<C0720Ia> arrayList = this.A05;
            if (A07[7].charAt(12) != 'l') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[1] = "MYxxtSQw2w0IEM5GsYZTgS2IPhbXFMQD";
            strArr[1] = "MYxxtSQw2w0IEM5GsYZTgS2IPhbXFMQD";
            int i3 = arrayList.size();
            if (i2 < i3) {
                C0720Ia c0720Ia = this.A05.get(i2);
                int i4 = c0720Ia.A02;
                i += i4;
                int i5 = (i > f2 ? 1 : (i == f2 ? 0 : -1));
                if (i5 >= 0) {
                    return c0720Ia.A00;
                }
                i2++;
            } else if (this.A05.isEmpty()) {
                return Float.NaN;
            } else {
                ArrayList<C0720Ia> arrayList2 = this.A05;
                return arrayList2.get(arrayList2.size() - 1).A00;
            }
        }
    }

    public final void A04(int i, float f) {
        C0720Ia c0720Ia;
        A00();
        int i2 = this.A02;
        if (i2 > 0) {
            C0720Ia[] c0720IaArr = this.A06;
            int i3 = i2 - 1;
            this.A02 = i3;
            c0720Ia = c0720IaArr[i3];
        } else {
            c0720Ia = new C0720Ia(null);
        }
        int i4 = this.A01;
        this.A01 = i4 + 1;
        c0720Ia.A01 = i4;
        if (A07[6].charAt(29) != 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[0] = "5E26ZSMWQoSDuNI0YD8YDk9y";
        strArr[0] = "5E26ZSMWQoSDuNI0YD8YDk9y";
        c0720Ia.A02 = i;
        c0720Ia.A00 = f;
        this.A05.add(c0720Ia);
        this.A03 += i;
        while (true) {
            int i5 = this.A03;
            int i6 = this.A04;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C0720Ia c0720Ia2 = this.A05.get(0);
                if (c0720Ia2.A02 <= i7) {
                    this.A03 -= c0720Ia2.A02;
                    this.A05.remove(0);
                    int i8 = this.A02;
                    if (i8 < 5) {
                        C0720Ia[] c0720IaArr2 = this.A06;
                        if (A07[6].charAt(29) != 'a') {
                            this.A02 = i8 + 1;
                            c0720IaArr2[i8] = c0720Ia2;
                        } else {
                            String[] strArr2 = A07;
                            strArr2[0] = "NjEm8Wq6Ir4EIF9DQvkt7JHV";
                            strArr2[0] = "NjEm8Wq6Ir4EIF9DQvkt7JHV";
                            this.A02 = i8 + 1;
                            c0720IaArr2[i8] = c0720Ia2;
                        }
                    }
                } else {
                    c0720Ia2.A02 -= i7;
                    this.A03 -= i7;
                }
            } else {
                return;
            }
        }
    }
}