package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzxp {
    @z1
    private final Handler zza;
    @z1
    private final zzxq zzb;

    public zzxp(@z1 Handler handler, @z1 zzxq zzxqVar) {
        this.zza = zzxqVar == null ? null : handler;
        this.zzb = zzxqVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxl
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxo
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzgl zzglVar) {
        zzglVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxk
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzi(zzglVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxf
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final zzgl zzglVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxj
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzk(zzglVar);
                }
            });
        }
    }

    public final void zzf(final zzad zzadVar, @z1 final zzgm zzgmVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxm
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzl(zzadVar, zzgmVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzg(String str, long j, long j2) {
        zzxq zzxqVar = this.zzb;
        int i = zzeg.zza;
        zzxqVar.zzp(str, j, j2);
    }

    public final /* synthetic */ void zzh(String str) {
        zzxq zzxqVar = this.zzb;
        int i = zzeg.zza;
        zzxqVar.zzq(str);
    }

    public final /* synthetic */ void zzi(zzgl zzglVar) {
        zzglVar.zza();
        zzxq zzxqVar = this.zzb;
        int i = zzeg.zza;
        zzxqVar.zzr(zzglVar);
    }

    public final /* synthetic */ void zzj(int i, long j) {
        zzxq zzxqVar = this.zzb;
        int i2 = zzeg.zza;
        zzxqVar.zzl(i, j);
    }

    public final /* synthetic */ void zzk(zzgl zzglVar) {
        zzxq zzxqVar = this.zzb;
        int i = zzeg.zza;
        zzxqVar.zzs(zzglVar);
    }

    public final /* synthetic */ void zzl(zzad zzadVar, zzgm zzgmVar) {
        int i = zzeg.zza;
        this.zzb.zzu(zzadVar, zzgmVar);
    }

    public final /* synthetic */ void zzm(Object obj, long j) {
        zzxq zzxqVar = this.zzb;
        int i = zzeg.zza;
        zzxqVar.zzm(obj, j);
    }

    public final /* synthetic */ void zzn(long j, int i) {
        zzxq zzxqVar = this.zzb;
        int i2 = zzeg.zza;
        zzxqVar.zzt(j, i);
    }

    public final /* synthetic */ void zzo(Exception exc) {
        zzxq zzxqVar = this.zzb;
        int i = zzeg.zza;
        zzxqVar.zzo(exc);
    }

    public final /* synthetic */ void zzp(zzcv zzcvVar) {
        zzxq zzxqVar = this.zzb;
        int i = zzeg.zza;
        zzxqVar.zzv(zzcvVar);
    }

    public final void zzq(final Object obj) {
        if (this.zza != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxg
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxi
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxh
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzcv zzcvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxn
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzp(zzcvVar);
                }
            });
        }
    }
}