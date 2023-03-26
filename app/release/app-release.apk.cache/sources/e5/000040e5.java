package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeSourceBody.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/p7700g/p99005/ep3;", "", "Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "Lorg/json/JSONArray;", "b", "Lorg/json/JSONArray;", "a", "()Lorg/json/JSONArray;", "c", "(Lorg/json/JSONArray;)V", "inAppMessagesIds", "d", "notificationIds", "<init>", "(Lorg/json/JSONArray;Lorg/json/JSONArray;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class ep3 {
    @Nullable
    private JSONArray a;
    @Nullable
    private JSONArray b;

    @gz4
    public ep3() {
        this(null, null, 3, null);
    }

    @gz4
    public ep3(@Nullable JSONArray jSONArray) {
        this(jSONArray, null, 2, null);
    }

    @gz4
    public ep3(@Nullable JSONArray jSONArray, @Nullable JSONArray jSONArray2) {
        this.a = jSONArray;
        this.b = jSONArray2;
    }

    @Nullable
    public final JSONArray a() {
        return this.b;
    }

    @Nullable
    public final JSONArray b() {
        return this.a;
    }

    public final void c(@Nullable JSONArray jSONArray) {
        this.b = jSONArray;
    }

    public final void d(@Nullable JSONArray jSONArray) {
        this.a = jSONArray;
    }

    @NotNull
    public final JSONObject e() throws JSONException {
        JSONObject put = new JSONObject().put("notification_ids", this.a).put(ko3.l, this.b);
        c25.o(put, "JSONObject()\n        .pu…AM_IDS, inAppMessagesIds)");
        return put;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("OSOutcomeSourceBody{notificationIds=");
        G.append(this.a);
        G.append(", inAppMessagesIds=");
        G.append(this.b);
        G.append('}');
        return G.toString();
    }

    public /* synthetic */ ep3(JSONArray jSONArray, JSONArray jSONArray2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new JSONArray() : jSONArray, (i & 2) != 0 ? new JSONArray() : jSONArray2);
    }
}