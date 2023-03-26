package com.google.android.gms.internal.ads;

import com.anythink.expressad.foundation.c.d;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaze {
    public static boolean zza(String str) {
        return "audio".equals(zzc(str));
    }

    public static boolean zzb(String str) {
        return d.a.a.equals(zzc(str));
    }

    private static String zzc(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: ".concat(str));
    }
}