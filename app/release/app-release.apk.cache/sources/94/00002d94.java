package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgqy extends zzgqq {
    private static final zzgrh zza = zzgqv.zza(Collections.emptyMap());

    public /* synthetic */ zzgqy(Map map, zzgqw zzgqwVar) {
        super(map);
    }

    public static zzgqx zzc(int i) {
        return new zzgqx(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zzd */
    public final Map zzb() {
        LinkedHashMap zzb = zzgqr.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzgrh) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}