package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeip implements zzfuy {
    public final /* synthetic */ long zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzfbl zzc;
    public final /* synthetic */ zzfbo zzd;
    public final /* synthetic */ zzfie zze;
    public final /* synthetic */ zzfbx zzf;
    public final /* synthetic */ zzeiq zzg;

    public zzeip(zzeiq zzeiqVar, long j, String str, zzfbl zzfblVar, zzfbo zzfboVar, zzfie zzfieVar, zzfbx zzfbxVar) {
        this.zzg = zzeiqVar;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzfblVar;
        this.zzd = zzfboVar;
        this.zze = zzfieVar;
        this.zzf = zzfbxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        Clock clock;
        int i;
        boolean z;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzefi zzefiVar;
        zzfii zzfiiVar;
        zzeir zzeirVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzeif) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzfci) {
            i = 5;
        } else {
            i = ((th instanceof zzdzl) && zzfdc.zza(th).zza == 3) ? 1 : 6;
        }
        zzeiq.zzg(this.zzg, this.zzb, i, elapsedRealtime, this.zzc.zzah);
        zzeiq zzeiqVar = this.zzg;
        z = zzeiqVar.zze;
        if (z) {
            zzeirVar = zzeiqVar.zzb;
            zzeirVar.zza(this.zzd, this.zzc, i, th instanceof zzefh ? (zzefh) th : null, elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgZ)).booleanValue()) {
            zzfiiVar = this.zzg.zzc;
            zzfie zzfieVar = this.zze;
            zzfbx zzfbxVar = this.zzf;
            zzfbl zzfblVar = this.zzc;
            zzfiiVar.zzd(zzfieVar.zza(zzfbxVar, zzfblVar, zzfblVar.zzo));
        }
        com.google.android.gms.ads.internal.client.zze zza = zzfdc.zza(th);
        int i2 = zza.zza;
        if ((i2 == 3 || i2 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza = zzfdc.zza(new zzefh(13, zza.zzd));
        }
        zzefiVar = this.zzg.zzf;
        zzefiVar.zze(this.zzc, elapsedRealtime, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        zzefi zzefiVar;
        zzeir zzeirVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        zzeiq.zzg(this.zzg, this.zzb, 0, elapsedRealtime, this.zzc.zzah);
        zzeiq zzeiqVar = this.zzg;
        z = zzeiqVar.zze;
        if (z) {
            zzeirVar = zzeiqVar.zzb;
            zzeirVar.zza(this.zzd, this.zzc, 0, null, elapsedRealtime);
        }
        zzefiVar = this.zzg.zzf;
        zzefiVar.zzf(this.zzc, elapsedRealtime, null);
    }
}