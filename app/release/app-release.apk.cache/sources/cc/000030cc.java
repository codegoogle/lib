package com.google.android.gms.internal.measurement;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public class zziy extends zzix {
    public final byte[] zza;

    public zziy(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzjb) && zzd() == ((zzjb) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zziy) {
                zziy zziyVar = (zziy) obj;
                int zzk = zzk();
                int zzk2 = zziyVar.zzk();
                if (zzk == 0 || zzk2 == 0 || zzk == zzk2) {
                    int zzd = zzd();
                    if (zzd <= zziyVar.zzd()) {
                        if (zzd <= zziyVar.zzd()) {
                            byte[] bArr = this.zza;
                            byte[] bArr2 = zziyVar.zza;
                            zziyVar.zzc();
                            int i = 0;
                            int i2 = 0;
                            while (i < zzd) {
                                if (bArr[i] != bArr2[i2]) {
                                    return false;
                                }
                                i++;
                                i2++;
                            }
                            return true;
                        }
                        throw new IllegalArgumentException(wo1.o("Ran off end of other: 0, ", zzd, ", ", zziyVar.zzd()));
                    }
                    int zzd2 = zzd();
                    throw new IllegalArgumentException("Length too large: " + zzd + zzd2);
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final int zze(int i, int i2, int i3) {
        return zzkk.zzd(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final zzjb zzf(int i, int i2) {
        int zzj = zzjb.zzj(0, i2, zzd());
        return zzj == 0 ? zzjb.zzb : new zziv(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final void zzh(zzir zzirVar) throws IOException {
        ((zzjg) zzirVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final boolean zzi() {
        return zzna.zzf(this.zza, 0, zzd());
    }
}