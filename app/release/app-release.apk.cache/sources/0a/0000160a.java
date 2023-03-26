package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.bG  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1250bG extends AbstractRunnableC0770Kc {
    public static byte[] A01;
    public final /* synthetic */ C8H A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{111, 99, 97, 34, 106, 109, 111, 105, 110, 99, 99, 103, 34, 109, 104, g15.c, 34, 64, 67, 79, 77, 64, 83, 79, 67, 89, 66, 88, 73, 94, 95, 88, 91, 87, 85, 88, 107, 87, 91, 65, 90, 64, 81, 70, 71, 84, 92, 88, 74, 76, 75, 92, 93, 102, 74, 92, 74, 74, 80, 86, 87, 102, 80, 93};
    }

    public C1250bG(C8H c8h) {
        this.A00 = c8h;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        SharedPreferences sharedPreferences = null;
        try {
            sharedPreferences = this.A00.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(0, 31, 63), this.A00), 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all.size() > 1) {
                JO.A04(this.A00, Q4.A00(this.A00), all);
                sharedPreferences.edit().clear().apply();
            }
            sharedPreferences.edit().putString(A00(45, 19, 10), this.A00.A05().A02()).apply();
        } catch (JSONException e) {
            this.A00.A04().A82(A00(31, 14, 7), IronSourceConstants.BN_AUCTION_SUCCESS, new C04858j(e));
            sharedPreferences.edit().clear().apply();
        }
    }
}