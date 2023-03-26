package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzefs implements zzdlg {
    private final zzcfo zza;
    private final zzfvl zzb;
    private final zzfbl zzc;
    private final zzcli zzd;
    private final zzfcd zze;
    private final zzbop zzf;
    private final boolean zzg;

    public zzefs(zzcfo zzcfoVar, zzfvl zzfvlVar, zzfbl zzfblVar, zzcli zzcliVar, zzfcd zzfcdVar, boolean z, zzbop zzbopVar) {
        this.zza = zzcfoVar;
        this.zzb = zzfvlVar;
        this.zzc = zzfblVar;
        this.zzd = zzcliVar;
        this.zze = zzfcdVar;
        this.zzg = z;
        this.zzf = zzbopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zza(boolean z, Context context, zzdcg zzdcgVar) {
        int i;
        zzcvg zzcvgVar = (zzcvg) zzfvc.zzq(this.zzb);
        this.zzd.zzap(true);
        boolean zze = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzP, false);
        if (zzdcgVar != null) {
            zzdcgVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzj();
        zzdkv zzg = zzcvgVar.zzg();
        zzcli zzcliVar = this.zzd;
        int i2 = this.zzc.zzR;
        if (i2 == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.zze.zzj;
            if (zzwVar != null) {
                int i3 = zzwVar.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
                zzcfo zzcfoVar = this.zza;
                zzfbl zzfblVar = this.zzc;
                String str = zzfblVar.zzC;
                zzfbq zzfbqVar = zzfblVar.zzt;
                com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcliVar, i, zzcfoVar, str, zzjVar, zzfbqVar.zzb, zzfbqVar.zza, this.zze.zzf, zzdcgVar), true);
            }
            zzcfi.zze("Error setting app open orientation; no targeting orientation available.");
            i2 = this.zzc.zzR;
        }
        i = i2;
        zzcfo zzcfoVar2 = this.zza;
        zzfbl zzfblVar2 = this.zzc;
        String str2 = zzfblVar2.zzC;
        zzfbq zzfbqVar2 = zzfblVar2.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcliVar, i, zzcfoVar2, str2, zzjVar, zzfbqVar2.zzb, zzfbqVar2.zza, this.zze.zzf, zzdcgVar), true);
    }
}