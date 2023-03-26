package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzuy extends zzva implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzuy(int i, zzck zzckVar, int i2, zzut zzutVar, int i3, @z1 String str) {
        super(i, zzckVar, i2);
        zzfrj zzfrjVar;
        int i4;
        int i5 = 0;
        this.zzf = zzve.zzi(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzutVar.zzx;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        if (zzutVar.zzv.isEmpty()) {
            zzfrjVar = zzfrj.zzp("");
        } else {
            zzfrjVar = zzutVar.zzv;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= zzfrjVar.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = zzve.zza(this.zzd, (String) zzfrjVar.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.zzi = i8;
        this.zzj = i4;
        int i9 = this.zzd.zzf;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i10 = this.zzd.zzf;
        this.zzm = false;
        int zza = zzve.zza(this.zzd, str, zzve.zzf(str) == null);
        this.zzl = zza;
        boolean z = i4 > 0 || (zzutVar.zzv.isEmpty() && bitCount > 0) || this.zzg || (this.zzh && zza > 0);
        if (zzve.zzi(i3, zzutVar.zzP) && z) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzuy zzuyVar) {
        zzfqy zzb = zzfqy.zzj().zzd(this.zzf, zzuyVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzuyVar.zzi), zzfsr.zzc().zza()).zzb(this.zzj, zzuyVar.zzj).zzb(this.zzk, zzuyVar.zzk).zzd(this.zzg, zzuyVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzuyVar.zzh), this.zzj == 0 ? zzfsr.zzc() : zzfsr.zzc().zza()).zzb(this.zzl, zzuyVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final /* bridge */ /* synthetic */ boolean zzc(zzva zzvaVar) {
        zzuy zzuyVar = (zzuy) zzvaVar;
        return false;
    }
}