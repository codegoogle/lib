package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjo implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ zzcju zze;

    public zzcjo(zzcju zzcjuVar, String str, String str2, int i, int i2, boolean z) {
        this.zze = zzcjuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap R = wo1.R("event", "precacheProgress");
        R.put("src", this.zza);
        R.put("cachedSrc", this.zzb);
        R.put("bytesLoaded", Integer.toString(this.zzc));
        R.put("totalBytes", Integer.toString(this.zzd));
        R.put("cacheReady", "0");
        zzcju.zza(this.zze, "onPrecacheEvent", R);
    }
}