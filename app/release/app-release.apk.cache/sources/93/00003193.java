package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import com.p7700g.p99005.x1;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes2.dex */
public final class zzu implements Executor {
    private final Handler zza = new com.google.android.gms.internal.tasks.zza(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@x1 Runnable runnable) {
        this.zza.post(runnable);
    }
}