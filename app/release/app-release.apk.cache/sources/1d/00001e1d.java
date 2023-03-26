package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbb {
    public static final zzbb zza = new zzah().zzc();
    public static final zzl zzb = zzaf.zza;
    public final String zzc;
    @z1
    public final zzaw zzd;
    @z1
    @Deprecated
    public final zzay zze;
    public final zzau zzf;
    public final zzbh zzg;
    public final zzal zzh;
    @Deprecated
    public final zzan zzi;

    public /* synthetic */ zzbb(String str, zzan zzanVar, zzay zzayVar, zzau zzauVar, zzbh zzbhVar, zzba zzbaVar) {
        this.zzc = str;
        this.zzd = zzayVar;
        this.zze = zzayVar;
        this.zzf = zzauVar;
        this.zzg = zzbhVar;
        this.zzh = zzanVar;
        this.zzi = zzanVar;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbb) {
            zzbb zzbbVar = (zzbb) obj;
            return zzeg.zzS(this.zzc, zzbbVar.zzc) && this.zzh.equals(zzbbVar.zzh) && zzeg.zzS(this.zzd, zzbbVar.zzd) && zzeg.zzS(this.zzf, zzbbVar.zzf) && zzeg.zzS(this.zzg, zzbbVar.zzg);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzc.hashCode() * 31;
        zzaw zzawVar = this.zzd;
        int hashCode2 = zzawVar != null ? zzawVar.hashCode() : 0;
        int hashCode3 = this.zzf.hashCode();
        return this.zzg.hashCode() + ((this.zzh.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }
}