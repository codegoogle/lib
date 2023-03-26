package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagt implements zzyg {
    private final zzee zza;
    private final zzdy zzb = new zzdy();

    public /* synthetic */ zzagt(zzee zzeeVar, zzags zzagsVar) {
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final zzyf zza(zzys zzysVar, long j) throws IOException {
        int zzh;
        long j2;
        long zzf = zzysVar.zzf();
        int min = (int) Math.min(20000L, zzysVar.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzyl) zzysVar).zzm(this.zzb.zzH(), 0, min, false);
        zzdy zzdyVar = this.zzb;
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (zzdyVar.zza() >= 4) {
            if (zzagu.zzh(zzdyVar.zzH(), zzdyVar.zzc()) != 442) {
                zzdyVar.zzG(1);
            } else {
                zzdyVar.zzG(4);
                long zzc = zzagv.zzc(zzdyVar);
                if (zzc != -9223372036854775807L) {
                    long zzb = this.zza.zzb(zzc);
                    if (zzb > j) {
                        if (j3 == -9223372036854775807L) {
                            return zzyf.zzd(zzb, zzf);
                        }
                        j2 = i2;
                    } else if (100000 + zzb > j) {
                        j2 = zzdyVar.zzc();
                    } else {
                        i2 = zzdyVar.zzc();
                        j3 = zzb;
                    }
                    return zzyf.zze(zzf + j2);
                }
                int zzd = zzdyVar.zzd();
                if (zzdyVar.zza() < 10) {
                    zzdyVar.zzF(zzd);
                } else {
                    zzdyVar.zzG(9);
                    int zzk = zzdyVar.zzk() & 7;
                    if (zzdyVar.zza() < zzk) {
                        zzdyVar.zzF(zzd);
                    } else {
                        zzdyVar.zzG(zzk);
                        if (zzdyVar.zza() < 4) {
                            zzdyVar.zzF(zzd);
                        } else {
                            if (zzagu.zzh(zzdyVar.zzH(), zzdyVar.zzc()) == 443) {
                                zzdyVar.zzG(4);
                                int zzo = zzdyVar.zzo();
                                if (zzdyVar.zza() < zzo) {
                                    zzdyVar.zzF(zzd);
                                } else {
                                    zzdyVar.zzG(zzo);
                                }
                            }
                            while (true) {
                                if (zzdyVar.zza() < 4 || (zzh = zzagu.zzh(zzdyVar.zzH(), zzdyVar.zzc())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzdyVar.zzG(4);
                                if (zzdyVar.zza() < 2) {
                                    zzdyVar.zzF(zzd);
                                    break;
                                }
                                zzdyVar.zzF(Math.min(zzdyVar.zzd(), zzdyVar.zzc() + zzdyVar.zzo()));
                            }
                        }
                    }
                }
                i = zzdyVar.zzc();
            }
        }
        return j3 != -9223372036854775807L ? zzyf.zzf(j3, zzf + i) : zzyf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void zzb() {
        zzdy zzdyVar = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdyVar.zzD(bArr, 0);
    }
}