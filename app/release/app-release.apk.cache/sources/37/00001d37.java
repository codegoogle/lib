package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzasn implements Runnable {
    public final /* synthetic */ zzatn zza;
    public final /* synthetic */ zzasp zzb;

    public zzasn(zzasp zzaspVar, zzatn zzatnVar) {
        this.zzb = zzaspVar;
        this.zza = zzatnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}