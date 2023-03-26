package com.google.android.gms.internal.ads;

import android.view.View;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeku implements com.google.android.gms.ads.internal.zzf {
    @GuardedBy("this")
    private com.google.android.gms.ads.internal.zzf zza;

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        com.google.android.gms.ads.internal.zzf zzfVar = this.zza;
        if (zzfVar != null) {
            zzfVar.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzb() {
        com.google.android.gms.ads.internal.zzf zzfVar = this.zza;
        if (zzfVar != null) {
            zzfVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzc() {
        com.google.android.gms.ads.internal.zzf zzfVar = this.zza;
        if (zzfVar != null) {
            zzfVar.zzc();
        }
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.zzf zzfVar) {
        this.zza = zzfVar;
    }
}