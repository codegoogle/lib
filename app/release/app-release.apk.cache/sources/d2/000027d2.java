package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeoy implements zzetg {
    @VisibleForTesting
    public final zzcer zza;
    @VisibleForTesting
    public AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzfvm zzd;
    private final Context zze;

    public zzeoy(Context context, zzcer zzcerVar, ScheduledExecutorService scheduledExecutorService, zzfvm zzfvmVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzco)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcerVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        Task<AppSetIdInfo> appSetIdInfo;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzck)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcp)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcl)).booleanValue()) {
                    return zzfvc.zzm(zzfnz.zza(this.zzb.getAppSetIdInfo()), zzeov.zza, zzcfv.zzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzco)).booleanValue()) {
                    appSetIdInfo = zzfdf.zza(this.zze);
                } else {
                    appSetIdInfo = this.zzb.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return zzfvc.zzi(new zzeoz(null, -1));
                }
                zzfvl zzn = zzfvc.zzn(zzfnz.zza(appSetIdInfo), zzeow.zza, zzcfv.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcm)).booleanValue()) {
                    zzn = zzfvc.zzo(zzn, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcn)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfvc.zzf(zzn, Exception.class, new zzfok() { // from class: com.google.android.gms.internal.ads.zzeox
                    @Override // com.google.android.gms.internal.ads.zzfok
                    public final Object apply(Object obj) {
                        zzeoy.this.zza.zzt((Exception) obj, "AppSetIdInfoSignal");
                        return new zzeoz(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzfvc.zzi(new zzeoz(null, -1));
    }
}