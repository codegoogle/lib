package com.facebook.ads.redexgen.X;

import android.view.View;
import com.p7700g.p99005.zg2;

/* renamed from: com.facebook.ads.redexgen.X.9x  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05259x extends SW {
    public static String[] A08;
    public float A00;
    public int A01;
    public int A02;
    public C05279z A03;
    public int[] A04;
    public final C1080Wh A05;
    public final OJ A06;
    public final OK A07;

    static {
        A04();
    }

    public static void A04() {
        A08 = new String[]{"bHvO3zM", "7z8VpEP", "iw2Y0c", "LME8njBPiXs011hhslbtp", "9K0lNzbR5X2b0vS5", "Pt0EnZUFnGQLsNks8pQcEgn0FivkNzUh", "t6anbflpJj2CGicCnIMdWTRCydsD", "D9TL9YTSSd0lWzGeUvgWfvwaUF0YdAOx"};
    }

    public C05259x(C1080Wh c1080Wh, OK ok, OJ oj) {
        super(c1080Wh);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1080Wh;
        this.A07 = ok;
        this.A06 = oj;
        this.A01 = -1;
        this.A03 = new C05279z(this, this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0 != 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r0 == 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        super.A1K(r17, r18, r19, r20);
     */
    @Override // com.facebook.ads.redexgen.X.C4F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1K(C4N c4n, C4U c4u, int i, int i2) {
        int[] iArr;
        int heightSize = View.MeasureSpec.getMode(i);
        int mode = View.MeasureSpec.getMode(i2);
        if (heightSize == 1073741824) {
            int widthMode = A2B();
        }
        if (mode == 1073741824) {
            int widthMode2 = A2B();
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        OJ oj = this.A06;
        int widthMode3 = this.A01;
        if (oj.A01(widthMode3)) {
            OJ oj2 = this.A06;
            int widthMode4 = this.A01;
            iArr = oj2.A02(widthMode4);
        } else {
            iArr = new int[]{0, 0};
            int widthMode5 = c4u.A03();
            if (widthMode5 >= 1) {
                int widthMode6 = A0X();
                int A0X = widthMode6 > 0 ? 1 : A0X();
                for (int i3 = 0; i3 < A0X; i3++) {
                    View A1r = A1r(i3);
                    if (A08[5].length() != 32) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A08;
                    strArr[4] = "FajaHWp";
                    strArr[4] = "FajaHWp";
                    if (A1r == null) {
                        break;
                    }
                    this.A04 = this.A07.A00(A1r, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (A2B() == 0) {
                        int heightMode = iArr[0];
                        int[] iArr2 = this.A04;
                        iArr[0] = heightMode + iArr2[0];
                        if (i3 == 0) {
                            int A0h = iArr2[1] + A0h();
                            if (A08[6].length() != 1) {
                                String[] strArr2 = A08;
                                strArr2[6] = "o1L5u";
                                strArr2[6] = "o1L5u";
                                iArr[1] = A0h + A0e();
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            continue;
                        }
                    } else {
                        int i4 = iArr[1];
                        int[] iArr3 = this.A04;
                        if (A08[6].length() != 1) {
                            String[] strArr3 = A08;
                            strArr3[5] = "6nCDHSOFLCCkeDdRDThHGlolS6KLs45E";
                            strArr3[5] = "6nCDHSOFLCCkeDdRDThHGlolS6KLs45E";
                            iArr[1] = i4 + iArr3[1];
                            if (i3 != 0) {
                            }
                            iArr[0] = iArr3[0] + A0f() + A0g();
                        } else {
                            String[] strArr4 = A08;
                            strArr4[3] = "KFvpvLkhCjqU9hzA1pvFB";
                            strArr4[3] = "KFvpvLkhCjqU9hzA1pvFB";
                            iArr[1] = i4 + iArr3[1];
                            if (i3 != 0) {
                            }
                            iArr[0] = iArr3[0] + A0f() + A0g();
                        }
                    }
                }
                int i5 = this.A01;
                if (i5 != -1) {
                    this.A06.A00(i5, iArr);
                }
            }
        }
        if (heightSize == 1073741824) {
            iArr[0] = size;
        }
        if (mode == 1073741824) {
            iArr[1] = size2;
        }
        int i6 = iArr[0];
        int widthMode7 = iArr[1];
        A14(i6, widthMode7);
    }

    @Override // com.facebook.ads.redexgen.X.SW, com.facebook.ads.redexgen.X.C4F
    public final void A1u(int i) {
        super.A2G(i, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.SW, com.facebook.ads.redexgen.X.C4F
    public final void A22(ES es, C4U c4u, int i) {
        this.A03.A0B(i);
        A1M(this.A03);
    }

    public final void A2L(double d) {
        if (d <= zg2.s) {
            d = 1.0d;
        }
        this.A00 = (float) (50.0d / d);
        this.A03 = new C05279z(this, this.A05);
    }

    public final void A2M(int i) {
        this.A01 = i;
    }

    public final void A2N(int i) {
        this.A02 = i;
    }
}