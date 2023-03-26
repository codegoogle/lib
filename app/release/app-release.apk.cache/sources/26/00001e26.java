package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbi implements Runnable {
    public final /* synthetic */ View zza;
    public final /* synthetic */ zzbbm zzb;

    public zzbbi(zzbbm zzbbmVar, View view) {
        this.zzb = zzbbmVar;
        this.zza = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}