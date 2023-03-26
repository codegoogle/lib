package com.p7700g.p99005;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ye3 {
    private static final String a = "com.p7700g.p99005.ye3";
    private final we3 b;
    private final bf3 c;

    public ye3(we3 we3Var, bf3 bf3Var) {
        this.b = we3Var;
        this.c = bf3Var;
    }

    private static String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put("hash", SDKUtils.encodeString(str3));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public final void messageHandler(String str, String str2, String str3) {
        try {
            String str4 = a;
            Logger.i(str4, "messageHandler(" + str + " " + str3 + ")");
            if (this.c.b(str, str2, str3)) {
                this.b.a(str, str2);
                return;
            }
            we3 we3Var = this.b;
            String a2 = a(str, str2, str3);
            x.d dVar = we3Var.b;
            if (dVar != null) {
                com.ironsource.sdk.controller.x xVar = com.ironsource.sdk.controller.x.this;
                com.ironsource.sdk.controller.x.this.b(com.ironsource.sdk.controller.x.x("unauthorizedMessage", a2, null, null));
            }
        } catch (Exception e) {
            e.printStackTrace();
            String str5 = a;
            Logger.i(str5, "messageHandler failed with exception " + e.getMessage());
        }
    }
}