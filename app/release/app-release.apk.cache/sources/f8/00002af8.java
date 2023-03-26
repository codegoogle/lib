package com.google.android.gms.internal.ads;

import com.p7700g.p99005.la1;
import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfst extends zzfrj {
    public final /* synthetic */ zzfsu zza;

    public zzfst(zzfsu zzfsuVar) {
        this.zza = zzfsuVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzfou.zza(i, i2, la1.l);
        zzfsu zzfsuVar = this.zza;
        int i3 = i + i;
        objArr = zzfsuVar.zzb;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzfsuVar.zzb;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final boolean zzf() {
        return true;
    }
}