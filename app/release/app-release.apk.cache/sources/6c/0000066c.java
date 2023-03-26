package com.anythink.core.common.g.a;

import android.text.TextUtils;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.f;
import com.microsoft.appcenter.AppCenter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a extends b {
    public List<String> a;
    public int b;

    public a(List<String> list) {
        this.a = list;
        this.b = list.size();
    }

    private String h() {
        JSONObject f = super.f();
        JSONObject a = com.anythink.core.common.g.c.a();
        if (f != null) {
            try {
                f.put("app_id", m.a().n());
                f.put("nw_ver", com.anythink.core.common.j.d.h());
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.a;
                if (list != null && list.size() > 0) {
                    for (String str : this.a) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONArray.put(new JSONObject(str));
                        }
                    }
                }
                f.put("data", jSONArray);
            } catch (Exception unused) {
            }
        }
        try {
            a.put(com.anythink.core.common.g.c.Q, this.h);
            a.put(com.anythink.core.common.g.c.S, this.i);
        } catch (Exception unused2) {
        }
        HashMap hashMap = new HashMap();
        String a2 = com.anythink.core.common.j.c.a(f.toString());
        String a3 = com.anythink.core.common.j.c.a(a.toString());
        hashMap.put(com.anythink.core.common.g.c.L, "1.0");
        hashMap.put("p", a2);
        hashMap.put(com.anythink.core.common.g.c.U, a3);
        ArrayList arrayList = new ArrayList(hashMap.size());
        arrayList.addAll(hashMap.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str2);
            sb.append(AppCenter.KEY_VALUE_DELIMITER);
            sb.append(hashMap.get(str2));
        }
        hashMap.put("sign", f.c(m.a().o() + sb.toString()));
        return new JSONObject(hashMap).toString();
    }

    public final int a() {
        return this.b;
    }

    @Override // com.anythink.core.common.g.a.b
    public final int b() {
        return 2;
    }

    @Override // com.anythink.core.common.g.a.b
    public final int c() {
        return 3;
    }

    @Override // com.anythink.core.common.g.a.b
    public final byte[] d() {
        return b.a(h());
    }

    @Override // com.anythink.core.common.g.a.b
    public final boolean e() {
        return false;
    }
}