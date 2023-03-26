package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DB {
    public static String[] A05;
    public int A01;
    public boolean A02;
    public final DC A03 = new DC();
    public final IQ A04 = new IQ(new byte[65025], 0);
    public int A00 = -1;

    static {
        A01();
    }

    public static void A01() {
        A05 = new String[]{"YmqCfQGeJdZscNiSsRHgK8Xqwc4qCDQV", "BEVC1cuwi5mxHrGOZ29iGldY3rFRULVC", "DSPc42zLHxXdWx97yn92wynUTyNm", "qbq", "Vn6wbfa2hXyYQug1oukzP6oQFgTa", "a4c", "hss", "EwoauNNUoRbyLKR"};
    }

    private int A00(int i) {
        this.A01 = 0;
        int i2 = 0;
        while (this.A01 + i < this.A03.A02) {
            int[] iArr = this.A03.A09;
            int i3 = this.A01;
            this.A01 = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }

    public final DC A02() {
        return this.A03;
    }

    public final IQ A03() {
        return this.A04;
    }

    public final void A04() {
        this.A03.A03();
        this.A04.A0W();
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A05() {
        if (this.A04.A00.length == 65025) {
            return;
        }
        IQ iq = this.A04;
        iq.A00 = Arrays.copyOf(iq.A00, Math.max(65025, this.A04.A08()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
        if (r7.A03.A09[r3 - 1] != 5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
        if (r7.A03.A09[r3 - 1] != 255) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A06(CL cl) throws IOException, InterruptedException {
        boolean z;
        I1.A04(cl != null);
        if (this.A02) {
            this.A02 = false;
            this.A04.A0W();
        }
        while (!this.A02) {
            if (this.A00 < 0) {
                if (!this.A03.A04(cl, true)) {
                    return false;
                }
                int i = 0;
                int i2 = this.A03.A01;
                if ((this.A03.A04 & 1) == 1 && this.A04.A08() == 0) {
                    i2 += A00(0);
                    i = 0 + this.A01;
                }
                cl.ADG(i2);
                this.A00 = i;
            }
            int i3 = this.A00;
            if (A05[6].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[2] = "i62czKk5b6JbVfHnToVx8x6tmuUA";
            strArr[4] = "gHUMWkXRCT33pqDj2b4VuW7lrrl9";
            int A00 = A00(i3);
            int i4 = this.A00 + this.A01;
            if (A00 > 0) {
                if (this.A04.A06() < this.A04.A08() + A00) {
                    IQ iq = this.A04;
                    iq.A00 = Arrays.copyOf(iq.A00, this.A04.A08() + A00);
                }
                cl.readFully(this.A04.A00, this.A04.A08(), A00);
                IQ iq2 = this.A04;
                iq2.A0Y(iq2.A08() + A00);
                if (A05[6].length() != 3) {
                    String[] strArr2 = A05;
                    strArr2[2] = "ogc4gOivxDxoGYi1qiTHirlKhDSt";
                    strArr2[4] = "iMeJYowIkxr6AoX4GnZCWjRmsKkg";
                } else {
                    String[] strArr3 = A05;
                    strArr3[1] = "SEVCovcizG8fdEER6D9whRMhw9TrSTFd";
                    strArr3[0] = "7kPCM5e4Jglfu9vPSMMLzLJaJJkFOiUF";
                }
                this.A02 = z;
            }
            if (i4 == this.A03.A02) {
                i4 = -1;
            }
            this.A00 = i4;
        }
        return true;
    }
}