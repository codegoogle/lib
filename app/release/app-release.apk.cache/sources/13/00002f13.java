package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzuk implements Comparator {
    public static final /* synthetic */ zzuk zza = new zzuk();

    private /* synthetic */ zzuk() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        zzfqy zzj = zzfqy.zzj();
        zzvb zzvbVar = zzvb.zza;
        zzfqy zzb = zzj.zzc((zzvd) Collections.max(list, zzvbVar), (zzvd) Collections.max(list2, zzvbVar), zzvbVar).zzb(list.size(), list2.size());
        zzvc zzvcVar = zzvc.zza;
        return zzb.zzc((zzvd) Collections.max(list, zzvcVar), (zzvd) Collections.max(list2, zzvcVar), zzvcVar).zza();
    }
}