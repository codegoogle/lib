package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zztu extends zzci {
    private static final Object zzc = new Object();
    private static final zzbb zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    @z1
    private final zzbb zzh;
    @z1
    private final zzau zzi;

    static {
        zzah zzahVar = new zzah();
        zzahVar.zza("SinglePeriodTimeline");
        zzahVar.zzb(Uri.EMPTY);
        zzd = zzahVar.zzc();
    }

    public zztu(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @z1 Object obj, zzbb zzbbVar, @z1 zzau zzauVar) {
        this.zze = j4;
        this.zzf = j5;
        this.zzg = z;
        this.zzh = zzbbVar;
        this.zzi = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zza(Object obj) {
        return zzc.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzcf zzd(int i, zzcf zzcfVar, boolean z) {
        zzcw.zza(i, 0, 1);
        zzcfVar.zzk(null, z ? zzc : null, 0, this.zze, 0L, zzd.zza, false);
        return zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzch zze(int i, zzch zzchVar, long j) {
        zzcw.zza(i, 0, 1);
        zzchVar.zza(zzch.zza, this.zzh, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, this.zzi, 0L, this.zzf, 0, 0, 0L);
        return zzchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final Object zzf(int i) {
        zzcw.zza(i, 0, 1);
        return zzc;
    }
}