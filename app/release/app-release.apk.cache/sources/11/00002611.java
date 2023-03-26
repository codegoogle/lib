package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdyi extends zzbqj {
    public final /* synthetic */ Object zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzfhh zzd;
    public final /* synthetic */ zzcga zze;
    public final /* synthetic */ zzdyj zzf;

    public zzdyi(zzdyj zzdyjVar, Object obj, String str, long j, zzfhh zzfhhVar, zzcga zzcgaVar) {
        this.zzf = zzdyjVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfhhVar;
        this.zze = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zze(String str) {
        zzdwq zzdwqVar;
        zzdik zzdikVar;
        zzfhu zzfhuVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzc));
            zzdwqVar = this.zzf.zzl;
            zzdwqVar.zzb(this.zzb, "error");
            zzdikVar = this.zzf.zzo;
            zzdikVar.zzb(this.zzb, "error");
            zzfhuVar = this.zzf.zzp;
            zzfhh zzfhhVar = this.zzd;
            zzfhhVar.zze(false);
            zzfhuVar.zzb(zzfhhVar.zzj());
            this.zze.zzd(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzf() {
        zzdwq zzdwqVar;
        zzdik zzdikVar;
        zzfhu zzfhuVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzc));
            zzdwqVar = this.zzf.zzl;
            zzdwqVar.zzd(this.zzb);
            zzdikVar = this.zzf.zzo;
            zzdikVar.zzd(this.zzb);
            zzfhuVar = this.zzf.zzp;
            zzfhh zzfhhVar = this.zzd;
            zzfhhVar.zze(true);
            zzfhuVar.zzb(zzfhhVar.zzj());
            this.zze.zzd(Boolean.TRUE);
        }
    }
}