package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzwj {
    public static final zzwd zza = new zzwd(0, -9223372036854775807L, null);
    public static final zzwd zzb = new zzwd(1, -9223372036854775807L, null);
    public static final zzwd zzc = new zzwd(2, -9223372036854775807L, null);
    public static final zzwd zzd = new zzwd(3, -9223372036854775807L, null);
    private final ExecutorService zze = zzeg.zzP("ExoPlayer:Loader:ProgressiveMediaPeriod");
    @z1
    private zzwe zzf;
    @z1
    private IOException zzg;

    public zzwj(String str) {
    }

    public static zzwd zzb(boolean z, long j) {
        return new zzwd(z ? 1 : 0, j, null);
    }

    public final long zza(zzwf zzwfVar, zzwb zzwbVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzcw.zzb(myLooper);
        this.zzg = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzwe(this, myLooper, zzwfVar, zzwbVar, i, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzwe zzweVar = this.zzf;
        zzcw.zzb(zzweVar);
        zzweVar.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zzg;
        if (iOException != null) {
            throw iOException;
        }
        zzwe zzweVar = this.zzf;
        if (zzweVar != null) {
            zzweVar.zzb(i);
        }
    }

    public final void zzj(@z1 zzwg zzwgVar) {
        zzwe zzweVar = this.zzf;
        if (zzweVar != null) {
            zzweVar.zza(true);
        }
        this.zze.execute(new zzwh(zzwgVar));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}