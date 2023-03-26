package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* compiled from: com.google.android.play:review@@2.0.0 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
public final class rm2 implements ml2 {
    private final wm2 a;
    private final Handler b = new Handler(Looper.getMainLooper());

    public rm2(wm2 wm2Var) {
        this.a = wm2Var;
    }

    @Override // com.p7700g.p99005.ml2
    @x1
    public final Task<Void> a(@x1 Activity activity, @x1 ll2 ll2Var) {
        if (ll2Var.d()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", ll2Var.c());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new qm2(this, this.b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    @Override // com.p7700g.p99005.ml2
    @x1
    public final Task<ll2> b() {
        return this.a.a();
    }
}