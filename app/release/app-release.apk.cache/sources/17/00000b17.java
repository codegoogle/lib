package com.anythink.expressad.videocommon.c;

import android.text.TextUtils;
import com.p7700g.p99005.wo1;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {
    private String a;
    private int b;

    public c(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private static c c() {
        return new c("Virtual Item", 1);
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Reward{name='");
        wo1.d0(sb, this.a, '\'', ", amount=");
        return wo1.y(sb, this.b, '}');
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[Catch: Exception -> 0x002f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0001, B:5:0x000f, B:12:0x002a, B:8:0x0017, B:10:0x001d), top: B:17:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c b(String str) {
        c cVar;
        c cVar2 = null;
        try {
            com.anythink.expressad.videocommon.e.a b = com.anythink.expressad.videocommon.e.c.a().b();
            if (TextUtils.isEmpty(str)) {
                cVar = c();
            } else {
                if (b != null && b.j() != null) {
                    cVar = b.j().get(str);
                }
                return cVar2 != null ? c() : cVar2;
            }
            cVar2 = cVar;
            if (cVar2 != null) {
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void a(String str) {
        this.a = str;
    }

    public final void a(int i) {
        this.b = i;
    }

    public static Map<String, c> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("id"), new c(optJSONObject.optString("name"), optJSONObject.optInt("amount")));
            }
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static c a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("name");
                int optInt = jSONObject.optInt("amount");
                jSONObject.optString("id");
                return new c(optString, optInt);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}