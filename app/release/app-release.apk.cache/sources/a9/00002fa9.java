package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzz {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzzy zzzyVar, @z1 zzzx zzzxVar) {
        if (this.zzc > 0) {
            zzzyVar.zzs(this.zzd, this.zze, this.zzf, this.zzg, zzzxVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzzy zzzyVar, long j, int i, int i2, int i3, @z1 zzzx zzzxVar) {
        if (this.zzg > i2 + i3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.zzb) {
            int i4 = this.zzc;
            int i5 = i4 + 1;
            this.zzc = i5;
            if (i4 == 0) {
                this.zzd = j;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i2;
            this.zzg = i3;
            if (i5 >= 16) {
                zza(zzzyVar, zzzxVar);
            }
        }
    }

    public final void zzd(zzys zzysVar) throws IOException {
        if (this.zzb) {
            return;
        }
        zzysVar.zzh(this.zza, 0, 10);
        zzysVar.zzj();
        byte[] bArr = this.zza;
        int i = zzxw.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}