package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6Z  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6Z {
    public static byte[] A03;
    public static String[] A04;
    public final Context A00;
    public final Intent A01;
    public final C04325z A02;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-114, -101, -111, -97, -100, -106, -111, 91, -106, -101, -95, -110, -101, -95, 91, -114, -112, -95, -106, -100, -101, 91, 111, 110, -127, -127, 114, g15.c, -122, -116, 112, 117, 110, 123, 116, 114, 113};
    }

    public static void A02() {
        A04 = new String[]{"o84FpHzEZxPfIbBPVc3PyJBEasuCfO6c", "JrI1dU8TTdtObirIwzr9PDFTf", "Oz2bxznKOZIoYiu00r0tMjRqahT5L8eX", "WyAMbI9dOM56rsavBzGbIzP4LEeOBa2a", "QAd1wzNDoH5I97BQWX3GR9O2v", "PJ66RTAVo3tttPzwttyvOY4w2twOeZmh", "FZtFZJQ3MyLobIqHR00oY", "wJgkVVpmtRvVSLM2dL7kjEoPPerdmE0p"};
    }

    public C6Z(Context context, C04325z c04325z) {
        this.A00 = context;
        this.A02 = c04325z;
        this.A01 = this.A00.registerReceiver(null, new IntentFilter(A00(0, 37, 37)));
    }

    @Nullable
    public final C04546v A03() {
        if (this.A02.A0a() == EnumC04456m.A0G) {
            return null;
        }
        Context context = this.A00;
        String[] strArr = A04;
        if (strArr[6].length() != strArr[1].length()) {
            String[] strArr2 = A04;
            strArr2[2] = "BdLEpYuR7vP7Yavjfaa4glVMZlrsrS6q";
            strArr2[2] = "BdLEpYuR7vP7Yavjfaa4glVMZlrsrS6q";
            C04546v signalValueContext = new C04546v(context == null ? A00(0, 0, 34) : context.getPackageName());
            return signalValueContext;
        }
        throw new RuntimeException();
    }

    public final AbstractC04566x A04(float f) {
        return new WT(SystemClock.elapsedRealtime(), A03(), f);
    }

    public final AbstractC04566x A05(int i) {
        return new WV(SystemClock.elapsedRealtime(), A03(), i);
    }

    public final AbstractC04566x A06(int i, HashMap<String, String> hashMap) {
        if (this.A01 != null) {
            HashMap<String, Integer> hashMap2 = new HashMap<>();
            for (String str : hashMap.keySet()) {
                String[] strArr = A04;
                if (strArr[7].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[2] = "InQCvX9bMvCeYEwlTxFUxsBs8sRyWh3b";
                strArr2[2] = "InQCvX9bMvCeYEwlTxFUxsBs8sRyWh3b";
                Intent intent = this.A01;
                String key = hashMap.get(str);
                hashMap2.put(str, Integer.valueOf(intent.getIntExtra(key, i)));
            }
            return A0D(hashMap2);
        }
        return A08(EnumC04526t.A07);
    }

    public final AbstractC04566x A07(long j) {
        return new WX(SystemClock.elapsedRealtime(), A03(), j);
    }

    public final AbstractC04566x A08(EnumC04526t enumC04526t) {
        return new WS(SystemClock.elapsedRealtime(), A03(), new C04536u(enumC04526t));
    }

    public final AbstractC04566x A09(String str) {
        return new C1073Wa(SystemClock.elapsedRealtime(), A03(), str);
    }

    public final AbstractC04566x A0A(String str) {
        Intent intent = this.A01;
        if (intent != null) {
            return A09(intent.getStringExtra(str));
        }
        return A08(EnumC04526t.A07);
    }

    public final AbstractC04566x A0B(String str, int i) {
        Intent intent = this.A01;
        if (intent != null) {
            int intExtra = intent.getIntExtra(str, i);
            if (A04[4].length() != 16) {
                String[] strArr = A04;
                strArr[2] = "oU3Fbet9HTJlYuGSJV9pu56iNwFexhrg";
                strArr[2] = "oU3Fbet9HTJlYuGSJV9pu56iNwFexhrg";
                return A05(intExtra);
            }
            throw new RuntimeException();
        }
        return A08(EnumC04526t.A07);
    }

    public final AbstractC04566x A0C(String str, boolean z) {
        Intent intent = this.A01;
        if (intent != null) {
            return A0G(intent.getBooleanExtra(str, z));
        }
        return A08(EnumC04526t.A07);
    }

    public final AbstractC04566x A0D(HashMap<String, Integer> hashMap) {
        return new WU(SystemClock.elapsedRealtime(), A03(), hashMap);
    }

    public final AbstractC04566x A0E(List<InterfaceC04476o> list) {
        return new WW(SystemClock.elapsedRealtime(), A03(), list, EnumC04556w.A03);
    }

    public final AbstractC04566x A0F(List<String> resultList) {
        return new WW(SystemClock.elapsedRealtime(), A03(), resultList, EnumC04556w.A0C);
    }

    public final AbstractC04566x A0G(boolean z) {
        return new WQ(SystemClock.elapsedRealtime(), A03(), z);
    }
}