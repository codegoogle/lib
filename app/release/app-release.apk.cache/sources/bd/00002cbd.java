package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgiz implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgji zzgjiVar = (zzgji) obj;
        zzgji zzgjiVar2 = (zzgji) obj2;
        zzgjc it = zzgjiVar.iterator();
        zzgjc it2 = zzgjiVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgjiVar.zzd()).compareTo(Integer.valueOf(zzgjiVar2.zzd()));
    }
}