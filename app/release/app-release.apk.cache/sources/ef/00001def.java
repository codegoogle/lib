package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzazi {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd = 0;

    public zzazi(byte[] bArr, int i, int i2) {
        this.zza = bArr;
        this.zzc = i;
        this.zzb = i2;
        zzg();
    }

    private final int zzf() {
        int i = 0;
        while (!zze()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? zza(i) : 0);
    }

    private final void zzg() {
        int i;
        int i2;
        int i3 = this.zzc;
        boolean z = true;
        if (i3 < 0 || (i = this.zzd) < 0 || i >= 8 || (i3 >= (i2 = this.zzb) && (i3 != i2 || i != 0))) {
            z = false;
        }
        zzayz.zze(z);
    }

    private final boolean zzh(int i) {
        if (i < 2 || i >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    public final int zza(int i) {
        int i2;
        int i3;
        int i4 = i >> 3;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = zzh(this.zzc + 1) ? this.zzc + 2 : this.zzc + 1;
            int i8 = this.zzd;
            if (i8 != 0) {
                byte[] bArr = this.zza;
                i3 = ((bArr[i7] & 255) >>> (8 - i8)) | ((bArr[this.zzc] & 255) << i8);
            } else {
                i3 = this.zza[this.zzc];
            }
            i -= 8;
            i5 |= (255 & i3) << i;
            this.zzc = i7;
        }
        if (i > 0) {
            int i9 = this.zzd + i;
            byte b = (byte) (255 >> (8 - i));
            int i10 = zzh(this.zzc + 1) ? this.zzc + 2 : this.zzc + 1;
            if (i9 > 8) {
                byte[] bArr2 = this.zza;
                i2 = (b & (((255 & bArr2[i10]) >> (16 - i9)) | ((bArr2[this.zzc] & 255) << (i9 - 8)))) | i5;
                this.zzc = i10;
            } else {
                i2 = (b & ((255 & this.zza[this.zzc]) >> (8 - i9))) | i5;
                if (i9 == 8) {
                    this.zzc = i10;
                }
            }
            i5 = i2;
            this.zzd = i9 % 8;
        }
        zzg();
        return i5;
    }

    public final int zzb() {
        int zzf = zzf();
        return ((zzf + 1) / 2) * (zzf % 2 == 0 ? -1 : 1);
    }

    public final int zzc() {
        return zzf();
    }

    public final void zzd(int i) {
        int i2 = this.zzc;
        int i3 = (i >> 3) + i2;
        this.zzc = i3;
        int i4 = this.zzd + (i & 7);
        this.zzd = i4;
        if (i4 > 7) {
            this.zzc = i3 + 1;
            this.zzd = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.zzc) {
                zzg();
                return;
            } else if (zzh(i2)) {
                this.zzc++;
                i2 += 2;
            }
        }
    }

    public final boolean zze() {
        return zza(1) == 1;
    }
}