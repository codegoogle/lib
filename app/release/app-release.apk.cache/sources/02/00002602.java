package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdxu extends zzcbk {
    public final /* synthetic */ zzdxw zza;

    public zzdxu(zzdxw zzdxwVar) {
        this.zza = zzdxwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zze(int i) throws RemoteException {
        zzdxl zzdxlVar;
        long j;
        zzdxw zzdxwVar = this.zza;
        zzdxlVar = zzdxwVar.zzc;
        j = zzdxwVar.zza;
        zzdxlVar.zzm(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdxl zzdxlVar;
        long j;
        zzdxw zzdxwVar = this.zza;
        zzdxlVar = zzdxwVar.zzc;
        j = zzdxwVar.zza;
        zzdxlVar.zzm(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzg() throws RemoteException {
        zzdxl zzdxlVar;
        long j;
        zzdxw zzdxwVar = this.zza;
        zzdxlVar = zzdxwVar.zzc;
        j = zzdxwVar.zza;
        zzdxlVar.zzp(j);
    }
}