package com.anythink.core.common.e.a;

import android.view.View;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b extends i {
    public final String a = b.class.getSimpleName();
    public e b;

    public b(e eVar) {
        this.b = eVar;
        j(eVar.getIconImageUrl());
        e(eVar.getStarRating().intValue());
        l(eVar.getMainImageUrl());
        h(eVar.getTitle());
        n(eVar.getCallToActionText());
        i(eVar.getDescriptionText());
        m(eVar.getAdChoiceIconUrl());
        a(eVar.getAdLogo());
        if (eVar.getAdAppInfo() != null) {
            if (m.a().y()) {
                eVar.getAdAppInfo().toString();
            }
            ATAdAppInfo adAppInfo = eVar.getAdAppInfo();
            u(adAppInfo.getPublisher());
            v(adAppInfo.getAppVersion());
            w(adAppInfo.getAppPrivacyUrl());
            x(adAppInfo.getAppPermissonUrl());
        }
    }

    @Override // com.anythink.core.common.e.i
    public final View H() {
        e eVar = this.b;
        if (eVar != null) {
            return eVar.getAdMediaView(new Object[0]);
        }
        return null;
    }

    @Override // com.anythink.core.common.e.i
    public final boolean I() {
        return true;
    }

    public final void a(View view, List<View> list) {
        e eVar = this.b;
        if (eVar != null) {
            eVar.registerListener(view, list, null);
        }
    }

    @Override // com.anythink.core.common.e.i
    public final List<String> b(k kVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.b.getMainImageUrl());
        return arrayList;
    }

    @Override // com.anythink.core.common.e.i
    public final int d() {
        return 10;
    }
}