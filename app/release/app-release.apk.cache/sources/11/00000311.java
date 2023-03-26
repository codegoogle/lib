package com.anchorfree.sdk;

import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.exceptions.CnlBlockedException;
import com.p7700g.p99005.dq0;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.g51;
import com.p7700g.p99005.i61;
import com.p7700g.p99005.k21;
import com.p7700g.p99005.o51;
import com.p7700g.p99005.r31;
import com.p7700g.p99005.x1;
import java.util.List;

/* loaded from: classes.dex */
public class CnlConfigPatcher implements r31 {
    @Override // com.p7700g.p99005.r31
    public void validate(@x1 String str, boolean z, @x1 g51 g51Var) throws Exception {
        o51 o51Var = (o51) i61.a().d(o51.class);
        if (z) {
            dq0<List<ClientInfo>> q0 = o51Var.q0();
            q0.Y();
            k21 k21Var = (k21) i61.a().b(k21.class);
            List<ClientInfo> F = q0.F();
            if (F == null || k21Var == null) {
                return;
            }
            for (ClientInfo clientInfo : F) {
                if (k21Var.a(clientInfo.getCarrierId()) == en1.IDLE) {
                    throw new CnlBlockedException();
                }
            }
        }
    }
}