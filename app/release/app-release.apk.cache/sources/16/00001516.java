package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class XG implements C8J {
    public static XG A05;
    public static byte[] A06;
    public static String[] A07;
    public C0V A00;
    public C8I A01;
    @Nullable
    public C8U A02;
    public AnonymousClass97 A03;
    @Nullable
    public QN A04;

    static {
        A07();
        A06();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[7].length()) {
                break;
            }
            String[] strArr2 = A07;
            strArr2[6] = "Hv2WK1fJh7GnXaP";
            strArr2[7] = "jwUFRNkRPBL5IaL";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            int i5 = copyOfRange[i4] - i3;
            String[] strArr3 = A07;
            if (strArr3[4].charAt(26) != strArr3[0].charAt(26)) {
                break;
            }
            String[] strArr4 = A07;
            strArr4[2] = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG";
            strArr4[3] = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw";
            copyOfRange[i4] = (byte) (i5 - 98);
            i4++;
        }
    }

    public static void A06() {
        A06 = new byte[]{-59, -57, -13, -15, -15, -57, -16, 2, 16, 16, 6, 12, Flags.CD, -67, 1, -2, 17, -2, -67, 6, Flags.CD, 6, 17, 6, -2, 9, 6, 23, 2, 1, 33, 20, 31, 30, 33, 35, 2, 20, 34, 34, 24, 30, 29, -13, 16, 35, 16, -8, 29, 24, 35, 24, 16, 27, 24, 41, 20, 19};
        if (A07[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    public static void A07() {
        A07 = new String[]{"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    }

    @Nullable
    public static C5X A00(C1081Wi c1081Wi, @Nullable QN qn) {
        if (!J8.A13(c1081Wi) || qn == null) {
            return null;
        }
        return C5Y.A00().A01(qn);
    }

    public static C8U A01(C1081Wi c1081Wi) {
        return C8V.A00().A01(c1081Wi);
    }

    public static synchronized XG A02() {
        XG xg;
        String[] strArr = A07;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[2] = "yNOYv8BJbeG1jc93xecDuC4SV0M6ZsAO";
        strArr2[3] = "rgM7W1LhEjhuRpvAxAxTebmxK2ArHzjw";
        synchronized (XG.class) {
            if (A05 == null) {
                A05 = new XG();
            }
            xg = A05;
        }
        return xg;
    }

    @Nullable
    public static InterfaceC0906Pm A03(C1081Wi c1081Wi) {
        if (!J8.A10(c1081Wi)) {
            return null;
        }
        return Q4.A01(c1081Wi);
    }

    @Nullable
    public static QN A04(C1081Wi c1081Wi, C8U c8u, @Nullable InterfaceC0906Pm interfaceC0906Pm) {
        if (!J8.A1W(c1081Wi) || interfaceC0906Pm == null) {
            return null;
        }
        return QO.A00().A01(c8u, interfaceC0906Pm, KJ.A05(c1081Wi), new XF(new KC(c1081Wi, A05(0, 0, 122), null, EnumC0760Js.A08, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, 0, AdSettings.isTestMode(c1081Wi), AdSettings.isMixedAudience(), new C0765Jx(), LN.A01(J8.A0H(c1081Wi)), null, null), c1081Wi), QL.A00().A00());
    }

    public static void A08() {
        String A052 = A05(30, 28, 77);
        if (A07[5].length() == 20) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        strArr[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        K0.A05(A052, A05(6, 24, 59), A05(0, 6, 46));
    }

    public static void A09(C1081Wi c1081Wi, @Nullable C5X c5x) {
        if (!J8.A13(c1081Wi) || c5x == null) {
            return;
        }
        C5V.A00().A01(c5x, c1081Wi);
    }

    public static void A0A(C1081Wi c1081Wi, @Nullable QN qn) {
        if (!J8.A0f(c1081Wi) || qn == null) {
            return;
        }
        new C04255s(c1081Wi, qn, new C04265t(), DynamicLoaderImpl.getBidderTokenProviderApi());
    }

    public final synchronized C8U A0B(C8H c8h) {
        if (this.A02 == null) {
            this.A02 = A01(c8h.A00());
        }
        return this.A02;
    }

    @Nullable
    public final synchronized QN A0C() {
        return this.A04;
    }

    public final synchronized void A0D(C1081Wi c1081Wi) {
        if (this.A04 != null) {
            return;
        }
        this.A02 = A01(c1081Wi);
        this.A04 = A04(c1081Wi, this.A02, A03(c1081Wi));
        A09(c1081Wi, A00(c1081Wi, this.A04));
        A0A(c1081Wi, this.A04);
        if (this.A04 != null) {
            this.A04.A59();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8J
    public final JE A5H(C1081Wi c1081Wi) {
        return C1248bE.A01(c1081Wi);
    }

    @Override // com.facebook.ads.redexgen.X.C8J
    public final synchronized C8I A5V(C8H c8h) {
        if (this.A01 == null) {
            this.A01 = new XD(this);
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C8J
    public final synchronized InterfaceC04838h A5z(C8H c8h) {
        return new C1097Wy(c8h);
    }

    @Override // com.facebook.ads.redexgen.X.C8J
    public final synchronized C8K A68(C8H c8h) {
        XB xb;
        xb = new XB(this, c8h);
        String[] strArr = A07;
        if (strArr[4].charAt(26) != strArr[0].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[1] = "2Vt1OUprKjNjnyD3";
        strArr2[1] = "2Vt1OUprKjNjnyD3";
        return xb;
    }

    @Override // com.facebook.ads.redexgen.X.C8J
    @Nullable
    public final synchronized C0V A6K(C8H c8h) {
        if (!J8.A0n(c8h)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0W.A00().A01(new XE(this, c8h));
        }
        C0V c0v = this.A00;
        if (A07[5].length() != 20) {
            String[] strArr = A07;
            strArr[4] = "VIV2EvMRfEPiWlvmDKty9fFKFHJul9Yn";
            strArr[0] = "0wfCQdIt8NwFYvPKQ0QtM4LE4vJ9WdpV";
            return c0v;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C8J
    public final synchronized C8L A6r(C8H c8h) {
        return new XC(this, c8h);
    }

    @Override // com.facebook.ads.redexgen.X.C8J
    public final synchronized AnonymousClass97 A6x() {
        if (this.A03 == null) {
            this.A03 = new AnonymousClass97();
            A08();
        }
        return this.A03;
    }
}