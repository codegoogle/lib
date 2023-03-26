package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zznj {
    @z1
    private final Handler zza;
    @z1
    private final zznk zzb;

    public zznj(@z1 Handler handler, @z1 zznk zznkVar) {
        this.zza = zznkVar == null ? null : handler;
        this.zzb = zznkVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmz
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzh(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznf
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzi(exc);
                }
            });
        }
    }

    public final void zzc(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzne
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzj(str, j, j2);
                }
            });
        }
    }

    public final void zzd(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzng
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzk(str);
                }
            });
        }
    }

    public final void zze(final zzgl zzglVar) {
        zzglVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzna
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzl(zzglVar);
                }
            });
        }
    }

    public final void zzf(final zzgl zzglVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznb
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzm(zzglVar);
                }
            });
        }
    }

    public final void zzg(final zzad zzadVar, @z1 final zzgm zzgmVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznh
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzn(zzadVar, zzgmVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzh(Exception exc) {
        zznk zznkVar = this.zzb;
        int i = zzeg.zza;
        zznkVar.zzc(exc);
    }

    public final /* synthetic */ void zzi(Exception exc) {
        zznk zznkVar = this.zzb;
        int i = zzeg.zza;
        zznkVar.zzj(exc);
    }

    public final /* synthetic */ void zzj(String str, long j, long j2) {
        zznk zznkVar = this.zzb;
        int i = zzeg.zza;
        zznkVar.zzd(str, j, j2);
    }

    public final /* synthetic */ void zzk(String str) {
        zznk zznkVar = this.zzb;
        int i = zzeg.zza;
        zznkVar.zze(str);
    }

    public final /* synthetic */ void zzl(zzgl zzglVar) {
        zzglVar.zza();
        zznk zznkVar = this.zzb;
        int i = zzeg.zza;
        zznkVar.zzf(zzglVar);
    }

    public final /* synthetic */ void zzm(zzgl zzglVar) {
        zznk zznkVar = this.zzb;
        int i = zzeg.zza;
        zznkVar.zzg(zzglVar);
    }

    public final /* synthetic */ void zzn(zzad zzadVar, zzgm zzgmVar) {
        int i = zzeg.zza;
        this.zzb.zzh(zzadVar, zzgmVar);
    }

    public final /* synthetic */ void zzo(long j) {
        zznk zznkVar = this.zzb;
        int i = zzeg.zza;
        zznkVar.zzi(j);
    }

    public final /* synthetic */ void zzp(boolean z) {
        zznk zznkVar = this.zzb;
        int i = zzeg.zza;
        zznkVar.zzn(z);
    }

    public final /* synthetic */ void zzq(int i, long j, long j2) {
        zznk zznkVar = this.zzb;
        int i2 = zzeg.zza;
        zznkVar.zzk(i, j, j2);
    }

    public final void zzr(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznc
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzo(j);
                }
            });
        }
    }

    public final void zzs(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznd
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzp(z);
                }
            });
        }
    }

    public final void zzt(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzni
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzq(i, j, j2);
                }
            });
        }
    }
}