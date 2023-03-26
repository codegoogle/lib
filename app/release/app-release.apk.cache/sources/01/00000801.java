package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class b extends f {
    private static final String b = "anythink_template/";
    private static final String c = "anythink_template/res/Movies";
    private static final String d = "anythink_template/res";
    private static final String e = "anythink_template/res/.Anythink_VC";
    private static final String f = "anythink_template/res/.anythink700";
    private static final String g = "anythink_template/res/img";
    private static final String h = "anythink_template/crashinfo";
    private static final String i = "anythink_template/other";
    private static final String j = "anythink_template/res/xml";

    public b(String str) {
        super(str);
    }

    @Override // com.anythink.expressad.foundation.g.c.f
    public final List<e> a() {
        ArrayList arrayList = new ArrayList();
        f.a(arrayList, a.ANYTHINK_RES_MANAGER_DIR, d);
        f.a(arrayList, a.AD_MOVIES, c).a(a.ANYTHINK_VC, e);
        e a = f.a(arrayList, a.AD_ANYTHINK_700, f);
        a.a(a.ANYTHINK_700_IMG, g);
        a.a(a.ANYTHINK_700_XML, j);
        a aVar = a.ANYTHINK_OTHER;
        f.a(arrayList, aVar, i);
        f.a(arrayList, a.ANYTHINK_CRASH_INFO, h);
        f.a(arrayList, aVar, i);
        return arrayList;
    }
}