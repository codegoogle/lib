package com.p7700g.p99005;

import com.anchorfree.sdk.RemoteConfigLoader;
import com.google.gson.Gson;
import org.json.JSONObject;

/* compiled from: RemoteConfigHelper.java */
/* loaded from: classes.dex */
public class k41 {
    @z1
    private final mr0 a;
    private final Gson b = new Gson();

    public k41(@z1 mr0 mr0Var) {
        this.a = mr0Var;
    }

    @x1
    public RemoteConfigLoader.FilesObject a() {
        if (this.a == null) {
            return new RemoteConfigLoader.FilesObject();
        }
        try {
            JSONObject optJSONObject = new JSONObject(this.a.f()).optJSONObject("files");
            if (optJSONObject == null) {
                return new RemoteConfigLoader.FilesObject();
            }
            return (RemoteConfigLoader.FilesObject) this.b.n(optJSONObject.toString(), RemoteConfigLoader.FilesObject.class);
        } catch (Throwable unused) {
            return new RemoteConfigLoader.FilesObject();
        }
    }
}