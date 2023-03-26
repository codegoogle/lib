package com.ironsource.environment.f;

import com.ironsource.environment.f.a;
import com.ironsource.mediationsdk.C1284r;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.vo4;
import com.p7700g.p99005.xn4;
import com.p7700g.p99005.zn4;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0007J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ironsource/environment/token/TokenProvider;", "", "()V", "mGlobalDataReader", "Lcom/ironsource/environment/globaldata/GlobalDataReader;", "mTokenKeyList", "", "", "[Ljava/lang/String;", "formatDataMetaData", "Lorg/json/JSONObject;", "tokenData", "getToken", "context", "Landroid/content/Context;", "environment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    @NotNull
    public final String[] a;
    @NotNull
    private final C1284r b;

    public b() {
        String[] strArr;
        a.C0113a c0113a = a.a;
        strArr = a.b;
        this.a = strArr;
        this.b = new C1284r();
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject a = com.ironsource.environment.c.b.a(jSONObject.optJSONObject("md"));
        if (a != null) {
            jSONObject.put("md", a);
        }
        return jSONObject;
    }

    @xn4(level = zn4.WARNING, message = "Use the new method getToken(context: Context)")
    @NotNull
    public final JSONObject a() {
        JSONObject a = C1284r.a(this.a);
        c25.o(a, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(a);
    }
}