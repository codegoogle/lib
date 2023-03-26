package com.facebook.ads.redexgen.X;

import android.content.pm.ActivityInfo;
import com.p7700g.p99005.g15;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1056Vj implements InterfaceC04416i {
    public static byte[] A01;
    public final /* synthetic */ C1057Vk A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{g15.b, -28, -29, -43, -68, -57};
    }

    public C1056Vj(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        ActivityInfo[] activityInfoArr;
        ActivityInfo[] activityInfoArr2;
        ActivityInfo[] activityInfoArr3;
        ActivityInfo[] activityInfoArr4;
        activityInfoArr = this.A00.A04;
        if (activityInfoArr != null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                activityInfoArr2 = this.A00.A04;
                int i2 = activityInfoArr2.length;
                if (i >= i2) {
                    AbstractC04566x signalValueTypeDef = this.A00.A09(AnonymousClass76.A08(sb.toString().getBytes(A00(1, 5, 62)), AnonymousClass75.A06));
                    return signalValueTypeDef;
                }
                activityInfoArr3 = this.A00.A04;
                sb.append(activityInfoArr3[i].name);
                activityInfoArr4 = this.A00.A04;
                int i3 = activityInfoArr4.length;
                if (i != i3 - 1) {
                    sb.append(A00(0, 1, 37));
                }
                i++;
            }
        } else {
            return this.A00.A08(EnumC04526t.A07);
        }
    }
}