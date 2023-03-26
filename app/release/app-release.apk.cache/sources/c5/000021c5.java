package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjq implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ long zzf;
    public final /* synthetic */ boolean zzg;
    public final /* synthetic */ int zzh;
    public final /* synthetic */ int zzi;
    public final /* synthetic */ zzcju zzj;

    public zzcjq(zzcju zzcjuVar, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.zzj = zzcjuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = j;
        this.zzf = j2;
        this.zzg = z;
        this.zzh = i3;
        this.zzi = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap R = wo1.R("event", "precacheProgress");
        R.put("src", this.zza);
        R.put("cachedSrc", this.zzb);
        R.put("bytesLoaded", Integer.toString(this.zzc));
        R.put("totalBytes", Integer.toString(this.zzd));
        R.put("bufferedDuration", Long.toString(this.zze));
        R.put("totalDuration", Long.toString(this.zzf));
        R.put("cacheReady", true != this.zzg ? "0" : "1");
        R.put("playerCount", Integer.toString(this.zzh));
        R.put("playerPreparedCount", Integer.toString(this.zzi));
        zzcju.zza(this.zzj, "onPrecacheEvent", R);
    }
}