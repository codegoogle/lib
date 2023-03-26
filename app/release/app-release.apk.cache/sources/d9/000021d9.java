package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzckj implements zzeq {
    private final zzeq zza;
    private final long zzb;
    private final zzeq zzc;
    private long zzd;
    private Uri zze;

    public zzckj(zzeq zzeqVar, int i, zzeq zzeqVar2) {
        this.zza = zzeqVar;
        this.zzb = i;
        this.zzc = zzeqVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzp
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

    @Override // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzevVar) throws IOException {
        zzev zzevVar2;
        this.zze = zzevVar.zza;
        long j = zzevVar.zzf;
        long j2 = this.zzb;
        zzev zzevVar3 = null;
        if (j >= j2) {
            zzevVar2 = null;
        } else {
            long j3 = zzevVar.zzg;
            zzevVar2 = new zzev(zzevVar.zza, null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, null, 0);
        }
        long j4 = zzevVar.zzg;
        if (j4 == -1 || zzevVar.zzf + j4 > this.zzb) {
            long max = Math.max(this.zzb, zzevVar.zzf);
            long j5 = zzevVar.zzg;
            zzevVar3 = new zzev(zzevVar.zza, null, max, max, j5 != -1 ? Math.min(j5, (zzevVar.zzf + j5) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzevVar2 != null ? this.zza.zzb(zzevVar2) : 0L;
        long zzb2 = zzevVar3 != null ? this.zzc.zzb(zzevVar3) : 0L;
        this.zzd = zzevVar.zzf;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzeq, com.google.android.gms.internal.ads.zzfn
    public final Map zze() {
        return zzfrm.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzf(zzfs zzfsVar) {
    }
}