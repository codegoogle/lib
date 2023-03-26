package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagl implements zzaga {
    private final zzahb zza;
    private String zzb;
    private zzzy zzc;
    private zzagk zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzagp zzg = new zzagp(32, 128);
    private final zzagp zzh = new zzagp(33, 128);
    private final zzagp zzi = new zzagp(34, 128);
    private final zzagp zzj = new zzagp(39, 128);
    private final zzagp zzk = new zzagp(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzdy zzn = new zzdy();

    public zzagl(zzahb zzahbVar) {
        this.zza = zzahbVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzb(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ad  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzdy zzdyVar) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        long j;
        int i4;
        long j2;
        long j3;
        int i5;
        int i6;
        long j4;
        int i7;
        zzcw.zzb(this.zzc);
        int i8 = zzeg.zza;
        while (zzdyVar.zza() > 0) {
            int zzc = zzdyVar.zzc();
            int zzd = zzdyVar.zzd();
            byte[] zzH = zzdyVar.zzH();
            this.zzl += zzdyVar.zza();
            zzzw.zzb(this.zzc, zzdyVar, zzdyVar.zza());
            while (zzc < zzd) {
                int zza = zzzo.zza(zzH, zzc, zzd, this.zzf);
                if (zza != zzd) {
                    int i9 = zza + 3;
                    int i10 = (zzH[i9] & 126) >> 1;
                    int i11 = zza - zzc;
                    if (i11 > 0) {
                        zzf(zzH, zzc, zza);
                    }
                    int i12 = zzd - zza;
                    long j5 = this.zzl - i12;
                    int i13 = i11 < 0 ? -i11 : 0;
                    long j6 = this.zzm;
                    this.zzd.zza(j5, i12, this.zze);
                    if (!this.zze) {
                        this.zzg.zzd(i13);
                        this.zzh.zzd(i13);
                        this.zzi.zzd(i13);
                        zzagp zzagpVar = this.zzg;
                        if (zzagpVar.zze()) {
                            zzagp zzagpVar2 = this.zzh;
                            if (zzagpVar2.zze()) {
                                zzagp zzagpVar3 = this.zzi;
                                if (zzagpVar3.zze()) {
                                    zzzy zzzyVar = this.zzc;
                                    i2 = i9;
                                    String str = this.zzb;
                                    int i14 = zzagpVar.zzb;
                                    i = zzd;
                                    bArr = zzH;
                                    byte[] bArr2 = new byte[zzagpVar2.zzb + i14 + zzagpVar3.zzb];
                                    i3 = i10;
                                    System.arraycopy(zzagpVar.zza, 0, bArr2, 0, i14);
                                    i4 = i12;
                                    System.arraycopy(zzagpVar2.zza, 0, bArr2, zzagpVar.zzb, zzagpVar2.zzb);
                                    System.arraycopy(zzagpVar3.zza, 0, bArr2, zzagpVar.zzb + zzagpVar2.zzb, zzagpVar3.zzb);
                                    zzzq zzzqVar = new zzzq(zzagpVar2.zza, 0, zzagpVar2.zzb);
                                    zzzqVar.zze(44);
                                    int zza2 = zzzqVar.zza(3);
                                    zzzqVar.zzd();
                                    int zza3 = zzzqVar.zza(2);
                                    boolean zzf = zzzqVar.zzf();
                                    int zza4 = zzzqVar.zza(5);
                                    int i15 = 0;
                                    for (int i16 = 0; i16 < 32; i16++) {
                                        if (zzzqVar.zzf()) {
                                            i15 |= 1 << i16;
                                        }
                                    }
                                    int[] iArr = new int[6];
                                    for (int i17 = 0; i17 < 6; i17++) {
                                        iArr[i17] = zzzqVar.zza(8);
                                    }
                                    int zza5 = zzzqVar.zza(8);
                                    int i18 = 0;
                                    for (int i19 = 0; i19 < zza2; i19++) {
                                        if (zzzqVar.zzf()) {
                                            i18 += 89;
                                        }
                                        if (zzzqVar.zzf()) {
                                            i18 += 8;
                                        }
                                    }
                                    zzzqVar.zze(i18);
                                    if (zza2 > 0) {
                                        int i20 = 8 - zza2;
                                        zzzqVar.zze(i20 + i20);
                                    }
                                    zzzqVar.zzc();
                                    int zzc2 = zzzqVar.zzc();
                                    if (zzc2 == 3) {
                                        zzzqVar.zzd();
                                        zzc2 = 3;
                                    }
                                    int zzc3 = zzzqVar.zzc();
                                    int zzc4 = zzzqVar.zzc();
                                    if (zzzqVar.zzf()) {
                                        int zzc5 = zzzqVar.zzc();
                                        int zzc6 = zzzqVar.zzc();
                                        int zzc7 = zzzqVar.zzc();
                                        int zzc8 = zzzqVar.zzc();
                                        if (zzc2 == 1) {
                                            j = j5;
                                            i7 = 2;
                                        } else if (zzc2 == 2) {
                                            j = j5;
                                            i7 = 2;
                                            zzc2 = 2;
                                        } else {
                                            j = j5;
                                            i7 = 1;
                                        }
                                        zzc3 -= (zzc5 + zzc6) * i7;
                                        zzc4 -= (zzc7 + zzc8) * (zzc2 == 1 ? 2 : 1);
                                    } else {
                                        j = j5;
                                    }
                                    zzzqVar.zzc();
                                    zzzqVar.zzc();
                                    int zzc9 = zzzqVar.zzc();
                                    for (int i21 = true != zzzqVar.zzf() ? zza2 : 0; i21 <= zza2; i21++) {
                                        zzzqVar.zzc();
                                        zzzqVar.zzc();
                                        zzzqVar.zzc();
                                    }
                                    zzzqVar.zzc();
                                    zzzqVar.zzc();
                                    zzzqVar.zzc();
                                    zzzqVar.zzc();
                                    zzzqVar.zzc();
                                    zzzqVar.zzc();
                                    if (zzzqVar.zzf() && zzzqVar.zzf()) {
                                        int i22 = 0;
                                        for (int i23 = 4; i22 < i23; i23 = 4) {
                                            int i24 = 0;
                                            while (i24 < 6) {
                                                if (!zzzqVar.zzf()) {
                                                    zzzqVar.zzc();
                                                    j4 = j6;
                                                } else {
                                                    j4 = j6;
                                                    int min = Math.min(64, 1 << ((i22 + i22) + 4));
                                                    if (i22 > 1) {
                                                        zzzqVar.zzb();
                                                    }
                                                    for (int i25 = 0; i25 < min; i25++) {
                                                        zzzqVar.zzb();
                                                    }
                                                }
                                                i24 += i22 == 3 ? 3 : 1;
                                                j6 = j4;
                                            }
                                            i22++;
                                        }
                                    }
                                    j2 = j6;
                                    zzzqVar.zze(2);
                                    if (zzzqVar.zzf()) {
                                        zzzqVar.zze(8);
                                        zzzqVar.zzc();
                                        zzzqVar.zzc();
                                        zzzqVar.zzd();
                                    }
                                    int zzc10 = zzzqVar.zzc();
                                    int i26 = 0;
                                    boolean z = false;
                                    int i27 = 0;
                                    while (i26 < zzc10) {
                                        if (i26 != 0) {
                                            z = zzzqVar.zzf();
                                        }
                                        if (z) {
                                            zzzqVar.zzd();
                                            zzzqVar.zzc();
                                            for (int i28 = 0; i28 <= i27; i28++) {
                                                if (zzzqVar.zzf()) {
                                                    zzzqVar.zzd();
                                                }
                                            }
                                            i6 = zzc10;
                                        } else {
                                            int zzc11 = zzzqVar.zzc();
                                            int zzc12 = zzzqVar.zzc();
                                            int i29 = zzc11 + zzc12;
                                            i6 = zzc10;
                                            for (int i30 = 0; i30 < zzc11; i30++) {
                                                zzzqVar.zzc();
                                                zzzqVar.zzd();
                                            }
                                            for (int i31 = 0; i31 < zzc12; i31++) {
                                                zzzqVar.zzc();
                                                zzzqVar.zzd();
                                            }
                                            i27 = i29;
                                        }
                                        i26++;
                                        zzc10 = i6;
                                    }
                                    if (zzzqVar.zzf()) {
                                        for (int i32 = 0; i32 < zzzqVar.zzc(); i32++) {
                                            zzzqVar.zze(zzc9 + 5);
                                        }
                                    }
                                    zzzqVar.zze(2);
                                    float f = 1.0f;
                                    if (zzzqVar.zzf()) {
                                        if (zzzqVar.zzf()) {
                                            int zza6 = zzzqVar.zza(8);
                                            if (zza6 == 255) {
                                                int zza7 = zzzqVar.zza(16);
                                                int zza8 = zzzqVar.zza(16);
                                                if (zza7 != 0 && zza8 != 0) {
                                                    f = zza7 / zza8;
                                                }
                                            } else if (zza6 < 17) {
                                                f = zzzo.zzb[zza6];
                                            }
                                        }
                                        if (zzzqVar.zzf()) {
                                            zzzqVar.zzd();
                                        }
                                        if (zzzqVar.zzf()) {
                                            zzzqVar.zze(4);
                                            if (zzzqVar.zzf()) {
                                                zzzqVar.zze(24);
                                            }
                                        }
                                        if (zzzqVar.zzf()) {
                                            zzzqVar.zzc();
                                            zzzqVar.zzc();
                                        }
                                        zzzqVar.zzd();
                                        if (zzzqVar.zzf()) {
                                            zzc4 += zzc4;
                                        }
                                    }
                                    String zzb = zzcy.zzb(zza3, zzf, zza4, i15, iArr, zza5);
                                    zzab zzabVar = new zzab();
                                    zzabVar.zzH(str);
                                    zzabVar.zzS("video/hevc");
                                    zzabVar.zzx(zzb);
                                    zzabVar.zzX(zzc3);
                                    zzabVar.zzF(zzc4);
                                    zzabVar.zzP(f);
                                    zzabVar.zzI(Collections.singletonList(bArr2));
                                    zzzyVar.zzk(zzabVar.zzY());
                                    this.zze = true;
                                    if (this.zzj.zzd(i13)) {
                                        j3 = j2;
                                    } else {
                                        zzagp zzagpVar4 = this.zzj;
                                        this.zzn.zzD(this.zzj.zza, zzzo.zzb(zzagpVar4.zza, zzagpVar4.zzb));
                                        this.zzn.zzG(5);
                                        j3 = j2;
                                        this.zza.zza(j3, this.zzn);
                                    }
                                    if (this.zzk.zzd(i13)) {
                                        zzagp zzagpVar5 = this.zzk;
                                        this.zzn.zzD(this.zzk.zza, zzzo.zzb(zzagpVar5.zza, zzagpVar5.zzb));
                                        this.zzn.zzG(5);
                                        this.zza.zza(j3, this.zzn);
                                    }
                                    this.zzd.zzd(j, i4, i3, this.zzm, this.zze);
                                    if (this.zze) {
                                        i5 = i3;
                                        this.zzg.zzc(i5);
                                        this.zzh.zzc(i5);
                                        this.zzi.zzc(i5);
                                    } else {
                                        i5 = i3;
                                    }
                                    this.zzj.zzc(i5);
                                    this.zzk.zzc(i5);
                                    zzc = i2;
                                    zzd = i;
                                    zzH = bArr;
                                }
                            }
                        }
                    }
                    i = zzd;
                    bArr = zzH;
                    i2 = i9;
                    i3 = i10;
                    j = j5;
                    i4 = i12;
                    j2 = j6;
                    if (this.zzj.zzd(i13)) {
                    }
                    if (this.zzk.zzd(i13)) {
                    }
                    this.zzd.zzd(j, i4, i3, this.zzm, this.zze);
                    if (this.zze) {
                    }
                    this.zzj.zzc(i5);
                    this.zzk.zzc(i5);
                    zzc = i2;
                    zzd = i;
                    zzH = bArr;
                } else {
                    zzf(zzH, zzc, zzd);
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzb = zzahmVar.zzb();
        zzzy zzv = zzyuVar.zzv(zzahmVar.zza(), 2);
        this.zzc = zzv;
        this.zzd = new zzagk(zzv);
        this.zza.zzb(zzyuVar, zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzm = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzzo.zze(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzagk zzagkVar = this.zzd;
        if (zzagkVar != null) {
            zzagkVar.zzc();
        }
    }
}