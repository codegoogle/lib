package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzek implements zzeq {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    @z1
    private zzev zzd;

    public zzek(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeq, com.google.android.gms.internal.ads.zzfn
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzf(zzfs zzfsVar) {
        Objects.requireNonNull(zzfsVar);
        if (this.zzb.contains(zzfsVar)) {
            return;
        }
        this.zzb.add(zzfsVar);
        this.zzc++;
    }

    public final void zzg(int i) {
        zzev zzevVar = this.zzd;
        int i2 = zzeg.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzfs) this.zzb.get(i3)).zza(this, zzevVar, this.zza, i);
        }
    }

    public final void zzh() {
        zzev zzevVar = this.zzd;
        int i = zzeg.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzfs) this.zzb.get(i2)).zzb(this, zzevVar, this.zza);
        }
        this.zzd = null;
    }

    public final void zzi(zzev zzevVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzfs) this.zzb.get(i)).zzc(this, zzevVar, this.zza);
        }
    }

    public final void zzj(zzev zzevVar) {
        this.zzd = zzevVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzfs) this.zzb.get(i)).zzd(this, zzevVar, this.zza);
        }
    }
}