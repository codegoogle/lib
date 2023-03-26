package com.anythink.expressad.foundation.g.f.h;

import com.anythink.expressad.foundation.g.f.f;
import com.anythink.expressad.foundation.g.f.k;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends f<JSONObject> {
    @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
    public final void a(k<JSONObject> kVar) {
        if (kVar != null) {
            int optInt = kVar.a.optInt("status");
            if (optInt != 1 && optInt != 200) {
                kVar.a.optString("msg");
            } else {
                kVar.a.optJSONObject("data");
            }
        }
    }

    public abstract void g();

    public abstract void h();

    @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
    public final void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        com.anythink.expressad.foundation.g.f.g.a.a(aVar);
    }
}