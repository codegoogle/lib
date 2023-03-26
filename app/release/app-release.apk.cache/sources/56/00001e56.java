package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbdc extends zzcga {
    public final /* synthetic */ zzbdi zza;

    public zzbdc(zzbdi zzbdiVar) {
        this.zza = zzbdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzbdi.zze(this.zza);
        return super.cancel(z);
    }
}