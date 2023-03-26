package com.facebook.ads.redexgen.X;

import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public class VR implements InterfaceC04416i {
    public final /* synthetic */ C1057Vk A00;

    public VR(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ServiceInfo[] serviceInfoArr;
        ServiceInfo[] serviceInfoArr2;
        C04325z c04325z;
        ServiceInfo[] serviceInfoArr3;
        serviceInfoArr = this.A00.A05;
        if (serviceInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            serviceInfoArr2 = this.A00.A05;
            int length = serviceInfoArr2.length;
            c04325z = this.A00.A03;
            int min = Math.min(length, c04325z.A0U());
            for (int i = 0; i < min; i++) {
                serviceInfoArr3 = this.A00.A05;
                arrayList.add(serviceInfoArr3[i].name);
            }
            Collections.sort(arrayList);
            return this.A00.A0F(arrayList);
        }
        return this.A00.A08(EnumC04526t.A07);
    }
}