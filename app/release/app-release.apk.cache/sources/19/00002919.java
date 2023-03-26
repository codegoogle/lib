package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfb extends zzfqz {
    private final Map zza;

    public zzfb(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final boolean containsKey(@z1 Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final boolean containsValue(@z1 Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final Set entrySet() {
        return zzfte.zzb(this.zza.entrySet(), zzez.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final boolean equals(@z1 Object obj) {
        return obj != null && super.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    @z1
    public final /* synthetic */ Object get(@z1 Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final int hashCode() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final boolean isEmpty() {
        return this.zza.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final Set keySet() {
        return zzfte.zzb(this.zza.keySet(), zzfa.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, com.google.android.gms.internal.ads.zzfra
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfqz
    public final Map zzb() {
        return this.zza;
    }
}