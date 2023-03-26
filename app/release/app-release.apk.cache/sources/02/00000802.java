package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends f {
    private static final String b = "anythink_template/";
    private static final String c = "anythink_template/res/.anythink700";
    private static final String d = "anythink_template/res/res";
    private static final String e = "anythink_template/res/html";

    public c(String str) {
        super(str);
        this.a.a(a.AD_ROOT_INTERNAL);
    }

    @Override // com.anythink.expressad.foundation.g.c.f
    public final List<e> a() {
        ArrayList arrayList = new ArrayList();
        e a = f.a(arrayList, a.AD_ANYTHINK_700_INTERNAL, c);
        a.a(a.ANYTHINK_700_RES, d);
        a.a(a.ANYTHINK_700_HTML, e);
        return arrayList;
    }
}