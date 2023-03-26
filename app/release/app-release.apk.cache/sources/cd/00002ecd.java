package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.p7700g.p99005.z1;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzrv extends zzrj {
    private final zzsc zza;
    private final boolean zzb;
    private final zzch zzc;
    private final zzcf zzd;
    private zzrt zze;
    @z1
    private zzrs zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzrv(zzsc zzscVar, boolean z) {
        boolean z2;
        this.zza = zzscVar;
        if (z) {
            zzscVar.zzu();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzch();
        this.zzd = new zzcf();
        zzscVar.zzG();
        this.zze = zzrt.zzq(zzscVar.zzz());
    }

    private final Object zzE(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zzf;
        if (obj2 == null || !obj.equals(zzrt.zzd)) {
            return obj;
        }
        obj3 = this.zze.zzf;
        return obj3;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzF(long j) {
        zzrs zzrsVar = this.zzf;
        int zza = this.zze.zza(zzrsVar.zza.zza);
        if (zza == -1) {
            return;
        }
        zzrt zzrtVar = this.zze;
        zzcf zzcfVar = this.zzd;
        zzrtVar.zzd(zza, zzcfVar, false);
        long j2 = zzcfVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzrsVar.zzs(j);
    }

    public final zzci zzA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzB(zzry zzryVar) {
        ((zzrs) zzryVar).zzt();
        if (zzryVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    /* renamed from: zzC */
    public final zzrs zzD(zzsa zzsaVar, zzvv zzvvVar, long j) {
        zzrs zzrsVar = new zzrs(zzsaVar, zzvvVar, j, null);
        zzrsVar.zzu(this.zza);
        if (this.zzh) {
            zzrsVar.zzr(zzsaVar.zzc(zzE(zzsaVar.zza)));
        } else {
            this.zzf = zzrsVar;
            if (!this.zzg) {
                this.zzg = true;
                zzy(null, this.zza);
            }
        }
        return zzrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj, com.google.android.gms.internal.ads.zzrb
    public final void zzn(@z1 zzfs zzfsVar) {
        super.zzn(zzfsVar);
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzy(null, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzrj, com.google.android.gms.internal.ads.zzrb
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    @z1
    public final /* bridge */ /* synthetic */ zzsa zzv(Object obj, zzsa zzsaVar) {
        Object obj2;
        Object obj3;
        Void r2 = (Void) obj;
        Object obj4 = zzsaVar.zza;
        obj2 = this.zze.zzf;
        if (obj2 != null) {
            obj3 = this.zze.zzf;
            if (obj3.equals(obj4)) {
                obj4 = zzrt.zzd;
            }
        }
        return zzsaVar.zzc(obj4);
    }

    @Override // com.google.android.gms.internal.ads.zzrj, com.google.android.gms.internal.ads.zzsc
    public final void zzw() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    @Override // com.google.android.gms.internal.ads.zzrj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzx(Object obj, zzsc zzscVar, zzci zzciVar) {
        long j;
        zzrt zzr;
        zzrs zzrsVar;
        zzrt zzr2;
        Void r13 = (Void) obj;
        zzsa zzsaVar = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzciVar);
            zzrs zzrsVar2 = this.zzf;
            if (zzrsVar2 != null) {
                zzF(zzrsVar2.zzn());
            }
        } else if (zzciVar.zzo()) {
            if (this.zzi) {
                zzr2 = this.zze.zzp(zzciVar);
            } else {
                zzr2 = zzrt.zzr(zzciVar, zzch.zza, zzrt.zzd);
            }
            this.zze = zzr2;
        } else {
            zzciVar.zze(0, this.zzc, 0L);
            Object obj2 = this.zzc.zzc;
            zzrs zzrsVar3 = this.zzf;
            if (zzrsVar3 != null) {
                long zzq = zzrsVar3.zzq();
                this.zze.zzn(zzrsVar3.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                if (zzq != 0) {
                    j = zzq;
                    Pair zzl = zzciVar.zzl(this.zzc, this.zzd, 0, j);
                    Object obj3 = zzl.first;
                    long longValue = ((Long) zzl.second).longValue();
                    if (!this.zzi) {
                        zzr = this.zze.zzp(zzciVar);
                    } else {
                        zzr = zzrt.zzr(zzciVar, obj2, obj3);
                    }
                    this.zze = zzr;
                    zzrsVar = this.zzf;
                    if (zzrsVar != null) {
                        zzF(longValue);
                        zzsa zzsaVar2 = zzrsVar.zza;
                        zzsaVar = zzsaVar2.zzc(zzE(zzsaVar2.zza));
                    }
                }
            }
            j = 0;
            Pair zzl2 = zzciVar.zzl(this.zzc, this.zzd, 0, j);
            Object obj32 = zzl2.first;
            long longValue2 = ((Long) zzl2.second).longValue();
            if (!this.zzi) {
            }
            this.zze = zzr;
            zzrsVar = this.zzf;
            if (zzrsVar != null) {
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zzsaVar != null) {
            zzrs zzrsVar4 = this.zzf;
            Objects.requireNonNull(zzrsVar4);
            zzrsVar4.zzr(zzsaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final zzbb zzz() {
        return this.zza.zzz();
    }
}