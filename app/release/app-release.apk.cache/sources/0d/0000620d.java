package com.p7700g.p99005;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public final class vm2 extends um2 {
    public final String v;

    public vm2(wm2 wm2Var, TaskCompletionSource taskCompletionSource, String str) {
        super(wm2Var, new wl2("OnRequestInstallCallback"), taskCompletionSource);
        this.v = str;
    }

    @Override // com.p7700g.p99005.um2, com.p7700g.p99005.vl2
    public final void Y0(Bundle bundle) throws RemoteException {
        super.Y0(bundle);
        this.t.trySetResult(new om2((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}