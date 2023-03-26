package com.google.android.gms.internal.ads;

import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzyo {
    public final String zza;

    private zzyo(int i, int i2, String str) {
        this.zza = str;
    }

    @z1
    public static zzyo zza(zzdy zzdyVar) {
        String str;
        zzdyVar.zzG(2);
        int zzk = zzdyVar.zzk();
        int i = zzk >> 1;
        int zzk2 = (zzdyVar.zzk() >> 3) | ((zzk & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = zzk2 < 10 ? ".0" : CryptoConstants.ALIAS_SEPARATOR;
        return new zzyo(i, zzk2, str + ".0" + i + str2 + zzk2);
    }
}