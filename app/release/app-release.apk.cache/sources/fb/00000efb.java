package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.7D  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7D implements Callable<Boolean> {
    public static byte[] A02;
    public static String[] A03;
    public final C7G A00;
    public final /* synthetic */ C7H A01;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{114, 126, 109, 116, 106, 111, 43, 52, 57, 56, 50};
        if (A03[1].length() != 15) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[7] = "XFV0lH04tD";
        strArr[5] = "8rdCtS3Igw";
    }

    public static void A03() {
        A03 = new String[]{"4L70rbdc", "PBHhMXx0npnpwTY", "91GJPzFmEyeOW3DYeKz29HPCrWXW0gNC", "umTRidE45okZulrVlJrHIV8", "kRbho3HgdeG0CdJ8rA209tRImftPXEnI", "60YY30c8MY", "ZuHjaYDngPTOcLYvMZdLe8TI8ruUn8GD", "lL0vcWHD5F"};
    }

    public C7D(C7H c7h, C7G c7g) {
        this.A01 = c7h;
        this.A00 = c7g;
    }

    private final Boolean A00() {
        C8H c8h;
        C8H c8h2;
        AnonymousClass00 A022;
        Map map;
        if (KU.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            AnonymousClass06 anonymousClass06 = new AnonymousClass06(this.A00.A08, this.A00.A07, this.A00.A06, this.A00.A04 ? A01(0, 6, 63) : A01(6, 5, 125), this.A00.A02, this.A00.A05);
            anonymousClass06.A04 = this.A00.A03;
            anonymousClass06.A02 = this.A00.A01;
            anonymousClass06.A05 = this.A00.A04;
            c8h = this.A01.A04;
            if (C7K.A06(c8h)) {
                map = C7H.A0E;
                map.put(this.A00.A08, anonymousClass06);
            }
            c8h2 = this.A01.A04;
            A022 = C7H.A02(c8h2.A00());
            return Boolean.valueOf(A022.ACY(anonymousClass06) != null);
        } catch (Throwable th) {
            KU.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (KU.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            KU.A00(th, this);
            return null;
        }
    }
}