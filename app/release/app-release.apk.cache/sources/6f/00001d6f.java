package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaup {
    private final zzazh zza = new zzazh(8);
    private int zzb;

    private final long zzb(zzatv zzatvVar) throws IOException, InterruptedException {
        int i = 0;
        zzatvVar.zzg(this.zza.zza, 0, 1, false);
        int i2 = this.zza.zza[0] & 255;
        if (i2 != 0) {
            int i3 = 128;
            int i4 = 0;
            while ((i2 & i3) == 0) {
                i3 >>= 1;
                i4++;
            }
            int i5 = i2 & (~i3);
            zzatvVar.zzg(this.zza.zza, 1, i4, false);
            while (i < i4) {
                i++;
                i5 = (this.zza.zza[i] & 255) + (i5 << 8);
            }
            this.zzb = i4 + 1 + this.zzb;
            return i5;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzatv zzatvVar) throws IOException, InterruptedException {
        long zzb;
        int i;
        long zzc = zzatvVar.zzc();
        long j = 1024;
        int i2 = (zzc > (-1L) ? 1 : (zzc == (-1L) ? 0 : -1));
        if (i2 != 0 && zzc <= 1024) {
            j = zzc;
        }
        int i3 = (int) j;
        zzatvVar.zzg(this.zza.zza, 0, 4, false);
        long zzm = this.zza.zzm();
        this.zzb = 4;
        while (zzm != 440786851) {
            int i4 = this.zzb + 1;
            this.zzb = i4;
            if (i4 == i3) {
                return false;
            }
            zzatvVar.zzg(this.zza.zza, 0, 1, false);
            zzm = ((zzm << 8) & (-256)) | (this.zza.zza[0] & 255);
        }
        long zzb2 = zzb(zzatvVar);
        long j2 = this.zzb;
        if (zzb2 != Long.MIN_VALUE && (i2 == 0 || j2 + zzb2 < zzc)) {
            while (true) {
                int i5 = (this.zzb > (j2 + zzb2) ? 1 : (this.zzb == (j2 + zzb2) ? 0 : -1));
                if (i5 < 0) {
                    if (zzb(zzatvVar) == Long.MIN_VALUE || (zzb = zzb(zzatvVar)) < 0) {
                        return false;
                    }
                    if (i != 0) {
                        zzatvVar.zzf((int) zzb, false);
                        this.zzb = (int) (this.zzb + zzb);
                    }
                } else if (i5 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}