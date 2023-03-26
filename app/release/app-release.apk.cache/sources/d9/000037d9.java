package com.onesignal;

import com.p7700g.p99005.jm3;
import com.p7700g.p99005.vl3;

/* loaded from: classes3.dex */
public class OSSubscriptionChangedInternalObserver {
    public static void a(OSSubscriptionState oSSubscriptionState) {
        if (jm3.T0().c(new vl3(jm3.j0, (OSSubscriptionState) oSSubscriptionState.clone()))) {
            OSSubscriptionState oSSubscriptionState2 = (OSSubscriptionState) oSSubscriptionState.clone();
            jm3.j0 = oSSubscriptionState2;
            oSSubscriptionState2.g();
        }
    }

    public void changed(OSSubscriptionState oSSubscriptionState) {
        a(oSSubscriptionState);
    }
}