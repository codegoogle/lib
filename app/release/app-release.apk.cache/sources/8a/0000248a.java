package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdjw extends zzdhc {
    @GuardedBy("this")
    private boolean zzb;

    public zzdjw(Set set) {
        super(set);
    }

    public final void zza() {
        zzo(zzdjs.zza);
    }

    public final void zzb() {
        zzo(zzdju.zza);
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzo(zzdjt.zza);
            this.zzb = true;
        }
        zzo(zzdjv.zza);
    }

    public final synchronized void zzd() {
        zzo(zzdjt.zza);
        this.zzb = true;
    }
}