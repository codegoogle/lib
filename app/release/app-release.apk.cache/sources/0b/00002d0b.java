package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzglw {
    private static final zzglv zza;
    private static final zzglv zzb;

    static {
        zzglv zzglvVar;
        try {
            zzglvVar = (zzglv) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzglvVar = null;
        }
        zza = zzglvVar;
        zzb = new zzglv();
    }

    public static zzglv zza() {
        return zza;
    }

    public static zzglv zzb() {
        return zzb;
    }
}