package com.google.android.gms.internal.ads;

import com.p7700g.p99005.g15;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagk {
    private final zzzy zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzagk(zzzy zzzyVar) {
        this.zza = zzzyVar;
    }

    private final void zze(int i) {
        long j = this.zzl;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.zzm;
        long j2 = this.zzb;
        long j3 = this.zzk;
        this.zza.zzs(j, z ? 1 : 0, (int) (j2 - j3), i, null);
    }

    public final void zza(long j, int i, boolean z) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z && this.zzi) {
                zze(i + ((int) (j - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }

    public final void zzb(byte[] bArr, int i, int i2) {
        if (this.zzf) {
            int i3 = this.zzd;
            int i4 = (i + 2) - i3;
            if (i4 >= i2) {
                this.zzd = (i2 - i) + i3;
                return;
            }
            this.zzg = (bArr[i4] & g15.b) != 0;
            this.zzf = false;
        }
    }

    public final void zzc() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzd(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.zzg = false;
        this.zzh = false;
        this.zze = j2;
        this.zzd = 0;
        this.zzb = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.zzi && !this.zzj) {
                if (z) {
                    zze(i);
                }
                this.zzi = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z3 = i2 >= 16 && i2 <= 21;
        this.zzc = z3;
        this.zzf = (z3 || i2 <= 9) ? true : true;
    }
}