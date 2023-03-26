package com.p7700g.p99005;

import android.content.Context;
import android.util.Log;
import com.p7700g.p99005.mx1;

/* compiled from: DefaultConnectivityMonitorFactory.java */
/* loaded from: classes2.dex */
public class px1 implements nx1 {
    private static final String a = "ConnectivityMonitor";
    private static final String b = "android.permission.ACCESS_NETWORK_STATE";

    @Override // com.p7700g.p99005.nx1
    @x1
    public mx1 a(@x1 Context context, @x1 mx1.a aVar) {
        boolean z = gh.a(context, b) == 0;
        Log.isLoggable(a, 3);
        if (z) {
            return new ox1(context, aVar);
        }
        return new xx1();
    }
}