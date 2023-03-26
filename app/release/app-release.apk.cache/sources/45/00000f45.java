package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.zg2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.8c  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04798c {
    @VisibleForTesting
    public static SparseIntArray A00;
    @VisibleForTesting
    public static Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05;
    public static final List<Integer> A06;
    public static final List<C04808d> A07;
    public static final AtomicBoolean A08;
    public static final AtomicInteger A09;
    public static final AtomicReference<InterfaceC04778a> A0A;
    public static final AtomicReference<InterfaceC04788b> A0B;
    public static final AtomicReference<Boolean> A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-93, -105, -40, -37, -37, -32, -21, -32, -26, -27, -40, -29, -64, -27, -35, -26, -105, -76, -105, -110, -122, -45, -53, bx.l7, bx.l7, -57, -51, -53, -122, -93, -122, 91, 79, -94, -92, -111, -93, -88, -97, -108, 114, -98, -109, -108, 79, 108, 79, 116, -66, -36, -23, -94, -17, -101, -25, -22, -30, -101, -65, -32, -35, -16, -30, -101, -64, -15, -32, -23, -17, -87, -101, -66, -22, -23, -17, -32, -13, -17, -101, -28, -18, -101, -23, -16, -25, -25, -87, 119, -93, -87, -94, -88, -103, -90, 110, 84, -79, -46, -49, -30, -44, -115, -48, -33, -50, -32, -43, -115, -49, -46, -48, -50, -30, -32, -46, -115, -36, -45, -115, -46, -29, -46, -37, bx.j7, -115, -28, -42, bx.j7, -43, -115, -32, -30, -49, bx.j7, -26, -35, -46, -115, -86, -115, 108, -97, -118, -116, -116, -117, -116, -117, 71, -112, -107, 84, -108, -116, -108, -106, -103, -96, 71, -109, -106, -114, 71, -109, -112, -108, -112, -101, 72, 71, 115, -120, -102, -101, 71, -116, -99, -116, -107, -101, 97, 71, -108, -57, -78, -76, -65, -61, -72, -66, -67, 111, -109, -76, -79, -60, -74, 111, -108, -59, -76, -67, -61, 111, -58, -72, -61, -73, 111, -62, -60, -79, -61, -56, -65, -76, 111, -116, 111, -97, -46, -67, -65, -54, -50, -61, -55, -56, 122, -66, -49, -52, -61, -56, -63, 122, -58, -55, -63, -63, -61, -56, -63, 122, -66, -65, -68, -49, -63, 122, -65, -48, -65, -56, -50, -120, -27, 24, 3, 5, 16, 20, 9, 15, 14, -64, 19, 8, 15, 21, 12, 4, -64, 14, 15, 20, -64, 8, 1, 16, 16, 5, 14, -64, 8, 5, 18, 5, -50, -101, -105, -106, -54, -71, -66, -70, -61, -72, -70, -93, -70, -55, -52, -60, -57, -64, -28, 9, 1, 10, -69, -33, 0, -3, 16, 2, -69, -32, 17, 0, 9, 15, -69, 18, 4, 15, 3, -69, 14, 16, -3, 15, 20, Flags.CD, 0, -69, -40, -69, -53, -26, -26, -105, -28, -40, -27, -16, -105, -36, -19, -36, -27, -21, -22, -105, -26, -35, -105, -22, -20, bx.l7, -21, -16, -25, -36, -105, -38, -26, -37, -36, -79, -105, -101, -99, -104, -99, -102, -83, -102, -104, -91, -88, -96, -96, -94, -89, -96, -21, -8, -3, -24, -19, -18, -3, -18, -20, -3, -14, -8, -9, -24, 0, -8, -24, -4, -14, -16, -9, -22, -11, -24, -19, -22, -3, -22, -24, -11, -8, -16, -16, -14, -9, -16, -62, -64, -62, -57, -60, -57, -56, -62, -49, -46, -54, -54, -52, -47, -54, -2, 13, 6, 6, -3, 4, -49, -42, -55, -59, -36, -57, -46, -49, -54, -57, -38, -49, -43, -44, -36, -45, -30, -27, -35, -32, bx.l7};
    }

    public static void A05() {
        A05 = new String[]{"lfqbOpCQc8eNVWWSF0ti", "aQ5ZOD0I", "7f7up0GBGRCd1p0enpCjG4lcj76", "dHBYXWbpLBdqteinvxBO5bOixoP3oT04", "DPNUUQYEctncegz3shse9IBb8Vdl47", "4q0rwT09y0cbatV7Yp", "6l64E9SK9p5G", "edaEIeRSccYYgTnyelVwcwdzoe4C2sfO"};
    }

    static {
        A05();
        A04();
        A00 = new SparseIntArray();
        A03 = false;
        A0B = new AtomicReference<>();
        A0A = new AtomicReference<>();
        A01 = Executors.newSingleThreadExecutor();
        A06 = Arrays.asList(10, 50, 100, 1000);
        A07 = Collections.synchronizedList(new ArrayList());
        A09 = new AtomicInteger();
        A08 = new AtomicBoolean();
        A0C = new AtomicReference<>();
        A02 = false;
    }

    public static int A00(String str, int i, C8H c8h) {
        if ((A01(457, 7, 71).equals(str) && C04848i.A1f == i) || A01(aa.c.t, 5, 56).equals(str) || A01(437, 6, 113).equals(str)) {
            return 200;
        }
        if (A01(386, 36, 98).equals(str)) {
            return 50;
        }
        if (A01(371, 15, 18).equals(str)) {
            return J9.A05(c8h);
        }
        if (A05[3].charAt(3) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[7] = "MSKlPe4okWTggpeViHGlBF3nlCraGBz9";
        strArr[7] = "MSKlPe4okWTggpeViHGlBF3nlCraGBz9";
        return -1;
    }

    public static /* synthetic */ List A02() {
        List<C04808d> list = A07;
        String[] strArr = A05;
        if (strArr[4].length() != strArr[0].length()) {
            String[] strArr2 = A05;
            strArr2[1] = "TV2BvPAOYvnRV0R5I88rwwfNZOOU8";
            strArr2[1] = "TV2BvPAOYvnRV0R5I88rwwfNZOOU8";
            return list;
        }
        throw new RuntimeException();
    }

    public static void A06(C8H c8h, int i, int i2) {
        c8h.A04().A82(A01(427, 10, 60), C04848i.A29, new C04858j(A01(338, 33, 80) + i, A01(87, 9, 13) + i2));
    }

    @Deprecated
    public static void A07(@Nullable C8H c8h, String str, int i, C04858j c04858j) {
        if (c8h == null) {
            A0G(new RuntimeException(A01(48, 39, 84)));
            return;
        }
        C8G.A01(c8h.A00());
        if (A02 && c04858j.A00() == 0) {
            A0E(new RuntimeException(A01(96, 44, 70) + str + A01(31, 16, 8) + i, c04858j));
        }
        try {
            if (A0I(c8h, str, i, Math.random(), c04858j)) {
                A0A(c8h, str, i, c04858j);
            }
        } catch (Throwable th) {
            A0G(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    @Deprecated
    public static void A08(C8H c8h, String str, int i, C04858j c04858j) {
        try {
            c04858j.A03(2);
            c04858j.A07(false);
            c04858j.A04(1);
            if (J9.A0R(c8h)) {
                c04858j.A06(true);
            } else {
                c04858j.A06(false);
            }
            A07(c8h, str, i, c04858j);
        } catch (Throwable th) {
            A0G(th);
        }
    }

    @Deprecated
    public static void A09(C8H c8h, String str, int i, C04858j c04858j) {
        try {
            c04858j.A03(2);
            c04858j.A06(false);
            A07(c8h, str, i, c04858j);
        } catch (Throwable th) {
            A0G(th);
        }
    }

    public static void A0A(C8H c8h, String str, int i, C04858j c04858j) {
        synchronized (C04798c.class) {
            if (!A03) {
                int A012 = J9.A01(c8h);
                if (A09.getAndIncrement() < A012 - 1) {
                    A07.add(new C04808d(str, i, c04858j));
                } else if (A09.get() == A012) {
                    List<C04808d> list = A07;
                    String A013 = A01(427, 10, 60);
                    int i2 = C04848i.A26;
                    list.add(new C04808d(A013, i2, new C04858j(A01(140, 42, 0) + str + A01(47, 1, 19) + i)));
                }
            } else {
                A0B(c8h, str, i, c04858j, true);
            }
        }
    }

    public static void A0B(C8H c8h, String str, int i, C04858j c04858j, boolean z) {
        InterfaceC04788b interfaceC04788b = A0B.get();
        boolean z2 = interfaceC04788b != null && interfaceC04788b.A7k();
        if (A08.get() || z2) {
            int A002 = c04858j.A00();
            String A012 = A01(289, 17, 46);
            String A013 = A01(31, 16, 8);
            if (A002 == 0) {
                Log.e(A012, A01(182, 37, 40) + str + A013 + i, c04858j);
            } else {
                Log.i(A012, A01(306, 32, 116) + str + A013 + i + A01(19, 12, 63) + c04858j.getMessage() + A01(0, 19, 80) + c04858j.A02());
            }
        }
        C1095Ww c1095Ww = new C1095Ww(c8h, str, i, c04858j, interfaceC04788b);
        if (z) {
            A01.execute(c1095Ww);
        } else {
            c1095Ww.run();
        }
    }

    public static void A0D(C1081Wi c1081Wi, InterfaceC04788b interfaceC04788b, InterfaceC04778a interfaceC04778a, boolean z) {
        A0A.set(interfaceC04778a);
        A0B.set(interfaceC04788b);
        A08.set(z);
        synchronized (C04798c.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new C1094Wv(c1081Wi));
            }
        }
    }

    public static void A0E(final RuntimeException runtimeException) {
        if (A02) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8Z
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        }
    }

    @Deprecated
    public static void A0F(Throwable th) {
        if (A02) {
            A0E(new RuntimeException(A01(256, 33, 121), th));
        }
    }

    public static void A0G(Throwable th) {
        Log.e(A01(289, 17, 46), A01(219, 37, 51), th);
        if (A02) {
            A0E(new RuntimeException(th));
        }
    }

    @SuppressLint({"CatchGeneralException"})
    @VisibleForTesting
    public static boolean A0I(C8H c8h, String str, int i, double d, C04858j c04858j) {
        double logProbability;
        int A0E;
        int A032;
        try {
            int A042 = J9.A04(c8h);
            if (A042 < 1) {
                return false;
            }
            HashMap<String, Integer> A0M = J9.A0M(c8h);
            String str2 = str + A01(47, 1, 19) + i;
            boolean contains = A0M.keySet().contains(str2);
            if (contains) {
                Integer num = A0M.get(str2);
                int intValue = num != null ? num.intValue() : -1;
                if (intValue == 0) {
                    return false;
                }
                if (intValue > 0) {
                    return d <= 1.0d / ((double) intValue);
                }
                if (J9.A03(c8h) < 1) {
                    return false;
                }
                logProbability = (A042 * A032) / 10000.0d;
            } else if (!c04858j.A08()) {
                logProbability = zg2.s;
            } else {
                double logProbability2 = A042;
                logProbability = logProbability2 / 100.0d;
            }
            double A002 = c8h.A05().A00();
            if (A01(aa.c.t, 5, 56).equals(str)) {
                if (BuildConfigApi.isDebug()) {
                    return true;
                }
                int A062 = J9.A06(c8h);
                if (A062 == 0) {
                    return false;
                }
                if (A062 > 0) {
                    double d2 = 1.0d / A062;
                    return contains ? A002 <= d2 * logProbability : A002 <= d2;
                }
            }
            if (A01(457, 7, 71).equals(str) && C04848i.A1f == i) {
                if (!A08.get()) {
                    A0E = J9.A0E(c8h);
                } else {
                    A0E = 1;
                }
                if (A0E == 0) {
                    return false;
                }
                if (A0E > 0) {
                    double d3 = 1.0d / A0E;
                    return contains ? A002 <= d3 * logProbability : A002 <= d3;
                }
            }
            if (A01(437, 6, 113).equals(str)) {
                Boolean bool = A0C.get();
                if (bool != null) {
                    return bool.booleanValue();
                }
                int A0A2 = J9.A0A(c8h);
                if (A0A2 == 0) {
                    A0C.set(false);
                    return false;
                } else if (A0A2 > 0) {
                    double d4 = 1.0d / A0A2;
                    return contains ? A002 <= d4 * logProbability : A002 <= d4;
                }
            }
            if (A01(443, 14, 63).equals(str)) {
                if (BuildConfigApi.isDebug()) {
                    return true;
                }
                int A0B2 = J9.A0B(c8h);
                if (A0B2 == 0) {
                    return false;
                }
                if (A0B2 > 0) {
                    double d5 = 1.0d / A0B2;
                    return contains ? A002 <= d5 * logProbability : A002 <= d5;
                }
            }
            double d6 = 1.0d - logProbability;
            if (A05[3].charAt(3) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[4] = "UKJjq974XMuOG6VE2UuXyW1KY5FJsZ";
            strArr[0] = "9oDF6i4FckldRw4UZ809";
            return d >= d6;
        } catch (Throwable th) {
            A0G(th);
            return false;
        }
    }

    @VisibleForTesting
    public static boolean A0J(C8H c8h, String str, int eventsLimit, C04858j c04858j) {
        if (J9.A0Q(c8h)) {
            int i = A00.get(eventsLimit);
            int A002 = J9.A00(c8h);
            if (c04858j.A01() != -1) {
                A002 = c04858j.A01();
            } else {
                int A003 = A00(str, eventsLimit, c8h);
                if (A002 < A003) {
                    A002 = A003;
                }
            }
            if (i >= A002) {
                if (A06.contains(Integer.valueOf(i))) {
                    boolean A092 = c04858j.A09();
                    if (A05[3].charAt(3) != 'Y') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "DtDXz8TrFQQZw1pkgy";
                    strArr[2] = "wKGFu6BM2pQR03pr0dyvmA98nTz";
                    if (A092) {
                        A06(c8h, eventsLimit, i);
                    }
                }
                A00.put(eventsLimit, i + 1);
                return true;
            }
            A00.put(eventsLimit, i + 1);
            return false;
        }
        return true;
    }
}