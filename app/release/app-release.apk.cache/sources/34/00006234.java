package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: OSOutcomeEventsV2Service.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/p7700g/p99005/vo3;", "Lcom/p7700g/p99005/oo3;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/p7700g/p99005/mm3;", "responseHandler", "Lcom/p7700g/p99005/yq4;", "a", "(Lorg/json/JSONObject;Lcom/p7700g/p99005/mm3;)V", "Lcom/p7700g/p99005/km3;", m31.a, "<init>", "(Lcom/p7700g/p99005/km3;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class vo3 extends oo3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo3(@NotNull km3 km3Var) {
        super(km3Var);
        c25.p(km3Var, m31.a);
    }

    @Override // com.p7700g.p99005.oo3, com.p7700g.p99005.xo3
    public void a(@NotNull JSONObject jSONObject, @NotNull mm3 mm3Var) {
        c25.p(jSONObject, "jsonObject");
        c25.p(mm3Var, "responseHandler");
        b().e("outcomes/measure_sources", jSONObject, mm3Var);
    }
}