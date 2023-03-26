package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.p7700g.p99005.z1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzevk {
    private final zzbzv zza;
    private final int zzb;

    public zzevk(zzbzv zzbzvVar, int i) {
        this.zza = zzbzvVar;
        this.zzb = i;
    }

    public final int zza() {
        return this.zzb;
    }

    @z1
    public final PackageInfo zzb() {
        return this.zza.zzf;
    }

    public final String zzc() {
        return this.zza.zzd;
    }

    public final String zzd() {
        return this.zza.zza.getString("ms");
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final List zzf() {
        return this.zza.zze;
    }

    public final boolean zzg() {
        return this.zza.zza.getBoolean("is_gbid");
    }
}