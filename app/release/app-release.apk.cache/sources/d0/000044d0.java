package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public final class gm2 implements ServiceConnection {
    public final /* synthetic */ hm2 s;

    public /* synthetic */ gm2(hm2 hm2Var, fm2 fm2Var) {
        this.s = hm2Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hm2.f(this.s).d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.s.c().post(new dm2(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        hm2.f(this.s).d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.s.c().post(new em2(this));
    }
}