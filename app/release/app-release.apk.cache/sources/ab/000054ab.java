package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: OSOutcomeEventsClient.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\r\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/p7700g/p99005/oo3;", "Lcom/p7700g/p99005/xo3;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/p7700g/p99005/mm3;", "responseHandler", "Lcom/p7700g/p99005/yq4;", "a", "(Lorg/json/JSONObject;Lcom/p7700g/p99005/mm3;)V", "Lcom/p7700g/p99005/km3;", "Lcom/p7700g/p99005/km3;", "b", "()Lcom/p7700g/p99005/km3;", m31.a, "<init>", "(Lcom/p7700g/p99005/km3;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public abstract class oo3 implements xo3 {
    @NotNull
    private final km3 a;

    public oo3(@NotNull km3 km3Var) {
        c25.p(km3Var, m31.a);
        this.a = km3Var;
    }

    @Override // com.p7700g.p99005.xo3
    public abstract void a(@NotNull JSONObject jSONObject, @NotNull mm3 mm3Var);

    @NotNull
    public final km3 b() {
        return this.a;
    }
}