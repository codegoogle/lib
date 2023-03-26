package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjs implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzcju zzd;

    public zzcjs(zzcju zzcjuVar, String str, String str2, long j) {
        this.zzd = zzcjuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap R = wo1.R("event", "precacheComplete");
        R.put("src", this.zza);
        R.put("cachedSrc", this.zzb);
        R.put("totalDuration", Long.toString(this.zzc));
        zzcju.zza(this.zzd, "onPrecacheEvent", R);
    }
}