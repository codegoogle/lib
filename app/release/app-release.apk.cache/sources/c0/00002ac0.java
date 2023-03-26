package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfqr extends zzfqf {
    public final /* synthetic */ zzfqt zza;
    private final Object zzb;
    private int zzc;

    public zzfqr(zzfqt zzfqtVar, int i) {
        this.zza = zzfqtVar;
        this.zzb = zzfqt.zzg(zzfqtVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int zzv;
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzfoq.zza(this.zzb, zzfqt.zzg(this.zza, this.zzc))) {
            zzv = this.zza.zzv(this.zzb);
            this.zzc = zzv;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzfqt.zzj(this.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object zzj = zzfqt.zzj(this.zza, i);
        zzfqt.zzm(this.zza, this.zzc, obj);
        return zzj;
    }
}