package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfvn implements Executor {
    public final /* synthetic */ Executor zza;
    public final /* synthetic */ zzftt zzb;

    public zzfvn(Executor executor, zzftt zzfttVar) {
        this.zza = executor;
        this.zzb = zzfttVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zze(e);
        }
    }
}