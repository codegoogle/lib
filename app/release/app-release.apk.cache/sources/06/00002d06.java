package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzglr implements zzgly {
    private final zzgly[] zza;

    public zzglr(zzgly... zzglyVarArr) {
        this.zza = zzglyVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgly
    public final zzglx zzb(Class cls) {
        zzgly[] zzglyVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzgly zzglyVar = zzglyVarArr[i];
            if (zzglyVar.zzc(cls)) {
                return zzglyVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgly
    public final boolean zzc(Class cls) {
        zzgly[] zzglyVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzglyVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}