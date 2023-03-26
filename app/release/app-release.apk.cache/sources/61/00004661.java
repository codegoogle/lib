package com.p7700g.p99005;

import android.text.TextUtils;
import com.anchorfree.partner.api.ClientInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: CredsSourcePicker.java */
/* loaded from: classes2.dex */
public class hf1 {
    @x1
    private static final kj1 a = kj1.b("SwitchableCredentialsSource");
    @x1
    private final o51 b;
    @x1
    private final Executor c;
    @x1
    private final Map<String, ho1> d = new HashMap();
    @x1
    private final pa1 e;
    private r41 f;

    public hf1(@x1 o51 o51Var, @x1 Executor executor, @x1 pa1 pa1Var, @x1 r41 r41Var) {
        this.b = o51Var;
        this.c = executor;
        this.e = pa1Var;
        this.f = r41Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ lf1 c(String str, ClientInfo clientInfo, o41 o41Var, dq0 dq0Var) throws Exception {
        j51 j51Var;
        List<j51> list = (List) dq0Var.F();
        if (list != null) {
            if (TextUtils.isEmpty(str) && list.size() > 0) {
                j51Var = (j51) list.get(0);
            } else {
                j51 j51Var2 = null;
                for (j51 j51Var3 : list) {
                    if (j51Var3.d().equals(str)) {
                        j51Var2 = j51Var3;
                    }
                }
                j51Var = j51Var2;
            }
            a.c("Ensure transport: %s", j51Var);
            if (j51Var != null) {
                String format = String.format("%s:%s:%s", j51Var.d(), clientInfo.getBaseUrl(), clientInfo.getCarrierId());
                ho1 ho1Var = this.d.get(format);
                if (ho1Var == null) {
                    ho1Var = this.e.b(j51Var, clientInfo, new v41(this.b, "creds", this.f, true), o41Var, this.b);
                    this.d.put(format, ho1Var);
                }
                return new lf1(j51Var, ho1Var);
            }
        }
        return null;
    }

    @x1
    private dq0<List<j51>> d() {
        return this.b.s0();
    }

    @x1
    public dq0<lf1> a(@x1 final String str, @x1 final ClientInfo clientInfo, @x1 final o41 o41Var) {
        return d().s(new aq0() { // from class: com.p7700g.p99005.xe1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return hf1.this.c(str, clientInfo, o41Var, dq0Var);
            }
        }, this.c);
    }
}