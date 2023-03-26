package com.facebook.ads.redexgen.X;

import android.content.pm.ServiceInfo;

/* loaded from: assets/audience_network.dex */
public class VS implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ C1057Vk A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"Kjl9x1nXLMp", "FYT6FJfE388FncoeBbUW5LDH7Ti6Kpnc", "Yxd2XW5tX0tpbE5v80iFGWNMQ7F", "Eun4caaboMQouomEKTkKbMJy1uWMR8C3", "2B", "gVUv49X3C1I0CRHiCQrxfKc2j3pZm33W", "VtV7HGxoJcmYVE0XtMWfAnTQdxbbthfO", "Muv0aFmfDz7QlEQw1d"};
    }

    public VS(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ServiceInfo[] serviceInfoArr;
        ServiceInfo[] serviceInfoArr2;
        serviceInfoArr = this.A00.A05;
        if (serviceInfoArr == null) {
            C1057Vk c1057Vk = this.A00;
            String[] strArr = A01;
            if (strArr[7].length() != strArr[4].length()) {
                String[] strArr2 = A01;
                strArr2[0] = "czOc910r7ol";
                strArr2[2] = "WgsI1fVM7Yu7d9q7aeaJmksjNii";
                return c1057Vk.A08(EnumC04526t.A07);
            }
            throw new RuntimeException();
        }
        C1057Vk c1057Vk2 = this.A00;
        serviceInfoArr2 = c1057Vk2.A05;
        return c1057Vk2.A05(serviceInfoArr2.length);
    }
}