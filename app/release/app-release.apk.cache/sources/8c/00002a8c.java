package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfot {
    private static final Logger zza = Logger.getLogger(zzfot.class.getName());
    private static final zzfos zzb = new zzfos(null);

    private zzfot() {
    }

    public static String zza(@CheckForNull String str) {
        return str == null ? "" : str;
    }

    public static boolean zzb(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }
}