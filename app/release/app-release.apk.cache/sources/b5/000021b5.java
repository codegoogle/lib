package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcja implements zzayj {
    private final zzayj zza;
    private final long zzb;
    private final zzayj zzc;
    private long zzd;
    private Uri zze;

    public zzcja(zzayj zzayjVar, int i, zzayj zzayjVar2) {
        this.zza = zzayjVar;
        this.zzb = i;
        this.zzc = zzayjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + zza;
            this.zzd = j3;
            i3 = zza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
            this.zzd += zza2;
            return i3 + zza2;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final long zzb(zzayl zzaylVar) throws IOException {
        zzayl zzaylVar2;
        this.zze = zzaylVar.zza;
        long j = zzaylVar.zzc;
        long j2 = this.zzb;
        zzayl zzaylVar3 = null;
        if (j >= j2) {
            zzaylVar2 = null;
        } else {
            long j3 = zzaylVar.zzd;
            zzaylVar2 = new zzayl(zzaylVar.zza, null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, null, 0);
        }
        long j4 = zzaylVar.zzd;
        if (j4 == -1 || zzaylVar.zzc + j4 > this.zzb) {
            long max = Math.max(this.zzb, zzaylVar.zzc);
            long j5 = zzaylVar.zzd;
            zzaylVar3 = new zzayl(zzaylVar.zza, null, max, max, j5 != -1 ? Math.min(j5, (zzaylVar.zzc + j5) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzaylVar2 != null ? this.zza.zzb(zzaylVar2) : 0L;
        long zzb2 = zzaylVar3 != null ? this.zzc.zzb(zzaylVar3) : 0L;
        this.zzd = zzaylVar.zzc;
        if (zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }
}