package com.facebook.ads.redexgen.X;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Vh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1054Vh implements InterfaceC04416i {
    public final /* synthetic */ C1057Vk A00;

    public C1054Vh(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ActivityInfo[] activityInfoArr;
        ActivityInfo[] activityInfoArr2;
        C04325z c04325z;
        ActivityInfo[] activityInfoArr3;
        activityInfoArr = this.A00.A04;
        if (activityInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            activityInfoArr2 = this.A00.A04;
            int length = activityInfoArr2.length;
            c04325z = this.A00.A03;
            int min = Math.min(length, c04325z.A0U());
            for (int i = 0; i < min; i++) {
                activityInfoArr3 = this.A00.A04;
                arrayList.add(activityInfoArr3[i].name);
            }
            return this.A00.A0F(arrayList);
        }
        return this.A00.A08(EnumC04526t.A07);
    }
}