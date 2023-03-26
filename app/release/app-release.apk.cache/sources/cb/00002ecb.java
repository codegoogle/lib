package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzrt extends zzro {
    public static final Object zzd = new Object();
    @z1
    private final Object zze;
    @z1
    private final Object zzf;

    private zzrt(zzci zzciVar, @z1 Object obj, @z1 Object obj2) {
        super(zzciVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzrt zzq(zzbb zzbbVar) {
        return new zzrt(new zzru(zzbbVar), zzch.zza, zzd);
    }

    public static zzrt zzr(zzci zzciVar, @z1 Object obj, @z1 Object obj2) {
        return new zzrt(zzciVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzro, com.google.android.gms.internal.ads.zzci
    public final int zza(Object obj) {
        Object obj2;
        zzci zzciVar = this.zzc;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return zzciVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzro, com.google.android.gms.internal.ads.zzci
    public final zzcf zzd(int i, zzcf zzcfVar, boolean z) {
        this.zzc.zzd(i, zzcfVar, z);
        if (zzeg.zzS(zzcfVar.zzc, this.zzf) && z) {
            zzcfVar.zzc = zzd;
        }
        return zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzro, com.google.android.gms.internal.ads.zzci
    public final zzch zze(int i, zzch zzchVar, long j) {
        this.zzc.zze(i, zzchVar, j);
        if (zzeg.zzS(zzchVar.zzc, this.zze)) {
            zzchVar.zzc = zzch.zza;
        }
        return zzchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzro, com.google.android.gms.internal.ads.zzci
    public final Object zzf(int i) {
        Object zzf = this.zzc.zzf(i);
        return zzeg.zzS(zzf, this.zzf) ? zzd : zzf;
    }

    public final zzrt zzp(zzci zzciVar) {
        return new zzrt(zzciVar, this.zze, this.zzf);
    }
}