package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgmg {
    private static final zzgmf zza;
    private static final zzgmf zzb;

    static {
        zzgmf zzgmfVar;
        try {
            zzgmfVar = (zzgmf) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgmfVar = null;
        }
        zza = zzgmfVar;
        zzb = new zzgmf();
    }

    public static zzgmf zza() {
        return zza;
    }

    public static zzgmf zzb() {
        return zzb;
    }
}