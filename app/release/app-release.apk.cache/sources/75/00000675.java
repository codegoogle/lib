package com.anythink.core.common.g;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.m;
import com.microsoft.appcenter.AppCenter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e extends a {
    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        return str;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.e();
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", "gzip");
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        try {
            return g().getBytes("utf-8");
        } catch (Exception unused) {
            return g().getBytes();
        }
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject e() {
        JSONObject e = super.e();
        try {
            e.put("app_id", m.a().n());
            e.put("curr_ts", System.currentTimeMillis());
        } catch (Exception unused) {
        }
        return e;
    }

    @Override // com.anythink.core.common.g.a
    public final String g() {
        HashMap hashMap = new HashMap();
        String a = com.anythink.core.common.j.c.a(e().toString());
        hashMap.put(c.L, "1.0");
        hashMap.put("p", a);
        ArrayList arrayList = new ArrayList(hashMap.size());
        arrayList.addAll(hashMap.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str);
            sb.append(AppCenter.KEY_VALUE_DELIMITER);
            sb.append(hashMap.get(str));
        }
        try {
            hashMap.put("sign", URLEncoder.encode(com.anythink.core.common.j.f.c(m.a().o() + sb.toString()), "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return new JSONObject(hashMap).toString();
    }

    @Override // com.anythink.core.common.g.a
    public final boolean h() {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final String i() {
        return m.a().n();
    }

    @Override // com.anythink.core.common.g.a
    public final Context j() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String k() {
        return m.a().o();
    }

    @Override // com.anythink.core.common.g.a
    public final String l() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, Object> m() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final boolean o() {
        return true;
    }
}