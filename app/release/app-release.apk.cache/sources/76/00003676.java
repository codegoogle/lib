package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import android.os.Build;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b implements d {
    public c a;

    public b(JSONObject jSONObject, Context context) {
        c aVar;
        if (jSONObject.optInt("connectivityStrategy") == 1) {
            aVar = new a(this);
        } else {
            aVar = (Build.VERSION.SDK_INT < 23 || !com.ironsource.environment.c.b(context, "android.permission.ACCESS_NETWORK_STATE")) ? new a(this) : new e(this);
        }
        this.a = aVar;
        String simpleName = b.class.getSimpleName();
        Logger.i(simpleName, "created ConnectivityAdapter with strategy " + this.a.getClass().getSimpleName());
    }

    @Override // com.ironsource.sdk.service.Connectivity.d
    public void a() {
    }

    @Override // com.ironsource.sdk.service.Connectivity.d
    public void a(String str) {
    }

    @Override // com.ironsource.sdk.service.Connectivity.d
    public void a(String str, JSONObject jSONObject) {
    }
}