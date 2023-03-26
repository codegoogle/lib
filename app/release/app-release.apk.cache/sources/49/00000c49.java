package com.anythink.splashad.a;

import android.content.Context;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.AdError;
import com.anythink.core.common.h;
import com.anythink.core.common.j;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;

/* loaded from: classes2.dex */
public final class e extends h {
    public int T;

    public e(Context context) {
        super(context);
    }

    private void d(int i) {
        this.T = i;
    }

    @Override // com.anythink.core.common.h
    @Deprecated
    public final void a() {
    }

    @Override // com.anythink.core.common.h
    public final void a(String str, com.anythink.core.common.k.a aVar) {
        super.a(str, aVar);
    }

    @Override // com.anythink.core.common.h
    public final void g() {
        j jVar = this.j;
        if (jVar != null) {
            jVar.f = null;
        }
        super.g();
    }

    @Override // com.anythink.core.common.h
    public final void h() {
        super.h();
    }

    public final void j() {
        g();
        b();
    }

    @Override // com.anythink.core.common.h
    public final void a(AdError adError) {
        super.a(adError);
    }

    @Override // com.anythink.core.common.h
    public final void a(ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter instanceof CustomSplashAdapter) {
            ((CustomSplashAdapter) aTBaseAdAdapter).setFetchAdTimeout(this.T);
        }
    }
}