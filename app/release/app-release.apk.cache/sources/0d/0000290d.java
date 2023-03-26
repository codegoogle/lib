package com.google.android.gms.internal.ads;

import com.p7700g.p99005.x1;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfao extends zzfko implements zzddh, zzdbw, zzdbt, zzdcj, zzdee, zzeyx, zzdjg {
    private final zzfdk zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzfao(zzfdk zzfdkVar) {
        this.zza = zzfdkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i = zzeVar.zza;
        zzeyo.zza(this.zzc, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezu
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcbl) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyo.zza(this.zzc, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezv
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcbl) obj).zze(i);
            }
        });
        zzeyo.zza(this.zze, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezw
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcar) obj).zzg(i);
            }
        });
    }

    public final void zzb(zzfko zzfkoVar) {
        this.zzb.set(zzfkoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeyx
    public final void zzbL(zzeyx zzeyxVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
        zzeyo.zza(this.zze, zzezz.zza);
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzh.set(zzdeVar);
    }

    public final void zzd(zzcbh zzcbhVar) {
        this.zzd.set(zzcbhVar);
    }

    public final void zze(zzcbl zzcblVar) {
        this.zzc.set(zzcblVar);
    }

    @Deprecated
    public final void zzf(zzcar zzcarVar) {
        this.zze.set(zzcarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzg(@x1 final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzeyo.zza(this.zzh, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezt
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzde) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    @Deprecated
    public final void zzh(zzcam zzcamVar) {
        this.zzg.set(zzcamVar);
    }

    public final void zzi(zzcbm zzcbmVar) {
        this.zzf.set(zzcbmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
        this.zza.zza();
        zzeyo.zza(this.zzd, zzfaa.zza);
        zzeyo.zza(this.zze, zzfab.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezx
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcbh) obj).zzi(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcbh) obj).zzh(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
        zzeyo.zza(this.zze, zzfaj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        zzeyo.zza(this.zzc, zzfag.zza);
        zzeyo.zza(this.zze, zzfah.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
        zzeyo.zza(this.zzd, zzfac.zza);
        zzeyo.zza(this.zze, zzfae.zza);
        zzeyo.zza(this.zzd, zzfaf.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(final zzcal zzcalVar, final String str, final String str2) {
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfak
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                zzcal zzcalVar2 = zzcal.this;
                ((zzcbh) obj).zzk(new zzcbv(zzcalVar2.zzc(), zzcalVar2.zzb()));
            }
        });
        zzeyo.zza(this.zzf, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfal
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                zzcal zzcalVar2 = zzcal.this;
                ((zzcbm) obj).zze(new zzcbv(zzcalVar2.zzc(), zzcalVar2.zzb()), str, str2);
            }
        });
        zzeyo.zza(this.zze, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfam
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcar) obj).zze(zzcal.this);
            }
        });
        zzeyo.zza(this.zzg, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfan
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcam) obj).zze(zzcal.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        zzeyo.zza(this.zzd, zzezs.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
        zzeyo.zza(this.zze, zzfad.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzv() {
        zzeyo.zza(this.zzb, zzfai.zza);
    }
}