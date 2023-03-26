package com.onesignal;

import android.os.Bundle;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.sm3;

/* loaded from: classes3.dex */
public class HmsMessageServiceOneSignal extends HmsMessageService {
    /* JADX WARN: Multi-variable type inference failed */
    public void a(RemoteMessage remoteMessage) {
        sm3.a(this, remoteMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void b(String str) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.P1(u0Var, "HmsMessageServiceOneSignal onNewToken refresh token:" + str);
        sm3.b(this, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(String str, Bundle bundle) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.P1(u0Var, "HmsMessageServiceOneSignal onNewToken refresh token:" + str);
        sm3.c(this, str, bundle);
    }
}