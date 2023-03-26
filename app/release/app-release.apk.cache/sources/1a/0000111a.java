package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ga  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0668Ga {
    public static String[] A09;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final IQ A07 = new IQ();
    public final int[] A08 = new int[256];

    static {
        A00();
    }

    public static void A00() {
        A09 = new String[]{"dgnk6daQ0T87wOoHtyty7iRYaKvd8BzP", "TK3sWG", "r0T7HSyuXxeUz69yLbXIR4BhIiF2UDCf", "E94UIter8sht222SneNEBcgvWBNv8GHv", "qg4jsBrtjCwX7ZbqQAPOhxC1noKxQthL", "J", "sUrKaEkRL4ABh9brwle2ScDHOfoRuahW", "YVc6k2"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(IQ iq, int i) {
        int A0H;
        if (i < 4) {
            return;
        }
        iq.A0a(3);
        int i2 = i - 4;
        if ((iq.A0F() & 128) != 0) {
            if (i2 < 7 || (A0H = iq.A0H()) < 4) {
                return;
            }
            this.A01 = iq.A0J();
            this.A00 = iq.A0J();
            this.A07.A0X(A0H - 4);
            i2 -= 7;
        }
        int A07 = this.A07.A07();
        int A08 = this.A07.A08();
        if (A07 < A08 && i2 > 0) {
            int bytesToRead = Math.min(i2, A08 - A07);
            iq.A0d(this.A07.A00, A07, bytesToRead);
            this.A07.A0Z(A07 + bytesToRead);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(IQ iq, int i) {
        if (i < 19) {
            return;
        }
        this.A05 = iq.A0J();
        this.A04 = iq.A0J();
        iq.A0a(11);
        this.A02 = iq.A0J();
        this.A03 = iq.A0J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(IQ iq, int i) {
        if (i % 5 != 2) {
            return;
        }
        iq.A0a(2);
        Arrays.fill(this.A08, 0);
        int i2 = i / 5;
        for (int r = 0; r < i2; r++) {
            int A0F = iq.A0F();
            int A0F2 = iq.A0F();
            int A0F3 = iq.A0F();
            int A0F4 = iq.A0F();
            int entryCount = iq.A0F();
            int cb = A0F4 - 128;
            double d = A0F2 - (cb * 0.34414d);
            int i3 = A0F3 - 128;
            int i4 = (int) (d - (i3 * 0.71414d));
            int i5 = A0F4 - 128;
            int[] iArr = this.A08;
            int i6 = C0726Ig.A06((int) (A0F2 + ((A0F3 - 128) * 1.402d)), 0, 255);
            int i7 = (entryCount << 24) | (i6 << 16);
            int i8 = C0726Ig.A06(i4, 0, 255);
            iArr[A0F] = i7 | (i8 << 8) | C0726Ig.A06((int) (A0F2 + (i5 * 1.772d)), 0, 255);
        }
        this.A06 = true;
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x003b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GF A07() {
        int i;
        int i2;
        if (this.A05 == 0 || this.A04 == 0 || this.A01 == 0 || this.A00 == 0 || this.A07.A08() == 0 || this.A07.A07() != this.A07.A08() || !this.A06) {
            return null;
        }
        this.A07.A0Z(0);
        int[] iArr = new int[this.A01 * this.A00];
        int i3 = 0;
        while (i3 < argbBitmapDataIndex) {
            int A0F = this.A07.A0F();
            if (A0F != 0) {
                int argbBitmapDataIndex = this.A08[A0F];
                iArr[i3] = argbBitmapDataIndex;
                i3++;
            } else {
                int A0F2 = this.A07.A0F();
                if (A0F2 != 0) {
                    int switchBits = A0F2 & 64;
                    if (switchBits == 0) {
                        i = A0F2 & 63;
                    } else {
                        int color = A0F2 & 63;
                        int i4 = color << 8;
                        int color2 = this.A07.A0F();
                        i = i4 | color2;
                    }
                    int runLength = A0F2 & 128;
                    if (runLength == 0) {
                        i2 = 0;
                    } else {
                        int[] iArr2 = this.A08;
                        IQ iq = this.A07;
                        String[] strArr = A09;
                        String str = strArr[6];
                        String str2 = strArr[2];
                        int length = str.length();
                        int color3 = str2.length();
                        if (length != color3) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A09;
                        strArr2[6] = "LobxqobSp0chhe0OZFFwjgoplyKrXQLj";
                        strArr2[2] = "nSlIIcYQrdb8UpaoVkH7kLQAXSG8FoO0";
                        int color4 = iq.A0F();
                        i2 = iArr2[color4];
                    }
                    int color5 = i3 + i;
                    Arrays.fill(iArr, i3, color5, i2);
                    i3 += i;
                } else {
                    continue;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.A01, this.A00, Bitmap.Config.ARGB_8888);
        int i5 = this.A05;
        int i6 = this.A04;
        return new GF(createBitmap, this.A02 / i5, 0, this.A03 / i6, 0, this.A01 / i5, this.A00 / i6);
    }

    public final void A08() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0X(0);
        this.A06 = false;
    }
}