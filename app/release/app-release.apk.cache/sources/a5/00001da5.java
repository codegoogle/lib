package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawp implements Runnable {
    public final /* synthetic */ zzawv zza;

    public zzawp(zzawv zzawvVar) {
        this.zza = zzawvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        zzawy zzawyVar;
        zzawv zzawvVar = this.zza;
        z = zzawvVar.zzF;
        if (z) {
            return;
        }
        zzawyVar = zzawvVar.zzo;
        zzawyVar.zze(zzawvVar);
    }
}