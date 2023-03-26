package com.google.android.gms.internal.ads;

import com.p7700g.p99005.la1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfss extends zzfrj {
    public static final zzfrj zza = new zzfss(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    public zzfss(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfou.zza(i, this.zzc, la1.l);
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrj, com.google.android.gms.internal.ads.zzfre
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final Object[] zzg() {
        return this.zzb;
    }
}