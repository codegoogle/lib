package com.google.android.gms.internal.measurement;

import com.p7700g.p99005.wo1;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zziv extends zziy {
    private final int zzc;

    public zziv(byte[] bArr, int i, int i2) {
        super(bArr);
        zzjb.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(wo1.l("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(wo1.o("Index > length: ", i, ", ", i2));
        }
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
    public final int zzd() {
        return this.zzc;
    }
}