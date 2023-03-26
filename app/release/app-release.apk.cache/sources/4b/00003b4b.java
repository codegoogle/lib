package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: OSNotificationIntentExtras.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004\"\u0004\b\u0018\u0010\u0019R$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/p7700g/p99005/bl3;", "", "Lorg/json/JSONArray;", "a", "()Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "dataArray", "jsonData", "c", "(Lorg/json/JSONArray;Lorg/json/JSONObject;)Lcom/p7700g/p99005/bl3;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/json/JSONArray;", "e", com.anythink.basead.d.g.i, "(Lorg/json/JSONArray;)V", "Lorg/json/JSONObject;", "f", "h", "(Lorg/json/JSONObject;)V", "<init>", "(Lorg/json/JSONArray;Lorg/json/JSONObject;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class bl3 {
    @Nullable
    private JSONArray a;
    @Nullable
    private JSONObject b;

    public bl3(@Nullable JSONArray jSONArray, @Nullable JSONObject jSONObject) {
        this.a = jSONArray;
        this.b = jSONObject;
    }

    public static /* synthetic */ bl3 d(bl3 bl3Var, JSONArray jSONArray, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONArray = bl3Var.a;
        }
        if ((i & 2) != 0) {
            jSONObject = bl3Var.b;
        }
        return bl3Var.c(jSONArray, jSONObject);
    }

    @Nullable
    public final JSONArray a() {
        return this.a;
    }

    @Nullable
    public final JSONObject b() {
        return this.b;
    }

    @NotNull
    public final bl3 c(@Nullable JSONArray jSONArray, @Nullable JSONObject jSONObject) {
        return new bl3(jSONArray, jSONObject);
    }

    @Nullable
    public final JSONArray e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof bl3) {
                bl3 bl3Var = (bl3) obj;
                return c25.g(this.a, bl3Var.a) && c25.g(this.b, bl3Var.b);
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final JSONObject f() {
        return this.b;
    }

    public final void g(@Nullable JSONArray jSONArray) {
        this.a = jSONArray;
    }

    public final void h(@Nullable JSONObject jSONObject) {
        this.b = jSONObject;
    }

    public int hashCode() {
        JSONArray jSONArray = this.a;
        int hashCode = (jSONArray != null ? jSONArray.hashCode() : 0) * 31;
        JSONObject jSONObject = this.b;
        return hashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("OSNotificationIntentExtras(dataArray=");
        G.append(this.a);
        G.append(", jsonData=");
        G.append(this.b);
        G.append(")");
        return G.toString();
    }
}