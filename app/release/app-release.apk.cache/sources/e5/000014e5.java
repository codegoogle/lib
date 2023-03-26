package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class WT extends AbstractC04566x<Float> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{75};
    }

    public WT(long j, @Nullable C04546v c04546v, float f) {
        super(j, c04546v, Float.valueOf(f), EnumC04556w.A05);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final int A07() {
        return 4;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final JSONObject A09(JSONObject jSONObject) throws JSONException {
        jSONObject.put(A00(0, 1, 110), A08());
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.lang.Float> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final boolean A0B(AbstractC04566x<Float> abstractC04566x) {
        return Math.abs(A08().floatValue() - abstractC04566x.A08().floatValue()) < C04325z.A01();
    }
}