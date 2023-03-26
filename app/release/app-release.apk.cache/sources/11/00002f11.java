package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzui implements Comparator {
    public static final /* synthetic */ zzui zza = new zzui();

    private /* synthetic */ zzui() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((zzup) Collections.max((List) obj)).compareTo((zzup) Collections.max((List) obj2));
    }
}