package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.6u  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04536u {
    public static byte[] A05;
    public static String[] A06;
    public static final String A07;
    public final int A00;
    public final EnumC04526t A01;
    @Nullable
    public final String A02;
    @Nullable
    public final String A03;
    @Nullable
    public final String A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A06;
            if (strArr[2].charAt(1) != strArr[5].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "Uh6rCcqYck9NcAhTNlTmwzqgbCEX7K96";
            strArr2[3] = "Uh6rCcqYck9NcAhTNlTmwzqgbCEX7K96";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
            i4++;
        }
    }

    public static void A01() {
        A05 = new byte[]{-55, -10, -10, -13, -10, -92, -57, -10, -23, -27, -8, -19, -14, -21, -92, -50, -41, -45, -46, 31, 29, 9, 17, -4, 5, Flags.CD, 25};
    }

    public static void A02() {
        A06 = new String[]{"QeTecly5r3Ba9bHxC0wnpwdEUUrllzAy", "bEKXjPHxcJpa33XPuxx9BYS1WkIWy1gs", "BPs32rsczNPcksI72EKceZ8Ar9gsVFHv", "FBB0uSbaSxXulSlT7i8POlQBv6IvoYbu", "257ROLF87E57WLAlEBuIH5iygOG", "iPGaCxtdoC1kQbSunDLBqq3asDJIWzdx", "WqxRMthVFYlWmP0w7krXRzIuJmv", "wi3XTjuoHO8yYyadkxm6GwkGNAvhEA1y"};
    }

    static {
        A02();
        A01();
        A07 = C04536u.class.getSimpleName();
    }

    public C04536u(EnumC04526t enumC04526t) {
        this.A01 = enumC04526t;
        this.A00 = enumC04526t.A03();
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
    }

    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public C04536u(Throwable th) {
        String stackTraceElement;
        this.A01 = EnumC04526t.A08;
        this.A00 = th.getClass().getName().hashCode();
        this.A03 = th.getClass().getName();
        this.A02 = th.getMessage();
        if (th.getStackTrace() != null && th.getStackTrace().length > 1 && th.getStackTrace().toString().length() > 500) {
            stackTraceElement = th.getStackTrace()[0].toString().substring(0, 500);
        } else {
            stackTraceElement = th.getStackTrace()[0].toString();
        }
        this.A04 = stackTraceElement;
    }

    public final int A03() {
        return this.A00;
    }

    public final int A04() {
        int i;
        int i2;
        String str = this.A03;
        if (str != null) {
            i = str.getBytes().length;
        } else {
            i = 0;
        }
        int i3 = i + 4;
        String str2 = this.A02;
        if (str2 != null) {
            i2 = str2.getBytes().length;
        } else {
            i2 = 0;
        }
        int i4 = i3 + i2;
        String str3 = this.A04;
        return i4 + (str3 != null ? str3.getBytes().length : 0);
    }

    public final EnumC04526t A05() {
        return this.A01;
    }

    @Nullable
    public final String A06() {
        return this.A02;
    }

    @Nullable
    public final String A07() {
        return this.A03;
    }

    @Nullable
    public final String A08() {
        return this.A04;
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    public final JSONObject A09() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = C04516s.A00[this.A01.ordinal()];
            String A00 = A00(19, 2, 114);
            if (i != 1) {
                jSONObject.put(A00, this.A00);
            } else {
                jSONObject.put(A00, this.A00);
                jSONObject.put(A00(23, 2, 79), this.A03);
                jSONObject.put(A00(21, 2, 92), this.A02);
                jSONObject.put(A00(25, 2, 94), this.A04);
            }
        } catch (JSONException e) {
            Log.e(A07, A00(0, 19, 60), e);
        }
        return jSONObject;
    }
}