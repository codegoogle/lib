package com.anythink.expressad.video.bt.a;

import android.text.TextUtils;
import android.util.Base64;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.qm3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    private static final String c = "HandlerH5MessageManager";
    public int a;
    public int b;
    private String d;

    /* loaded from: classes2.dex */
    public static final class a {
        private static b a = new b((byte) 0);

        private a() {
        }
    }

    public /* synthetic */ b(byte b) {
        this();
    }

    public static b a() {
        return a.a;
    }

    private b() {
        this.d = "handlerNativeResult";
        this.a = 0;
        this.b = 1;
    }

    public final void a(Object obj, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(jSONObject.toString())) {
                a(this.b, "params is null", obj);
                return;
            }
            String optString = jSONObject.optString("uniqueIdentifier");
            String optString2 = jSONObject.optString("name");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.toString())) {
                    optJSONObject.optInt("type", 0);
                }
                a(this.a, "receivedMessage", obj);
                if (optString.equalsIgnoreCase("reporter") || !optString.equalsIgnoreCase("MediaPlayer")) {
                    return;
                }
                com.anythink.expressad.video.bt.a.a.a().a(obj, optString2, optJSONArray);
                return;
            }
            a(this.b, "module or method is null", obj);
        } catch (Exception e) {
            n.a(c, e.getMessage());
            a(this.b, e.getMessage(), obj);
        } catch (Throwable th) {
            n.a(c, th.getMessage());
            a(this.b, th.getMessage(), obj);
        }
    }

    private static void a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put(qm3.b.j, str);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            n.a(c, e.getMessage());
        } catch (Throwable th) {
            n.a(c, th.getMessage());
        }
    }
}