package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeSource.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/p7700g/p99005/dp3;", "", "Lorg/json/JSONObject;", com.anythink.basead.d.g.i, "()Lorg/json/JSONObject;", "Lcom/p7700g/p99005/ep3;", "directBody", "c", "(Lcom/p7700g/p99005/ep3;)Lcom/p7700g/p99005/dp3;", "indirectBody", "e", "", "toString", "()Ljava/lang/String;", "b", "Lcom/p7700g/p99005/ep3;", "()Lcom/p7700g/p99005/ep3;", "f", "(Lcom/p7700g/p99005/ep3;)V", "a", "d", "<init>", "(Lcom/p7700g/p99005/ep3;Lcom/p7700g/p99005/ep3;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class dp3 {
    @Nullable
    private ep3 a;
    @Nullable
    private ep3 b;

    public dp3(@Nullable ep3 ep3Var, @Nullable ep3 ep3Var2) {
        this.a = ep3Var;
        this.b = ep3Var2;
    }

    @Nullable
    public final ep3 a() {
        return this.a;
    }

    @Nullable
    public final ep3 b() {
        return this.b;
    }

    @NotNull
    public final dp3 c(@Nullable ep3 ep3Var) {
        this.a = ep3Var;
        return this;
    }

    public final void d(@Nullable ep3 ep3Var) {
        this.a = ep3Var;
    }

    @NotNull
    public final dp3 e(@Nullable ep3 ep3Var) {
        this.b = ep3Var;
        return this;
    }

    public final void f(@Nullable ep3 ep3Var) {
        this.b = ep3Var;
    }

    @NotNull
    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ep3 ep3Var = this.a;
        if (ep3Var != null) {
            jSONObject.put("direct", ep3Var.e());
        }
        ep3 ep3Var2 = this.b;
        if (ep3Var2 != null) {
            jSONObject.put(ko3.j, ep3Var2.e());
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("OSOutcomeSource{directBody=");
        G.append(this.a);
        G.append(", indirectBody=");
        G.append(this.b);
        G.append('}');
        return G.toString();
    }
}