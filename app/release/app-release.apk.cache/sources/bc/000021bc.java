package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjh extends zzakk {
    public static final zzcjh zzb = new zzcjh();

    @Override // com.google.android.gms.internal.ads.zzakk
    public final zzako zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzakq();
        }
        if ("mvhd".equals(str)) {
            return new zzakr();
        }
        return new zzaks(str);
    }
}