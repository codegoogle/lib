package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagr implements zzahn {
    private final zzaga zza;
    private final zzdx zzb = new zzdx(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzee zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzagr(zzaga zzagaVar) {
        this.zza = zzagaVar;
    }

    private final void zzd(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zze(zzdy zzdyVar, @z1 byte[] bArr, int i) {
        int min = Math.min(zzdyVar.zza(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzdyVar.zzG(min);
        } else {
            zzdyVar.zzB(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzdy zzdyVar, int i) throws zzbp {
        int i2;
        long j;
        zzcw.zzb(this.zze);
        int i3 = -1;
        int i4 = 2;
        if ((i & 1) != 0) {
            int i5 = this.zzc;
            if (i5 != 0 && i5 != 1 && i5 != 2) {
                int i6 = this.zzj;
                this.zza.zzc();
            }
            zzd(1);
        }
        int i7 = i;
        while (zzdyVar.zza() > 0) {
            int i8 = this.zzc;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != i4) {
                        int zza = zzdyVar.zza();
                        int i9 = this.zzj;
                        int i10 = i9 != i3 ? zza - i9 : 0;
                        if (i10 > 0) {
                            zza -= i10;
                            zzdyVar.zzE(zzdyVar.zzc() + zza);
                        }
                        this.zza.zza(zzdyVar);
                        int i11 = this.zzj;
                        if (i11 != i3) {
                            int i12 = i11 - zza;
                            this.zzj = i12;
                            if (i12 == 0) {
                                this.zza.zzc();
                                zzd(1);
                            }
                        }
                    } else {
                        if (zze(zzdyVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzdyVar, null, this.zzi)) {
                            this.zzb.zzh(0);
                            if (this.zzf) {
                                this.zzb.zzj(4);
                                int zzc = this.zzb.zzc(3);
                                this.zzb.zzj(1);
                                int zzc2 = this.zzb.zzc(15);
                                this.zzb.zzj(1);
                                long zzc3 = (zzc << 30) | (zzc2 << 15) | this.zzb.zzc(15);
                                this.zzb.zzj(1);
                                if (!this.zzh && this.zzg) {
                                    this.zzb.zzj(4);
                                    int zzc4 = this.zzb.zzc(3);
                                    this.zzb.zzj(1);
                                    int zzc5 = this.zzb.zzc(15);
                                    this.zzb.zzj(1);
                                    int zzc6 = this.zzb.zzc(15);
                                    this.zzb.zzj(1);
                                    this.zze.zzb((zzc4 << 30) | (zzc5 << 15) | zzc6);
                                    this.zzh = true;
                                }
                                j = this.zze.zzb(zzc3);
                            } else {
                                j = -9223372036854775807L;
                            }
                            i7 |= true == this.zzk ? 4 : 0;
                            this.zza.zzd(j, i7);
                            zzd(3);
                        }
                    }
                } else if (zze(zzdyVar, this.zzb.zza, 9)) {
                    this.zzb.zzh(0);
                    if (this.zzb.zzc(24) != 1) {
                        this.zzj = -1;
                        i2 = 0;
                    } else {
                        this.zzb.zzj(8);
                        int zzc7 = this.zzb.zzc(16);
                        this.zzb.zzj(5);
                        this.zzk = this.zzb.zzl();
                        this.zzb.zzj(2);
                        this.zzf = this.zzb.zzl();
                        this.zzg = this.zzb.zzl();
                        this.zzb.zzj(6);
                        int zzc8 = this.zzb.zzc(8);
                        this.zzi = zzc8;
                        if (zzc7 == 0) {
                            this.zzj = -1;
                        } else {
                            int i13 = (zzc7 - 3) - zzc8;
                            this.zzj = i13;
                            if (i13 < 0) {
                                this.zzj = -1;
                            }
                        }
                        i2 = 2;
                    }
                    zzd(i2);
                }
            } else {
                zzdyVar.zzG(zzdyVar.zza());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzee zzeeVar, zzyu zzyuVar, zzahm zzahmVar) {
        this.zze = zzeeVar;
        this.zza.zzb(zzyuVar, zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}