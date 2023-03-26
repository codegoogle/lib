package com.p7700g.p99005;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class me3 {
    private final String a = "eventId";
    private final String b = "timestamp";
    private final String c = "InterstitialEvents";
    private final String d = "events";
    private final String e = "events";
    public JSONObject f;
    public int g;
    public String h;

    public static JSONObject c(com.ironsource.mediationsdk.a.c cVar) {
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(cVar.c()) ? new JSONObject(cVar.c()) : new JSONObject();
            jSONObject.put("eventId", cVar.a());
            jSONObject.put("timestamp", cVar.b());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String a() {
        return TextUtils.isEmpty(this.h) ? b() : this.h;
    }

    public abstract String a(ArrayList<com.ironsource.mediationsdk.a.c> arrayList, JSONObject jSONObject);

    public abstract String b();

    public final String b(JSONArray jSONArray) {
        try {
            if (this.f != null) {
                JSONObject jSONObject = new JSONObject(this.f.toString());
                jSONObject.put("timestamp", IronSourceUtils.getTimeStamp());
                String str = "events";
                if (this.g == 2) {
                    str = "InterstitialEvents";
                }
                jSONObject.put(str, jSONArray);
                return jSONObject.toString();
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public abstract String c();
}