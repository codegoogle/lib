package com.facebook.ads.redexgen.X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class QA {
    public static boolean A00(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Q9 A00 = Q9.A00(jSONArray, i);
            Q9 t2 = Q9.A00(jSONArray2, i);
            if (A00 != t2 || !A00.A06(jSONArray, jSONArray2, i)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean A01(JSONArray jSONArray, JSONArray jSONArray2) {
        return A00(jSONArray, jSONArray2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            Q9 A01 = Q9.A01(jSONObject, next);
            Q9 type1 = Q9.A01(jSONObject2, next);
            if (A01 != type1 || !A01.A08(jSONObject, jSONObject2, next)) {
                return false;
            }
            while (keys.hasNext()) {
            }
        }
        return true;
    }
}