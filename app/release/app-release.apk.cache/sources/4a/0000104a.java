package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class D8 {
    public static String[] A0J;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C0587Cr A07;
    public D7 A08;
    public IQ A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public int[] A0D;
    public int[] A0E;
    public long[] A0F;
    public long[] A0G;
    public boolean[] A0H;
    public boolean[] A0I;

    static {
        A00();
    }

    public static void A00() {
        A0J = new String[]{"0EwfBQL8WgkraFIT5", "yqBIkqshgk6o8aGC7JXOfAcvQBpSEoIE", "Pb3yD9oBE", "Sy7y64hwk", "hrTCG", "uTsL", "1ofsGt0E1HxH4l7d5", "0"};
    }

    public final long A01(int i) {
        return this.A0F[i] + this.A0C[i];
    }

    public final void A02() {
        this.A02 = 0;
        this.A06 = 0L;
        this.A0A = false;
        this.A0B = false;
        this.A08 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r3 < r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03(int i) {
        IQ iq = this.A09;
        if (iq != null) {
            int A08 = iq.A08();
            if (A0J[6].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[3] = "O7sbivaH";
            strArr[3] = "O7sbivaH";
        }
        this.A09 = new IQ(i);
        this.A01 = i;
        this.A0A = true;
        this.A0B = true;
        if (A0J[3].length() != 20) {
            String[] strArr2 = A0J;
            strArr2[1] = "ZqBRFK04oxBzllTVeb4xO6w8kHwYHjDg";
            strArr2[1] = "ZqBRFK04oxBzllTVeb4xO6w8kHwYHjDg";
        }
    }

    public final void A04(int i, int i2) {
        this.A02 = i;
        this.A00 = i2;
        int[] iArr = this.A0E;
        if (iArr == null || iArr.length < i) {
            this.A0G = new long[i];
            this.A0E = new int[i];
        }
        int[] iArr2 = this.A0D;
        if (iArr2 == null || iArr2.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.A0D = new int[i3];
            this.A0C = new int[i3];
            this.A0F = new long[i3];
            this.A0I = new boolean[i3];
            this.A0H = new boolean[i3];
        }
    }

    public final void A05(CL cl) throws IOException, InterruptedException {
        cl.readFully(this.A09.A00, 0, this.A01);
        this.A09.A0Z(0);
        this.A0B = false;
    }

    public final void A06(IQ iq) {
        iq.A0d(this.A09.A00, 0, this.A01);
        this.A09.A0Z(0);
        this.A0B = false;
    }
}