package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfva implements Runnable {
    public final Future zza;
    public final zzfuy zzb;

    public zzfva(Future future, zzfuy zzfuyVar) {
        this.zza = future;
        this.zzb = zzfuyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if ((future instanceof zzfwd) && (zza = zzfwe.zza((zzfwd) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzfvc.zzp(this.zza));
        } catch (Error e) {
            e = e;
            this.zzb.zza(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.zzb.zza(e);
        } catch (ExecutionException e3) {
            this.zzb.zza(e3.getCause());
        }
    }

    public final String toString() {
        zzfoo zza = zzfop.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}