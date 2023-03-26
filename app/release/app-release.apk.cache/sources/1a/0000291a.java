package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfba extends zzfko {
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzdb zza;
    public final /* synthetic */ zzfbc zzb;

    public zzfba(zzfbc zzfbcVar, com.google.android.gms.ads.internal.client.zzdb zzdbVar) {
        this.zzb = zzfbcVar;
        this.zza = zzdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzv() {
        zzdst zzdstVar;
        zzdstVar = this.zzb.zzg;
        if (zzdstVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}