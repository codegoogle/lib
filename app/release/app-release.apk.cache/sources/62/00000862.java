package com.anythink.expressad.foundation.h;

import com.p7700g.p99005.qm3;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g {
    private static final String a = "JSONUtils";

    public static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            ArrayList<String> arrayList = new ArrayList<>(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.optString(i));
            }
            return arrayList;
        }
        return null;
    }

    public static String a(int i, int i2, int i3, int i4, int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("code", 0);
                jSONObject.put(qm3.b.j, "Sucess");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rotateAngle", i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("left", i2);
                jSONObject3.put("right", i3);
                jSONObject3.put("top", i4);
                jSONObject3.put("bottom", i5);
                jSONObject2.put("cutoutInfo", jSONObject3);
                jSONObject.put("data", jSONObject2);
            } catch (Exception e) {
                n.d(a, e.getMessage());
            }
        } catch (Throwable th) {
            n.d(a, th.getMessage());
            try {
                jSONObject.put("code", 1);
                jSONObject.put(qm3.b.j, "Fail");
            } catch (JSONException e2) {
                n.d(a, e2.getMessage());
            }
        }
        return jSONObject.toString();
    }
}