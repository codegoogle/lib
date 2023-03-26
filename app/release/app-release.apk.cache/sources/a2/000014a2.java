package com.facebook.ads.redexgen.X;

import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public class VO implements InterfaceC04416i {
    public final /* synthetic */ VQ A00;

    public VO(VQ vq) {
        this.A00 = vq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() throws Exception {
        AbstractC04566x A02;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        HashMap hashMap = new HashMap();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            hashMap.put(nextElement.getDisplayName(), new VP(nextElement.getInetAddresses(), null));
        }
        A02 = this.A00.A02(hashMap);
        return A02;
    }
}