package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzlp {
    private static final zzlo zza;
    private static final zzlo zzb;

    static {
        zzlo zzloVar;
        try {
            zzloVar = (zzlo) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzloVar = null;
        }
        zza = zzloVar;
        zzb = new zzlo();
    }

    public static zzlo zza() {
        return zza;
    }

    public static zzlo zzb() {
        return zzb;
    }
}