package com.anythink.nativead.a;

import android.content.Context;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.e.e;
import com.anythink.core.common.f;
import com.anythink.core.common.h;
import com.anythink.core.common.t;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;

/* loaded from: classes2.dex */
public class a extends f<d> {
    public static final String a = "a";

    private a(Context context, String str) {
        super(context, str);
    }

    @Override // com.anythink.core.common.f
    public final /* synthetic */ h a(d dVar) {
        d dVar2 = dVar;
        c cVar = new c(dVar2.a());
        cVar.a(dVar2.d);
        return cVar;
    }

    public final com.anythink.core.common.e.b e(String str) {
        com.anythink.core.common.e.b a2 = com.anythink.core.common.a.a().a(this.b, this.c);
        if (a2 != null && (a2.f() instanceof com.anythink.nativead.unitgroup.a) && (a2.e() instanceof CustomNativeAdapter)) {
            BaseAd f = a2.f();
            ATBaseAdAdapter e = a2.e();
            e detail = f.getDetail();
            detail.C = str;
            com.anythink.core.common.a.a().a(this.c, detail.w(), a2);
            com.anythink.core.common.a.a().b(this.c, e.getUnitGroupInfo());
            return a2;
        }
        return null;
    }

    public static a a(Context context, String str) {
        f b = t.a().b(str);
        if (b == null || !(b instanceof a)) {
            b = new a(context, str);
            t.a().a(str, b);
        }
        return (a) b;
    }

    public final void a(Context context, com.anythink.core.common.b.a aVar, com.anythink.core.common.b.b bVar) {
        d dVar = new d();
        dVar.a(context);
        dVar.e = bVar;
        dVar.d = 0;
        super.a(this.b, "0", this.c, (String) dVar, aVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static h a2(d dVar) {
        c cVar = new c(dVar.a());
        cVar.a(dVar.d);
        return cVar;
    }
}