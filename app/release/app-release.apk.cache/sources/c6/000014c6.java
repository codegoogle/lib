package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Vy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1071Vy implements InterfaceC04416i {
    public final /* synthetic */ W0 A00;
    public final /* synthetic */ List A01;

    public C1071Vy(W0 w0, List list) {
        this.A00 = w0;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        AbstractC04566x A02;
        HashMap hashMap = new HashMap();
        for (C04406h c04406h : this.A01) {
            if (c04406h.A02()) {
                String str = (String) c04406h.A01();
                C1072Vz systemProperty = new C1072Vz(str);
                hashMap.put(str, systemProperty);
            }
        }
        A02 = this.A00.A02(hashMap);
        return A02;
    }
}