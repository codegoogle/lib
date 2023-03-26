package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import com.p7700g.p99005.z1;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzxe {
    private final zzwq zza = new zzwq();
    @z1
    private final zzxa zzb;
    @z1
    private final zzxd zzc;
    private boolean zzd;
    @z1
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzxe(@z1 Context context) {
        zzxa zzxaVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = zzeg.zza;
            zzxaVar = zzxc.zzc(applicationContext);
            if (zzxaVar == null) {
                zzxaVar = zzxb.zzc(applicationContext);
            }
        } else {
            zzxaVar = null;
        }
        this.zzb = zzxaVar;
        this.zzc = zzxaVar != null ? zzxd.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzxe zzxeVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzxeVar.zzk = refreshRate;
            zzxeVar.zzl = (refreshRate * 80) / 100;
            return;
        }
        zzxeVar.zzk = -9223372036854775807L;
        zzxeVar.zzl = -9223372036854775807L;
    }

    private final void zzk() {
        Surface surface;
        if (zzeg.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzwz.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r10.zzg) >= r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r10.zza.zzb() >= 30) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r3 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzm() {
        if (zzeg.zza < 30 || this.zze == null) {
            return;
        }
        float zza = this.zza.zzg() ? this.zza.zza() : this.zzf;
        float f = this.zzg;
        if (zza == f) {
            return;
        }
        boolean z = true;
        int i = (zza > (-1.0f) ? 1 : (zza == (-1.0f) ? 0 : -1));
        if (i != 0 && f != -1.0f) {
            float f2 = 1.0f;
            if (this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                f2 = 0.02f;
            }
        } else if (i == 0) {
        }
        this.zzg = zza;
        zzn(false);
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (zzeg.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzwz.zza(surface, f);
        }
    }

    public final long zza(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc = this.zzq + (((float) ((this.zzm - this.zzp) * this.zza.zzc())) / this.zzi);
            if (Math.abs(j - zzc) <= 20000000) {
                j = zzc;
            } else {
                zzl();
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzxd zzxdVar = this.zzc;
        if (zzxdVar == null || this.zzk == -9223372036854775807L) {
            return j;
        }
        long j3 = zzxdVar.zza;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.zzk;
        long j5 = (((j - j3) / j4) * j4) + j3;
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            j2 = j5;
            j5 = j4 + j5;
        }
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - this.zzl;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzxd zzxdVar = this.zzc;
            Objects.requireNonNull(zzxdVar);
            zzxdVar.zzb();
            this.zzb.zzb(new zzwy(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzxa zzxaVar = this.zzb;
        if (zzxaVar != null) {
            zzxaVar.zza();
            zzxd zzxdVar = this.zzc;
            Objects.requireNonNull(zzxdVar);
            zzxdVar.zzc();
        }
        zzk();
    }

    public final void zzi(@z1 Surface surface) {
        if (true == (surface instanceof zzww)) {
            surface = null;
        }
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }
}