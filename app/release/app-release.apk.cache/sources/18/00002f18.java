package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzup extends zzva implements Comparable {
    private final int zze;
    private final boolean zzf;
    @z1
    private final String zzg;
    private final zzut zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzup(int i, zzck zzckVar, int i2, zzut zzutVar, int i3, boolean z) {
        super(i, zzckVar, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.zzh = zzutVar;
        this.zzg = zzve.zzf(this.zzd.zzd);
        int i7 = 0;
        this.zzi = zzve.zzi(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= zzutVar.zzq.size()) {
                i8 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
            i5 = zzve.zza(this.zzd, (String) zzutVar.zzq.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.zzk = i8;
        this.zzj = i5;
        int i9 = this.zzd.zzf;
        this.zzl = Integer.bitCount(0);
        zzad zzadVar = this.zzd;
        int i10 = zzadVar.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzadVar.zze & 1);
        this.zzq = zzadVar.zzz;
        this.zzr = zzadVar.zzA;
        this.zzs = zzadVar.zzi;
        this.zzf = true;
        String[] zzae = zzeg.zzae();
        int i11 = 0;
        while (true) {
            if (i11 >= zzae.length) {
                i11 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            }
            i6 = zzve.zza(this.zzd, zzae[i11], false);
            if (i6 > 0) {
                break;
            }
            i11++;
        }
        this.zzn = i11;
        this.zzo = i6;
        int i12 = 0;
        while (true) {
            if (i12 < zzutVar.zzu.size()) {
                String str = this.zzd.zzm;
                if (str != null && str.equals(zzutVar.zzu.get(i12))) {
                    i4 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        this.zzt = i4;
        this.zzu = (i3 & 128) == 128;
        this.zzv = (i3 & 64) == 64;
        zzut zzutVar2 = this.zzh;
        if (zzve.zzi(i3, zzutVar2.zzP) && ((z2 = this.zzf) || zzutVar2.zzK)) {
            i7 = (!zzve.zzi(i3, false) || !z2 || this.zzd.zzi == -1 || (!zzutVar2.zzR && z)) ? 1 : 2;
        }
        this.zze = i7;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzup zzupVar) {
        zzfsr zzfsrVar;
        zzfsr zza;
        zzfsr zzfsrVar2;
        if (this.zzf && this.zzi) {
            zza = zzve.zzb;
        } else {
            zzfsrVar = zzve.zzb;
            zza = zzfsrVar.zza();
        }
        zzfqy zzc = zzfqy.zzj().zzd(this.zzi, zzupVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzupVar.zzk), zzfsr.zzc().zza()).zzb(this.zzj, zzupVar.zzj).zzb(this.zzl, zzupVar.zzl).zzd(this.zzp, zzupVar.zzp).zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzupVar.zzn), zzfsr.zzc().zza()).zzb(this.zzo, zzupVar.zzo).zzd(this.zzf, zzupVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzupVar.zzt), zzfsr.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzupVar.zzs);
        boolean z = this.zzh.zzz;
        zzfsrVar2 = zzve.zzc;
        zzfqy zzc2 = zzc.zzc(valueOf, valueOf2, zzfsrVar2).zzd(this.zzu, zzupVar.zzu).zzd(this.zzv, zzupVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzupVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzupVar.zzr), zza);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzupVar.zzs);
        if (!zzeg.zzS(this.zzg, zzupVar.zzg)) {
            zza = zzve.zzc;
        }
        return zzc2.zzc(valueOf3, valueOf4, zza).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final /* bridge */ /* synthetic */ boolean zzc(zzva zzvaVar) {
        String str;
        zzup zzupVar = (zzup) zzvaVar;
        boolean z = this.zzh.zzN;
        zzad zzadVar = this.zzd;
        int i = zzadVar.zzz;
        if (i != -1) {
            zzad zzadVar2 = zzupVar.zzd;
            if (i == zzadVar2.zzz && (str = zzadVar.zzm) != null && TextUtils.equals(str, zzadVar2.zzm)) {
                boolean z2 = this.zzh.zzM;
                int i2 = this.zzd.zzA;
                return i2 != -1 && i2 == zzupVar.zzd.zzA && this.zzu == zzupVar.zzu && this.zzv == zzupVar.zzv;
            }
            return false;
        }
        return false;
    }
}