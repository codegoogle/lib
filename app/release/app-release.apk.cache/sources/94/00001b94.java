package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzad {
    private static final zzad zzG = new zzad(new zzab());
    public static final zzl zza = zzz.zza;
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    private int zzH;
    @z1
    public final String zzb;
    @z1
    public final String zzc;
    @z1
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    @z1
    public final String zzj;
    @z1
    public final zzbl zzk;
    @z1
    public final String zzl;
    @z1
    public final String zzm;
    public final int zzn;
    public final List zzo;
    @z1
    public final zzv zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    @z1
    public final byte[] zzw;
    public final int zzx;
    @z1
    public final zzo zzy;
    public final int zzz;

    private zzad(zzab zzabVar) {
        this.zzb = zzab.zzac(zzabVar);
        this.zzc = zzab.zzad(zzabVar);
        this.zzd = zzeg.zzO(zzab.zzae(zzabVar));
        this.zze = zzab.zzo(zzabVar);
        this.zzf = 0;
        int zzd = zzab.zzd(zzabVar);
        this.zzg = zzd;
        int zzl = zzab.zzl(zzabVar);
        this.zzh = zzl;
        this.zzi = zzl != -1 ? zzl : zzd;
        this.zzj = zzab.zzaa(zzabVar);
        this.zzk = zzab.zzZ(zzabVar);
        this.zzl = zzab.zzab(zzabVar);
        this.zzm = zzab.zzaf(zzabVar);
        this.zzn = zzab.zzj(zzabVar);
        this.zzo = zzab.zzag(zzabVar) == null ? Collections.emptyList() : zzab.zzag(zzabVar);
        zzv zzt = zzab.zzt(zzabVar);
        this.zzp = zzt;
        this.zzq = zzab.zzr(zzabVar);
        this.zzr = zzab.zzq(zzabVar);
        this.zzs = zzab.zzi(zzabVar);
        this.zzt = zzab.zza(zzabVar);
        this.zzu = zzab.zzm(zzabVar) == -1 ? 0 : zzab.zzm(zzabVar);
        this.zzv = zzab.zzb(zzabVar) == -1.0f ? 1.0f : zzab.zzb(zzabVar);
        this.zzw = zzab.zzah(zzabVar);
        this.zzx = zzab.zzp(zzabVar);
        this.zzy = zzab.zzs(zzabVar);
        this.zzz = zzab.zze(zzabVar);
        this.zzA = zzab.zzn(zzabVar);
        this.zzB = zzab.zzk(zzabVar);
        this.zzC = zzab.zzg(zzabVar) == -1 ? 0 : zzab.zzg(zzabVar);
        this.zzD = zzab.zzh(zzabVar) != -1 ? zzab.zzh(zzabVar) : 0;
        this.zzE = zzab.zzc(zzabVar);
        this.zzF = (zzab.zzf(zzabVar) != 0 || zzt == null) ? zzab.zzf(zzabVar) : 1;
    }

    public final boolean equals(@z1 Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzad.class == obj.getClass()) {
            zzad zzadVar = (zzad) obj;
            int i2 = this.zzH;
            if ((i2 == 0 || (i = zzadVar.zzH) == 0 || i2 == i) && this.zze == zzadVar.zze && this.zzg == zzadVar.zzg && this.zzh == zzadVar.zzh && this.zzn == zzadVar.zzn && this.zzq == zzadVar.zzq && this.zzr == zzadVar.zzr && this.zzs == zzadVar.zzs && this.zzu == zzadVar.zzu && this.zzx == zzadVar.zzx && this.zzz == zzadVar.zzz && this.zzA == zzadVar.zzA && this.zzB == zzadVar.zzB && this.zzC == zzadVar.zzC && this.zzD == zzadVar.zzD && this.zzE == zzadVar.zzE && this.zzF == zzadVar.zzF && Float.compare(this.zzt, zzadVar.zzt) == 0 && Float.compare(this.zzv, zzadVar.zzv) == 0 && zzeg.zzS(this.zzb, zzadVar.zzb) && zzeg.zzS(this.zzc, zzadVar.zzc) && zzeg.zzS(this.zzj, zzadVar.zzj) && zzeg.zzS(this.zzl, zzadVar.zzl) && zzeg.zzS(this.zzm, zzadVar.zzm) && zzeg.zzS(this.zzd, zzadVar.zzd) && Arrays.equals(this.zzw, zzadVar.zzw) && zzeg.zzS(this.zzk, zzadVar.zzk) && zzeg.zzS(this.zzy, zzadVar.zzy) && zzeg.zzS(this.zzp, zzadVar.zzp) && zzd(zzadVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzH;
        if (i == 0) {
            String str = this.zzb;
            int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.zzc;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.zzd;
            int hashCode3 = (((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 961) + this.zzg) * 31) + this.zzh) * 31;
            String str4 = this.zzj;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            zzbl zzblVar = this.zzk;
            int hashCode5 = (hashCode4 + (zzblVar == null ? 0 : zzblVar.hashCode())) * 31;
            String str5 = this.zzl;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.zzm;
            int hashCode7 = str6 != null ? str6.hashCode() : 0;
            int floatToIntBits = ((((((((((((((((Float.floatToIntBits(this.zzv) + ((((Float.floatToIntBits(this.zzt) + ((((((((((hashCode6 + hashCode7) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31)) * 31) + this.zzu) * 31)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF;
            this.zzH = floatToIntBits;
            return floatToIntBits;
        }
        return i;
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzl;
        String str4 = this.zzm;
        String str5 = this.zzj;
        int i = this.zzi;
        String str6 = this.zzd;
        int i2 = this.zzr;
        int i3 = this.zzs;
        float f = this.zzt;
        int i4 = this.zzz;
        int i5 = this.zzA;
        StringBuilder N = wo1.N("Format(", str, ", ", str2, ", ");
        wo1.h0(N, str3, ", ", str4, ", ");
        N.append(str5);
        N.append(", ");
        N.append(i);
        N.append(", ");
        N.append(str6);
        N.append(", [");
        N.append(i2);
        N.append(", ");
        N.append(i3);
        N.append(", ");
        N.append(f);
        N.append("], [");
        N.append(i4);
        N.append(", ");
        N.append(i5);
        N.append("])");
        return N.toString();
    }

    public final int zza() {
        int i;
        int i2 = this.zzr;
        if (i2 == -1 || (i = this.zzs) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzab zzb() {
        return new zzab(this, null);
    }

    public final zzad zzc(int i) {
        zzab zzabVar = new zzab(this, null);
        zzabVar.zzA(i);
        return new zzad(zzabVar);
    }

    public final boolean zzd(zzad zzadVar) {
        if (this.zzo.size() == zzadVar.zzo.size()) {
            for (int i = 0; i < this.zzo.size(); i++) {
                if (!Arrays.equals((byte[]) this.zzo.get(i), (byte[]) zzadVar.zzo.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}