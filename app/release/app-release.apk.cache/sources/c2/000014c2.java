package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Vu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1067Vu extends C6Z {
    public final Context A00;

    public C1067Vu(Context context, C04325z c04325z) {
        super(context, c04325z);
        this.A00 = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC04566x A03(HashMap<String, C1066Vt> hashMap) {
        return new WY(SystemClock.elapsedRealtime(), A03(), hashMap, EnumC04556w.A0C);
    }

    public final InterfaceC04416i A0H(List<C04406h> list, EnumC04376e enumC04376e) {
        return new C1065Vs(this, list, enumC04376e);
    }
}