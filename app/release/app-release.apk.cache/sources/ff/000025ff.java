package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdxr extends com.google.android.gms.ads.internal.client.zzbe {
    public final /* synthetic */ zzdxl zza;
    public final /* synthetic */ zzdxs zzb;

    public zzdxr(zzdxs zzdxsVar, zzdxl zzdxlVar) {
        this.zzb = zzdxsVar;
        this.zza = zzdxlVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzc() throws RemoteException {
        long j;
        zzdxl zzdxlVar = this.zza;
        j = this.zzb.zza;
        zzdxlVar.zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzd() throws RemoteException {
        long j;
        zzdxl zzdxlVar = this.zza;
        j = this.zzb.zza;
        zzdxlVar.zzc(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zze(int i) throws RemoteException {
        long j;
        zzdxl zzdxlVar = this.zza;
        j = this.zzb.zza;
        zzdxlVar.zzd(j, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j;
        zzdxl zzdxlVar = this.zza;
        j = this.zzb.zza;
        zzdxlVar.zzd(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzi() throws RemoteException {
        long j;
        zzdxl zzdxlVar = this.zza;
        j = this.zzb.zza;
        zzdxlVar.zze(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzj() throws RemoteException {
        long j;
        zzdxl zzdxlVar = this.zza;
        j = this.zzb.zza;
        zzdxlVar.zzg(j);
    }
}