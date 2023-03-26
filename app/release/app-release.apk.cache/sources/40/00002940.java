package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfcl implements zzfuy {
    public final /* synthetic */ zzcli zza;
    public final /* synthetic */ zzfii zzb;
    public final /* synthetic */ zzees zzc;

    public zzfcl(zzcli zzcliVar, zzfii zzfiiVar, zzees zzeesVar) {
        this.zza = zzcliVar;
        this.zzb = zzfiiVar;
        this.zzc = zzeesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
        if (r8.zza.zzF().zzT != false) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzfuy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzF().zzak) {
            this.zzb.zzc(str, null);
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        String str2 = this.zza.zzR().zzb;
        int i = 1;
        if (!com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza.getContext())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfl)).booleanValue()) {
            }
            this.zzc.zzd(new zzeeu(currentTimeMillis, str2, str, i));
        }
        i = 2;
        this.zzc.zzd(new zzeeu(currentTimeMillis, str2, str, i));
    }
}