package com.ironsource.sdk.controller;

import android.text.TextUtils;
import com.ironsource.sdk.g.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class j {
    private final Map<String, com.ironsource.sdk.g.c> a = new LinkedHashMap();
    private final Map<String, com.ironsource.sdk.g.c> b = new LinkedHashMap();
    private final Map<String, com.ironsource.sdk.g.c> c = new LinkedHashMap();

    public final com.ironsource.sdk.g.c a(d.e eVar, String str) {
        Map<String, com.ironsource.sdk.g.c> c;
        if (TextUtils.isEmpty(str) || (c = c(eVar)) == null) {
            return null;
        }
        return c.get(str);
    }

    public final com.ironsource.sdk.g.c a(d.e eVar, String str, Map<String, String> map, com.ironsource.sdk.j.a aVar) {
        com.ironsource.sdk.g.c cVar = new com.ironsource.sdk.g.c(str, str, map, aVar);
        a(eVar, str, cVar);
        return cVar;
    }

    public void a(d.e eVar, String str, com.ironsource.sdk.g.c cVar) {
        Map<String, com.ironsource.sdk.g.c> c;
        if (TextUtils.isEmpty(str) || (c = c(eVar)) == null) {
            return;
        }
        c.put(str, cVar);
    }

    public final Collection<com.ironsource.sdk.g.c> b(d.e eVar) {
        Map<String, com.ironsource.sdk.g.c> c = c(eVar);
        return c != null ? c.values() : new ArrayList();
    }

    public Map<String, com.ironsource.sdk.g.c> c(d.e eVar) {
        if (eVar.name().equalsIgnoreCase(d.e.RewardedVideo.name())) {
            return this.a;
        }
        if (eVar.name().equalsIgnoreCase(d.e.Interstitial.name())) {
            return this.b;
        }
        if (eVar.name().equalsIgnoreCase(d.e.Banner.name())) {
            return this.c;
        }
        return null;
    }
}