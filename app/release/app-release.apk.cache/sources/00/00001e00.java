package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzazz {
    private final zzazy zza;
    private final boolean zzb;
    private final long zzc;
    private final long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private long zzk;

    public zzazz() {
        this(-1.0d);
    }

    private final boolean zzd(long j, long j2) {
        return Math.abs((j2 - this.zzi) - (j - this.zzj)) > 20000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zza(long j, long j2) {
        long j3;
        long j4;
        zzazy zzazyVar;
        long j5;
        long j6 = 1000 * j;
        if (this.zzh) {
            if (j != this.zze) {
                this.zzk++;
                this.zzf = this.zzg;
            }
            long j7 = this.zzk;
            if (j7 >= 6) {
                j4 = this.zzf + ((j6 - this.zzj) / j7);
                if (!zzd(j4, j2)) {
                    j3 = (this.zzi + j4) - this.zzj;
                    if (!this.zzh) {
                        this.zzj = j6;
                        this.zzi = j2;
                        this.zzk = 0L;
                        this.zzh = true;
                    }
                    this.zze = j;
                    this.zzg = j4;
                    zzazyVar = this.zza;
                    if (zzazyVar != null || zzazyVar.zza == 0) {
                        return j3;
                    }
                    long j8 = this.zza.zza;
                    long j9 = this.zzc;
                    long j10 = (((j3 - j8) / j9) * j9) + j8;
                    if (j3 <= j10) {
                        j5 = j10 - j9;
                    } else {
                        j5 = j10;
                        j10 = j9 + j10;
                    }
                    if (j10 - j3 >= j3 - j5) {
                        j10 = j5;
                    }
                    return j10 - this.zzd;
                }
                this.zzh = false;
            } else if (zzd(j6, j2)) {
                this.zzh = false;
            }
        }
        j3 = j2;
        j4 = j6;
        if (!this.zzh) {
        }
        this.zze = j;
        this.zzg = j4;
        zzazyVar = this.zza;
        if (zzazyVar != null) {
        }
        return j3;
    }

    public final void zzb() {
        if (this.zzb) {
            this.zza.zzc();
        }
    }

    public final void zzc() {
        this.zzh = false;
        if (this.zzb) {
            this.zza.zzb();
        }
    }

    private zzazz(double d) {
        long j;
        boolean z = d != -1.0d;
        this.zzb = z;
        if (z) {
            this.zza = zzazy.zza();
            long j2 = (long) (1.0E9d / d);
            this.zzc = j2;
            j = (j2 * 80) / 100;
        } else {
            this.zza = null;
            j = -1;
            this.zzc = -1L;
        }
        this.zzd = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzazz(Context context) {
        this(r3.getDefaultDisplay() != null ? r3.getDefaultDisplay().getRefreshRate() : -1.0d);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
    }
}