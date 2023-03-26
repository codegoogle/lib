package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzqn implements zzqw {
    public static final /* synthetic */ zzqn zza = new zzqn();

    private /* synthetic */ zzqn() {
    }

    @Override // com.google.android.gms.internal.ads.zzqw
    public final int zza(Object obj) {
        int i = zzqx.zza;
        String str = ((zzqf) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (zzeg.zza >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}