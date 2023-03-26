package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzgqp {
    public final LinkedHashMap zza;

    public zzgqp(int i) {
        this.zza = zzgqr.zzb(i);
    }

    public final zzgqp zza(Object obj, zzgrh zzgrhVar) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgrc.zza(obj, "key");
        zzgrc.zza(zzgrhVar, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMap.put(obj, zzgrhVar);
        return this;
    }
}