package com.google.android.gms.internal.ads;

import com.p7700g.p99005.g15;
import com.p7700g.p99005.z1;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzze {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    @z1
    public final zzzd zzk;
    @z1
    private final zzbl zzl;

    private zzze(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @z1 zzzd zzzdVar, @z1 zzbl zzblVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = zzi(i5);
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzh(i7);
        this.zzj = j;
        this.zzk = zzzdVar;
        this.zzl = zzblVar;
    }

    public zzze(byte[] bArr, int i) {
        zzdx zzdxVar = new zzdx(bArr, bArr.length);
        zzdxVar.zzh(i * 8);
        this.zza = zzdxVar.zzc(16);
        this.zzb = zzdxVar.zzc(16);
        this.zzc = zzdxVar.zzc(24);
        this.zzd = zzdxVar.zzc(24);
        int zzc = zzdxVar.zzc(20);
        this.zze = zzc;
        this.zzf = zzi(zzc);
        this.zzg = zzdxVar.zzc(3) + 1;
        int zzc2 = zzdxVar.zzc(5) + 1;
        this.zzh = zzc2;
        this.zzi = zzh(zzc2);
        this.zzj = zzeg.zzy(zzdxVar.zzc(4), zzdxVar.zzc(32));
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        return i != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int zzi(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j = this.zzj;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.zze;
    }

    public final long zzb(long j) {
        return zzeg.zzr((j * this.zze) / 1000000, 0L, this.zzj - 1);
    }

    public final zzad zzc(byte[] bArr, @z1 zzbl zzblVar) {
        bArr[4] = g15.b;
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzbl zzd = zzd(zzblVar);
        zzab zzabVar = new zzab();
        zzabVar.zzS("audio/flac");
        zzabVar.zzL(i);
        zzabVar.zzw(this.zzg);
        zzabVar.zzT(this.zze);
        zzabVar.zzI(Collections.singletonList(bArr));
        zzabVar.zzM(zzd);
        return zzabVar.zzY();
    }

    @z1
    public final zzbl zzd(@z1 zzbl zzblVar) {
        zzbl zzblVar2 = this.zzl;
        return zzblVar2 == null ? zzblVar : zzblVar2.zzd(zzblVar);
    }

    public final zzze zze(List list) {
        return new zzze(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzbl(list)));
    }

    public final zzze zzf(@z1 zzzd zzzdVar) {
        return new zzze(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzzdVar, this.zzl);
    }

    public final zzze zzg(List list) {
        return new zzze(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzaae.zzb(list)));
    }
}