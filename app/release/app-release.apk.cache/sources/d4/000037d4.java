package com.onesignal;

import com.p7700g.p99005.an3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.ki3;
import com.p7700g.p99005.kl3;
import com.p7700g.p99005.ll3;

/* loaded from: classes3.dex */
public class OSPermissionChangedInternalObserver {
    public static void a(kl3 kl3Var) {
        if (jm3.E0().c(new ll3(jm3.g0, (kl3) kl3Var.clone()))) {
            kl3 kl3Var2 = (kl3) kl3Var.clone();
            jm3.g0 = kl3Var2;
            kl3Var2.d();
        }
    }

    public static void b(kl3 kl3Var) {
        if (!kl3Var.a()) {
            ki3.d(0, jm3.g);
        }
        an3.z(jm3.G());
    }

    public void changed(kl3 kl3Var) {
        b(kl3Var);
        a(kl3Var);
    }
}