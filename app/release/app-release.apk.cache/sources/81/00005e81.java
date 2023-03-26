package com.p7700g.p99005;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public final class tm2 extends xl2 {
    public final /* synthetic */ TaskCompletionSource t;
    public final /* synthetic */ wm2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm2(wm2 wm2Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.u = wm2Var;
        this.t = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.p7700g.p99005.tl2, android.os.IInterface] */
    @Override // com.p7700g.p99005.xl2
    public final void a() {
        wl2 wl2Var;
        String str;
        String str2;
        String str3;
        try {
            ?? e = this.u.b.e();
            str2 = this.u.c;
            Bundle a = xm2.a();
            wm2 wm2Var = this.u;
            TaskCompletionSource taskCompletionSource = this.t;
            str3 = wm2Var.c;
            e.I1(str2, a, new vm2(wm2Var, taskCompletionSource, str3));
        } catch (RemoteException e2) {
            wl2Var = wm2.a;
            str = this.u.c;
            wl2Var.c(e2, "error requesting in-app review for %s", str);
            this.t.trySetException(new RuntimeException(e2));
        }
    }
}