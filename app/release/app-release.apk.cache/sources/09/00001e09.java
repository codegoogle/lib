package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbag implements Runnable {
    public final /* synthetic */ zzatn zza;
    public final /* synthetic */ zzbah zzb;

    public zzbag(zzbah zzbahVar, zzatn zzatnVar) {
        this.zzb = zzbahVar;
        this.zza = zzatnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}