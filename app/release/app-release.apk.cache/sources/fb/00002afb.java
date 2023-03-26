package com.google.android.gms.internal.ads;

import com.p7700g.p99005.la1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfsw extends zzfrj {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzfsw(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfou.zza(i, this.zzc, la1.l);
        Object obj = this.zza[i + i + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final boolean zzf() {
        return true;
    }
}