package com.google.android.gms.internal.ads;

import android.content.Context;
import com.p7700g.p99005.wo1;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeiv implements zzfuj {
    private final zzfgf zza;
    private final zzdbv zzb;
    private final zzfie zzc;
    private final zzfii zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcya zzg;
    private final zzeiq zzh;
    private final zzefi zzi;
    private final Context zzj;
    private final zzfhs zzk;

    public zzeiv(Context context, zzfgf zzfgfVar, zzeiq zzeiqVar, zzdbv zzdbvVar, zzfie zzfieVar, zzfii zzfiiVar, zzcya zzcyaVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzefi zzefiVar, zzfhs zzfhsVar) {
        this.zzj = context;
        this.zza = zzfgfVar;
        this.zzh = zzeiqVar;
        this.zzb = zzdbvVar;
        this.zzc = zzfieVar;
        this.zzd = zzfiiVar;
        this.zzg = zzcyaVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzefiVar;
        this.zzk = zzfhsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    @Override // com.google.android.gms.internal.ads.zzfuj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ zzfvl zza(Object obj) throws Exception {
        String str;
        zzfbn zzfbnVar;
        int i;
        final zzfbx zzfbxVar = (zzfbx) obj;
        int i2 = zzfbxVar.zzb.zzb.zze;
        if (i2 != 0) {
            if (i2 >= 200 && i2 < 300) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzew)).booleanValue()) {
                    str = "No fill.";
                }
            } else {
                str = (i2 < 300 || i2 >= 400) ? wo1.l("Received error HTTP response code: ", i2) : "No location header to follow redirect or too many redirects.";
            }
            zzfbo zzfboVar = zzfbxVar.zzb.zzb;
            zzfbnVar = zzfboVar.zzi;
            if (zzfbnVar != null) {
                str = zzfbnVar.zza();
            }
            this.zzi.zzg(zzfboVar);
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgX)).booleanValue() && (i = zzfbxVar.zzb.zzb.zze) != 0 && (i < 200 || i >= 300)) {
                return zzfvc.zzh(new zzeit(3, str));
            }
            zzffk zza = zzffp.zzc(zzfvc.zzh(new zzeit(3, str)), zzffz.RENDER_CONFIG_INIT, this.zza).zza();
            for (zzfbl zzfblVar : zzfbxVar.zzb.zza) {
                this.zzi.zzd(zzfblVar);
                Iterator it = zzfblVar.zza.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zzefd zza2 = this.zzg.zza(zzfblVar.zzb, (String) it.next());
                        if (zza2 == null || !zza2.zzb(zzfbxVar, zzfblVar)) {
                        }
                    } else {
                        this.zzi.zze(zzfblVar, 0L, zzfdc.zzd(1, null, null));
                        break;
                    }
                }
            }
            this.zzb.zzj(new zzctk(zzfbxVar, this.zzd, this.zzc), this.zze);
            int i3 = 0;
            for (final zzfbl zzfblVar2 : zzfbxVar.zzb.zza) {
                Iterator it2 = zzfblVar2.zza.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str2 = (String) it2.next();
                    final zzefd zza3 = this.zzg.zza(zzfblVar2.zzb, str2);
                    if (zza3 != null && zza3.zzb(zzfbxVar, zzfblVar2)) {
                        zzffw zzb = this.zza.zzb(zzffz.RENDER_CONFIG_WATERFALL, zza);
                        zza = zzb.zzh("render-config-" + i3 + "-" + str2).zzc(Throwable.class, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeiu
                            @Override // com.google.android.gms.internal.ads.zzfuj
                            public final zzfvl zza(Object obj2) {
                                return zzeiv.this.zzb(zzfblVar2, zzfbxVar, zza3, (Throwable) obj2);
                            }
                        }).zza();
                        break;
                    }
                }
                i3++;
            }
            return zza;
        }
        str = "No ad config.";
        zzfbo zzfboVar2 = zzfbxVar.zzb.zzb;
        zzfbnVar = zzfboVar2.zzi;
        if (zzfbnVar != null) {
        }
        this.zzi.zzg(zzfboVar2);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgX)).booleanValue()) {
        }
        zzffk zza4 = zzffp.zzc(zzfvc.zzh(new zzeit(3, str)), zzffz.RENDER_CONFIG_INIT, this.zza).zza();
        while (r1.hasNext()) {
        }
        this.zzb.zzj(new zzctk(zzfbxVar, this.zzd, this.zzc), this.zze);
        int i32 = 0;
        while (r1.hasNext()) {
        }
        return zza4;
    }

    public final /* synthetic */ zzfvl zzb(zzfbl zzfblVar, zzfbx zzfbxVar, zzefd zzefdVar, Throwable th) throws Exception {
        zzfhh zza = zzfhg.zza(this.zzj, 12);
        zza.zzc(zzfblVar.zzF);
        zza.zzf();
        zzeiq zzeiqVar = this.zzh;
        zzfvl zzo = zzfvc.zzo(zzefdVar.zza(zzfbxVar, zzfblVar), zzfblVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        zzeiqVar.zze(zzfbxVar, zzfblVar, zzo, this.zzc);
        zzfhr.zza(zzo, this.zzk, zza);
        return zzo;
    }
}