package com.facebook.ads.redexgen.X;

import com.anythink.expressad.foundation.g.a;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.yg1;
import java.util.Arrays;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.Cl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0581Cl {
    public static byte[] A01;
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public static final int A0x;
    public static final int A0y;
    public static final int A0z;
    public static final int A10;
    public static final int A11;
    public static final int A12;
    public static final int A13;
    public static final int A14;
    public static final int A15;
    public static final int A16;
    public static final int A17;
    public static final int A18;
    public static final int A19;
    public static final int A1A;
    public static final int A1B;
    public static final int A1C;
    public static final int A1D;
    public static final int A1E;
    public static final int A1F;
    public static final int A1G;
    public static final int A1H;
    public static final int A1I;
    public static final int A1J;
    public static final int A1K;
    public static final int A1L;
    public static final int A1M;
    public static final int A1N;
    public static final int A1O;
    public static final int A1P;
    public static final int A1Q;
    public static final int A1R;
    public static final int A1S;
    public static final int A1T;
    public static final int A1U;
    public static final int A1V;
    public static final int A1W;
    public final int A00;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{5, 70, 91, 24, 2, 2, 27, 26, 94, 92, 18, 12, 57, 52, 57, 59, 29, 10, 31, 77, 58, 45, 56, 104, 0, 23, 2, 34, 49, 100, 98, 106, 103, 101, 105, 105, 119, 123, 34, 32, 49, 38, 38, 33, 38, 112, 116, 113, 51, 54, 52, 100, 105, 108, 121, 108, 62, 62, 46, 41, 44, 45, 43, 123, 52, 36, 35, 51, 70, 86, 81, 71, 38, 54, 49, bx.W5, 18, 2, 5, 26, 73, 79, 1, 31, 1, 0, 16, 23, 1, 8, 23, 16, 98, 106, 116, 96, 8, 3, 14, 12, 15, 4, 9, 28, 97, 119, 96, 119, 116, 96, g15.c, 115, 111, 125, 112, 121, bx.W5, 38, 46, 48, 9, 4, 23, 80, 87, 73, 92, 14, 100, 122, 111, 79, 18, 23, 8, 15, 96, 124, 111, 97, 77, 68, 65, 84, 80, 89, 85, 89, 96, 105, 100, 108, 106, 98, 102, 105, 113, 121, 116, 120, 40, 32, 49, 36, 70, 66, 69, 77, 94, 92, 92, 85, 101, 103, 103, 126, 0, 29, 89, 12, 112, 109, 41, 107, 8, 19, 0, 29, 103, 124, 98, 110, 61, 50, 62, 54, 50, 35, 49, 50, 62, 60, 33, 36, Flags.CD, 8, 8, 19, 16, 81, 85, 80, 46, 60, 52, 50, 90, 72, 64, 83, 31, 13, 1, 30, 118, 100, 114, 103, 13, 28, 25, 14, 124, 108, 103, 102, 98, 114, 121, 124, 43, 61, 54, 59, 22, 2, 21, 1, 110, 116, 121, 101, 73, 83, 84, 92, 37, 57, 33, 34, 16, 23, 80, 7, 3, 4, 18, 28, 78, 73, 94, 82, 101, 98, 102, 102, Flags.CD, 12, Flags.CD, 27, 98, 101, 98, 117, 97, 102, 97, 97, 80, 87, 80, 89, 0, 7, 7, 0, 37, 34, 44, 100, 122, g15.c, 58, 109, 78, 95, 84, 89, 114, 96, 98, 114, 48, 34, 44, 32, 55, 40, 43, 39, 106, 108, g15.c, 120, 122, 124, 111, 101, 28, 26, 13, 16, 67, 69, 66, 89, 109, 97, bx.W5, 126, 34, 51, 35, 54, 25, 25, 5, 8, 14, 21, 16, 28, 71, 65, 1, 9, 85, 83, 19, 26, 87, 81, 66, 98, 59, 45, 58, 41, 113, 112, 114, 114};
    }

    static {
        A04();
        A0U = C0726Ig.A08(A03(112, 4, 84));
        A06 = C0726Ig.A08(A03(16, 4, 33));
        A07 = C0726Ig.A08(A03(20, 4, 6));
        A0X = C0726Ig.A08(A03(124, 4, 98));
        A0W = C0726Ig.A08(A03(120, 4, 60));
        A0s = C0726Ig.A08(A03(208, 4, 62));
        A0D = C0726Ig.A08(A03(44, 4, 31));
        A0b = C0726Ig.A08(A03(140, 4, 125));
        A0k = C0726Ig.A08(A03(176, 4, 48));
        A03 = C0726Ig.A08(A03(0, 4, 118));
        A1V = C0726Ig.A08(A03(364, 4, 17));
        A0a = C0726Ig.A08(A03(WKSRecord.Service.PROFILE, 4, 81));
        A14 = C0726Ig.A08(A03(256, 4, 11));
        A04 = C0726Ig.A08(A03(8, 4, 98));
        A0E = C0726Ig.A08(A03(48, 4, 10));
        A0M = C0726Ig.A08(A03(80, 4, 113));
        A0H = C0726Ig.A08(A03(60, 4, 21));
        A0I = C0726Ig.A08(A03(64, 4, 13));
        A0K = C0726Ig.A08(A03(72, 4, 31));
        A0L = C0726Ig.A08(A03(76, 4, 43));
        A0J = C0726Ig.A08(A03(68, 4, 127));
        A0G = C0726Ig.A08(A03(56, 4, 7));
        A1H = C0726Ig.A08(A03(308, 4, 91));
        A1I = C0726Ig.A08(A03(312, 4, 25));
        A1M = C0726Ig.A08(A03(328, 4, 53));
        A1N = C0726Ig.A08(A03(332, 4, 106));
        A12 = C0726Ig.A08(A03(248, 4, 64));
        A0j = C0726Ig.A08(A03(172, 4, 85));
        A0n = C0726Ig.A08(A03(188, 4, 87));
        A1L = C0726Ig.A08(A03(324, 4, 83));
        A0d = C0726Ig.A08(A03(148, 4, 80));
        A0h = C0726Ig.A08(A03(164, 4, 118));
        A16 = C0726Ig.A08(A03(264, 4, 45));
        A08 = C0726Ig.A08(A03(24, 4, 60));
        A0Y = C0726Ig.A08(A03(128, 4, 81));
        A0S = C0726Ig.A08(A03(104, 4, 89));
        A0i = C0726Ig.A08(A03(168, 4, 110));
        A1K = C0726Ig.A08(A03(320, 4, 67));
        A0m = C0726Ig.A08(A03(yg1.E, 4, 56));
        A0f = C0726Ig.A08(A03(156, 4, 65));
        A1J = C0726Ig.A08(A03(aa.a.q, 4, 30));
        A0N = C0726Ig.A08(A03(84, 4, 57));
        A0O = C0726Ig.A08(A03(88, 4, 57));
        A0c = C0726Ig.A08(A03(144, 4, 96));
        A0V = C0726Ig.A08(A03(116, 4, 31));
        A1A = C0726Ig.A08(A03(280, 4, 76));
        A0r = C0726Ig.A08(A03(204, 4, 38));
        A13 = C0726Ig.A08(A03(252, 4, 103));
        A0z = C0726Ig.A08(A03(236, 4, 76));
        A0y = C0726Ig.A08(A03(232, 4, 82));
        A1G = C0726Ig.A08(A03(304, 4, 103));
        A0R = C0726Ig.A08(A03(100, 4, 55));
        A0Q = C0726Ig.A08(A03(96, 4, 48));
        A0T = C0726Ig.A08(A03(108, 4, 79));
        A0u = C0726Ig.A08(A03(216, 4, 116));
        A0t = C0726Ig.A08(A03(212, 4, 0));
        A0x = C0726Ig.A08(A03(228, 4, 35));
        A11 = C0726Ig.A08(A03(244, 4, 56));
        A1Q = C0726Ig.A08(A03(344, 4, 49));
        A10 = C0726Ig.A08(A03(240, 4, 5));
        A0p = C0726Ig.A08(A03(196, 4, 31));
        A02 = C0726Ig.A08(A03(4, 4, 11));
        A1R = C0726Ig.A08(A03(348, 4, 37));
        A0l = C0726Ig.A08(A03(180, 4, 64));
        A1D = C0726Ig.A08(A03(292, 4, 46));
        A1B = C0726Ig.A08(A03(284, 4, 79));
        A0C = C0726Ig.A08(A03(40, 4, 15));
        A19 = C0726Ig.A08(A03(276, 4, 37));
        A1C = C0726Ig.A08(A03(a.aW, 4, 126));
        A1E = C0726Ig.A08(A03(a.aP, 4, 11));
        A17 = C0726Ig.A08(A03(268, 4, 96));
        A0B = C0726Ig.A08(A03(36, 4, 73));
        A1O = C0726Ig.A08(A03(336, 4, 68));
        A1W = C0726Ig.A08(A03(368, 4, 91));
        A18 = C0726Ig.A08(A03(272, 4, 75));
        A09 = C0726Ig.A08(A03(28, 4, 15));
        A0v = C0726Ig.A08(A03(220, 4, 49));
        A0w = C0726Ig.A08(A03(224, 4, 88));
        A1P = C0726Ig.A08(A03(340, 4, 10));
        A0g = C0726Ig.A08(A03(160, 4, 24));
        A0Z = C0726Ig.A08(A03(WKSRecord.Service.CISCO_SYS, 4, 38));
        A0e = C0726Ig.A08(A03(152, 4, 90));
        A0o = C0726Ig.A08(A03(yg1.K, 4, 14));
        A0F = C0726Ig.A08(A03(52, 4, 80));
        A0P = C0726Ig.A08(A03(92, 4, 90));
        A15 = C0726Ig.A08(A03(260, 4, 62));
        A1F = C0726Ig.A08(A03(300, 4, 84));
        A0q = C0726Ig.A08(A03(200, 4, 19));
        A1S = C0726Ig.A08(A03(352, 4, 108));
        A1T = C0726Ig.A08(A03(356, 4, 126));
        A1U = C0726Ig.A08(A03(360, 4, 124));
        A0A = C0726Ig.A08(A03(32, 4, 89));
        A05 = C0726Ig.A08(A03(12, 4, 5));
    }

    public AbstractC0581Cl(int i) {
        this.A00 = i;
    }

    public static int A00(int i) {
        return 16777215 & i;
    }

    public static int A01(int i) {
        return (i >> 24) & 255;
    }

    public static String A02(int i) {
        return A03(0, 0, 99) + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return A02(this.A00);
    }
}