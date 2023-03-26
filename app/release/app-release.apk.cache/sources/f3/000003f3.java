package com.anythink.banner.a;

import android.content.Context;
import com.anythink.core.common.h;
import com.anythink.core.common.t;

/* loaded from: classes2.dex */
public class a extends com.anythink.core.common.f<c> {
    public static final String a = "Banner" + a.class.getSimpleName();

    private a(Context context, String str) {
        super(context, str);
    }

    @Override // com.anythink.core.common.f
    public final /* synthetic */ h a(c cVar) {
        c cVar2 = cVar;
        f fVar = new f(cVar2.a());
        fVar.a(cVar2.d);
        return fVar;
    }

    public static a a(Context context, String str) {
        com.anythink.core.common.f b = t.a().b(str);
        if (b == null || !(b instanceof a)) {
            b = new a(context, str);
            t.a().a(str, b);
        }
        return (a) b;
    }

    public final void a(Context context, int i, com.anythink.core.common.b.a aVar, com.anythink.core.common.b.b bVar) {
        c cVar = new c();
        cVar.e = bVar;
        cVar.a(context);
        cVar.d = i;
        super.a(this.b, "2", this.c, (String) cVar, aVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static h a2(c cVar) {
        f fVar = new f(cVar.a());
        fVar.a(cVar.d);
        return fVar;
    }
}