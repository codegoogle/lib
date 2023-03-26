package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgre {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzgre(int i, int i2, zzgrd zzgrdVar) {
        this.zza = zzgqr.zzc(i);
        this.zzb = zzgqr.zzc(i2);
    }

    public final zzgre zza(zzgrh zzgrhVar) {
        this.zzb.add(zzgrhVar);
        return this;
    }

    public final zzgre zzb(zzgrh zzgrhVar) {
        this.zza.add(zzgrhVar);
        return this;
    }

    public final zzgrf zzc() {
        return new zzgrf(this.zza, this.zzb, null);
    }
}