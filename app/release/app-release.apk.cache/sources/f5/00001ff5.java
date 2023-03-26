package com.google.android.gms.internal.ads;

import android.content.Context;
import com.p7700g.p99005.z1;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbsm {
    private final Context zzb;
    private final String zzc;
    private final zzcfo zzd;
    @z1
    private final zzfhu zze;
    private final com.google.android.gms.ads.internal.util.zzbb zzf;
    private final com.google.android.gms.ads.internal.util.zzbb zzg;
    @z1
    private zzbsl zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbsm(Context context, zzcfo zzcfoVar, String str, com.google.android.gms.ads.internal.util.zzbb zzbbVar, com.google.android.gms.ads.internal.util.zzbb zzbbVar2, @z1 zzfhu zzfhuVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzcfoVar;
        this.zze = zzfhuVar;
        this.zzf = zzbbVar;
        this.zzg = zzbbVar2;
    }

    public final zzbsg zzb(@z1 zzaoc zzaocVar) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzbsl zzbslVar = this.zzh;
                if (zzbslVar != null && this.zzi == 0) {
                    zzbslVar.zzi(new zzcge() { // from class: com.google.android.gms.internal.ads.zzbrr
                        @Override // com.google.android.gms.internal.ads.zzcge
                        public final void zza(Object obj) {
                            zzbsm.this.zzk((zzbrh) obj);
                        }
                    }, zzbrs.zza);
                }
            }
            zzbsl zzbslVar2 = this.zzh;
            if (zzbslVar2 != null && zzbslVar2.zze() != -1) {
                int i = this.zzi;
                if (i == 0) {
                    return this.zzh.zza();
                } else if (i == 1) {
                    this.zzi = 2;
                    zzd(null);
                    return this.zzh.zza();
                } else {
                    return this.zzh.zza();
                }
            }
            this.zzi = 2;
            zzbsl zzd = zzd(null);
            this.zzh = zzd;
            return zzd.zza();
        }
    }

    public final zzbsl zzd(@z1 zzaoc zzaocVar) {
        zzfhh zza = zzfhg.zza(this.zzb, 6);
        zza.zzf();
        zzbsl zzbslVar = new zzbsl(this.zzg);
        zzcfv.zze.execute(new Runnable(null, zzbslVar) { // from class: com.google.android.gms.internal.ads.zzbrt
            public final /* synthetic */ zzbsl zzb;

            {
                this.zzb = zzbslVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbsm.this.zzj(null, this.zzb);
            }
        });
        zzbslVar.zzi(new zzbsb(this, zzbslVar, zza), new zzbsc(this, zzbslVar, zza));
        return zzbslVar;
    }

    public final /* synthetic */ void zzi(zzbsl zzbslVar, final zzbrh zzbrhVar) {
        synchronized (this.zza) {
            if (zzbslVar.zze() != -1 && zzbslVar.zze() != 1) {
                zzbslVar.zzg();
                zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbrh.this.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }

    public final /* synthetic */ void zzj(zzaoc zzaocVar, zzbsl zzbslVar) {
        try {
            zzbrp zzbrpVar = new zzbrp(this.zzb, this.zzd, null, null);
            zzbrpVar.zzk(new zzbrv(this, zzbslVar, zzbrpVar));
            zzbrpVar.zzq("/jsLoaded", new zzbrx(this, zzbslVar, zzbrpVar));
            com.google.android.gms.ads.internal.util.zzca zzcaVar = new com.google.android.gms.ads.internal.util.zzca();
            zzbry zzbryVar = new zzbry(this, null, zzbrpVar, zzcaVar);
            zzcaVar.zzb(zzbryVar);
            zzbrpVar.zzq("/requestReload", zzbryVar);
            if (this.zzc.endsWith(".js")) {
                zzbrpVar.zzh(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzbrpVar.zzf(this.zzc);
            } else {
                zzbrpVar.zzg(this.zzc);
            }
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbsa(this, zzbslVar, zzbrpVar), 60000L);
        } catch (Throwable th) {
            zzcfi.zzh("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbslVar.zzg();
        }
    }

    public final /* synthetic */ void zzk(zzbrh zzbrhVar) {
        if (zzbrhVar.zzi()) {
            this.zzi = 1;
        }
    }
}