package com.anythink.expressad.video.module.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.h.b;
import com.anythink.expressad.foundation.g.f.h.c;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.j;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a extends b {
    public a(Context context) {
        super(context);
    }

    @Override // com.anythink.expressad.foundation.g.f.h.b
    public final void a(String str, c cVar) {
        super.a(str, cVar);
        cVar.a("platform", "1");
        cVar.a(com.anythink.expressad.foundation.g.a.bd, Build.VERSION.RELEASE);
        cVar.a("package_name", j.h(this.a));
        cVar.a(com.anythink.expressad.foundation.g.a.bf, j.d(this.a));
        StringBuilder sb = new StringBuilder();
        sb.append(j.c(this.a));
        cVar.a("app_version_code", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.b(this.a));
        cVar.a("orientation", sb2.toString());
        cVar.a("gaid", "");
        cVar.a(com.anythink.expressad.foundation.g.a.bo, com.anythink.expressad.out.b.a);
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.foundation.b.a.b().e();
        if (com.anythink.expressad.d.b.b() != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (TextUtils.isEmpty(jSONObject.toString())) {
                    return;
                }
                String a = i.a(jSONObject.toString());
                if (TextUtils.isEmpty(a)) {
                    return;
                }
                cVar.a("dvi", a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}