package com.anythink.nativead.a;

import android.content.Context;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.AdError;
import com.anythink.core.common.e.af;
import com.anythink.core.common.h;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;

/* loaded from: classes2.dex */
public final class c extends h {
    public c(Context context) {
        super(context);
    }

    @Override // com.anythink.core.common.h
    @Deprecated
    public final void a() {
    }

    @Override // com.anythink.core.common.h
    public final void a(ATBaseAdAdapter aTBaseAdAdapter) {
        af unitGroupInfo;
        if (aTBaseAdAdapter == null || (unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo()) == null || !(aTBaseAdAdapter instanceof CustomNativeAdapter)) {
            return;
        }
        ((CustomNativeAdapter) aTBaseAdAdapter).setRequestNum(unitGroupInfo.r());
    }

    @Override // com.anythink.core.common.h
    public final void h() {
        super.h();
    }

    @Override // com.anythink.core.common.h
    public final void a(AdError adError) {
        super.a(adError);
    }
}