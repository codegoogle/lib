package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C05169o extends AbstractC0724Ie {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ C1118Xt A00;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{112, 88, 78, 72, 88, 118};
        String[] strArr = A02;
        if (strArr[2].charAt(21) == strArr[1].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "AaqsZ0kN0wdt4PxPT80lhbaiVomD";
        strArr2[4] = "AaqsZ0kN0wdt4PxPT80lhbaiVomD";
    }

    public static void A02() {
        A02 = new String[]{"0EtrvwW3MQkzSecFvnBX4JMfeqt66nTs", "31KVsJeKTKhLPCOslR3tmLkuK1Xd7IZW", "ErGHvP3zkyEh4xX1eQlIOsNtLUt9M6Nd", "ktedtIytEv2FRFoF5SCcQiRhp3TIfz9L", "y7SJDh6vytCFGPm3eUSBlWJktjn6", "2Pj8nikJl49sV4F", "Af2d4ar6BC4UZ7hhvi", "JNiO58cgS0ZkwkRgj9Y5ghYAFIamZa37"};
    }

    public C05169o(C1118Xt c1118Xt) {
        this.A00 = c1118Xt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cf, code lost:
        if (r2 >= 1.0f) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
        r5 = r7.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e0, code lost:
        if (com.facebook.ads.redexgen.X.C05169o.A02[0].charAt(25) == 'q') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f8, code lost:
        if (r2 >= 1.0f) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011c, code lost:
        r2 = com.facebook.ads.redexgen.X.C05169o.A02;
        r2[0] = "C6yUCx24zOlG0J7cvymFZeeDzq1xacyW";
        r2[0] = "C6yUCx24zOlG0J7cvymFZeeDzq1xacyW";
        r0 = r5.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012c, code lost:
        if (r0 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012e, code lost:
        r0 = r7.A00.A04;
        r0.setToolbarActionMode(1);
     */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A03 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A04(C04737s c04737s) {
        C0792Lb c0792Lb;
        C0792Lb c0792Lb2;
        C1080Wh c1080Wh;
        boolean z;
        HU hu;
        HU hu2;
        HU hu3;
        int i;
        M1 m1;
        int i2;
        M1 m12;
        M1 m13;
        RR rr;
        M1 m14;
        int i3;
        M1 m15;
        M1 m16;
        C0702Hi c0702Hi;
        C0702Hi c0702Hi2;
        C0702Hi c0702Hi3;
        C0792Lb c0792Lb3;
        Handler handler;
        c0792Lb = this.A00.A09;
        if (c0792Lb == null) {
            return;
        }
        int A00 = c04737s.A00();
        c0792Lb2 = this.A00.A09;
        int duration = c0792Lb2.getDuration();
        if (A02[4].length() == 28) {
            String[] strArr = A02;
            strArr[2] = "TbAO2dDqBDoNQ2bRUMqGtM03oOW5oInT";
            strArr[1] = "7usa1bkUEfgMRCOaWWj5lxH1mcKQdA4B";
            int i4 = duration - A00;
            c1080Wh = this.A00.A0R;
            if (J8.A0w(c1080Wh)) {
                c0792Lb3 = this.A00.A09;
                if (c0792Lb3.getState() == EnumC0898Pe.A02) {
                    handler = this.A00.A0M;
                    handler.postDelayed(new Y5(this, A00), 5000L);
                }
            }
            z = this.A00.A0h;
            if (z) {
                c0702Hi = this.A00.A0B;
                if (c0702Hi != null && i4 <= 3000) {
                    c0702Hi2 = this.A00.A0B;
                    if (c0702Hi2.A0K()) {
                        c0702Hi3 = this.A00.A0B;
                        c0702Hi3.A0G();
                    }
                }
            } else {
                hu = this.A00.A0C;
                if (hu != null) {
                    hu2 = this.A00.A0C;
                    if (hu2.A0H() && i4 <= 3000) {
                        hu3 = this.A00.A0C;
                        hu3.A0G();
                    }
                }
            }
            i = this.A00.A01;
            if (i > 0) {
                float f = A00;
                i3 = this.A00.A01;
                float f2 = i3;
                String[] strArr2 = A02;
                if (strArr2[2].charAt(21) != strArr2[1].charAt(21)) {
                    String[] strArr3 = A02;
                    strArr3[2] = "KNrwLfAolWq8E2xnnNCyl8EcaoCJ7z9e";
                    strArr3[1] = "xM5zDgznR62IFK5BHz2dZbxYn3IDVbku";
                    float f3 = f / (f2 * 1000.0f);
                    m16 = this.A00.A04;
                    float seenPercentage = 100.0f * f3;
                    m16.setProgress(seenPercentage);
                } else {
                    float f4 = f / (f2 * 1000.0f);
                    m15 = this.A00.A04;
                    float seenPercentage2 = 100.0f * f4;
                    m15.setProgress(seenPercentage2);
                }
            }
            m1 = this.A00.A04;
            if (m1 == null) {
                return;
            }
            i2 = this.A00.A0K;
            int i5 = i2 - (A00 / 1000);
            if (i5 > 0) {
                rr = this.A00.A0P;
                String replace = rr.A0P().A00().replace(A00(0, 6, 16), String.valueOf(i5));
                m14 = this.A00.A04;
                m14.setToolbarActionMessage(replace);
                return;
            }
            m12 = this.A00.A04;
            m12.setToolbarActionMessage(A00(0, 0, 116));
            m13 = this.A00.A04;
            m13.setToolbarActionMode(1);
            return;
        }
        throw new RuntimeException();
    }
}