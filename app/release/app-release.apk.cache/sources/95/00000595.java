package com.anythink.core.b;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g extends e {
    public g(com.anythink.core.common.e.a aVar) {
        super(aVar);
    }

    @Override // com.anythink.core.b.e
    public final void a(List<JSONObject> list, com.anythink.core.common.g.h hVar) {
        com.anythink.core.b.a.a aVar = new com.anythink.core.b.a.a(this.l, this.k, this.j, list, 1);
        aVar.b(this.c.n.am());
        aVar.a(0, hVar);
    }

    @Override // com.anythink.core.b.e
    public final String b() {
        return this.c.p;
    }
}