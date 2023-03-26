package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Vs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1065Vs implements InterfaceC04416i {
    public final /* synthetic */ EnumC04376e A00;
    public final /* synthetic */ C1067Vu A01;
    public final /* synthetic */ List A02;

    public C1065Vs(C1067Vu c1067Vu, List list, EnumC04376e enumC04376e) {
        this.A01 = c1067Vu;
        this.A02 = list;
        this.A00 = enumC04376e;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        AbstractC04566x A03;
        Context context;
        HashMap hashMap = new HashMap();
        for (C04406h c04406h : this.A02) {
            if (c04406h.A02()) {
                String str = (String) c04406h.A01();
                context = this.A01.A00;
                hashMap.put(str, new C1066Vt(context, str, this.A00));
            }
        }
        A03 = this.A01.A03(hashMap);
        return A03;
    }
}