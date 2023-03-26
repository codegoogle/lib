package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.yg1;
import java.io.IOException;
import java.util.Arrays;
import org.xbill.DNS.TTL;

/* renamed from: com.facebook.ads.redexgen.X.Dh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0603Dh {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{10, 76, 69, 88, 10, 94, 83, 90, 79, 10, 66, 89, 30, 22, 13, 67, 89, 84, g15.c, 98, 121, 124, 55, 126, 100, 55, 99, 120, 120, 55, 123, 118, 101, 112, 114, 55, ax5.a, 105, 37, 80, 85, 60, 62, 55, 99, 120, 55, 100, 124, 126, 103, 44, 55, 126, 115, 45, 55, 84, 105, 97, 116, 114, 101, 116, 117, 49, 115, 125, 126, 114, 122, 49, 112, 125, 120, 118, g15.c, 124, 116, g15.c, 101, 43, 49, 92, 114, 123, 122, 103, 124, 123, 114, 53, 96, 123, 126, 123, 122, 98, 123, 53, 66, 84, 67, 53, 118, 125, 96, 123, 126, 47, 53, 108, 119, 120, 120, 119, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, 2, 112, 107, 100, 100, 2, 68, 77, 80, 79, 67, 86, 24, 2, 109, 86, 75, 77, 72, 72, 87, 74, 76, 93, 92, 24, 111, 121, 110, 24, 90, 81, 76, 24, 92, 93, 72, 76, 80, 24, 106, 81, 76, 74, 79, 79, 80, 77, 75, 90, 91, 31, 104, 126, 105, 31, 89, 80, 77, 82, 94, 75, 31, 75, 70, 79, 90, 5, 31, 5, 19, 4, 23, 24, 46, 57, 7, bx.W5, 46, 43, bx.W5, 61, 29, bx.W5, 46, 43, bx.W5, 61, 102, 99, 118, 99, 19, 24, 1, 85};
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x007a */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZG A00(CL cl) throws IOException, InterruptedException {
        I1.A01(cl);
        IQ iq = new IQ(16);
        if (C0602Dg.A00(cl, iq).A00 != C0726Ig.A08(A01(111, 4, 14))) {
            return null;
        }
        int expectedBlockAlignment = 4;
        cl.ABZ(iq.A00, 0, 4);
        iq.A0Z(0);
        int A09 = iq.A09();
        int A08 = C0726Ig.A08(A01(yg1.N, 4, 98));
        String A01 = A01(199, 15, 127);
        if (A09 != A08) {
            Log.e(A01, A01(115, 25, 18) + A09);
            return null;
        }
        C0602Dg A002 = C0602Dg.A00(cl, iq);
        while (r5 != riffFormat) {
            cl.A3M((int) A002.A01);
            A002 = C0602Dg.A00(cl, iq);
        }
        int riffFormat = (A002.A01 > 16L ? 1 : (A002.A01 == 16L ? 0 : -1));
        I1.A04(riffFormat >= 0);
        cl.ABZ(iq.A00, 0, 16);
        iq.A0Z(0);
        int bitsPerSample = iq.A0D();
        int A0D = iq.A0D();
        int A0C = iq.A0C();
        int A0C2 = iq.A0C();
        int blockAlignment = iq.A0D();
        int averageBytesPerSecond = iq.A0D();
        int sampleRateHz = A0D * averageBytesPerSecond;
        int i = sampleRateHz / 8;
        if (blockAlignment == i) {
            if (bitsPerSample != 1) {
                if (bitsPerSample == 3) {
                    if (averageBytesPerSecond != 32) {
                        expectedBlockAlignment = 0;
                    }
                    if (expectedBlockAlignment != 0) {
                        Log.e(A01, A01(140, 26, 8) + averageBytesPerSecond + A01(0, 10, 26) + bitsPerSample);
                        return null;
                    }
                    int sampleRateHz2 = (int) A002.A01;
                    cl.A3M(sampleRateHz2 - 16);
                    return new ZG(A0D, A0C, A0C2, blockAlignment, averageBytesPerSecond, expectedBlockAlignment);
                } else if (bitsPerSample != 65534) {
                    Log.e(A01, A01(166, 29, 15) + bitsPerSample);
                    return null;
                }
            }
            expectedBlockAlignment = C0726Ig.A02(averageBytesPerSecond);
            if (expectedBlockAlignment != 0) {
            }
        } else {
            throw new AN(A01(57, 26, 33) + i + A01(10, 7, 73) + blockAlignment);
        }
    }

    public static void A03(CL cl, ZG zg) throws IOException, InterruptedException {
        I1.A01(cl);
        I1.A01(zg);
        cl.ACa();
        IQ iq = new IQ(8);
        C0602Dg A002 = C0602Dg.A00(cl, iq);
        while (A002.A00 != C0726Ig.A08(A01(214, 4, 50))) {
            Log.w(A01(199, 15, 127), A01(83, 28, 37) + A002.A00);
            long bytesToSkip = A002.A01 + 8;
            if (A002.A00 == C0726Ig.A08(A01(111, 4, 14))) {
                bytesToSkip = 12;
            }
            if (bytesToSkip <= TTL.MAX_VALUE) {
                cl.ADG((int) bytesToSkip);
                A002 = C0602Dg.A00(cl, iq);
            } else {
                throw new AN(A01(17, 40, 39) + A002.A00);
            }
        }
        cl.ADG(8);
        zg.A06(cl.A6m(), A002.A01);
    }
}