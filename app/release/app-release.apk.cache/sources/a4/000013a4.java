package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class RF extends AbstractRunnableC0770Kc {
    public final /* synthetic */ RG A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public RF(RG rg, Map map, Map map2) {
        this.A00 = rg;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        String str;
        JE je;
        JE je2;
        String str2;
        str = this.A00.A0L;
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.A02);
            hashMap.putAll(this.A01);
            je = this.A00.A0D;
            if (je == null) {
                return;
            }
            je2 = this.A00.A0D;
            str2 = this.A00.A0L;
            je2.A8J(str2, hashMap);
        }
    }
}