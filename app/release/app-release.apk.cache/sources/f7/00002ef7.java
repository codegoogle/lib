package com.google.android.gms.internal.ads;

import com.p7700g.p99005.g15;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zztj {
    private final zzdy zza = new zzdy(32);
    private zzti zzb;
    private zzti zzc;
    private zzti zzd;
    private long zze;
    private final zzvv zzf;

    public zztj(zzvv zzvvVar, byte[] bArr) {
        this.zzf = zzvvVar;
        zzti zztiVar = new zzti(0L, 65536);
        this.zzb = zztiVar;
        this.zzc = zztiVar;
        this.zzd = zztiVar;
    }

    private final int zzi(int i) {
        zzti zztiVar = this.zzd;
        if (zztiVar.zzc == null) {
            zzvo zzb = this.zzf.zzb();
            zzti zztiVar2 = new zzti(this.zzd.zzb, 65536);
            zztiVar.zzc = zzb;
            zztiVar.zzd = zztiVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzti zzj(zzti zztiVar, long j) {
        while (j >= zztiVar.zzb) {
            zztiVar = zztiVar.zzd;
        }
        return zztiVar;
    }

    private static zzti zzk(zzti zztiVar, long j, ByteBuffer byteBuffer, int i) {
        zzti zzj = zzj(zztiVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzti zzl(zzti zztiVar, long j, byte[] bArr, int i) {
        zzti zzj = zzj(zztiVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzti zzm(zzti zztiVar, zzgb zzgbVar, zztl zztlVar, zzdy zzdyVar) {
        zzti zztiVar2;
        int i;
        if (zzgbVar.zzk()) {
            long j = zztlVar.zzb;
            zzdyVar.zzC(1);
            zzti zzl = zzl(zztiVar, j, zzdyVar.zzH(), 1);
            long j2 = j + 1;
            byte b = zzdyVar.zzH()[0];
            int i2 = b & g15.b;
            int i3 = b & g15.c;
            zzfy zzfyVar = zzgbVar.zza;
            byte[] bArr = zzfyVar.zza;
            if (bArr == null) {
                zzfyVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zztiVar2 = zzl(zzl, j2, zzfyVar.zza, i3);
            long j3 = j2 + i3;
            if (i2 != 0) {
                zzdyVar.zzC(2);
                zztiVar2 = zzl(zztiVar2, j3, zzdyVar.zzH(), 2);
                j3 += 2;
                i = zzdyVar.zzo();
            } else {
                i = 1;
            }
            int[] iArr = zzfyVar.zzd;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzfyVar.zze;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (i2 != 0) {
                int i4 = i * 6;
                zzdyVar.zzC(i4);
                zztiVar2 = zzl(zztiVar2, j3, zzdyVar.zzH(), i4);
                j3 += i4;
                zzdyVar.zzF(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr2[i5] = zzdyVar.zzo();
                    iArr4[i5] = zzdyVar.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zztlVar.zza - ((int) (j3 - zztlVar.zzb));
            }
            zzzx zzzxVar = zztlVar.zzc;
            int i6 = zzeg.zza;
            zzfyVar.zzc(i, iArr2, iArr4, zzzxVar.zzb, zzfyVar.zza, zzzxVar.zza, zzzxVar.zzc, zzzxVar.zzd);
            long j4 = zztlVar.zzb;
            int i7 = (int) (j3 - j4);
            zztlVar.zzb = j4 + i7;
            zztlVar.zza -= i7;
        } else {
            zztiVar2 = zztiVar;
        }
        if (zzgbVar.zze()) {
            zzdyVar.zzC(4);
            zzti zzl2 = zzl(zztiVar2, zztlVar.zzb, zzdyVar.zzH(), 4);
            int zzn = zzdyVar.zzn();
            zztlVar.zzb += 4;
            zztlVar.zza -= 4;
            zzgbVar.zzi(zzn);
            zzti zzk = zzk(zzl2, zztlVar.zzb, zzgbVar.zzb, zzn);
            zztlVar.zzb += zzn;
            int i8 = zztlVar.zza - zzn;
            zztlVar.zza = i8;
            ByteBuffer byteBuffer = zzgbVar.zze;
            if (byteBuffer != null && byteBuffer.capacity() >= i8) {
                zzgbVar.zze.clear();
            } else {
                zzgbVar.zze = ByteBuffer.allocate(i8);
            }
            return zzk(zzk, zztlVar.zzb, zzgbVar.zze, zztlVar.zza);
        }
        zzgbVar.zzi(zztlVar.zza);
        return zzk(zztiVar2, zztlVar.zzb, zzgbVar.zzb, zztlVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + i;
        this.zze = j;
        zzti zztiVar = this.zzd;
        if (j == zztiVar.zzb) {
            this.zzd = zztiVar.zzd;
        }
    }

    public final int zza(zzp zzpVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzti zztiVar = this.zzd;
        int zza = zzpVar.zza(zztiVar.zzc.zza, zztiVar.zza(this.zze), zzi);
        if (zza != -1) {
            zzn(zza);
            return zza;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzti zztiVar;
        if (j != -1) {
            while (true) {
                zztiVar = this.zzb;
                if (j < zztiVar.zzb) {
                    break;
                }
                this.zzf.zzc(zztiVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zztiVar.zza) {
                this.zzc = zztiVar;
            }
        }
    }

    public final void zzd(zzgb zzgbVar, zztl zztlVar) {
        zzm(this.zzc, zzgbVar, zztlVar, this.zza);
    }

    public final void zze(zzgb zzgbVar, zztl zztlVar) {
        this.zzc = zzm(this.zzc, zzgbVar, zztlVar, this.zza);
    }

    public final void zzf() {
        zzti zztiVar = this.zzb;
        if (zztiVar.zzc != null) {
            this.zzf.zzd(zztiVar);
            zztiVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzti zztiVar2 = this.zzb;
        this.zzc = zztiVar2;
        this.zzd = zztiVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzdy zzdyVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzti zztiVar = this.zzd;
            zzdyVar.zzB(zztiVar.zzc.zza, zztiVar.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}