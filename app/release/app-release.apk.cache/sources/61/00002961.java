package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfdr {
    private final zzfdq zza = new zzfdq();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final zzfdq zza() {
        zzfdq clone = this.zza.clone();
        zzfdq zzfdqVar = this.zza;
        zzfdqVar.zza = false;
        zzfdqVar.zzb = false;
        return clone;
    }

    public final String zzb() {
        StringBuilder G = wo1.G("\n\tPool does not exist: ");
        G.append(this.zzd);
        G.append("\n\tNew pools created: ");
        G.append(this.zzb);
        G.append("\n\tPools removed: ");
        G.append(this.zzc);
        G.append("\n\tEntries added: ");
        G.append(this.zzf);
        G.append("\n\tNo entries retrieved: ");
        return wo1.z(G, this.zze, "\n");
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}