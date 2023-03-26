package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcab implements Callable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcad zzb;

    public zzcab(zzcad zzcadVar, Context context) {
        this.zzb = zzcadVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzcaa zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzcac zzcacVar = (zzcac) weakHashMap.get(this.zza);
        if (zzcacVar != null) {
            if (((Long) zzbjf.zza.zze()).longValue() + zzcacVar.zza >= com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()) {
                zza = new zzbzz(this.zza, zzcacVar.zzb).zza();
                zzcad zzcadVar = this.zzb;
                weakHashMap2 = zzcadVar.zza;
                weakHashMap2.put(this.zza, new zzcac(zzcadVar, zza));
                return zza;
            }
        }
        zza = new zzbzz(this.zza).zza();
        zzcad zzcadVar2 = this.zzb;
        weakHashMap2 = zzcadVar2.zza;
        weakHashMap2.put(this.zza, new zzcac(zzcadVar2, zza));
        return zza;
    }
}