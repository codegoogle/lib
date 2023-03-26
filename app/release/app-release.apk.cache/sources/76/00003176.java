package com.google.android.gms.tasks;

import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes2.dex */
public class TaskCompletionSource<TResult> {
    private final zzw<TResult> zza = new zzw<>();

    public TaskCompletionSource() {
    }

    public TaskCompletionSource(@x1 CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new zzs(this));
    }

    @x1
    public Task<TResult> getTask() {
        return this.zza;
    }

    public void setException(@x1 Exception exc) {
        this.zza.zza(exc);
    }

    public void setResult(@z1 TResult tresult) {
        this.zza.zzb(tresult);
    }

    public boolean trySetException(@x1 Exception exc) {
        return this.zza.zzd(exc);
    }

    public boolean trySetResult(@z1 TResult tresult) {
        return this.zza.zze(tresult);
    }
}