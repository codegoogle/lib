package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeEventsV2Repository.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/p7700g/p99005/uo3;", "Lcom/p7700g/p99005/qo3;", "", com.anythink.expressad.videocommon.e.b.u, "", "deviceType", "Lcom/p7700g/p99005/bp3;", "event", "Lcom/p7700g/p99005/mm3;", "responseHandler", "Lcom/p7700g/p99005/yq4;", "d", "(Ljava/lang/String;ILcom/p7700g/p99005/bp3;Lcom/p7700g/p99005/mm3;)V", "Lcom/p7700g/p99005/tk3;", "logger", "Lcom/p7700g/p99005/no3;", "outcomeEventsCache", "Lcom/p7700g/p99005/xo3;", "outcomeEventsService", "<init>", "(Lcom/p7700g/p99005/tk3;Lcom/p7700g/p99005/no3;Lcom/p7700g/p99005/xo3;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class uo3 extends qo3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo3(@NotNull tk3 tk3Var, @NotNull no3 no3Var, @NotNull xo3 xo3Var) {
        super(tk3Var, no3Var, xo3Var);
        c25.p(tk3Var, "logger");
        c25.p(no3Var, "outcomeEventsCache");
        c25.p(xo3Var, "outcomeEventsService");
    }

    @Override // com.p7700g.p99005.qo3, com.p7700g.p99005.cp3
    public void d(@NotNull String str, int i, @NotNull bp3 bp3Var, @NotNull mm3 mm3Var) {
        c25.p(str, com.anythink.expressad.videocommon.e.b.u);
        c25.p(bp3Var, "event");
        c25.p(mm3Var, "responseHandler");
        try {
            JSONObject put = bp3Var.h().put("app_id", str).put("device_type", i);
            xo3 k = k();
            c25.o(put, "jsonObject");
            k.a(put, mm3Var);
        } catch (JSONException e) {
            j().a("Generating indirect outcome:JSON Failed.", e);
        }
    }
}