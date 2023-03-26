package com.anythink.expressad.videocommon.c;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    private int a;
    private int b;
    private a c;

    public b(int i, int i2, a aVar) {
        this.a = i;
        this.b = i2;
        this.c = aVar;
    }

    private a c() {
        return this.c;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    private void a(int i) {
        this.a = i;
    }

    private void b(int i) {
        this.b = i;
    }

    private void a(a aVar) {
        this.c = aVar;
    }

    public static List<b> a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt("id");
                    int optInt2 = optJSONObject.optInt("timeout");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                    arrayList.add(new b(optInt, optInt2, optJSONObject2 != null ? a.a(optJSONObject2) : null));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }
}