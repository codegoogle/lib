package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.p7700g.p99005.bx;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class LN {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 45, 2, 90, 16, 5, 45, 2, 90, bx.W5, 16, 92, Flags.CD, 95, 44, 90, 88, bx.W5, 48, 92, 43, 44, 95, 91, 120, 78, 73, 73, 94, 85, 79, 27, 72, 79, 90, 88, 80, 27, 79, 73, 90, 88, 94, 33, 45, 47, 108, 36, 35, 33, 39, 32, 45, 45, 41, 108, 35, 38, 49};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(0, 24, 13));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 71)), -1, -1, false);
    }

    public static String A01(int i) {
        if (i <= 0) {
            return null;
        }
        float rate = i;
        if (new Random().nextFloat() >= 1.0f / rate) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, @Nullable Throwable th) {
        return A06(th, J8.A0G(context), J8.A01(context), J8.A0y(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(@Nullable Throwable th, int i, int i2, boolean z) {
        String A02 = A02(0, 0, 122);
        if (th == null) {
            return A02;
        }
        try {
            C1181a8 c1181a8 = new C1181a8();
            LL ll = c1181a8;
            if (i2 >= 0) {
                ll = new C1179a6(ll, i2);
            }
            if (i >= 0) {
                ll = new C1178a5(ll, i, i);
            }
            if (z) {
                ll = new C1180a7(ll);
            }
            C1182a9 c1182a9 = new C1182a9(c1181a8, 1, ll);
            th.printStackTrace(new PrintWriter(new LM(c1182a9)));
            c1182a9.flush();
            return c1181a8.toString();
        } catch (Exception unused) {
            return A02;
        }
    }

    public static boolean A08(LK lk) {
        String A03 = lk.A03();
        if (A03 == null) {
            return false;
        }
        if (A0A(A03)) {
            return true;
        }
        for (String str : lk.A02()) {
            if (A0A(str)) {
                return true;
            }
        }
        for (String str2 : lk.A01()) {
            if (A0A(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 62));
    }
}