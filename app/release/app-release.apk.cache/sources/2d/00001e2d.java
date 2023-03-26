package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbp implements Comparator {
    public zzbbp(zzbbr zzbbrVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbv zzbbvVar = (zzbbv) obj;
        zzbbv zzbbvVar2 = (zzbbv) obj2;
        int i = zzbbvVar.zzc - zzbbvVar2.zzc;
        return i != 0 ? i : (int) (zzbbvVar.zza - zzbbvVar2.zza);
    }
}