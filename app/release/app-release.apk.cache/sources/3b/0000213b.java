package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcen extends com.google.android.gms.ads.internal.util.zzb {
    public final /* synthetic */ zzcer zza;

    public zzcen(zzcer zzcerVar) {
        this.zza = zzcerVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        zzcfo zzcfoVar;
        Object obj;
        zzbie zzbieVar;
        zzcer zzcerVar = this.zza;
        context = zzcerVar.zze;
        zzcfoVar = zzcerVar.zzf;
        zzbic zzbicVar = new zzbic(context, zzcfoVar.zza);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzt.zze();
                zzbieVar = this.zza.zzg;
                zzbif.zza(zzbieVar, zzbicVar);
            } catch (IllegalArgumentException e) {
                zzcfi.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}