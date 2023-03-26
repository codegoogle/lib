package com.onesignal;

import com.p7700g.p99005.jm3;
import com.p7700g.p99005.pl3;
import com.p7700g.p99005.ql3;

/* loaded from: classes3.dex */
public class OSSMSSubscriptionChangedInternalObserver {
    public static void a(pl3 pl3Var) {
        if (jm3.L0().c(new ql3(jm3.p0, (pl3) pl3Var.clone()))) {
            pl3 pl3Var2 = (pl3) pl3Var.clone();
            jm3.p0 = pl3Var2;
            pl3Var2.g();
        }
    }

    public void changed(pl3 pl3Var) {
        a(pl3Var);
    }
}