package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzchc implements Runnable {
    public final /* synthetic */ zzchf zza;

    public zzchc(zzchf zzchfVar) {
        this.zza = zzchfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzJ("surfaceCreated", new String[0]);
    }
}