package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInfluence.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'B#\b\u0016\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010\u001e\u001a\u00020\u0018\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b&\u0010(J\r\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R$\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/p7700g/p99005/do3;", "", "a", "()Lcom/p7700g/p99005/do3;", "", "h", "()Ljava/lang/String;", "toString", ij3.b, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "directId", "Lorg/json/JSONArray;", "c", "Lorg/json/JSONArray;", "()Lorg/json/JSONArray;", "f", "(Lorg/json/JSONArray;)V", "ids", "Lcom/p7700g/p99005/fo3;", "Lcom/p7700g/p99005/fo3;", "e", "()Lcom/p7700g/p99005/fo3;", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/fo3;)V", "influenceType", "Lcom/p7700g/p99005/eo3;", "<set-?>", "Lcom/p7700g/p99005/eo3;", "d", "()Lcom/p7700g/p99005/eo3;", "influenceChannel", "jsonString", "<init>", "(Ljava/lang/String;)V", "(Lcom/p7700g/p99005/eo3;Lcom/p7700g/p99005/fo3;Lorg/json/JSONArray;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class do3 {
    @NotNull
    private fo3 a;
    @NotNull
    private eo3 b;
    @Nullable
    private JSONArray c;

    public do3(@NotNull String str) throws JSONException {
        c25.p(str, "jsonString");
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString(wn3.b);
        String string2 = jSONObject.getString(wn3.c);
        String string3 = jSONObject.getString(wn3.d);
        this.b = eo3.v.a(string);
        this.a = fo3.x.a(string2);
        c25.o(string3, "ids");
        this.c = string3.length() == 0 ? null : new JSONArray(string3);
    }

    @NotNull
    public final do3 a() {
        return new do3(this.b, this.a, this.c);
    }

    @Nullable
    public final String b() throws JSONException {
        JSONArray jSONArray = this.c;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        return jSONArray.getString(0);
    }

    @Nullable
    public final JSONArray c() {
        return this.c;
    }

    @NotNull
    public final eo3 d() {
        return this.b;
    }

    @NotNull
    public final fo3 e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!c25.g(do3.class, obj.getClass()))) {
            return false;
        }
        do3 do3Var = (do3) obj;
        return this.b == do3Var.b && this.a == do3Var.a;
    }

    public final void f(@Nullable JSONArray jSONArray) {
        this.c = jSONArray;
    }

    public final void g(@NotNull fo3 fo3Var) {
        c25.p(fo3Var, "<set-?>");
        this.a = fo3Var;
    }

    @NotNull
    public final String h() throws JSONException {
        JSONObject put = new JSONObject().put(wn3.b, this.b.toString()).put(wn3.c, this.a.toString());
        JSONArray jSONArray = this.c;
        String jSONObject = put.put(wn3.d, jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        c25.o(jSONObject, "JSONObject()\n        .pu…e \"\")\n        .toString()");
        return jSONObject;
    }

    public int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("SessionInfluence{influenceChannel=");
        G.append(this.b);
        G.append(", influenceType=");
        G.append(this.a);
        G.append(", ids=");
        G.append(this.c);
        G.append('}');
        return G.toString();
    }

    public do3(@NotNull eo3 eo3Var, @NotNull fo3 fo3Var, @Nullable JSONArray jSONArray) {
        c25.p(eo3Var, "influenceChannel");
        c25.p(fo3Var, "influenceType");
        this.b = eo3Var;
        this.a = fo3Var;
        this.c = jSONArray;
    }
}