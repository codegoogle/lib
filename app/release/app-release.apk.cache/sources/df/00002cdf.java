package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgkf {
    private static final zzgkd zza = new zzgke();
    private static final zzgkd zzb;

    static {
        zzgkd zzgkdVar;
        try {
            zzgkdVar = (zzgkd) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgkdVar = null;
        }
        zzb = zzgkdVar;
    }

    public static zzgkd zza() {
        zzgkd zzgkdVar = zzb;
        if (zzgkdVar != null) {
            return zzgkdVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzgkd zzb() {
        return zza;
    }
}