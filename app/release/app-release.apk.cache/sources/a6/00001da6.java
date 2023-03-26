package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawq implements Runnable {
    public final /* synthetic */ zzawt zza;
    public final /* synthetic */ zzawv zzb;

    public zzawq(zzawv zzawvVar, zzawt zzawtVar) {
        this.zzb = zzawvVar;
        this.zza = zzawtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.zza.zza();
        sparseArray = this.zzb.zzn;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray2 = this.zzb.zzn;
            ((zzaxk) sparseArray2.valueAt(i)).zzi();
        }
    }
}