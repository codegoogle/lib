package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjr implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ zzcju zzd;

    public zzcjr(zzcju zzcjuVar, String str, String str2, int i) {
        this.zzd = zzcjuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap R = wo1.R("event", "precacheComplete");
        R.put("src", this.zza);
        R.put("cachedSrc", this.zzb);
        R.put("totalBytes", Integer.toString(this.zzc));
        zzcju.zza(this.zzd, "onPrecacheEvent", R);
    }
}