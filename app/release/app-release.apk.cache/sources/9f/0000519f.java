package com.p7700g.p99005;

import android.text.TextUtils;
import com.anchorfree.sdk.HydraCredentialsSource;
import com.anchorfree.sdk.SessionConfig;
import org.json.JSONArray;

/* compiled from: HydraLocalConfigPatcher.java */
/* loaded from: classes.dex */
public class n31 implements HydraCredentialsSource.b {
    @x1
    private final kj1 a;
    @z1
    private final String b;

    public n31(@x1 kj1 kj1Var, @z1 String str) {
        this.a = kj1Var;
        this.b = str;
    }

    @Override // com.anchorfree.sdk.HydraCredentialsSource.b
    public String a(@x1 ft0 ft0Var, @x1 String str, @x1 q21 q21Var, @x1 SessionConfig sessionConfig) throws Exception {
        try {
            if (!TextUtils.isEmpty(this.b)) {
                JSONArray jSONArray = new JSONArray(this.b);
                la1 la1Var = new la1(str);
                la1Var.u(jSONArray);
                return la1Var.j();
            }
        } catch (Throwable th) {
            this.a.f(th);
        }
        return str;
    }
}