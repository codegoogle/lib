package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zze extends zzcfi {
    public static void zza(String str) {
        if (!zzc() || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : zzcfi.zza.zzd(str)) {
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
        }
    }

    public static boolean zzc() {
        return zzcfi.zzm(2) && ((Boolean) zzbjs.zza.zze()).booleanValue();
    }
}