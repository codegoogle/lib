package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeEventsV1Repository.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ/\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/p7700g/p99005/so3;", "Lcom/p7700g/p99005/qo3;", "", com.anythink.expressad.videocommon.e.b.u, "", "deviceType", "Lcom/p7700g/p99005/hl3;", "event", "Lcom/p7700g/p99005/mm3;", "responseHandler", "Lcom/p7700g/p99005/yq4;", "l", "(Ljava/lang/String;ILcom/p7700g/p99005/hl3;Lcom/p7700g/p99005/mm3;)V", com.anythink.expressad.d.a.b.dH, "n", "Lcom/p7700g/p99005/bp3;", "eventParams", "d", "(Ljava/lang/String;ILcom/p7700g/p99005/bp3;Lcom/p7700g/p99005/mm3;)V", "Lcom/p7700g/p99005/tk3;", "logger", "Lcom/p7700g/p99005/no3;", "outcomeEventsCache", "Lcom/p7700g/p99005/xo3;", "outcomeEventsService", "<init>", "(Lcom/p7700g/p99005/tk3;Lcom/p7700g/p99005/no3;Lcom/p7700g/p99005/xo3;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class so3 extends qo3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so3(@NotNull tk3 tk3Var, @NotNull no3 no3Var, @NotNull xo3 xo3Var) {
        super(tk3Var, no3Var, xo3Var);
        c25.p(tk3Var, "logger");
        c25.p(no3Var, "outcomeEventsCache");
        c25.p(xo3Var, "outcomeEventsService");
    }

    private final void l(String str, int i, hl3 hl3Var, mm3 mm3Var) {
        try {
            JSONObject put = hl3Var.h().put("app_id", str).put("device_type", i).put("direct", true);
            xo3 k = k();
            c25.o(put, "jsonObject");
            k.a(put, mm3Var);
        } catch (JSONException e) {
            j().a("Generating direct outcome:JSON Failed.", e);
        }
    }

    private final void m(String str, int i, hl3 hl3Var, mm3 mm3Var) {
        try {
            JSONObject put = hl3Var.h().put("app_id", str).put("device_type", i).put("direct", false);
            xo3 k = k();
            c25.o(put, "jsonObject");
            k.a(put, mm3Var);
        } catch (JSONException e) {
            j().a("Generating indirect outcome:JSON Failed.", e);
        }
    }

    private final void n(String str, int i, hl3 hl3Var, mm3 mm3Var) {
        try {
            JSONObject put = hl3Var.h().put("app_id", str).put("device_type", i);
            xo3 k = k();
            c25.o(put, "jsonObject");
            k.a(put, mm3Var);
        } catch (JSONException e) {
            j().a("Generating unattributed outcome:JSON Failed.", e);
        }
    }

    @Override // com.p7700g.p99005.qo3, com.p7700g.p99005.cp3
    public void d(@NotNull String str, int i, @NotNull bp3 bp3Var, @NotNull mm3 mm3Var) {
        c25.p(str, com.anythink.expressad.videocommon.e.b.u);
        c25.p(bp3Var, "eventParams");
        c25.p(mm3Var, "responseHandler");
        hl3 a = hl3.a(bp3Var);
        c25.o(a, "event");
        fo3 d = a.d();
        if (d == null) {
            return;
        }
        int ordinal = d.ordinal();
        if (ordinal == 0) {
            l(str, i, a, mm3Var);
        } else if (ordinal == 1) {
            m(str, i, a, mm3Var);
        } else if (ordinal != 2) {
        } else {
            n(str, i, a, mm3Var);
        }
    }
}