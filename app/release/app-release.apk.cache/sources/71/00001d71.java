package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaur extends zzaut {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzaur(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final String toString() {
        return wo1.w(zzaut.zzg(this.zzaR), " leaves: ", Arrays.toString(this.zzb.toArray()), " containers: ", Arrays.toString(this.zzc.toArray()));
    }

    public final zzaur zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaur zzaurVar = (zzaur) this.zzc.get(i2);
            if (zzaurVar.zzaR == i) {
                return zzaurVar;
            }
        }
        return null;
    }

    public final zzaus zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaus zzausVar = (zzaus) this.zzb.get(i2);
            if (zzausVar.zzaR == i) {
                return zzausVar;
            }
        }
        return null;
    }

    public final void zzc(zzaur zzaurVar) {
        this.zzc.add(zzaurVar);
    }

    public final void zzd(zzaus zzausVar) {
        this.zzb.add(zzausVar);
    }
}