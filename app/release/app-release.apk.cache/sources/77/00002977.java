package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfem {
    private final long zza;
    private long zzc;
    private final zzfel zzb = new zzfel();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfem() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        this.zza = currentTimeMillis;
        this.zzc = currentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfel zzd() {
        zzfel clone = this.zzb.clone();
        zzfel zzfelVar = this.zzb;
        zzfelVar.zza = false;
        zzfelVar.zzb = 0;
        return clone;
    }

    public final String zze() {
        StringBuilder G = wo1.G("Created: ");
        G.append(this.zza);
        G.append(" Last accessed: ");
        G.append(this.zzc);
        G.append(" Accesses: ");
        G.append(this.zzd);
        G.append("\nEntries retrieved: Valid: ");
        G.append(this.zze);
        G.append(" Stale: ");
        G.append(this.zzf);
        return G.toString();
    }

    public final void zzf() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}