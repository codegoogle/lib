package com.p7700g.p99005;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public class um2 extends ul2 {
    public final wl2 s;
    public final TaskCompletionSource t;
    public final /* synthetic */ wm2 u;

    public um2(wm2 wm2Var, wl2 wl2Var, TaskCompletionSource taskCompletionSource) {
        this.u = wm2Var;
        this.s = wl2Var;
        this.t = taskCompletionSource;
    }

    @Override // com.p7700g.p99005.vl2
    public void Y0(Bundle bundle) throws RemoteException {
        hm2 hm2Var = this.u.b;
        if (hm2Var != null) {
            hm2Var.r(this.t);
        }
        this.s.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}