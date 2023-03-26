package com.p7700g.p99005;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public final class bm2 extends xl2 {
    public final /* synthetic */ hm2 t;

    public bm2(hm2 hm2Var) {
        this.t = hm2Var;
    }

    @Override // com.p7700g.p99005.xl2
    public final void a() {
        IInterface iInterface;
        wl2 wl2Var;
        Context context;
        ServiceConnection serviceConnection;
        hm2 hm2Var = this.t;
        iInterface = hm2Var.n;
        if (iInterface != null) {
            wl2Var = hm2Var.c;
            wl2Var.d("Unbind from service.", new Object[0]);
            hm2 hm2Var2 = this.t;
            context = hm2Var2.b;
            serviceConnection = hm2Var2.m;
            context.unbindService(serviceConnection);
            this.t.h = false;
            this.t.n = null;
            this.t.m = null;
        }
        this.t.t();
    }
}