package com.google.android.gms.internal.ads;

import com.p7700g.p99005.la1;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfri extends zzfrj {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzfrj zzc;

    public zzfri(zzfrj zzfrjVar, int i, int i2) {
        this.zzc = zzfrjVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfou.zza(i, this.zzb, la1.l);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    @CheckForNull
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfrj, java.util.List
    /* renamed from: zzh */
    public final zzfrj subList(int i, int i2) {
        zzfou.zzg(i, i2, this.zzb);
        zzfrj zzfrjVar = this.zzc;
        int i3 = this.zza;
        return zzfrjVar.subList(i + i3, i2 + i3);
    }
}