package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import com.anchorfree.partner.api.ClientInfo;

/* compiled from: SDKInfoCollector.java */
/* loaded from: classes.dex */
public class w41 extends q91 {
    @x1
    private String d(@x1 h51 h51Var, @x1 Bundle bundle) {
        String string = bundle.getString("partner_carrier");
        if (string == null) {
            ClientInfo a = h51Var.a(bundle);
            return a == null ? "" : a.getCarrierId();
        }
        return string;
    }

    @Override // com.p7700g.p99005.q91
    public void a(@x1 Context context, @x1 Bundle bundle) {
        bundle.putString(com.anythink.expressad.foundation.g.a.bo, "3.5.0");
        bundle.putString("sdk_version_code", Integer.toString(404518));
        String str = pt0.b(context, new ot0(context, new f31((x31) i61.a().d(x31.class)))).a(d((h51) i61.a().d(h51.class), bundle)).get(pt0.f);
        if (str != null) {
            c(bundle, "af_hash", str);
        }
    }
}