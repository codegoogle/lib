package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import com.p7700g.p99005.z1;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzti implements zzvp {
    public long zza;
    public long zzb;
    @z1
    public zzvo zzc;
    @z1
    public zzti zzd;

    public zzti(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = this.zza;
        int i = this.zzc.zzb;
        return (int) (j - j2);
    }

    public final zzti zzb() {
        this.zzc = null;
        zzti zztiVar = this.zzd;
        this.zzd = null;
        return zztiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final zzvo zzc() {
        zzvo zzvoVar = this.zzc;
        Objects.requireNonNull(zzvoVar);
        return zzvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    @z1
    public final zzvp zzd() {
        zzti zztiVar = this.zzd;
        if (zztiVar == null || zztiVar.zzc == null) {
            return null;
        }
        return zztiVar;
    }

    public final void zze(long j, int i) {
        zzcw.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + PlaybackStateCompat.I;
    }
}