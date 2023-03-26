package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapk implements AppOpsManager.OnOpActiveChangedListener {
    public final /* synthetic */ zzapl zza;

    public zzapk(zzapl zzaplVar) {
        this.zza = zzaplVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        long j2;
        long j3;
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        zzapl zzaplVar = this.zza;
        j = zzaplVar.zzc;
        if (j > 0) {
            j2 = zzaplVar.zzc;
            if (currentTimeMillis >= j2) {
                j3 = zzaplVar.zzc;
                zzaplVar.zzd = currentTimeMillis - j3;
            }
        }
        this.zza.zze = false;
    }
}