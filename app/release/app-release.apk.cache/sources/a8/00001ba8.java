package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzadt extends zzadv {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzadt(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final String toString() {
        return wo1.w(zzadv.zzf(this.zzd), " leaves: ", Arrays.toString(this.zzb.toArray()), " containers: ", Arrays.toString(this.zzc.toArray()));
    }

    @z1
    public final zzadt zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzadt zzadtVar = (zzadt) this.zzc.get(i2);
            if (zzadtVar.zzd == i) {
                return zzadtVar;
            }
        }
        return null;
    }

    @z1
    public final zzadu zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzadu zzaduVar = (zzadu) this.zzb.get(i2);
            if (zzaduVar.zzd == i) {
                return zzaduVar;
            }
        }
        return null;
    }

    public final void zzc(zzadt zzadtVar) {
        this.zzc.add(zzadtVar);
    }

    public final void zzd(zzadu zzaduVar) {
        this.zzb.add(zzaduVar);
    }
}