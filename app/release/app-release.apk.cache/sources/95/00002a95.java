package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfpb extends zzfpe {
    public final /* synthetic */ zzfpc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfpb(zzfpc zzfpcVar, zzfpg zzfpgVar, CharSequence charSequence) {
        super(zzfpgVar, charSequence);
        this.zza = zzfpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < ((zzfpe) this).zzb.length()) {
            return i2;
        }
        return -1;
    }
}