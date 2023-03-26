package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgmm extends zzgja {
    public final zzgmq zza;
    public zzgjc zzb = zzb();
    public final /* synthetic */ zzgms zzc;

    public zzgmm(zzgms zzgmsVar) {
        this.zzc = zzgmsVar;
        this.zza = new zzgmq(zzgmsVar, null);
    }

    private final zzgjc zzb() {
        zzgmq zzgmqVar = this.zza;
        if (zzgmqVar.hasNext()) {
            return zzgmqVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgjc
    public final byte zza() {
        zzgjc zzgjcVar = this.zzb;
        if (zzgjcVar != null) {
            byte zza = zzgjcVar.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}