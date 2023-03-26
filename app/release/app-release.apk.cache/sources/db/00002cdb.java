package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgkb {
    private final Object zza;
    private final int zzb;

    public zzgkb(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgkb) {
            zzgkb zzgkbVar = (zzgkb) obj;
            return this.zza == zzgkbVar.zza && this.zzb == zzgkbVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}