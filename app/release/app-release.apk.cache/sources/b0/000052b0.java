package com.p7700g.p99005;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public class nm2 implements ml2 {
    private final Context a;
    private ll2 b;

    public nm2(Context context) {
        this.a = context;
    }

    @Override // com.p7700g.p99005.ml2
    @x1
    public Task<Void> a(@x1 Activity activity, @x1 ll2 ll2Var) {
        return ll2Var != this.b ? Tasks.forException(new kl2(-2)) : Tasks.forResult(null);
    }

    @Override // com.p7700g.p99005.ml2
    @x1
    public Task<ll2> b() {
        ll2 e = ll2.e(PendingIntent.getBroadcast(this.a, 0, new Intent(), Build.VERSION.SDK_INT >= 23 ? 67108864 : 0), false);
        this.b = e;
        return Tasks.forResult(e);
    }
}