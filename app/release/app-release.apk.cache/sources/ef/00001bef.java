package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagj implements zzaga {
    private final zzahb zza;
    private long zze;
    private String zzg;
    private zzzy zzh;
    private zzagi zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzagp zzb = new zzagp(7, 128);
    private final zzagp zzc = new zzagp(8, 128);
    private final zzagp zzd = new zzagp(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzdy zzm = new zzdy();

    public zzagj(zzahb zzahbVar, boolean z, boolean z2) {
        this.zza = zzahbVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i2);
            this.zzc.zza(bArr, i, i2);
        }
        this.zzd.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0181 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzdy zzdyVar) {
        int i;
        int i2;
        zzcw.zzb(this.zzh);
        int i3 = zzeg.zza;
        int zzc = zzdyVar.zzc();
        int zzd = zzdyVar.zzd();
        byte[] zzH = zzdyVar.zzH();
        this.zze += zzdyVar.zza();
        zzzw.zzb(this.zzh, zzdyVar, zzdyVar.zza());
        while (true) {
            int zza = zzzo.zza(zzH, zzc, zzd, this.zzf);
            if (zza != zzd) {
                int i4 = zza + 3;
                int i5 = zzH[i4] & 31;
                int i6 = zza - zzc;
                if (i6 > 0) {
                    zzf(zzH, zzc, zza);
                }
                int i7 = zzd - zza;
                long j = this.zze - i7;
                int i8 = i6 < 0 ? -i6 : 0;
                long j2 = this.zzk;
                if (!this.zzj) {
                    this.zzb.zzd(i8);
                    this.zzc.zzd(i8);
                    if (this.zzj) {
                        i = zzd;
                        i2 = i4;
                        zzagp zzagpVar = this.zzb;
                        if (zzagpVar.zze()) {
                            this.zzi.zzb(zzzo.zzd(zzagpVar.zza, 4, zzagpVar.zzb));
                            this.zzb.zzb();
                        } else {
                            zzagp zzagpVar2 = this.zzc;
                            if (zzagpVar2.zze()) {
                                this.zzi.zza(zzzo.zzc(zzagpVar2.zza, 4, zzagpVar2.zzb));
                                this.zzc.zzb();
                            }
                        }
                    } else if (this.zzb.zze() && this.zzc.zze()) {
                        ArrayList arrayList = new ArrayList();
                        zzagp zzagpVar3 = this.zzb;
                        arrayList.add(Arrays.copyOf(zzagpVar3.zza, zzagpVar3.zzb));
                        zzagp zzagpVar4 = this.zzc;
                        arrayList.add(Arrays.copyOf(zzagpVar4.zza, zzagpVar4.zzb));
                        zzagp zzagpVar5 = this.zzb;
                        zzzn zzd2 = zzzo.zzd(zzagpVar5.zza, 4, zzagpVar5.zzb);
                        zzagp zzagpVar6 = this.zzc;
                        zzzm zzc2 = zzzo.zzc(zzagpVar6.zza, 4, zzagpVar6.zzb);
                        i2 = i4;
                        String zza2 = zzcy.zza(zzd2.zza, zzd2.zzb, zzd2.zzc);
                        zzzy zzzyVar = this.zzh;
                        zzab zzabVar = new zzab();
                        i = zzd;
                        zzabVar.zzH(this.zzg);
                        zzabVar.zzS("video/avc");
                        zzabVar.zzx(zza2);
                        zzabVar.zzX(zzd2.zze);
                        zzabVar.zzF(zzd2.zzf);
                        zzabVar.zzP(zzd2.zzg);
                        zzabVar.zzI(arrayList);
                        zzzyVar.zzk(zzabVar.zzY());
                        this.zzj = true;
                        this.zzi.zzb(zzd2);
                        this.zzi.zza(zzc2);
                        this.zzb.zzb();
                        this.zzc.zzb();
                    }
                    if (this.zzd.zzd(i8)) {
                        zzagp zzagpVar7 = this.zzd;
                        this.zzm.zzD(this.zzd.zza, zzzo.zzb(zzagpVar7.zza, zzagpVar7.zzb));
                        this.zzm.zzF(4);
                        this.zza.zza(j2, this.zzm);
                    }
                    if (this.zzi.zze(j, i7, this.zzj, this.zzl)) {
                        this.zzl = false;
                    }
                    long j3 = this.zzk;
                    if (this.zzj) {
                        this.zzb.zzc(i5);
                        this.zzc.zzc(i5);
                    }
                    this.zzd.zzc(i5);
                    this.zzi.zzd(j, i5, j3);
                    zzc = i2;
                    zzd = i;
                }
                i = zzd;
                i2 = i4;
                if (this.zzd.zzd(i8)) {
                }
                if (this.zzi.zze(j, i7, this.zzj, this.zzl)) {
                }
                long j32 = this.zzk;
                if (this.zzj) {
                }
                this.zzd.zzc(i5);
                this.zzi.zzd(j, i5, j32);
                zzc = i2;
                zzd = i;
            } else {
                zzf(zzH, zzc, zzd);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzg = zzahmVar.zzb();
        zzzy zzv = zzyuVar.zzv(zzahmVar.zza(), 2);
        this.zzh = zzv;
        this.zzi = new zzagi(zzv, false, false);
        this.zza.zzb(zzyuVar, zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
        this.zzl |= (i & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzzo.zze(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzagi zzagiVar = this.zzi;
        if (zzagiVar != null) {
            zzagiVar.zzc();
        }
    }
}