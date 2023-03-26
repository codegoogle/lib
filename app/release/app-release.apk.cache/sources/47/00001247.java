package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.media.AudioManager;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.La  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0791La {
    public static byte[] A00;
    public static String[] A01;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-8, -44, -40, -20, -37, -32, -26, -35, -15, -16, -21, -20, -24, -35, -11, -1, 4, 2, -1, 4, -5};
    }

    public static void A03() {
        A01 = new String[]{"", "SXw", "dejWMVKCcsRHbrwAIECa6aRABNrvRLL1", "Mpo", "dfeQdAe6W2quBxkeKKSlZfT5B8UcRWSp", "PPqjaOYWzYRlppBEr7ot7ueRFIAfsGXr", "QjvNArJcMH0SA20xehHAs5TxpNTDNPBN", "WLwkcjK3klW5xWY"};
    }

    public static float A00(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(A01(2, 5, 39));
        if (audioManager != null) {
            int streamVolume = audioManager.getStreamVolume(3);
            int volume = audioManager.getStreamMaxVolume(3);
            if (volume > 0) {
                float f = streamVolume * 1.0f;
                float f2 = volume;
                if (A01[6].charAt(22) != 84) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[2] = "0x0JMOwm3zHAjWtXS56jSdeaa6cHcp3J";
                strArr[2] = "0x0JMOwm3zHAjWtXS56jSdeaa6cHcp3J";
                return f / f2;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static void A04(Map<String, String> map, boolean z, boolean z2) {
        String A012 = A01(1, 1, 83);
        String A013 = A01(0, 1, 120);
        map.put(A01(7, 8, 44), z ? A012 : A013);
        if (!z2) {
            A012 = A013;
        }
        map.put(A01(15, 6, 70), A012);
    }
}