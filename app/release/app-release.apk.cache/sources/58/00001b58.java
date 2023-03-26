package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaau implements zzyr {
    private zzyu zzb;
    private int zzc;
    private int zzd;
    private int zze;
    @z1
    private zzacr zzg;
    private zzys zzh;
    private zzaax zzi;
    @z1
    private zzaeo zzj;
    private final zzdy zza = new zzdy(6);
    private long zzf = -1;

    private final int zze(zzys zzysVar) throws IOException {
        this.zza.zzC(2);
        ((zzyl) zzysVar).zzm(this.zza.zzH(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzbk[0]);
        zzyu zzyuVar = this.zzb;
        Objects.requireNonNull(zzyuVar);
        zzyuVar.zzB();
        this.zzb.zzL(new zzzt(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    private final void zzg(zzbk... zzbkVarArr) {
        zzyu zzyuVar = this.zzb;
        Objects.requireNonNull(zzyuVar);
        zzzy zzv = zzyuVar.zzv(1024, 4);
        zzab zzabVar = new zzab();
        zzabVar.zzz("image/jpeg");
        zzabVar.zzM(new zzbl(zzbkVarArr));
        zzv.zzk(zzabVar.zzY());
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x015e  */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        int i;
        String zzv;
        zzaaw zza;
        zzacr zzacrVar;
        long j;
        int i2 = this.zzc;
        if (i2 == 0) {
            this.zza.zzC(2);
            ((zzyl) zzysVar).zzn(this.zza.zzH(), 0, 2, false);
            int zzo = this.zza.zzo();
            this.zzd = zzo;
            if (zzo == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzf();
                return 0;
            } else if ((zzo < 65488 || zzo > 65497) && zzo != 65281) {
                this.zzc = 1;
                return 0;
            } else {
                return 0;
            }
        } else if (i2 == 1) {
            this.zza.zzC(2);
            ((zzyl) zzysVar).zzn(this.zza.zzH(), 0, 2, false);
            this.zze = this.zza.zzo() - 2;
            this.zzc = 2;
            return 0;
        } else if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzysVar != this.zzh) {
                    this.zzh = zzysVar;
                    this.zzi = new zzaax(zzysVar, this.zzf);
                }
                zzaeo zzaeoVar = this.zzj;
                Objects.requireNonNull(zzaeoVar);
                int zza2 = zzaeoVar.zza(this.zzi, zzzrVar);
                if (zza2 == 1) {
                    zzzrVar.zza += this.zzf;
                }
                return zza2;
            }
            long zzf = zzysVar.zzf();
            long j2 = this.zzf;
            if (zzf != j2) {
                zzzrVar.zza = j2;
                return 1;
            }
            if (!zzysVar.zzm(this.zza.zzH(), 0, 1, true)) {
                zzf();
            } else {
                zzysVar.zzj();
                if (this.zzj == null) {
                    this.zzj = new zzaeo(0);
                }
                zzaax zzaaxVar = new zzaax(zzysVar, this.zzf);
                this.zzi = zzaaxVar;
                if (this.zzj.zzd(zzaaxVar)) {
                    zzaeo zzaeoVar2 = this.zzj;
                    long j3 = this.zzf;
                    zzyu zzyuVar = this.zzb;
                    Objects.requireNonNull(zzyuVar);
                    zzaeoVar2.zzb(new zzaaz(j3, zzyuVar));
                    zzacr zzacrVar2 = this.zzg;
                    Objects.requireNonNull(zzacrVar2);
                    zzg(zzacrVar2);
                    this.zzc = 5;
                } else {
                    zzf();
                }
            }
            return 0;
        } else {
            if (this.zzd == 65505) {
                zzdy zzdyVar = new zzdy(this.zze);
                ((zzyl) zzysVar).zzn(zzdyVar.zzH(), 0, this.zze, false);
                if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzdyVar.zzv((char) 0)) && (zzv = zzdyVar.zzv((char) 0)) != null) {
                    long zzd = zzysVar.zzd();
                    if (zzd != -1 && (zza = zzaba.zza(zzv)) != null && zza.zzb.size() >= 2) {
                        long j4 = -1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        boolean z = false;
                        for (int size = zza.zzb.size() - 1; size >= 0; size--) {
                            zzaav zzaavVar = (zzaav) zza.zzb.get(size);
                            boolean equals = "video/mp4".equals(zzaavVar.zza) | z;
                            if (size == 0) {
                                zzd -= zzaavVar.zzd;
                                j = 0;
                            } else {
                                j = zzd - zzaavVar.zzc;
                            }
                            long j8 = zzd;
                            zzd = j;
                            if (!equals || zzd == j8) {
                                z = equals;
                            } else {
                                j7 = j8 - zzd;
                                j6 = zzd;
                                z = false;
                            }
                            if (size == 0) {
                                j5 = j8;
                            }
                            if (size == 0) {
                                j4 = zzd;
                            }
                        }
                        if (j6 != -1 && j7 != -1 && j4 != -1 && j5 != -1) {
                            zzacrVar = new zzacr(j4, j5, zza.zza, j6, j7);
                            this.zzg = zzacrVar;
                            if (zzacrVar != null) {
                                this.zzf = zzacrVar.zzd;
                            }
                        }
                    }
                    zzacrVar = null;
                    this.zzg = zzacrVar;
                    if (zzacrVar != null) {
                    }
                }
                i = 0;
            } else {
                i = 0;
                ((zzyl) zzysVar).zzo(this.zze, false);
            }
            this.zzc = i;
            return i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzb = zzyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaeo zzaeoVar = this.zzj;
            Objects.requireNonNull(zzaeoVar);
            zzaeoVar.zzc(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        if (zze(zzysVar) != 65496) {
            return false;
        }
        int zze = zze(zzysVar);
        this.zzd = zze;
        if (zze == 65504) {
            this.zza.zzC(2);
            zzyl zzylVar = (zzyl) zzysVar;
            zzylVar.zzm(this.zza.zzH(), 0, 2, false);
            zzylVar.zzl(this.zza.zzo() - 2, false);
            zze = zze(zzysVar);
            this.zzd = zze;
        }
        if (zze == 65505) {
            zzyl zzylVar2 = (zzyl) zzysVar;
            zzylVar2.zzl(2, false);
            this.zza.zzC(6);
            zzylVar2.zzm(this.zza.zzH(), 0, 6, false);
            if (this.zza.zzs() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
        }
        return false;
    }
}