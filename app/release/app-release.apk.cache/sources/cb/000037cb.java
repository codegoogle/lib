package com.onesignal;

import com.p7700g.p99005.jm3;
import com.p7700g.p99005.wj3;
import com.p7700g.p99005.xj3;

/* loaded from: classes3.dex */
public class OSEmailSubscriptionChangedInternalObserver {
    public static void a(wj3 wj3Var) {
        if (jm3.r0().c(new xj3(jm3.m0, (wj3) wj3Var.clone()))) {
            wj3 wj3Var2 = (wj3) wj3Var.clone();
            jm3.m0 = wj3Var2;
            wj3Var2.g();
        }
    }

    public void changed(wj3 wj3Var) {
        a(wj3Var);
    }
}