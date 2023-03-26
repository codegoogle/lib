package com.google.android.gms.internal.ads;

import com.p7700g.p99005.oq;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaha implements zzahn {
    private final zzagz zza;
    private final zzdy zzb = new zzdy(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzaha(zzagz zzagzVar) {
        this.zza = zzagzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzdy zzdyVar, int i) {
        int i2 = i & 1;
        int zzc = i2 != 0 ? zzdyVar.zzc() + zzdyVar.zzk() : -1;
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzdyVar.zzF(zzc);
            this.zzd = 0;
        }
        while (zzdyVar.zza() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int zzk = zzdyVar.zzk();
                    zzdyVar.zzF(zzdyVar.zzc() - 1);
                    if (zzk == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzdyVar.zza(), 3 - this.zzd);
                zzdyVar.zzB(this.zzb.zzH(), this.zzd, min);
                int i4 = this.zzd + min;
                this.zzd = i4;
                if (i4 == 3) {
                    this.zzb.zzF(0);
                    this.zzb.zzE(3);
                    this.zzb.zzG(1);
                    int zzk2 = this.zzb.zzk();
                    int zzk3 = this.zzb.zzk();
                    this.zze = (zzk2 & 128) != 0;
                    this.zzc = (((zzk2 & 15) << 8) | zzk3) + 3;
                    int zzb = this.zzb.zzb();
                    int i5 = this.zzc;
                    if (zzb < i5) {
                        int zzb2 = this.zzb.zzb();
                        this.zzb.zzz(Math.min((int) oq.l, Math.max(i5, zzb2 + zzb2)));
                    }
                }
            } else {
                int min2 = Math.min(zzdyVar.zza(), this.zzc - i3);
                zzdyVar.zzB(this.zzb.zzH(), this.zzd, min2);
                int i6 = this.zzd + min2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.zze) {
                        if (zzeg.zzg(this.zzb.zzH(), 0, i7, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzE(this.zzc - 4);
                    } else {
                        this.zzb.zzE(i7);
                    }
                    this.zzb.zzF(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzee zzeeVar, zzyu zzyuVar, zzahm zzahmVar) {
        this.zza.zzb(zzeeVar, zzyuVar, zzahmVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
        this.zzf = true;
    }
}