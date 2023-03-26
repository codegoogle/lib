package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbac implements Runnable {
    public final /* synthetic */ zzart zza;
    public final /* synthetic */ zzbah zzb;

    public zzbac(zzbah zzbahVar, zzart zzartVar) {
        this.zzb = zzbahVar;
        this.zza = zzartVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbai zzbaiVar;
        zzbaiVar = this.zzb.zzb;
        zzbaiVar.zzn(this.zza);
    }
}