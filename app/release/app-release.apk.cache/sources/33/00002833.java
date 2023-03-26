package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzesn implements zzetg {
    private final String zza;
    private final zzfvm zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfcd zze;
    private final zzcnf zzf;

    public zzesn(zzfvm zzfvmVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfcd zzfcdVar, zzcnf zzcnfVar) {
        this.zzb = zzfvmVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfcdVar;
        this.zzf = zzcnfVar;
    }

    public static /* synthetic */ zzfvl zzc(zzesn zzesnVar) {
        String str = zzesnVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgd)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzg zzn = zzesnVar.zzf.zzn();
        zzdbd zzdbdVar = new zzdbd();
        zzdbdVar.zzc(zzesnVar.zzd);
        zzfcb zzfcbVar = new zzfcb();
        zzfcbVar.zzs("adUnitId");
        zzfcbVar.zzE(zzesnVar.zze.zzd);
        zzfcbVar.zzr(new com.google.android.gms.ads.internal.client.zzq());
        zzdbdVar.zzf(zzfcbVar.zzG());
        zzn.zza(zzdbdVar.zzg());
        com.google.android.gms.ads.nonagon.signalgeneration.zzac zzacVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzac();
        zzacVar.zza(str);
        zzn.zzb(zzacVar.zzb());
        new zzdhd();
        return zzfvc.zzf(zzfvc.zzm((zzfut) zzfvc.zzo(zzfut.zzv(zzn.zzc().zzc()), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzge)).longValue(), TimeUnit.MILLISECONDS, zzesnVar.zzc), zzesl.zza, zzesnVar.zzb), Exception.class, zzesm.zza, zzesnVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgc)).booleanValue() && !"adUnitId".equals(this.zze.zzf)) {
            return zzfvc.zzl(new zzfui() { // from class: com.google.android.gms.internal.ads.zzesk
                @Override // com.google.android.gms.internal.ads.zzfui
                public final zzfvl zza() {
                    return zzesn.zzc(zzesn.this);
                }
            }, this.zzb);
        }
        return this.zzb.zzb(zzesj.zza);
    }
}