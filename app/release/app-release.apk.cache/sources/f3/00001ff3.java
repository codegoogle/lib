package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbsk implements zzcge {
    public final /* synthetic */ zzbsl zza;

    public zzbsk(zzbsl zzbslVar) {
        this.zza = zzbslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbrh zzbrhVar = (zzbrh) obj;
        zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsj
            @Override // java.lang.Runnable
            public final void run() {
                zzbrh zzbrhVar2 = zzbrhVar;
                zzbrhVar2.zzr("/result", zzbol.zzo);
                zzbrhVar2.zzc();
            }
        });
    }
}