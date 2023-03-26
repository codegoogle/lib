package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public final class qm2 extends ResultReceiver {
    public final /* synthetic */ TaskCompletionSource s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm2(rm2 rm2Var, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.s = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.s.trySetResult(null);
    }
}