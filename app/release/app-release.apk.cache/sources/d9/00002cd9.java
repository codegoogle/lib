package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgk implements zzjt, zzju {
    private final int zza;
    @z1
    private zzjv zzc;
    private int zzd;
    private zzmu zze;
    private int zzf;
    @z1
    private zztq zzg;
    @z1
    private zzad[] zzh;
    private long zzi;
    private boolean zzk;
    private boolean zzl;
    private final zziz zzb = new zziz();
    private long zzj = Long.MIN_VALUE;

    public zzgk(int i) {
        this.zza = i;
    }

    private final void zzP(long j, boolean z) throws zzgt {
        this.zzk = false;
        this.zzj = j;
        zzu(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzA() {
        zzcw.zzf(this.zzf == 0);
        zziz zzizVar = this.zzb;
        zzizVar.zzb = null;
        zzizVar.zza = null;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzB(long j) throws zzgt {
        zzP(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzC() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public /* synthetic */ void zzD(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzE() throws zzgt {
        zzcw.zzf(this.zzf == 1);
        this.zzf = 2;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzF() {
        zzcw.zzf(this.zzf == 2);
        this.zzf = 1;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final boolean zzG() {
        return this.zzj == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final boolean zzH() {
        return this.zzk;
    }

    public final boolean zzI() {
        if (zzG()) {
            return this.zzk;
        }
        zztq zztqVar = this.zzg;
        Objects.requireNonNull(zztqVar);
        return zztqVar.zze();
    }

    public final zzad[] zzJ() {
        zzad[] zzadVarArr = this.zzh;
        Objects.requireNonNull(zzadVarArr);
        return zzadVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzjt, com.google.android.gms.internal.ads.zzju
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final int zzbe() {
        return this.zzf;
    }

    public final int zzbf(zziz zzizVar, zzgb zzgbVar, int i) {
        zztq zztqVar = this.zzg;
        Objects.requireNonNull(zztqVar);
        int zza = zztqVar.zza(zzizVar, zzgbVar, i);
        if (zza == -4) {
            if (zzgbVar.zzg()) {
                this.zzj = Long.MIN_VALUE;
                return this.zzk ? -4 : -3;
            }
            long j = zzgbVar.zzd + this.zzi;
            zzgbVar.zzd = j;
            this.zzj = Math.max(this.zzj, j);
        } else if (zza == -5) {
            zzad zzadVar = zzizVar.zza;
            Objects.requireNonNull(zzadVar);
            long j2 = zzadVar.zzq;
            if (j2 != Long.MAX_VALUE) {
                zzab zzb = zzadVar.zzb();
                zzb.zzW(j2 + this.zzi);
                zzizVar.zza = zzb.zzY();
                return -5;
            }
        }
        return zza;
    }

    public final zzgt zzbg(Throwable th, @z1 zzad zzadVar, boolean z, int i) {
        int i2;
        if (zzadVar != null && !this.zzl) {
            this.zzl = true;
            try {
                int zzO = zzO(zzadVar) & 7;
                this.zzl = false;
                i2 = zzO;
            } catch (zzgt unused) {
                this.zzl = false;
            } catch (Throwable th2) {
                this.zzl = false;
                throw th2;
            }
            return zzgt.zzb(th, zzK(), this.zzd, zzadVar, i2, z, i);
        }
        i2 = 4;
        return zzgt.zzb(th, zzK(), this.zzd, zzadVar, i2, z, i);
    }

    public final int zzd(long j) {
        zztq zztqVar = this.zzg;
        Objects.requireNonNull(zztqVar);
        return zztqVar.zzb(j - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public int zze() throws zzgt {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final long zzf() {
        return this.zzj;
    }

    public final zziz zzh() {
        zziz zzizVar = this.zzb;
        zzizVar.zzb = null;
        zzizVar.zza = null;
        return zzizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    @z1
    public zzjb zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final zzju zzj() {
        return this;
    }

    public final zzjv zzk() {
        zzjv zzjvVar = this.zzc;
        Objects.requireNonNull(zzjvVar);
        return zzjvVar;
    }

    public final zzmu zzl() {
        zzmu zzmuVar = this.zze;
        Objects.requireNonNull(zzmuVar);
        return zzmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    @z1
    public final zztq zzm() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzn() {
        zzcw.zzf(this.zzf == 1);
        zziz zzizVar = this.zzb;
        zzizVar.zzb = null;
        zzizVar.zza = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = null;
        this.zzk = false;
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzo(zzjv zzjvVar, zzad[] zzadVarArr, zztq zztqVar, long j, boolean z, boolean z2, long j2, long j3) throws zzgt {
        zzcw.zzf(this.zzf == 0);
        this.zzc = zzjvVar;
        this.zzf = 1;
        zzt(z, z2);
        zzz(zzadVarArr, zztqVar, j2, j3);
        zzP(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public void zzp(int i, @z1 Object obj) throws zzgt {
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzq(int i, zzmu zzmuVar) {
        this.zzd = i;
        this.zze = zzmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzr() throws IOException {
        zztq zztqVar = this.zzg;
        Objects.requireNonNull(zztqVar);
        zztqVar.zzd();
    }

    public void zzs() {
        throw null;
    }

    public void zzt(boolean z, boolean z2) throws zzgt {
    }

    public void zzu(long j, boolean z) throws zzgt {
        throw null;
    }

    public void zzv() {
    }

    public void zzw() throws zzgt {
    }

    public void zzx() {
    }

    public void zzy(zzad[] zzadVarArr, long j, long j2) throws zzgt {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzz(zzad[] zzadVarArr, zztq zztqVar, long j, long j2) throws zzgt {
        zzcw.zzf(!this.zzk);
        this.zzg = zztqVar;
        if (this.zzj == Long.MIN_VALUE) {
            this.zzj = j;
        }
        this.zzh = zzadVarArr;
        this.zzi = j2;
        zzy(zzadVarArr, j, j2);
    }
}