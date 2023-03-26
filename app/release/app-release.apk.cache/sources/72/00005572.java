package com.p7700g.p99005;

import android.text.TextUtils;
import com.anchorfree.sdk.HydraCredentialsSource;
import com.anchorfree.sdk.SessionConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: HydraRemotePatchHandler.java */
/* loaded from: classes.dex */
public class p31 implements HydraCredentialsSource.b {
    @x1
    private final kj1 a;

    public p31(@x1 kj1 kj1Var) {
        this.a = kj1Var;
    }

    @Override // com.anchorfree.sdk.HydraCredentialsSource.b
    public String a(@x1 ft0 ft0Var, @x1 String str, @x1 q21 q21Var, @x1 SessionConfig sessionConfig) throws Exception {
        JSONObject optJSONObject;
        String str2 = q21Var.d;
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                la1 la1Var = new la1(str);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("application");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("sd")) != null) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("patches");
                    if (optJSONArray != null) {
                        la1Var.u(optJSONArray);
                    }
                    return la1Var.j();
                }
            } catch (Throwable th) {
                this.a.f(th);
            }
        }
        return str;
    }
}