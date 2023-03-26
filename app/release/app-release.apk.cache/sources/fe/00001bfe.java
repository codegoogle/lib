package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.p7700g.p99005.z1;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagy implements zzyr {
    public static final zzyy zza = zzagw.zza;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    @z1
    private zzagu zzj;
    private zzyu zzk;
    private boolean zzl;
    private final zzee zzb = new zzee(0);
    private final zzdy zzd = new zzdy(4096);
    private final SparseArray zzc = new SparseArray();
    private final zzagv zze = new zzagv();

    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        zzaga zzagcVar;
        zzcw.zzb(this.zzk);
        long zzd = zzysVar.zzd();
        int i = (zzd > (-1L) ? 1 : (zzd == (-1L) ? 0 : -1));
        if (i != 0) {
            zzagv zzagvVar = this.zze;
            if (!zzagvVar.zze()) {
                return zzagvVar.zza(zzysVar, zzzrVar);
            }
        }
        if (!this.zzl) {
            this.zzl = true;
            zzagv zzagvVar2 = this.zze;
            if (zzagvVar2.zzb() != -9223372036854775807L) {
                zzagu zzaguVar = new zzagu(zzagvVar2.zzd(), zzagvVar2.zzb(), zzd);
                this.zzj = zzaguVar;
                this.zzk.zzL(zzaguVar.zzb());
            } else {
                this.zzk.zzL(new zzzt(zzagvVar2.zzb(), 0L));
            }
        }
        zzagu zzaguVar2 = this.zzj;
        if (zzaguVar2 != null && zzaguVar2.zze()) {
            return zzaguVar2.zza(zzysVar, zzzrVar);
        }
        zzysVar.zzj();
        long zze = i != 0 ? zzd - zzysVar.zze() : -1L;
        if ((zze == -1 || zze >= 4) && zzysVar.zzm(this.zzd.zzH(), 0, 4, true)) {
            this.zzd.zzF(0);
            int zze2 = this.zzd.zze();
            if (zze2 == 441) {
                return -1;
            }
            if (zze2 == 442) {
                zzyl zzylVar = (zzyl) zzysVar;
                zzylVar.zzm(this.zzd.zzH(), 0, 10, false);
                this.zzd.zzF(9);
                zzylVar.zzo((this.zzd.zzk() & 7) + 14, false);
                return 0;
            } else if (zze2 == 443) {
                zzyl zzylVar2 = (zzyl) zzysVar;
                zzylVar2.zzm(this.zzd.zzH(), 0, 2, false);
                this.zzd.zzF(0);
                zzylVar2.zzo(this.zzd.zzo() + 6, false);
                return 0;
            } else if ((zze2 >> 8) != 1) {
                ((zzyl) zzysVar).zzo(1, false);
                return 0;
            } else {
                int i2 = zze2 & 255;
                zzagx zzagxVar = (zzagx) this.zzc.get(i2);
                if (!this.zzf) {
                    if (zzagxVar == null) {
                        zzaga zzagaVar = null;
                        if (i2 == 189) {
                            zzagcVar = new zzafq(null);
                            this.zzg = true;
                            this.zzi = zzysVar.zzf();
                        } else if ((i2 & 224) == 192) {
                            zzagcVar = new zzago(null);
                            this.zzg = true;
                            this.zzi = zzysVar.zzf();
                        } else {
                            if ((i2 & 240) == 224) {
                                zzagcVar = new zzagc(null);
                                this.zzh = true;
                                this.zzi = zzysVar.zzf();
                            }
                            if (zzagaVar != null) {
                                zzagaVar.zzb(this.zzk, new zzahm(Integer.MIN_VALUE, i2, 256));
                                zzagxVar = new zzagx(zzagaVar, this.zzb);
                                this.zzc.put(i2, zzagxVar);
                            }
                        }
                        zzagaVar = zzagcVar;
                        if (zzagaVar != null) {
                        }
                    }
                    boolean z = this.zzg;
                    long j = PlaybackStateCompat.M;
                    if (z && this.zzh) {
                        j = this.zzi + PlaybackStateCompat.F;
                    }
                    if (zzysVar.zzf() > j) {
                        this.zzf = true;
                        this.zzk.zzB();
                    }
                }
                zzyl zzylVar3 = (zzyl) zzysVar;
                zzylVar3.zzm(this.zzd.zzH(), 0, 2, false);
                this.zzd.zzF(0);
                int zzo = this.zzd.zzo() + 6;
                if (zzagxVar == null) {
                    zzylVar3.zzo(zzo, false);
                } else {
                    this.zzd.zzC(zzo);
                    zzylVar3.zzn(this.zzd.zzH(), 0, zzo, false);
                    this.zzd.zzF(6);
                    zzagxVar.zza(this.zzd);
                    zzdy zzdyVar = this.zzd;
                    zzdyVar.zzE(zzdyVar.zzb());
                }
                return 0;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzk = zzyuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 != r7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[LOOP:0: B:14:0x002c->B:16:0x0034, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(long j, long j2) {
        zzagu zzaguVar;
        int i;
        zzee zzeeVar = this.zzb;
        if (zzeeVar.zze() != -9223372036854775807L) {
            long zzc = zzeeVar.zzc();
            if (zzc != -9223372036854775807L) {
                if (zzc != 0) {
                }
            }
            zzaguVar = this.zzj;
            if (zzaguVar != null) {
                zzaguVar.zzd(j2);
            }
            for (i = 0; i < this.zzc.size(); i++) {
                ((zzagx) this.zzc.valueAt(i)).zzb();
            }
        }
        zzeeVar.zzf(j2);
        zzaguVar = this.zzj;
        if (zzaguVar != null) {
        }
        while (i < this.zzc.size()) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        byte[] bArr = new byte[14];
        zzyl zzylVar = (zzyl) zzysVar;
        zzylVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            zzylVar.zzl(bArr[13] & 7, false);
            zzylVar.zzm(bArr, 0, 3, false);
            return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
        }
        return false;
    }
}