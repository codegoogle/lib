package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.0u  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03010u {
    public static C03000t A00;
    public static C8H A01;
    @Nullable
    public static String A02;
    public static CountDownLatch A03;
    public static CountDownLatch A04;
    public static boolean A05;
    public static byte[] A06;
    public static String[] A07;
    public static final String A08;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 69);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        byte[] bArr = {114, 115, 97, 10, 31, 123, 125, 3, 6, 17, 33, 3, 18, 18, Flags.CD, 12, 5, 43, 12, 4, 13, 76, 22, 26, 22, 32, 34, 51, 51, 38, 39, 2, 39, 48, 109, 55, 59, 55, 13, 25, 14, 26, 30, 14, 5, 8, 18, 52, 8, 10, 27, 27, 2, 5, 12};
        if (A07[0].charAt(25) == 's') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[6] = "ekiMbk44dvQ4iEpOly1MsU0Tkyq5eij5";
        strArr[6] = "ekiMbk44dvQ4iEpOly1MsU0Tkyq5eij5";
        A06 = bArr;
    }

    public static void A05() {
        A07 = new String[]{"TOlR5WIHpQxnCrBDCJGIvboS5c1GP2eb", "1A072KPTjzB", "BhIKZU0mEosMUOfZes2VT64q11XJ2Uhn", "3eQHzZddeWPmYl0bNsvnb2WjxREMTE8a", "x", "3ukMDhdDleVgfGP2GHVzNRiRwZbG92ZS", "tXOxwX9vQ8QECIpzr41AiGeD6LbiHgO3", "feL0RS1gsJrC9VyxtC"};
    }

    static {
        A05();
        A04();
        A08 = C03010u.class.getSimpleName();
        A03 = new CountDownLatch(1);
        A04 = new CountDownLatch(1);
    }

    public static String A00() {
        C03000t c03000t = A00;
        return c03000t != null ? c03000t.A03() : A01(5, 2, 101);
    }

    public static String A02(String str) {
        String A012 = A01(38, 17, 46);
        File file = new File(A01.getFilesDir(), str);
        String A013 = A01(0, 0, 103);
        if (file.exists() && file.length() > 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                return new String(bArr, A01(0, 5, 98));
            } catch (FileNotFoundException e) {
                A01.A04().A82(A012, C04848i.A0t, new C04858j(e));
                return A013;
            } catch (IOException e2) {
                A01.A04().A82(A012, C04848i.A0u, new C04858j(e2));
                return A013;
            }
        }
        return A013;
    }

    public static void A03() {
        if (!A0I() || A02 == null) {
            return;
        }
        ExecutorC0800Lj.A06.execute(new RB(A02));
    }

    public static synchronized void A08() {
        synchronized (C03010u.class) {
            A0F(A01(7, 18, 39));
            A0F(A01(25, 13, 6));
        }
    }

    public static synchronized void A09() {
        synchronized (C03010u.class) {
            try {
                A00.A08(A02(A01(25, 13, 6)));
                A00.A06(A02(A01(7, 18, 39)));
            } catch (JSONException e) {
                A08();
                A01.A04().A82(A01(38, 17, 46), C04848i.A0v, new C04858j(e));
            }
        }
    }

    public static synchronized void A0A() {
        synchronized (C03010u.class) {
            A0G(A01(25, 13, 6), A00().getBytes());
            A0G(A01(7, 18, 39), A00.A04().toString().getBytes());
        }
    }

    public static synchronized void A0C(C1K c1k, String str, boolean z) {
        synchronized (C03010u.class) {
            c1k.A07(z);
            if (c1k.A08() || c1k.A09()) {
                A00.A07(str);
            } else {
                A00.A09(str);
            }
        }
    }

    public static synchronized void A0D(C8H c8h) {
        synchronized (C03010u.class) {
            A01 = c8h;
            A02 = null;
            ExecutorC0800Lj.A06.execute(new R8());
        }
    }

    public static void A0E(String str) {
        if (!A0I()) {
            return;
        }
        A02 = str;
        ExecutorC0800Lj.A06.execute(new RA(str));
    }

    public static void A0F(String str) {
        File file = new File(A01.getFilesDir(), str);
        if (file.exists()) {
            file.delete();
        }
    }

    public static synchronized void A0G(String str, byte[] bArr) {
        synchronized (C03010u.class) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(A01.getFilesDir(), str));
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                A01.A04().A82(A01(38, 17, 46), C04848i.A0t, new C04858j(e));
            } catch (IOException e2) {
                A01.A04().A82(A01(38, 17, 46), C04848i.A0u, new C04858j(e2));
            }
        }
    }

    public static void A0H(JSONObject jSONObject) {
        A05 = J8.A0r(A01);
        if (!A05) {
            return;
        }
        ExecutorC0800Lj.A06.execute(new R9(jSONObject));
    }

    public static boolean A0I() {
        return A05;
    }

    public static boolean A0J(String str) {
        boolean z = false;
        try {
            z = A00.A04().get(str) instanceof C1K;
            return z;
        } catch (JSONException e) {
            A01.A04().A82(A01(38, 17, 46), C04848i.A0v, new C04858j(e));
            return z;
        }
    }
}