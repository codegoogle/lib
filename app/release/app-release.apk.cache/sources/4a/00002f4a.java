package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzwl implements Comparator {
    public static final /* synthetic */ zzwl zza = new zzwl();

    private /* synthetic */ zzwl() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((zzwn) obj).zzc, ((zzwn) obj2).zzc);
    }
}