package com.anythink.basead;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.e.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {
    public static Map<String, Object> a(com.anythink.basead.d.b bVar) {
        if (bVar != null) {
            return a(bVar.d());
        }
        return null;
    }

    public static Map<String, Object> a(com.anythink.basead.f.c cVar) {
        if (cVar != null) {
            return a(cVar.e());
        }
        return null;
    }

    public static Map<String, Object> a(i iVar) {
        if (iVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("offer_id", iVar.k());
            hashMap.put("creative_id", iVar.l());
            hashMap.put(ATAdConst.NETWORK_CUSTOM_KEY.IS_DEEPLINK_OFFER, Integer.valueOf((TextUtils.isEmpty(iVar.j()) && TextUtils.isEmpty(iVar.u())) ? 0 : 1));
            return hashMap;
        }
        return null;
    }
}