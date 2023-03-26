package com.google.android.gms.internal.ads;

import com.p7700g.p99005.e31;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzair implements Runnable {
    private final zzajb zza;
    private final zzajh zzb;
    private final Runnable zzc;

    public zzair(zzajb zzajbVar, zzajh zzajhVar, Runnable runnable) {
        this.zza = zzajbVar;
        this.zzb = zzajhVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzajh zzajhVar = this.zzb;
        if (zzajhVar.zzc()) {
            this.zza.zzo(zzajhVar.zza);
        } else {
            this.zza.zzn(zzajhVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp(e31.c);
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}