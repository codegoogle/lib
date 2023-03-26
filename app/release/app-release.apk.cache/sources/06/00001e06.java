package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbad implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzbah zzc;

    public zzbad(zzbah zzbahVar, int i, long j) {
        this.zzc = zzbahVar;
        this.zza = i;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbai zzbaiVar;
        zzbaiVar = this.zzc.zzb;
        zzbaiVar.zzl(this.zza, this.zzb);
    }
}