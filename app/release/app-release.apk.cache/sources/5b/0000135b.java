package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.xbill.DNS.WKSRecord;

/* loaded from: assets/audience_network.dex */
public final class Q4 {
    @Nullable
    public static InterfaceC0904Pk A00;
    public static byte[] A01;
    public static String[] A02;
    public static final Set<String> A03;
    public static final Set<String> A04;
    public static final AtomicBoolean A05;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{36, 121, 104, 23, 81, 81, 30, 99, 22, 103, g15.c, 85, 116, 20, 73, 126, 19, 74, 72, 66, 77, 20, 78, 81, 86, 20, 115, 73, 85, 77, 27, 44, 9, 86, 113, 76, 80, 116, 73, 92, 87, 72, 84, 17, 109, 87, 92, 126, 82, 76, 72, 8, 83, 108, 82, 21, 67, 104, 73, 7, 48, 14, 124, 116, 29, 56, 9, 120, 53, 0, 15, 40, 32, 37, 120, 62, 60, 56, 53, 61, 13, 9, 47, 54, 20, 3, 41, 13, 113, 70, 1, bx.W5, 59, 56, 32, 61, 36, 38, 33, 40, 111, 45, bx.W5, 41, 32, 61, bx.W5, 111, 38, 33, 38, 59, 110, 125, g15.c, 125, 108, 19, 68, 75, g15.c, 71, 65, 110, 67, 14, 81, 68, 112, 119, 65, 75, 92, 112, 109, 16, 76, 85, 66, 104, 24, 47, 72, 64, 91, 89, 69, 72, 71, 76, 118, 68, 70, 77, 76, 118, 70, 71, 57, 50, 35, 32, 56, 37, 60, 29, 6, 51, 91, 46, 59, 7, 59, 3, bx.W5, 80, 57, 92, ax5.a, ax5.a, 60, 13, bx.W5, 25, 38, 27, 47, 33, 81, 5, 15, 56, 84, 99};
    }

    public static void A08() {
        A02 = new String[]{"b", "jWWIi2TrnHAAyoG5itvaKpzBpE6rwsKb", "4piz2zd6PBPCOA5LKuru6huyc0Gk9hmI", "ThWxRwfxtMClt6xxWNEGrvPqHoOGiBgN", "VC0ltrZe3ujZ5yBmE9F34w5pTHRf8GMT", "g0Z7XyqsbnnTrD4DkPgr08gcmreNHhpx", "VVYGWntGozQ2sTcwE1XxLnyTeGzWkyyX", "XVqTwdXEkxL4UUDwn3dakWK60VTsxJd5"};
    }

    static {
        A08();
        A07();
        A03 = new HashSet();
        A04 = new HashSet();
        A03.add(A05(3, 29, 30));
        A04.add(A05(165, 29, 81));
        A04.add(A05(32, 29, 2));
        A04.add(A05(61, 29, 116));
        A04.add(A05(113, 29, 29));
        A05 = new AtomicBoolean();
    }

    public static InterfaceC0906Pm A00(C8H c8h) {
        return A03(true, c8h);
    }

    public static InterfaceC0906Pm A01(C8H c8h) {
        return A02(true, c8h);
    }

    public static InterfaceC0906Pm A02(boolean z, C8H c8h) {
        C0910Pq c0910Pq = new C0910Pq();
        C0913Pt A042 = A04(c8h);
        if (!A0B()) {
            c0910Pq.A02(A04);
            c0910Pq.A01(A03);
        }
        if (C0788Kx.A04()) {
            Map<String, String> A022 = C0788Kx.A02();
            String[] strArr = A02;
            if (strArr[2].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "6CjO7LbqJIONUadrRHmx0RuGBypxStir";
            strArr2[3] = "VKsjD9ddp6JrHwn0FL0Df9QGs7RhJ4JT";
            A042.A08(A022);
        }
        return AbstractC0908Po.A00().A01(c0910Pq.A00(A042.A09()).A03(z).A04(BuildConfigApi.isDebug()).A05(), c8h.A04(), ExecutorC0800Lj.A01());
    }

    public static InterfaceC0906Pm A03(boolean z, C8H c8h) {
        return AbstractC0908Po.A00().A01(new C0910Pq().A03(z).A00(A04(c8h).A09()).A04(BuildConfigApi.isDebug()).A05(), c8h.A04(), ExecutorC0800Lj.A01());
    }

    public static C0913Pt A04(C8H c8h) {
        A09(c8h);
        C0913Pt c0913Pt = new C0913Pt();
        if (A0B()) {
            c0913Pt.A02(360000).A04(120000);
        } else {
            int A07 = J8.A07(c8h);
            if (A02[4].charAt(20) == 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "dD0oPHmij4s2ObzR7OPOejAtm2pYkwQj";
            strArr[1] = "6BD1tyrnooF6YeHGpiFkkFGNAjU2pFFN";
            c0913Pt.A02(A07);
        }
        c0913Pt.A03(J8.A08(c8h)).A04(J8.A09(c8h)).A05(J8.A0A(c8h)).A06(J8.A0B(c8h));
        synchronized (Q4.class) {
            if (A00 != null && (A00 instanceof InterfaceC0904Pk)) {
                c0913Pt.A07(A00);
            }
        }
        return c0913Pt;
    }

    public static void A06() {
        A05.set(true);
    }

    public static void A09(C8H c8h) {
        if (!A05.get()) {
            c8h.A04().A82(A05(158, 7, 111), C04848i.A1g, new C04858j(A05(90, 23, 119)));
        }
    }

    public static synchronized void A0A(InterfaceC0904Pk interfaceC0904Pk) {
        synchronized (Q4.class) {
            A00 = interfaceC0904Pk;
        }
    }

    public static boolean A0B() {
        String urlPrefix = AdInternalSettings.getUrlPrefix();
        return !TextUtils.isEmpty(urlPrefix) && urlPrefix.endsWith(A05(0, 3, 50));
    }

    public static boolean A0C(C8H c8h) {
        int i = Build.VERSION.SDK_INT;
        String A052 = A05(WKSRecord.Service.BL_IDM, 16, 17);
        if (i < 17) {
            return Settings.System.getInt(c8h.getContentResolver(), A052, 0) != 0;
        }
        int i2 = Settings.Global.getInt(c8h.getContentResolver(), A052, 0);
        if (A02[0].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "6SlcDzdssqL5L6jmaJN4q0YtRJ9ZiIN0";
        strArr[1] = "IhCDgNyX5tEXKuNPsF1SGphg5lyX1n5g";
        return i2 != 0;
    }
}