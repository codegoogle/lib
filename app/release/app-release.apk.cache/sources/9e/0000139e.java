package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class R9 extends AbstractRunnableC0770Kc {
    public static byte[] A01;
    public final /* synthetic */ JSONObject A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{7, 19, 4, 16, 20, 4, 15, 2, 24, 62, 2, 0, 17, 17, 8, 15, 6};
    }

    public R9(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        try {
            C03010u.A03.await();
            synchronized (C03010u.A00) {
                C03010u.A00.A0A(this.A00);
                C03010u.A04.countDown();
            }
        } catch (InterruptedException e) {
            C03010u.A01.A04().A82(A00(0, 17, 116), C04848i.A0w, new C04858j(e));
        } catch (JSONException e2) {
            C03010u.A08();
            C03010u.A01.A04().A82(A00(0, 17, 116), C04848i.A0v, new C04858j(e2));
        }
    }
}