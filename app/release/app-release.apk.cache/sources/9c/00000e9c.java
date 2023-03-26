package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.5f  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04135f {
    public static byte[] A00;
    public static String[] A01;
    public static final AtomicReference<C04115d> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    public static void A06() {
        A01 = new String[]{"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    }

    static {
        A06();
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static C04115d A00() {
        C04115d c04115d = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            C04115d c04115d2 = c04115d;
            if (c04115d2 == null) {
                C04115d A002 = C04115d.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    String[] strArr3 = A01;
                    strArr3[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    strArr3[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return A002;
                }
            } else {
                return c04115d2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L2;
     */
    @Nullable
    @SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C04115d A01(C8H c8h, C04115d c04115d) {
        if (c04115d != null) {
            try {
            } catch (Throwable th) {
                c8h.A04().A82(A04(12, 7, 6), C04848i.A18, new C04858j(th));
            }
        }
        return C04185l.A00(c8h);
        return c04115d;
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static C04115d A02(C8H c8h, C04115d c04115d, C04125e c04125e) {
        C04145g c04145g = null;
        try {
            if (J7.A07(c8h) && (c04115d == null || TextUtils.isEmpty(c04115d.A03()))) {
                c04145g = C04155h.A00(c8h.getContentResolver());
            }
        } catch (Throwable th) {
            c8h.A04().A82(A04(12, 7, 6), C04848i.A1A, new C04858j(th));
        }
        if (c04145g != null && c04145g.A01 != null) {
            A03.set(c04145g.A01);
            c04125e.A05(c04145g.A01);
        }
        if (c04115d == null && c04145g != null && !TextUtils.isEmpty(c04145g.A00)) {
            return new C04115d(c04145g.A00, c04145g.A02, EnumC04105c.A05);
        }
        return c04115d;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A07(C04125e c04125e) {
        A02.set(c04125e.A02());
        A03.set(c04125e.A03());
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A08(C8H c8h) {
        long j;
        C04115d upToDateAdInfo;
        try {
            C04125e c04125e = new C04125e(c8h);
            A07(c04125e);
            if (A09()) {
                return;
            }
            C04115d c04115d = A02.get();
            if (c04115d != null && !TextUtils.isEmpty(c04115d.A03())) {
                j = c04115d.A01();
            } else {
                j = -1;
            }
            if (j > 0 && System.currentTimeMillis() - j < J7.A00(c8h)) {
                return;
            }
            if (J7.A08(c8h)) {
                upToDateAdInfo = A01(c8h, A02(c8h, null, c04125e));
            } else {
                upToDateAdInfo = A02(c8h, A01(c8h, null), c04125e);
            }
            if (upToDateAdInfo != null && !TextUtils.isEmpty(upToDateAdInfo.A03())) {
                A02.set(upToDateAdInfo);
                c04125e.A04(upToDateAdInfo);
            }
        } catch (Throwable th) {
            c8h.A04().A82(A04(12, 7, 6), C04848i.A19, new C04858j(th));
        }
    }

    public static boolean A09() {
        boolean updated = false;
        if (C0788Kx.A04()) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String A04 = A04(0, 12, 9);
            if (C0788Kx.A05(A04)) {
                A03.set(C0788Kx.A01(A04));
                updated = true;
            }
        }
        boolean A042 = C0788Kx.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            String[] strArr3 = A01;
            strArr3[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            strArr3[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!A042) {
                return updated;
            }
        } else {
            String[] strArr4 = A01;
            strArr4[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            strArr4[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!A042) {
                return updated;
            }
        }
        String A043 = A04(19, 13, 79);
        if (C0788Kx.A05(A043)) {
            String A012 = C0788Kx.A01(A043);
            AtomicReference<C04115d> atomicReference = A02;
            if (A012 == null) {
                A012 = A04(0, 0, 68);
            }
            atomicReference.set(new C04115d(A012, false, EnumC04105c.A04));
            return true;
        }
        return updated;
    }
}