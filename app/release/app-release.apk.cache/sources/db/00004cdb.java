package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessagePage.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/p7700g/p99005/kk3;", "", "Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", lk3.a, "b", "d", lk3.b, "jsonObject", "<init>", "(Lorg/json/JSONObject;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public class kk3 {
    @Nullable
    private String a;
    @Nullable
    private String b;

    public kk3(@NotNull JSONObject jSONObject) {
        c25.p(jSONObject, "jsonObject");
        this.a = jSONObject.optString(lk3.a, null);
        this.b = jSONObject.optString(lk3.b, null);
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    public final void c(@Nullable String str) {
        this.a = str;
    }

    public final void d(@Nullable String str) {
        this.b = str;
    }

    @NotNull
    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(lk3.a, this.a);
            jSONObject.put(lk3.b, this.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}