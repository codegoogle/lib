package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfuo extends zzfvk {
    private final Executor zza;
    public final /* synthetic */ zzfup zzb;

    public zzfuo(zzfup zzfupVar, Executor executor) {
        this.zzb = zzfupVar;
        Objects.requireNonNull(executor);
        this.zza = executor;
    }

    public abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final void zzd(Throwable th) {
        this.zzb.zza = null;
        if (th instanceof ExecutionException) {
            this.zzb.zze(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zze(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zze(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}