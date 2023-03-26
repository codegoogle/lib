package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzglk extends zzglo {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzglk() {
        super(null);
    }

    public /* synthetic */ zzglk(zzglj zzgljVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzglh zzglhVar;
        List arrayList;
        List list = (List) zzgnu.zzh(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzgli) {
                arrayList = new zzglh(i);
            } else if ((list instanceof zzgmh) && (list instanceof zzgkz)) {
                arrayList = ((zzgkz) list).zzd(i);
            } else {
                arrayList = new ArrayList(i);
            }
            zzgnu.zzv(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            zzgnu.zzv(obj, j, arrayList2);
            zzglhVar = arrayList2;
        } else if (list instanceof zzgnp) {
            zzglh zzglhVar2 = new zzglh(list.size() + i);
            zzglhVar2.addAll(zzglhVar2.size(), (zzgnp) list);
            zzgnu.zzv(obj, j, zzglhVar2);
            zzglhVar = zzglhVar2;
        } else if ((list instanceof zzgmh) && (list instanceof zzgkz)) {
            zzgkz zzgkzVar = (zzgkz) list;
            if (zzgkzVar.zzc()) {
                return list;
            }
            zzgkz zzd = zzgkzVar.zzd(list.size() + i);
            zzgnu.zzv(obj, j, zzd);
            return zzd;
        } else {
            return list;
        }
        return zzglhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzglo
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzglo
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzgnu.zzh(obj, j);
        if (list instanceof zzgli) {
            unmodifiableList = ((zzgli) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzgmh) && (list instanceof zzgkz)) {
                zzgkz zzgkzVar = (zzgkz) list;
                if (zzgkzVar.zzc()) {
                    zzgkzVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzgnu.zzv(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzglo
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzgnu.zzh(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzgnu.zzv(obj, j, list);
    }
}