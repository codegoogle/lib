package com.p7700g.p99005;

import com.p7700g.p99005.vg1;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HydraResourceParser.java */
/* loaded from: classes2.dex */
public class wg1 {
    @x1
    public static vg1 a(@x1 String str) throws JSONException {
        ArrayList emptyList;
        ArrayList emptyList2;
        Object obj;
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString(xg1.v, "");
        int optInt = jSONObject.optInt(com.anythink.expressad.foundation.d.r.aB);
        String optString2 = jSONObject.optString("category_label", "");
        int optInt2 = jSONObject.optInt("category_id");
        if (jSONObject.has("vendor_labels")) {
            JSONArray jSONArray = jSONObject.getJSONArray("vendor_labels");
            ArrayList arrayList = new ArrayList(jSONObject.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            emptyList = arrayList;
        } else {
            emptyList = Collections.emptyList();
        }
        if (jSONObject.has(ko3.f)) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(ko3.f);
            ArrayList arrayList2 = new ArrayList(jSONObject.length());
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(jSONArray2.getString(i2));
            }
            emptyList2 = arrayList2;
        } else {
            emptyList2 = Collections.emptyList();
        }
        int optInt3 = jSONObject.optInt("action");
        int optInt4 = jSONObject.optInt("proto");
        int optInt5 = jSONObject.optInt("port");
        vg1.b bVar = null;
        try {
            obj = vg1.d.values()[optInt];
        } catch (Throwable unused) {
            obj = null;
        }
        try {
            bVar = vg1.b.values()[optInt3];
        } catch (Throwable unused2) {
        }
        return new vg1(optString, (vg1.d) r81.f(obj), optInt2, optString2, emptyList2, (vg1.b) r81.f(bVar), emptyList, optInt4, optInt5);
    }
}