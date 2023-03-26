package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzyj implements zzzu {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzyj(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
            return;
        }
        int i = length - 1;
        this.zzf = jArr2[i] + jArr3[i];
    }

    public final String toString() {
        int i = this.zza;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(this.zzc);
        String arrays3 = Arrays.toString(this.zze);
        String arrays4 = Arrays.toString(this.zzd);
        StringBuilder sb = new StringBuilder();
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        wo1.h0(sb, arrays2, ", timeUs=", arrays3, ", durationsUs=");
        return wo1.C(sb, arrays4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j) {
        int zzd = zzeg.zzd(this.zze, j, true, true);
        zzzv zzzvVar = new zzzv(this.zze[zzd], this.zzc[zzd]);
        if (zzzvVar.zzb < j && zzd != this.zza - 1) {
            int i = zzd + 1;
            return new zzzs(zzzvVar, new zzzv(this.zze[i], this.zzc[i]));
        }
        return new zzzs(zzzvVar, zzzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}