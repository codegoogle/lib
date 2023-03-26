package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaws implements zzayv {
    public final /* synthetic */ zzawv zza;
    private final Uri zzb;
    private final zzayj zzc;
    private final zzawt zzd;
    private final zzazb zze;
    private final zzaub zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;

    public zzaws(zzawv zzawvVar, Uri uri, zzayj zzayjVar, zzawt zzawtVar, zzazb zzazbVar) {
        this.zza = zzawvVar;
        Objects.requireNonNull(uri);
        this.zzb = uri;
        Objects.requireNonNull(zzayjVar);
        this.zzc = zzayjVar;
        Objects.requireNonNull(zzawtVar);
        this.zzd = zzawtVar;
        this.zze = zzazbVar;
        this.zzf = new zzaub();
        this.zzh = true;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzb() {
        this.zzg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzc() throws IOException, InterruptedException {
        zzatv zzatvVar;
        long j;
        while (!this.zzg) {
            int i = 0;
            try {
                long j2 = this.zzf.zza;
                long zzb = this.zzc.zzb(new zzayl(this.zzb, null, j2, j2, -1L, null, 0));
                this.zzj = zzb;
                if (zzb != -1) {
                    j = j2;
                    zzb += j;
                    this.zzj = zzb;
                } else {
                    j = j2;
                }
                zzatvVar = new zzatv(this.zzc, j, zzb);
                try {
                    zzatw zzb2 = this.zzd.zzb(zzatvVar, this.zzc.zzc());
                    if (this.zzh) {
                        zzb2.zze(j, this.zzi);
                        this.zzh = false;
                    }
                    long j3 = j;
                    int i2 = 0;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.zzg) {
                                i2 = 0;
                                break;
                            }
                            this.zze.zza();
                            i2 = zzb2.zzf(zzatvVar, this.zzf);
                            if (zzatvVar.zzd() > zzawv.zzf(this.zza) + j3) {
                                j3 = zzatvVar.zzd();
                                this.zze.zzb();
                                zzawv zzawvVar = this.zza;
                                zzawv.zzj(zzawvVar).post(zzawv.zzo(zzawvVar));
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (i != 1 && zzatvVar != null) {
                                this.zzf.zza = zzatvVar.zzd();
                            }
                            zzazo.zzm(this.zzc);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.zzf.zza = zzatvVar.zzd();
                        i = i2;
                    }
                    zzazo.zzm(this.zzc);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                zzatvVar = null;
            }
        }
    }

    public final void zzd(long j, long j2) {
        this.zzf.zza = j;
        this.zzi = j2;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final boolean zze() {
        return this.zzg;
    }
}