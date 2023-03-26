package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfwa extends zzfus implements RunnableFuture {
    @CheckForNull
    private volatile zzfvk zza;

    public zzfwa(zzfui zzfuiVar) {
        this.zza = new zzfvy(this, zzfuiVar);
    }

    public static zzfwa zzf(Runnable runnable, Object obj) {
        return new zzfwa(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzfvk zzfvkVar = this.zza;
        if (zzfvkVar != null) {
            zzfvkVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    @CheckForNull
    public final String zza() {
        zzfvk zzfvkVar = this.zza;
        if (zzfvkVar != null) {
            return "task=[" + zzfvkVar + "]";
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final void zzb() {
        zzfvk zzfvkVar;
        if (zzu() && (zzfvkVar = this.zza) != null) {
            zzfvkVar.zzh();
        }
        this.zza = null;
    }

    public zzfwa(Callable callable) {
        this.zza = new zzfvz(this, callable);
    }
}