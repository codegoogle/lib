package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzehf implements zzdlg {
    private final Context zza;
    private final zzcfo zzb;
    private final zzfvl zzc;
    private final zzfbl zzd;
    private final zzcli zze;
    private final zzfcd zzf;
    private final zzbop zzg;
    private final boolean zzh;

    public zzehf(Context context, zzcfo zzcfoVar, zzfvl zzfvlVar, zzfbl zzfblVar, zzcli zzcliVar, zzfcd zzfcdVar, boolean z, zzbop zzbopVar) {
        this.zza = context;
        this.zzb = zzcfoVar;
        this.zzc = zzfvlVar;
        this.zzd = zzfblVar;
        this.zze = zzcliVar;
        this.zzf = zzfcdVar;
        this.zzg = zzbopVar;
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zza(boolean z, Context context, zzdcg zzdcgVar) {
        zzdka zzdkaVar = (zzdka) zzfvc.zzq(this.zzc);
        this.zze.zzap(true);
        boolean zze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzE = com.google.android.gms.ads.internal.util.zzs.zzE(this.zza);
        boolean z2 = this.zzh;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, zzE, z2 ? this.zzg.zzd() : false, z2 ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzP, false);
        if (zzdcgVar != null) {
            zzdcgVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzj();
        zzdkv zzj = zzdkaVar.zzj();
        zzcli zzcliVar = this.zze;
        zzfbl zzfblVar = this.zzd;
        int i = zzfblVar.zzR;
        zzcfo zzcfoVar = this.zzb;
        String str = zzfblVar.zzC;
        zzfbq zzfbqVar = zzfblVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzj, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcliVar, i, zzcfoVar, str, zzjVar, zzfbqVar.zzb, zzfbqVar.zza, this.zzf.zzf, zzdcgVar), true);
    }
}