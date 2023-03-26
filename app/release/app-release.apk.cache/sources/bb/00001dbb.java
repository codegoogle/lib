package com.google.android.gms.internal.ads;

import com.p7700g.p99005.g15;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaxk implements zzauf {
    private zzaxi zze;
    private zzaxi zzf;
    private zzart zzg;
    private zzart zzh;
    private long zzi;
    private zzaxj zzk;
    private final zzaym zzl;
    private final zzaxh zza = new zzaxh();
    private final zzaxg zzb = new zzaxg();
    private final zzazh zzc = new zzazh(32);
    private final AtomicInteger zzd = new AtomicInteger();
    private int zzj = 65536;

    public zzaxk(zzaym zzaymVar, byte[] bArr) {
        this.zzl = zzaymVar;
        zzaxi zzaxiVar = new zzaxi(0L, 65536);
        this.zze = zzaxiVar;
        this.zzf = zzaxiVar;
    }

    private final int zzo(int i) {
        if (this.zzj == 65536) {
            this.zzj = 0;
            zzaxi zzaxiVar = this.zzf;
            if (zzaxiVar.zzc) {
                this.zzf = zzaxiVar.zze;
            }
            zzaxi zzaxiVar2 = this.zzf;
            zzayg zzb = this.zzl.zzb();
            zzaxi zzaxiVar3 = new zzaxi(this.zzf.zzb, 65536);
            zzaxiVar2.zzd = zzb;
            zzaxiVar2.zze = zzaxiVar3;
            zzaxiVar2.zzc = true;
        }
        return Math.min(i, 65536 - this.zzj);
    }

    private final void zzp() {
        this.zza.zzg();
        zzaxi zzaxiVar = this.zze;
        if (zzaxiVar.zzc) {
            zzaxi zzaxiVar2 = this.zzf;
            int i = (((int) (zzaxiVar2.zza - zzaxiVar.zza)) / 65536) + (zzaxiVar2.zzc ? 1 : 0);
            zzayg[] zzaygVarArr = new zzayg[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzaygVarArr[i2] = zzaxiVar.zzd;
                zzaxiVar.zzd = null;
                zzaxiVar = zzaxiVar.zze;
            }
            this.zzl.zzd(zzaygVarArr);
        }
        zzaxi zzaxiVar3 = new zzaxi(0L, 65536);
        this.zze = zzaxiVar3;
        this.zzf = zzaxiVar3;
        this.zzi = 0L;
        this.zzj = 65536;
        this.zzl.zzg();
    }

    private final void zzq(long j) {
        while (true) {
            zzaxi zzaxiVar = this.zze;
            if (j < zzaxiVar.zzb) {
                return;
            }
            this.zzl.zzc(zzaxiVar.zzd);
            zzaxi zzaxiVar2 = this.zze;
            zzaxiVar2.zzd = null;
            this.zze = zzaxiVar2.zze;
        }
    }

    private final void zzr() {
        if (this.zzd.compareAndSet(1, 0)) {
            return;
        }
        zzp();
    }

    private final void zzs(long j, byte[] bArr, int i) {
        zzq(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zze.zza);
            int min = Math.min(i - i2, 65536 - i3);
            zzayg zzaygVar = this.zze.zzd;
            System.arraycopy(zzaygVar.zza, i3, bArr, i2, min);
            j += min;
            i2 += min;
            if (j == this.zze.zzb) {
                this.zzl.zzc(zzaygVar);
                zzaxi zzaxiVar = this.zze;
                zzaxiVar.zzd = null;
                this.zze = zzaxiVar.zze;
            }
        }
    }

    private final boolean zzt() {
        return this.zzd.compareAndSet(0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zza(zzart zzartVar) {
        zzart zzartVar2 = zzartVar == null ? null : zzartVar;
        boolean zzk = this.zza.zzk(zzartVar2);
        this.zzh = zzartVar;
        zzaxj zzaxjVar = this.zzk;
        if (zzaxjVar == null || !zzk) {
            return;
        }
        zzaxjVar.zzv(zzartVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zzb(zzazh zzazhVar, int i) {
        if (zzt()) {
            while (i > 0) {
                int zzo = zzo(i);
                zzazhVar.zzq(this.zzf.zzd.zza, this.zzj, zzo);
                this.zzj += zzo;
                this.zzi += zzo;
                i -= zzo;
            }
            zzr();
            return;
        }
        zzazhVar.zzw(i);
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zzc(long j, int i, int i2, int i3, zzaue zzaueVar) {
        if (zzt()) {
            try {
                this.zza.zzh(j, i, this.zzi - i2, i2, zzaueVar);
                return;
            } finally {
                zzr();
            }
        }
        this.zza.zzi(j);
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final int zzd(zzatv zzatvVar, int i, boolean z) throws IOException, InterruptedException {
        if (!zzt()) {
            int zzb = zzatvVar.zzb(i);
            if (zzb != -1) {
                return zzb;
            }
            throw new EOFException();
        }
        try {
            int zza = zzatvVar.zza(this.zzf.zzd.zza, this.zzj, zzo(i));
            if (zza != -1) {
                this.zzj += zza;
                this.zzi += zza;
                return zza;
            }
            throw new EOFException();
        } finally {
            zzr();
        }
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final int zzf(zzaru zzaruVar, zzato zzatoVar, boolean z, boolean z2, long j) {
        int i;
        int zzb = this.zza.zzb(zzaruVar, zzatoVar, z, z2, this.zzg, this.zzb);
        if (zzb == -5) {
            this.zzg = zzaruVar.zza;
            return -5;
        } else if (zzb != -4) {
            return -3;
        } else {
            if (!zzatoVar.zzf()) {
                if (zzatoVar.zzc < j) {
                    zzatoVar.zza(Integer.MIN_VALUE);
                }
                if (zzatoVar.zzi()) {
                    zzaxg zzaxgVar = this.zzb;
                    long j2 = zzaxgVar.zzb;
                    this.zzc.zzs(1);
                    zzs(j2, this.zzc.zza, 1);
                    long j3 = j2 + 1;
                    byte b = this.zzc.zza[0];
                    int i2 = b & g15.b;
                    int i3 = b & g15.c;
                    zzatm zzatmVar = zzatoVar.zza;
                    if (zzatmVar.zza == null) {
                        zzatmVar.zza = new byte[16];
                    }
                    zzs(j3, zzatmVar.zza, i3);
                    long j4 = j3 + i3;
                    if (i2 != 0) {
                        this.zzc.zzs(2);
                        zzs(j4, this.zzc.zza, 2);
                        j4 += 2;
                        i = this.zzc.zzj();
                    } else {
                        i = 1;
                    }
                    zzatm zzatmVar2 = zzatoVar.zza;
                    int[] iArr = zzatmVar2.zzd;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzatmVar2.zze;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (i2 != 0) {
                        int i4 = i * 6;
                        this.zzc.zzs(i4);
                        zzs(j4, this.zzc.zza, i4);
                        j4 += i4;
                        this.zzc.zzv(0);
                        for (int i5 = 0; i5 < i; i5++) {
                            iArr2[i5] = this.zzc.zzj();
                            iArr4[i5] = this.zzc.zzi();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzaxgVar.zza - ((int) (j4 - zzaxgVar.zzb));
                    }
                    zzaue zzaueVar = zzaxgVar.zzd;
                    zzatm zzatmVar3 = zzatoVar.zza;
                    zzatmVar3.zzb(i, iArr2, iArr4, zzaueVar.zzb, zzatmVar3.zza, 1);
                    long j5 = zzaxgVar.zzb;
                    int i6 = (int) (j4 - j5);
                    zzaxgVar.zzb = j5 + i6;
                    zzaxgVar.zza -= i6;
                }
                zzatoVar.zzh(this.zzb.zza);
                zzaxg zzaxgVar2 = this.zzb;
                long j6 = zzaxgVar2.zzb;
                ByteBuffer byteBuffer = zzatoVar.zzb;
                int i7 = zzaxgVar2.zza;
                zzq(j6);
                while (i7 > 0) {
                    int i8 = (int) (j6 - this.zze.zza);
                    int min = Math.min(i7, 65536 - i8);
                    zzayg zzaygVar = this.zze.zzd;
                    byteBuffer.put(zzaygVar.zza, i8, min);
                    j6 += min;
                    i7 -= min;
                    if (j6 == this.zze.zzb) {
                        this.zzl.zzc(zzaygVar);
                        zzaxi zzaxiVar = this.zze;
                        zzaxiVar.zzd = null;
                        this.zze = zzaxiVar.zze;
                    }
                }
                zzq(this.zzb.zzc);
            }
            return -4;
        }
    }

    public final long zzg() {
        return this.zza.zzc();
    }

    public final zzart zzh() {
        return this.zza.zzf();
    }

    public final void zzi() {
        if (this.zzd.getAndSet(2) == 0) {
            zzp();
        }
    }

    public final void zzj(boolean z) {
        int andSet = this.zzd.getAndSet(true != z ? 2 : 0);
        zzp();
        this.zza.zzj();
        if (andSet == 2) {
            this.zzg = null;
        }
    }

    public final void zzk(zzaxj zzaxjVar) {
        this.zzk = zzaxjVar;
    }

    public final void zzl() {
        long zzd = this.zza.zzd();
        if (zzd != -1) {
            zzq(zzd);
        }
    }

    public final boolean zzm() {
        return this.zza.zzl();
    }

    public final boolean zzn(long j, boolean z) {
        long zze = this.zza.zze(j, z);
        if (zze == -1) {
            return false;
        }
        zzq(zze);
        return true;
    }
}