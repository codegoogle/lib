package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzuf implements Comparator {
    public static final /* synthetic */ zzuf zza = new zzuf();

    private /* synthetic */ zzuf() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((zzad) obj2).zzi - ((zzad) obj).zzi;
    }
}