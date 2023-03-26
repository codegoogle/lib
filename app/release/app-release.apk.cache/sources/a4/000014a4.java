package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class VQ extends C6Z {
    public VQ(Context context, C04325z c04325z) {
        super(context, c04325z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC04566x A02(HashMap<String, VP> hashMap) {
        return new WY(SystemClock.elapsedRealtime(), A03(), hashMap, EnumC04556w.A0C);
    }

    public final InterfaceC04416i A0H() {
        return new VO(this);
    }
}