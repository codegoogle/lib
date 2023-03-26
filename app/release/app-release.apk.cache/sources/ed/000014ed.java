package com.facebook.ads.redexgen.X;

import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Wb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1074Wb extends AbstractC04566x<C6T> {
    public C1074Wb(long j, @Nullable C04546v c04546v, C6T c6t) {
        super(j, c04546v, c6t, EnumC04556w.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final int A07() {
        return A08().A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final JSONObject A09(JSONObject jSONObject) throws JSONException {
        return A08().A0B(jSONObject);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.biometric.model.TouchSignalRawValue> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final boolean A0B(AbstractC04566x<C6T> abstractC04566x) {
        return A08().A0C(abstractC04566x.A08());
    }
}