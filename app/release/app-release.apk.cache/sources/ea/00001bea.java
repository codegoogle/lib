package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzage {
    private final zzzy zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzage(zzzy zzzyVar) {
        this.zza = zzzyVar;
    }

    public final void zza(byte[] bArr, int i, int i2) {
        if (this.zzc) {
            int i3 = this.zzf;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.zzf = (i2 - i) + i3;
                return;
            }
            this.zzd = ((bArr[i4] & 192) >> 6) == 0;
            this.zzc = false;
        }
    }

    public final void zzb(long j, int i, boolean z) {
        if (this.zze == 182 && z && this.zzb) {
            long j2 = this.zzh;
            if (j2 != -9223372036854775807L) {
                long j3 = this.zzg;
                this.zza.zzs(j2, this.zzd ? 1 : 0, (int) (j - j3), i, null);
            }
        }
        if (this.zze != 179) {
            this.zzg = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(int i, long j) {
        boolean z;
        this.zze = i;
        this.zzd = false;
        if (i != 182) {
            if (i != 179) {
                z = false;
                this.zzb = z;
                this.zzc = i == 182;
                this.zzf = 0;
                this.zzh = j;
            }
            i = 179;
        }
        z = true;
        this.zzb = z;
        this.zzc = i == 182;
        this.zzf = 0;
        this.zzh = j;
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}