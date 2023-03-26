package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class WR<T> extends AbstractC04566x<InterfaceC04476o> {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-73};
        String[] strArr = A01;
        if (strArr[0].charAt(26) != strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "4uyIqP7n4WtKVi9Rm5fO0ecCuIXu1zOj";
        strArr2[2] = "4uyIqP7n4WtKVi9Rm5fO0ecCuIXu1zOj";
        A00 = bArr;
    }

    public static void A02() {
        A01 = new String[]{"FFbUiuFwozfA0TvCJPANz8giqJj3Ey6e", "FdrdBbAzaIA4fvIQziUETi0i5pzm7d41", "y8Q9G33rxS5LLrNXiYcm9QLiBdw97p1I", "zt8", "kKbJCUSdm2baWh6S7cWsva6nWBGnb0Bq", "lZC5QmFNV9qqPs7G4jyYJaaKbEwmE4", "OkQ3tI89WJ1Nk7Gpl9REz34W9wj5LbGl", "vzboBPdl2BbWH2MdrrRCAvv17E0LNPzE"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WR != com.facebook.ads.internal.botdetection.signals.model.signal_value.CustomObjectSignalValueType<T> */
    public WR(long j, @Nullable C04546v c04546v, InterfaceC04476o interfaceC04476o) {
        super(j, c04546v, interfaceC04476o, EnumC04556w.A03);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WR != com.facebook.ads.internal.botdetection.signals.model.signal_value.CustomObjectSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final int A07() {
        return ((InterfaceC04476o) A08()).ADC();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WR != com.facebook.ads.internal.botdetection.signals.model.signal_value.CustomObjectSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final JSONObject A09(JSONObject jSONObject) throws JSONException {
        return jSONObject.put(A00(0, 1, 25), ((InterfaceC04476o) A08()).ADV());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.model.signal_value.ICustomObjectSignalValueDef> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WR != com.facebook.ads.internal.botdetection.signals.model.signal_value.CustomObjectSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final boolean A0B(AbstractC04566x<InterfaceC04476o> abstractC04566x) {
        if (A08() == null || abstractC04566x.A08() == null) {
            return A08() == null && abstractC04566x.A08() == null;
        }
        return ((InterfaceC04476o) A08()).A7a(abstractC04566x.A08());
    }
}