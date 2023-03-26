package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Kh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0775Kh {
    public static String[] A01;
    public static final ThreadLocal<C0775Kh> A02;
    public final KQ A00 = new KQ();

    public static void A03() {
        A01 = new String[]{"vWOWhJ9TqiA1ty478f", "MWb8A3Nd6tPLcAimCp0hVAmYX6QHiaZm", "Xd3YBUkiMhOleC4V056rVyOXhinwtSii", "tT8mJINbcEXXPPmKiWyTepfA0JHaFg93", "WoudJsrKOqRuVhNYSdRTZjqc00A0B3WY", "YTheXaZSxrm1KPF5Yd", "huHeChgRkwF7QVPgKoMeW6tLhEc13T9K", "ASVM8zHOtJrSOKsDwpZwweqDqvgS8KFW"};
    }

    static {
        A03();
        A02 = new ThreadLocal<>();
    }

    public static KQ A00() {
        return A02().A00;
    }

    public static KQ A01(C0774Kg c0774Kg) {
        KQ kq = new KQ(A00());
        kq.add(c0774Kg);
        return kq;
    }

    public static C0775Kh A02() {
        C0775Kh c0775Kh = A02.get();
        String[] strArr = A01;
        if (strArr[6].charAt(1) != strArr[2].charAt(1)) {
            String[] strArr2 = A01;
            strArr2[7] = "JnfSkSuIf6osqUQGv4Nkh0Vi2QZsQFPV";
            strArr2[4] = "e9u3CRl6fKpCeCDR9nRPR0cml03xK1Bs";
            if (c0775Kh == null) {
                C0775Kh c0775Kh2 = new C0775Kh();
                A02.set(c0775Kh2);
                return c0775Kh2;
            }
            return c0775Kh;
        }
        throw new RuntimeException();
    }

    public static void A04(AbstractRunnableC0770Kc abstractRunnableC0770Kc) {
        KQ createRunnableAsyncStackTrace = abstractRunnableC0770Kc.A06();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.addAll(createRunnableAsyncStackTrace);
        }
    }

    public static void A05(AbstractRunnableC0770Kc abstractRunnableC0770Kc) {
        KQ createRunnableAsyncStackTrace = abstractRunnableC0770Kc.A06();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.removeAll(createRunnableAsyncStackTrace);
        }
    }
}