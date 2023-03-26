package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjp implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ long zzf;
    public final /* synthetic */ long zzg;
    public final /* synthetic */ boolean zzh;
    public final /* synthetic */ int zzi;
    public final /* synthetic */ int zzj;
    public final /* synthetic */ zzcju zzk;

    public zzcjp(zzcju zzcjuVar, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.zzk = zzcjuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = j5;
        this.zzh = z;
        this.zzi = i;
        this.zzj = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap R = wo1.R("event", "precacheProgress");
        R.put("src", this.zza);
        R.put("cachedSrc", this.zzb);
        R.put("bufferedDuration", Long.toString(this.zzc));
        R.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue()) {
            R.put("qoeLoadedBytes", Long.toString(this.zze));
            R.put("qoeCachedBytes", Long.toString(this.zzf));
            R.put("totalBytes", Long.toString(this.zzg));
            R.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
        }
        R.put("cacheReady", true != this.zzh ? "0" : "1");
        R.put("playerCount", Integer.toString(this.zzi));
        R.put("playerPreparedCount", Integer.toString(this.zzj));
        zzcju.zza(this.zzk, "onPrecacheEvent", R);
    }
}