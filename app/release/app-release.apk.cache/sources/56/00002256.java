package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzcp {
    public static final zzcp zza;
    @Deprecated
    public static final zzcp zzb;
    @Deprecated
    public static final zzl zzc;
    public final zzfrm zzB;
    public final zzfro zzC;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfrj zzo;
    public final zzfrj zzq;
    public final zzfrj zzu;
    public final zzfrj zzv;
    public final int zzw;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = Integer.MAX_VALUE;
    public final int zzf = Integer.MAX_VALUE;
    public final int zzg = Integer.MAX_VALUE;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzp = 0;
    public final int zzr = 0;
    public final int zzs = Integer.MAX_VALUE;
    public final int zzt = Integer.MAX_VALUE;
    public final int zzx = 0;
    public final boolean zzy = false;
    public final boolean zzz = false;
    public final boolean zzA = false;

    static {
        zzcp zzcpVar = new zzcp(new zzco());
        zza = zzcpVar;
        zzb = zzcpVar;
        zzc = zzcn.zza;
    }

    public zzcp(zzco zzcoVar) {
        this.zzl = zzco.zzc(zzcoVar);
        this.zzm = zzco.zzb(zzcoVar);
        this.zzn = zzco.zzl(zzcoVar);
        this.zzo = zzco.zzi(zzcoVar);
        this.zzq = zzco.zzf(zzcoVar);
        this.zzu = zzco.zzg(zzcoVar);
        this.zzv = zzco.zzh(zzcoVar);
        this.zzw = zzco.zza(zzcoVar);
        this.zzB = zzfrm.zzc(zzco.zzj(zzcoVar));
        this.zzC = zzfro.zzl(zzco.zzk(zzcoVar));
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcp zzcpVar = (zzcp) obj;
            if (this.zzn == zzcpVar.zzn && this.zzl == zzcpVar.zzl && this.zzm == zzcpVar.zzm && this.zzo.equals(zzcpVar.zzo) && this.zzq.equals(zzcpVar.zzq) && this.zzu.equals(zzcpVar.zzu) && this.zzv.equals(zzcpVar.zzv) && this.zzw == zzcpVar.zzw && this.zzB.equals(zzcpVar.zzB) && this.zzC.equals(zzcpVar.zzC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.zzo.hashCode();
        int hashCode2 = this.zzq.hashCode();
        int hashCode3 = this.zzu.hashCode();
        int hashCode4 = this.zzv.hashCode();
        int hashCode5 = this.zzB.hashCode();
        return this.zzC.hashCode() + ((hashCode5 + ((((hashCode4 + ((hashCode3 + ((((((hashCode2 + ((hashCode + (((((((this.zzn ? 1 : 0) - 1048002209) * 31) + this.zzl) * 31) + this.zzm) * 31)) * 961)) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31)) * 31)) * 31) + this.zzw) * 28629151)) * 31);
    }
}